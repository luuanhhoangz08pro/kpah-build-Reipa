package main.tab.tab2;

import main.lib.Graphics;

public final class Class564 extends Class275 {
    private String[] Field2;
    private static final int[] Field3;
    private int Field4 = 0;
    public boolean Field1 = true;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    private static int Field10;
    private static int Field11;
    private static int Field12;
    private static int Field13;
    private static int Field14;
    private static int Field15;
    private String[] Field16;
    private boolean Field17;
    private int Field18;

    public static void Field1(String var0) {
        if (var0.indexOf("Bạn muốn mua") != -1) {
            Class106.Field3[12] = true;
        }

    }

    public final void Field1(String var1, Class86 var2, Class86 var3, Class86 var4) {
        Field1(var1);
        Field2(var1);
        if (var1.indexOf("Bạn chỉ có thể vào lại game sau") != -1) {
            var2 = new Class86("OK", new Class751(Class106.Field1));
        }

        this.Field2 = Class21.Field8.Field1(var1, 100);
        this.Field103 = var2;
        this.Field104 = var3;
        this.Field105 = var4;
        this.Field1();
        this.Field7 = Field15;
        this.Field17 = false;
    }

    public final void Field1(String[] var1, Class86 var2, Class86 var3, Class86 var4) {
        this.Field2 = var1;
        this.Field103 = var2;
        this.Field104 = null;
        this.Field105 = null;
        this.Field1();
        this.Field7 = Field15;
        this.Field17 = false;
    }

    public final void Field1(String var1, String[] var2, Class86 var3, Class86 var4, Class86 var5) {
        this.Field2 = Class21.Field8.Field1(var1, Class106.Field13 - 60);
        this.Field103 = var3;
        this.Field104 = var4;
        this.Field105 = var5;
        this.Field16 = var2;
        this.Field1();
        this.Field7 = Field15;
        this.Field18 = var2.length * 20 + 20 * this.Field2.length;
        this.Field17 = true;
    }

    private void Field1() {
        this.Field8 = 90;
        this.Field6 = Class106.Field16 - 42;
        this.Field5 = 15;
        if (this.Field1) {
            this.Field8 -= 50;
            this.Field5 += 50;
        }

        this.Field9 = this.Field8;
        if (this.Field2.length * 13 < this.Field8) {
            this.Field5 += this.Field8 / 2 - this.Field2.length * 13 / 2;
            this.Field9 -= this.Field8 - this.Field2.length * 13;
        }

        if ((Field14 = this.Field2.length * 13 - this.Field8) < 0) {
            Field14 = 0;
        }

        Field15 = this.Field8 / 2 / 13;
    }

    public final void Field1(Graphics var1) {
        Class106.Field1(var1);
        var1.translate(0, this.Field6);
        int var2;
        if (this.Field17) {
            Graphics var3 = var1;
            Class564 var4 = this;
            Class106.Field1(var1);
            int var5 = Class106.Field16 - this.Field18 / 2 - 20;
            if (var5 <= 10) {
                var5 = 10;
            }

            Class811.Field3(var1, 20, var5, Class106.Field13 - 40, this.Field18 + 20);

            for (var2 = 0; var2 < var4.Field16.length; ++var2) {
                Class21.Field8.Field1(var3, var4.Field16[var2], Class106.Field15, var2 * 20 + 10 + var5, 2);
            }

            for (var2 = 0; var2 < var4.Field2.length; ++var2) {
                Class21.Field10[0].Field1(var3, var4.Field2[var2], Class106.Field15, var2 * 20 + (var4.Field16.length - 1) * 20 + 42 + var5 - 4, 2);
            }

            var3.translate(0, var4.Field6);
        } else {
            Class811.Field3(var1, Class106.Field15 - 70, 12, 140, 100);
            if (this.Field1) {
                var1.drawRegion(Class811.Field26, 0, 0, 25, 25, Field3[this.Field4], Class106.Field15, 47, 3);
            }

            var1.translate(0, this.Field5);
            var1.setClip(0, 0, Class106.Field13, this.Field9);
            var1.translate(0, -Field11);

            for (var2 = 0; var2 < this.Field2.length; ++var2) {
                Class21.Field8.Field1(var1, this.Field2[var2], Class106.Field15, var2 * 13, 2);
            }
        }

        super.Field1(var1);
    }

    public final void Field2() {
        ++this.Field4;
        if (this.Field4 > 3) {
            this.Field4 = 0;
        }

        boolean var1 = false;
        if (Class106.Field5[2]) {
            --this.Field7;
            if (this.Field7 < Field15) {
                this.Field7 = Field15;
            }

            var1 = true;
        } else if (Class106.Field5[8]) {
            var1 = true;
            if (Field11 < Field14) {
                ++this.Field7;
            }

            if (this.Field7 > this.Field2.length - Field15) {
                this.Field7 = this.Field2.length - Field15;
            }
        }

        if (var1) {
            Field10 = this.Field7 * 13 - this.Field8 / 2;
            if (Field10 < 0) {
                Field10 = 0;
            }

            if (Field10 > Field14) {
                Field10 = Field14;
            }
        }

        if (Field11 != Field10) {
            Field13 = Field10 - Field11 << 2;
            Field11 += (Field12 += Field13) >> 4;
            Field12 &= 15;
        }

        super.Field2();
    }

    static {
        int[] var0 = new int[]{0, 7, 3, 6};
        Field3 = var0;
        Field15 = 0;
    }

    public static void Field2(String var0) {
        if (var0.indexOf("Bạn muốn mua") != -1) {
            Class106.Field3[12] = true;
        }

    }
}
