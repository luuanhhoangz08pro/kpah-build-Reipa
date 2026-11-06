package main.screen;

/**
 * Mã phím auto click sang ô skill game đọc ở Field3.
 * Ô skill là 1, 3, 5, 7, 9. Phím 0 (mã 48) không phải ô riêng: game dùng nó để lật trang,
 * nên auto gán 48 vào ô phím 1.
 */
public final class SkillKeys {
    public static final String DEFAULT = "49:0,51:0,53:0,55:0,57:0,48:0,-5:0";
    private static final int[] NONE = new int[0];

    private SkillKeys() {
    }

    public static int index(int code) {
        if (code == -5 || code == 8 || code == 10) {
            return 5;
        }
        if (code == 48) {
            return 1;
        }
        if (code >= 49 && code <= 57) {
            int key = code - 48;
            if (key == 1 || key == 3 || key == 5 || key == 7 || key == 9) {
                return key;
            }
            return -1;
        }
        if (code == 1 || code == 3 || code == 5 || code == 7 || code == 9) {
            return code;
        }
        return -1;
    }

    public static Step[] parse(String text) {
        if (text == null || text.isEmpty()) {
            return new Step[0];
        }
        String[] parts = text.split(",");
        Step[] tmp = new Step[parts.length];
        int n = 0;
        for (int i = 0; i < parts.length; i++) {
            String[] pair = parts[i].split(":");
            if (pair.length != 2) {
                continue;
            }
            try {
                int code = Integer.parseInt(pair[0].trim());
                int seconds = Integer.parseInt(pair[1].trim());
                int slot = index(code);
                if (slot < 0) {
                    continue;
                }
                if (seconds < 0) {
                    seconds = 0;
                }
                tmp[n++] = new Step(slot, seconds * 1000);
            } catch (NumberFormatException ignored) {
            }
        }
        Step[] out = new Step[n];
        System.arraycopy(tmp, 0, out, 0, n);
        return out;
    }

    public static final class Step {
        public final int index;
        public final int waitMs;

        public Step(int index, int waitMs) {
            this.index = index;
            this.waitMs = waitMs;
        }
    }

    public static final class Player {
        private final Step[] steps;
        private long cycleStart = -1L;
        private boolean[] fired = new boolean[0];

        public Player(Step[] steps) {
            this.steps = steps == null ? new Step[0] : steps;
        }

        public int[] due(long now, int gapMs) {
            if (steps.length == 0) {
                return NONE;
            }
            if (gapMs <= 0) {
                gapMs = 200;
            }
            long cycle = gapMs;
            for (int i = 0; i < steps.length; i++) {
                long end = (long) steps[i].waitMs + gapMs;
                if (end > cycle) {
                    cycle = end;
                }
            }
            if (cycleStart < 0L || now - cycleStart >= cycle) {
                cycleStart = now;
                fired = new boolean[steps.length];
            }
            boolean[] hit = new boolean[10];
            int count = 0;
            for (int i = 0; i < steps.length; i++) {
                if (!fired[i] && now - cycleStart >= steps[i].waitMs) {
                    fired[i] = true;
                    int idx = steps[i].index;
                    if (idx >= 0 && idx < hit.length && !hit[idx]) {
                        hit[idx] = true;
                        count++;
                    }
                }
            }
            if (count == 0) {
                return NONE;
            }
            int[] out = new int[count];
            int n = 0;
            for (int i = 0; i < hit.length; i++) {
                if (hit[i]) {
                    out[n++] = i;
                }
            }
            return out;
        }
    }
}
