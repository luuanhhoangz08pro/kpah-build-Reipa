package main.tab.tab1;

import main.lib.Graphics;

public class Class816 extends Class173 {
    private short[] Field15;
    private short[] Field16;
    private byte[] Field17;
    private byte[] Field18;
    int Field1;
    private int Field19;
    private int Field20;
    private int Field21;
    private boolean Field22;
    private boolean Field23;
    private int Field24 = 0;

    public Class816(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, boolean var8) {
        this.Field22 = var7;
        this.Field20 = var5;
        this.Field21 = var6;
        this.Field19 = var4;
        this.Field1 = var3;
        super.Field5 = var1;
        super.Field6 = var2;
        this.Field15 = new short[6];
        this.Field16 = new short[6];
        this.Field17 = new byte[6];
        this.Field18 = new byte[6];

        for (var3 = 0; var3 < 6; ++var3) {
            this.Field15[var3] = (short) (var1 - 10 + Class804.Field13(20) - 10);
            this.Field16[var3] = (short) (var2 + Class804.Field13(20));
            this.Field17[var3] = (byte) Class804.Field13(6);
        }

        this.Field23 = var8;
    }

    public final void Field1() {
        for (int var1 = 0; var1 < this.Field15.length; ++var1) {
            ++this.Field17[var1];
            if (this.Field17[var1] >= this.Field19 * 3) {
                this.Field15[var1] = (short) (super.Field5 + Class804.Field13(30) - 15);
                this.Field16[var1] = (short) (super.Field6 + Class804.Field13(14) + 3);
                this.Field17[var1] = (byte) Class804.Field13(6);
                ++this.Field18[var1];
                if (this.Field18[var1] > 3) {
                    if (!this.Field23) {
                        Class74.Field1.removeElement(this);
                    } else {
                        Class74.Field2.removeElement(this);
                    }
                }
            }
        }

        ++this.Field24;
        if (this.Field24 >= 6) {
            this.Field24 = 0;
        }

    }

    public void Field1(Graphics var1) {
        for (int var2 = 0; var2 < 6; ++var2) {
            Class804.Field1(var1, this.Field1, 0, this.Field17[var2] / 3 * this.Field21, this.Field20, this.Field21, this.Field15[var2], this.Field16[var2], 33);
        }

        if (this.Field22) {
            Class804.Field1(var1, 13, 0, this.Field24 / 2 * 38, 58, 38, super.Field5, super.Field6 - 3, 3);
        }

    }
}
