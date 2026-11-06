package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class173 extends Class51 {
    private int Field3;
    private int Field4;
    private byte Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    public static Image Field2;
    private Class270 Field10 = new Class270();
    private static int[] Field11 = new int[]{-1, -1, -1, 4, 3, 4, 6, -1, 7, 16, 19};
    private byte[][] Field12 = new byte[][]{{0, 0, 1, 1}, {2, 2, 3, 3}, {4, 4, 5, 5}};
    private byte Field13 = 0;
    private byte Field14;

    public final void Field1(int var1) {
        this.Field10.Field1(var1);
    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class114 var6, Class114 var7) {
        this.Field10.Field1(var1, var2, var3, var6.Field12, var7);
        this.Field4 = var1;
        this.Field5 = var5;
        this.Field6 = var4;
        this.Field3 = var4;
    }

    public final void Field1() {
        this.Field10.Field1();
        this.Field8 = this.Field10.Field1;
        this.Field9 = this.Field10.Field2;
        if (this.Field10.Field9) {
            short var2 = this.Field10.Field4.Field193;
            short var3 = this.Field10.Field4.Field194;
            switch (this.Field4) {
                case 0:
                    Class106.Field19.Field1(var2, var3);
                    break;
                case 1:
                    Class73.Field1(var2, var3 - 10, 3);
                    Class73.Field2(var2, var3 - 25, 11);
                    Class73.Field1(var2, var3 - 15, 11);
                    Class73.Field1(var2 - 10, var3 - 20, 11);
                    Class73.Field1(var2 + 10, var3 - 20, 11);
                    break;
                case 2:
                    Class73.Field1(var2, var3 - 10, 5);
                    break;
                case 3:
                    Class73.Field1(var2, var3 - 10, 7);
                    break;
                case 4:
                    Class73.Field2(var2, var3 - 25, 15);
                    Class73.Field1(var2, var3 - 15, 15);
                    Class73.Field1(var2 - 10, var3 - 20, 15);
                    Class73.Field1(var2 + 10, var3 - 20, 15);
                    break;
                case 5:
                case 7:
                    Class73.Field1(var2, var3 - 10, 30);
                case 6:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                default:
                    break;
                case 8:
                    Class73.Field1(var2, var3 - 10, 3);
                    Class73.Field2(var2, var3 - 25, 11);
                    Class73.Field1(var2, var3 - 15, 9);
                    Class73.Field1(var2 - 10, var3 - 20, 11);
                    Class73.Field1(var2 + 10, var3 - 20, 9);
                    break;
                case 9:
                    Class73.Field1(var2, var3 - 15, 50);
            }

            if (this.Field5 != 0 && this.Field5 < Class794.Field4.length) {
                Class106.Field19.Field1(Class794.Field4[this.Field5], 0, var2, var3 - 25, 1, -2);
            }

            if (this.Field3 != 2000000) {
                if (this.Field3 != 0) {
                    if (this.Field4 < 20) {
                        Class106.Field19.Field1("-" + this.Field3, 0, var2, var3 - 15, 1, -2);
                    } else {
                        Class106.Field19.Field1("-" + this.Field6, 0, var2, var3 - 15, 1, -2);
                    }
                } else {
                    Class106.Field19.Field1("MISS", 0, var2, var3 - 15, 1, -2);
                }
            }

            this.Field10.Field4.Field3 = 2;
            if (this.Field10.Field4.Field188 == 1) {
                if (this.Field5 == 0) {
                    ((Class126) this.Field10.Field4).Field1();
                    Class73.Field2.addElement(new Class177(var2, var3 - 10, 11));
                } else if (this.Field5 == 2) {
                    ((Class126) this.Field10.Field4).Field12();
                    Class73.Field2.addElement(new Class177(var2, var3 - 10, 12));
                }
            } else if (this.Field10.Field4.Field188 == 0) {
                if (this.Field5 == 0) {
                    ((Class357) this.Field10.Field4).Field1();
                    Class73.Field2.addElement(new Class177(var2, var3 - 10, 11));
                } else if (this.Field5 == 2) {
                    ((Class357) this.Field10.Field4).Field12();
                    Class73.Field2.addElement(new Class177(var2, var3 - 10, 12));
                }
            }

            super.Field1 = true;
        }

        switch (this.Field4) {
            case 0:
                Class73.Field1(this.Field8, this.Field9, 1);
                return;
            case 1:
                Class73.Field1(this.Field8, this.Field9, 2);
                return;
            case 2:
                Class73.Field1(this.Field8, this.Field9, 4);
                return;
            case 3:
                Class73.Field1(this.Field8, this.Field9, 6);
                Class73.Field1(this.Field8, this.Field9, 7);
                return;
            case 4:
                Class73.Field1(this.Field8, this.Field9, 8);
                return;
            case 5:
            case 7:
                Class73.Field1(this.Field8, this.Field9, 29);
                return;
            case 8:
                return;
            case 9:
                Class73.Field2(this.Field8, this.Field9 + 25, 59);
                Class73.Field2(new Class19(this.Field8, this.Field9 + 25));
                Class73.Field2(new Class19(this.Field8, this.Field9 + 25));
                ++this.Field13;
                if (this.Field13 > 3) {
                    this.Field13 = 0;
                    return;
                }
                break;
            case 10:
                ++this.Field7;
                if (this.Field7 > this.Field12[this.Field10.Field7].length - 1) {
                    this.Field7 = 0;
                }

                this.Field14 = this.Field12[this.Field10.Field7][this.Field7];
            case 11:
            case 20:
            case 22:
            case 33:
            case 44:
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field4 < 20) {
            int var2;
            Image var3;
            if (Field11[this.Field4] != -1 && (var3 = Class811.Field3(var2 = Field11[this.Field4])) != null) {
                if (this.Field4 != 10 && this.Field4 != 9) {
                    var1.drawRegion(var3, 0, this.Field10.Field7 * Class804.Field3[1][var2], Class804.Field3[0][var2], Class804.Field3[1][var2], this.Field10.Field8, this.Field8, this.Field9, 3);
                    return;
                }

                if (this.Field4 == 10) {
                    var1.drawRegion(var3, 0, this.Field14 * Class804.Field3[1][var2], Class804.Field3[0][var2], Class804.Field3[1][var2], this.Field10.Field8, this.Field8, this.Field9, 3);
                    return;
                }

                if (this.Field4 == 9) {
                    var1.drawRegion(var3, 0, this.Field13 * Class804.Field3[1][var2], Class804.Field3[0][var2], Class804.Field3[1][var2], 0, this.Field8, this.Field9, 3);
                    return;
                }
            }
        } else {
            var1.drawImage(Field2, this.Field8, this.Field9, 3);
        }

    }
}
