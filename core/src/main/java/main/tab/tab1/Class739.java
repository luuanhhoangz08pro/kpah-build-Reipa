package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class739 extends Class173 {
    private Vector Field1;
    private Class359 Field15;
    private int Field16 = 12;
    private int Field17 = 1;
    private int Field18;
    private int Field19;

    public Class739(Vector var1, Class359 var2) {
        this.Field1 = var1;
        this.Field16 = 12;
        this.Field15 = var2;

        for (int var3 = 0; var3 < this.Field1.size(); ++var3) {
            Class111 var4;
            if ((var4 = (Class111) this.Field1.elementAt(var3)) instanceof Class123) {
                ((Class123) var4).Field204 = 3;
            } else if (var4 instanceof Class359) {
                ((Class359) var4).Field204 = 2;
            }
        }

    }

    public final void Field1() {
        ++this.Field18;
        if (this.Field19 > 6 && this.Field16 == 0) {
            this.Field17 = -1;
        }

        if (this.Field17 == -1 && this.Field16 != 11) {
            ++this.Field16;
        }

        if (this.Field16 > 0 && this.Field17 == 1) {
            --this.Field16;
        }

        int var1;
        Class111 var2;
        if (this.Field17 == -1 && this.Field16 == 11) {
            for (var1 = 0; var1 < this.Field1.size(); ++var1) {
                if ((var2 = (Class111) this.Field1.elementAt(var1)) instanceof Class123) {
                    ((Class123) var2).Field204 = 0;
                } else if (var2 instanceof Class359) {
                    ((Class359) var2).Field204 = 0;
                }
            }

            Class74.Field2.removeElement(this);
        }

        for (var1 = 0; var1 < this.Field1.size(); ++var1) {
            Class111 var10000 = (Class111) this.Field1.elementAt(var1);
            var10000.Field16 = (short) (var10000.Field16 - this.Field16 * this.Field17);
        }

        if (this.Field16 == 0 && this.Field17 == 1 && this.Field18 % 3 == 0) {
            if (this.Field19 <= 3) {
                for (var1 = 0; var1 < this.Field1.size(); ++var1) {
                    var2 = (Class111) this.Field1.elementAt(var1);
                    Class63.Field2(0, this.Field15, var2, this.Field15.Field193, this.Field15.Field194 - 15, this.Field15.Field90, this.Field15.Field131, 1);
                }
            }

            ++this.Field19;
        }

    }

    public final void Field1(Graphics var1) {
    }
}
