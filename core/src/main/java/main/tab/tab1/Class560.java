package main.tab.tab1;

import main.lib.Graphics;

final class Class560 extends Class173 {
    private int Field1;
    private int Field15;
    private int Field16;
    private byte Field17;
    private byte Field18;
    private boolean Field19;
    private Class662 Field20;

    public Class560(Class662 var1, int var2, int var3) {
        this.Field20 = var1;
        this.Field1 = 0;
        this.Field17 = 0;
        this.Field18 = 10;
        var3 -= 10;
        this.Field15 = var2;
        this.Field16 = var3;
        super.Field5 = var2 + 50;
        super.Field6 = var3 - 150;
        this.Field18 = (byte) (5 + Class804.Field13(10));
        this.Field1 = Class802.Field1(var2 - super.Field5, -(var3 - super.Field6));
    }

    public final void Field1() {
        if (!this.Field19) {
            int var1 = this.Field18 * Class802.Field2(this.Field1) >> 10;
            int var2 = -(this.Field18 * Class802.Field1(this.Field1)) >> 10;
            this.Field18 = (byte) (this.Field18 + 2);
            super.Field5 += var1;
            super.Field6 += var2;
            if (Class802.Field1(super.Field5, super.Field6, this.Field15, this.Field16) <= 20) {
                super.Field6 = this.Field16;
                this.Field17 = 4;
                this.Field19 = true;
                Class74.Field1.addElement(this);
                Class74.Field2.removeElement(this);
                return;
            }
        } else {
            ++this.Field17;
            if (this.Field17 >= 12) {
                Class74.Field1.removeElement(this);
            }
        }

    }

    public final void Field1(Graphics var1) {
        var1.drawRegion(this.Field20.Field6, 0, 15 * (this.Field17 / 3), 13, 15, 0, super.Field5, super.Field6, 3);
    }
}
