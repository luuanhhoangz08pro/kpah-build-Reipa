package main.tab.tab1;

import main.lib.Graphics;

final class Class581 extends Class87 {
    private Class326 Field3;
    private final int Field4;
    private final int Field5;

    Class581(Class326 var1, String var2, Class258 var3, int var4, int var5) {
        super(var2, var3);
        this.Field3 = var1;
        this.Field4 = var4;
        this.Field5 = var5;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        var1.setClip(var2 - this.Field3.Field5 / 2, var3 - this.Field3.Field6 / 2, this.Field3.Field5, this.Field3.Field6);
        Class381.Field1(var1, (short) (this.Field4 + 1600), var2 - this.Field3.Field5 / 2 + 9, var3);
        int var4 = 0;
        if (this.Field5 == this.Field3.Field3 && !this.Field3.Field11) {
            if ((var4 = Class21.Field5.Field1(Class105.Field19.Field96[this.Field4].Field3)) > this.Field3.Field1 - (this.Field3.Field5 / 2 + 16)) {
                Class326 var10000 = this.Field3;
                var10000.Field27 += 2;
                if (this.Field3.Field27 > var4 - (this.Field3.Field5 / 2 + 30)) {
                    this.Field3.Field27 = -20;
                }
            }

            var4 = this.Field3.Field27;
            if (this.Field3.Field27 < 0) {
                var4 = 0;
            }
        }

        var1.setClip(var2 - this.Field3.Field5 / 2 + 18, var3 - this.Field3.Field6 / 2, this.Field3.Field5 - 20, this.Field3.Field6);
        Class21.Field5.Field1(var1, Class105.Field19.Field96[this.Field4].Field3, var2 - this.Field3.Field5 / 2 + 18 - var4, var3 - Class21.Field5.Field2() / 2, 0);
    }
}
