package main.tab.tab1;

import main.lib.Graphics;

final class Class442 extends Class87 {
    private final int Field3;
    private final String Field4;

    Class442(Class467 var1, String var2, Class258 var3, int var4, String var5) {
        super(var2, var3);
        this.Field3 = var4;
        this.Field4 = var5;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        Class381.Field1(var1, (short) this.Field3, var2, var3);
        Class21.Field9[3].Field1(var1, this.Field4, var2 + 8, var3 + 1, 1);
    }
}
