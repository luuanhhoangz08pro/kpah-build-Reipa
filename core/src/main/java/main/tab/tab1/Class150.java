package main.tab.tab1;

import main.lib.Graphics;

public final class Class150 {
    public String Field1;
    public String[] Field2;
    private int Field3;
    private int Field4;
    private long Field5 = -1L;

    public Class150(String var1) {
        this.Field1 = var1;
        this.Field2 = Class21.Field8.Field1(var1, Class105.Field13 - 8);
        this.Field4 = Class21.Field8.Field1(this.Field2[0]);
        this.Field3 = Class105.Field13 + this.Field4 / 2;
    }

    public final void Field1(Graphics var1) {
        for (int var2 = 0; var2 < this.Field2.length; ++var2) {
            Class21.Field8.Field1(var1, this.Field2[var2], this.Field3, 1 + var2 * 13 + (Class105.Field19.Field79 == null ? 0 : 18), 2);
        }

    }

    public final void Field1() {
        if (this.Field3 != Class105.Field13 / 2) {
            if (Class105.Field13 / 2 - this.Field3 >> 1 == 0) {
                this.Field3 = Class105.Field13 / 2;
            } else {
                this.Field3 += Class105.Field13 / 2 - this.Field3 >> 1;
            }
        }

        if (this.Field3 == Class105.Field13 / 2) {
            if (this.Field5 == -1L) {
                this.Field5 = System.currentTimeMillis() / 1000L + 6L;
            }

            if (this.Field5 - System.currentTimeMillis() / 1000L <= 0L) {
                Class63.Field62.removeElement(this);
            }
        }

    }
}
