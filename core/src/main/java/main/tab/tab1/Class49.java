package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

public final class Class49 extends Class51 {
    private int Field2;
    private int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    private int Field10;
    private int Field11;

    public Class49(int var1, int var2, Class111 var3, Class111 var4, int var5, int var6, int var7, int var8, int var9, boolean var10) {
        int[] var10000 = new int[]{0, 2, 1, 3, 7, 4};
        this.Field5 = var1;
        this.Field6 = var2;
        if (var3 != null) {
            this.Field7 = var3.Field193 - var6;
            this.Field8 = var3.Field194 - var7;
        } else {
            this.Field7 = var8;
            this.Field8 = var9;
        }

        this.Field2 = var5;
        if (var10 && var4 != null) {
            var4.Field1();
            Class74.Field1(var4.Field193, var4.Field194 + var4.Field16 - 10, 11);
            Class105.Field19.Field1("-" + var4.Field18, 0, var4.Field193, var4.Field194 + var4.Field16 - 15, 1, -2);
        }

        this.Field10 = var1;
    }

    public final void Field1(Graphics var1) {
        try {
            Image var2;
            if (this.Field2 != 0 && (var2 = Class804.Field4(34)) != null) {
                var1.drawRegion(var2, 0, this.Field11 * 15, 24, 15, 0, this.Field3, this.Field4, 3);
                return;
            }
        } catch (Exception var3) {
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class111 var6, Class111 var7) {
    }

    public final void Field1(int var1) {
    }

    public final void Field1() {
        this.Field3 = this.Field7 + Class802.Field2(this.Field5) * this.Field6 / 1024;
        this.Field4 = this.Field8 + Class802.Field1(this.Field5) * this.Field6 / 1024;
        if (this.Field2 == 0) {
            this.Field10 += 30;
            if (this.Field10 > 360) {
                this.Field10 -= 360;
            }

            if (this.Field5 != this.Field10) {
                this.Field5 += 10;
                if (this.Field5 > 360) {
                    this.Field5 -= 360;
                }
            }

            if (this.Field9 < 15) {
                this.Field9 += 2;
            }

            Class74.Field1(this.Field3, this.Field4, 33);
        } else {
            if (this.Field9 < 24) {
                this.Field9 += 8;
            }

            if (Class105.Field12 % 4 == 0) {
                if (this.Field11 < 1) {
                    ++this.Field11;
                } else {
                    this.Field11 = 0;
                }
            }
        }

        this.Field6 += this.Field9;
        if (this.Field3 < Class63.Field8 - Class105.Field13 / 2 || this.Field3 > Class63.Field8 + Class105.Field13 + Class105.Field13 / 2 || this.Field4 < Class63.Field9 - Class105.Field14 / 2 || this.Field4 > Class63.Field9 + Class105.Field14 + Class105.Field14 / 2) {
            if (Class105.Field19.Field13.contains(this)) {
                Class105.Field19.Field13.removeElement(this);
            }

            if (Class63.Field12.contains(this)) {
                Class63.Field12.removeElement(this);
            }
        }

    }
}
