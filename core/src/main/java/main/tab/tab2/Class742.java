package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class742 extends Class260 {
    public short Field5;
    public byte Field6;
    private byte Field7;

    public Class742() {
        super.Field4 = 1;
        super.Field188 = 2;
    }

    public final void Field1(Graphics var1) {
        Class176 var2;
        if ((var2 = Class379.Field1((short) (this.Field5 + 4200))) != null && !var2.Field3) {
            int var10003 = super.Field195 * this.Field7;
            var1.drawRegion(Class379.Field1((short) (this.Field5 + 4200)).Field1, 0, var10003, super.Field196, super.Field195, 0, super.Field193, super.Field194, 33);
        }

        Image var3;
        if (!(var3 = Class62.Field5(super.Field1)).equals(Class811.Field12)) {
            var1.drawImage(var3, super.Field193, super.Field194 - super.Field195 - 5, 33);
        }

    }

    public final void a_(Graphics var1, int var2, int var3) {
        var1.setClip(var2 - 10, 32 - super.Field195, 20, 22);
        Class176 var4;
        if ((var4 = Class379.Field1((short) (this.Field5 + 4200))) != null && !var4.Field3) {
            int var10008 = 32 - super.Field195;
            var1.drawRegion(Class379.Field1((short) (this.Field5 + 4200)).Field1, 0, 0, super.Field196, super.Field195, 0, var2, var10008, 17);
        }

    }

    public final void Field2() {
        if (super.Field203 != 1) {
            super.Field2();
        } else {
            if (Class106.Field12 % 4 == 0) {
                ++this.Field7;
            }

            if (this.Field7 >= this.Field6) {
                this.Field7 = 0;
            }

        }
    }

    public final void Field1(short var1, short var2) {
    }

    public final boolean d_() {
        return true;
    }

    public final int e_() {
        return super.Field4;
    }
}
