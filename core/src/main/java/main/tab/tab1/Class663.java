package main.tab.tab1;

import main.lib.Graphics;

public final class Class663 extends Class173 {
    private byte Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private byte[] Field19;

    public Class663(int var1, int var2, int var3, int var4, int var5) {
        byte[] var10000 = new byte[]{0, 1, 2, 3};
        this.Field17 = 1;
        this.Field19 = new byte[]{-2, -1, 0, 1, 2};
        var10000 = new byte[]{2, 10, 6};
        super.Field5 = var1;
        super.Field6 = var2;
        this.Field15 = var3;
        this.Field16 = var4;
        super.Field8 = -1;
        if (var5 == -1) {
            this.Field17 = Class105.Field1(5, 15);
            this.Field1 = this.Field19[Math.abs(Class105.Field20.nextInt() % this.Field19.length)];
        }

    }

    public final void Field1(Graphics var1) {
        var1.setColor(15267833);
        var1.fillRect(super.Field5, super.Field6, 2, 2);
    }

    public final void Field1() {
        if (this.Field15 >= 0) {
            --this.Field15;
        }

        if (this.Field15 < 0) {
            super.Field6 += this.Field18;
        }

        super.Field5 += this.Field1;
        if (this.Field18 < 10) {
            ++this.Field18;
        }

        if (this.Field17 != 0) {
            super.Field5 += this.Field19[Math.abs(Class105.Field20.nextInt() % this.Field19.length)];
            this.Field18 = -this.Field17;
            this.Field17 = 0;
        }

        if (super.Field6 >= this.Field16) {
            super.Field10 = true;
        }

    }
}
