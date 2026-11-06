package main.tab.tab2;

import main.lib.Graphics;

public final class Class188 extends Class671 {
    private static Class188 Field2;
    private int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7 = 10000;
    String[] Field1 = null;
    private int[] Field8;
    private short Field9;
    private short Field10;
    private short Field11;
    private short Field12;

    public static Class188 Field5() {
        return Field2 == null ? (Field2 = new Class188()) : Field2;
    }

    public Class188() {
        this.Field9 = this.Field10 = 20;
        this.Field11 = (short) (Class106.Field13 - (this.Field9 << 1));
        this.Field12 = (short) (Class106.Field14 - (this.Field10 << 1) - Class671.Field108);
        super.Field105 = new Class86("Đóng", new Class658(this));
        Class261.Field1().Field17(0);
        Class106.Field8();
    }

    public final void Field1(String var1) {
        this.Field1 = Class21.Field10[0].Field1(var1, Class106.Field13 - 30);
        byte var3 = 0;
        this.Field8 = new int[this.Field1.length];

        for (int var2 = 0; var2 < this.Field1.length; ++var2) {
            if (this.Field1[var2].startsWith("x0")) {
                this.Field1[var2] = this.Field1[var2].substring(3);
                var3 = 0;
            } else if (this.Field1[var2].startsWith("x1")) {
                this.Field1[var2] = this.Field1[var2].substring(3);
                var3 = 1;
            }

            this.Field8[var2] = var3;
        }

        this.Field7 = this.Field1.length * 13 - (this.Field12 - 35);
        Class106.Field7();
    }

    public final boolean Field1(int var1) {
        return super.Field1(var1);
    }

    public final void Field1(Graphics var1) {
        Class106.Field19.Field1(var1);
        var1.translate(this.Field9, this.Field10);
        Class811.Field4(var1, 0, 0, this.Field11, this.Field12);
        Class21.Field2.Field1(var1, "Hướng dẫn", this.Field11 / 2, 6, 2);
        var1.translate(0, 30);
        var1.setClip(0, -2, this.Field11 - 4, this.Field12 - 32);
        var1.translate(0, -this.Field4);
        if (this.Field1 != null) {
            int var2;
            int var3;
            if ((var3 = (var2 = this.Field4 / 13) + (this.Field12 - 35) / 13 + 2) > this.Field1.length) {
                var3 = this.Field1.length;
            }

            for (var2 = var2; var2 < var3; ++var2) {
                (this.Field8[var2] == 0 ? Class21.Field8 : Class21.Field10[0]).Field1(var1, this.Field1[var2], 7, var2 * 13, 0);
            }
        }

        super.Field1(var1);
    }

    public final void Field1() {
        super.Field1();
    }

    public final void Field4() {
        boolean var1 = false;
        if (this.Field4 != this.Field3) {
            this.Field6 = this.Field3 - this.Field4 << 2;
            this.Field5 += this.Field6;
            this.Field4 += this.Field5 >> 4;
            this.Field5 &= 15;
        }

        if (Class106.Field5[8]) {
            this.Field3 += 13;
            var1 = true;
        }

        if (Class106.Field5[2]) {
            this.Field3 -= 13;
            var1 = true;
        }

        if (var1) {
            if (this.Field3 > this.Field7) {
                this.Field3 = this.Field7;
            }

            if (this.Field3 < 0) {
                this.Field3 = 0;
            }
        }

        super.Field4();
    }

    static void Field1(Class188 var0) {
        Field2 = null;
    }
}
