package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class794 extends Class665 {
    private static Class794 Field3;
    private static int Field4;
    private static int Field5;
    private static int Field6;
    private static int Field7;
    private static int Field8;
    private int Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    private int Field14;
    private int Field15;
    private int Field16;
    public int Field1;
    private Class665 Field17;
    public Vector Field2;
    private String Field18;

    public static Class794 Field5() {
        return Field3 == null ? (Field3 = new Class794()) : Field3;
    }

    public final void Field1() {
        this.Field17 = Class105.Field17;
        super.Field1();
    }

    public Class794() {
        super.Field105 = new Class87("Đóng", new Class249(this));
        super.Field104 = new Class87("Chọn", new Class250(this));
    }

    public final void Field1(int var1, int var2, int var3, int var4, int var5) {
        this.Field9 = 20;
        this.Field10 = 20;
        this.Field13 = var3;
        this.Field14 = var4;
        this.Field15 = var5;
        this.Field16 = (this.Field13 - 6) / var5;
        this.Field11 = this.Field12 = (this.Field13 - 6 - this.Field16 * var5) / 2;
    }

    public final void Field1(Vector var1, String var2) {
        this.Field18 = var2;
        this.Field2 = var1;
        byte var3 = 0;
        if (var1.size() % this.Field15 != 0) {
            var3 = 1;
        }

        if ((Field8 = (var1.size() / this.Field15 + var3) * this.Field16 - (this.Field14 - 32)) < 0) {
            Field8 = 0;
        }

    }

    public final void Field4() {
        if (Field5 != Field4) {
            Field7 = Field4 - Field5 << 2;
            Field6 += Field7;
            Field5 += Field6 >> 4;
            Field6 &= 15;
        }

    }

    public final void Field3() {
        boolean var1 = false;
        if (Class105.Field2(2)) {
            var1 = true;
            if (this.Field1 / this.Field15 > 0) {
                this.Field1 -= this.Field15;
            }
        } else if (Class105.Field2(4)) {
            var1 = true;
            --this.Field1;
            if (this.Field1 < 0) {
                this.Field1 = 0;
            }
        } else if (Class105.Field2(6)) {
            var1 = true;
            ++this.Field1;
            if (this.Field1 >= this.Field2.size()) {
                this.Field1 = this.Field2.size() - 1;
            }
        } else if (Class105.Field2(8)) {
            var1 = true;
            if (this.Field1 / this.Field15 < this.Field2.size() / this.Field15 && this.Field1 + this.Field15 < this.Field2.size()) {
                this.Field1 += this.Field15;
            }
        }

        if (var1) {
            if ((Field4 = this.Field1 / this.Field15 * this.Field16 - (this.Field14 - 31) / 2) < 0) {
                Field4 = 0;
            }

            if (Field4 > Field8) {
                Field4 = Field8;
            }
        }

        super.Field3();
    }

    public final void Field1(Graphics var1) {
        this.Field17.Field1(var1);
        Class105.Field1(var1);
        Class804.Field4(var1, this.Field9, this.Field10, this.Field13, this.Field14);
        Class21.Field3.Field1(var1, this.Field18, this.Field9 + this.Field13 / 2, this.Field10 + 2, 2);
        var1.translate(this.Field9 + 3 + this.Field11, this.Field10 + 26 + this.Field12);
        var1.setClip(0, 0, this.Field13 - (this.Field11 << 1), this.Field14 - 30 - this.Field12);
        var1.translate(0, -Field5);
        Class804.Field2(var1, this.Field1 % this.Field15 * this.Field16, this.Field1 / this.Field15 * this.Field16, this.Field16, this.Field16);
        int var2;
        if ((var2 = Field5 / this.Field16 * this.Field15) <= 0) {
            var2 = 0;
        }

        int var3;
        if ((var3 = var2 + ((this.Field14 - 31) / this.Field16 + 2) * this.Field15) > this.Field2.size()) {
            var3 = this.Field2.size();
        }

        for (var2 = var2; var2 < var3; ++var2) {
            Class87 var4;
            if ((var4 = (Class87) this.Field2.elementAt(var2)) != null) {
                var1.setColor(Class804.Field49[0]);
                var1.drawRect(var2 % this.Field15 * this.Field16, var2 / this.Field15 * this.Field16, this.Field16, this.Field16);
                var4.Field1(var1, var2 % this.Field15 * this.Field16 + this.Field16 / 2, var2 / this.Field15 * this.Field16 + this.Field16 / 2);
            }
        }

        super.Field1(var1);
    }

    static Class665 Field1(Class794 var0) {
        return var0.Field17;
    }

    static void Field1(Class794 var0, String var1) {
        var0.Field18 = null;
    }

    static void Field1(Class794 var0, Class665 var1) {
        var0.Field17 = null;
    }
}
