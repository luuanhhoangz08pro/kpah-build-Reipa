package main.tab.tab2;

import main.lib.Graphics;

public final class Class271 extends Class275 {
    private String Field2;
    public Class194 Field1 = new Class194();
    private Class256 Field3;
    private Class256 Field4;
    private int Field5;
    private boolean Field6 = false;

    public Class271() {
        this.Field1.Field4 = 21;
        this.Field1.Field2 = Class106.Field14 - 56;
        this.Field1.Field5 = true;
    }

    public final void Field1() {
        this.Field1.Field2 = Class106.Field14 - 56;
        this.Field5 = Class21.Field2.Field1(this.Field2) + 30;
        if (this.Field5 > Class106.Field13) {
            String var1 = "";

            for (int var2 = 0; var2 < this.Field2.length() - 1; ++var2) {
                var1 = var1 + this.Field2.substring(var2, var2 + 1);
                if (Class21.Field2.Field1(var1) >= Class106.Field13 - 50) {
                    this.Field2 = var1 + "...";
                    this.Field5 = Class21.Field2.Field1(this.Field2) + 30;
                    break;
                }
            }
        } else if (!this.Field6) {
            this.Field5 = Class106.Field13 - 30;
        }

        if (this.Field5 < 110) {
            this.Field5 = 110;
        }

        this.Field1.Field3 = this.Field5 - 40;
        this.Field1.Field1 = Class106.Field15 - this.Field1.Field3 / 2;
    }

    public final void Field1(String var1, Class256 var2, int var3, int var4, boolean var5) {
        this.Field6 = var5;
        this.Field1.Field1("");
        this.Field1.Field3(var3);
        this.Field1.Field2(var4);
        this.Field2 = var1;
        this.Field3 = var2;
        this.Field4 = new Class767(this);
        super.Field103 = new Class86("Đóng", this.Field4);
        super.Field104 = new Class86("Ok", this.Field3);
        super.Field105 = this.Field1.Field9;
        this.Field1();
    }

    public final void Field1(Graphics var1) {
        Class106.Field1(var1);
        Class811.Field4(var1, Class106.Field15 - this.Field5 / 2, Class106.Field14 - 90, this.Field5, 69);
        Class21.Field2.Field1(var1, this.Field2, Class106.Field15, Class106.Field14 - 86, 2);
        this.Field1.Field1(var1);
        super.Field1(var1);
    }

    public final void Field1(int var1) {
        if (this.Field1.Field1(var1)) {
            Class106.Field3[5] = false;
        }

    }

    public final void Field2() {
        this.Field1.Field4();
        super.Field3();
    }

    public final void Field3() {
    }
}
