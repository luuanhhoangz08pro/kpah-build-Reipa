package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class565 {
    private short Field1;
    private short Field2;
    private Image Field3;

    public Class565(Image var1, int var2, int var3) {
        this.Field3 = var1;
        this.Field1 = (short) var2;
        this.Field2 = (short) var3;
        var1.getHeight();
    }

    public static Class565 Field1(String var0, int var1, int var2) {
        return new Class565(Class53.Field1(var0), var1, var2);
    }

    public final void Field1(int var1, int var2, int var3, int var4, int var5, Graphics var6) {
        if (this.Field3 != null) {
            var6.drawRegion(this.Field3, 0, var1 * this.Field2, this.Field1, this.Field2, var4, var2, var3, var5);
        }

    }
}
