package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class216 extends Class177 {
    private int Field1;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;

    public Class216(int var1, int var2, int var3) {
        this.Field1 = Class106.Field1(var1 - 10, var1 + 10);
        this.Field15 = Class106.Field1(var2 - 10, var2 + 10);
        this.Field16 = var3;
        super.Field8 = 0;
    }

    public Class216(int var1, int var2, Class114 var3) {
        this.Field1 = var1;
        this.Field15 = var2;
        this.Field18 = var3.Field194;
        super.Field8 = 1;
    }

    public final void Field1() {
        if (super.Field8 == 0) {
            ++this.Field17;
            if (this.Field17 > 50) {
                Class73.Field2.removeElement(this);
                Class73.Field1.removeElement(this);
                this.Field17 = 0;
                return;
            }
        } else {
            this.Field15 += this.Field19;
            this.Field19 += 2;
            if (this.Field15 > this.Field18) {
                this.Field19 = 0;
                Class73.Field2.removeElement(this);
            }
        }

    }

    public final void Field1(Graphics var1) {
        Image var2;
        if (super.Field8 == 0) {
            if (this.Field17 > 0 && (var2 = Class811.Field3(7)) != null) {
                var1.drawRegion(var2, 0, 38, 20, 18, this.Field16, this.Field1, this.Field15, 3);
                return;
            }
        } else if ((var2 = Class811.Field6(5)) != null) {
            var1.drawRegion(var2, 0, 0, 32, 32, 0, this.Field1, this.Field15, 3);
            var1.drawRegion(var2, 0, 32, 32, 32, 0, this.Field1, this.Field15, 3);
            var1.drawRegion(var2, 0, 0, 32, 32, 0, this.Field1 + 2, this.Field15 + 2, 3);
            var1.drawRegion(var2, 0, 32, 32, 32, 0, this.Field1 + 2, this.Field15 + 2, 3);
        }

    }
}
