package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

public final class Class285 extends Class173 {
    private int Field1 = 120;
    private byte Field15 = 0;
    private byte Field16 = 5;
    private byte Field17 = 10;
    private byte Field18;
    private byte[] Field19 = new byte[]{0, 1, 2, 3};
    private int Field20;

    public Class285(int var1, int var2, int var3) {
        super.Field5 = var1;
        super.Field6 = var2;
        this.Field17 = (byte) Class105.Field1(5, 20);
        Class173 var4;
        (var4 = new Class173(var1, var2, 34)).Field12 = 3;
        Class74.Field2(var4);
        this.Field20 = var3;
    }

    public final void Field1() {
        ++this.Field18;
        if (this.Field18 > this.Field19.length - 1) {
            this.Field18 = 0;
        }

        this.Field15 = this.Field19[this.Field18];
        if (this.Field17 > 0) {
            --this.Field17;
        }

        if (this.Field17 <= 0 && this.Field1 > 0) {
            this.Field1 -= this.Field16;
            this.Field16 = (byte) (this.Field16 + 8);
            if (this.Field1 < 0) {
                this.Field1 = 0;
                Class74.Field2.removeElement(this);
                Class74.Field1.addElement(this);
            }
        }

        if (this.Field1 == 0 && Class105.Field12 % 2 == 1) {
            Class74.Field2(super.Field5, super.Field6, 62);
            Class74.Field1.removeElement(this);
            Class105.Field19.Field1("- " + this.Field20, 0, super.Field5, super.Field6 - 25, 1, -2);
        }

    }

    public final void Field1(Graphics var1) {
        Image var2;
        if ((var2 = Class804.Field4(61)) != null) {
            var1.drawRegion(var2, 0, this.Field15 * Class173.Field4[61], Class173.Field3[61], Class173.Field4[61], 0, super.Field5, super.Field6 - this.Field1, 3);
        }

    }
}
