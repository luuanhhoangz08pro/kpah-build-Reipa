package main.tab.tab1;

import main.lib.Graphics;

public final class Class638 extends Class123 {
    private int Field62;
    private int Field63;
    private int Field64;

    public final void Field2() {
        switch (super.Field204) {
            case 5:
                super.Field23 = 3;
                ++super.Field39;
                super.Field193 += super.Field40;
                super.Field194 += super.Field41;
                super.Field40 = (short) (super.Field40 >> 1);
                super.Field41 = (short) (super.Field41 >> 1);
                if (super.Field39 == 5) {
                    Class105.Field19.Field1(super.Field193, super.Field194);
                }

                if (super.Field39 > 7) {
                    Class105.Field19.Field10.removeElement(this);
                    Class63.Field49 = null;
                }
            default:
                this.Field62 = 0;
                this.Field63 = 0;
                if (this.Field64 > 0) {
                    --this.Field64;
                    this.Field62 = Class804.Field13(2) - 1;
                    this.Field63 = Class804.Field13(2) - 1;
                }

        }
    }

    public final void Field2(int var1) {
        super.Field2(var1);
        this.Field64 = 20;
    }

    public final void Field1(Class672 var1) {
    }

    public final void Field1(Graphics var1) {
        if (Class804.Field46[super.Field42] != null && Class804.Field46[super.Field42].Field1 != null) {
            var1.drawRegion(Class804.Field46[super.Field42].Field1, 32, 0, 48, 89, 0, super.Field193 - 48 + this.Field62, super.Field194 + this.Field63, 36);
            var1.drawRegion(Class804.Field46[super.Field42].Field1, 32, 0, 48, 89, 2, super.Field193 + this.Field62, super.Field194 + this.Field63, 36);
            var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, 9, 32, 76, 0, super.Field193 - 127 - 48, super.Field194, 36);
            var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, 9, 32, 76, 2, super.Field193 - 127 + 31 - 48, super.Field194, 36);
            var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, 9, 32, 76, 0, super.Field193 + 161 - 48, super.Field194, 36);
            var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, 9, 32, 76, 2, super.Field193 + 161 + 31 - 48, super.Field194, 36);
        }

    }
}
