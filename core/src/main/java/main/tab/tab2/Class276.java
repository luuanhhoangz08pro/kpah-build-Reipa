package main.tab.tab2;

import main.lib.Graphics;

final class Class276 extends Class86 {
    private final short[] Field3;
    private final int Field4;

    Class276(Class62 var1, String var2, Class256 var3, short[] var4, int var5) {
        super(var2, var3);
        this.Field3 = var4;
        this.Field4 = var5;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        Class379.Field1(var1, (short) (this.Field3[this.Field4] + 1000), var2, var3);
    }
}
