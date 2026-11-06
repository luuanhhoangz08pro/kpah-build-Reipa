package main.tab.tab2;

import main.lib.Graphics;

final class Class426 extends Class86 {
    private Class464 Field3;
    private final Class272 Field4;
    private final int Field5;
    private final Class750 Field6;

    Class426(Class464 var1, String var2, Class256 var3, Class272 var4, int var5, Class750 var6) {
        super(var2, var3);
        this.Field3 = var1;
        this.Field4 = var4;
        this.Field5 = var5;
        this.Field6 = var6;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        if (Class811.Field1(this.Field4.Field1) != null) {
            if (this.Field5 - (Class464.Field22[Class464.Field21] == 0 ? this.Field3.Field47 * 42 : 0) != this.Field3.Field4) {
                var1.setColor(3276851);
                var1.fillRect(var2 - 7, var3 - 7, 16, 16);
            }

            Class811.Field2(var1, Class811.Field1(this.Field4.Field1).Field12, var2, var3);
            if (this.Field6.Field19 != -1) {
                Class811.Field1(var1, var2 - 9, var3 - 9, 17, 17, this.Field6.Field20, Class750.Field21[this.Field6.Field19], 16516369);
                Class750 var10000 = this.Field6;
                var10000.Field20 += 3;
                if (this.Field6.Field20 > 68) {
                    this.Field6.Field20 = 0;
                }
            }

            Class21.Field9[3].Field1(var1, String.valueOf(this.Field4.Field3), var2 + 8, var3 + 1, 1);
        }

    }
}
