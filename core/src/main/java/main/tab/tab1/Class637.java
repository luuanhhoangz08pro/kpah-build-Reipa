package main.tab.tab1;

import main.lib.Graphics;

public final class Class637 extends Class173 {
    private int Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private byte Field18;

    public Class637(int var1, int var2, int var3) {
        this.Field1 = var1;
        this.Field15 = var2;
        super.Field5 = var1 - 100;
        super.Field6 = var2 - 200;
        this.Field16 = 1;
        this.Field17 = var3;
    }

    public final void Field1() {
        ++this.Field16;
        Class74.Field1(super.Field5, super.Field6, 32);
        int var1 = Class802.Field1(this.Field1 - super.Field5, -(this.Field15 - super.Field6));
        int var2 = this.Field16 * Class802.Field2(var1) >> 10;
        var1 = -(this.Field16 * Class802.Field1(var1)) >> 10;
        super.Field5 += var2;
        super.Field6 += var1;
        if (Class802.Field1(super.Field5, super.Field6, this.Field1, this.Field15) <= this.Field16) {
            if (this.Field17 != 2000000) {
                Class105.Field19.Field1("-" + this.Field17, 0, super.Field5, super.Field6 - 15, 1, -2);
            }

            Class74.Field2.removeElement(this);
            Class816 var3 = new Class816(this.Field1, this.Field15, 28, 3, 32, 31, false, false);
            Class74.Field1.addElement(var3);
        }

    }

    public final void Field1(Graphics var1) {
        Class804.Field1(var1, 31, 0, this.Field18 / 3 * 20, 20, 20, super.Field5, super.Field6, 3);
        ++this.Field18;
        if (this.Field18 >= 6) {
            this.Field18 = 0;
        }

    }
}
