package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class798 extends Class671 {
    private static Class798 Field3;
    private Vector Field4;
    private short Field5;
    private short Field6;
    private Class671 Field7;
    private int Field8 = 0;
    private int Field9 = -1;
    private short Field10 = -1;
    private String Field11;
    private String Field12 = "";
    private static int Field13;
    private static int Field14;
    private static int Field15;
    private static int Field16;
    private static int Field17;
    private static int Field18 = 0;
    private static int Field19 = 0;
    int Field1 = 0;
    int Field2 = 1;

    public static Class798 Field5() {
        return Field3 == null ? (Field3 = new Class798()) : Field3;
    }

    public final void Field1() {
        if (this.Field7 == null) {
            this.Field7 = Class106.Field17;
        }

        super.Field1();
    }

    public Class798() {
        super.Field105 = new Class86("Đóng", new Class78(this));
        super.Field103 = new Class86("Menu", new Class84(this));
        this.Field5 = 150;
        this.Field6 = 170;
        Field19 = (this.Field6 - 30) / 2 / 14;
    }

    public final void Field1(String var1, String var2) {
        this.Field11 = var1;
        this.Field8 = 2;
        this.Field4 = new Vector();
        String[] var3 = Class21.Field10[0].Field1(var2, this.Field5 - 15);

        for (int var4 = 0; var4 < var3.length; ++var4) {
            this.Field4.addElement(var3[var4]);
        }

        this.Field6();
    }

    private void Field6() {
        if ((Field17 = this.Field4.size() * 14 - (this.Field6 - 25) + 20) < 0) {
            Field17 = 0;
        }

        Field13 = 0;
        Field14 = 0;
        Field18 = Field19;
    }

    public final void Field1(Class830 var1) {
        this.Field11 = var1.Field2.toUpperCase();
        this.Field8 = 0;
        this.Field10 = var1.Field1;
        this.Field4 = new Vector();
        this.Field12 = var1.Field5;
        this.Field4.addElement("Bang chủ: " + var1.Field3);
        this.Field4.addElement("Cấp độ: " + var1.Field7);
        this.Field4.addElement("Xu: " + Class106.Field1(var1.Field9));
        this.Field4.addElement("Thành viên: " + var1.Field8);
        this.Field4.addElement("Điểm cống hiến: " + var1.Field12);
        this.Field4.addElement("Điểm kinh ngiệm: " + var1.Field10);
        this.Field4.addElement("Thành lập: " + var1.Field4);
        this.Field9 = var1.Field13;
        if (var1.Field11) {
            String[] var3 = Class21.Field10[0].Field1(var1.Field6, this.Field5 - 15);

            for (int var2 = 0; var2 < var3.length; ++var2) {
                this.Field4.addElement(var3[var2]);
            }
        }

        this.Field6();
    }

    public final void Field3() {
        boolean var1 = false;
        if (Class106.Field5[2]) {
            if (--Field18 < Field19) {
                Field18 = Field19;
            }

            var1 = true;
        } else if (Class106.Field5[8]) {
            var1 = true;
            if (Field14 < Field17) {
                ++Field18;
            }

            if (Field18 > this.Field4.size() - Field19 + 1) {
                Field18 = this.Field4.size() - Field19 + 1;
            }
        }

        if (var1) {
            if ((Field13 = Field18 * 14 - (this.Field6 - 25) / 2) < 0) {
                Field13 = 0;
            }

            if (Field13 > Field17) {
                Field13 = Field17;
            }
        }

        if (Field14 != Field13) {
            Field16 = Field13 - Field14 << 2;
            Field15 += Field16;
            Field14 += Field15 >> 4;
            Field15 &= 15;
        }

        super.Field3();
        if (this.Field7 != null) {
            this.Field7.Field4();
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field7 != null) {
            this.Field7.Field1(var1);
        }

        Class106.Field1(var1);
        var1.translate(Class106.Field15 - this.Field5 / 2, Class106.Field16 - this.Field6 / 2);
        Class811.Field4(var1, 0, 0, this.Field5, this.Field6);
        var1.setClip(0, 0, this.Field5, this.Field6);
        Class21.Field3.Field1(var1, this.Field11, this.Field5 >> 1, 4, 2);
        var1.setClip(0, 27, this.Field5, this.Field6 - 30);
        var1.translate(0, -Field14);
        Class798 var2;
        Graphics var3;
        int var4;
        int var5;
        String var6;
        if (this.Field8 == 2) {
            var3 = var1;
            var2 = this;
            var4 = 34;
            if (this.Field10 != -1) {
                Class379.Field1(var1, (short) (this.Field10 + 1000), this.Field5 / 2, 34);
                var4 += 6;
            }

            if (this.Field8 == 0 && !this.Field12.equals("")) {
                if ((var5 = Class21.Field8.Field1(this.Field12)) > this.Field5) {
                    if (this.Field2 == 1) {
                        --this.Field1;
                    } else {
                        ++this.Field1;
                    }

                    if (Math.abs(this.Field1) > var5 / 2 - this.Field5 / 2 + 10) {
                        this.Field2 = -this.Field2;
                    }
                }

                var1.setClip(3, 0, this.Field5 - 6, this.Field6);
                Class21.Field2.Field1(var1, this.Field12, (this.Field5 >> 1) + this.Field1, var4, 2);
                var4 += 14;
            }

            for (var5 = 0; var5 < var2.Field4.size(); ++var5) {
                var6 = (String) var2.Field4.elementAt(var5);
                Class21.Field8.Field1(var3, var6, 5, var4, 0);
                var4 += 14;
            }
        } else {
            var3 = var1;
            var2 = this;
            var4 = 34;
            if (this.Field9 > -1) {
                var1.drawRegion(Class811.Field41, 0, this.Field9 * 12, 12, 12, 0, 5, 34, 20);
                var4 += 15;
            }

            for (var5 = 0; var5 < var2.Field4.size(); ++var5) {
                var6 = (String) var2.Field4.elementAt(var5);
                Class21.Field8.Field1(var3, var6, 5, var4, 0);
                var4 += 14;
            }
        }

        super.Field1(var1);
    }

    static Class671 Field1(Class798 var0) {
        return var0.Field7;
    }

    static void Field1(Class798 var0, Class671 var1) {
        var0.Field7 = null;
    }

    static Vector Field2(Class798 var0) {
        return var0.Field4;
    }

    static void Field3(Class798 var0) {
        Field3 = null;
    }

    static int Field4(Class798 var0) {
        return var0.Field8;
    }

    static void Field1(Class798 var0, String var1) {
        var0.Field12 = var1;
    }

    static short Field5(Class798 var0) {
        return var0.Field10;
    }
}
