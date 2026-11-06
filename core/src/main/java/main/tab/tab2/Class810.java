package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class810 extends Class177 {
    private short Field1;
    private short Field15 = 10;
    private short Field16;
    private short Field17;
    private short Field18;
    private short Field19;
    private short Field20;
    private short Field21;
    private short Field22;
    private short Field23;
    private short Field24;
    private short Field25;
    private int Field26;
    private int Field27;
    private int Field28;
    private int[] Field29 = new int[]{0, 2, 4};

    public Class810(int var1, int var2, int var3, int var4, int var5) {
        this.Field26 = var5;
        if (var1 < var3) {
            this.Field25 = 1;
        } else {
            this.Field25 = -1;
        }

        this.Field22 = (short) var1;
        this.Field23 = (short) var2;
        super.Field5 = this.Field20 = (short) var3;
        super.Field6 = this.Field21 = (short) var4;
        this.Field1 = (short) Class809.Field1(var1 - var3, -(var2 - var4));
        this.Field24 = this.Field1;
        int var6 = (var5 = Class809.Field1(var1, var2, var3, var4)) / 2 * Class809.Field2(Class809.Field3(this.Field1)) >> 10;
        int var7 = -(var5 / 2 * Class809.Field1(Class809.Field3(this.Field1))) >> 10;
        int var8 = Class809.Field3(this.Field1 + 90 * this.Field25);
        var5 /= 3;
        boolean var9 = false;
        int var10;
        if (this.Field24 < 180) {
            var10 = Class809.Field4(this.Field24 - 90) / 2;
        } else {
            var10 = Class809.Field4(this.Field24 - 270) / 2;
        }

        var10 = (var5 += 45 - var10) * Class809.Field2(Class809.Field3(var8)) >> 10;
        var5 = -(var5 * Class809.Field1(Class809.Field3(var8))) >> 10;
        this.Field16 = (short) (var3 + var6 + var10);
        this.Field17 = (short) (var4 + var7 + var5);
        this.Field18 = (short) Class809.Field1(this.Field16, this.Field17, var3, var4);
        this.Field1 = (short) Class809.Field1(var3 - this.Field16, -(var4 - this.Field17));
        this.Field19 = (short) Class809.Field1(var1 - this.Field16, -(var2 - this.Field17));
    }

    public final void Field1() {
        this.Field1 = (short) Class809.Field3(this.Field1 + this.Field15 * this.Field25);
        int var1 = this.Field18 * Class809.Field2(Class809.Field3(this.Field1)) >> 10;
        int var2 = -(this.Field18 * Class809.Field1(Class809.Field3(this.Field1))) >> 10;
        this.Field27 = super.Field5;
        this.Field28 = super.Field6;
        if (super.Field8 != 1) {
            super.Field5 = this.Field16 + var1;
        }

        super.Field6 = this.Field17 + var2;
        if ((var1 = Class809.Field1(this.Field27, this.Field28, super.Field5, super.Field6)) > 10) {
            this.Field15 = (short) (10 - var1 % 10 / 2);
        }

        if (Class809.Field4(this.Field1 - this.Field19) < this.Field15) {
            if (super.Field8 != 1) {
                if (this.Field26 != 0) {
                    Class106.Field19.Field1("-" + this.Field26, 0, this.Field22, this.Field23 - 45, 1, -2);
                } else {
                    Class106.Field19.Field1("MISS", 0, this.Field22, this.Field23 - 45, 1, -2);
                }
            }

            Class73.Field1(this.Field22, this.Field23 - 10, 12);
            Class824 var3 = null;
            if (super.Field8 != 1) {
                var3 = new Class824(this.Field22, this.Field23, 28, 3, 32, 31, false, false);
                Class73.Field1.addElement(var3);
            } else {
                var3 = new Class824(this.Field22, this.Field23, 28, 3, 32, 31, false, true);
                Class73.Field2.addElement(var3);
                Class73.Field1(this.Field22, this.Field23, 48);
            }

            Class73.Field2.removeElement(this);
            if (super.Field8 == 1) {
                Class73.Field1.addElement(new Class266(this.Field22, this.Field23, (Vector) null));
            }
        }

    }

    public final void Field1(Graphics var1) {
        int var2;
        int var3 = (var2 = Class809.Field1(this.Field20, this.Field21, super.Field5, super.Field6)) * Class809.Field2(Class809.Field3(this.Field24)) >> 10;
        var2 = -(var2 * Class809.Field1(Class809.Field3(this.Field24))) >> 10;
        var1.drawImage(Class811.Field10, this.Field20 + var3, this.Field21 + var2, 3);
        if (super.Field8 == 1) {
            var1.drawImage(Class811.Field23, super.Field5, super.Field6, 3);
        } else {
            for (var2 = 0; var2 < 3; ++var2) {
                Class811.Field1(var1, 4, 0, this.Field29[var2] * 14, 14, 14, super.Field5 + Class811.Field13(10) - 5, super.Field6 + Class811.Field13(10) - 10, 3);
                int var10002 = this.Field29[var2]++;
                if (this.Field29[var2] >= 5) {
                    this.Field29[var2] = 0;
                }
            }

        }
    }
}
