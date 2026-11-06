package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

final class Class279 extends Class238 {
    private final Class194 Field1;
    private final Image Field2;
    private final int Field3;

    Class279(Class62 var1, Class194 var2, Image var3, int var4) {
        this.Field1 = var2;
        this.Field2 = var3;
        this.Field3 = var4;
    }

    public final void Field1() {
        this.Field1.Field4();
    }

    public final void Field1(Graphics var1) {
        var1.drawImage(this.Field2, this.Field3 / 2, 30, 17);
        this.Field1.Field1(var1);
    }

    public final void Field1(int var1) {
        this.Field1.Field1(var1);
    }
}
