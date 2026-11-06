package main.tab.tab2;

import main.lib.Graphics;

final class Class433 extends Class86 {
    private final Class534 Field3;

    Class433(Class464 var1, String var2, Class256 var3, Class534 var4) {
        super(var2, var3);
        this.Field3 = var4;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        if (this.Field3.Field26) {
            var1.setColor(7706352);
            var1.fillRect(var2 - 8, var3 - 8, 16, 16);
        }

        this.Field3.Field1(var1, var2, var3);
    }
}
