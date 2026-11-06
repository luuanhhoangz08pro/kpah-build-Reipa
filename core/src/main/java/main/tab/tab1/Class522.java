package main.tab.tab1;

import main.lib.Graphics;

public final class Class522 extends Class266 {
    public String Field2;
    private byte Field4;
    public static Class568 Field3;

    public Class522(String var1, int var2, int var3) {
        super(var2, var3, 0);
        super.Field193 = (short) var2;
        super.Field194 = (short) var3;
        this.Field2 = var1;
        this.Field4 = (byte) Class804.Field13(8);
    }

    public final void Field2() {
    }

    public final void Field1(Graphics var1) {
        ++this.Field4;
        if (this.Field4 >= 8) {
            this.Field4 = 0;
        }

        var1.drawImage(Class804.Field10, super.Field193, super.Field194, 3);
        if (Field3 != null) {
            Field3.Field1(0, super.Field193, super.Field194 - 10 + this.Field4 / 2, 0, 33, var1);
        }

        Class21.Field1.Field1(var1, this.Field2, super.Field193, super.Field194 - 32 + this.Field4 / 2, 2);
    }
}
