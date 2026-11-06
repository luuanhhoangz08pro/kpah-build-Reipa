package main.tab.tab2;

import main.lib.Graphics;

final class Class510 extends Class86 {
    private final Class750 Field3;

    Class510(Class464 var1, String var2, Class256 var3, Class750 var4) {
        super(var2, var3);
        this.Field3 = var4;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        Class379.Field1(var1, (short) (Class811.Field2(this.Field3.Field15).Field12 + 5500), var2, var3);
        Class21.Field9[3].Field1(var1, String.valueOf(this.Field3.Field15 > 1 ? Class811.Field2(this.Field3.Field15).Field13 : 1), var2 + 8, var3 + 1, 1);
    }
}
