package main.tab.tab1;

import main.lib.Graphics;

public final class Class4 extends Class793 {
    private int Field4;
    private int Field5;
    private static byte[] Field6 = new byte[]{15};
    private static final byte[][] Field7 = new byte[][]{{0, 1, 2, 1, 0, 1, 2, 0}};
    private byte Field8;

    public Class4(int var1, int var2, int var3) {
        super.Field1 = var1;
        super.Field2 = var2;
        this.Field8 = 0;
    }

    public final void Field1(Graphics var1) {
        Class804.Field1(var1, Field6[this.Field8], 0, Field7[this.Field8][this.Field4] * Class173.Field4[Field6[this.Field8]], Class173.Field3[Field6[this.Field8]], Class173.Field4[Field6[this.Field8]], super.Field1, super.Field2, 33);
    }

    public final void Field1() {
        ++this.Field5;
        if (this.Field5 % 2 == 0) {
            ++this.Field4;
            if (this.Field4 >= Field7[this.Field8].length) {
                this.Field4 = 0;
                super.Field3 = true;
            }
        }

    }
}
