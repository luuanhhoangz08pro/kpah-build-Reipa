package main.tab.tab2;

import main.tab.tab2.screen.MainTab;

public final class Class24 extends Thread implements Class256 {
    public static int Field1 = -1;
    public static int Field2 = -1;
    private static Class24 Field6;
    public static String Field3 = "";
    public static int Field4 = 0;
    public static String[] Field5 = new String[]{"OFF", "ON"};

    public static Class24 Field2() {
        if (Field6 == null) {
            Field6 = new Class24();
        }

        return Field6;
    }

    public static void Field3() {
        MainTab.cheDoScreen.Field1();
        switch (Class835.Field5) {
            case 0:
            case 2:
            case 3:
                Field1 = 125;
                Field2 = 20;
                Field3 = "Da Cứng + Mềm";
                break;
            case 1:
            case 4:
                Field1 = 117;
                Field2 = 12;
                Field3 = "Tơ Lụa + Vải";
                break;
            case 5:
            case 6:
            case 7:
                Field1 = 121;
                Field2 = 16;
                Field3 = "TT + Ngọc";
                break;
            case 8:
                Field1(Class106.Field19.Field15.Field93);
        }

    }

    public static void Field1(int var0) {
        switch (var0) {
            case 0:
            case 1:
            case 3:
                Field1 = 123;
                Field2 = 14;
                Field3 = "Bạc + Gỗ";
                break;
            case 2:
            case 4:
                Field1 = 119;
                Field2 = 18;
                Field3 = "Gỗ Sưa + Sắt";
        }

    }

    public final void Field1() {
        if (++Field4 >= Field5.length) {
            Field4 = 0;
        }

    }

    public final void run() {
    }

    public void Field2(int var1) {
        if (Field4 != 0) {
            long var2 = 55L;
            int var4;
            switch (var1) {
                case 1:
                    for (var4 = 0; var4 <= 19; ++var4) {
                        Class261.Field1().Field3(Field1);

                        while (Class106.Field23 == null) {
                            Class858.Field1(5L);
                        }

                        Class106.Field23 = null;
                        Class677.Field4 = var4 + 1 + "/20";
                    }

                    Class839.Field1(Field2, 10);
                    Class858.Field1(175L);
                    this.Field4();
                    Class106.Field23 = null;
                    break;
                case 2:
                    for (var4 = 0; var4 <= 9; ++var4) {
                        Class261.Field1().Field3(Field1);

                        while (Class106.Field23 == null) {
                            Class858.Field1(5L);
                        }

                        Class106.Field23 = null;
                        Class677.Field4 = var4 + 1 + "/10";
                    }

                    Class839.Field1(Field2, 10);
                    Class858.Field1(175L);
                    this.Field4();
                    Class106.Field23 = null;
                    break;
                case 3:
                    for (var4 = 0; var4 <= 14; ++var4) {
                        Class261.Field1().Field3(Field1);

                        while (Class106.Field23 == null) {
                            Class858.Field1(5L);
                        }

                        Class106.Field23 = null;
                        Class677.Field4 = var4 + 1 + "/15";
                    }

                    Class839.Field1(Field2, 10);
                    Class858.Field1(175L);
                    this.Field4();
                    Class106.Field23 = null;
                    break;
                case 4:
                    for (var4 = 0; var4 <= 14; ++var4) {
                        Class261.Field1().Field3(Field1);

                        while (Class106.Field23 == null) {
                            Class858.Field1(5L);
                        }

                        Class106.Field23 = null;
                        Class677.Field4 = var4 + 1 + "/15";
                    }

                    Class839.Field1(Field2, 15);
                    Class858.Field1(175L);
                    this.Field4();
                    Class106.Field23 = null;
                    break;
                case 5:
                    for (var4 = 0; var4 <= 19; ++var4) {
                        Class261.Field1().Field3(Field1);

                        while (Class106.Field23 == null) {
                            Class858.Field1(5L);
                        }

                        Class106.Field23 = null;
                        Class677.Field4 = var4 + 1 + "/20";
                    }

                    Class839.Field1(Field2, 15);
                    Class858.Field1(175L);
                    this.Field4();
                    Class106.Field23 = null;
            }

            Class106.Field23 = null;
            Class106.Field21.Field1 = false;
            Class106.Field24.Field1 = false;
        }
    }

    public void Field4() {
        try {
            int[] var1 = new int[]{5, 11, 17, 23, 29};

            for (int var2 = 0; var2 <= var1.length; ++var2) {
                Class261.Field1().Field1((int) -11, (byte) 0, (int) 1);
                Class261.Field1().Field1((int) -11, (byte) 1, (int) var1[var2]);
                Class858.Field1(55L);
                Class261.Field1().Field1((int) -12, (byte) 0, (int) 0);
                Class261.Field1().Field1((int) -12, (byte) 1, (int) var1[var2]);
                Class858.Field1(55L);
            }
        } catch (Exception var3) {
        }

    }
}
