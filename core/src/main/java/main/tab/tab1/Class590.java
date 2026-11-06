package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

import java.util.Random;
import java.util.Vector;

public final class Class590 extends Class665 {
    private static Class590 Field5;
    private Image Field6;
    private Image Field7;
    private Image Field8;
    private Class568 Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    public int Field1;
    private int Field14;
    private int Field15;
    private Class386 Field16;
    private boolean Field17;
    private boolean Field18;
    private boolean Field19 = false;
    public Class665 Field2;
    private Class87 Field20;
    private Class87 Field21;
    private Class87 Field22;
    private Class87 Field23;
    private Class87 Field24;
    private Class87 Field25;
    private Vector Field26 = new Vector();
    private long Field27 = 0L;
    private boolean[] Field28;
    private Vector Field29;
    public boolean Field3;
    private Random Field30 = new Random(System.currentTimeMillis());
    private static int[] Field31 = new int[3];
    private static int[] Field32 = new int[3];
    private byte Field33 = -1;
    public static byte[] Field4 = null;

    public static Class590 Field5() {
        return Field5 == null ? (Field5 = new Class590()) : Field5;
    }

    public final void Field1() {
        Class105.Field5[5] = false;
        super.Field1();
        this.Field6();
        super.Field103 = this.Field23;
    }

    public Class590() {
        Class53.Field2("/qs/qs");
        this.Field7 = Class53.Field1("8Chars");
        this.Field8 = Class53.Field1("q");
        this.Field9 = Class568.Field1("st", 11, 11);
        this.Field6 = Class53.Field1("wood21");
        Class53.Field1();
        if (Class105.Field13 < 200) {
            this.Field10 = 80;
        } else {
            this.Field10 = 90;
        }

        this.Field16 = new Class386(Class105.Field13, Class105.Field16 + 1);
        this.Field12 = 30;
        this.Field14 = 360 / this.Field12;
        this.Field20 = new Class87("Bắt đầu", new Class75(this));
        this.Field21 = new Class87("Xin chờ", new Class71(this));
        this.Field22 = new Class87("Đóng", new Class138(this));
        this.Field23 = new Class87("", new Class137(this));
        this.Field25 = new Class87("Chọn lại", new Class45(this));
        this.Field24 = new Class87("Tiếp tục", new Class41(this));
        super.Field104 = this.Field20;
        super.Field105 = this.Field22;
        this.Field1 = 90;
        this.Field28 = new boolean[3];
        this.Field29 = new Vector();
    }

    public final void Field6() {
        this.Field18 = false;
        this.Field17 = false;
        super.Field104 = this.Field20;
        super.Field105 = this.Field22;
        this.Field27 = 0L;

        for (int var1 = 0; var1 < 3; ++var1) {
            this.Field28[var1] = false;
        }

        this.Field29.removeAllElements();
        this.Field26.removeAllElements();
        this.Field33 = -1;
    }

    public final void Field4() {
        if (this.Field2 != null) {
            this.Field2.Field4();
        }

        int var1;
        Class590 var3;
        int var7;
        if (this.Field13 > 0) {
            this.Field11 -= this.Field13;
            if (this.Field11 < 0) {
                this.Field11 += 7200;
            }

            if (this.Field13 < 10) {
                if (this.Field11 / 20 % 30 == 0) {
                    this.Field13 = 0;
                }
            } else {
                --this.Field13;
            }
        } else if (this.Field17) {
            var3 = this;
            Field31 = new int[Field4.length];
            Field32 = new int[Field4.length];
            this.Field17 = false;
            this.Field18 = true;
            this.Field19 = false;
            this.Field27 = System.currentTimeMillis() / 100L;

            for (var1 = 0; var1 < Field4.length; ++var1) {
                boolean var2 = false;
                short var6;
                if (var1 == 0) {
                    var6 = 150;
                } else if (var1 == 1) {
                    var6 = 180;
                } else {
                    var6 = 210;
                }

                var7 = Class802.Field3(var6);
                int var4 = var3.Field10 * Class802.Field2(var7) >> 10;
                var7 = -(var3.Field10 * Class802.Field1(var7)) >> 10;
                Field31[var1] = var3.Field16.Field1 + var4;
                Field32[var1] = var3.Field16.Field2 + var7;
            }
        }

        if (this.Field33 == 2 && this.Field29.size() == 0) {
            var3 = this;
            String var5 = "Bạn nhận được: ";
            if (Field4 != null) {
                for (var7 = 0; var7 < Field4.length; ++var7) {
                    if (System.currentTimeMillis() / 100L - var3.Field27 > (long) ((var7 + 1) * 5)) {
                        Class766 var9 = (Class766) Class379.Field2.elementAt(Field4[var7]);
                        var5 = var5 + "\n" + var9.Field4;
                    }
                }
            }

            Class105.Field1(var5);
            this.Field33 = 3;
        }

        if (this.Field18) {
            if (super.Field104 == this.Field21) {
                var1 = 0;

                for (var7 = 0; var7 < this.Field28.length; ++var7) {
                    if (this.Field28[var7]) {
                        ++var1;
                    }
                }

                if (var1 == 3) {
                    super.Field104 = this.Field22;
                    super.Field103 = this.Field24;
                    super.Field105 = this.Field25;
                }
            }

            for (var1 = 0; var1 < this.Field29.size(); ++var1) {
                Class245 var10;
                Class245 var10000 = var10 = (Class245) this.Field29.elementAt(var1);
                var10000.Field1 += var10.Field3;
                if (var10.Field3 > 1 || var10.Field3 < -1) {
                    int var8;
                    var10.Field3 -= var10.Field3 / ((var8 = var10.Field3) < 0 ? -var8 : var8);
                }

                var10.Field2 += var10.Field5;
                ++var10.Field5;
                ++var10.Field6;
                if (var10.Field6 > 20) {
                    this.Field29.removeElement(var10);
                }
            }

            if (Field4 != null) {
                for (var1 = 0; var1 < Field4.length; ++var1) {
                    if (!this.Field28[var1] && System.currentTimeMillis() / 100L - this.Field27 > (long) ((var1 + 1) * 5)) {
                        this.Field28[var1] = true;
                        this.Field1(Field31[var1], Field32[var1]);
                    }
                }
            }
        }

    }

    private void Field1(int var1, int var2) {
        for (int var3 = 0; var3 < 10; ++var3) {
            byte var4 = 1;
            if (var3 % 2 == 0) {
                var4 = -1;
            }

            Class245 var5;
            (var5 = new Class245(var1, var2)).Field6 = 0;
            var5.Field3 = var4 * (this.Field30.nextInt(80) / 10);
            var5.Field5 = -this.Field30.nextInt(70) / 10;
            this.Field29.addElement(var5);
        }

    }

    public final void Field3() {
        if (!this.Field18) {
            if (Class105.Field9() == 1) {
                if (Class105.Field6) {
                    this.Field19 = true;
                    Class105.Field5[5] = true;
                }

                if (Class105.Field34) {
                    Class105.Field4[5] = true;
                }
            }

            if (Class105.Field5[5] && !this.Field17 && this.Field19) {
                if (this.Field1 < 270) {
                    this.Field1 += 3;
                }
            } else if (this.Field1 > 90 && this.Field3) {
                this.Field1 -= 3;
            }

            if (Class105.Field4[5]) {
                if (this.Field1 > 90 && !this.Field17 && this.Field19) {
                    this.Field15 = this.Field1;
                    Class263.Field1().Field22(Class379.Field3);
                    super.Field104 = this.Field21;
                }

                Class105.Field4[5] = false;
            }
        }

        super.Field3();
    }

    public final void Field7() {
        super.Field104 = this.Field21;
        this.Field13 = 100 + (this.Field15 - 90);
        this.Field17 = true;
        super.Field105 = this.Field23;
        this.Field3 = true;
        Class105.Field7();
    }

    public final void Field1(Graphics var1) {
        if (this.Field2 != null) {
            this.Field2.Field1(var1);
        }

        Class105.Field1(var1);
        int var2 = this.Field11 / 20;

        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        for (var3 = 0; var3 < this.Field14; ++var3) {
            if ((var4 = var2 + var3 * this.Field12) > 360) {
                var4 -= 360;
            }

            if (var4 >= 82 && var4 <= 278) {
                var5 = Class802.Field3(var4);
                var6 = this.Field10 * Class802.Field2(var5) >> 10;
                var7 = -(this.Field10 * Class802.Field1(var5)) >> 10;
                var1.drawImage(this.Field6, this.Field16.Field1 + var6, this.Field16.Field2 + var7, 3);
            }
        }

        Class590 var11;
        Graphics var12;
        if (this.Field18) {
            var12 = var1;
            var11 = this;
            if (Field4 != null) {
                for (var5 = 0; var5 < Field4.length; ++var5) {
                    if (System.currentTimeMillis() / 100L - var11.Field27 > (long) ((var5 + 1) * 5)) {
                        ((Class766) Class379.Field2.elementAt(Field4[var5])).Field1(var12, Field31[var5], Field32[var5]);
                    }
                }
            }
        }

        var3 = 0;

        for (var4 = 0; var4 < this.Field14; ++var4) {
            if ((var5 = var2 + var4 * this.Field12) > 360) {
                var5 -= 360;
            }

            if (var5 >= 82 && var5 <= 278) {
                var6 = Class802.Field3(var5);
                var7 = this.Field10 * Class802.Field2(var6) >> 10;
                var6 = -(this.Field10 * Class802.Field1(var6)) >> 10;
                long var9 = System.currentTimeMillis() / 100L - this.Field27;
                if (this.Field18 && var5 >= 150 && var5 <= 210 && (var9 > (long) ((var3 + 1) * 5) || var9 <= (long) ((var3 + 1) * 5 - 5))) {
                    ++var3;
                } else {
                    var1.drawImage(this.Field8, this.Field16.Field1 + var7, this.Field16.Field2 + var6, 3);
                }
            }
        }

        var1.setColor(9013127);
        var1.fillRect(this.Field16.Field1 - 18, this.Field16.Field2 - 18, 18, 36);
        var1.drawRegion(this.Field7, 0, 0, this.Field7.getWidth(), this.Field7.getHeight(), 0, this.Field16.Field1, this.Field16.Field2, 40);
        var1.drawRegion(this.Field7, 0, 0, this.Field7.getWidth(), this.Field7.getHeight(), 1, this.Field16.Field1, this.Field16.Field2, 24);
        Class766 var13;
        if (Class379.Field3 >= 0 && Class379.Field3 < Class379.Field2.size() && (var13 = (Class766) Class379.Field2.elementAt(Class379.Field3)) != null) {
            var13.Field1(var1, this.Field16.Field1 - this.Field7.getWidth() + 28, this.Field16.Field2);
        }

        var5 = Class802.Field3(this.Field1);
        var6 = (this.Field10 / 3 + 2) * Class802.Field2(var5) >> 10;
        var2 = -((this.Field10 / 3 + 2) * Class802.Field1(var5)) >> 10;
        if ((var5 = this.Field1 + 90) > 360) {
            var5 -= 360;
        }

        var5 = Class802.Field3(var5);
        var7 = 6 * Class802.Field2(var5) >> 10;
        var5 = -(6 * Class802.Field1(var5)) >> 10;
        int var8;
        if ((var8 = this.Field1 - 90) < 0) {
            var8 += 360;
        }

        var8 = Class802.Field3(var8);
        int var15 = 6 * Class802.Field2(var8) >> 10;
        var8 = -(6 * Class802.Field1(var8)) >> 10;
        var1.setColor(13935404);
        var1.fillTriangle(this.Field16.Field1 + var6, this.Field16.Field2 + var2, this.Field16.Field1 + var7, this.Field16.Field2 + var5, this.Field16.Field1 + var15, this.Field16.Field2 + var8);
        var1.fillRoundRect(this.Field16.Field1 - 6, this.Field16.Field2 - 6, 12, 12, 12, 12);
        if (this.Field18 || this.Field13 > 0) {
            var12 = var1;
            var11 = this;

            for (var5 = 0; var5 < var11.Field29.size(); ++var5) {
                Class245 var14;
                if ((var2 = (var14 = (Class245) var11.Field29.elementAt(var5)).Field6 / 5) < 4) {
                    var11.Field9.Field1(var2, var14.Field1, var14.Field2, 0, 3, var12);
                }

                ++var11.Field33;
                if (var11.Field33 >= 2) {
                    var11.Field33 = 2;
                }
            }
        }

        super.Field1(var1);
    }

    static void Field1(Class590 var0, boolean var1) {
        var0.Field19 = true;
    }

    static Class87 Field1(Class590 var0) {
        return var0.Field20;
    }

    static Class87 Field2(Class590 var0) {
        return var0.Field23;
    }

    static Class87 Field3(Class590 var0) {
        return var0.Field22;
    }
}
