package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class373 extends Class177 {
    private static Class565 Field1;
    private static Image Field15;
    private int Field16 = 120;
    private byte Field17 = 0;
    private byte Field18 = 5;
    private byte Field19 = 10;
    private byte Field20;

    static {
        try {
            Field1 = new Class565(Image.createImage("/sword skill/kiem01.png"), 12, 39);
            Field15 = Image.createImage("/sword skill/all1.png");
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    public Class373(int var1, int var2) {
        super.Field5 = var1;
        super.Field6 = var2;
        Class177 var3;
        (var3 = new Class177(var1, var2, 34)).Field12 = 3;
        Class73.Field1.addElement(var3);
    }

    public final void Field1() {
        if (this.Field19 > 0) {
            --this.Field19;
        }

        if (this.Field19 <= 0 && this.Field16 > 0) {
            this.Field16 -= this.Field18;
            this.Field18 = (byte) (this.Field18 + 5);
            if (this.Field16 < 0) {
                this.Field16 = 0;
                Class73.Field2.removeElement(this);
                Class73.Field1.addElement(this);
            }
        }

        if (this.Field16 == 0 && Class106.Field12 % 2 == 1) {
            for (int var1 = 0; var1 < 10; ++var1) {
                int var2 = this.Field20 * Class809.Field2(var1 * 36) >> 10;
                int var3 = (var3 = -(this.Field20 * Class809.Field1(var1 * 36)) >> 10) + (-(var3 / 3) << 1);
                Class73.Field2(super.Field5 + var2, super.Field6 + var3 - 10, 15);
            }

            this.Field20 = (byte) (this.Field20 + 10);
            if (this.Field20 == 30) {
                Class73.Field1.removeElement(this);
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field16 > 0) {
            Field1.Field1(this.Field17 / 3, super.Field5, super.Field6 - this.Field16, 0, 33, var1);
        } else {
            var1.drawImage(Field15, super.Field5, super.Field6, 33);
        }

        ++this.Field17;
        if (this.Field17 >= 6) {
            this.Field17 = 0;
        }

    }
}
