package main.tab.tab2;

import main.lib.Graphics;

import java.util.Vector;

public final class Class104 extends Class671 {
    public static Class104 Field1;
    private Vector Field3;
    private int Field4 = 1;
    private Class671 Field5;
    private int Field6 = 60;
    private int Field7 = 20;
    private int Field8 = 10;
    private int Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private static int Field13;
    private static int Field14;
    private static int Field15;
    private static int Field16;
    private static int Field17;
    private static int Field18 = 0;
    private static int Field19;
    private static int Field20;
    private Class776 Field21;
    private Class776 Field22;
    private Class194 Field23;
    public static byte Field2 = 0;

    public static Class104 Field5() {
        return Field1 == null ? (Field1 = new Class104()) : Field1;
    }

    public final void Field1() {
        this.Field5 = Class106.Field17;
        this.Field8();
        Field2 = 0;
        System.currentTimeMillis();
        super.Field1();
        this.Field2();
    }

    public Class104() {
        super.Field103 = new Class86("Menu", new Class134(this));
        this.Field23 = new Class194();
        this.Field2();
        this.Field23.Field5 = true;
        this.Field3 = new Vector();
        this.Field22 = new Class776("Tin đến", (Class86) null, (Class86) null, false);
        this.Field4 = 0;
        this.Field22.Field5 = new Vector();
        this.Field3.addElement(this.Field22);
        this.Field8();
        this.Field6();
    }

    public final void Field2() {
        this.Field9 = Class106.Field13 - 48;
        this.Field10 = Class106.Field14 - 64;
        this.Field11 = this.Field12 = 24;
        this.Field23.Field1 = this.Field11 + 4;
        this.Field23.Field2 = this.Field12 + this.Field10 - 25;
        this.Field23.Field4 = 20;
        this.Field23.Field3 = this.Field9 - 8;
        this.Field6();
    }

    public final void Field6() {
        if (this.Field3 != null && this.Field21 != null) {
            this.Field8 = 20;
            this.Field6 = this.Field9 - this.Field8 * this.Field3.size() + this.Field8 - 1;
            if (this.Field6 < Class21.Field2.Field1(this.Field21.Field4) + 15) {
                this.Field6 = Class21.Field2.Field1(this.Field21.Field4) + 15;
                this.Field8 = (this.Field9 - this.Field6) / (this.Field3.size() - 1);
            }

            if (this.Field3.size() == 1) {
                this.Field6 = this.Field9 - 1;
            }
        }

    }

    public final void Field1(String var1) {
        for (int var2 = 0; var2 < this.Field3.size(); ++var2) {
            Class776 var3;
            if ((var3 = (Class776) this.Field3.elementAt(var2)).Field4.equals(var1)) {
                var3.Field7 = false;
                this.Field21 = var3;
                this.Field4 = var2;
            }
        }

    }

    public final void Field1(String var1, String var2) {
        Class776 var3 = null;
        if (var2 != null && !var2.equals(this.Field22.Field4)) {
            String var4 = var2;
            Class104 var9 = this;

            Class776 var10000;
            label53:
            {
                for (int var5 = 0; var5 < var9.Field3.size(); ++var5) {
                    Class776 var6;
                    if ((var6 = (Class776) var9.Field3.elementAt(var5)).Field4.equals(var4)) {
                        var10000 = var6;
                        break label53;
                    }
                }

                var10000 = null;
            }

            var3 = var10000;
            if (this != Class106.Field17) {
                Field2 = 1;
            }
        } else {
            var3 = this.Field22;
        }

        if (var3 == null) {
            (var3 = new Class776(var2, new Class86("Chat", new Class179(this)), this.Field23.Field9, true)).Field5 = new Vector();
            this.Field3.addElement(var3);
            this.Field6();
        }

        if (!var1.equals("")) {
            String[] var7 = Class21.Field8.Field1(var1, this.Field9 - 20);

            for (int var8 = 0; var8 < var7.length; ++var8) {
                var3.Field5.addElement(var7[var8]);
                if (var3.Field5.size() > 50) {
                    var3.Field5.removeElementAt(0);
                }
            }
        }

        if (var3 == this.Field21) {
            if (Field18 + 1 == this.Field21.Field5.size() - Field19) {
                Field13 = (Field18 = this.Field21.Field5.size() - Field19) * 14 - Field20 / 2;
            }

            if ((Field17 = this.Field21.Field5.size() * 14 - Field20 + 50) < 0) {
                Field17 = 0;
            }
        }

    }

    public final void Field7() {
        if (!this.Field23.Field5().equals("")) {
            System.currentTimeMillis();
            if (this.Field21.Field4.equals("Bang hội")) {
                Class261.Field1().Field5(this.Field23.Field5());
            } else {
                this.Field1(Class106.Field19.Field15.Field65 + ": " + this.Field23.Field5(), this.Field21.Field4);
                Class261.Field1().Field2(this.Field21.Field4, this.Field23.Field5());
            }

            this.Field23.Field1("");
        }
    }

    private void Field8() {
        this.Field21 = (Class776) this.Field3.elementAt(this.Field4);
        this.Field21.Field7 = false;
        Field20 = this.Field10 - this.Field7;
        if (this.Field21.Field6) {
            Field20 -= 21;
        }

        if ((Field17 = this.Field21.Field5.size() * 14 - Field20 + 50) < 0) {
            Field17 = 0;
        }

        Field13 = 0;
        Field14 = 0;
        Field18 = Field19 = (Field20 - 10) / 2 / 14;
        super.Field104 = this.Field21.Field1;
        super.Field105 = this.Field21.Field2;
    }

    public final void Field1(Graphics var1) {
        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
        this.Field5.Field1(var1);
        Class106.Field1(var1);
        super.Field1(var1);
        int var7 = this.Field10;
        int var6 = this.Field9;
        int var5 = this.Field12;
        int var4 = this.Field11;
        Graphics var3 = var1;
        Class104 var2 = this;
        var1.setColor(277044);
        var1.fillRect(var4, var5 + this.Field7, var6, var7 - this.Field7);

        int var8;
        for (var8 = 0; var8 < 3; ++var8) {
            var3.setColor(Class811.Field49[var8]);
            var3.drawRect(var4 + var8, var5 + var8 + var2.Field7, var6 - (var8 << 1) - 1, var7 - (var8 << 1) - var2.Field7 - 1);
        }

        Class776 var9;
        int var10;
        for (var8 = var2.Field3.size() - 1; var8 > var2.Field4; --var8) {
            var9 = (Class776) var2.Field3.elementAt(var8);

            for (var10 = 0; var10 < 3; ++var10) {
                var3.setColor(Class811.Field49[var10]);
                var3.drawRect(var4 + var10 + var8 * var2.Field8, var5 + var10, var2.Field6 - (var10 << 1), var2.Field7 - (var10 << 1));
            }

            ++var9.Field3;
            if (var9.Field3 > 10) {
                var9.Field3 = 0;
            }

            if (var9.Field7 && var9.Field3 >= 5) {
                var3.setColor(573098);
                var3.fillRect(var4 + 3 + var2.Field8 * var8, var5 + 3, var2.Field6 - 5, var2.Field7 - 3);
            } else {
                var3.setClip(var4 + var2.Field8 * var8 + var2.Field6 - var2.Field8, var5, var2.Field8 - 2, var2.Field7);
                var3.drawImage(Class811.Field29[2], var4 + var2.Field8 * var8 + 3 + var2.Field6 - 70, var5 + 3, 0);
                var3.setClip(var4, var5, var6, var7);
            }
        }

        int var12;
        for (var8 = 0; var8 <= var2.Field4; ++var8) {
            for (var12 = 0; var12 < 3; ++var12) {
                var3.setColor(Class811.Field49[var12]);
                var3.drawRect(var4 + var12 + var8 * var2.Field8, var5 + var12, var2.Field6 - (var12 << 1), var2.Field7 - (var12 << 1));
            }

            ++(var9 = (Class776) var2.Field3.elementAt(var8)).Field3;
            if (var9.Field3 > 10) {
                var9.Field3 = 0;
            }

            if (var9.Field7 && var9.Field3 >= 5) {
                var3.setColor(573098);
                var3.fillRect(var4 + 3 + var2.Field8 * var8, var5 + 3, var2.Field6 - 5, var2.Field7 - 3 + (var8 == var2.Field4 ? 4 : 0));
            } else if (var8 == var2.Field4) {
                var3.setClip(var4 + var2.Field8 * var8 + 3, var5, var2.Field6 - 5, var2.Field7 + 3);

                for (var10 = 0; var10 < var2.Field6 / 70 + 1; ++var10) {
                    var3.drawImage(Class811.Field29[2], var4 + 3 + var2.Field8 * var8 + var10 * 70, var5 + 3, 0);
                }
            } else {
                var3.setClip(var4 + var2.Field8 * var8, var5, var2.Field8, var2.Field7);
                var3.drawImage(Class811.Field29[2], var4 + var2.Field8 * var8 + 3, var5 + 3, 0);
            }

            var3.setClip(var4 - 4, var5 - 4, var6 + 8, var7 + 9);
        }

        var3.drawImage(Class811.Field29[0], var4 - 2 + var2.Field8 * var2.Field4, var5 - 2, 0);
        var3.drawRegion(Class811.Field29[0], 0, 0, 18, 19, 2, var4 + 3 + var2.Field6 + var2.Field8 * var2.Field4, var5 - 2, 24);

        for (var8 = 0; var8 < 2; ++var8) {
            for (var12 = 0; var12 < 2; ++var12) {
                var3.setColor(Class811.Field49[var8 == 0 ? var12 + 1 : 2 - var12]);
                var3.fillRect(var4 + var2.Field4 * var2.Field8 + var12 + 1 + (var2.Field6 - 3) * var8, var5 + var2.Field7 - 8 + 6 + (var8 == 0 ? var12 : 1 - var12), 1, 3);
            }
        }

        var3.setClip(0, 0, Class106.Field13, Class106.Field14);
        var3.drawRegion(Class811.Field29[0], 0, 0, 18, 19, 6, var4 - 2, var5 + var7 + 2, 36);
        var3.drawRegion(Class811.Field29[0], 0, 0, 18, 19, 3, var4 + var6 + 2, var5 + var7 + 2, 40);
        var3 = var1;
        var2 = this;
        Class21.Field2.Field1(var1, this.Field21.Field4, this.Field11 + this.Field6 / 2 + this.Field4 * this.Field8, this.Field12 + this.Field7 / 2 - 5, 2);
        if (this.Field21.Field6 && !Class106.Field21.Field1) {
            this.Field23.Field1(var1);
        }

        var1.setClip(this.Field11, this.Field12 + this.Field7 + 5, this.Field9 - 3, Field20 - 9);
        var1.translate(0, -Field14);
        if (this.Field21.Field5.size() > 0) {
            if ((var5 = (var4 = Field14 / 14) + Field20 / 14 + 1) >= this.Field21.Field5.size()) {
                var5 = this.Field21.Field5.size();
            }

            for (var6 = var4; var6 < var5; ++var6) {
                String var11 = (String) var2.Field21.Field5.elementAt(var6);
                Class21.Field8.Field1(var3, var11, var2.Field11 + 8, var2.Field12 + var6 * 14 + var2.Field7 + 3, 0);
            }
        }

    }

    public final boolean Field1(int var1) {
        if (this.Field21.Field6 && this.Field23.Field5 && !Class106.Field21.Field1) {
            this.Field23.Field1(var1);
        }

        return super.Field1(var1);
    }

    public final void Field4() {
        this.Field5.Field4();
        if (Field14 != Field13) {
            Field16 = Field13 - Field14 << 2;
            Field15 += Field16;
            Field14 += Field15 >> 4;
            Field15 &= 15;
        }

    }

    public final void Field3() {
        if (this.Field21.Field6 && !Class106.Field21.Field1) {
            this.Field23.Field4();
        }

        boolean var1 = false;
        if (Class106.Field2(4)) {
            --this.Field4;
            if (this.Field4 < 0) {
                this.Field4 = this.Field3.size() - 1;
            }

            this.Field8();
        } else if (Class106.Field2(6)) {
            ++this.Field4;
            if (this.Field4 >= this.Field3.size()) {
                this.Field4 = 0;
            }

            this.Field8();
        }

        if (Class106.Field5[2]) {
            if (--Field18 < Field19) {
                Field18 = Field19;
            }

            var1 = true;
        } else if (Class106.Field5[8]) {
            if (Field14 < Field17) {
                ++Field18;
            }

            if (Field18 > this.Field21.Field5.size() - Field19) {
                Field18 = this.Field21.Field5.size() - Field19;
            }

            var1 = true;
        }

        if (var1) {
            if ((Field13 = Field18 * 14 - Field20 / 2) < 0) {
                Field13 = 0;
            }

            if (Field13 > Field17) {
                Field13 = Field17;
            }
        }

        super.Field3();
    }

    static int Field1(Class104 var0) {
        return var0.Field4;
    }

    static Vector Field2(Class104 var0) {
        return var0.Field3;
    }

    static void Field1(Class104 var0, int var1) {
        var0.Field4 = var1;
    }

    static void Field3(Class104 var0) {
        var0.Field8();
    }

    static Class671 Field4(Class104 var0) {
        return var0.Field5;
    }
}
