package main.tab.tab1;

import main.lib.Graphics;

public final class Class737 extends Class173 {
    private Class111 Field1;
    private int Field15;
    private int Field16;

    public Class737(Class111 var1, int var2, int var3) {
        this.Field1 = var1;
        super.Field5 = var2;
        super.Field6 = var3;
    }

    public final void Field1() {
        this.Field15 = Class802.Field1(this.Field1.Field193 - super.Field5, -(this.Field1.Field194 - super.Field6));
        int var1 = 10 * Class802.Field2(Class802.Field3(this.Field15)) >> 10;
        int var2 = -(10 * Class802.Field1(Class802.Field3(this.Field15))) >> 10;
        super.Field5 += var1;
        super.Field6 += var2;
        if (Class802.Field1(super.Field5, super.Field6, this.Field1.Field193, this.Field1.Field194) <= 20) {
            Class74.Field1(this.Field1.Field193, this.Field1.Field194 - 10, 30);
            Class74.Field2.removeElement(this);
        }

    }

    public final void Field1(Graphics var1) {
        Class804.Field1(var1, 19, 0, this.Field16 % 3 * 14, 25, 14, super.Field5, super.Field6, 3);
        ++this.Field16;
    }
}
