package main.tab.tab1;

import main.lib.Graphics;

public final class Class492 extends Class51 {
    private int Field2;
    private int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private boolean Field9;

    public Class492(Class111 var1, Class111 var2, int var3) {
        this.Field2 = var1.Field193;
        this.Field3 = var1.Field194;
        this.Field7 = var3;
        int var5 = Class105.Field1(Class105.Field20.nextInt(2));
        this.Field8 = Class105.Field1(Class105.Field20.nextInt(3)) + 1;
        this.Field9 = var5 == 0;
        this.Field5 = this.Field4 = this.Field9 ? 0 : 360;
        if (var2 != null) {
            int var4 = var2.Field18;
            var2.Field1();
            Class74.Field1(var2.Field193, var2.Field194 + var2.Field16 - 10, 11);
            Class105.Field19.Field1("-" + var4, 0, var2.Field193, var2.Field194 + var2.Field16 - 15, 1, -2);
        }

    }

    public final void Field1(Graphics var1) {
    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class111 var6, Class111 var7) {
    }

    public final void Field1(int var1) {
    }

    public final void Field1() {
        if (this.Field9) {
            this.Field4 += 30;
            if (this.Field4 > 360) {
                this.Field4 -= 360;
            }

            if (this.Field5 != this.Field4) {
                this.Field5 += this.Field7;
                if (this.Field5 > 360) {
                    this.Field5 -= 360;
                    ++this.Field6;
                }
            }
        } else {
            this.Field4 -= 30;
            if (this.Field4 < 0) {
                this.Field4 += 360;
            }

            if (this.Field5 != this.Field4) {
                this.Field5 -= this.Field7;
                if (this.Field5 < 0) {
                    this.Field5 += 360;
                    ++this.Field6;
                }
            }
        }

        if (this.Field6 >= this.Field8) {
            if (Class63.Field12.contains(this)) {
                Class63.Field12.removeElement(this);
            }

            this.Field6 = 0;
        }

        if (this.Field5 % 30 == 0) {
            Class105.Field19.Field1(this.Field5, 10, (Class111) null, (Class111) null, 1, false, 0, 0, this.Field2, this.Field3, true);
        }

    }
}
