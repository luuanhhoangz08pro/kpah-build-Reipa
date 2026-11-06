package main.tab.tab1;

import main.lib.Graphics;
import main.lib.Image;
import main.screen.Main;
import main.tab.tab1.screen.AutoClick;
import main.tab.tab1.screen.TabController;

import java.util.Random;

public final class Class105 implements Runnable {
    public static Class105 Field1;
    private static boolean Field45;
    public static boolean Field2;
    public static boolean[] Field3 = new boolean[14];
    public static boolean[] Field4 = new boolean[14];
    public static boolean[] Field5 = new boolean[14];
    public static boolean Field6;
    public static boolean Field7;
    public static boolean Field8;
    public static boolean Field9;
    public static int Field10;
    public static int Field11;
    public static int Field12;
    public static int Field13;
    public static int Field14;
    public static int Field15;
    public static int Field16;
    private static boolean Field46;
    public static Class665 Field17;
    public static boolean Field18;
    public static Class63 Field19;
    public static Random Field20 = new Random(System.currentTimeMillis());
    public static Class230 Field21 = new Class230();
    public static Class792 Field22;
    public static Class277 Field23;
    public static Class567 Field24 = new Class567();
    private static Class747 Field47;
    public static Class273 Field25;
    public static boolean Field26 = false;
    public static boolean Field27;
    public static boolean Field28 = false;
    public static Image Field29;
    private static Object Field49 = new Object();
    public static int Field30;
    public static int Field31;
    public static boolean Field32;
    public static boolean Field33 = false;
    public static boolean Field34;
    public static Class412 Field35;
    public static Class376 Field36;
    private static boolean Field50 = false;
    public static boolean Field37;
    private int Field51;
    public static Class87 Field38;
    public static String[] Field39 = new String[]{"t_hang", "t_thanh"};
    private static Class567 Field52 = new Class567();
    private static int Field53 = 0;
    public static Class134 Field40;
    public static Class66 Field41;
    public TabController tabController = new TabController();

    public Class105() {
        Field26 = true;
        Field1 = this;
        this.Field51 = Class826.Field3("loadClearRMS");
        if (this.Field51 == -1) {
            Class826.Field1();
            Class826.Field1("loadClearRMS", 1);
        }

        System.gc();
        Field46 = false;
        Field11();
        (new Thread(Class804.Field45)).start();
        Field1();
        Field27 = false;

        Field35 = new Class412();
        Field37 = this.hasPointerEvents();

        if (Field13 < 200) {
            Field18 = true;
        }

        if (Class826.Field1(Field39[0]) == null) {
            Field2 = true;
        }

    }

    public boolean hasPointerEvents() {
        return true;
    }

    public static Image Field1() {
        if (Field29 == null) {
            try {
                Field29 = Image.createImage("/logo.png");
            } catch (Exception var1) {
                var1.printStackTrace();
            }
        }

        return Field29;
    }

    public static void Field2() {
        Class96.Field1().Field1(Class767.Field3[Class767.Field1], Class767.Field4[Class767.Field1]);
        Class824.Field2();
    }

    public final void Field3() {
        Field19 = new Class63();
        Field22 = new Class792();
        Field25 = new Class273();
        Field36 = new Class376();
        Field38 = new Class87("", new Class744(this));
    }

    private static void Field11() {
        Field13 = Main.getWidth();
        Field14 = Main.getHeight();
    }

    public final void sizeChanged(int var1, int var2) {
        Field11();
        if (this.hasPointerEvents()) {
            if (Class128.Field106 == null) {
                Class53.Field2("/main.sh");
                Class128.Field106 = Class53.Field1("bpa");
                Class747.Field2 = Class568.Field1("ar2", 4, 6);
            }

            Field47 = new Class747();
            Field32 = false;
        }

        Field15 = Field13 / 2;
        Field16 = Field14 / 2;
        if (Field17 != null) {
            if (Field17 == Field22) {
                Field22.Field2();
            }

            Field19.Field2();
            if (Field17 == Class467.Field1) {
                Class467.Field5().Field2();
            }

            if (Field17 == Class499.Field1) {
                Class499.Field5().Field2();
            }

            if (Field17 == Class745.Field1) {
                Class745.Field5().Field2();
            }

            if (Field17 == Class103.Field1) {
                Class103.Field5().Field2();
            }

            if (Field17 == Class60.Field1) {
                Class60.Field5().Field2();
            }

            Field17.Field2();
            Class804.Field1();
            if (Field23 == Field25) {
                Field25.Field1();
            }
        }

    }

    public final void Field4() {
        if (!Field50) {
            (new Thread(this)).start();
        }

        Field50 = true;
    }

    public final void run() {
        Field45 = true;

        while (Field45) {
            try {
                long var1 = System.currentTimeMillis();
                if (++Field12 > 10000) {
                    Field12 = 0;
                }
                if (tabController != null) {
                    tabController.updateKey();
                }
                if (Field33) {
                    Field47.Field1();
                }

                if (Field21.Field1) {
                    Field21.Field2();
                    Field21.Field4();
                }

                if (Field23 != null) {
                    Field23.Field2();
                }

                if (Field17 != null) {
                    Field17.Field4();
                    if (!Field21.Field1 && Field23 == null) {
                        AutoClick.tick();
                        Field17.Field3();
                    }
                }

                if (Field53 > 0 && --Field53 == 0 && Field23 == null) {
                    Field23 = Field52;
                }

                Field6();

                long var3 = System.currentTimeMillis() - var1;

                try {
                    if (var3 < 32L) {
                        Thread.sleep(32L - var3);
                    } else {
                        Thread.sleep(1L);
                    }
                } catch (InterruptedException var7) {
                }
            } catch (Exception var8) {
                var8.printStackTrace();
            }
        }

    }

    public final void KeyPressed(int var1) {
        Field5();
        Field6();
        if (!Field26) {
            if (Field46) {
                switch (var1) {
                    case -23:
                        var1 = -8;
                        break;
                    case -22:
                    case 22:
                        var1 = -7;
                        break;
                    case -21:
                    case 21:
                        var1 = -6;
                        break;
                    case -20:
                        var1 = -5;
                        break;
                    case -6:
                        var1 = -2;
                        break;
                    case -5:
                        var1 = -4;
                        break;
                    case -2:
                        var1 = -3;
                }
            } else if (Field27) {
                switch (var1) {
                    case -8:
                        Field5[5] = Field3[5] = true;
                        return;
                    case -1:
                    case 1:
                        Field5[2] = Field3[2] = true;
                        return;
                    case -3:
                    case 2:
                        Field5[4] = Field3[4] = true;
                        return;
                    case -4:
                    case 5:
                        Field5[6] = Field3[6] = true;
                        return;
                    case -2:
                    case 6:
                        Field5[8] = Field3[8] = true;
                        return;
                    default:
                        if (Field17 == Field19) {
                            switch (var1) {
                                case 101:
                                    Field5[2] = Field3[2] = true;
                                    return;
                                case 102:
                                    Field5[6] = Field3[6] = true;
                                    return;
                                case 115:
                                    Field5[4] = Field3[4] = true;
                                    return;
                                case 120:
                                    Field5[8] = Field3[8] = true;
                                    return;
                            }
                        }
                }
            }

            if (var1 == 10) {
                var1 = -5;
            }

            if (!Field17.Field1(var1)) {
                switch (var1) {
                    case -22:
                    case -7:
                        Field5[13] = Field3[13] = true;
                        break;
                    case -21:
                    case -6:
                        Field5[12] = Field3[12] = true;
                        break;
                    case -5:
                        Field5[5] = Field3[5] = true;
                        break;
                    case 35:
                        Field5[11] = Field3[11] = true;
                        break;
                    case 42:
                        Class833.Field2();
                        break;
                    case 48:
                    case 49:
                    case 50:
                    case 51:
                    case 52:
                    case 53:
                    case 54:
                    case 55:
                    case 56:
                    case 57:
                        if (Field23 == null && Field17 == Field19 && !Field27 && (!Field33 || !Class747.Field1)) {
                            Field5[var1 - 48] = true;
                            Field3[var1 - 48] = true;
                        }
                        break;
                    default:
                        if (var1 < 65 || var1 > 122) {
                            switch ((var1)) {
                                case -1:
                                case 1:
                                    Field5[2] = Field3[2] = true;
                                    break;
                                case -3:
                                case 2:
                                    Field5[4] = Field3[4] = true;
                                case 3:
                                case 4:
                                case 7:
                                default:
                                    break;
                                case -4:
                                case 5:
                                    Field5[6] = Field3[6] = true;
                                    break;
                                case -2:
                                case 6:
                                    Field5[8] = Field3[8] = true;
                                    break;
                                case 8:
                                    Field5[5] = Field3[5] = true;
                            }
                        }
                }
            }

            if (Field23 != null) {
                Field23.Field1(var1);
            }

        }
    }

    public final void KeyReleased(int var1) {
        if (!Field26) {
            if (Field46) {
                switch (var1) {
                    case -23:
                        var1 = -8;
                        break;
                    case -22:
                    case 22:
                        var1 = -7;
                        break;
                    case -21:
                    case 21:
                        var1 = -6;
                        break;
                    case -20:
                        var1 = -5;
                        break;
                    case -6:
                        var1 = -2;
                        break;
                    case -5:
                        var1 = -4;
                        break;
                    case -2:
                        var1 = -3;
                }
            } else if (Field27) {
                if (var1 == 27) {
                    var1 = -7;
                }

                if (Field17 == Field19) {
                    switch (var1) {
                        case 101:
                            Field5[2] = Field3[2] = false;
                            Field4[2] = true;
                            return;
                        case 102:
                            Field5[6] = Field3[6] = false;
                            Field4[6] = true;
                            return;
                        case 115:
                            Field5[4] = Field3[4] = false;
                            Field4[4] = true;
                            return;
                        case 120:
                            Field5[8] = Field3[8] = false;
                            Field4[8] = true;
                            return;
                    }
                }
            }

            switch (var1) {
                case -22:
                case -7:
                    Field5[13] = false;
                    Field4[13] = true;
                    return;
                case -21:
                case -6:
                    Field5[12] = false;
                    Field4[12] = true;
                    return;
                case -5:
                case 10:
                    Field5[5] = false;
                    Field4[5] = true;
                    return;
                case 35:
                    Field5[11] = false;
                    Field4[11] = true;
                    return;
                case 42:
                    Field5[10] = false;
                    Field4[10] = true;
                    return;
                case 48:
                case 49:
                case 50:
                case 51:
                case 52:
                case 53:
                case 54:
                case 55:
                case 56:
                case 57:
                    Field5[var1 - 48] = false;
                    Field4[var1 - 48] = true;
                    return;
                default:
                    switch ((var1)) {
                        case -1:
                        case 1:
                            Field5[2] = false;
                            Field4[2] = true;
                            return;
                        case -3:
                        case 2:
                            Field5[4] = false;
                            Field4[4] = true;
                            return;
                        case -4:
                        case 5:
                            Field5[6] = false;
                            Field4[6] = true;
                            return;
                        case -2:
                        case 6:
                            Field5[8] = false;
                            Field4[8] = true;
                            return;
                        case 8:
                            Field5[5] = false;
                            Field4[5] = true;
                        case 3:
                        case 4:
                        case 7:
                        default:
                    }
            }
        }
    }

    public final void pointerDragged(int var1, int var2) {
        Field10 = var1;
        Field11 = var2;
    }

    public final void pointerPressed(int var1, int var2) {
        Field6 = true;
        Field8 = true;
        Field10 = var1;
        Field11 = var2;
        Field31 = var1;
        Field30 = var2;
    }

    public final void pointerReleased(int var1, int var2) {
        Field6 = false;
        Field7 = true;
        Field34 = true;
        Field8 = false;
        Field9 = true;
        Field10 = var1;
        Field11 = var2;
    }

    public static void Field5() {
        for (int var0 = 0; var0 < 14; ++var0) {
            Field5[var0] = false;
        }

    }

    public static void Field6() {
        Field7 = false;
        Field34 = false;
        Field9 = false;

        for (int var0 = 0; var0 < 14; ++var0) {
            Field3[var0] = false;
        }

    }

    public static void Field1(Graphics var0) {
        var0.translate(-var0.getTranslateX(), -var0.getTranslateY());
        var0.setClip(0, 0, Field13, Field14);
    }

    public final void paint(Graphics var1) {
        try {
            if (Field17 != null) {
                Field17.Field1(var1);
            }

            if (Field23 != null) {
                Field23.Field1(var1);
            }

            if (Field21.Field1) {
                Field21.Field2(var1);
            }

            if (Field26) {
                Field1(var1);
                var1.setColor(0);
                var1.fillRect(0, 0, Main.getWidth(), Main.getHeight());
                var1.drawImage(Field29, Main.getWidth() >> 1, Main.getHeight() >> 1, 3);
            }
            if (tabController != null) {
                tabController.paint(var1);
            }
            if (Field33) {
                Field47.Field1(var1);
            }

            if (Field27) {
                synchronized (Field49) {
                    Field49.notify();
                }
            }

            Class63.Field3(var1);
        } catch (Exception var3) {
        }

        Field1(var1);
    }

    public static int Field1(int var0) {
        return var0 > 0 ? var0 : -var0;
    }

    public static void Field7() {
        Field23 = null;
    }

    public static void Field1(String var0, String[] var1, Class258 var2, Class258 var3) {
        Field24.Field1 = false;
        Field24.Field1(var0, var1, new Class87("Có", var2), new Class87("", var2), new Class87("Không", var3));
        Field23 = Field24;
    }

    public static void Field1(String var0, boolean var1) {
        Class847.Field1(var0, var1);
    }

    public static void Field1(String[] var0) {
        String[] var10000 = var0;
        boolean var1 = false;
        var0 = var10000;
        Field24.Field1 = false;
        Field24.Field1((String[]) var0, new Class87("OK", new Class746()), (Class87) null, (Class87) null);
        Field23 = Field24;
    }

    public static void Field1(String var0) {
        Field1(var0, false);
    }

    public static void Field1(String var0, Class258 var1, Class258 var2) {
        Field24.Field1 = false;
        Field24.Field1(var0, new Class87("Có", var1), new Class87("", var1), new Class87("Không", var2));
        Field23 = Field24;
    }

    public static void Field2(String var0, boolean var1) {
        Field24.Field1 = var1;
        Field24.Field1((String) var0, (Class87) null, new Class87("Cancel", new Class750()), (Class87) null);
        Field23 = Field24;
    }

    public static void Field8() {
        Field24.Field1 = false;
        Field24.Field1((String) "Xin chờ...", (Class87) null, new Class87("Cancel", new Class749()), (Class87) null);
        Field23 = Field24;
    }

    public static void Field1(String var0, boolean var1, int var2) {
        Field52.Field1 = false;
        Field52.Field1((String) var0, (Class87) null, new Class87("OK", new Class752()), (Class87) null);
        Field53 = var2;
    }

    public static void Field1(String var0, Class258 var1) {
        Field24.Field1 = false;
        Field24.Field1((String) var0, (Class87) null, new Class87("OK", var1), (Class87) null);
        Field23 = Field24;
    }

    public static void Field2(String var0, Class258 var1) {
        Field24.Field1 = false;
        Field24.Field1(var0, new Class87("Có", var1), new Class87("", var1), new Class87("Không", new Class751()));
        Field23 = Field24;
    }

    public static boolean Field2(int var0) {
        if (Field3[var0]) {
            Field3[var0] = false;
            return true;
        } else {
            return false;
        }
    }

    public static String Field1(long var0) {
        String var2 = "";
        long var3 = var0 / 1000L + 1L;

        for (int var5 = 0; (long) var5 < var3; ++var5) {
            if (var0 < 1000L) {
                var2 = var0 + var2;
                break;
            }

            long var6;
            if ((var6 = var0 % 1000L) == 0L) {
                var2 = ".000" + var2;
            } else if (var6 < 10L) {
                var2 = ".00" + var6 + var2;
            } else if (var6 < 100L) {
                var2 = ".0" + var6 + var2;
            } else {
                var2 = "." + var6 + var2;
            }

            var0 /= 1000L;
        }

        return var2;
    }

    public static int Field9() {
        if (Field1(0, Field14 - (Class665.Field108 << 1), 50, Class665.Field108 << 1)) {
            return 0;
        } else if (Field1(Field15 - 25, Field14 - (Class665.Field108 << 1), 50, Class665.Field108 << 1)) {
            return 1;
        } else {
            return Field1(Field13 - 50, Field14 - (Class665.Field108 << 1), 50, Class665.Field108 << 1) ? 2 : -1;
        }
    }

    public static boolean Field1(int var0, int var1, int var2, int var3) {
        if (!Field6 && !Field7) {
            return false;
        } else {
            return Field10 >= var0 && Field10 <= var0 + var2 && Field11 >= var1 && Field11 <= var1 + var3;
        }
    }

    public static String Field1(long var0, int var2) {
        String var3 = "";
        if (var0 > 0L) {
            var3 = var3 + Field1(var0) + "Xu";
        }

        if (var2 > 0) {
            if (var0 > 0L) {
                var3 = var3 + " - ";
            }

            var3 = var3 + Field1((long) var2) + "Luong";
        }

        return var3;
    }

    public static boolean Field2(int var0, int var1, int var2, int var3) {
        if (!Field8 && !Field9) {
            return false;
        } else {
            return Field10 >= var0 && Field10 <= var0 + var2 && Field11 >= var1 && Field11 <= var1 + var3;
        }
    }

    public static int Field1(int var0, int var1) {
        return var0 + Field20.nextInt(var1 - var0);
    }

    public static boolean Field10() {
        return Math.abs(Field10 - Field31) < 10 && Math.abs(Field11 - Field30) < 10;
    }
}
