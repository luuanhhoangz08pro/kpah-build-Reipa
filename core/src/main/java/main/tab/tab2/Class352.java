package main.tab.tab2;

import main.lib.Graphics;

import java.util.Vector;

public final class Class352 extends Class671 {
    private static Class352 Field34;
    private static int Field35;
    private static int Field36;
    private static int Field37;
    private static int Field38;
    public static Vector Field1 = new Vector();
    private Class430 Field39 = new Class430();
    public Class430 Field2 = new Class430();
    private Class430 Field40 = new Class430();
    private int Field41;
    private int Field42;
    private int Field43;
    private int Field44;
    private int Field45 = 28;
    public int Field3;
    private int Field46;
    private int Field47;
    public int Field4;
    private int Field48;
    public Class671 Field5;
    public String[] Field6 = new String[]{""};
    public String Field7 = "Cộng thuộc tính";
    public boolean Field8;
    public byte Field9;
    private Class86 Field49;
    private Class86 Field50;
    Class86 Field10;
    Class86 Field11;
    Class86 Field12;
    private int Field51;
    static Class534 Field13;
    static Class272 Field14 = null;
    static Class272 Field15 = null;
    static Class272 Field16 = null;
    private int[] Field52;
    private int[] Field53;
    private int[] Field54;
    boolean Field17;
    boolean Field18;
    private int Field55;
    String Field19 = "Thong bao";
    public byte Field20;
    public byte Field21;
    private int Field56;
    public static Vector Field22 = new Vector();
    public static boolean Field23;
    public static boolean Field24;
    public static boolean Field25;
    public static boolean Field26 = true;
    public static short Field27 = -1;
    public static short Field28 = -1;
    public static short Field29 = -1;
    public static short Field30;
    private static byte Field57 = 0;
    private static byte Field58 = 1;
    Class86 Field31;
    Class86 Field32;
    Class86 Field33;

    public static Class352 Field5() {
        return Field34 == null ? (Field34 = new Class352()) : Field34;
    }

    public final void Field6() {
        this.Field39.Field1();
        this.Field40.Field1();
        this.Field2.Field1();
        Field1 = new Vector();
        this.Field3 = 0;
        this.Field4 = 0;
        this.Field18 = false;
        this.Field1(this.Field9, false);
        this.Field20 = 0;
        this.Field46 = 0;
        this.Field48 = 0;
        if (Class106.Field37) {
            this.Field20 = -1;
            this.Field46 = -1;
            this.Field48 = -1;
        }

        this.Field48 = 0;
        if (Class106.Field37) {
            this.Field48 = -1;
        }

    }

    public final void Field1(byte var1, boolean var2) {
        int var3 = Field37 + Field35 / 2 - 44;
        int var4 = Field38 + Field36 / 2 - 35;
        if (Class106.Field37) {
            var3 = Field37 + Field35 / 4 - 44;
        }

        if (var1 == 0) {
            this.Field52 = new int[2];
            this.Field54 = new int[2];
            this.Field53 = new int[2];
            this.Field52[0] = var3;
            this.Field52[1] = var3 + 44 + 22;
            this.Field53[0] = var4;
            this.Field53[1] = var4;
            this.Field54[0] = this.Field52[0];
            this.Field54[1] = this.Field52[1];
        } else if (var1 == 1) {
            this.Field11.Field1 = "Đập";
            this.Field52 = new int[4];
            this.Field54 = new int[4];
            this.Field53 = new int[4];
            this.Field52[1] = var3 - 22;
            this.Field52[2] = var3 + 44 - 11;
            this.Field52[3] = var3 + 44 + 22 + 22;
            this.Field52[0] = var3 + 44 - 11;
            this.Field53[1] = var4 + 11;
            this.Field53[2] = var4 + 11;
            this.Field53[3] = var4 + 11;
            this.Field53[0] = var4 - 18;
            this.Field54[0] = this.Field52[0];
            this.Field54[1] = this.Field52[1];
            this.Field54[2] = this.Field52[2];
            this.Field54[3] = this.Field52[3];
            this.Field55 = var3 + 44 - 1;
        } else if (var1 == 4) {
            this.Field52 = new int[3];
            this.Field54 = new int[3];
            this.Field53 = new int[3];
            this.Field52[1] = var3 + 44 + 20;
            this.Field52[0] = var3 + 44 - 11;
            this.Field52[2] = var3 + 44 - 42;
            this.Field53[1] = var4 + 22;
            this.Field53[0] = var4 - 11;
            this.Field53[2] = var4 + 22;
            this.Field54[0] = this.Field52[0];
            this.Field54[1] = this.Field52[1];
            this.Field54[2] = this.Field52[1];
            this.Field55 = var3 + 44 - 1;
        } else {
            this.Field52 = new int[2];
            this.Field54 = new int[2];
            this.Field53 = new int[2];
            this.Field52[1] = var3 + 44 - 11;
            this.Field52[0] = var3 + 44 - 11;
            this.Field53[1] = var4 + 11;
            this.Field53[0] = var4 - 18;
            this.Field54[0] = this.Field52[0];
            this.Field54[1] = this.Field52[1];
            this.Field55 = var3 + 44 - 1;
        }

        (new StringBuffer("TYPE SCREENDAPDO ")).append(var1).toString();
        this.Field51 = 0;
        if (var2) {
            this.Field20 = 0;
            if (Class106.Field37) {
                this.Field20 = -1;
            }

            if (var1 == 1) {
                super.Field103 = this.Field11;
            }

            if (var1 == 0) {
                super.Field103 = this.Field31;
            }

            if (var1 == 2) {
                super.Field103 = this.Field33;
            }

            if (var1 == 3) {
                super.Field103 = this.Field33;
            }

            if (var1 == 4) {
                super.Field103 = this.Field32;
            }

            this.Field8 = false;
            this.Field2.Field1();
            this.Field17 = false;
        } else {
            this.Field17 = false;
            if (var1 == 1) {
                super.Field103 = this.Field11;
            }

            if (var1 == 0) {
                super.Field103 = this.Field31;
            }

            if (var1 == 2) {
                super.Field103 = this.Field33;
            }

            if (var1 == 3) {
                super.Field103 = this.Field33;
            }

            if (var1 == 4) {
                super.Field103 = this.Field32;
            }
        }

        Class60.Field5 = var1;
        this.Field9 = var1;
        this.Field10();
        this.Field1(true, false);
    }

    public Class352() {
        Field35 = Class106.Field13 - 10;
        Field36 = Class106.Field14 - Class671.Field109 - 10;
        if (Field35 > 176) {
            Field35 = 176;
        }

        if (Field36 > 220) {
            Field36 = 220;
        }

        if (Class106.Field13 >= 320 && Class106.Field37) {
            Field35 = 300;
        }

        Field37 = Class106.Field13 / 2 - Field35 / 2;
        if ((Field38 = (Class106.Field14 - Class671.Field109) / 2 - Field36 / 2) < 5) {
            Field38 = 5;
        }

        if (Field37 < 5) {
            Field37 = 5;
        }

        this.Field43 = Field35;
        if (Class106.Field37 && Field35 == 300) {
            this.Field41 = Field37 + Field35 / 2;
            this.Field42 = Field38 + 55;
            this.Field43 = Field35 / 2 - 8;
            this.Field44 = Field36 - 54;
        }

        this.Field47 = Field36 - 54;
        this.Field49 = new Class86("Đóng", new Class550(this));
        boolean var10003 = Class106.Field37;
        this.Field10 = new Class86("", new Class549(this));
        this.Field11 = new Class86("Đập", new Class543(this));
        this.Field31 = new Class86("Đập", new Class857(this));
        this.Field32 = new Class86("Đập", new Class344(this));
        this.Field33 = new Class86("Đập", new Class862(this));
        this.Field12 = new Class86("Tiếp tục", new Class289(this));
        this.Field50 = new Class86("", new Class290(this));
        super.Field105 = this.Field49;
        super.Field104 = this.Field10;
        this.Field46 = 0;
        if (Class106.Field37) {
            this.Field46 = -1;
            this.Field20 = -1;
            this.Field48 = -1;
        }

        this.Field48 = 0;
        if (Class106.Field37) {
            this.Field48 = -1;
        }

    }

    public final void Field7() {
        int var1 = Field37 + Field35 / 2 - 44;
        if (Class106.Field37) {
            var1 = Field37 + Field35 / 4 - 44;
        }

        this.Field54[0] = this.Field54[1] = var1 + 44 - 11;
        this.Field51 = 10;
        this.Field17 = true;
    }

    public final void Field8() {
        if (this.Field20 == 1) {
            if (Class357.Field125.size() == 0) {
                return;
            }

            if (this.Field3 < 0 || this.Field3 > Field22.size() - 1) {
                return;
            }

            Class534 var1;
            if (!(var1 = (Class534) Field22.elementAt(this.Field3)).Field32) {
                var1.Field32 = true;
                Class261.Field1().Field1(var1.Field9, Class106.Field19.Field15.Field189);
            }

            this.Field6 = Class21.Field10[0].Field1(var1.Field1(false), this.Field43 - 10);
        } else if (this.Field20 == 0) {
            if (Field1.size() <= 0) {
                return;
            }

            Class750 var3;
            String var2 = Class534.Field1((var3 = Class811.Field1(((Class272) Field1.elementAt(this.Field4)).Field1)).Field10, "0");
            var2 = var2 + Class534.Field1(var3.Field11, "0");
            this.Field6 = Class21.Field10[0].Field1(var2, this.Field43 - 10);
        }

        if (!Class106.Field37) {
            if (this.Field6.length == 1) {
                this.Field44 = 35;
                this.Field42 = Class106.Field14 / 2 - Class21.Field10[0].Field2() / 2;
            } else {
                this.Field44 = this.Field6.length * Class671.Field109 + 8;
                this.Field42 = Class106.Field14 / 2 - this.Field6.length * (Class671.Field109 - 3) / 2;
            }

            if (this.Field42 < Field38) {
                this.Field42 = Field38;
            }

            if (this.Field44 > 150) {
                this.Field44 = 150;
            }

            this.Field41 = Field37;
        }

        this.Field8 = true;
        if (!Class106.Field37) {
            super.Field104 = this.Field50;
        }

        super.Field103 = this.Field50;
    }

    private void Field2(Graphics var1) {
        var1.setColor(25695);
        int var2 = Class106.Field37 ? -27 : 10;
        var1.fillRect(this.Field41 + 2, this.Field42 + var2, this.Field43, this.Field44 - 8);
        var1.setColor(16774720);
        var1.drawRect(this.Field41 + 2, this.Field42 + var2, this.Field43, this.Field44 - 8);
    }

    private void Field3(Graphics var1) {
        Class106.Field1(var1);
        if (Field35 >= 300) {
            this.Field2(var1);
            if (!this.Field8) {
                return;
            }
        } else {
            if (!this.Field8) {
                return;
            }

            this.Field2(var1);
        }

        int var2 = Class106.Field37 ? 24 : 0;
        this.Field2.Field1(this.Field6.length, Class671.Field109 - 2, this.Field41, this.Field42 - var2, this.Field43 - 2, this.Field44 - 10, true, 0);
        this.Field2.Field1(var1, this.Field41, this.Field42 + (Class106.Field37 ? 2 : 10) - var2, this.Field43 - 2, this.Field44 - 15);

        for (int var3 = 0; var3 < this.Field6.length; ++var3) {
            if (!this.Field6[var3].equals("")) {
                byte var4 = (byte) (this.Field6[var3].charAt(0) - 48);
                byte var5 = 1;
                if (!Class464.Field1(this.Field6[var3].charAt(0))) {
                    var4 = 0;
                    var5 = 0;
                }

                Class21.Field10[var4 >= 5 ? 0 : var4].Field1(var1, this.Field6[var3].substring(var5), this.Field41 + 8, this.Field42 + var3 * (Class671.Field109 - 3) + (Class106.Field37 ? 6 : 14) - (var2 + (Class106.Field37 ? 2 : 0)), 0);
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field5 != null) {
            this.Field5.Field1(var1);
        }

        Class811.Field1(var1, Field37, Field38, Field35, Field36, 25, this.Field7, true, this.Field47 - 28);
        Class106.Field1(var1);
        this.Field39.Field1(Class357.Field125.size(), this.Field45, Field37, Field38 + 28 + this.Field47, Field35 - 2, 27, false, 0);
        this.Field39.Field1(var1, Field37 + 2, Field38 + 23 + this.Field47, Field35 - 4, 31);

        int var2;
        for (var2 = 0; var2 < Field22.size(); ++var2) {
            if (this.Field3 == var2 && this.Field20 == 1) {
                var1.setColor(6513507);
                var1.fillRect(Field37 + this.Field45 * var2, Field38 + 23 + this.Field47, this.Field45, 28);
            }

            Class534 var3;
            (var3 = (Class534) Field22.elementAt(var2)).Field1(var1, Field37 + this.Field45 * var2 + this.Field45 / 2, Field38 + 36 + this.Field47);
            var1.setColor(14527502);
            var1.fillRect(Field37 + this.Field45 * var2, Field38 + 22 + this.Field47, 1, 29);
            if (Field13 != null && Field13.Field9 == var3.Field9) {
                var1.setColor(3268607);
                var1.drawRect(Field37 + this.Field45 * var2 + 1, Field38 + 23 + this.Field47, this.Field45 - 2, 28);
                var1.drawRect(Field37 + this.Field45 * var2 + 2, Field38 + 24 + this.Field47, this.Field45 - 4, 26);
            }
        }

        var1.setColor(14527502);
        var1.fillRect(Field37 + this.Field45 * Field22.size(), Field38 + 22 + this.Field47, 1, 29);
        Class106.Field1(var1);
        var2 = !Class106.Field37 ? Field35 - 2 : Field35 - 2 - this.Field43;
        this.Field40.Field1(Field1.size(), this.Field45 + 2, Field37, Field38 + this.Field47, var2, 27, false, 0);
        this.Field40.Field1(var1, Field37 + 2, Field38 + 23 + this.Field47 - 28, var2 - 2, 31);

        for (int var5 = 0; var5 < Field1.size(); ++var5) {
            if (this.Field4 == var5 && this.Field20 == 0) {
                var1.setColor(6513507);
                var1.fillRect(Field37 + this.Field45 * var5, Field38 + 24 + this.Field47 - 28, this.Field45, 26);
            }

            Class272 var4;
            if ((var4 = (Class272) Field1.elementAt(var5)).Field4) {
                var1.setColor(3276851);
                var1.fillRect(Field37 + this.Field45 * var5, Field38 + 24 + this.Field47 - 28, this.Field45, 26);
                if (this.Field4 == var5 && this.Field20 == 0) {
                    var1.setColor(6513507);
                    var1.fillRect(Field37 + this.Field45 * var5, Field38 + 24 + this.Field47 - 28, this.Field45, 26);
                }
            }

            if (Field14 != null && Field14.Field1 == var4.Field1 && Field14.Field4 == var4.Field4) {
                var1.setColor(3268607);
                var1.drawRect(Field37 + this.Field45 * var5 + 1, Field38 + 24 + this.Field47 - 28, this.Field45 - 2, 25);
                var1.drawRect(Field37 + this.Field45 * var5 + 2, Field38 + 24 + this.Field47 - 27, this.Field45 - 4, 23);
            }

            if (Field15 != null && Field15.Field1 == var4.Field1 && Field15.Field4 == var4.Field4) {
                var1.setColor(238149631);
                var1.drawRect(Field37 + this.Field45 * var5 + 1, Field38 + 24 + this.Field47 - 28, this.Field45 - 2, 25);
                var1.drawRect(Field37 + this.Field45 * var5 + 2, Field38 + 24 + this.Field47 - 27, this.Field45 - 4, 23);
            }

            if (Field16 != null && Field16.Field1 == var4.Field1 && Field16.Field4 == var4.Field4) {
                var1.setColor(238149631);
                var1.drawRect(Field37 + this.Field45 * var5 + 1, Field38 + 24 + this.Field47 - 28, this.Field45 - 2, 25);
                var1.drawRect(Field37 + this.Field45 * var5 + 2, Field38 + 24 + this.Field47 - 27, this.Field45 - 4, 23);
            }

            int var10002 = Field37 + this.Field45 * var5 + this.Field45 / 2;
            Class811.Field1(var1, Class811.Field1(var4.Field1).Field12, var10002, Field38 + 24 + this.Field47 - 28 + 13);
            Class21.Field9[3].Field1(var1, String.valueOf(var4.Field3), Field37 + this.Field45 * var5 + this.Field45 - 1, Field38 + 22 + this.Field47 - Class21.Field9[3].Field2(), 1);
            var1.setColor(14527502);
            var1.fillRect(Field37 + this.Field45 * var5, Field38 + 22 + this.Field47 - 28, 1, 29);
        }

        var1.fillRect(Field37 + this.Field45 * Field1.size(), Field38 + 22 + this.Field47 - 28, 1, 28);
        Class106.Field1(var1);
        this.Field4(var1);
        this.Field3(var1);
        super.Field1(var1);
    }

    private void Field4(Graphics var1) {
        int var2;
        for (var2 = 0; var2 < this.Field52.length; ++var2) {
            var1.setColor(16777215);
            var1.fillRect(this.Field52[var2], this.Field53[var2], 22, 22);
            if (this.Field51 % 2 == 0) {
                var1.setColor(6513507);
                var1.fillRect(this.Field52[var2] + 1, this.Field53[var2] + 1, 20, 20);
            }
        }

        int var10002;
        int var10003;
        if (this.Field9 != 1) {
            if (Field14 != null) {
                var10002 = this.Field52[1] + 10;
                var10003 = this.Field53[1];
                Class811.Field1(var1, Class811.Field1(Field14.Field1).Field12, var10002, var10003 + 10);
            }

            if (Field13 != null) {
                Field13.Field1(var1, this.Field52[0] + 10, this.Field53[0] + 10);
            }

            if (this.Field9 == 4 && Field15 != null) {
                var10002 = this.Field52[2] + 10;
                var10003 = this.Field53[2];
                Class811.Field1(var1, Class811.Field1(Field15.Field1).Field12, var10002, var10003 + 10);
            }
        } else if (this.Field9 == 1) {
            if (Field14 != null) {
                var10002 = this.Field52[2] + 10;
                var10003 = this.Field53[2];
                Class811.Field1(var1, Class811.Field1(Field14.Field1).Field12, var10002, var10003 + 10);
            }

            if (Field15 != null) {
                var10002 = this.Field52[1] + 10;
                var10003 = this.Field53[1];
                Class811.Field1(var1, Class811.Field1(Field15.Field1).Field12, var10002, var10003 + 10);
            }

            if (Field16 != null) {
                var10002 = this.Field52[3] + 10;
                var10003 = this.Field53[3];
                Class811.Field1(var1, Class811.Field1(Field16.Field1).Field12, var10002, var10003 + 10);
            }

            if (Field13 != null) {
                Field13.Field1(var1, this.Field52[0] + 10, this.Field53[0] + 10);
            }
        }

        if (this.Field9 != 0 && this.Field18 && !this.Field19.equals("")) {
            var2 = Field38 + this.Field47 - 24;
            var1.setColor(16777215);
            var1.fillRect(this.Field55 - 60, var2 - 3, 120, 20);
            var1.setColor(3222312);
            var1.fillRect(this.Field55 - 59, var2 - 2, 118, 18);
            Class21.Field10[0].Field1(var1, this.Field19, this.Field55, var2, 2);
        }
    }

    public final void Field4() {
        if (this.Field5 != null) {
            this.Field5.Field4();
        }

        --this.Field51;
        if (this.Field51 < 0) {
            this.Field51 = 0;
        }

        if (this.Field51 <= 0) {
            int[] var10000;
            if (this.Field52[0] != this.Field54[0]) {
                if (this.Field54[0] - this.Field52[0] >> 1 == 0) {
                    this.Field52[0] = this.Field54[0];
                } else {
                    var10000 = this.Field52;
                    var10000[0] += this.Field54[0] - this.Field52[0] >> 1;
                }
            }

            if (this.Field52[1] != this.Field54[1]) {
                if (this.Field54[1] - this.Field52[1] >> 1 == 0) {
                    this.Field52[1] = this.Field54[1];
                } else {
                    var10000 = this.Field52;
                    var10000[1] += this.Field54[1] - this.Field52[1] >> 1;
                }
            }
        }

        if (this.Field21 > 0) {
            --this.Field21;
        }

        if (this.Field21 <= 0) {
            this.Field21 = 0;
        }

        boolean var1 = false;
        boolean var2 = false;
        if (Class106.Field23 == null) {
            Class47 var3;
            if (Class106.Field37) {
                if (this.Field2.Field6) {
                    this.Field39.Field6 = false;
                    this.Field40.Field6 = false;
                } else if (this.Field39.Field6) {
                    this.Field2.Field6 = false;
                    this.Field40.Field6 = false;
                } else if (this.Field40.Field6) {
                    this.Field39.Field6 = false;
                    this.Field2.Field6 = false;
                }

                if (this.Field39.Field6 && !Class106.Field21.Field1 && this.Field21 == 0) {
                    this.Field20 = 1;
                    if ((var3 = this.Field39.Field2()).Field1 || var3.Field3) {
                        this.Field3 = var3.Field2;
                        this.Field46 = var3.Field2;
                        var1 = true;
                        if (super.Field105 != null && this.Field8 && Class106.Field10()) {
                            super.Field105.Field2.Field1();
                        }
                    }
                }

                this.Field39.Field3();
                if (this.Field40.Field6 && !Class106.Field21.Field1 && this.Field21 == 0) {
                    this.Field20 = 0;
                    if ((var3 = this.Field40.Field2()).Field1 || var3.Field3) {
                        this.Field4 = var3.Field2;
                        this.Field48 = var3.Field2;
                        var2 = true;
                        if (super.Field105 != null && this.Field8 && Class106.Field10()) {
                            super.Field105.Field2.Field1();
                        }
                    }
                }

                this.Field40.Field3();
                var3 = null;
                if (this.Field2.Field6 && !Class106.Field21.Field1) {
                    this.Field2.Field2();
                }

                this.Field2.Field3();
                if (!Class106.Field6) {
                    if (this.Field39.Field6 && var1) {
                        if (this.Field3 > -1 && this.Field3 <= Field22.size() - 1) {
                            if (this.Field46 != -1) {
                                this.Field3 = this.Field46;
                            }

                            this.Field10.Field2.Field1();
                        }
                    } else if (this.Field40.Field6 && var2 && this.Field4 > -1 && this.Field4 <= Field1.size() - 1) {
                        if (this.Field48 != -1) {
                            this.Field4 = this.Field48;
                        }

                        this.Field10.Field2.Field1();
                    }

                    this.Field2.Field6 = false;
                    this.Field39.Field6 = false;
                    this.Field40.Field6 = false;
                }
            } else if (!this.Field8) {
                if ((var3 = this.Field39.Field2()).Field1 || var3.Field3) {
                    this.Field3 = var3.Field2;
                    this.Field39.Field1(this.Field3 * (this.Field45 + 2));
                }

                this.Field39.Field3();
                Class47 var4;
                if ((var4 = this.Field40.Field2()).Field1 || var4.Field3) {
                    this.Field4 = var4.Field2;
                    this.Field40.Field1(this.Field4 * (this.Field45 + 2));
                }

                this.Field40.Field3();
            } else {
                this.Field2.Field2();
                this.Field2.Field3();
            }
        }

        super.Field4();
    }

    public final void Field3() {
        if (this.Field8) {
            Class430 var10000;
            if (Class106.Field3[2]) {
                Class106.Field3[2] = false;
                var10000 = this.Field2;
                var10000.Field1 -= 50;
                if (this.Field2.Field1 < 0) {
                    this.Field2.Field1 = 0;
                }
            } else if (Class106.Field3[8]) {
                Class106.Field3[8] = false;
                var10000 = this.Field2;
                var10000.Field1 += 50;
                if (this.Field2.Field1 > this.Field2.Field3) {
                    this.Field2.Field1 = this.Field2.Field3;
                }
            }
        } else {
            if (Class106.Field3[2]) {
                Class106.Field3[2] = false;
                --this.Field20;
                if (this.Field20 < 0) {
                    this.Field20 = 0;
                }
            } else if (Class106.Field3[8]) {
                Class106.Field3[8] = false;
                ++this.Field20;
                if (this.Field20 > 1) {
                    this.Field20 = 1;
                }
            }

            if (Class106.Field3[4]) {
                Class106.Field3[4] = false;
                if (this.Field20 == 1) {
                    --this.Field3;
                    if (this.Field3 < 0) {
                        this.Field3 = Field22.size() - 1;
                    }

                    this.Field39.Field1(this.Field3 * this.Field45);
                } else if (this.Field20 == 0) {
                    --this.Field4;
                    if (this.Field4 < 0) {
                        this.Field4 = Field1.size() - 1;
                    }

                    this.Field40.Field1(this.Field4 * this.Field45);
                } else {
                    --this.Field56;
                    if (this.Field56 < 0) {
                        this.Field56 = this.Field52.length - 1;
                    }
                }
            } else if (Class106.Field3[6]) {
                Class106.Field3[6] = false;
                if (this.Field20 == 1) {
                    ++this.Field3;
                    if (this.Field3 > Field22.size() - 1) {
                        this.Field3 = 0;
                    }

                    this.Field39.Field1(this.Field3 * this.Field45);
                } else if (this.Field20 == 0) {
                    ++this.Field4;
                    if (this.Field4 > Field1.size() - 1) {
                        this.Field4 = 0;
                    }

                    this.Field40.Field1(this.Field4 * this.Field45);
                } else {
                    --this.Field56;
                    if (this.Field56 < 0) {
                        this.Field56 = this.Field52.length - 1;
                    }
                }
            }
        }

        super.Field3();
    }

    public static boolean Field2(int var0) {
        return var0 >= 0 && var0 <= 4;
    }

    public static boolean Field3(int var0) {
        return var0 >= 5 && var0 <= 7 || var0 == 155 || var0 == 156;
    }

    public static boolean Field4(int var0) {
        return var0 >= 8 && var0 <= 11 || var0 == 66 || var0 == 245 || var0 == 157 || var0 == 158;
    }

    public static boolean Field5(int var0) {
        return var0 == Class750.Field5;
    }

    public static boolean Field6(int var0) {
        return var0 == Class750.Field6;
    }

    private void Field1(boolean var1, boolean var2) {
        Field1.removeAllElements();
        if (var1) {
            Field22.removeAllElements();
        }

        Vector var13;
        int var3 = (var13 = Class582.Field37).size();
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;

        for (int var7 = 0; var7 < var3; ++var7) {
            Class272 var8;
            Class750 var9 = Class811.Field1((var8 = (Class272) var13.elementAt(var7)).Field1);
            if (this.Field9 == 0) {
                if (var9.Field8 == Class750.Field2) {
                    if (Field14 != null && Field14.Field1 == var8.Field1 && !Field14.Field4) {
                        Field14 = var8;
                        var4 = true;
                    }

                    Field1.addElement(var8);
                }
            } else if (this.Field9 == 2) {
                if (var9.Field8 == Class750.Field3) {
                    if (Field14 != null && Field14.Field1 == var8.Field1 && !Field14.Field4) {
                        Field14 = var8;
                    }

                    Field1.addElement(var8);
                }
            } else if (this.Field9 == 3) {
                if (var9.Field8 == Class750.Field4) {
                    if (Field14 != null && Field14.Field1 == var8.Field1 && !Field14.Field4) {
                        Field14 = var8;
                    }

                    Field1.addElement(var8);
                }
            } else if (this.Field9 == 4) {
                if (var9.Field8 == Class750.Field5 || var9.Field8 == Class750.Field6) {
                    if (Field14 != null && Field14.Field1 == var8.Field1 && !Field14.Field4 && var9.Field8 == Class750.Field5) {
                        Field14 = var8;
                        var4 = true;
                    }

                    if (Field15 != null && Field15.Field1 == var8.Field1 && !Field15.Field4 && var9.Field8 == Class750.Field6) {
                        Field15 = var8;
                        var5 = true;
                    }

                    Field1.addElement(var8);
                }
            } else if (var9.Field8 == 0) {
                if (Field14 != null && Field14.Field1 == var8.Field1 && !Field14.Field4) {
                    Field14 = var8;
                    var4 = true;
                } else if (Field14 == null && var2 && Field27 == var8.Field1 && !Field23) {
                    Field14 = var8;
                    var4 = true;
                }

                if (Field15 != null && Field15.Field1 == var8.Field1 && !Field15.Field4) {
                    Field15 = var8;
                    var5 = true;
                } else if (Field15 == null && var2 && Field29 == var8.Field1 && !Field25) {
                    Field15 = var8;
                    var5 = true;
                }

                if (Field16 != null && Field16.Field1 == var8.Field1 && !Field16.Field4) {
                    Field16 = var8;
                    var6 = true;
                } else if (Field16 == null && var2 && Field28 == var8.Field1 && !Field24) {
                    Field16 = var8;
                    var6 = true;
                }

                Field1.addElement(var8);
            }
        }

        var3 = (var13 = Class582.Field38).size();
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;

        int var10;
        for (var10 = 0; var10 < var3; ++var10) {
            Class272 var11;
            Class750 var12 = Class811.Field1((var11 = (Class272) var13.elementAt(var10)).Field1);
            if (this.Field9 == 0) {
                if (var12.Field8 == Class750.Field2) {
                    if (Field14 != null && Field14.Field1 == var11.Field1 && Field14.Field4) {
                        Field14 = var11;
                        var14 = true;
                    }

                    Field1.addElement(var11);
                    var11.Field4 = true;
                }
            } else if (this.Field9 == 2) {
                if (var12.Field8 == Class750.Field3) {
                    if (Field14 != null && Field14.Field1 == var11.Field1 && Field14.Field4) {
                        Field14 = var11;
                    }

                    Field1.addElement(var11);
                    var11.Field4 = true;
                }
            } else if (this.Field9 == 3) {
                if (var12.Field8 == Class750.Field4) {
                    if (Field14 != null && Field14.Field1 == var11.Field1 && Field14.Field4) {
                        Field14 = var11;
                    }

                    Field1.addElement(var11);
                    var11.Field4 = true;
                }
            } else if (this.Field9 == 4) {
                if (var12.Field8 == Class750.Field5 || var12.Field8 == Class750.Field6) {
                    if (Field14 != null && Field14.Field1 == var11.Field1 && Field14.Field4 && var12.Field8 == Class750.Field5) {
                        Field14 = var11;
                        var14 = true;
                    }

                    if (Field15 != null && Field15.Field1 == var11.Field1 && Field15.Field4 && var12.Field8 == Class750.Field6) {
                        Field15 = var11;
                        var15 = true;
                    }

                    Field1.addElement(var11);
                    var11.Field4 = true;
                }
            } else if (var12.Field8 == 0) {
                if (Field14 != null && Field14.Field1 == var11.Field1 && Field14.Field4) {
                    Field14 = var11;
                    var14 = true;
                } else if (Field14 == null && var2 && Field27 == var11.Field1 && Field23) {
                    Field14 = var11;
                    var14 = true;
                }

                if (Field15 != null && Field15.Field1 == var11.Field1 && Field15.Field4) {
                    Field15 = var11;
                    var15 = true;
                } else if (Field15 == null && var2 && Field29 == var11.Field1 && Field25) {
                    Field15 = var11;
                    var15 = true;
                }

                if (Field16 != null && Field16.Field1 == var11.Field1 && Field16.Field4) {
                    Field16 = var11;
                    var16 = true;
                } else if (Field16 == null && var2 && Field28 == var11.Field1 && Field24) {
                    Field16 = var11;
                    var16 = true;
                }

                Field1.addElement(var11);
                var11.Field4 = true;
            }
        }

        if (this.Field9 == 0) {
            if (!var4 && !var14) {
                Field14 = null;
            }

            if (!var5 && !var15) {
                Field15 = null;
            }

            if (!var6 && !var16) {
                Field16 = null;
            }
        }

        if (this.Field9 != 0 && this.Field9 != 4) {
            if (this.Field9 == 2) {
                Field22 = Class534.Field1(Field58, 1);
            } else if (this.Field9 == 3) {
                Field22 = Class534.Field4(0);
            } else {
                Field22 = Class534.Field8();
            }
        } else {
            Field22 = Class534.Field3(Field58);
        }

        for (var10 = 0; var10 < Field22.size(); ++var10) {
            Class534 var17 = (Class534) Field22.elementAt(var10);
            if (Field30 == var17.Field9) {
                Field13 = var17;
                return;
            }
        }

    }

    public final void Field7(int var1) {
        Class534 var2;
        if (this.Field3 < Field22.size() && (var2 = (Class534) Field22.elementAt(this.Field3)) != null && var2.Field9 == var1) {
            this.Field6 = Class21.Field10[0].Field1(var2.Field1(false), this.Field43 - 10);
        }

    }

    public final void Field9() {
        this.Field1(false, true);
        this.Field18 = true;
    }

    public final void Field10() {
        Field14 = null;
        Field15 = null;
        Field16 = null;
        Field13 = null;
        this.Field1(true, false);
    }

    public final void Field1() {
        super.Field1();
    }

    public final void Field1(Class671 var1) {
        this.Field5 = var1;
        super.Field1(var1);
    }
}
