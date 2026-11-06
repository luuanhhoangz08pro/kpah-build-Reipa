package main.tab.tab1;

import java.util.Random;
import java.util.Vector;

public abstract class Class435 {
    public static int[] Field1 = new int[]{3, 3, 3, 3, 4, 4, 5, 6, 7, 8, 8};
    public static final byte[] Field2 = new byte[]{-2, 2, 20, -20};
    public static final byte[] Field3 = new byte[]{-30, -30, -30, -30};
    public static final byte[] Field4 = new byte[]{-2, 2, -8, 8};
    public static final byte[] Field5 = new byte[]{-10, -30, -10, -10};
    private static byte[] Field6 = new byte[]{-2, 2, -14, 14};
    private static byte[] Field7 = new byte[]{-2, -28, -10, -10};
    private static byte[] Field8 = new byte[]{-10, 10, 10, -10};
    private static byte[] Field9 = new byte[]{-30, -26, -30, -30};
    private static byte[] Field10 = new byte[]{-30, -15, 0, 15, 30, 15, 0, -15};
    private static byte[] Field11 = new byte[]{0, 13, 20, 13, 0, -13, -20, -13};

    public void Field1(Class359 var1) {
        if (var1.Field67 == null) {
            var1.Field204 = 0;
            var1.Field73 = 0;
            var1.Field76 = -1;
        }

        var1.Field23 = 4;
    }

    public void Field1(Class123 var1) {
    }

    public void Field1(Vector var1) {
    }

    public void Field2(Vector var1) {
    }

    public int Field1() {
        return 1;
    }

    public void Field1(int var1) {
    }

    public static void Field1(Class359 var0, int var1) {
        if (var0.Field73 == 20) {
            var0.Field204 = 0;
            var0.Field73 = 0;
            var0.Field76 = 0;
        } else if (var0.Field73 != 17 && var0.Field73 != 16 && var0.Field73 != 18 && var0.Field73 != 19) {
            if (var0.Field73 != 15 && var0.Field73 != 14) {
                if (var0.Field73 != 13 && var0.Field73 != 12) {
                    var0.Field23 = 4;
                    var0.Field76 = 4;
                    if (var0.Field73 < 6) {
                        Class74.Field2(var0.Field193 - (20 - var0.Field73), var0.Field194 - 4, 4);
                        Class74.Field2(var0.Field193 + (20 - var0.Field73), var0.Field194 - 4, 4);
                        Class74.Field2(var0.Field193, var0.Field194 - 4 + (20 - var0.Field73), 4);
                        if (var1 == 1) {
                            Class105.Field19.Field24 = 20;
                            Class74.Field2(var0.Field67.Field193 - (20 - var0.Field73), var0.Field67.Field194 - 4, 4);
                            Class74.Field2(var0.Field67.Field193 + (20 - var0.Field73), var0.Field67.Field194 - 4, 4);
                            Class74.Field2(var0.Field67.Field193, var0.Field67.Field194 - 4 - (20 - var0.Field73), 4);
                            Class74.Field2(var0.Field67.Field193, var0.Field67.Field194 - 4 + (20 - var0.Field73), 4);
                        }
                    }

                    if (var0.Field73 % 3 == 0) {
                        Class74.Field1(var0.Field193 + Field8[var0.Field12], var0.Field194 + Field9[var0.Field12], 11);
                    }

                } else {
                    var0.Field23 = 4;
                    var0.Field76 = 5;
                }
            } else {
                var0.Field23 = 5;
                var0.Field76 = 6;
            }
        } else {
            var0.Field23 = 5;
            var0.Field76 = 7;
        }
    }

    public final void Field1(Class359 var1, boolean var2, int var3, int var4) {
        Field1(var1, var4);
        if (var1.Field73 == 13) {
            Random var7 = new Random(System.currentTimeMillis());
            int var5 = 0;
            int var6 = 0;
            if (var2) {
                var6 = var5 = var7.nextInt() % 20;
            }

            if ((var1.Field12 == 0 || var1.Field12 == 1) && var2) {
                var6 = 0;
            } else {
                var5 = 0;
            }

            if (var1.Field67 != null) {
                if (var1.Field67.Field188 == 1) {
                    if (var1.Field131 == 0) {
                        Class74.Field1(var1.Field67.Field193 + var5, var1.Field67.Field194 - 10 + var6, 11);
                        ((Class123) var1.Field67).Field1();
                    } else if (var1.Field131 == 2) {
                        Class74.Field1(var1.Field67.Field193 + var5, var1.Field67.Field194 - 10 + var6, 12);
                        ((Class123) var1.Field67).Field12();
                    }
                }

                var1.Field67.Field3 = 2;
            }

            if (var4 == 0) {
                Class74.Field2(var1.Field67.Field193 - 10 + var5, var1.Field67.Field194 - 25 + var6, 14);
                Class74.Field2(var1.Field67.Field193 + 10 + var5, var1.Field67.Field194 - 25 + var6, 14);
                Class74.Field2(var1.Field67.Field193 + var5, var1.Field67.Field194 - 25 - 10 + var6, 14);
            }

            if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                Class105.Field19.Field1("-" + var1.Field90 / var3, 0, var1.Field67.Field193, var1.Field67.Field194 - 15, -1, -2);
            }

            if (var1.Field131 != 0 && var1.Field131 < Class787.Field4.length) {
                Class105.Field19.Field1(Class787.Field4[var1.Field131], 0, var1.Field67.Field193, var1.Field67.Field194 - 15, 2, -2);
            }
        }

    }

    public static void Field2(Class359 var0) {
        if (var0.Field73 == 15) {
            var0.Field204 = 0;
            var0.Field73 = 0;
            var0.Field76 = 0;
        } else if (var0.Field73 != 14 && var0.Field73 != 13) {
            if (var0.Field73 != 12 && var0.Field73 != 11) {
                if (var0.Field73 != 10 && var0.Field73 != 9) {
                    if (var0.Field73 % 5 == 0) {
                        Class74.Field1(var0.Field193 + Field6[var0.Field12], var0.Field194 + Field7[var0.Field12], 16);
                    }

                    if (var0.Field73 % 7 == 0) {
                        Class74.Field2(var0.Field193 + Field6[var0.Field12] + 30 - var0.Field73, var0.Field194 + Field7[var0.Field12], 17);
                        Class74.Field2(var0.Field193 + Field6[var0.Field12] - 30 + var0.Field73, var0.Field194 + Field7[var0.Field12], 17);
                        Class74.Field2(var0.Field193 + Field6[var0.Field12], var0.Field194 + Field7[var0.Field12] + 30 - var0.Field73, 17);
                        Class74.Field2(var0.Field193 + Field6[var0.Field12], var0.Field194 + Field7[var0.Field12] - 30 + var0.Field73, 17);
                    }

                    var0.Field23 = 4;
                    var0.Field76 = 4;
                } else {
                    var0.Field23 = 4;
                    var0.Field76 = 5;
                }
            } else {
                var0.Field23 = 5;
                var0.Field76 = 6;
            }
        } else {
            var0.Field23 = 5;
            var0.Field76 = 7;
        }
    }

    public static void Field3(Class359 var0) {
        if (var0.Field73 == 16) {
            var0.Field204 = 0;
            var0.Field73 = 0;
            var0.Field76 = 0;
        } else if (var0.Field73 >= 14 && var0.Field73 < 16) {
            var0.Field23 = 5;
            var0.Field76 = 7;
        } else if (var0.Field73 != 13 && var0.Field73 != 12) {
            if (var0.Field73 != 11 && var0.Field73 != 10) {
                if (var0.Field73 < 4) {
                    Class74.Field1(var0.Field193 + Field10[var0.Field73], var0.Field194 - 10 + Field11[var0.Field73], 15);
                } else if (var0.Field73 < 8) {
                    Class74.Field2(var0.Field193 + Field10[var0.Field73], var0.Field194 - 10 + Field11[var0.Field73], 15);
                }

                var0.Field23 = 4;
                var0.Field76 = 4;
            } else {
                var0.Field23 = 4;
                var0.Field76 = 5;
            }
        } else {
            var0.Field23 = 5;
            var0.Field76 = 6;
        }
    }

    public static void Field4(Class359 var0) {
        if (var0.Field73 == 8) {
            var0.Field204 = 0;
            var0.Field73 = 0;
            var0.Field76 = 0;
        } else if (var0.Field73 >= 6 && var0.Field73 < 8) {
            var0.Field23 = 5;
            var0.Field76 = 7;
        } else if (var0.Field73 != 5 && var0.Field73 != 4) {
            if (var0.Field73 != 3 && var0.Field73 != 2) {
                var0.Field23 = 4;
                var0.Field76 = 4;
            } else {
                var0.Field23 = 4;
                var0.Field76 = 5;
            }
        } else {
            var0.Field23 = 5;
            var0.Field76 = 6;
        }
    }

    public static void Field5(Class359 var0) {
        if (var0.Field73 == 8) {
            var0.Field204 = 0;
            var0.Field73 = 0;
            var0.Field76 = 0;
        } else if (var0.Field73 != 7 && var0.Field73 != 6) {
            if (var0.Field73 != 5 && var0.Field73 != 4) {
                if (var0.Field73 != 3 && var0.Field73 != 2) {
                    var0.Field23 = 4;
                    var0.Field76 = 4;
                } else {
                    var0.Field23 = 4;
                    var0.Field76 = 5;
                }
            } else {
                var0.Field23 = 5;
                var0.Field76 = 6;
            }
        } else {
            var0.Field23 = 5;
            var0.Field76 = 7;
        }
    }
}
