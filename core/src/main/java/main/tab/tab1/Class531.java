package main.tab.tab1;

import main.lib.Graphics;

final class Class531 extends Class87 {
    private Class467 Field3;
    private final int Field4;

    Class531(Class467 var1, String var2, Class258 var3, int var4) {
        super(var2, var3);
        this.Field3 = var1;
        this.Field4 = var4;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        if (this.Field3.Field26.elementAt(this.Field4) instanceof Class537) {
            Class537 var4;
            if ((var4 = (Class537) this.Field3.Field26.elementAt(this.Field4)).Field26) {
                var1.setColor(7706352);
                var1.fillRect(var2 - 7, var3 - 7, 14, 14);
            }

            var4.Field1(var1, var2, var3);
        } else {
            Class804.Field1(var1, Class804.Field1(((Class231) this.Field3.Field26.elementAt(this.Field4)).Field2).Field12, var2, var3);
        }
    }
}
