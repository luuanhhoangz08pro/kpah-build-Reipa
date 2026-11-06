package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Vector;

public final class Class225 extends Class177 {
    private Class270 Field16;
    private int Field17 = 7;
    private int Field18 = -1;
    private int Field19;
    private int Field20;
    private int Field21;
    private int Field22;
    private int Field23;
    private int Field24;
    private int Field25;
    private int Field26;
    private int Field27;
    private int Field28;
    private Vector Field29 = new Vector();
    public String[] Field1;
    private Class114 Field30;
    boolean Field15;

    public Class225(int var1, int var2, Class114 var3, Class114 var4, byte var5) {
        super.Field8 = var5;
        this.Field30 = var4;
        this.Field16 = new Class270();
        this.Field23 = var1;
        this.Field24 = var2;
        if (var5 == 5) {
            this.Field23 = var4.Field193;
            this.Field24 = var4.Field194;
            var4.Field193 = (short) this.Field23;
            var4.Field194 = (short) (this.Field24 - 200);
            this.Field30 = var4;
            this.Field16.Field1(var5, this.Field23, this.Field24, var4.Field12, var4);
            var1 = Class809.Field1(this.Field23 - super.Field5, -(this.Field24 - super.Field6));
            this.Field16.Field1(Class809.Field3(var1 - 45));
        } else {
            this.Field16.Field1(var5, var1, var2, var3.Field12, var4);
            var1 = Class809.Field1(var1 - super.Field5, -(var2 - super.Field6));
            this.Field16.Field1(Class809.Field3(var1 - 180));
        }

        this.Field1 = new String[2];
    }

    public final void Field1() {
        if (this.Field16 != null) {
            this.Field16.Field1();
            if (this.Field16.Field9) {
                if (super.Field8 != 5) {
                    Class73.Field2(this.Field16.Field1, this.Field16.Field2, super.Field8 == 4 ? 30 : 28);
                }

                Class73.Field2.removeElement(this);
                this.Field30.Field1();
                if (this.Field1[0] != null) {
                    Class106.Field19.Field1(this.Field1[0], 0, super.Field5, super.Field6 - 15, 1, -2);
                }

                if (this.Field1[1] != null) {
                    Class106.Field19.Field1(this.Field1[1], 0, super.Field5, super.Field6 - 15, 2, -2);
                    return;
                }
            } else {
                super.Field5 = this.Field16.Field1;
                super.Field6 = this.Field16.Field2;
                int var1;
                int var2 = Class809.Field3((var1 = Class809.Field1(this.Field23 - super.Field5, -(this.Field24 - super.Field6))) + 90);
                int var3 = this.Field17 * Class809.Field2(var2) >> 10;
                var2 = -(this.Field17 * Class809.Field1(var2)) >> 10;
                this.Field19 = super.Field5 + var3;
                this.Field20 = super.Field6 + var2;
                var2 = Class809.Field3(var1 - 90);
                var3 = this.Field17 * Class809.Field2(var2) >> 10;
                var2 = -(this.Field17 * Class809.Field1(var2)) >> 10;
                this.Field21 = super.Field5 + var3;
                this.Field22 = super.Field6 + var2;
                if (super.Field8 == 5 && this.Field15) {
                    var2 = Class809.Field3(var1 + 135);
                    var3 = this.Field17 * Class809.Field2(var2) >> 10;
                    var2 = -(this.Field17 * Class809.Field1(var2)) >> 10;
                    this.Field25 = super.Field5 + var3 + 10;
                    this.Field26 = super.Field6 + var2 - 10;
                    var1 = Class809.Field3(var1 - 135);
                    var2 = this.Field17 * Class809.Field2(var1) >> 10;
                    var1 = -(this.Field17 * Class809.Field1(var1)) >> 10;
                    this.Field27 = super.Field5 + var2 + 10;
                    this.Field28 = super.Field6 + var1 - 10;
                }

                this.Field17 += this.Field18 * 3;
                if (Class809.Field4(this.Field17) > 9) {
                    this.Field18 = -this.Field18;
                }

                Class384 var6 = new Class384(this.Field19, this.Field20, 0);
                this.Field29.addElement(var6);
                Class384 var5 = new Class384(this.Field21, this.Field22, 0);
                this.Field29.addElement(var5);
                if (super.Field8 == 5 && this.Field15) {
                    var6 = new Class384(this.Field25, this.Field26, 0);
                    this.Field29.addElement(var6);
                    Class384 var4 = new Class384(this.Field27, this.Field28, 0);
                    this.Field29.addElement(var4);
                }

                this.Field23 = super.Field5;
                this.Field24 = super.Field6;
            }
        }

    }

    public final void Field1(Graphics var1) {
        int var2;
        Class384 var3;
        if (super.Field8 == 4) {
            for (var2 = 0; var2 < this.Field29.size(); ++var2) {
                var3 = (Class384) this.Field29.elementAt(var2);
                Class811.Field1(var1, 29, 0, (17 - var3.Field3) * 11, 11, 11, var3.Field1, var3.Field2, 3);
                ++var3.Field3;
                if (var3.Field3 >= 18) {
                    this.Field29.removeElement(var3);
                }
            }
        } else {
            for (var2 = 0; var2 < this.Field29.size(); ++var2) {
                var3 = (Class384) this.Field29.elementAt(var2);
                Class811.Field1(var1, 8, 0, var3.Field3 * 10, 10, 10, var3.Field1, var3.Field2, 3);
                ++var3.Field3;
                if (var3.Field3 >= 10) {
                    this.Field29.removeElement(var3);
                }
            }
        }

        if (Class811.Field3(super.Field8) != null && !this.Field16.Field9) {
            Image var4;
            if (super.Field8 == 5) {
                if ((var4 = Class811.Field3(3)) != null) {
                    var1.drawRegion(var4, 0, this.Field16.Field7 * 24, 24, 24, this.Field16.Field8, this.Field19, this.Field20, 3);
                    var1.drawRegion(var4, 0, this.Field16.Field7 * 24, 24, 24, this.Field16.Field8, this.Field21, this.Field22, 3);
                    if (this.Field15) {
                        var1.drawRegion(var4, 0, this.Field16.Field7 * 24, 24, 24, this.Field16.Field8, this.Field25, this.Field26, 3);
                        var1.drawRegion(var4, 0, this.Field16.Field7 * 24, 24, 24, this.Field16.Field8, this.Field27, this.Field28, 3);
                        return;
                    }
                }
            } else if ((var4 = Class811.Field3(super.Field8)) != null) {
                var1.drawRegion(var4, 0, this.Field16.Field7 * 24, 24, 24, this.Field16.Field8, this.Field19, this.Field20, 3);
                var1.drawRegion(var4, 0, this.Field16.Field7 * 24, 24, 24, this.Field16.Field8, this.Field21, this.Field22, 3);
            }
        }

    }
}
