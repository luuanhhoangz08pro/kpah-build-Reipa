package main.screen;

public final class SkillKeysTest {
    public static void main(String[] args) {
        eq(SkillKeys.index(49), 1, "key 1");
        eq(SkillKeys.index(51), 3, "key 3");
        eq(SkillKeys.index(53), 5, "key 5");
        eq(SkillKeys.index(55), 7, "key 7");
        eq(SkillKeys.index(57), 9, "key 9");
        eq(SkillKeys.index(48), 1, "key 0 uses slot of key 1");
        eq(SkillKeys.index(-5), 5, "fire");
        eq(SkillKeys.index(8), 5, "center");
        eq(SkillKeys.index(10), 5, "enter");
        eq(SkillKeys.index(50), -1, "key 2 is not a skill slot");
        eq(SkillKeys.index(52), -1, "key 4");
        eq(SkillKeys.index(54), -1, "key 6");
        eq(SkillKeys.index(56), -1, "key 8");
        eq(SkillKeys.index(0), -1, "unmapped");

        SkillKeys.Step[] def = SkillKeys.parse(SkillKeys.DEFAULT);
        eq(def.length, 7, "default count");
        eq(def[0].index, 1, "d0");
        eq(def[1].index, 3, "d1");
        eq(def[2].index, 5, "d2");
        eq(def[3].index, 7, "d3");
        eq(def[4].index, 9, "d4");
        eq(def[5].index, 1, "d5 key 0");
        eq(def[6].index, 5, "d6 fire");
        eq(def[0].waitMs, 0, "wait 0");

        SkillKeys.Player player = new SkillKeys.Player(def);
        int[] first = player.due(0L, 200);
        same(first, new int[]{1, 3, 5, 7, 9}, "all five slots at once");
        same(player.due(199L, 200), new int[0], "still inside gap");
        same(player.due(200L, 200), new int[]{1, 3, 5, 7, 9}, "next cycle");

        boolean[] flags = new boolean[14];
        for (int i = 0; i < first.length; i++) {
            flags[first[i]] = true;
        }
        int cast = 0;
        int[] hotbar = {1, 3, 5, 7, 9};
        for (int i = 0; i < hotbar.length; i++) {
            if (flags[hotbar[i]]) {
                flags[hotbar[i]] = false;
                cast++;
            }
        }
        eq(cast, 5, "game reads every hotbar key");

        SkillKeys.Player one = new SkillKeys.Player(SkillKeys.parse("53:0"));
        same(one.due(0L, 200), new int[]{5}, "only key 5");
        same(one.due(50L, 200), new int[0], "key 5 waits gap");

        SkillKeys.Player delayed = new SkillKeys.Player(SkillKeys.parse("49:1,53:0"));
        same(delayed.due(0L, 200), new int[]{5}, "zero wait first");
        same(delayed.due(999L, 200), new int[0], "one second not yet");
        same(delayed.due(1000L, 200), new int[]{1}, "key 1 after 1s");
        same(delayed.due(1200L, 200), new int[]{5}, "new cycle");

        same(new SkillKeys.Player(SkillKeys.parse("")).due(0L, 200), new int[0], "empty");
        same(new SkillKeys.Player(SkillKeys.parse("50:0,52:0,53:0")).due(0L, 200), new int[]{5}, "skip 2 and 4");
        same(new SkillKeys.Player(SkillKeys.parse(" -5 : 0 , 49 : 0 ")).due(0L, 200), new int[]{1, 5}, "spaces");
        same(new SkillKeys.Player(SkillKeys.parse("abc,49:0")).due(0L, 200), new int[]{1}, "bad token");
        same(new SkillKeys.Player(SkillKeys.parse("49")).due(0L, 200), new int[0], "missing time");
        same(new SkillKeys.Player(SkillKeys.parse("8:0,10:0,-5:0")).due(0L, 0), new int[]{5}, "gap 0 becomes 200 and fire aliases");

        SkillKeys.Player fast = new SkillKeys.Player(SkillKeys.parse("53:0"));
        same(fast.due(0L, 0), new int[]{5}, "gap 0 still fires");
        same(fast.due(199L, 0), new int[0], "gap 0 uses 200");
        same(fast.due(200L, 0), new int[]{5}, "gap 0 second cycle");

        System.out.println("SkillKeysTest OK");
    }

    private static void eq(int actual, int expected, String name) {
        if (actual != expected) {
            throw new AssertionError(name + " expected " + expected + " but was " + actual);
        }
    }

    private static void same(int[] actual, int[] expected, String name) {
        if (actual.length != expected.length) {
            throw new AssertionError(name + " length " + actual.length + " != " + expected.length);
        }
        for (int i = 0; i < actual.length; i++) {
            if (actual[i] != expected[i]) {
                throw new AssertionError(name + " at " + i + " expected " + expected[i] + " but was " + actual[i]);
            }
        }
    }
}
