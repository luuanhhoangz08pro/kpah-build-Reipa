package main.tab.tab1;

import main.lib.Graphics;

public final class Class523 extends Class665 {
    public static Class523 Field1;
    public Class239 Field2;
    private Class665 Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    public int Field3;
    private String Field9;

    public static Class523 Field5() {
        return Field1 == null ? (Field1 = new Class523()) : Field1;
    }

    public final void Field1() {
        if (Class105.Field17 != this) {
            this.Field4 = Class105.Field17;
        }

        super.Field1();
    }

    public final void Field1(int var1, int var2, int var3, int var4, String var5, Class87 var6) {
        this.Field3 = 0;
        this.Field5 = var1;
        this.Field6 = var2;
        this.Field7 = var3;
        this.Field8 = var4;
        this.Field9 = var5;
        super.Field104 = var6;
        super.Field103 = new Class87("Đóng", new Class269(this));
    }

    public final void Field4() {
        if (this.Field4 != Class105.Field36) {
            this.Field4.Field4();
        }

        if (this.Field2 != null) {
            this.Field2.Field1();
        }

    }

    public final boolean Field1(int var1) {
        this.Field2.Field1(var1);
        return false;
    }

    public final void Field1(Graphics var1) {
        this.Field4.Field1(var1);
        Class105.Field1(var1);
        var1.translate(this.Field5, this.Field6);
        Class804.Field4(var1, 0, 0, this.Field7, this.Field8);
        if (this.Field3 == 0) {
            Class21.Field3.Field1(var1, this.Field9, this.Field7 / 2, 3, 2);
        } else {
            Class21.Field10[0].Field1(var1, this.Field9, this.Field7 / 2, 6, 2);
        }

        if (this.Field2 != null) {
            this.Field2.Field1(var1);
        }

        super.Field1(var1);
    }

    public final void Field1(Class665 var1) {
        this.Field4 = var1;
        super.Field1(var1);
    }

    static Class665 Field1(Class523 var0) {
        return var0.Field4;
    }
}
