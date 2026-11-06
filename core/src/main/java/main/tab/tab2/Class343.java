package main.tab.tab2;

import main.lib.Graphics;

final class Class343 extends Class238 {
    private final Class194 Field1;
    private final Class194 Field2;

    Class343(Class194 var1, Class194 var2) {
        this.Field1 = var1;
        this.Field2 = var2;
    }

    public final void Field1() {
        if (Class106.Field2(2) || Class106.Field2(8)) {
            if (this.Field1.Field5) {
                this.Field1.Field5 = false;
                this.Field2.Field5 = true;
                Class520.Field5().Field105 = this.Field2.Field9;
            } else {
                this.Field1.Field5 = true;
                this.Field2.Field5 = false;
                Class520.Field5().Field105 = this.Field1.Field9;
            }
        }

        this.Field1.Field4();
        this.Field2.Field4();
    }

    public final void Field1(int var1) {
        this.Field1.Field1(var1);
        this.Field2.Field1(var1);
    }

    public final void Field1(Graphics var1) {
        Class21.Field2.Field1(var1, "Giá bán", 10, 26, 0);
        Class21.Field2.Field1(var1, "Giá bid", 10, 61, 0);
        this.Field1.Field1(var1);
        var1.setClip(0, 0, 140, 100);
        this.Field2.Field1(var1);
    }
}
