package main.tab.tab1;

import main.lib.Graphics;

import java.util.Vector;

public final class Class270 extends Class665 {
    private static Class270 Field11;
    public Class665 Field1;
    public String Field2 = "";
    int[] Field3;
    int[] Field4;
    private int Field12;
    private int Field13;
    private int Field14;
    private int Field15;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;
    private int Field20;
    private int Field21 = 76;
    public Class433 Field5 = new Class433();
    public Vector Field6 = new Vector();
    private String[] Field22 = new String[]{""};
    Class87 Field7;
    Class87 Field8;
    Class87 Field9;
    private Class87 Field23;
    Class87 Field10;
    private boolean Field24;
    private Class87 Field25;
    private String Field26 = null;

    public static Class270 Field5() {
        return Field11 == null ? (Field11 = new Class270()) : Field11;
    }

    public Class270() {
        this.Field9();
        this.Field23 = new Class87("Đóng", new Class141(this));
        this.Field9 = new Class87("Thu hoạch", new Class143(this));
        this.Field8 = new Class87("Tăng tốc", new Class144(this));
        this.Field7 = new Class87(Class105.Field37 ? "" : "Xem", new Class145(this));
        this.Field10 = new Class87("Menu", new Class147(this));
        this.Field25 = new Class87("", new Class148(this));
        super.Field105 = this.Field23;
        super.Field104 = this.Field7;
        super.Field103 = this.Field10;
        this.Field17 = 300;
        this.Field18 = 180;
        if (!Class105.Field37) {
            this.Field17 = 180;
        }

        this.Field19 = Class105.Field13 / 2 - this.Field17 / 2;
        this.Field20 = Class105.Field14 / 2 - this.Field18 / 2;
        this.Field15 = 140;
        if (Class105.Field37 && this.Field17 == 300) {
            this.Field13 = this.Field19 + this.Field17 / 2;
            this.Field14 = this.Field20 + 25;
            this.Field15 = this.Field17 / 2 - 6;
            this.Field16 = this.Field18 - 36;
        }

    }

    public final void Field6() {
        if (this.Field12 >= 0 && this.Field12 <= this.Field6.size() - 1) {
            Class263.Field1().Field14(this.Field12, 1);
            this.Field6.elementAt(this.Field12);
        }
    }

    public final void Field1(String var1) {
        int var2 = Class105.Field37 ? this.Field15 - 16 : 120;
        String[] var8 = Class802.Field1(var1, "|");
        int var3 = 0;
        int var4 = 0;

        for (int var5 = 0; var5 < var8.length; ++var5) {
            String[] var6 = Class21.Field10[0].Field1(var8[var5], var2);
            var3 += var6.length;
        }

        String[] var10 = new String[var3];

        for (int var11 = 0; var11 < var8.length; ++var11) {
            String[] var9 = Class21.Field10[0].Field1(var8[var11], var2);

            for (int var7 = 0; var7 < var9.length; ++var7) {
                var10[var4] = var9[var7];
                ++var4;
            }
        }

        this.Field22 = var10;
        if (!Class105.Field37) {
            if (this.Field22.length == 1) {
                this.Field16 = 35;
                this.Field14 = Class105.Field14 / 2 - Class21.Field10[0].Field2() / 2;
            } else {
                this.Field16 = this.Field22.length * (Class665.Field109 - 3) + 5;
                this.Field14 = Class105.Field14 / 2 - this.Field22.length * (Class665.Field109 - 3) / 2;
            }

            if (this.Field14 < 5) {
                this.Field14 = 5;
            }

            if (this.Field16 > 150) {
                this.Field16 = 150;
            }

            this.Field13 = Class105.Field13 / 2 - 75;
        }

        this.Field24 = true;
        if (!Class105.Field37) {
            super.Field104 = this.Field25;
            super.Field103 = this.Field25;
        }

    }

    public final void Field7() {
        Class263.Field1().Field14(this.Field12, 2);
    }

    public final void Field8() {
        Class263.Field1().Field14(this.Field12, 3);
    }

    public final void Field9() {
        this.Field3 = new int[8];
        this.Field4 = new int[8];
        int var1 = Class105.Field13 / 2 - 75;
        int var2 = Class105.Field14 / 2 - 75;
        this.Field3[0] = 10;
        this.Field4[0] = 72;
        this.Field3[1] = 43;
        this.Field4[1] = 62;
        this.Field3[2] = 20;
        this.Field4[2] = 28;
        this.Field3[3] = 52;
        this.Field4[3] = 17;
        this.Field3[4] = 70;
        this.Field4[4] = 56;
        this.Field3[5] = 82;
        this.Field4[5] = 7;
        this.Field3[6] = 106;
        this.Field4[6] = 22;
        this.Field3[7] = 112;
        this.Field4[7] = 64;
        var2 += 12;
        if (!Class105.Field37) {
            this.Field21 = 0;
        }

        for (int var3 = 0; var3 < this.Field3.length; ++var3) {
            int[] var10000 = this.Field3;
            var10000[var3] += var1 - this.Field21;
            var10000 = this.Field4;
            var10000[var3] += var2;
        }

        this.Field5.Field1();
        this.Field6 = new Vector();
        this.Field12 = 0;
        this.Field22 = new String[]{""};
    }

    private void Field2(Graphics var1) {
        var1.setColor(25695);
        var1.fillRect(this.Field13 - 5, this.Field14 + 10, this.Field15, this.Field16 - 10);
        var1.setColor(16774720);
        var1.drawRect(this.Field13 - 5, this.Field14 + 10, this.Field15, this.Field16 - 10);
        if (!this.Field24 && this.Field26 != null && Class105.Field37) {
            String[] var2 = Class802.Field1(this.Field26, "|");

            for (int var3 = 0; var3 < var2.length; ++var3) {
                Class21.Field10[0].Field1(var1, var2[var3], this.Field13, this.Field14 + var3 * 14 + 14, 0);
            }
        }

    }

    private void Field3(Graphics var1) {
        Class105.Field1(var1);
        if (this.Field17 >= 300) {
            this.Field2(var1);
            if (!this.Field24) {
                return;
            }
        } else {
            if (!this.Field24) {
                return;
            }

            this.Field2(var1);
        }

        this.Field5.Field1(this.Field22.length, Class665.Field109, this.Field13, this.Field14, this.Field15 - 2, this.Field16 - 10, true, 0);
        this.Field5.Field1(var1, this.Field13 - 3, this.Field14 + 10, this.Field15 - 2, this.Field16 - 15);

        for (int var2 = 0; var2 < this.Field22.length; ++var2) {
            Class21.Field10[0].Field1(var1, this.Field22[var2], this.Field13, this.Field14 + var2 * (Class665.Field109 - 3) + 14, 0);
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field1 != null) {
            this.Field1.Field1(var1);
        }

        Class804.Field1(var1, this.Field19, this.Field20, this.Field17, this.Field18, 0, this.Field2, false, 0);
        int var2 = Class105.Field37 ? this.Field21 : this.Field17 / 2;
        Class381.Field2(var1, (short) 8214, this.Field19 + var2, Class105.Field14 / 2 + 12, 3);
        this.Field26 = null;
        var2 = 0;
        int var3 = 0;

        String var6;
        for (int var4 = 0; var4 < this.Field6.size(); ++var4) {
            Class733 var5;
            if ((var5 = (Class733) this.Field6.elementAt(var4)) != null) {
                if (this.Field12 == var4) {
                    var1.setColor(25695);
                    var1.fillRect(var5.Field1, var5.Field2, 16, 30);
                    var1.setColor(16774720);
                    var1.drawRect(var5.Field1, var5.Field2, 16, 30);
                    var2 = var5.Field1;
                    var3 = var5.Field2;
                    var6 = "";
                    if (var5.Field4 == 1) {
                        var6 = "héo";
                    }

                    if (var5.Field4 == 0) {
                        var6 = "xanh";
                    }

                    if (var5.Field4 == 2) {
                        var6 = "chín";
                    }

                    this.Field26 = var5.Field5 + "|Trạng thái: " + var6;
                }

                Class381.Field2(var1, (short) (var5.Field3 + 8200), var5.Field1, var5.Field2, 0);
            }
        }

        this.Field3(var1);
        if (this.Field26 != null && !Class105.Field37 && !this.Field24) {
            var6 = this.Field26;
            String[] var8 = Class802.Field1(var6, "|");
            int var9 = Class21.Field10[0].Field1(var8[0]);
            int var7 = Class21.Field10[0].Field1(var8[1]);
            var9 = var9 < var7 ? var7 : var9;
            var1.setColor(1593912);
            var1.fillRect(var2 + 16 - var9 / 2 - 3, var3 - 16, var9 + 5, 30);
            var1.setColor(16772608);
            var1.drawRect(var2 + 16 - var9 / 2 - 3, var3 - 16, var9 + 5, 30);
            Class21.Field10[0].Field1(var1, var8[0], var2 + 16, var3 - 15, 2);
            Class21.Field10[0].Field1(var1, var8[1], var2 + 16, var3, 2);
        }

        super.Field1(var1);
    }

    public final void Field4() {
        if (this.Field1 != null) {
            this.Field1.Field4();
        }

        if (Class105.Field23 == null) {
            this.Field5.Field2();
            this.Field5.Field3();
        }

        super.Field4();
    }

    private void Field10() {
        Class433 var10000;
        if (Class105.Field3[2]) {
            Class105.Field3[2] = false;
            var10000 = this.Field5;
            var10000.Field1 -= 50;
            if (this.Field5.Field1 < 0) {
                this.Field5.Field1 = 0;
                return;
            }
        } else if (Class105.Field3[8]) {
            Class105.Field3[8] = false;
            var10000 = this.Field5;
            var10000.Field1 += 50;
            if (this.Field5.Field1 > this.Field5.Field3) {
                this.Field5.Field1 = this.Field5.Field3;
            }
        }

    }

    public final void Field3() {
        if (this.Field24 && !Class105.Field37) {
            this.Field10();
        } else {
            if (Class105.Field3[4]) {
                Class105.Field3[4] = false;
                --this.Field12;
                if (this.Field12 < 0) {
                    this.Field12 = this.Field6.size() - 1;
                }

                if (Class105.Field37) {
                    this.Field24 = false;
                    this.Field5.Field1();
                }
            }

            if (Class105.Field3[6]) {
                Class105.Field3[6] = false;
                ++this.Field12;
                if (this.Field12 > this.Field6.size() - 1) {
                    this.Field12 = 0;
                }

                if (Class105.Field37) {
                    this.Field24 = false;
                    this.Field5.Field1();
                }
            }

            if (Class105.Field37) {
                this.Field10();
            }
        }

        Class270 var1 = this;
        if ((Class105.Field37 || !this.Field24) && Class105.Field7) {
            for (int var2 = 0; var2 < var1.Field3.length; ++var2) {
                if (Class105.Field10 >= var1.Field3[var2] && Class105.Field10 <= var1.Field3[var2] + 15 && Class105.Field11 >= var1.Field4[var2] && Class105.Field11 <= var1.Field4[var2] + 30) {
                    Class105.Field7 = false;
                    var1.Field24 = false;
                    var1.Field5.Field1();
                    var1.Field12 = var2;
                    if (!var1.Field24 && var1.Field104 != null) {
                        var1.Field104.Field2.Field1();
                    }
                    break;
                }
            }
        }

        super.Field3();
    }

    public final void Field1() {
        super.Field1();
    }

    public final void Field1(Class665 var1) {
        this.Field1 = var1;
        super.Field1(var1);
    }

    static boolean Field1(Class270 var0) {
        return var0.Field24;
    }

    static void Field1(Class270 var0, boolean var1) {
        var0.Field24 = false;
    }

    static int Field2(Class270 var0) {
        return var0.Field12;
    }
}
