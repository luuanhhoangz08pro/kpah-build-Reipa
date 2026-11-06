package main.tab.tab2;

import main.lib.Graphics;

public final class Class744 extends Class177 {
    private Class114 Field1;
    private int Field15;
    private int Field16;

    public Class744(Class114 var1, int var2, int var3) {
        this.Field1 = var1;
        super.Field5 = var2;
        super.Field6 = var3;
    }

    public final void Field1() {
        this.Field15 = Class809.Field1(this.Field1.Field193 - super.Field5, -(this.Field1.Field194 - super.Field6));
        int var1 = 10 * Class809.Field2(Class809.Field3(this.Field15)) >> 10;
        int var2 = -(10 * Class809.Field1(Class809.Field3(this.Field15))) >> 10;
        super.Field5 += var1;
        super.Field6 += var2;
        if (Class809.Field1(super.Field5, super.Field6, this.Field1.Field193, this.Field1.Field194) <= 20) {
            Class73.Field1(this.Field1.Field193, this.Field1.Field194 - 10, 30);
            Class73.Field2.removeElement(this);
        }

    }

    public final void Field1(Graphics var1) {
        Class811.Field1(var1, 19, 0, this.Field16 % 3 * 14, 25, 14, super.Field5, super.Field6, 3);
        ++this.Field16;
    }
}
