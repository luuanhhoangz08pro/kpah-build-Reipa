package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class570 extends Class177 {
    private int Field1;
    private int Field15;
    private int Field16;
    private boolean Field17;

    public Class570(int var1, int var2, Class114 var3, Vector var4) {
        new Vector();
        super.Field7 = 2;
        super.Field5 = var1;
        super.Field6 = var2;

        for (int var6 = 0; var6 < 20; ++var6) {
            byte var7 = (byte) (20 - Class811.Field13(40));
            byte var5 = (byte) (20 - Class811.Field13(40));
            this.Field1 = var1 + var7;
            this.Field15 = var2 + var5;
        }

    }

    public final void Field1() {
        if (this.Field1 < super.Field5) {
            this.Field1 += this.Field16;
        }

        if (this.Field1 >= super.Field5) {
            this.Field1 -= this.Field16;
        }

        if (this.Field15 < super.Field6) {
            this.Field15 += this.Field16;
        }

        if (this.Field15 > super.Field6) {
            this.Field15 -= this.Field16;
        }

        ++this.Field16;
        if (Math.abs(super.Field5 - this.Field1) <= 5 && Math.abs(super.Field6 - this.Field15) <= 5) {
            this.Field17 = true;
            this.Field16 = 0;
            Class73.Field2.removeElement(this);
        }

    }

    public final void Field1(Graphics var1) {
        for (int var2 = 0; var2 < 5; ++var2) {
            if (!this.Field17) {
                var1.drawRegion(Class357.Field53, 0, 7, 7, 7, 0, this.Field1, this.Field15, 0);
                var1.drawRegion(Class357.Field53, 0, 14, 7, 7, 0, this.Field1 + 7 - Class811.Field13(15), this.Field15 + 7 - Class811.Field13(15), 0);
            }
        }

    }
}
