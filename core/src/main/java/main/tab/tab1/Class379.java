package main.tab.tab1;

import main.lib.Graphics;

import java.util.Vector;

public final class Class379 extends Class665 {
    private static Class379 Field5;
    public Class665 Field1;
    private Class433 Field6 = new Class433();
    public static Vector Field2 = new Vector();
    private static int Field7;
    private static int Field8;
    private static int Field9;
    private static int Field10;
    public static int Field3;
    private static int Field11 = 8;
    private static int Field12;
    public static short Field4 = 32;
    private int Field13 = 20;

    public static Class379 Field5() {
        return Field5 == null ? (Field5 = new Class379()) : Field5;
    }

    public final void Field6() {
        this.Field6.Field1();
        Field2 = new Vector();
        Field4 = 32;
        Field3 = 0;
    }

    public final void Field1(Graphics var1) {
        if (this.Field1 != null) {
            this.Field1.Field1(var1);
        }

        Class105.Field1(var1);
        Class804.Field3(var1, Field7, Field8, Field9, Field10);
        short var2 = Field4;
        this.Field6.Field1(var2 / Field11, this.Field13, Field7 + 5, Field8 + 5, Field9, Field10 - 5, true, 8);
        this.Field6.Field1(var1, Field7 + 5, Field8 + 5, Field9, Field10 - 3);
        int var6 = Field3 / Field11;
        int var3 = Field3 - var6 * Field11;
        var1.setColor(10595790);
        var1.fillRect(Field7 + var3 * this.Field13 + 5, Field8 + var6 * this.Field13 + 5, this.Field13, this.Field13);
        byte var7 = 0;
        byte var8 = 0;

        int var4;
        Class766 var5;
        for (var4 = 0; var4 < Field2.size() && (var5 = (Class766) Field2.elementAt(var4)).Field2 == 1; ++var4) {
            var5.Field1(var1, Field7 + var7 * this.Field13 + this.Field13 / 2 + 5, Field8 + var8 * this.Field13 + this.Field13 / 2 + 5);
            if (++var7 >= Field11) {
                var7 = 0;
                ++var8;
            }
        }

        for (var4 = 0; var4 < Field12; ++var4) {
            for (int var9 = 0; var9 < Field11; ++var9) {
                var1.setColor(8684162);
                var1.drawRect(Field7 + var9 * this.Field13 + 5, Field8 + var4 * this.Field13 + 5, this.Field13, this.Field13);
            }
        }

        super.Field1(var1);
    }

    public final void Field1() {
        super.Field1();
        super.Field104 = new Class87("Chọn", new Class374(this));
        super.Field103 = new Class87("Quay số", new Class372(this));
        super.Field105 = new Class87("Đóng", new Class373(this));
        this.Field6.Field1();
    }

    public static void Field7() {
        Class766 var0;
        if (Field3 < Field2.size() && Field3 >= 0 && (var0 = (Class766) Field2.elementAt(Field3)).Field2 == 1) {
            Class105.Field1(var0.Field5 == null ? new String[]{var0.Field4} : var0.Field5);
        }

    }

    public Class379() {
        Field7 = Class105.Field13 / 2 - 80 - 10;
        Field8 = Class105.Field16 - 40 - 10;
        Field9 = 170;
        Field10 = 90;
    }

    public final void Field4() {
        if (this.Field1 != null) {
            this.Field1.Field4();
        }

        if (Class105.Field23 == null) {
            Class47 var1;
            if ((var1 = this.Field6.Field2()).Field1 || var1.Field3) {
                Field3 = var1.Field2;
            }

            Field12 = Field4 / Field11;
            this.Field6.Field3();
        }

        super.Field4();
    }

    public final void Field3() {
        if (Class105.Field3[2]) {
            Class105.Field3[2] = false;
            if (Field3 >= 0 && Field3 < Field11) {
                Field3 = 0;
            } else if (Field3 - Field11 >= 0) {
                Field3 -= Field11;
            }

            this.Field6.Field1(Field3 / Field11 * this.Field13);
        } else if (Class105.Field3[8]) {
            Class105.Field3[8] = false;
            if (Field3 + Field11 <= Field4 - 1) {
                Field3 += Field11;
            }

            this.Field6.Field1(Field3 / Field11 * this.Field13);
        } else if (Class105.Field3[4]) {
            Class105.Field3[4] = false;
            if (--Field3 < 0) {
                Field3 = Field4 - 1;
            }

            this.Field6.Field1(Field3 / Field11 * this.Field13);
        } else if (Class105.Field3[6]) {
            Class105.Field3[6] = false;
            if (++Field3 > Field4) {
                Field3 = 0;
            }

            this.Field6.Field1(Field3 / Field11 * this.Field13);
        }

        super.Field3();
    }
}
