package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class19 extends Class177 {
    private int Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int[] Field19 = new int[]{-10, 12, 0};
    private int[] Field20 = new int[]{0, 1};

    public Class19(int var1, int var2) {
        super.Field5 = var1;
        super.Field6 = var2;
        this.Field1 = Class106.Field1(-1, 3);
        this.Field16 = Class106.Field1(5, 10);
        this.Field17 = var2 + this.Field19[Math.abs(Class106.Field20.nextInt() % this.Field19.length)];
        this.Field18 = this.Field20[Class809.Field4(Class106.Field20.nextInt() % this.Field20.length)];
    }

    public final void Field1(Graphics var1) {
        Image var2;
        if ((var2 = Class811.Field4(60)) != null) {
            var1.drawImage(var2, super.Field5, super.Field6, 3);
        }

    }

    public final void Field1() {
        if (this.Field18 >= 0) {
            --this.Field18;
        }

        if (this.Field18 < 0) {
            super.Field5 += this.Field1;
            super.Field6 += this.Field15;
            if (this.Field15 < 10) {
                this.Field15 += 2;
            }

            if (super.Field6 >= this.Field17) {
                this.Field15 = -this.Field16;
                this.Field16 /= 3;
            }

            if (this.Field16 <= 2) {
                this.Field1 = 0;
                super.Field10 = true;
            }
        }

    }
}
