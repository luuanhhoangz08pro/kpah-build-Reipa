package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

public final class Class213 extends Class173 {
    private int Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;

    public Class213(int var1, int var2, int var3) {
        this.Field1 = Class105.Field1(var1 - 10, var1 + 10);
        this.Field15 = Class105.Field1(var2 - 10, var2 + 10);
        this.Field16 = var3;
        super.Field8 = 0;
    }

    public Class213(int var1, int var2, Class111 var3) {
        this.Field1 = var1;
        this.Field15 = var2;
        this.Field18 = var3.Field194;
        super.Field8 = 1;
    }

    public final void Field1() {
        if (super.Field8 == 0) {
            ++this.Field17;
            if (this.Field17 > 50) {
                Class74.Field2.removeElement(this);
                Class74.Field1.removeElement(this);
                this.Field17 = 0;
                return;
            }
        } else {
            this.Field15 += this.Field19;
            this.Field19 += 2;
            if (this.Field15 > this.Field18) {
                this.Field19 = 0;
                Class74.Field2.removeElement(this);
            }
        }

    }

    public final void Field1(Graphics var1) {
        Image var2;
        if (super.Field8 == 0) {
            if (this.Field17 > 0 && (var2 = Class804.Field3(7)) != null) {
                var1.drawRegion(var2, 0, 38, 20, 18, this.Field16, this.Field1, this.Field15, 3);
                return;
            }
        } else if ((var2 = Class804.Field6(5)) != null) {
            var1.drawRegion(var2, 0, 0, 32, 32, 0, this.Field1, this.Field15, 3);
            var1.drawRegion(var2, 0, 32, 32, 32, 0, this.Field1, this.Field15, 3);
            var1.drawRegion(var2, 0, 0, 32, 32, 0, this.Field1 + 2, this.Field15 + 2, 3);
            var1.drawRegion(var2, 0, 32, 32, 32, 0, this.Field1 + 2, this.Field15 + 2, 3);
        }

    }
}
