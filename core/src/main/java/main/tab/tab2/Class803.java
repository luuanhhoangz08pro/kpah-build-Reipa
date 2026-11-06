package main.tab.tab2;

import main.lib.Graphics;

public final class Class803 extends Class177 {
    private Class114 Field1;
    private boolean Field15 = false;
    private boolean Field16;
    private int Field17 = 0;

    public Class803(Class114 var1, int var2, int var3, boolean var4) {
        super.Field5 = var2;
        super.Field6 = var3;
        this.Field1 = var1;
        this.Field16 = var4;
    }

    public final void Field1() {
        int var1;
        if (!this.Field15) {
            var1 = Class809.Field1(this.Field1.Field193 - super.Field5, -(this.Field1.Field194 - super.Field6));
            int var2 = 10 * Class809.Field2(var1) >> 10;
            int var3 = -(10 * Class809.Field1(var1)) >> 10;
            super.Field5 += var2;
            super.Field6 += var3;
            Class73.Field2(super.Field5, super.Field6, this.Field16 ? 35 : 4);
            if (Class809.Field1(super.Field5, super.Field6, this.Field1.Field193, this.Field1.Field194) <= 10) {
                this.Field15 = true;
                return;
            }
        } else if (Class106.Field12 % 2 == 0) {
            for (var1 = 0; var1 < 5; ++var1) {
                byte var4 = (byte) (20 - Class811.Field13(40));
                byte var5 = (byte) (10 - Class811.Field13(20));
                Class73.Field2(this.Field1.Field193 + var4, this.Field1.Field194 + var5, 35);
            }

            ++this.Field17;
            if (this.Field17 > 3) {
                Class73.Field1.removeElement(this);
            }
        }

    }

    public final void Field1(Graphics var1) {
    }
}
