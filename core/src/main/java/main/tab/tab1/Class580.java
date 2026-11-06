package main.tab.tab1;

import main.lib.Image;

public final class Class580 {
    public int Field1;
    public int Field2;
    public int Field3;
    public int Field4;
    public int Field5;
    public int Field6;
    String[] Field7;
    public static Image Field8;
    public static Image Field9;

    public Class580() {
    }

    public Class580(int var1, String var2, int var3) {
        this.Field1(var1, var2);
        this.Field6 = var3;
    }

    public final void Field1(int var1, int var2) {
        this.Field2 = var1;
        this.Field3 = var2;
    }

    private void Field1(int var1, String var2) {
        this.Field7 = Class21.Field4.Field1(var2, 100);
        Class63.Field76 = this.Field7.length << 3;
        this.Field4 = 14 * this.Field7.length + 4 + 4;
        this.Field5 = 30;

        for (int var4 = 0; var4 < this.Field7.length; ++var4) {
            int var3;
            if ((var3 = Class21.Field4.Field1(this.Field7[var4]) + 5) > this.Field5) {
                this.Field5 = var3;
            }
        }

        this.Field1 = var1;
    }
}
