package main.tab.tab2;

import main.lib.Graphics;

public final class Class409 extends Class275 {
    private static Class409 Field1;
    private String[] Field2;
    private String Field3;
    private int Field4 = 50;
    private int Field5 = 20;
    private int Field6;
    private int Field7;
    private static int Field8;
    private static int Field9;
    private static int Field10;
    private static int Field11;
    private static int Field12;
    private static int Field13 = 0;
    private static int Field14 = 0;

    public static Class409 Field1() {
        return Field1 == null ? (Field1 = new Class409()) : Field1;
    }

    public Class409() {
        this.Field6 = Class106.Field13 - 100;
        this.Field7 = Class106.Field14 - 40 - Class671.Field108;
        super.Field105 = new Class86("Đóng", new Class136(this));
        Field14 = (this.Field7 - 30) / 2 / 14;
    }

    public final void Field1(String var1, String var2) {
        this.Field2 = Class21.Field8.Field1(var1, this.Field6 - 15);
        this.Field3 = var2;
        if ((Field12 = this.Field2.length * 14 - (this.Field7 - 25) + 15) < 0) {
            Field12 = 0;
        }

        Field8 = 0;
        Field9 = 0;
        Field13 = Field14;
        Class106.Field23 = this;
    }

    public final void Field1(Graphics var1) {
        Class106.Field1(var1);
        Class811.Field4(var1, this.Field4, this.Field5, this.Field6, this.Field7);
        Class21.Field3.Field1(var1, this.Field3, this.Field4 + this.Field6 / 2, this.Field5 + 2, 2);
        var1.translate(this.Field4, this.Field5 + 25);
        var1.setClip(0, 0, this.Field6, this.Field7 - 30);
        var1.translate(0, -Field9);
        int var2;
        int var3;
        if ((var3 = (var2 = Field9 / 14) + this.Field7 / 14 + 1) >= this.Field2.length) {
            var3 = this.Field2.length;
        }

        for (var2 = var2; var2 < var3; ++var2) {
            Class21.Field8.Field1(var1, this.Field2[var2], 7, 5 + var2 * 14, 0);
        }

        super.Field1(var1);
    }

    public final void Field2() {
        boolean var1 = false;
        if (Class106.Field5[2]) {
            if (--Field13 < Field14) {
                Field13 = Field14;
            }

            var1 = true;
        } else if (Class106.Field5[8]) {
            var1 = true;
            if (Field9 < Field12) {
                ++Field13;
            }

            if (Field13 > this.Field2.length - Field14 + 1) {
                Field13 = this.Field2.length - Field14 + 1;
            }
        }

        if (var1) {
            if ((Field8 = Field13 * 14 - (this.Field7 - 25) / 2) < 0) {
                Field8 = 0;
            }

            if (Field8 > Field12) {
                Field8 = Field12;
            }
        }

        if (Field9 != Field8) {
            Field11 = Field8 - Field9 << 2;
            Field10 += Field11;
            Field9 += Field10 >> 4;
            Field10 &= 15;
        }

        super.Field3();
    }
}
