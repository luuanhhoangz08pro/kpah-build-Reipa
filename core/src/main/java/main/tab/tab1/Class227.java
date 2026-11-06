package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class227 extends Class173 {
    private int Field1 = 0;
    private byte Field15 = 0;
    private static int[] Field16 = new int[]{15006715, 11598072, 7994363, 4062203, 16383610, 16682106};
    private Vector Field17 = new Vector();
    private boolean Field18 = false;
    private boolean Field19 = false;

    public Class227(int var1, int var2, short var3, byte var4, boolean var5) {
        this.Field18 = var5;
        super.Field5 = var1;
        super.Field6 = var2;
        super.Field8 = var3;
        this.Field15 = var4;
        this.Field19 = false;
    }

    public final void Field1() {
        if (super.Field8 != 0 && super.Field5 + 20 > Class63.Field8 && super.Field5 - 20 < Class63.Field8 + Class105.Field13 && super.Field6 > Class63.Field9 && super.Field6 < Class63.Field9 + Class105.Field14) {
            for (int var1 = 0; var1 < 2; ++var1) {
                int var2 = Class804.Field13(360);
                int var3 = 18 * Class802.Field2(Class802.Field3(var2)) >> 10;
                var2 = (var2 = -(18 * Class802.Field1(Class802.Field3(var2))) >> 10) - var2 / 3;
                Class386 var4;
                (var4 = new Class386(super.Field5 + var3, super.Field6 + var2, (byte) (15 + Class804.Field13(20)))).Field5 = (byte) Class804.Field13(20);
                this.Field17.addElement(var4);
            }
        }

        if (this.Field18) {
            if (super.Field8 != Class105.Field19.Field83) {
                if (this.Field15 == 1) {
                    Class74.Field2.removeAllElements();
                    return;
                }

                if (this.Field15 == 0) {
                    Class74.Field1.removeAllElements();
                    return;
                }
            } else if (!this.Field19 && Class802.Field1(super.Field5, super.Field6, Class105.Field19.Field15.Field193, Class105.Field19.Field15.Field194) < 17) {
                Class263.Field1().Field1(super.Field5, super.Field6, super.Field8);
                Class105.Field19.Field16 = null;
                Class261.Field5().Field1();
                this.Field19 = true;
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (super.Field5 + 20 > Class63.Field8 && super.Field5 - 20 < Class63.Field8 + Class105.Field13 && super.Field6 > Class63.Field9 && super.Field6 - 40 < Class63.Field9 + Class105.Field14) {
            if (this.Field15 == 0) {
                var1.drawRegion(Class804.Field9(), 0, this.Field1 / 6 * 24, 39, 24, 0, super.Field5, super.Field6, 3);
                ++this.Field1;
                if (this.Field1 >= 12) {
                    this.Field1 = 0;
                    return;
                }
            } else {
                for (int var2 = 0; var2 < this.Field17.size(); ++var2) {
                    Class386 var3;
                    if ((var3 = (Class386) this.Field17.elementAt(var2)).Field5 == 5) {
                        var1.setColor(Field16[4]);
                    } else if (var3.Field5 == 15) {
                        var1.setColor(Field16[5]);
                    } else {
                        var1.setColor(Field16[var3.Field3 / 10]);
                    }

                    var1.fillRect(var3.Field1, var3.Field2 - (1 + var3.Field3 / 3), 1, 1 + var3.Field3 / 3);
                    var3.Field2 -= 2;
                    --var3.Field3;
                    if (var3.Field3 < 0) {
                        this.Field17.removeElementAt(var2);
                    }
                }
            }
        }

    }
}
