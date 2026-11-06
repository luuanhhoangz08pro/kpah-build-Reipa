package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Random;
import java.util.Vector;

public final class Class587 extends Class671 {
    private static Class587 Field5;
    private Image Field6;
    private Image Field7;
    private Image Field8;
    private Class565 Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    public int Field1;
    private int Field14;
    private int Field15;
    private Class384 Field16;
    private boolean Field17;
    private boolean Field18;
    private boolean Field19 = false;
    public Class671 Field2;
    private Class86 Field20;
    private Class86 Field21;
    private Class86 Field22;
    private Class86 Field23;
    private Class86 Field24;
    private Class86 Field25;
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

    public static Class587 Field5() {
        if (Field5 == null) {
            Field5 = new Class587();
            return Field5;
        } else {
            return Field5;
        }
    }

    public final void Field1() {
        Class106.Field5[5] = false;
        super.Field1();
        this.Field6();
        this.Field103 = this.Field23;
    }

    public Class587() {
        Class53.Field2("/qs/qs");
        this.Field7 = Class53.Field1("8Chars");
        this.Field8 = Class53.Field1("q");
        this.Field9 = Class565.Field1("st", 11, 11);
        this.Field6 = Class53.Field1("wood21");
        Class53.Field1();
        this.Field10 = Class106.Field13 < 200 ? 80 : 90;
        this.Field16 = new Class384(Class106.Field13, Class106.Field16 + 1);
        this.Field12 = 30;
        this.Field14 = 360 / this.Field12;
        this.Field20 = new Class86("Bắt đầu", new Class74(this));
        this.Field21 = new Class86("Xin chờ", new Class70(this));
        this.Field22 = new Class86("Đóng", new Class141(this));
        this.Field23 = new Class86("Auto ", new Class241(this));
        this.Field25 = new Class86("Chọn lại", new Class45(this));
        this.Field24 = new Class86("Tiếp tục", new Class41(this));
        this.Field104 = this.Field20;
        this.Field105 = this.Field22;
        this.Field1 = 90;
        this.Field28 = new boolean[3];
        this.Field29 = new Vector();
    }

    public final void Field6() {
        this.Field18 = false;
        this.Field17 = false;
        this.Field104 = this.Field20;
        this.Field105 = this.Field22;
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

        Class587 var2;
        int var3;
        int var6;
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
            var2 = this;
            Field31 = new int[Field4.length];
            Field32 = new int[Field4.length];
            this.Field17 = false;
            this.Field18 = true;
            this.Field19 = false;
            this.Field27 = System.currentTimeMillis() / 100L;

            for (var3 = 0; var3 < Field4.length; ++var3) {
                boolean var1 = false;
                var6 = var3 == 0 ? 150 : (var3 == 1 ? 180 : 210);
                var6 = Class809.Field3(var6);
                int var4 = var2.Field10 * Class809.Field2(var6) >> 10;
                var6 = -(var2.Field10 * Class809.Field1(var6)) >> 10;
                Field31[var3] = var2.Field16.Field1 + var4;
                Field32[var3] = var2.Field16.Field2 + var6;
            }
        }

        if (this.Field33 == 2 && this.Field29.size() == 0) {
            var2 = this;
            String var7 = "Bạn nhận được: ";
            if (Field4 != null) {
                for (var6 = 0; var6 < Field4.length; ++var6) {
                    if (System.currentTimeMillis() / 100L - var2.Field27 > (long) ((var6 + 1) * 5)) {
                        Class773 var8 = (Class773) Class377.Field2.elementAt(Field4[var6]);
                        var7 = var7 + "\n" + var8.Field4;
                    }
                }
            }

            Class106.Field1(var7);
            this.Field33 = 3;
        }

        if (this.Field18) {
            if (this.Field104 == this.Field21) {
                var3 = 0;

                for (var6 = 0; var6 < this.Field28.length; ++var6) {
                    if (this.Field28[var6]) {
                        ++var3;
                    }
                }

                if (var3 == 3) {
                    this.Field104 = this.Field22;
                    this.Field103 = this.Field24;
                    this.Field105 = this.Field25;
                }
            }

            for (var3 = 0; var3 < this.Field29.size(); ++var3) {
                Class244 var9 = (Class244) this.Field29.elementAt(var3);
                var9.Field1 += var9.Field3;
                if (var9.Field3 > 1 || var9.Field3 < -1) {
                    int var5 = var9.Field3;
                    var9.Field3 -= var5 / (var5 < 0 ? -var5 : var5);
                }

                var9.Field2 += var9.Field5;
                ++var9.Field5;
                ++var9.Field6;
                if (var9.Field6 > 20) {
                    this.Field29.removeElement(var9);
                }
            }

            if (Field4 != null) {
                for (var3 = 0; var3 < Field4.length; ++var3) {
                    if (!this.Field28[var3] && System.currentTimeMillis() / 100L - this.Field27 > (long) ((var3 + 1) * 5)) {
                        this.Field28[var3] = true;
                        this.Field1(Field31[var3], Field32[var3]);
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

            Class244 var5 = new Class244(var1, var2);
            (new Class244(var1, var2)).Field6 = 0;
            var5.Field3 = var4 * (this.Field30.nextInt(80) / 10);
            var5.Field5 = -this.Field30.nextInt(70) / 10;
            this.Field29.addElement(var5);
        }

    }

    public final void Field3() {
        if (!this.Field18) {
            if (Class106.Field9() == 1) {
                if (Class106.Field6) {
                    this.Field19 = true;
                    Class106.Field5[5] = true;
                }

                if (Class106.Field34) {
                    Class106.Field4[5] = true;
                }
            }

            if (Class106.Field5[5] && !this.Field17 && this.Field19) {
                if (this.Field1 < 270) {
                    this.Field1 += 3;
                }
            } else if (this.Field1 > 90 && this.Field3) {
                this.Field1 -= 3;
            }

            if (Class106.Field4[5]) {
                if (this.Field1 > 90 && !this.Field17 && this.Field19) {
                    this.Field15 = this.Field1;
                    Class261.Field1().Field22(Class377.Field3);
                    this.Field104 = this.Field21;
                }

                Class106.Field4[5] = false;
            }
        }

        super.Field3();
    }

    public final void Field7() {
        this.Field104 = this.Field21;
        this.Field13 = 100 + (this.Field15 - 90);
        this.Field17 = true;
        this.Field105 = this.Field23;
        this.Field3 = true;
        Class106.Field7();
    }

    public final void Field1(Graphics var1) {
        if (this.Field2 != null) {
            this.Field2.Field1(var1);
        }

        Class106.Field1(var1);
        int var6 = this.Field11 / 20;

        int var3;
        int var4;
        int var5;
        int var8;
        for (int var7 = 0; var7 < this.Field14; ++var7) {
            var8 = var6 + var7 * this.Field12;
            if (var8 > 360) {
                var8 -= 360;
            }

            if (var8 >= 82 && var8 <= 278) {
                var5 = Class809.Field3(var8);
                var4 = this.Field10 * Class809.Field2(var5) >> 10;
                var3 = -(this.Field10 * Class809.Field1(var5)) >> 10;
                var1.drawImage(this.Field6, this.Field16.Field1 + var4, this.Field16.Field2 + var3, 3);
            }
        }

        if (this.Field18) {
            Graphics var15 = var1;
            Class587 var9 = this;
            if (Field4 != null) {
                for (var5 = 0; var5 < Field4.length; ++var5) {
                    if (System.currentTimeMillis() / 100L - var9.Field27 > (long) ((var5 + 1) * 5)) {
                        Class773 var10 = (Class773) Class377.Field2.elementAt(Field4[var5]);
                        var10.Field1(var15, Field31[var5], Field32[var5]);
                    }
                }
            }
        }

        var8 = 0;

        for (int var16 = 0; var16 < this.Field14; ++var16) {
            var5 = var6 + var16 * this.Field12;
            if (var5 > 360) {
                var5 -= 360;
            }

            if (var5 >= 82 && var5 <= 278) {
                var4 = Class809.Field3(var5);
                var3 = this.Field10 * Class809.Field2(var4) >> 10;
                var4 = -(this.Field10 * Class809.Field1(var4)) >> 10;
                long var17 = System.currentTimeMillis() / 100L - this.Field27;
                if (this.Field18 && var5 >= 150 && var5 <= 210 && (var17 > (long) ((var8 + 1) * 5) || var17 <= (long) ((var8 + 1) * 5 - 5))) {
                    ++var8;
                } else {
                    var1.drawImage(this.Field8, this.Field16.Field1 + var3, this.Field16.Field2 + var4, 3);
                }
            }
        }

        var1.setColor(9013127);
        var1.fillRect(this.Field16.Field1 - 18, this.Field16.Field2 - 18, 18, 36);
        var1.drawRegion(this.Field7, 0, 0, this.Field7.getWidth(), this.Field7.getHeight(), 0, this.Field16.Field1, this.Field16.Field2, 40);
        var1.drawRegion(this.Field7, 0, 0, this.Field7.getWidth(), this.Field7.getHeight(), 1, this.Field16.Field1, this.Field16.Field2, 24);
        Class773 var2;
        if (Class377.Field3 >= 0 && Class377.Field3 < Class377.Field2.size() && (var2 = (Class773) Class377.Field2.elementAt(Class377.Field3)) != null) {
            var2.Field1(var1, this.Field16.Field1 - this.Field7.getWidth() + 28, this.Field16.Field2);
        }

        var5 = Class809.Field3(this.Field1);
        var4 = (this.Field10 / 3 + 2) * Class809.Field2(var5) >> 10;
        var6 = -((this.Field10 / 3 + 2) * Class809.Field1(var5)) >> 10;
        var5 = this.Field1 + 90;
        if (var5 > 360) {
            var5 -= 360;
        }

        var5 = Class809.Field3(var5);
        var3 = 6 * Class809.Field2(var5) >> 10;
        var5 = -(6 * Class809.Field1(var5)) >> 10;
        int var12 = this.Field1 - 90;
        if (var12 < 0) {
            var12 += 360;
        }

        var12 = Class809.Field3(var12);
        int var13 = 6 * Class809.Field2(var12) >> 10;
        var12 = -(6 * Class809.Field1(var12)) >> 10;
        var1.setColor(13935404);
        var1.fillTriangle(this.Field16.Field1 + var4, this.Field16.Field2 + var6, this.Field16.Field1 + var3, this.Field16.Field2 + var5, this.Field16.Field1 + var13, this.Field16.Field2 + var12);
        var1.fillRoundRect(this.Field16.Field1 - 6, this.Field16.Field2 - 6, 12, 12, 12, 12);
        if (this.Field18 || this.Field13 > 0) {
            Graphics var18 = var1;
            Class587 var11 = this;

            for (var5 = 0; var5 < var11.Field29.size(); ++var5) {
                Class244 var14 = (Class244) var11.Field29.elementAt(var5);
                var6 = var14.Field6 / 5;
                if (var6 < 4) {
                    var11.Field9.Field1(var6, var14.Field1, var14.Field2, 0, 3, var18);
                }

                ++var11.Field33;
                if (var11.Field33 >= 2) {
                    var11.Field33 = 2;
                }
            }
        }

        super.Field1(var1);
    }

    static void Field1(Class587 var0, boolean var1) {
        var0.Field19 = true;
    }

    static Class86 Field1(Class587 var0) {
        return var0.Field20;
    }

    static Class86 Field2(Class587 var0) {
        return var0.Field23;
    }

    static Class86 Field3(Class587 var0) {
        return var0.Field22;
    }
}
