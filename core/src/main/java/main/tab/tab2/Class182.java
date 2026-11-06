package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class182 extends Class177 {
    private int[] Field1;
    private int[] Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;
    private int Field20;
    private int Field21;
    private int Field22;
    private int Field23;
    private byte Field24;
    private byte Field25;
    private int Field26;
    private boolean Field27;
    private short Field28;
    private Class114 Field29 = null;

    public Class182(int var1, int var2, int var3, int var4, Class114 var5, int var6) {
        this.Field29 = var5;
        super.Field5 = var1;
        super.Field6 = var2 + 30;
        this.Field21 = var3;
        this.Field22 = var4;
        this.Field23 = 15;
        this.Field20 = var2 - 60;
        this.Field26 = var6;
        Class182 var7 = this;
        this.Field16 = this.Field21 - super.Field5;
        this.Field17 = this.Field22 - this.Field20;
        if ((var2 = (Math.abs(this.Field16) + Math.abs(this.Field17)) / 20) < 2) {
            var2 = 2;
        }

        this.Field1 = new int[var2];
        this.Field15 = new int[var2];

        for (var3 = 0; var3 < var2; ++var3) {
            var7.Field1[var3] = var7.Field5 + var3 * var7.Field16 / var2;
            var7.Field15[var3] = var7.Field20 + var3 * var7.Field17 / var2;
        }

        this.Field28 = 55;
    }

    public final void Field1(Graphics var1) {
        if (this.Field26 < 0) {
            Image var2;
            if (super.Field6 > this.Field20 && (var2 = Class811.Field4(this.Field28)) != null) {
                var1.drawRegion(var2, 0, this.Field25 * var2.getHeight() / 2, var2.getWidth(), var2.getHeight() / 2, 0, super.Field5, super.Field6, 3);
            }

            if (this.Field27 && (var2 = Class811.Field3(this.Field23)) != null) {
                var1.drawRegion(var2, 0, this.Field24 * Class804.Field3[1][this.Field23], Class804.Field3[0][this.Field23], Class804.Field3[1][this.Field23], 0, this.Field1[this.Field18], this.Field15[this.Field18], 3);
            }
        }

    }

    public final void Field1() {
        this.Field24 = (byte) ((this.Field24 + 1) % 3);
        this.Field25 = (byte) ((this.Field25 + 1) % 2);
        if (this.Field26 >= 0) {
            --this.Field26;
        }

        if (this.Field26 < 0) {
            if (super.Field6 > this.Field20) {
                super.Field6 -= 10;
            }

            if (super.Field6 <= this.Field20 && this.Field19 <= 6) {
                ++this.Field19;
            }

            if (this.Field19 == 2) {
                Class73.Field1(super.Field5, super.Field6, 54);
            }

            if (this.Field19 >= 6 && !this.Field27) {
                this.Field27 = true;
            }

            if (this.Field19 > 6 && this.Field18 < this.Field1.length) {
                ++this.Field18;
            }

            if (this.Field18 >= this.Field1.length) {
                this.Field18 = this.Field1.length - 1;
                this.Field1[this.Field18] = this.Field21;
                this.Field15[this.Field18] = this.Field22;
                Class73.Field2(this.Field21, this.Field22, 53);
                super.Field10 = true;
                if (this.Field29 != null && this.Field29.Field18 != 0 && this.Field29.Field18 != 2000000) {
                    Class106.Field19.Field1("-" + this.Field29.Field18, 0, this.Field29.Field193, this.Field29.Field194 + this.Field29.Field16 - 15, 1, -2);
                }
            }
        }

    }
}
