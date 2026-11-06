package main.tab.tab1;

import main.lib.Graphics;

public final class Class303 extends Class51 {
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    private int Field10;
    private int Field11 = -1;
    public int Field2;
    public int Field3;
    private int[] Field12 = new int[]{16741818, 8388469, 7710463};
    private int Field13 = 0;

    public Class303(Class111 var1, Class111 var2, int var3, int var4, int var5, int var6) {
        this.Field6 = var1.Field193 + var3;
        this.Field7 = var1.Field194 + var4;
        this.Field2 = var2.Field193;
        this.Field3 = var2.Field194 - 28;
        this.Field8 = this.Field2 - this.Field6;
        this.Field9 = this.Field3 - this.Field7;
        this.Field4 = Class802.Field1(this.Field8, this.Field9);
        this.Field5 = 6;
        this.Field13 = var6;
        var2.Field1();
        Class74.Field1(var2.Field193, var2.Field194 + var2.Field16 - 10, 11);
        Class105.Field19.Field1("-" + var5, 0, var2.Field193, var2.Field194 + var2.Field16 - 15, 1, -2);
    }

    public Class303(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.Field6 = var1;
        this.Field7 = var2;
        this.Field2 = var3;
        this.Field3 = var4;
        this.Field8 = this.Field2 - var1;
        this.Field9 = this.Field3 - var2;
        this.Field4 = Class802.Field1(this.Field8, this.Field9);
        this.Field5 = 2;
        this.Field10 = 40;
    }

    public Class303(int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        this.Field6 = var1;
        this.Field7 = var2;
        this.Field2 = var3;
        this.Field3 = var4;
        this.Field8 = this.Field2 - var1;
        this.Field9 = this.Field3 - var2;
        this.Field4 = Class802.Field1(this.Field8, this.Field9);
        this.Field5 = 3;
        this.Field10 = 100;
        this.Field11 = var7;
    }

    public final void Field2() {
        if (this.Field11 >= 0) {
            --this.Field11;
        }

        if (this.Field10 >= 0) {
            --this.Field10;
        }

        if (this.Field10 <= 0) {
            --this.Field5;
        }

        if (this.Field5 <= 0) {
            super.Field1 = true;
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field11 < 0) {
            int var2;
            if (this.Field4 > 60 && this.Field4 < 120 || this.Field4 > 240 && this.Field4 < 300) {
                var1.setColor(this.Field12[this.Field13]);

                for (var2 = 0; var2 < this.Field5; ++var2) {
                    var1.drawLine(this.Field6 + var2, this.Field7, this.Field6 + var2 + this.Field8, this.Field7 + this.Field9);
                    var1.drawLine(this.Field6 - var2, this.Field7, this.Field6 - var2 + this.Field8, this.Field7 + this.Field9);
                }

                var1.setColor(16777215);

                for (var2 = 0; var2 < this.Field5 / 2; ++var2) {
                    var1.drawLine(this.Field6 + var2, this.Field7, this.Field6 + var2 + this.Field8, this.Field7 + this.Field9);
                    var1.drawLine(this.Field6 - var2, this.Field7, this.Field6 - var2 + this.Field8, this.Field7 + this.Field9);
                }

                return;
            }

            var1.setColor(this.Field12[this.Field13]);

            for (var2 = 0; var2 < this.Field5; ++var2) {
                var1.drawLine(this.Field6, this.Field7 + var2, this.Field6 + this.Field8, this.Field7 + this.Field9 + var2);
                var1.drawLine(this.Field6, this.Field7 - var2, this.Field6 + this.Field8, this.Field7 + this.Field9 - var2);
            }

            var1.setColor(16777215);

            for (var2 = 0; var2 < this.Field5 / 2; ++var2) {
                var1.drawLine(this.Field6, this.Field7 + var2, this.Field6 + this.Field8, this.Field7 + this.Field9 + var2);
                var1.drawLine(this.Field6, this.Field7 - var2, this.Field6 + this.Field8, this.Field7 + this.Field9 - var2);
            }
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class111 var6, Class111 var7) {
    }

    public final void Field1(int var1) {
    }

    public final void Field1() {
        --this.Field5;
        if (this.Field5 <= 0) {
            if (Class105.Field19.Field13.contains(this)) {
                Class105.Field19.Field13.removeElement(this);
            }

            if (Class63.Field12.contains(this)) {
                Class63.Field12.removeElement(this);
            }
        }

    }
}
