package main.tab.tab1;

import main.lib.Graphics;

final class Class5 extends Class239 {
    private final Class190 Field1;
    private final Class190 Field2;

    Class5(Class63 var1, Class190 var2, Class190 var3) {
        this.Field1 = var2;
        this.Field2 = var3;
    }

    public final void Field1() {
        if (Class105.Field2(2) || Class105.Field2(8)) {
            if (this.Field1.Field5) {
                this.Field1.Field5 = false;
                this.Field2.Field5 = true;
                Class523.Field5().Field105 = this.Field2.Field9;
            } else {
                this.Field1.Field5 = true;
                this.Field2.Field5 = false;
                Class523.Field5().Field105 = this.Field1.Field9;
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
        Class21.Field2.Field1(var1, "Seri", 10, 26, 0);
        Class21.Field2.Field1(var1, "Mã thẻ", 10, 61, 0);
        this.Field1.Field1(var1);
        var1.setClip(0, 0, 140, 100);
        this.Field2.Field1(var1);
    }
}
