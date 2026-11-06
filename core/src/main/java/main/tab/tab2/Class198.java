package main.tab.tab2;

import main.lib.Graphics;

public final class Class198 extends Class177 {
    private int Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;
    private int Field20;
    private int Field21;
    private Class114 Field22;
    private int Field23;
    private int Field24;
    private int Field25;
    private int Field26;

    public Class198(Class114 var1, int var2, int var3, int var4) {
        this.Field22 = var1;
        this.Field20 = var2;
        if (var2 == 0) {
            super.Field5 = var1.Field193 - (var3 == 0 ? 100 : 20);
            super.Field6 = var1.Field194 - 100 - (var3 == 0 ? 0 : 100);
            this.Field1 = var1.Field193 + (var3 == 0 ? 0 : -20);
        } else if (var2 == 1) {
            super.Field5 = var1.Field193 + (var3 == 0 ? 100 : -10);
            super.Field6 = var1.Field194 - 100 - (var3 == 0 ? 0 : 100);
            this.Field1 = var1.Field193 + (var3 == 0 ? 0 : -10);
        } else if (var2 == 2) {
            super.Field5 = var1.Field193 + (var3 == 0 ? 100 : 10);
            super.Field6 = var1.Field194 + (var3 == 0 ? 100 : -200);
            this.Field1 = var1.Field193 + (var3 == 0 ? 0 : 10);
        } else {
            super.Field5 = var1.Field193 - (var3 == 0 ? 100 : 20);
            super.Field6 = var1.Field194 + (var3 == 0 ? 100 : -200);
            this.Field1 = var1.Field193 + (var3 == 0 ? 0 : 20);
        }

        this.Field15 = var1.Field194;
        this.Field21 = var3;
        this.Field19 = Class809.Field1(super.Field5 - var1.Field193, var1.Field194 - (var1.Field195 >> 1) - super.Field6);
        this.Field16 = var4;
        this.Field17 = var4 * Class809.Field2(this.Field19) >> 10;
        this.Field18 = var4 * Class809.Field1(this.Field19) >> 10;
        this.Field25 = var1.Field195;
    }

    public final void Field1() {
        if (this.Field22 != null) {
            int var10002;
            boolean var10003;
            if (this.Field20 == 0) {
                this.Field1 = this.Field22.Field193 + (this.Field21 == 0 ? -4 : -20);
                var10002 = this.Field21;
                var10003 = true;
                this.Field15 = this.Field22.Field194;
            } else if (this.Field20 == 1) {
                this.Field1 = this.Field22.Field193 + (this.Field21 == 0 ? 8 : -10);
                var10002 = this.Field21;
                var10003 = true;
                this.Field15 = this.Field22.Field194;
            } else if (this.Field20 == 2) {
                this.Field1 = this.Field22.Field193 + (this.Field21 == 0 ? 4 : 10);
                var10002 = this.Field21;
                var10003 = true;
                this.Field15 = this.Field22.Field194;
            } else {
                this.Field1 = this.Field22.Field193 + (this.Field21 == 0 ? -8 : 20);
                var10002 = this.Field21;
                var10003 = true;
                this.Field15 = this.Field22.Field194;
            }
        }

        this.Field23 = this.Field1 - super.Field5;
        this.Field24 = this.Field15 - (this.Field25 >> 1) - super.Field6;
        this.Field19 = Class809.Field1(this.Field23, this.Field24);
        this.Field17 = this.Field16 * Class809.Field2(this.Field19) >> 10;
        this.Field18 = this.Field16 * Class809.Field1(this.Field19) >> 10;
        super.Field5 += this.Field17;
        super.Field6 += this.Field18;
        Class73.Field2(super.Field5, super.Field6, this.Field21 == 0 ? 32 : 29);
        if (Class811.Field1(super.Field5 - 20, super.Field5 + 20, this.Field1 - this.Field25 / 2, this.Field1 + this.Field25 / 2, super.Field6 - 20, super.Field6 + 20, this.Field15 - this.Field25 / 2, this.Field15 + this.Field25 / 2)) {
            Class73.Field1(this.Field1, this.Field15 - 10, this.Field21 == 0 ? 38 : 30);
            Class73.Field2.removeElement(this);
            if (this.Field22 != null) {
                int var1 = this.Field22.Field18;
                this.Field22.Field12();
                Class106.Field19.Field1("-" + var1, 0, this.Field22.Field193, this.Field22.Field194 + this.Field22.Field16 - 15, 1, -2);
            }
        }

        if (this.Field21 != 1) {
            if (this.Field20 == 0) {
                this.Field26 = 0;
                return;
            }

            if (this.Field20 == 1) {
                this.Field26 = 2;
                return;
            }

            if (this.Field20 == 3) {
                this.Field26 = 1;
                return;
            }

            this.Field26 = 7;
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field21 == 1) {
            if (Class811.Field3(4) != null) {
                var1.drawRegion(Class811.Field3(4), 0, 0, 24, 24, 5, super.Field5, super.Field6, 3);
                return;
            }
        } else if (Class811.Field4(31) != null) {
            var1.drawRegion(Class811.Field4(31), 0, 0, 20, 20, this.Field26, super.Field5, super.Field6, 3);
        }

    }
}
