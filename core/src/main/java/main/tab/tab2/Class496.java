package main.tab.tab2;

import main.lib.Graphics;

import java.util.Vector;

public final class Class496 extends Class671 {
    public static Class496 Field1;
    public Vector Field2;
    public Vector Field3;
    private int Field7;
    private int Field8;
    private int Field9;
    private int Field10;
    private static int Field11;
    private static int Field12;
    private static int Field13;
    private static int Field14;
    public static int Field4;
    public static int Field5 = 0;
    private String Field15;
    public byte Field6 = 0;
    private Class671 Field16;
    private int Field17 = 0;
    private boolean Field18 = false;
    private int Field19 = 0;
    private int Field20 = 1;
    private int Field21 = 25;
    private int Field22 = 0;
    private int Field23 = 1;
    private int Field24 = 0;
    private int Field25 = 1;
    private String[] Field26;

    public static Class496 Field5() {
        return Field1 == null ? (Field1 = new Class496()) : Field1;
    }

    public final void Field1() {
        if (Class106.Field17 != this) {
            Field5 = 0;
            this.Field6 = 0;
            Field11 = 0;
            Field12 = 0;
            if (this.Field16 == null) {
                this.Field16 = Class106.Field19;
            }

            super.Field1();
            this.Field2();
        }
    }

    public final void Field2() {
        this.Field7 = Class106.Field13 - 41;
        this.Field8 = Class106.Field14 - 56;
        if ((Field4 = this.Field3.size() * this.Field9 - (this.Field8 - 32)) < 0) {
            Field4 = 0;
        }

    }

    public Class496() {
        super.Field105 = new Class86("Đóng", new Class486(this));
        super.Field104 = new Class86("Chọn", new Class487(this));
        super.Field103 = new Class86("Menu", new Class492(this));
    }

    public final void Field6() {
        Vector var1 = new Vector();
        if (this.Field10 == 4 || this.Field10 == 3 || this.Field10 == 5 || this.Field10 == 1) {
            if (this.Field10 == 5) {
                var1.addElement(new Class86("Danh sách quản lý bang.", new Class493(this)));
            }

            var1.addElement(new Class86("Xem thêm", new Class490(this)));
        }

        if (this.Field10 == 0) {
            var1.addElement(new Class86("Xóa bạn", new Class491(this)));
        }

        if (this.Field10 == 1) {
            if (((Class357) this.Field3.elementAt(0)).Field190 == Class106.Field19.Field15.Field190) {
                var1.addElement(new Class86("Nhắn tin toàn bang", new Class453(this)));
            }

            if (((Class357) this.Field3.elementAt(Field5)).Field190 == Class106.Field19.Field15.Field190 && (Class106.Field19.Field15.Field57 == 0 || Class106.Field19.Field15.Field57 == 1) && !((Class357) this.Field3.elementAt(Field5)).Field65.equals(Class106.Field19.Field15.Field65)) {
                var1.addElement(new Class86("Mời khỏi bang", new Class337(this)));
            }
        } else if (this.Field10 == 2 && Class106.Field19.Field15.Field57 == 0) {
            var1.addElement(new Class86("Xóa tin nhắn", new Class351(this)));
        }

        if (var1.size() > 0) {
            Class106.Field21.Field1(var1, 0);
        }

    }

    public final void Field1(Object var1) {
        if (this.Field10 == 2) {
            Class409.Field1().Field1(((Class375) var1).Field3, "TIN NHẮN");
        } else if (this.Field10 == 5) {
            Class261.Field1().Field14(((Class830) var1).Field1);
        } else {
            Class106.Field25.Field1("Nội dung tin nhắn", new Class350(this, var1), 0, 100, false);
            Class106.Field23 = Class106.Field25;
        }
    }

    public final void Field1(Vector var1, int var2, String var3) {
        Field5 = 0;
        if (var1.size() == 0) {
            this.Field6 = -1;
        } else {
            this.Field3 = var1;
        }

        this.Field10 = var2;
        if (var2 == 2) {
            this.Field9 = 30;
        } else {
            this.Field9 = 40;
        }

        this.Field15 = var3;
        this.Field7();
        if (this.Field3 != null) {
            Field4 = this.Field3.size() * this.Field9 - (this.Field8 - 32);
        }

        if (Field4 < 0) {
            Field4 = 0;
        }

        if (var2 == 6 && this.Field26 == null) {
            this.Field26 = new String[]{"Bang chủ", "Phó bang", "Trưởng lão"};
        }

    }

    private void Field7() {
        if (this.Field10 != 2 && this.Field10 != 5) {
            for (int var1 = 0; var1 < this.Field3.size(); ++var1) {
                Class357 var2;
                (var2 = (Class357) this.Field3.elementAt(var1)).Field193 = 25;
                var2.Field194 = (short) (var1 * this.Field9 + this.Field9 / 2 + var2.Field195 / 2 - 5);
            }
        }

    }

    public final void Field4() {
        if (Math.abs(Field11 - Field12) < 15 && Field12 < 0) {
            Field11 = 0;
        }

        if (Math.abs(Field11 - Field12) < 10 && Field12 > Field4) {
            Field11 = Field4;
        }

    }

    public final void Field3() {
        boolean var1 = false;
        if (Class106.Field1(20, 46, this.Field7, this.Field8 - 24)) {
            if (Class106.Field6) {
                if (!this.Field18) {
                    this.Field17 = Field12;
                    this.Field18 = true;
                }

                if ((Field11 = this.Field17 + (Class106.Field30 - Class106.Field11)) < -30) {
                    Field11 = -30;
                }

                if (Field11 > Field4 + 30) {
                    Field11 = Field4 + 30;
                }
            }

            if (Class106.Field7) {
                Class106.Field7 = false;
                this.Field18 = false;
                if (Math.abs(Class106.Field30 - Class106.Field11) < 10) {
                    int var3;
                    if ((var3 = (Field11 + Class106.Field11 - 46) / this.Field9) == Field5) {
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        } else if (super.Field103 != null) {
                            super.Field103.Field2.Field1();
                        }
                    }

                    Field5 = var3;
                    if (var3 < 0) {
                        Field5 = 0;
                    }

                    if (Field5 >= this.Field3.size()) {
                        Field5 = this.Field3.size() - 1;
                    }

                    this.Field19 = 0;
                    var1 = true;
                }
            }
        }

        if (Class106.Field2(2)) {
            if (--Field5 < 0) {
                Field5 = this.Field3.size() - 1;
            }

            this.Field19 = 0;
            var1 = true;
        } else if (Class106.Field2(8)) {
            if (++Field5 >= this.Field3.size()) {
                Field5 = 0;
            }

            var1 = true;
            this.Field19 = 0;
        }

        if (var1) {
            if ((Field11 = Field5 * this.Field9 - (this.Field8 - 31) / 2) < 0) {
                Field11 = 0;
            }

            if (Field11 > Field4) {
                Field11 = Field4;
            }
        }

        if (Field12 != Field11) {
            Field14 = Field11 - Field12 << 2;
            Field13 += Field14;
            Field12 += Field13 >> 4;
            Field13 &= 15;
        }

        super.Field3();
        if (this.Field16 != null) {
            this.Field16.Field4();
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field16 != null) {
            this.Field16.Field1(var1);
        }

        Class106.Field1(var1);
        Class811.Field4(var1, 20, 20, this.Field7, this.Field8);
        var1.setClip(25, 20, this.Field7 - 10, 20);
        int var2;
        if ((var2 = Class21.Field8.Field1(this.Field15)) > this.Field7 - 25) {
            if (this.Field20 == 1) {
                --this.Field21;
                if (this.Field21 < this.Field7 - 35 - var2) {
                    this.Field20 = -1;
                }
            } else {
                ++this.Field21;
                if (this.Field21 > 25) {
                    this.Field20 = 1;
                }
            }
        }

        Class21.Field3.Field1(var1, this.Field15, this.Field21, 24, 0);
        Class106.Field1(var1);
        var1.translate(20, 47);
        var1.setClip(4, 0, this.Field7 - 8, this.Field8 - 31);
        var1.translate(0, -Field12);
        Class811.Field2(var1, 4, Field5 * this.Field9, this.Field7 - 9, this.Field9);
        if (this.Field10 == 5) {
            Graphics var3 = var1;
            Class496 var9 = this;
            int var4;
            int var5;
            if ((var5 = (var4 = Field12 / this.Field9) + this.Field8 / this.Field9 + 1) >= this.Field3.size()) {
                var5 = this.Field3.size();
            }

            for (var4 = var4; var4 < var5; ++var4) {
                Class830 var6 = (Class830) var9.Field3.elementAt(var4);
                byte var7 = 0;
                if (var6.Field1 != -1 && Class379.Field1(var6.Field1) != null) {
                    var7 = 12;
                    Class379.Field1(var3, (short) (var6.Field1 + 1000), 16, var4 * var9.Field9 + 12);
                }

                String var8 = null;
                var8 = var6.Field2 + " - Cấp độ: " + (var6.Field7 > -1 ? String.valueOf(var6.Field7) : "?");
                Class21.Field10[0].Field1(var3, var8, var7 + 11, var4 * var9.Field9 + 4, 0);
                int var12 = Class21.Field10[0].Field1(var8);
                if (var6.Field13 > -1) {
                    var3.drawRegion(Class811.Field41, 0, var6.Field13 * 11, 11, 11, 0, var7 + 11 + 17 + var12, var4 * var9.Field9 + 4, 0);
                }

                String var10 = "Bang chủ: " + var6.Field3 + " - Tiền: " + var6.Field9 + "xu - Thành viên: " + var6.Field8;
                int var11;
                if (var4 == Field5 && (var11 = Class21.Field8.Field1(var10)) > var9.Field7 - 10 && Field5 == var4) {
                    if (var9.Field23 == 1) {
                        --var9.Field22;
                        if (var9.Field22 < var9.Field7 - 20 - var11) {
                            var9.Field23 = -1;
                        }
                    } else {
                        ++var9.Field22;
                        if (var9.Field22 > 5) {
                            var9.Field23 = 1;
                        }
                    }
                }

                Class21.Field8.Field1(var3, var10, 11 + (var4 == Field5 ? var9.Field22 : 0), var4 * var9.Field9 + 20, 0);
            }
        } else if (this.Field10 == 2) {
            this.Field2(var1);
        } else {
            this.Field3(var1);
        }

        super.Field1(var1);
    }

    private void Field2(Graphics var1) {
        Class375 var2 = null;
        int var3;
        int var5;
        if ((var5 = (var3 = Field12 / this.Field9) + this.Field8 / this.Field9 + 1) >= this.Field3.size()) {
            var5 = this.Field3.size();
        }

        for (int var4 = var5 - 1; var4 >= var3; --var4) {
            var2 = (Class375) this.Field3.elementAt(var4);
            Class21.Field2.Field1(var1, var2.Field1, 7, var4 * this.Field9, 0);
            String var6;
            if (Class21.Field8.Field1(var2.Field3) > this.Field7 - 10) {
                var6 = Class21.Field5.Field1(var2.Field3, this.Field7 - 10)[0] + "...";
            } else {
                var6 = var2.Field3;
            }

            Class21.Field8.Field1(var1, var6, 7, var4 * this.Field9 + 15, 0);
        }

    }

    private void Field3(Graphics var1) {
        int var2;
        int var3;
        if ((var3 = (var2 = Field12 / this.Field9) + this.Field8 / this.Field9 + 1) >= this.Field3.size()) {
            var3 = this.Field3.size();
        }

        for (var2 = var2; var2 < var3; ++var2) {
            Class357 var4;
            (var4 = (Class357) this.Field3.elementAt(var2)).Field3(var1);
            String var5 = "Cấp độ: " + (var4.Field22 > -1 ? String.valueOf(var4.Field22) : "?");

            for (int var6 = 0; var6 < var4.Field98.size(); ++var6) {
                Class534 var7;
                Class805 var8 = Class811.Field2((int) (var7 = (Class534) var4.Field98.elementAt(var6)).Field18);
                var5 = var5 + " - " + Class805.Field2[var8.Field3] + ": " + var7.Field25;
                if (var7.Field19 > 0) {
                    var5 = var5 + "+" + var7.Field19;
                }
            }

            byte var10 = 0;
            if (var4.Field190 != -1 && Class379.Field1(var4.Field190) != null) {
                var10 = 8;
                Class379.Field1(var1, (short) (var4.Field190 + 1000), 45, var2 * this.Field9 + 12);
            }

            String var11 = Class106.Field1(var4.Field122, var4.Field100);
            int var12;
            if ((var12 = Class21.Field10[0].Field1(var4.Field65 + var11 + (this.Field10 == 6 && var4.Field57 < 3 ? " - " + this.Field26[var4.Field57] : "") + (this.Field10 == 7 ? " - CT: " + var4.Field155 + " - LT: " + var4.Field156 : "")) + 30) > this.Field7 - 55 && Field5 == var2) {
                if (this.Field25 == 1) {
                    --this.Field24;
                    if (this.Field24 < this.Field7 - 65 - var12) {
                        this.Field25 = -1;
                    }
                } else {
                    ++this.Field24;
                    if (this.Field24 > 5) {
                        this.Field25 = 1;
                    }
                }
            }

            var1.setClip(45, Field12, this.Field7 - 49, this.Field8 - 31);
            Class21.Field10[0].Field1(var1, var4.Field65 + " - " + var11 + (this.Field10 == 6 && var4.Field57 < 3 ? " - " + this.Field26[var4.Field57] : "") + (this.Field10 == 7 ? " - CT: " + var4.Field155 + " - LT: " + var4.Field156 : ""), var10 + 45 + (var2 == Field5 ? this.Field24 : 0), var2 * this.Field9 + 5, 0);
            boolean var13 = false;
            var12 = Class21.Field10[0].Field1(var4.Field65 + " - " + var11 + (this.Field10 == 6 && var4.Field57 < 3 ? " - " + this.Field26[var4.Field57] : "") + (this.Field10 == 7 ? " - CT: " + var4.Field155 + " - LT: " + var4.Field156 : ""));
            if (var4.Field201 > -1) {
                var1.drawRegion(Class811.Field41, 0, var4.Field201 * 11, 11, 11, 0, var10 + 45 + (var2 == Field5 ? this.Field24 : 0) + var12 + 5, var2 * this.Field9 + 5, 0);
            }

            int var9;
            if ((var9 = Class21.Field8.Field1(var5)) > this.Field7 - 45 && Field5 == var2) {
                if (this.Field20 == 1) {
                    --this.Field19;
                    if (this.Field19 < this.Field7 - 55 - var9) {
                        this.Field20 = -1;
                    }
                } else {
                    ++this.Field19;
                    if (this.Field19 > 5) {
                        this.Field20 = 1;
                    }
                }
            }

            Class21.Field8.Field1(var1, var5, 45 + (var2 == Field5 ? this.Field19 : 0), var2 * this.Field9 + 20, 0);
            var1.setClip(0, Field12, this.Field7 - 4, this.Field8 - 31);
        }

    }

    static Class671 Field1(Class496 var0) {
        return var0.Field16;
    }

    static void Field1(Class496 var0, Class671 var1) {
        var0.Field16 = null;
    }

    static int Field2(Class496 var0) {
        return var0.Field10;
    }

    static void Field3(Class496 var0) {
        var0.Field7();
    }

    static int Field4(Class496 var0) {
        return var0.Field9;
    }

    static int Field5(Class496 var0) {
        return var0.Field8;
    }
}
