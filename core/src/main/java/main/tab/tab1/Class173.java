package main.tab.tab1;

import main.lib.Graphics;

public class Class173 {
    public static final byte[][] Field2 = new byte[][]{new byte[2], {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {0, 1, 2, 3, 4, 5, 6, 7}, new byte[1], {0, 1, 2, 3, 4, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, {0, 1}, {0, 1, 2, 3, 4, 5, 6, 7, 8}, {0, 1, 1}, {5, 5, 5, 0, 1, 2, 3, 4, 5, 6, 7, 8}, new byte[1], {0, 1}, {0, 1}, {0, 0, 1, 1}, {0, 1, 2}, {0, 0, 0, 1, 1, 1, 2, 2, 2}, {0, 0, 1, 1, 2, 2}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 1, 2}, {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2, 3, 4}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {17, 16, 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {0, 0, 0, 1, 1, 1, 2, 2, 2}, new byte[1], {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 0, 1, 1, 1}, {0, 0, 1, 1, 2, 2, 3, 3, 4, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2, 3, 4}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2}, {0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2}, {0, 1, 2, 3}, {0, 0, 0, 1, 1, 1, 2, 2, 2}, {0, 1, 2}, {0, 0, 1, 1, 2, 2, 3, 3}, {0, 0, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, {2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0}, {0, 1, 2, 0, 1, 2, 0, 1, 2}, {0, 1, 2}, {0, 1}, {0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2}, {0, 1, 2}, new byte[1], new byte[1], {0, 1, 2, 3, 4, 5}, {0, 1, 2, 3}, {0, 1, 2, 3}, new byte[1]};
    public static final byte[] Field3 = new byte[]{52, 11, 12, 41, 14, 32, 12, 32, 10, 32, 16, 32, 32, 58, 64, 17, 31, 22, 32, 25, 25, 25, 21, 25, 24, 21, 21, 21, 32, 11, 40, 0, 12, 14, 24, 24, 25, 24, 27, 27, 39, 27, 40, 32, 42, 45, 32, 42, 32, 16, 35, 38, 53, 88, 55, 50, 40, 42, 32, 50, 10, 44, 50, 14, 7, 40};
    public static final byte[] Field4 = new byte[]{18, 11, 12, 38, 14, 32, 12, 32, 10, 32, 100, 32, 32, 38, 46, 36, 32, 22, 32, 14, 17, 15, 34, 27, 35, 34, 34, 34, 31, 11, 31, 0, 13, 14, 15, 22, 16, 23, 27, 27, 25, 28, 76, 28, 41, 46, 32, 41, 32, 16, 36, 49, 28, 60, 55, 51, 76, 41, 32, 26, 10, 44, 50, 15, 7, 41};
    public int Field5;
    public int Field6;
    private int Field1;
    public int Field7;
    public short Field8;
    int Field9;
    public boolean Field10;
    public Class111 Field11;
    public byte Field12 = 0;
    public byte Field13;
    public Class789 Field14 = null;
    private Class800 Field15 = null;

    public Class173() {
    }

    public Class173(int var1, int var2, int var3) {
        this.Field5 = var1;
        this.Field6 = var2;
        this.Field8 = (short) var3;
        this.Field1 = Field3[var3];
        this.Field7 = Field4[var3];
        this.Field9 = -1;
    }

    public void Field1(Graphics var1) {
        if (this.Field8 >= 0) {
            if (this.Field9 == -1) {
                this.Field9 = 0;
            }

            Class804.Field1(var1, this.Field8, 0, Field2[this.Field8][this.Field9] * this.Field7, this.Field1, this.Field7, this.Field5, this.Field6, 3);
        }
    }

    public void Field1() {
        if (this.Field11 != null) {
            this.Field5 = this.Field11.Field193;
            this.Field6 = this.Field11.Field194 + this.Field13;
        }

        ++this.Field9;
        if (this.Field9 >= Field2[this.Field8].length) {
            this.Field9 = 0;
            if (this.Field12 == 0) {
                this.Field10 = true;
                if (this.Field14 != null) {
                    Class173 var1 = Class63.Field1(this.Field14.Field1, this.Field14.Field1.Field193, this.Field14.Field1.Field194, this.Field14.Field5);
                    Class74.Field2.addElement(var1);
                    var1.Field15 = new Class800();
                    var1.Field15.Field1 = this.Field14.Field1;
                    var1.Field15.Field2 = this.Field14.Field2;
                    var1.Field15.Field3 = this.Field14.Field3;
                    var1.Field15.Field4 = this.Field14.Field4;
                    var1.Field15.Field6 = this.Field14.Field7;
                    var1.Field15.Field5 = 0;
                    this.Field14 = null;
                }

                if (this.Field15 != null) {
                    for (int var4 = 0; var4 < this.Field15.Field2.size(); ++var4) {
                        Class111 var2 = (Class111) this.Field15.Field2.elementAt(var4);
                        int var3 = Integer.parseInt((String) this.Field15.Field3.elementAt(var4));
                        Class63.Field1(this.Field15.Field1, var2, var3, (byte) this.Field15.Field5, this.Field15.Field6);
                        var2.Field4 = Integer.parseInt((String) this.Field15.Field4.elementAt(var4));
                    }

                    this.Field15 = null;
                    return;
                }
            } else {
                --this.Field12;
            }
        }

    }
}
