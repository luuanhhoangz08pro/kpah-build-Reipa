package main.tab.tab2;

import main.lib.Graphics;

public final class Class80 {
    private long Field2;
    private int Field3;
    public boolean Field1;
    private String Field4 = "";
    private int Field5;
    private int Field6;

    public Class80(long var1, String var3) {
        this.Field4 = var3;
        this.Field2 = var1;
        this.Field3 = 60;
        this.Field5 = (int) (this.Field2 - System.currentTimeMillis());
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        boolean var4 = false;
        long var5 = this.Field2 - System.currentTimeMillis();
        int var7 = (int) (60L - var5 * (long) this.Field3 / (long) this.Field5);
        var1.drawRegion(Class62.Field57[1], 0, 9, 62, 9, 0, var2, var3, 0);
        var1.drawRegion(Class62.Field57[0], 0, 7, var7, 7, 0, var2, var3 + 1, 0);
        Class21.Field5.Field1(var1, this.Field4, var2 + this.Field3 / 2 + 1, var3 - 10 + 1 - 3, 2);
        Class21.Field8.Field1(var1, this.Field4, var2 + this.Field3 / 2, var3 - 10 - 3, 2);
        Class21.Field8.Field1(var1, this.Field6 + "%", var2 + this.Field3 / 2, var3, 2);
    }

    public final void Field1() {
        long var1 = this.Field2 - System.currentTimeMillis();
        this.Field6 = (int) (100L - var1 * 100L / (long) this.Field5);
        if (this.Field2 - System.currentTimeMillis() <= 0L) {
            this.Field1 = true;
        }

    }
}
