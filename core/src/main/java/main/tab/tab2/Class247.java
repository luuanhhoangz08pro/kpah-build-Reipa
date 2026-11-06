package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class247 extends Class51 {
    private byte Field2 = 6;
    private byte Field3;
    private byte Field4;
    private byte Field5 = 0;
    private short Field6;
    private short Field7;
    private short Field8;
    private short Field9;
    private short Field10;
    private short Field11;
    private short Field12;
    private short Field13;
    private boolean Field14;
    private int Field15;

    public Class247(byte var1) {
    }

    public final void Field1() {
        int var1 = this.Field4 * Class809.Field2(this.Field12) >> 10;
        int var2 = -(this.Field4 * Class809.Field1(this.Field12)) >> 10;
        this.Field6 = (short) (this.Field6 + var1);
        this.Field7 = (short) (this.Field7 + var2);
        var1 = this.Field4 * Class809.Field2(this.Field13) >> 10;
        var2 = -(this.Field4 * Class809.Field1(this.Field13)) >> 10;
        this.Field8 = (short) (this.Field8 + var1);
        this.Field9 = (short) (this.Field9 + var2);
        if (this.Field5 == 0 && Class809.Field1(this.Field10, this.Field11, this.Field6, this.Field7) <= this.Field4 << 1) {
            this.Field6 = this.Field8 = this.Field10;
            this.Field7 = this.Field9 = this.Field11;
            this.Field4 = 0;
            if (!this.Field14) {
                this.Field5 = (byte) (Class811.Field13(30) + 20);
                Class106.Field19.Field13.addElement(this);
                Class106.Field19.Field1(this.Field6, (short) (this.Field7 + 10));
            } else {
                if (this.Field15 != 0) {
                    Class106.Field19.Field1("-" + this.Field15, 0, this.Field6, this.Field7 - 15, 1, -2);
                }

                Class73.Field1(this.Field6, this.Field7 - 20, 12);
            }

            Class62.Field12.removeElement(this);
        } else if (Class809.Field1(this.Field10, this.Field11, this.Field6, this.Field7) > 1000) {
            Class62.Field12.removeElement(this);
        }

        if (this.Field5 > 0) {
            --this.Field5;
            if (this.Field5 == 0) {
                Class106.Field19.Field13.removeElement(this);
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (Class811.Field3(this.Field2) != null) {
            var1.drawImage(Class811.Field10, this.Field8, this.Field9, 17);
            Image var2;
            if ((var2 = Class811.Field3(this.Field2)) != null) {
                var1.drawRegion(var2, 0, Class804.Field5[this.Field3] * Class804.Field3[1][this.Field2], Class804.Field3[0][this.Field2], Class804.Field3[1][this.Field2], Class804.Field4[this.Field3], this.Field6, this.Field7, 3);
            }
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, int var5, byte var6, boolean var7) {
        this.Field15 = var3;
        this.Field14 = var7;
        this.Field4 = var6;
        var3 = var4 - var1;
        int var8 = var5 - var2;
        this.Field6 = this.Field8 = (short) var1;
        this.Field7 = (short) var2;
        this.Field10 = (short) var4;
        this.Field11 = (short) var5;
        this.Field9 = (short) (var2 + 30);
        this.Field3 = (byte) Class804.Field2(Class809.Field1(var3, -var8));
        this.Field12 = (short) Class809.Field1(var4 - var1, -(var5 - var2));
        this.Field13 = (short) Class809.Field1(var4 - this.Field8, -(var5 - this.Field9));
    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class114 var6, Class114 var7) {
    }

    public final void Field1(int var1) {
    }
}
