package main.tab.tab2;

import main.lib.Graphics;

import java.util.Vector;

public final class Class358 extends Class671 {
    private static Class358 Field8;
    public static int Field1 = 80;
    public static int Field2;
    private static int Field9;
    private static int Field10;
    private static int Field11;
    private static Vector Field12 = new Vector();
    private Class430 Field13 = new Class430();
    private Class430 Field14 = new Class430();
    public Class430 Field3 = new Class430();
    private int Field15 = -1;
    private int Field16;
    private int Field17;
    private int Field18;
    private int Field19;
    private int Field20 = 80;
    private int Field21;
    private int Field22;
    public Class671 Field4;
    public String[] Field5 = new String[]{""};
    private String[] Field23 = new String[]{"Tab 1", "Tab 2", "Tab 3", "Tab 4"};
    private String Field24 = "Cổ vật";
    public boolean Field6;
    private Class86 Field25;
    private Class86 Field26;
    Class86 Field7;

    public static Class358 Field5() {
        return Field8 == null ? (Field8 = new Class358()) : Field8;
    }

    public final void Field1(Class85 var1) {
        Field12 = new Vector();
        Class822 var2 = null;
        int var3 = Field10 + 6;
        int var4 = Field11 + 55;

        try {
            byte var5 = var1.Field2().readByte();
            this.Field23 = new String[var5];

            for (int var6 = 0; var6 < var5; ++var6) {
                this.Field23[var6] = var1.Field2().readUTF();
                byte var7 = var1.Field2().readByte();
                Vector var8 = new Vector();

                for (int var9 = 0; var9 < var7; ++var9) {
                    (var2 = new Class822(this)).Field3 = var1.Field2().readUTF();
                    var2.Field6 = var2.Field3 + "|" + var1.Field2().readUTF();
                    String[] var10 = Class809.Field1(var1.Field2().readUTF(), "|");
                    var2.Field5 = new String[var10.length + 1];
                    var2.Field5[0] = var2.Field3;

                    for (int var11 = 0; var11 < var10.length; ++var11) {
                        var2.Field5[var11 + 1] = var10[var11];
                    }

                    var2.Field4 = var1.Field2().readByte();
                    var2.Field1 = var3;
                    var2.Field2 = var4 + var9 * (Field1 + 3);
                    var8.addElement(var2);
                }

                Field12.addElement(var8);
            }

        } catch (Exception var12) {
        }
    }

    public Class358() {
        Field2 = Class106.Field13 - 10;
        Field9 = Class106.Field14 - Class671.Field109 - 10;
        if (Field2 > 176) {
            Field2 = 176;
        }

        if (Field9 > 220) {
            Field9 = 220;
        }

        if (Class106.Field13 >= 320 && Class106.Field37) {
            Field2 = 300;
        }

        Field10 = Class106.Field13 / 2 - Field2 / 2;
        if ((Field11 = (Class106.Field14 - Class671.Field109) / 2 - Field9 / 2) < 5) {
            Field11 = 5;
        }

        if (Field10 < 5) {
            Field10 = 5;
        }

        this.Field18 = Field2;
        if (Class106.Field37 && Field2 == 300) {
            this.Field16 = Field10 + Field2 / 2;
            this.Field17 = Field11 + 55;
            this.Field18 = Field2 / 2 - 8;
            this.Field19 = Field9 - 54;
        }

        (new StringBuffer("H cell = ")).append(Field9).append(" Hcanvas = ").append(Class106.Field14).toString();
        this.Field25 = new Class86("Đóng", new Class232(this));
        this.Field7 = new Class86(Class106.Field37 ? "" : "Xem", new Class233(this));
        this.Field26 = new Class86("", new Class231(this));
        super.Field105 = this.Field25;
        super.Field104 = this.Field7;
        if (!Class106.Field37) {
            this.Field15 = 0;
        }

        this.Field1((Class85) null);
    }

    public final void Field6() {
        if (Field12.size() != 0 && this.Field22 > -1) {
            Vector var1 = (Vector) Field12.elementAt(this.Field22);
            if (this.Field15 >= 0 && this.Field15 <= var1.size() - 1) {
                Class822 var2 = (Class822) var1.elementAt(this.Field15);
                this.Field5 = Class809.Field1(var2.Field6, "|");
                if (!Class106.Field37) {
                    if (this.Field5.length == 1) {
                        this.Field19 = 35;
                        this.Field17 = Class106.Field14 / 2 - Class21.Field10[0].Field2() / 2;
                    } else {
                        this.Field19 = this.Field5.length * (Class671.Field109 - 3) + 5;
                        this.Field17 = Class106.Field14 / 2 - this.Field5.length * (Class671.Field109 - 3) / 2;
                    }

                    if (this.Field17 < Field11) {
                        this.Field17 = Field11;
                    }

                    if (this.Field19 > 150) {
                        this.Field19 = 150;
                    }

                    this.Field16 = Field10;
                }

                this.Field6 = true;
                if (!Class106.Field37) {
                    super.Field104 = this.Field26;
                }

            }
        }
    }

    private void Field2(Graphics var1) {
        var1.setColor(25695);
        var1.fillRect(this.Field16, this.Field17 + (Class106.Field37 ? 0 : 10), this.Field18, this.Field19 - 10);
        var1.setColor(16774720);
        var1.drawRect(this.Field16, this.Field17 + (Class106.Field37 ? 0 : 10), this.Field18, this.Field19 - 10);
    }

    public final void Field1(Graphics var1) {
        if (this.Field4 != null) {
            this.Field4.Field1(var1);
        }

        int var2 = Class106.Field37 && Field2 == 300 ? Field2 / 2 : Field2;
        Class811.Field1(var1, Field10, Field11, Field2, Field9, 25, this.Field24, false, 0);
        Class106.Field1(var1);
        this.Field14.Field1(this.Field23.length, this.Field20 + 2, Field10, Field11 + 32, Field2 - 2, 25, false, 0);
        this.Field14.Field1(var1, Field10 + 2, Field11 + 25, Field2 - 4, 25);

        for (int var3 = 0; var3 < this.Field23.length; ++var3) {
            if (this.Field21 == var3) {
                var1.setColor(6513507);
                var1.fillRect(Field10 + this.Field20 * var3, Field11 + 26, this.Field20, 25);
            }

            Class21.Field10[0].Field1(var1, this.Field23[var3], Field10 + this.Field20 * var3 + this.Field20 / 2, Field11 + 32, 2);
            var1.setColor(14527502);
            var1.fillRect(Field10 + this.Field20 * var3, Field11 + 25, 1, 25);
        }

        var1.fillRect(Field10 + this.Field20 * this.Field23.length, Field11 + 25, 1, 25);
        Class106.Field1(var1);
        Graphics var6;
        int var7;
        if (Field12.size() > 0) {
            if (this.Field22 != this.Field21 && this.Field21 > -1 && this.Field21 < Field12.size()) {
                this.Field22 = this.Field21;
            }

            Vector var9 = (Vector) Field12.elementAt(this.Field22);
            this.Field13.Field1(var9.size(), Field1 + 2, Field10, Field11 + 55, var2 - 2, Field9 - 65, true, 0);
            this.Field13.Field1(var1, Field10, Field11 + 52, var2 - 2, Field9 - 55);

            for (int var4 = 0; var4 < var9.size(); ++var4) {
                Class822 var5;
                if ((var5 = (Class822) var9.elementAt(var4)) != null) {
                    if (this.Field15 == var4) {
                        var1.setColor(6513507);
                        var1.fillRect(Field10 + 4, var5.Field2, var2, Field1);
                    }

                    var6 = var1;
                    var5 = var5;
                    var7 = 0;
                    var1.setColor(8023616);
                    var1.fillRect(var5.Field1, var5.Field2 + Field1 + 1, Field2, 1);
                    Class176 var8;
                    if ((var8 = Class379.Field1((short) (var5.Field4 + 8500))) != null && var8.Field1 != null) {
                        var7 = var8.Field1.getWidth() + 2;
                    }

                    Class379.Field2(var1, (short) (var5.Field4 + 8500), var5.Field1, var5.Field2, 0);

                    for (int var11 = 0; var11 < var5.Field5.length; ++var11) {
                        Class21.Field10[0].Field1(var6, var5.Field5[var11], var5.Field1 + var7, var5.Field2 + var11 * (Class671.Field109 - 3), 0);
                    }
                }
            }
        }

        label107:
        {
            var6 = var1;
            Class358 var10 = this;
            Class106.Field1(var1);
            if (Field2 >= 300) {
                this.Field2(var1);
                if (!this.Field6) {
                    break label107;
                }
            } else {
                if (!this.Field6) {
                    break label107;
                }

                this.Field2(var1);
            }

            this.Field3.Field1(this.Field5.length, Class671.Field109, this.Field16, this.Field17, this.Field18 - 2, this.Field19 - 10, true, 0);
            this.Field3.Field1(var1, this.Field16, this.Field17 + (Class106.Field37 ? 2 : 10), this.Field18 - 2, this.Field19 - 15);

            for (var7 = 0; var7 < var10.Field5.length; ++var7) {
                Class21.Field10[0].Field1(var6, var10.Field5[var7], var10.Field16 + 4, var10.Field17 + var7 * (Class671.Field109 - 3) + (Class106.Field37 ? 6 : 14), 0);
            }
        }

        super.Field1(var1);
    }

    public final void Field4() {
        if (this.Field4 != null) {
            this.Field4.Field4();
        }

        if (Class106.Field23 == null) {
            Class47 var1;
            if (Class106.Field37) {
                if ((var1 = this.Field13.Field2()).Field1 || var1.Field3) {
                    if (this.Field6) {
                        super.Field105.Field2.Field1();
                    }

                    this.Field15 = var1.Field2;
                    if (!this.Field13.Field4 && !this.Field6 && super.Field104 != null) {
                        super.Field104.Field2.Field1();
                    }
                }

                this.Field13.Field3();
                if ((var1 = this.Field14.Field2()).Field1 || var1.Field3) {
                    this.Field21 = var1.Field2;
                    this.Field14.Field1(this.Field21 * (this.Field20 + 2));
                    if (super.Field105 != null && this.Field6) {
                        super.Field105.Field2.Field1();
                    }
                }

                this.Field14.Field3();
                this.Field3.Field2();
                this.Field3.Field3();
            } else if (!this.Field6) {
                if ((var1 = this.Field13.Field2()).Field1 || var1.Field3) {
                    this.Field15 = var1.Field2;
                }

                this.Field13.Field3();
                if ((var1 = this.Field14.Field2()).Field1 || var1.Field3) {
                    this.Field21 = var1.Field2;
                    this.Field14.Field1(this.Field21 * (this.Field20 + 2));
                }

                this.Field14.Field3();
            } else {
                this.Field3.Field2();
                this.Field3.Field3();
            }
        }

        super.Field4();
    }

    public final void Field3() {
        if (this.Field6) {
            Class430 var10000;
            if (Class106.Field3[2]) {
                Class106.Field3[2] = false;
                var10000 = this.Field3;
                var10000.Field1 -= 50;
                if (this.Field3.Field1 < 0) {
                    this.Field3.Field1 = 0;
                }
            } else if (Class106.Field3[8]) {
                Class106.Field3[8] = false;
                var10000 = this.Field3;
                var10000.Field1 += 50;
                if (this.Field3.Field1 > this.Field3.Field3) {
                    this.Field3.Field1 = this.Field3.Field3;
                }
            }
        } else {
            Vector var1 = null;
            if (this.Field21 > -1 && this.Field21 < Field12.size()) {
                var1 = (Vector) Field12.elementAt(this.Field21);
                if (Class106.Field3[2]) {
                    Class106.Field3[2] = false;
                    --this.Field15;
                    if (this.Field15 < 0) {
                        this.Field15 = var1.size() - 1;
                    }

                    this.Field13.Field1(this.Field15 * (Field1 + 2));
                } else if (Class106.Field3[8]) {
                    Class106.Field3[8] = false;
                    ++this.Field15;
                    if (this.Field15 > var1.size() - 1) {
                        this.Field15 = 0;
                    }

                    this.Field13.Field1(this.Field15 * (Field1 + 2));
                }
            }

            if (Class106.Field3[4]) {
                Class106.Field3[4] = false;
                --this.Field21;
                if (this.Field21 < 0) {
                    this.Field21 = this.Field23.length - 1;
                }

                this.Field14.Field1(this.Field21 * (this.Field20 + 2));
            } else if (Class106.Field3[6]) {
                Class106.Field3[6] = false;
                ++this.Field21;
                if (this.Field21 > this.Field23.length - 1) {
                    this.Field21 = 0;
                }

                this.Field14.Field1(this.Field21 * (this.Field20 + 2));
            }
        }

        super.Field3();
    }

    public final void Field1() {
        super.Field1();
    }

    public final void Field1(Class671 var1) {
        this.Field4 = var1;
        super.Field1(var1);
    }
}
