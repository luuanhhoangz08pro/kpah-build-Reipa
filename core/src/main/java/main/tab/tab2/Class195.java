package main.tab.tab2;

import main.lib.Graphics;

public final class Class195 extends Class177 {
    private int Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;
    private int Field20;
    private short Field21;
    private short Field22;
    private short Field23;
    private short Field24;
    private Class114 Field25;
    private boolean Field26;
    private boolean Field27;
    private int Field28;
    private int Field29;
    private byte[] Field30 = new byte[]{0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3};
    private byte Field31;

    public Class195(int var1, int var2, Class114 var3) {
        super.Field5 = var1;
        super.Field6 = var2;
        this.Field25 = var3;
        this.Field18 = var3.Field193;
        this.Field19 = var3.Field194;
        this.Field20 = 17;
        this.Field21 = 12;
        this.Field19 += 5;
        this.Field22 = 1;
    }

    public final void Field1(Graphics var1) {
        if (Class811.Field3(this.Field20) != null) {
            var1.drawRegion(Class811.Field3(this.Field20), 0, this.Field17 * Class804.Field3[1][this.Field20], Class804.Field3[0][this.Field20], Class804.Field3[1][this.Field20], 0, super.Field5, super.Field6, 3);
        }

    }

    public final void Field1() {
        ++this.Field31;
        if (this.Field31 > this.Field30.length - 1) {
            this.Field31 = 0;
        }

        this.Field17 = this.Field30[this.Field31];
        if (this.Field25 != null) {
            this.Field18 = this.Field25.Field193;
            this.Field19 = this.Field25.Field194;
        }

        this.Field1 = (short) (this.Field18 - super.Field5);
        this.Field15 = (short) (this.Field19 - (this.Field22 >> 1) - super.Field6);
        this.Field16 = Class809.Field1(this.Field1, this.Field15);
        this.Field23 = (short) (this.Field21 * Class809.Field2(this.Field16) >> 10);
        this.Field24 = (short) (this.Field21 * Class809.Field1(this.Field16) >> 10);
        super.Field5 += this.Field23;
        super.Field6 += this.Field24;
        this.Field28 = Class809.Field4(super.Field5 - this.Field18);
        this.Field29 = Class809.Field4(super.Field6 - this.Field19);
        if (this.Field28 <= this.Field23) {
            super.Field5 = (short) this.Field18;
            this.Field26 = true;
        }

        if (this.Field29 < this.Field24) {
            super.Field6 = (short) this.Field19;
            this.Field27 = true;
        }

        if (this.Field26 && this.Field27 || Class811.Field1(super.Field5, super.Field6, this.Field18, this.Field19) <= 10) {
            super.Field5 = this.Field18;
            super.Field6 = this.Field19;
            Class73.Field1(super.Field5, super.Field6, 48);
            super.Field10 = true;
            Class106.Field19.Field1("-" + this.Field25.Field18, 0, this.Field25.Field193, this.Field25.Field194 + this.Field25.Field16 - 15, 1, -2);
            this.Field25.Field1();
        }

        if (super.Field5 != this.Field18 && super.Field6 != this.Field19 && Class106.Field12 % 2 == 0) {
            Class73.Field2(super.Field5, super.Field6 - 5, 15);
        }

    }
}
