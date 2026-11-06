package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class259 extends Class671 {
    private static Class259 Field1;
    private int Field2;
    private int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private Vector Field9 = new Vector();
    private int Field10 = -1;
    private int Field11;
    private int Field12;

    public static Class259 Field5() {
        return Field1 == null ? (Field1 = new Class259()) : Field1;
    }

    public final void Field1(int var1, int var2, int var3) {
        this.Field10 = var1;
        this.Field11 = var2;
        this.Field12 = var3;
    }

    public final void Field4() {
        if (this.Field10 > -1 && System.currentTimeMillis() / 1000L - (long) this.Field8 > 30L) {
            this.Field8 = (int) (System.currentTimeMillis() / 1000L);
            Class261.Field1().Field2(this.Field10, this.Field11, this.Field12);
        }

        Class259 var5;
        Class259 var10000 = var5 = this;
        var10000.Field6 += 15;
        if (var5.Field6 >= 360) {
            var5.Field6 -= 360;
        }

        int var1;
        if ((var1 = var5.Field6 - 15) < 0) {
            var1 += 360;
        }

        int var2 = var5.Field7 * Class809.Field2(Class809.Field3(var5.Field6)) >> 10;
        int var3 = -(var5.Field7 * Class809.Field1(Class809.Field3(var5.Field6))) >> 10;
        int var4 = var5.Field7 * Class809.Field2(Class809.Field3(var1)) >> 10;
        var1 = -(var5.Field7 * Class809.Field1(Class809.Field3(var1))) >> 10;
        if (var5.Field7 < 30) {
            ++var5.Field7;
        }

        var5.Field2 = Class106.Field15 + var2;
        var5.Field3 = Class106.Field16 + var3;
        var1 = Class804.Field2(Class809.Field1(var5.Field2 - (Class106.Field15 + var4), -(var5.Field3 - (Class106.Field16 + var1))));
        var5.Field4 = Class804.Field5[var1];
        var5.Field5 = Class804.Field4[var1];
        var5.Field9.addElement(new Class384(var5.Field2, var5.Field3));

        for (var1 = 0; var1 < var5.Field9.size(); ++var1) {
            Class384 var6;
            ++(var6 = (Class384) var5.Field9.elementAt(var1)).Field6;
            if (var6.Field6 >= 20) {
                var5.Field9.removeElement(var6);
            }
        }

    }

    public final void Field1(Graphics var1) {
        var1.setColor(0);
        var1.fillRect(0, 0, Class106.Field13, Class106.Field14);

        for (int var2 = 0; var2 < this.Field9.size(); ++var2) {
            Class384 var3 = (Class384) this.Field9.elementAt(var2);
            if (Class811.Field4(8) != null) {
                var1.drawRegion(Class811.Field4(8), 0, var3.Field6 / 2 * 10, 10, 10, 0, var3.Field1, var3.Field2, 3);
            }
        }

        if (Class811.Field3(3) != null) {
            var1.drawRegion(Class811.Field3(3), 0, this.Field4 * 24, 24, 24, this.Field5, this.Field2, this.Field3, 3);
        }

    }

    public final void Field1() {
        this.Field6 = 0;
        this.Field7 = 5;
        this.Field9.removeAllElements();
        this.Field8 = (int) (System.currentTimeMillis() / 1000L);
        super.Field1();
    }
}
