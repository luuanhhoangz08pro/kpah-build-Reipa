package main.tab.tab1;

import main.lib.Graphics;

import java.util.Vector;

public final class Class566 extends Class665 {
    private static int Field30;
    private static int Field31;
    private static int Field32;
    private static int Field33;
    private static Vector Field34 = new Vector();
    private Class433 Field35 = new Class433();
    public Class433 Field1 = new Class433();
    private Class433 Field36 = new Class433();
    private int Field37;
    private int Field38;
    private int Field39;
    private int Field40;
    private int Field41 = 28;
    public int Field2;
    private int Field42;
    private int Field43;
    private int Field44;
    private int Field45;
    public Class665 Field3;
    public String[] Field4 = new String[]{""};
    private String Field46 = "Cộng thuộc tính";
    private Vector Field47 = new Vector();
    public boolean Field5;
    public byte Field6;
    private byte Field48;
    public boolean Field7;
    private boolean Field49;
    public boolean Field8;
    public boolean Field9;
    public boolean Field10;
    private int Field50;
    public int Field11;
    public int Field12;
    public int Field13 = 22;
    private Class87 Field51;
    Class87 Field14;
    Class87 Field15;
    private Class87 Field52;
    Class87 Field16;
    private boolean[] Field53;
    public boolean[] Field17;
    private Vector Field54;
    private short Field55;
    private byte Field56;
    private byte Field57;
    private Vector Field58;
    private Vector Field59;
    static Class537 Field18;
    public Class537 Field19;
    public Class537 Field20;
    public Class537 Field21;
    public Class537 Field22;
    private static Class274 Field60 = null;
    private static Class274 Field61 = null;
    private static Class274 Field62 = null;
    static Class274 Field23 = null;
    private int[] Field63;
    private int[] Field64;
    private int[] Field65;
    private int[] Field66;
    boolean Field24;
    private boolean Field67;
    private int Field68;
    private String Field69;
    private Vector Field70;
    private int Field71;
    private int Field72;
    private int Field73;
    public byte Field25;
    public byte Field26;
    public byte Field27;
    public static Vector Field28 = new Vector();
    public static boolean Field29 = true;
    private static short Field74 = -1;
    private static short Field75 = -1;
    private static short Field76 = -1;
    private static byte Field77 = 0;
    private static byte Field78 = 1;

    public final void Field5() {
        this.Field35.Field1();
        this.Field54.removeAllElements();
        this.Field36.Field1();
        this.Field1.Field1();
        this.Field58.removeAllElements();
        this.Field59.removeAllElements();
        this.Field47.removeAllElements();
        Field34.removeAllElements();
        this.Field2 = 0;
        this.Field44 = 0;
        this.Field67 = false;
        this.Field7 = false;
        this.Field25 = 0;
        this.Field42 = 0;
        this.Field45 = 0;
        if (Class105.Field37) {
            this.Field25 = -1;
            this.Field42 = -1;
            this.Field45 = -1;
        }

        this.Field45 = 0;
        if (Class105.Field37) {
            this.Field45 = -1;
        }

    }

    public final void Field1(byte var1, boolean var2) {
        this.Field6 = 5;
        int var3 = Field32 + Field30 / 2 - 44;
        if (Class105.Field37) {
            var3 = Field32 + Field30 / 4 - 44;
        }

        int var4 = Field33 + 27 + (this.Field43 - 28) / 2;
        this.Field15.Field1 = "Nghiền";
        this.Field46 = "Nghiền Bột";
        this.Field25 = 1;
        this.Field63 = new int[5];
        this.Field65 = new int[4];
        this.Field66 = new int[4];
        this.Field64 = new int[5];
        this.Field63[0] = var3 + 44 - 11;
        this.Field63[1] = this.Field63[0] - 48;
        this.Field63[3] = this.Field63[0] + 48;
        this.Field63[2] = this.Field63[0];
        this.Field64[0] = var4 - this.Field13 / 2 + 3;
        if (this.Field64[0] - 2 * this.Field13 < Field33 + 27) {
            this.Field64[0] = Field33 + 27 + 2 * this.Field13;
        }

        this.Field64[2] = this.Field64[0] - 2 * this.Field13;
        this.Field64[1] = this.Field64[0] + 28;
        this.Field64[3] = this.Field64[0] + 28;
        this.Field65[0] = this.Field63[0];
        this.Field65[1] = this.Field63[1];
        this.Field65[2] = this.Field63[2];
        this.Field65[3] = this.Field63[3];
        this.Field66[0] = this.Field64[0];
        this.Field66[1] = this.Field64[1];
        this.Field66[2] = this.Field64[2];
        this.Field66[3] = this.Field64[3];
        this.Field68 = var3 + 44 - 1;
        if (Class105.Field18) {
            this.Field64[2] = this.Field64[0] - 2 * this.Field13 + 4;
            this.Field63[4] = this.Field63[0];
            this.Field64[4] = this.Field64[0] + 40;
        } else {
            this.Field63[4] = this.Field63[0];
            this.Field64[4] = this.Field64[0] + 50;
        }

        this.Field50 = this.Field66[0];
        this.Field11 = this.Field13;
        this.Field12 = 0;
        (new StringBuffer("TYPE SCREENDAPDO ")).append(5).toString();
        this.Field24 = false;
        super.Field103 = this.Field15;
        this.Field8();
        this.Field1(true, false);
    }

    public Class566() {
        new Vector();
        this.Field53 = new boolean[6];
        this.Field17 = new boolean[6];
        this.Field54 = new Vector();
        this.Field55 = 0;
        this.Field56 = 0;
        this.Field57 = 1;
        this.Field58 = new Vector();
        this.Field59 = new Vector();
        this.Field69 = "Thong bao";
        this.Field70 = new Vector();
        this.Field71 = 15;
        this.Field72 = -1;
        this.Field27 = 5;
        Field30 = Class105.Field13 - 10;
        Field31 = Class105.Field14 - Class665.Field109 - 10;
        if (Field30 > 176) {
            Field30 = 176;
        }

        if (Field31 > 220) {
            Field31 = 220;
        }

        if (Class105.Field13 >= 320 && Class105.Field37) {
            Field30 = 300;
        }

        Field32 = Class105.Field13 / 2 - Field30 / 2;
        if ((Field33 = (Class105.Field14 - Class665.Field109) / 2 - Field31 / 2) < 5) {
            Field33 = 5;
        }

        if (Field32 < 5) {
            Field32 = 5;
        }

        this.Field39 = Field30;
        if (Class105.Field37 && Field30 == 300) {
            this.Field37 = Field32 + Field30 / 2;
            this.Field38 = Field33 + 55;
            this.Field39 = Field30 / 2 - 8;
            this.Field40 = Field31 - 54;
        }

        this.Field43 = Field31 - 54;
        this.Field16 = new Class87("Đập", new Class294(this));
        this.Field52 = new Class87("Xin chờ", new Class246(this));
        this.Field15 = new Class87("Nghiền", new Class247(this));
        this.Field51 = new Class87("Đóng", new Class241(this));
        boolean var10003 = Class105.Field37;
        this.Field14 = new Class87("", new Class243(this));
        super.Field105 = this.Field51;
        super.Field104 = this.Field14;
        this.Field42 = 0;
        if (Class105.Field37) {
            this.Field42 = -1;
            this.Field25 = -1;
            this.Field45 = -1;
        }

        this.Field45 = 0;
        if (Class105.Field37) {
            this.Field45 = -1;
        }

    }

    public final void a_(int var1, int var2, int var3) {
        Class105.Field7();
        this.Field55 = (short) var1;
        this.Field56 = (byte) var2;
        this.Field57 = (byte) var3;
        Class566 var5 = this;
        var2 = Class797.Field3[0][10] / 2;
        super.Field104 = this.Field52;
        this.Field15.Field1 = "";
        Class173 var6 = new Class173(this.Field63[2] + var2 - 4, this.Field50 + this.Field13 / 2 - 10, 54);
        this.Field58.addElement(var6);
        var6 = null;

        for (int var4 = 0; var4 < var5.Field63.length; ++var4) {
            if (var4 % 4 != 0) {
                Class303 var7 = new Class303(var5.Field63[var4] + var2 - 4, var5.Field64[var4] + var2 - 10, var5.Field63[2] + var2 - 4, var5.Field50 + var5.Field13 / 2 - 10, 40, 2);
                var5.Field59.addElement(var7);
            }
        }

        this.Field8 = true;
    }

    private void Field2(Graphics var1) {
        for (int var2 = 0; var2 < this.Field59.size(); ++var2) {
            ((Class303) this.Field59.elementAt(var2)).Field1(var1);
        }

    }

    private void Field3(Graphics var1) {
        Class105.Field1(var1);

        for (int var2 = 0; var2 < this.Field58.size(); ++var2) {
            ((Class173) this.Field58.elementAt(var2)).Field1(var1);
        }

    }

    public final void Field6() {
        Class537 var3;
        if (this.Field6 == 6) {
            if (Class359.Field125.size() == 0) {
                return;
            }

            if (this.Field2 < 0 || this.Field2 > Field28.size() - 1) {
                return;
            }

            if (this.Field27 == 2) {
                if (Field23 == null) {
                    return;
                }

                Class743 var1;
                String var2 = Class537.Field1((var1 = Class804.Field1(Field23.Field1)).Field10, "0");
                var2 = var2 + Class537.Field1(var1.Field11, "0");
                this.Field4 = Class21.Field10[0].Field1(var2, this.Field39 - 10);
            }

            if (this.Field27 != 2) {
                if (!(var3 = (Class537) Field28.elementAt(this.Field2)).Field32) {
                    var3.Field32 = true;
                    Class263.Field1().Field1(var3.Field9, Class105.Field19.Field15.Field189);
                }

                this.Field4 = Class21.Field10[0].Field1(var3.Field1(false), this.Field39 - 10);
            }
        }

        if (this.Field6 == 5) {
            if (Class359.Field125.size() == 0) {
                return;
            }

            if (this.Field2 < 0 || this.Field2 > Field28.size() - 1) {
                return;
            }

            if (!(var3 = (Class537) Field28.elementAt(this.Field2)).Field32) {
                var3.Field32 = true;
                Class263.Field1().Field1(var3.Field9, Class105.Field19.Field15.Field189);
            }

            this.Field4 = Class21.Field10[0].Field1(var3.Field1(false), this.Field39 - 10);
        }

        if (!Class105.Field37 && Field28.size() > 0) {
            if (this.Field4.length == 1) {
                this.Field40 = 35;
                this.Field38 = Class105.Field14 / 2 - Class21.Field10[0].Field2() / 2;
            } else {
                this.Field40 = this.Field4.length * Class665.Field109 + 8;
                this.Field38 = Class105.Field14 / 2 - this.Field4.length * (Class665.Field109 - 3) / 2;
            }

            if (this.Field38 < Field33) {
                this.Field38 = Field33;
            }

            if (this.Field40 > 150) {
                this.Field40 = 150;
            }

            this.Field37 = Field32;
        }

        if (!Class105.Field37) {
            this.Field5 = true;
            super.Field104 = null;
            super.Field103 = null;
        }

    }

    private void Field4(Graphics var1) {
        var1.setColor(25695);
        int var2 = Class105.Field37 ? -27 : 10;
        var1.fillRect(this.Field37 + 2, this.Field38 + var2, this.Field39, this.Field40 - 8);
        var1.setColor(16774720);
        var1.drawRect(this.Field37 + 2, this.Field38 + var2, this.Field39, this.Field40 - 8);
    }

    private void Field5(Graphics var1) {
        Class105.Field1(var1);
        if (Field30 >= 300) {
            this.Field4(var1);
            if (!this.Field5 && !Class105.Field37) {
                return;
            }
        } else {
            if (!this.Field5 && !Class105.Field37) {
                return;
            }

            this.Field4(var1);
        }

        int var2 = Class105.Field37 ? 24 : 0;
        this.Field1.Field1(this.Field4.length, Class665.Field109 - 2, this.Field37, this.Field38 - var2, this.Field39 - 2, this.Field40 - 10, true, 0);
        this.Field1.Field1(var1, this.Field37, this.Field38 + (Class105.Field37 ? 2 : 10) - var2, this.Field39 - 2, this.Field40 - 15);

        for (int var3 = 0; var3 < this.Field4.length; ++var3) {
            if (!this.Field4[var3].equals("")) {
                byte var4 = (byte) (this.Field4[var3].charAt(0) - 48);
                byte var5 = 1;
                if (!Class467.Field1(this.Field4[var3].charAt(0))) {
                    var4 = 0;
                    var5 = 0;
                }

                Class21.Field10[var4 >= 5 ? 0 : var4].Field1(var1, this.Field4[var3].substring(var5), this.Field37 + 8, this.Field38 + var3 * (Class665.Field109 - 3) + (Class105.Field37 ? 6 : 14) - (var2 + (Class105.Field37 ? 2 : 0)), 0);
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field3 != null) {
            this.Field3.Field1(var1);
        }

        Class566 var2;
        Graphics var3;
        int var4;
        if (this.Field6 == 5) {
            var3 = var1;
            var2 = this;
            Class804.Field1(var1, Field32, Field33, Field30, Field31, 25, this.Field46, false, this.Field43 - 28);
            Class105.Field1(var1);
            this.Field35.Field1(Field28.size(), this.Field41, Field32, Field33 + 28 + this.Field43, Field30 - 2, 27, false, 0);
            this.Field35.Field1(var1, Field32 + 2, Field33 + 23 + this.Field43, Field30 - 4, 31);

            for (var4 = 0; var4 < Field28.size(); ++var4) {
                if (var2.Field2 == var4) {
                    var3.setColor(6513507);
                    var3.fillRect(Field32 + var2.Field41 * var4, Field33 + 23 + var2.Field43, var2.Field41, 28);
                }

                Class537 var5;
                (var5 = (Class537) Field28.elementAt(var4)).Field1(var3, Field32 + var2.Field41 * var4 + var2.Field41 / 2, Field33 + 36 + var2.Field43);
                var3.setColor(14527502);
                var3.fillRect(Field32 + var2.Field41 * var4, Field33 + 22 + var2.Field43, 1, 29);
                if (Field18 != null && Field18.Field9 == var5.Field9) {
                    var3.setColor(3268607);
                    var3.drawRect(Field32 + var2.Field41 * var4 + 1, Field33 + 23 + var2.Field43, var2.Field41 - 2, 28);
                    var3.drawRect(Field32 + var2.Field41 * var4 + 2, Field33 + 24 + var2.Field43, var2.Field41 - 4, 26);
                }
            }

            var3.setColor(14527502);
            var3.fillRect(Field32 + var2.Field41 * Field28.size(), Field33 + 22 + var2.Field43, 1, 29);
            Class105.Field1(var3);
        } else if (this.Field6 == 6) {
            var3 = var1;
            var2 = this;
            Class804.Field1(var1, Field32, Field33, Field30, Field31, 25, this.Field46, false, this.Field43 - 28);
            Class105.Field1(var1);
            if (this.Field27 != 2) {
                this.Field35.Field1(Field28.size(), this.Field41, Field32, Field33 + 28 + this.Field43, Field30 - 2, 27, false, 0);
                this.Field35.Field1(var1, Field32 + 2, Field33 + 23 + this.Field43, Field30 - 4, 31);

                for (var4 = 0; var4 < Field28.size(); ++var4) {
                    if (var2.Field2 == var4) {
                        var3.setColor(6513507);
                        var3.fillRect(Field32 + var2.Field41 * var4, Field33 + 23 + var2.Field43, var2.Field41, 28);
                    }

                    ((Class537) Field28.elementAt(var4)).Field1(var3, Field32 + var2.Field41 * var4 + var2.Field41 / 2, Field33 + 36 + var2.Field43);
                    var3.setColor(14527502);
                    var3.fillRect(Field32 + var2.Field41 * var4, Field33 + 22 + var2.Field43, 1, 29);
                }

                var3.setColor(14527502);
                var3.fillRect(Field32 + var2.Field41 * Field28.size(), Field33 + 22 + var2.Field43, 1, 29);
            }

            if (Field23 != null && var2.Field27 == 2) {
                var3.setColor(6513507);
                var3.fillRect(Field32 + 3, Field33 + 23 + var2.Field43, var2.Field41 - 3, 28);
                int var10002 = Field32 + var2.Field41 / 2;
                int var10003 = Field33 + 36;
                Class804.Field1(var3, Class804.Field1(Field23.Field1).Field12, var10002, var10003 + var2.Field43);
                Class21.Field9[3].Field1(var3, String.valueOf(Field23.Field3), Field32 + var2.Field41 / 2 + var2.Field13 / 2, Field33 + 50 + var2.Field43 - Class21.Field9[3].Field2(), 1);
                var3.setColor(14527502);
                var3.fillRect(Field32 + var2.Field41, Field33 + 22 + var2.Field43, 1, 29);
            }

            Class105.Field1(var3);
            var3.setColor(15338765);
            var3.fillRect(var2.Field63[var2.Field27] - 1, var2.Field64[var2.Field27] - 11, var2.Field13 + 2, var2.Field13 + 2);
        }

        Class105.Field1(var1);
        this.Field6(var1);
        this.Field2(var1);
        this.Field3(var1);
        if (this.Field6 == 5) {
            this.Field2(var1);
            var1.setClip(this.Field63[4] + 4, this.Field64[4] - 15 + this.Field11 + 3, this.Field13, this.Field13);
            if (this.Field56 == 0) {
                Class804.Field5(var1, Class585.Field42[this.Field55].Field5, this.Field63[4] + 4, this.Field64[4] - 6, 0);
            } else {
                Class381.Field1(var1, (short) (this.Field55 + 6500), this.Field63[4] + 12, this.Field64[4] + 2, 3);
                Class21.Field9[3].Field1(var1, String.valueOf(this.Field57), this.Field63[4] + 18, this.Field64[4] + 2, 1);
            }
        }

        for (int var6 = 0; var6 < this.Field47.size(); ++var6) {
            ((Class173) this.Field47.elementAt(var6)).Field1(var1);
        }

        this.Field5(var1);
        super.Field1(var1);
    }

    private void Field6(Graphics var1) {
        int var2;
        if (this.Field6 == 5) {
            for (var2 = 0; var2 < this.Field63.length; ++var2) {
                if (var2 % 4 == 0) {
                    var1.setColor(16777215);
                    var1.fillRect(this.Field63[var2], this.Field64[var2] - 10, this.Field13, this.Field13);
                    var1.setColor(6513507);
                    var1.fillRect(this.Field63[var2] + 1, this.Field64[var2] - 9, this.Field13 - 2, this.Field13 - 2);
                } else if (Class804.Field3(10) != null) {
                    var1.drawRegion(Class804.Field3(10), 0, this.Field48 * Class797.Field3[1][10], Class797.Field3[0][10], Class797.Field3[1][10], 0, this.Field63[var2] - 3, this.Field64[var2] - 10, 0);
                }
            }
        } else if (this.Field6 == 6) {
            for (var2 = 0; var2 < this.Field63.length; ++var2) {
                var1.setColor(16777215);
                var1.fillRect(this.Field63[var2], this.Field64[var2] - 10, this.Field13, this.Field13);
                var1.setColor(6513507);
                var1.fillRect(this.Field63[var2] + 1, this.Field64[var2] - 9, this.Field13 - 2, this.Field13 - 2);
            }
        }

        if (this.Field6 != 1) {
            if (Field18 != null && this.Field6 != 5 && this.Field6 != 6) {
                Field18.Field1(var1, this.Field63[0] + 10, this.Field64[0]);
            }

            if (this.Field6 == 6) {
                if (Field18 != null) {
                    Field18.Field1(var1, this.Field63[5] + this.Field13 / 2, this.Field64[5] + 1);
                    this.Field53[5] = true;
                }

                if (this.Field19 != null) {
                    this.Field19.Field1(var1, this.Field63[1] + this.Field13 / 2, this.Field64[1] + 1);
                    this.Field53[0] = true;
                }

                if (this.Field17[1]) {
                    int var10002 = this.Field63[2] + this.Field13 / 2;
                    Class804.Field1(var1, Class804.Field1(Field23.Field1).Field12, var10002, this.Field64[2]);
                    this.Field53[1] = true;
                }

                if (this.Field20 != null) {
                    this.Field20.Field1(var1, this.Field63[3] + this.Field13 / 2, this.Field64[3] + 1);
                    this.Field53[2] = true;
                }

                if (this.Field21 != null) {
                    this.Field21.Field1(var1, this.Field63[4] + this.Field13 / 2, this.Field64[4] + 1);
                    this.Field53[3] = true;
                }

                if (this.Field22 != null) {
                    this.Field22.Field1(var1, this.Field63[6] + this.Field13 / 2, this.Field64[6] + 1);
                    this.Field53[4] = true;
                }
            }

            if (Field18 != null && this.Field6 == 5) {
                Class105.Field1(var1);
                var1.setClip(this.Field63[0], this.Field64[0] - this.Field13 / 4 + this.Field12 - 5, this.Field13, this.Field13);
                Field18.Field1(var1, this.Field63[0] + 11, this.Field64[0] + 1);
            }
        }

    }

    public final void Field4() {
        if (this.Field7 && Class105.Field12 % 2 == 0 && this.Field11 > 0) {
            --this.Field11;
            ++this.Field12;
        }

        Class566 var1 = this;
        int var2 = Class797.Field3[0][10] / 2;

        int var3;
        for (var3 = 0; var3 < var1.Field59.size(); ++var3) {
            Class303 var4;
            Class173 var17;
            if ((var4 = (Class303) var1.Field59.elementAt(var3)) != null && var1.Field6 == 5) {
                if (var1.Field11 > 4) {
                    Class566 var5 = var1;
                    int var6 = Class797.Field3[0][10] / 2;

                    for (int var7 = 0; var7 < 2; ++var7) {
                        Class663 var8 = new Class663(var5.Field63[2] + var6 - 4, var5.Field50 + var5.Field13 / 2 - 10, var7 * 2, var5.Field64[4] + var5.Field13 / 2 - 10, 0);
                        var5.Field58.addElement(var8);
                    }
                }

                if (Class105.Field12 % 2 == 0) {
                    var17 = new Class173(var1.Field63[2] + var2 - 4, var1.Field50 + var1.Field13 / 2 - 10, 54);
                    var1.Field58.addElement(var17);
                }
            }

            var4.Field2();
            if (Class105.Field12 % 2 == 0) {
                var17 = new Class173(var4.Field2, var4.Field3, 54);
                var1.Field58.addElement(var17);
            }

            if (var4.Field1) {
                var1.Field59.removeElement(var4);
                var1.Field49 = true;
                var1.Field9 = true;
            }
        }

        var1 = this;

        Class173 var11;
        for (var2 = 0; var2 < var1.Field58.size(); ++var2) {
            if ((var11 = (Class173) var1.Field58.elementAt(var2)) != null) {
                var11.Field1();
            }

            if (var11.Field10 && var11.Field8 == -1) {
                var1.Field7 = true;
                var1.Field58.removeElement(var11);
            }

            if (var11.Field10) {
                var1.Field58.removeElement(var11);
            }
        }

        if (this.Field6 == 6 && this.Field10) {
            super.Field104 = this.Field52;
            this.Field16.Field1 = "";
            if (this.Field71 >= 0) {
                --this.Field71;
            }

            if (this.Field71 < 0 && this.Field59.size() <= 0) {
                this.Field71 = 15;
                this.Field7();
                this.Field10 = false;
            }
        }

        if (Class105.Field37 && Field28.size() > 0) {
            this.Field6();
        }

        if (this.Field72 >= 0) {
            --this.Field72;
        }

        if (this.Field72 < 0 && this.Field9 && Class105.Field12 % 15 == 0 && this.Field73 < 3 && this.Field6 == 6) {
            var1 = null;

            for (var2 = 1; var2 < this.Field63.length; ++var2) {
                Class565 var9 = new Class565(this.Field63[var2] + this.Field13 / 2, this.Field64[var2], this.Field63[0] + this.Field13 / 2, this.Field64[0]);
                this.Field47.addElement(var9);
            }

            ++this.Field73;
        }

        int var10;
        for (var10 = 0; var10 < this.Field47.size(); ++var10) {
            Class173 var12;
            (var12 = (Class173) this.Field47.elementAt(var10)).Field1();
            if (var12.Field10) {
                var11 = null;
                var11 = null;

                for (int var15 = 0; var15 < 10; ++var15) {
                    Class663 var16 = new Class663(this.Field63[0] + this.Field13 / 2, this.Field64[0], 0, this.Field64[0] + 80, -1);
                    this.Field58.addElement(var16);
                }

                var11 = new Class173(this.Field63[0] + this.Field13 / 2, this.Field64[0], 50);
                this.Field58.addElement(var11);
                this.Field70.addElement(var12);
            }
        }

        for (var10 = 0; var10 < this.Field70.size(); ++var10) {
            this.Field47.removeElement(this.Field70.elementAt(var10));
        }

        this.Field70.removeAllElements();
        if (this.Field6 == 5 || this.Field6 == 6) {
            this.Field25 = 1;
        }

        ++this.Field48;
        if (this.Field48 >= 3) {
            this.Field48 = 0;
        }

        if (this.Field49 && this.Field58.size() <= 0 && this.Field6 == 5) {
            if (this.Field71 >= 0) {
                --this.Field71;
            }

            if (this.Field71 < 0) {
                Field18 = null;
                this.Field49 = false;
                this.Field8 = false;
                this.Field71 = 15;
                this.Field15.Field1 = "Nghiền";
                super.Field104 = this.Field14;
                this.Field8();
            }
        }

        if (this.Field3 != null) {
            this.Field3.Field4();
        }

        if (this.Field26 > 0) {
            --this.Field26;
        }

        if (this.Field26 <= 0) {
            this.Field26 = 0;
        }

        boolean var13 = false;
        boolean var14 = false;
        if (Class105.Field23 == null) {
            Class47 var18;
            if (Class105.Field37) {
                if (this.Field1.Field6) {
                    this.Field35.Field6 = false;
                    this.Field36.Field6 = false;
                } else if (this.Field35.Field6) {
                    this.Field1.Field6 = false;
                    this.Field36.Field6 = false;
                } else if (this.Field36.Field6) {
                    this.Field35.Field6 = false;
                    this.Field1.Field6 = false;
                }

                if (this.Field35.Field6 && !Class105.Field21.Field1 && this.Field26 == 0) {
                    this.Field25 = 1;
                    if ((var18 = this.Field35.Field2()).Field1 || var18.Field3) {
                        this.Field2 = var18.Field2;
                        this.Field42 = var18.Field2;
                        var13 = true;
                        if (super.Field105 != null && this.Field5 && Class105.Field10()) {
                            super.Field105.Field2.Field1();
                        }
                    }
                }

                this.Field35.Field3();
                if (this.Field36.Field6 && !Class105.Field21.Field1 && this.Field26 == 0) {
                    this.Field25 = 0;
                    if ((var18 = this.Field36.Field2()).Field1 || var18.Field3) {
                        this.Field44 = var18.Field2;
                        this.Field45 = var18.Field2;
                        var14 = true;
                        if (super.Field105 != null && this.Field5 && Class105.Field10()) {
                            super.Field105.Field2.Field1();
                        }
                    }
                }

                this.Field36.Field3();
                var11 = null;
                if (this.Field1.Field6 && !Class105.Field21.Field1) {
                    this.Field1.Field2();
                }

                this.Field1.Field3();
                if (!Class105.Field6) {
                    if (this.Field35.Field6 && var13) {
                        if (this.Field2 > -1 && this.Field2 <= Field28.size() - 1) {
                            if (this.Field42 != -1) {
                                this.Field2 = this.Field42;
                            }

                            this.Field14.Field2.Field1();
                        }
                    } else if (this.Field36.Field6 && var14 && this.Field44 > -1 && this.Field44 <= Field34.size() - 1) {
                        if (this.Field45 != -1) {
                            this.Field44 = this.Field45;
                        }

                        this.Field14.Field2.Field1();
                    }

                    this.Field1.Field6 = false;
                    this.Field35.Field6 = false;
                    this.Field36.Field6 = false;
                }
            } else if (!this.Field5) {
                if ((var18 = this.Field35.Field2()).Field1 || var18.Field3) {
                    this.Field2 = var18.Field2;
                    this.Field35.Field1(this.Field2 * (this.Field41 + 2));
                }

                this.Field35.Field3();
                if ((var18 = this.Field36.Field2()).Field1 || var18.Field3) {
                    this.Field44 = var18.Field2;
                    this.Field36.Field1(this.Field44 * (this.Field41 + 2));
                }

                this.Field36.Field3();
            } else {
                this.Field1.Field2();
                var11 = null;
                this.Field1.Field3();
            }
        }

        if (Class105.Field7 && this.Field6 == 6) {
            Class105.Field7 = false;

            for (var3 = 1; var3 < this.Field63.length; ++var3) {
                if (Class105.Field10 >= this.Field63[var3] && Class105.Field10 <= this.Field63[var3] + this.Field13 && Class105.Field11 >= this.Field64[var3] - 10 && Class105.Field11 <= this.Field64[var3] - 10 + this.Field13) {
                    this.Field27 = (byte) var3;
                    this.Field2 = 0;
                    this.Field35.Field1(this.Field41);
                }
            }
        }

        super.Field4();
    }

    public final void Field3() {
        if (this.Field5) {
            Class433 var10000;
            if (Class105.Field3[2] && this.Field6 != 5) {
                Class105.Field3[2] = false;
                var10000 = this.Field1;
                var10000.Field1 -= 50;
                if (this.Field1.Field1 < 0) {
                    this.Field1.Field1 = 0;
                }
            } else if (Class105.Field3[8]) {
                Class105.Field3[8] = false;
                var10000 = this.Field1;
                var10000.Field1 += 50;
                if (this.Field1.Field1 > this.Field1.Field3) {
                    this.Field1.Field1 = this.Field1.Field3;
                }
            }
        } else {
            if (Class105.Field3[2] && this.Field6 != 5) {
                Class105.Field3[2] = false;
                --this.Field27;
                if (this.Field19 != null) {
                    this.Field54.addElement(this.Field19);
                }

                if (this.Field20 != null) {
                    this.Field54.addElement(this.Field20);
                }

                if (this.Field21 != null) {
                    this.Field54.addElement(this.Field21);
                }

                if (Field18 != null) {
                    this.Field54.addElement(Field18);
                }

                if (this.Field22 != null) {
                    this.Field54.addElement(this.Field22);
                }

                if (this.Field27 < 1) {
                    this.Field27 = 6;
                }

                if (this.Field6 == 6) {
                    this.Field2 = 0;
                    this.Field35.Field1(this.Field41);
                }
            } else if (Class105.Field3[8]) {
                Class105.Field3[8] = false;
                if (this.Field19 != null) {
                    this.Field54.addElement(this.Field19);
                }

                if (this.Field20 != null) {
                    this.Field54.addElement(this.Field20);
                }

                if (this.Field21 != null) {
                    this.Field54.addElement(this.Field21);
                }

                if (Field18 != null) {
                    this.Field54.addElement(Field18);
                }

                if (this.Field22 != null) {
                    this.Field54.addElement(this.Field22);
                }

                ++this.Field27;
                if (this.Field27 > 6) {
                    this.Field27 = 1;
                }

                if (this.Field6 == 6) {
                    this.Field2 = 0;
                    this.Field35.Field1(this.Field41);
                }
            }

            if (Class105.Field3[4]) {
                Class105.Field3[4] = false;
                --this.Field2;
                if (this.Field2 < 0) {
                    this.Field2 = Field28.size() - 1;
                }

                this.Field35.Field1(this.Field2 * this.Field41);
            } else if (Class105.Field3[6]) {
                Class105.Field3[6] = false;
                ++this.Field2;
                if (this.Field2 > Field28.size() - 1) {
                    this.Field2 = 0;
                }

                this.Field35.Field1(this.Field2 * this.Field41);
            }
        }

        super.Field3();
    }

    private void Field1(boolean var1, boolean var2) {
        Field34.removeAllElements();
        Field28.removeAllElements();
        Vector var12;
        int var13 = (var12 = Class585.Field37).size();
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;

        for (int var6 = 0; var6 < var13; ++var6) {
            Class274 var7;
            Class743 var8 = Class804.Field1((var7 = (Class274) var12.elementAt(var6)).Field1);
            if (this.Field6 == 0) {
                if (var8.Field8 == Class743.Field2) {
                    if (Field60 != null && Field60.Field1 == var7.Field1 && !Field60.Field4) {
                        Field60 = var7;
                        var3 = true;
                    }

                    Field34.addElement(var7);
                }
            } else if (this.Field6 == 2) {
                if (var8.Field8 == Class743.Field3) {
                    if (Field60 != null && Field60.Field1 == var7.Field1 && !Field60.Field4) {
                        Field60 = var7;
                    }

                    Field34.addElement(var7);
                }
            } else if (this.Field6 == 3) {
                if (var8.Field8 == Class743.Field4) {
                    if (Field60 != null && Field60.Field1 == var7.Field1 && !Field60.Field4) {
                        Field60 = var7;
                    }

                    Field34.addElement(var7);
                }
            } else if (var8.Field8 == 0) {
                if (Field60 != null && Field60.Field1 == var7.Field1 && !Field60.Field4) {
                    Field60 = var7;
                    var3 = true;
                }

                if (Field61 != null && Field61.Field1 == var7.Field1 && !Field61.Field4) {
                    Field61 = var7;
                    var4 = true;
                }

                if (Field62 != null && Field62.Field1 == var7.Field1 && !Field62.Field4) {
                    Field62 = var7;
                    var5 = true;
                }

                if (this.Field6 == 6) {
                    Field23 = var7;
                }

                Field34.addElement(var7);
            }
        }

        var13 = (var12 = Class585.Field38).size();
        boolean var14 = false;
        boolean var15 = false;
        boolean var16 = false;

        int var9;
        for (var9 = 0; var9 < var13; ++var9) {
            Class274 var10;
            Class743 var11 = Class804.Field1((var10 = (Class274) var12.elementAt(var9)).Field1);
            if (this.Field6 == 0) {
                if (var11.Field8 == Class743.Field2) {
                    if (Field60 != null && Field60.Field1 == var10.Field1 && Field60.Field4) {
                        Field60 = var10;
                        var14 = true;
                    }

                    Field34.addElement(var10);
                    var10.Field4 = true;
                }
            } else if (this.Field6 == 2) {
                if (var11.Field8 == Class743.Field3) {
                    if (Field60 != null && Field60.Field1 == var10.Field1 && Field60.Field4) {
                        Field60 = var10;
                    }

                    Field34.addElement(var10);
                    var10.Field4 = true;
                }
            } else if (this.Field6 == 3) {
                if (var11.Field8 == Class743.Field4) {
                    if (Field60 != null && Field60.Field1 == var10.Field1 && Field60.Field4) {
                        Field60 = var10;
                    }

                    Field34.addElement(var10);
                    var10.Field4 = true;
                }
            } else if (var11.Field8 == 0) {
                if (Field60 != null && Field60.Field1 == var10.Field1 && Field60.Field4) {
                    Field60 = var10;
                    var14 = true;
                }

                if (Field61 != null && Field61.Field1 == var10.Field1 && Field61.Field4) {
                    Field61 = var10;
                    var15 = true;
                }

                if (Field62 != null && Field62.Field1 == var10.Field1 && Field62.Field4) {
                    Field62 = var10;
                    var16 = true;
                }

                Field34.addElement(var10);
                var10.Field4 = true;
            }
        }

        if (this.Field6 == 0) {
            if (!var3 && !var14) {
                Field60 = null;
            }

            if (!var4 && !var15) {
                Field61 = null;
            }

            if (!var5 && !var16) {
                Field62 = null;
            }
        }

        if (this.Field6 == 0) {
            Field28 = Class537.Field3(Field78);
        } else if (this.Field6 == 2) {
            Field28 = Class537.Field1(Field78, 1);
        } else if (this.Field6 == 3) {
            Field28 = Class537.Field4(0);
        } else {
            Field28 = Class537.Field7();
        }

        for (var9 = 0; var9 < Field28.size(); ++var9) {
            Class537 var17 = (Class537) Field28.elementAt(var9);
            if (0 == var17.Field9) {
                Field18 = var17;
                return;
            }
        }

    }

    private void Field7() {
        Field60 = null;
        this.Field16.Field1 = "Đập";
        super.Field104 = this.Field14;
        this.Field9 = false;
        this.Field73 = 0;
        this.Field19 = null;
        Field23 = null;
        this.Field20 = null;
        this.Field21 = null;
        this.Field22 = null;
        this.Field54.removeAllElements();

        for (int var1 = 0; var1 < this.Field53.length; ++var1) {
            this.Field53[var1] = false;
            this.Field17[var1] = false;
        }

        Field18 = null;
        this.Field1(true, false);
    }

    private void Field8() {
        if (this.Field6 == 5) {
            super.Field104 = this.Field14;
        }

        this.Field9 = false;
        this.Field73 = 0;
        this.Field10 = false;
        this.Field7();
        this.Field27 = 5;
        this.Field8 = false;
        Field61 = null;
        Field62 = null;
        Field18 = null;
        this.Field1(true, false);
    }

    public final void Field1() {
        super.Field1();
    }

    public final void Field1(Class665 var1) {
        this.Field3 = var1;
        super.Field1(var1);
    }

    static boolean Field1(Class566 var0) {
        var0 = var0;

        for (int var1 = 0; var1 < var0.Field53.length; ++var1) {
            if (!var0.Field53[var1]) {
                return false;
            }
        }

        return true;
    }

    static void Field2(Class566 var0) {
        var0 = var0;
        Class303 var1 = null;
        var1 = new Class303(var0.Field63[6] + var0.Field13 / 2, var0.Field64[6], var0.Field63[1] + var0.Field13 / 2, var0.Field64[1], 100, 3, 3);
        var0.Field59.addElement(var1);

        for (int var2 = 1; var2 < var0.Field63.length - 1; ++var2) {
            var1 = new Class303(var0.Field63[var2] + var0.Field13 / 2, var0.Field64[var2], var0.Field63[var2 + 1] + var0.Field13 / 2, var0.Field64[var2 + 1], 100, 3, 6 + (var2 << 1));
            var0.Field59.addElement(var1);
            var0.Field72 = 6 + (var2 << 1);
        }

    }

    static boolean Field1(Class566 var0, Class537 var1) {
        switch ((var0 = var0).Field27) {
            case 1:
                if (Field18 != null && Field18.Field9 == var1.Field9 || var0.Field20 != null && var0.Field20.Field9 == var1.Field9 || var0.Field21 != null && var0.Field21.Field9 == var1.Field9 || var0.Field22 != null && var0.Field22.Field9 == var1.Field9) {
                    return true;
                }
            case 2:
            default:
                break;
            case 3:
                if (Field18 != null && Field18.Field9 == var1.Field9 || var0.Field19 != null && var0.Field19.Field9 == var1.Field9 || var0.Field21 != null && var0.Field21.Field9 == var1.Field9 || var0.Field22 != null && var0.Field22.Field9 == var1.Field9) {
                    return true;
                }
                break;
            case 4:
                if (Field18 != null && Field18.Field9 == var1.Field9 || var0.Field20 != null && var0.Field20.Field9 == var1.Field9 || var0.Field19 != null && var0.Field19.Field9 == var1.Field9 || var0.Field22 != null && var0.Field22.Field9 == var1.Field9) {
                    return true;
                }
                break;
            case 5:
                if (var0.Field19 != null && var0.Field19.Field9 == var1.Field9 || var0.Field20 != null && var0.Field20.Field9 == var1.Field9 || var0.Field21 != null && var0.Field21.Field9 == var1.Field9 || var0.Field22 != null && var0.Field22.Field9 == var1.Field9) {
                    return true;
                }
                break;
            case 6:
                if (Field18 != null && Field18.Field9 == var1.Field9 || var0.Field20 != null && var0.Field20.Field9 == var1.Field9 || var0.Field21 != null && var0.Field21.Field9 == var1.Field9 || var0.Field19 != null && var0.Field19.Field9 == var1.Field9) {
                    return true;
                }
        }

        return false;
    }
}
