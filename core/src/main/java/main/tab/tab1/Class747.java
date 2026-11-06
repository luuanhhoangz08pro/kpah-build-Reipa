package main.tab.tab1;

import main.lib.Graphics;

public final class Class747 {
    private int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    private int Field14;
    private int Field15;
    private int Field16;
    private String[] Field17;
    private String[] Field18;
    private String[] Field19;
    private String[] Field20;
    private String[] Field21;
    private byte[] Field22;
    private int Field23 = -1;
    public static boolean Field1 = false;
    private static boolean Field24 = false;
    private long Field25;
    public static Class568 Field2;

    public Class747() {
        if (Class105.Field33) {
            Class105.Field32 = false;
            this.Field6 = Class105.Field14 / 6 << 1;
            Class105.Field14 -= this.Field6;
            this.Field3 = 0;
            this.Field4 = Class105.Field14;
            this.Field5 = Class105.Field13;
            this.Field7 = this.Field5 / 5;
            this.Field8 = this.Field6 / 2;
            this.Field9 = 0;
            this.Field10 = this.Field4;
            this.Field11 = this.Field6 / 3;
            this.Field12 = this.Field5 / 4;
            this.Field13 = 5;
            this.Field14 = 2;
            this.Field15 = 4;
            this.Field16 = 3;
            this.Field17 = new String[]{"-", "Top", "ABC", "-", "*", "Left", "Down", "Right", "OK", "#"};
            this.Field18 = new String[]{".,?!1", "abc2", "def3", "Xóa", "ghi4", "jkl5", "mno6", "Xong", "pqrs7", "tuv8", "wxyz9", "0"};
            this.Field19 = new String[]{".,?!1", "ABC2", "DEF3", "Xóa", "GHI4", "JKL5", "MNO6", "Xong", "PQRS7", "TUV8", "WXYZ9", "0"};
            this.Field20 = new String[]{"1", "2", "3", "Xóa", "4", "5", "6", "Xong", "7", "8", "9", "0"};
            this.Field22 = new byte[]{-6, -1, 0, -7, 42, -3, -2, -4, -5, 35};
            this.Field25 = -1L;
            this.Field2();
        }

    }

    public final void Field1() {
        int var1;
        int var2;
        if (!Field1) {
            if (Field24 && Class105.Field7) {
                Field24 = false;
                if (System.currentTimeMillis() / 10L - this.Field25 > 40L) {
                    Class190.Field3();
                    this.Field2();
                } else {
                    this.Field23 = -1;
                    Field1 = true;
                }
            }

            if (Class105.Field1(0, this.Field4, this.Field5, this.Field6)) {
                if (Class105.Field6) {
                    var1 = Class105.Field10 / this.Field7;
                    var2 = (Class105.Field11 - this.Field4) / this.Field8;
                    this.Field23 = var2 * this.Field13 + var1;
                    var2 = this.Field23;
                    if (var2 == 2) {
                        this.Field25 = System.currentTimeMillis() / 10L;
                        Field24 = true;
                    } else {
                        Class105.Field1.KeyPressed(gameAction(this.Field22[var2]));
                    }

                    Class105.Field6 = false;
                    Class105.Field7 = false;
                }

                if (Class105.Field7 && this.Field23 != -1) {
                    var2 = this.Field23;
                    if (var2 != 2 && var2 < this.Field22.length) {
                        Class105.Field1.KeyReleased(gameAction(this.Field22[var2]));
                    }

                    this.Field23 = -1;
                    Class105.Field7 = false;
                }
            }

        } else {
            if (Class105.Field1(this.Field9, this.Field10, this.Field5, this.Field6)) {
                if (Class105.Field6) {
                    var1 = (Class105.Field10 - this.Field9) / this.Field12;
                    var2 = (Class105.Field11 - this.Field10) / this.Field11;
                    this.Field23 = var2 * this.Field15 + var1;
                    if ((var1 = this.Field23) % 4 != 3) {
                        if (Class105.Field17 == Class105.Field19 && Class105.Field23 == null && !Class105.Field21.Field1 && !Class105.Field19.Field30) {
                            Class105.Field19.Field30 = true;
                            Class105.Field19.Field31.Field1("");
                        } else {
                            Class105.Field1.KeyPressed(var1 + 49 - var1 / 4);
                        }
                    } else {
                        switch (var1) {
                            case 3:
                                if (Class105.Field19.Field30) {
                                    Class105.Field19.Field31.Field1();
                                } else if (Class105.Field17.Field105 != null && Class105.Field17.Field105.Field1.equals("Xóa")) {
                                    Class105.Field17.Field105.Field2.Field1();
                                }
                                break;
                            case 7:
                            case 9:
                                Field1 = false;
                                break;
                            case 10:
                                Class105.Field1.KeyPressed(48);
                                break;
                            case 11:
                                Class105.Field1.KeyPressed(48);
                                break;
                        }
                    }

                    Class105.Field6 = false;
                    Class105.Field7 = false;
                }

                if (Class105.Field7 && this.Field23 != -1) {
                    this.Field23 = -1;
                    Class105.Field7 = false;
                }
            }

        }
    }

    private int gameAction(int key) {
        switch (key) {
            case -1:
                return 1;
            case -2:
                return 6;
            case -3:
                return 2;
            case -4:
                return 5;
            default:
                return key;
        }
    }

    private void Field2() {
        switch (Class190.Field7) {
            case 0:
            case 1:
                this.Field21 = this.Field18;
                return;
            case 2:
                this.Field21 = this.Field19;
                return;
            case 3:
                this.Field21 = this.Field20;
            default:
        }
    }

    public final void Field1(Graphics var1) {
        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
        int var2;
        Class747 var3;
        if (Field1) {
            var3 = this;
            var1.setClip(this.Field9, this.Field10, this.Field5, this.Field6);
            var1.setColor(15070459);
            var1.fillRect(this.Field9, this.Field10, this.Field5, this.Field6);
            var1.setColor(1);
            var1.drawRect(this.Field9, this.Field10, this.Field5 - 1, this.Field6 - 1);

            for (var2 = 1; var2 < var3.Field15; ++var2) {
                var1.fillRect(var3.Field9 + var2 * var3.Field12, var3.Field10, 1, var3.Field6);
            }

            for (var2 = 1; var2 < var3.Field16; ++var2) {
                var1.fillRect(var3.Field9, var3.Field10 + var2 * var3.Field11, var3.Field5, 1);
            }

            for (var2 = 0; var2 < var3.Field19.length; ++var2) {
                var1.setClip(var3.Field9 + var2 % var3.Field15 * var3.Field12, var3.Field10 + var2 / var3.Field15 * var3.Field11 - 5, var3.Field12, var3.Field11 + 5);
                if (var3.Field23 == var2) {
                    var1.setColor(16514186);
                    var1.fillRect(var3.Field9 + var2 % var3.Field15 * var3.Field12 + 1, var3.Field10 + var2 / var3.Field15 * var3.Field11 + 1, var3.Field12 - 2, var3.Field11 - 2);
                }

                Class21.Field2.Field1(var1, var3.Field21[var2], var3.Field9 + var2 % var3.Field15 * var3.Field12 + var3.Field12 / 2, var3.Field10 + var2 / var3.Field15 * var3.Field11 - 5 + var3.Field11 / 2, 2);
            }

        } else {
            var3 = this;
            var1.setClip(0, this.Field4, this.Field5, this.Field6);
            var1.setColor(15070459);
            var1.fillRect(0, this.Field4, this.Field5, this.Field6);
            var1.setColor(1);
            var1.drawRect(0, this.Field4, this.Field5 - 1, this.Field6 - 1);

            for (var2 = 1; var2 < var3.Field13; ++var2) {
                var1.fillRect(var2 * var3.Field7, var3.Field4, 1, var3.Field6);
            }

            for (var2 = 1; var2 < var3.Field14; ++var2) {
                var1.fillRect(0, var3.Field4 + var2 * var3.Field8, var3.Field5, 1);
            }

            for (var2 = 0; var2 < var3.Field17.length; ++var2) {
                if (var3.Field23 == var2) {
                    var1.setColor(16514186);
                    var1.fillRect(var2 % var3.Field13 * var3.Field7 + 1, var3.Field4 + var2 / var3.Field13 * var3.Field8 + 1, var3.Field7 - 2, var3.Field8 - 2);
                }

                if (var3.Field17[var2].equals("ABC")) {
                    Class21.Field2.Field1(var1, Class190.Field8[Class190.Field7], var2 % var3.Field13 * var3.Field7 + var3.Field7 / 2, var3.Field4 + var2 / var3.Field13 * var3.Field8 - 5 + var3.Field8 / 2, 2);
                } else if (var3.Field17[var2].equals("Top")) {
                    Field2.Field1(0, var2 % var3.Field13 * var3.Field7 + var3.Field7 / 2, var3.Field4 + var2 / var3.Field13 * var3.Field8 + var3.Field8 / 2, 4, 3, var1);
                } else if (var3.Field17[var2].equals("Down")) {
                    Field2.Field1(0, var2 % var3.Field13 * var3.Field7 + var3.Field7 / 2, var3.Field4 + var2 / var3.Field13 * var3.Field8 + var3.Field8 / 2, 7, 3, var1);
                } else if (var3.Field17[var2].equals("Left")) {
                    Field2.Field1(0, var2 % var3.Field13 * var3.Field7 + var3.Field7 / 2, var3.Field4 + var2 / var3.Field13 * var3.Field8 + var3.Field8 / 2, 0, 3, var1);
                } else if (var3.Field17[var2].equals("Right")) {
                    Field2.Field1(0, var2 % var3.Field13 * var3.Field7 + var3.Field7 / 2, var3.Field4 + var2 / var3.Field13 * var3.Field8 + var3.Field8 / 2, 2, 3, var1);
                } else {
                    Class21.Field2.Field1(var1, var3.Field17[var2], var2 % var3.Field13 * var3.Field7 + var3.Field7 / 2, var3.Field4 + var2 / var3.Field13 * var3.Field8 - 5 + var3.Field8 / 2, 2);
                }
            }

        }
    }
}
