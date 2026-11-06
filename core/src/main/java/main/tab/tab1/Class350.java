package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

public final class Class350 extends Class672 {
    public Image Field1;
    public byte Field2;
    public byte Field3;
    public byte Field4;
    private byte Field5;

    public Class350() {
        super.Field188 = 100;
    }

    public final void Field1(Graphics var1) {
        if (this.Field1 != null) {
            var1.drawRegion(this.Field1, 0, this.Field5 * super.Field195, this.Field1.getWidth(), super.Field195, 0, super.Field193 + 8, super.Field194 + 8, 33);
        }

    }

    public final void Field1(short var1, short var2) {
        super.Field193 = var1;
        super.Field194 = var2;
    }

    public final void a_(Graphics var1) {
    }

    public final void Field2() {
        if (Class105.Field12 % 3 == 0) {
            this.Field5 = (byte) ((this.Field5 + 1) % this.Field4);
        }

    }
}
