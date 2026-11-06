package main.tab.tab1;

import main.lib.Graphics;

final class Class425 extends Class87 {
    private final Class274 Field3;
    private final Class743 Field4;

    Class425(Class467 var1, String var2, Class258 var3, Class274 var4, Class743 var5) {
        super(var2, var3);
        this.Field3 = var4;
        this.Field4 = var5;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        if (Class804.Field1(this.Field3.Field1) != null) {
            Class804.Field1(var1, Class804.Field1(this.Field3.Field1).Field12, var2, var3);
            if (this.Field4.Field19 != -1) {
                Class804.Field1(var1, var2 - 9, var3 - 9, 17, 17, this.Field4.Field20, Class743.Field21[this.Field4.Field19], 16516369);
                Class743 var10000 = this.Field4;
                var10000.Field20 += 3;
                if (this.Field4.Field20 > 68) {
                    this.Field4.Field20 = 0;
                }
            }

            Class21.Field9[3].Field1(var1, String.valueOf(this.Field3.Field3), var2 + 8, var3 + 1, 1);
        }

    }
}
