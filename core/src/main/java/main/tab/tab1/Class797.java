package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

public final class Class797 extends Class51 {
    private static int[] Field6 = new int[]{0, 15, 37, 52, 75, 105, 127, 142, 165, 195, 217, 232, 255, 285, 307, 322, 345, 370};
    private int Field7;
    private byte Field8;
    public byte Field2 = -1;
    private Class111 Field9;
    private int[] Field10;
    private int[] Field11;
    private int Field12;
    private int Field13;
    private int Field14;
    private int Field15;
    private int Field16;
    public static final byte[][] Field3 = new byte[][]{{16, 24, 36, 24, 24, 36, 17, 28, 28, 73, 32, 14, 21, 56, 56, 42, 46, 24, 29, 32}, {16, 24, 36, 24, 24, 36, 17, 28, 28, 73, 32, 13, 16, 54, 54, 41, 50, 24, 28, 32}};
    public static final int[] Field4 = new int[]{0, 0, 0, 7, 6, 6, 6, 2, 2, 3, 3, 4, 5, 5, 5, 1};
    public static final byte[] Field5 = new byte[]{0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0, 1, 2, 1, 0};
    private byte Field17;

    public Class797(int var1) {
        this.Field15 = var1;
    }

    public final void Field1(int var1) {
    }

    public final void Field1(Graphics var1) {
        Image var2;
        if ((var2 = Class804.Field3(this.Field15)) != null) {
            if (this.Field15 == 18 || this.Field15 == 16) {
                var1.drawRegion(var2, 0, this.Field17 * Field3[1][this.Field15], Field3[0][this.Field15], Field3[1][this.Field15], 0, this.Field10[this.Field14], this.Field11[this.Field14], 3);
                return;
            }

            var1.drawRegion(var2, 0, this.Field12 * Field3[1][this.Field15], Field3[0][this.Field15], Field3[1][this.Field15], this.Field13, this.Field10[this.Field14], this.Field11[this.Field14], 3);
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class111 var6, Class111 var7) {
        this.Field8 = var5;
        this.Field9 = var7;
        this.Field7 = var4;
        boolean var8 = false;
        boolean var9 = false;
        var4 = var7.Field193 - var2;
        int var10 = var7.Field194 + var7.Field16 - var3;
        if (var1 == 7) {
            var4 = var7.Field193 + 10 - var2;
            var10 = var7.Field194 + var7.Field16 - var3;
        } else if (var1 == 8) {
            var4 = var7.Field193 - 10 - var2;
            var10 = var7.Field194 - 10 + var7.Field16 - var3;
        }

        if ((var1 = (Class63.Field3(var4) + Class63.Field3(var10)) / 20) < 2) {
            var1 = 2;
        }

        this.Field10 = new int[var1];
        this.Field11 = new int[var1];

        for (int var11 = 1; var11 < var1; ++var11) {
            this.Field10[var11] = var2 + var11 * var4 / var1;
            this.Field11[var11] = var3 + var11 * var10 / var1;
        }

        this.Field16 = Field2(Class802.Field1(var4, -var10));
        this.Field12 = Field5[this.Field16];
        this.Field13 = Field4[this.Field16];
    }

    public static int Field2(int var0) {
        for (int var1 = 0; var1 < Field6.length - 1; ++var1) {
            if (var0 >= Field6[var1] && var0 <= Field6[var1 + 1]) {
                if (var1 >= 16) {
                    return 0;
                }

                return var1;
            }
        }

        return 0;
    }

    public final void Field1() {
        if (this.Field15 == 18) {
            this.Field17 = (byte) ((this.Field17 + 1) % 4);
        }

        ++this.Field14;
        if (this.Field14 >= this.Field10.length) {
            this.Field14 = this.Field10.length;
        }

        if (this.Field14 == this.Field10.length) {
            if (this.Field7 != 0 && this.Field7 != 2000000) {
                Class105.Field19.Field1("-" + this.Field7, 0, this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 15, 1, -2);
            }

            if (this.Field8 != 0 && this.Field8 < Class787.Field4.length) {
                Class105.Field19.Field1(Class787.Field4[this.Field8], 0, this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 15, 2, -2);
            }

            this.Field9.Field3 = 2;
            if (this.Field9.Field188 == 1) {
                if (this.Field8 == 0) {
                    ((Class123) this.Field9).Field1();
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 11);
                } else if (this.Field8 == 2) {
                    ((Class123) this.Field9).Field12();
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 12);
                }
            }

            if (this.Field8 != 1) {
                if (this.Field15 == 1) {
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 9);
                }

                if (this.Field15 == 2) {
                    Class74.Field1(this.Field9.Field193 - 10, this.Field9.Field194 + this.Field9.Field16, 16);
                    Class74.Field1(this.Field9.Field193 + 10, this.Field9.Field194 + this.Field9.Field16, 16);
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 16);
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 16);
                }

                if (this.Field15 == 5) {
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 30);
                }

                if (this.Field15 == 7) {
                    Class213 var1 = new Class213(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16, this.Field13);
                    Class74.Field2.addElement(var1);
                    Class74.Field1.addElement(var1);
                }

                if (this.Field15 == 8) {
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 11);
                }

                if (this.Field15 == 13) {
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 50);
                }

                if (this.Field15 == 18) {
                    Class74.Field1(this.Field9.Field193, this.Field9.Field194 + this.Field9.Field16 - 10, 50);
                }

                if (this.Field2 != -1) {
                    Class173 var2;
                    (var2 = new Class173(this.Field9.Field193, this.Field9.Field194 - this.Field9.Field195 / 2, this.Field2)).Field12 = (byte) (this.Field2 == 30 ? 0 : 1);
                    Class74.Field2.addElement(var2);
                }
            }

            super.Field1 = true;
        }
    }
}
