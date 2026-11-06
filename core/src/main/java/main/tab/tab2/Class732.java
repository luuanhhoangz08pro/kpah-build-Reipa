package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class732 {
    public static byte[][][] Field1 = new byte[][][]{{new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}};
    public static byte[][][] Field2 = new byte[][][]{{new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}};
    public static byte[][][] Field3 = new byte[][][]{{new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}, {new byte[1], new byte[1], new byte[1], new byte[1]}};
    public static Image[] Field4 = new Image[10];
    public static int[] Field5 = new int[10];
    public static int[] Field6 = new int[10];
    public static int[] Field7 = new int[10];
    public static int[] Field8 = new int[10];
    public byte Field9 = 0;
    public int Field10;
    private int Field12;
    private int Field13;
    public int Field11;

    public final void Field1(Graphics var1, int var2, int var3) {
        if (Field4[this.Field9] != null) {
            var1.drawRegion(Field4[this.Field9], 0, this.Field12 * Field6[this.Field9], Field5[this.Field9], Field6[this.Field9], 0, var2 + Field7[this.Field9], var3 + Field8[this.Field9], 33);
        }
    }

    public final void Field1() {
        try {
            switch (this.Field10) {
                case 0:
                    ++this.Field13;
                    if (this.Field13 > Field2[this.Field9][this.Field11].length - 1) {
                        this.Field13 = 0;
                    }

                    this.Field12 = Field2[this.Field9][this.Field11][this.Field13];
                    return;
                case 1:
                    ++this.Field13;
                    if (this.Field13 > Field1[this.Field9][this.Field11].length - 1) {
                        this.Field13 = 0;
                    }

                    this.Field12 = Field1[this.Field9][this.Field11][this.Field13];
                    return;
                case 2:
                    ++this.Field13;
                    if (this.Field13 > Field3[this.Field9][this.Field11].length - 1) {
                        this.Field13 = Field3[this.Field9][this.Field11].length - 1;
                    }

                    this.Field12 = Field3[this.Field9][this.Field11][this.Field13];
                default:
            }
        } catch (Exception var1) {
            System.out.println(this.Field9 + " >> " + this.Field13 + " >> " + this.Field11);
        }
    }
}
