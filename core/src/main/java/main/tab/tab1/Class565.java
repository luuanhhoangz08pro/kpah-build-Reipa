package main.tab.tab1;

import main.lib.Graphics;

public final class Class565 extends Class173 {
    private int Field1;
    private int Field15 = 0;
    private int Field16 = 0;
    private int[] Field17;
    private int[] Field18;
    private int Field19;
    private int Field20;
    private int Field21;
    private byte Field22;

    public Class565(int var1, int var2, int var3, int var4) {
        super.Field5 = var1;
        super.Field6 = var2;
        this.Field1 = var3;
        this.Field15 = var4;
        Class565 var5 = this;
        this.Field19 = this.Field1 - super.Field5;
        this.Field20 = this.Field15 - super.Field6;
        Class802.Field1(this.Field19, this.Field20);
        if ((var2 = (Math.abs(this.Field19) + Math.abs(this.Field20)) / 20) < 2) {
            var2 = 2;
        }

        this.Field17 = new int[var2];
        this.Field18 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            var5.Field17[var3] = var5.Field5 + var3 * var5.Field19 / var2;
            var5.Field18[var3] = var5.Field6 + var3 * var5.Field20 / var2;
        }

        this.Field21 = 10;
    }

    public final void Field1(Graphics var1) {
        if (Class804.Field3(10) != null) {
            var1.drawRegion(Class804.Field3(10), 0, this.Field22 * Class797.Field3[1][10], Class797.Field3[0][10], Class797.Field3[1][10], 0, this.Field17[this.Field16], this.Field18[this.Field16], 3);
        }

    }

    public final void Field1() {
        if (this.Field21 >= 0) {
            --this.Field21;
        }

        ++this.Field22;
        if (this.Field22 >= 3) {
            this.Field22 = 0;
        }

        if (this.Field21 < 0) {
            if (this.Field16 < this.Field17.length) {
                ++this.Field16;
            }

            if (this.Field16 >= this.Field17.length) {
                this.Field16 = this.Field17.length - 1;
                this.Field17[this.Field16] = this.Field1;
                this.Field18[this.Field16] = this.Field15;
                super.Field10 = true;
            }
        }

    }
}
