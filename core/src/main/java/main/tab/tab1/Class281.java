package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

final class Class281 extends Class239 {
    private final Class190 Field1;
    private final Image Field2;
    private final int Field3;

    Class281(Class63 var1, Class190 var2, Image var3, int var4) {
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
