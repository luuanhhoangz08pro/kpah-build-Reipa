package main.tab.tab1;

import main.lib.Graphics;

final class Class316 extends Class173 {
    private int Field15;
    private int Field16;
    private int Field17 = 5;
    int Field1;
    private Class111 Field18;
    private int[] Field19 = new int[]{0, 0, 24, 24};

    public Class316(Class631 var1, int var2, int var3, Class111 var4) {
        this.Field15 = Class105.Field1(var2 - 15, var2 + 15);
        this.Field16 = Class105.Field1(var3 - 20, var3 + 20);
        this.Field18 = var4;
    }

    public final void Field1() {
        this.Field16 += this.Field17;
        this.Field17 += 2;
        if (this.Field16 > this.Field18.Field194 - 15) {
            Class74.Field2.removeElement(this);
            Class74.Field1(this.Field15, this.Field16 - 5, 30);
        }

        if (this.Field1 != 0) {
            Class105.Field19.Field1("-" + this.Field1, 0, this.Field15, this.Field16 - 15, 1, -2);
        } else {
            Class105.Field19.Field1("MISS", 0, this.Field15, this.Field16 - 15, 1, -2);
        }
    }

    public final void Field1(Graphics var1) {
        if (Class804.Field3(4) != null) {
            var1.drawRegion(Class804.Field3(4), this.Field19[0], this.Field19[1], this.Field19[2], this.Field19[3], 5, this.Field15, this.Field16, 3);
        }

    }
}
