package main.tab.tab2;

import main.tab.tab2.screen.MainTab;

public final class Class835 extends Thread implements Class256 {
    public static int Field1 = 0;
    public static String[] Field2 = new String[]{"OFF", "ON"};
    public static int Field3 = 0;
    public static int Field4 = 0;
    public static int Field5 = -1;
    public static String[] Field6 = new String[]{"c5sefff4fee", "c4efeee5"};

    public final void Field1() {
        if (++Field1 >= Field2.length) {
            Field1 = 0;
        }

        if (Field1 == 1) {
            this.start();
        }

    }

    public final void run() {
        while (true) {
            if (Field1 != 0) {
                try {
                    Class24.Field3();
                    Class858.Field1(300L);
                    Class24.Field2().Field2(1);
                    Class106.Field19.Field1();
                    Field3();
                    Class858.Field1(300L);
                    Class637.Field1(4, 2);
                    Class60.Field8.Field8();
                    Class106.Field19.Field1();

                    while (Class106.Field23 == null) {
                        Class858.Field1(5L);
                    }

                    int var2;
                    for (var2 = 0; var2 <= 4 && !Field2(); ++var2) {
                        Class858.Field1(50L);
                    }

                    if (Class60.Field10.contains("Không đủ nguyên liệu")) {
                        continue;
                    }

                    if (Field2()) {
                        Class106.Field21.Field1 = false;
                        Class106.Field24.Field1 = false;
                        Field1 = 0;
                        Class62.Field1(Class858.Field1(Field6[1]));
                    } else {
                        Class534 var1;
                        if (!Field2() && Field1 != 0) {
                            Class858.Field1(300L);
                            Class24.Field2().Field2(2);
                            var1 = Class183.Field3();
                            Class261.Field1().Field1((int) 10, (short) var1.Field9);
                            Class261.Field1().Field1((int) -502, (byte) 0, (int) 2);
                            Class858.Field1(300L);
                            Class637.Field1(2, 2);
                            Class60.Field8.Field8();
                            Class106.Field19.Field1();

                            while (Class106.Field23 == null) {
                                Class858.Field1(5L);
                            }

                            for (var2 = 0; var2 <= 4 && !Field2(); ++var2) {
                                Class858.Field1(50L);
                            }

                            if (Class60.Field10.contains("Không đủ nguyên liệu")) {
                                continue;
                            }

                            if (Field2()) {
                                Class106.Field21.Field1 = false;
                                Class106.Field24.Field1 = false;
                                Field1 = 0;
                                Class62.Field1(Class858.Field1(Field6[1]));
                                return;
                            }
                        }

                        if (!Field2() && Field1 != 0) {
                            Class858.Field1(300L);
                            Class24.Field2().Field2(3);
                            var1 = Class183.Field3();
                            Class261.Field1().Field1((int) 10, (short) var1.Field9);
                            Class261.Field1().Field1((int) -502, (byte) 0, (int) 2);
                            Class858.Field1(300L);
                            Class637.Field1(3, 2);
                            Class60.Field8.Field8();
                            Class106.Field19.Field1();

                            while (Class106.Field23 == null) {
                                Class858.Field1(5L);
                            }

                            for (var2 = 0; var2 <= 4 && !Field2(); ++var2) {
                                Class858.Field1(50L);
                            }

                            if (Class60.Field10.contains("Không đủ nguyên liệu")) {
                                continue;
                            }

                            if (Field2()) {
                                Class106.Field21.Field1 = false;
                                Class106.Field24.Field1 = false;
                                Field1 = 0;
                                Class62.Field1(Class858.Field1(Field6[1]));
                                return;
                            }
                        }

                        if (!Field2() && Field1 != 0) {
                            Class858.Field1(300L);
                            Class24.Field2().Field2(4);
                            var1 = Class183.Field3();
                            Class261.Field1().Field1((int) 10, (short) var1.Field9);
                            Class261.Field1().Field1((int) -502, (byte) 0, (int) 2);
                            Class858.Field1(300L);
                            Class637.Field1(3, 3);
                            Class60.Field8.Field8();
                            Class106.Field19.Field1();

                            while (Class106.Field23 == null) {
                                Class858.Field1(5L);
                            }

                            for (var2 = 0; var2 <= 4 && !Field2(); ++var2) {
                                Class858.Field1(50L);
                            }

                            if (Class60.Field10.contains("Không đủ nguyên liệu")) {
                                continue;
                            }

                            if (Field2()) {
                                Class106.Field21.Field1 = false;
                                Class106.Field24.Field1 = false;
                                Field1 = 0;
                                Class62.Field1(Class858.Field1(Field6[1]));
                                return;
                            }
                        }

                        if (Field2() && Field1 == 0) {
                            continue;
                        }

                        Class858.Field1(300L);
                        Class24.Field2().Field2(5);
                        var1 = Class183.Field3();
                        Class261.Field1().Field1((int) 10, (short) var1.Field9);
                        Class261.Field1().Field1((int) -502, (byte) 0, (int) 2);
                        Class858.Field1(300L);
                        Class637.Field1(4, 3);
                        Class60.Field8.Field8();
                        Class106.Field19.Field1();

                        while (Class106.Field23 == null) {
                            Class858.Field1(5L);
                        }

                        for (var2 = 0; var2 <= 4 && !Field2(); ++var2) {
                            Class858.Field1(50L);
                        }

                        if (!Field2()) {
                            Class534 var3 = Class183.Field3();
                            Class261.Field1().Field6(var3.Field9);
                            continue;
                        }

                        if (Class60.Field10.contains("Không đủ nguyên liệu")) {
                            continue;
                        }

                        Class106.Field21.Field1 = false;
                        Class106.Field24.Field1 = false;
                        Field1 = 0;
                        Class62.Field1(Class858.Field1(Field6[1]));
                    }
                } catch (Exception var4) {
                    continue;
                }
            }

            return;
        }
    }

    public static boolean Field2() {
        Class534 var0 = Class183.Field3();
        String[] var1 = MainTab.cheDoScreen.Field3().split(";");

        for (int var2 = 0; var2 < var0.Field34.size(); ++var2) {
            Class826 var3 = (Class826) var0.Field34.elementAt(var2);
            String var4 = Class534.Field1(var3.Field1(var0.Field30) + var3.Field2() + (var3.Field1() ? "%" : ""), String.valueOf(var3.Field1(false)));

            for (String var8 : var1) {
                if (var4.trim().toLowerCase().contains(var8)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void Field3() {
        MainTab.cheDoScreen.Field1();
        if (Field5 <= 2) {
            Field2(Field4, Field5);
        } else if (Field5 < 8) {
            Field1(Field4, Field5);
        } else {
            Field1(Field3);
        }
    }

    public static void Field1(int var0) {
        Class261.Field1().Field1((int) -8, (byte) 1, (int) Class106.Field19.Field15.Field93);
        Class261.Field1().Field1((int) -8, (byte) 2, (int) 3);
        Class261.Field1().Field1((int) -8, (byte) 11, (int) 2);
    }

    public static void Field1(int var0, int var1) {
        Class261.Field1().Field1((int) -8, (byte) 3, (int) var0);
        Class261.Field1().Field1((int) -8, (byte) 4, (int) Class106.Field19.Field15.Field93);
        Class261.Field1().Field1((int) -8, (byte) 5, (int) var1);
        Class261.Field1().Field1((int) -8, (byte) 6, (int) 3);
        Class261.Field1().Field1((int) -8, (byte) 11, (int) 2);
    }

    public static void Field2(int var0, int var1) {
        Class261.Field1().Field1((int) -8, (byte) 3, (int) var0);
        Class261.Field1().Field1((int) -8, (byte) 4, (int) Class106.Field19.Field15.Field93);
        Class261.Field1().Field1((int) -8, (byte) 5, (int) var1);
        Class261.Field1().Field1((int) -8, (byte) 6, (int) (7 - Field3));
        Class261.Field1().Field1((int) -8, (byte) 11, (int) 2);
    }
}
