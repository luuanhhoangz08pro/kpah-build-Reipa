package main.tab.tab2;

import main.lib.Graphics;

final class Class314 extends Class177 {
    private int Field15;
    private int Field16;
    private int Field17 = 5;
    int Field1;
    private Class114 Field18;
    private int[] Field19 = new int[]{0, 0, 24, 24};

    public Class314(Class636 var1, int var2, int var3, Class114 var4) {
        this.Field15 = Class106.Field1(var2 - 15, var2 + 15);
        this.Field16 = Class106.Field1(var3 - 20, var3 + 20);
        this.Field18 = var4;
    }

    public final void Field1() {
        this.Field16 += this.Field17;
        this.Field17 += 2;
        if (this.Field16 > this.Field18.Field194 - 15) {
            Class73.Field2.removeElement(this);
            Class73.Field1(this.Field15, this.Field16 - 5, 30);
        }

        if (this.Field1 != 0) {
            Class106.Field19.Field1("-" + this.Field1, 0, this.Field15, this.Field16 - 15, 1, -2);
        } else {
            Class106.Field19.Field1("MISS", 0, this.Field15, this.Field16 - 15, 1, -2);
        }
    }

    public final void Field1(Graphics var1) {
        if (Class811.Field3(4) != null) {
            var1.drawRegion(Class811.Field3(4), this.Field19[0], this.Field19[1], this.Field19[2], this.Field19[3], 5, this.Field15, this.Field16, 3);
        }

    }
}
