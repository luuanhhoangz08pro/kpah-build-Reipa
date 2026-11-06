package main.tab.tab2;

import main.lib.Graphics;

public final class Class367 extends Class177 {
    private Class114 Field16;
    private boolean Field17 = false;
    private boolean Field18 = true;
    private int Field19 = 0;
    private int Field20;
    private int Field21;
    private int Field22;
    private int Field23;
    private int Field24;
    private int[] Field25;
    public String[] Field1;
    private int Field26 = 0;
    public boolean Field15 = false;
    private static byte[][] Field27 = new byte[][]{{15, 28}, {4, 4}, {15, 28}};
    private static byte[][] Field28 = new byte[][]{{17, 36}, {32, 31}, {14, 14}, {17, 36}, {17, 36}};
    private static byte[] Field29 = new byte[]{3, 5, 3};

    public Class367(int var1, int var2, Class114 var3, int var4, boolean var5) {
        this.Field26 = var4;
        super.Field5 = var3.Field193;
        super.Field6 = var3.Field194 - 10;
        this.Field23 = var1;
        this.Field24 = var2 - 40;
        this.Field16 = var3;
        this.Field19 = Class809.Field1(var3.Field193 - 10 - this.Field23, -(var3.Field194 - this.Field24));
        this.Field20 = Class809.Field1(this.Field23, this.Field24, var3.Field193 - 10, var3.Field194);
        this.Field25 = new int[3];

        for (var1 = 0; var1 < 3; ++var1) {
            this.Field25[var1] = Class811.Field13(6);
        }

        this.Field1 = new String[2];
    }

    public final void Field1() {
        this.Field19 = Class809.Field1(super.Field5 - this.Field23, -(super.Field6 - this.Field24));
        this.Field20 = Class809.Field1(this.Field23, this.Field24, super.Field5, super.Field6);
        this.Field21 += 6;
        ++this.Field22;
        if (!this.Field17) {
            super.Field5 = this.Field16.Field193;
            super.Field6 = this.Field16.Field194 - 10;
        }

        if (this.Field21 > this.Field20 && !this.Field17) {
            Class73.Field1(this.Field16.Field193, this.Field16.Field194 - 10, 12);
            Class73.Field2.removeElement(this);
            this.Field16.Field1();
            this.Field17 = true;
            if (this.Field1[0] != null) {
                Class106.Field19.Field1(this.Field1[0], 0, super.Field5, super.Field6 - 15, 1, -2);
            }

            if (this.Field1[1] != null) {
                Class106.Field19.Field1(this.Field1[1], 0, super.Field5, super.Field6 - 15, 2, -2);
            }

            if (this.Field18) {
                Class824 var1 = null;
                if (this.Field26 == 1) {
                    var1 = new Class824(super.Field5, super.Field6, 4, 5, 14, 14, false, false);
                } else {
                    var1 = new Class824(super.Field5, super.Field6, 28, 3, 32, 31, true, false);
                    if (this.Field26 == 2) {
                        Class225 var2;
                        (var2 = new Class225(this.Field16.Field193 + Class432.Field4[this.Field16.Field12], this.Field16.Field194 + Class432.Field5[this.Field16.Field12], this.Field16, this.Field16, (byte) 5)).Field15 = this.Field15;
                        Class73.Field2.addElement(var2);
                    }
                }

                Class73.Field1.addElement(var1);
            }
        }

    }

    public final void Field1(Graphics var1) {
        int var2 = this.Field21 * Class809.Field2(Class809.Field3(this.Field19)) >> 10;
        int var3 = -(this.Field21 * Class809.Field1(Class809.Field3(this.Field19))) >> 10;
        var1.drawImage(Class811.Field10, this.Field23 + var2, this.Field24 + var3, 3);

        for (int var4 = 0; var4 < 3; ++var4) {
            Class811.Field1(var1, Field27[this.Field26][0], 0, this.Field25[var4] / 2 * Field28[this.Field26 << 1][1], Field28[this.Field26 << 1][0], Field28[this.Field26 << 1][1], this.Field23 + var2 + Class811.Field13(10) - 5, this.Field24 + var3 + Class811.Field13(10) - 10, 3);
            int var10002 = this.Field25[var4]++;
            if (this.Field25[var4] >= Field29[this.Field26]) {
                this.Field25[var4] = 0;
            }
        }

    }
}
