package main.tab.tab2;

import main.lib.Graphics;

final class Class439 extends Class86 {
    private final int Field3;
    private final String Field4;

    Class439(Class464 var1, String var2, Class256 var3, int var4, String var5) {
        super(var2, var3);
        this.Field3 = var4;
        this.Field4 = var5;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        Class379.Field1(var1, (short) this.Field3, var2, var3);
        Class21.Field9[3].Field1(var1, this.Field4, var2 + 8, var3 + 1, 1);
    }
}
