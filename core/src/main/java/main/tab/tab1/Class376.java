package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

import java.util.Vector;

public final class Class376 extends Class665 {
    private Class433 Field9;
    private Class433 Field10;
    public static Vector Field1 = new Vector();
    private static String[] Field11 = new String[]{"Chợ", "Tìm", "Đang bán", "Hành trang", "Kho", "Bid"};
    public static short[] Field2 = new short[6];
    public static short[] Field3 = new short[6];
    private static String[][] Field12 = new String[][]{{"Loại:", "Level:", "Phẩm:", "Màu:", "Cộng:"}, {"N.vật"}, new String[0]};
    private static String[] Field13 = new String[]{"áo", "Quần", "Nón", "Kiếm", "Đao", "Bút", "Búa", "Cung", "Nhẫn", "Dây chuyền", "Giày", "Găng tay", "Ngọc bội", "Giáp linh thú", "Hộ uyển", "Nón linh thú", "Bàn đạp", "Yên cương", "Phi phong"};
    private static byte[] Field14 = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 14, 15, 16, 17, 18, 19};
    private static String[] Field15 = new String[]{"Nhất phẩm", "Nhị phẩm", "Tam phẩm", "Tứ phẩm", "Khác"};
    private static String[] Field16 = new String[]{"Trắng", "Xanh", "Đỏ", "Hoàn mỹ"};
    private static short Field17;
    public int Field4;
    private int Field18;
    private int Field19;
    private int Field20;
    private int Field21;
    private int Field22;
    private int Field23;
    private int Field24;
    private int Field25;
    private int Field26;
    private int Field27;
    private int Field28;
    private int Field29;
    private int Field30 = 1;
    private int Field31;
    private int Field32;
    private int Field33 = 0;
    private Class87 Field34 = new Class87("", new Class171(this));
    private Class87 Field35;
    private Class87 Field36;
    public Class665 Field5;
    private boolean Field37 = true;
    private boolean Field38;
    private byte Field39 = 0;
    private String[] Field40 = new String[]{""};
    public String Field6 = "";
    public boolean Field7;
    private int Field41;
    private int Field42;
    private Image Field43 = null;
    private byte[] Field44;
    public static long Field8 = 0L;

    public final void Field5() {
        this.Field4 = -1;
        this.Field18 = 0;
        this.Field28 = 1;
        this.Field37 = true;
        this.Field38 = !Class105.Field37;
        this.Field32 = this.Field31 = this.Field29 = 0;
        this.Field30 = 1;
        this.Field7 = false;
        this.Field40 = new String[]{""};
        this.Field9.Field1();
        this.Field10.Field1();
        this.Field12();
    }

    public Class376() {
        Field1.addElement(new Vector());
        Field1.addElement(new Vector());
        Field1.addElement(new Vector());
        Field1.addElement(new Vector());
        Field1.addElement(new Vector());
        Field1.addElement(new Vector());
    }

    public final void Field1() {
        this.Field2();
        super.Field1();
    }

    public final void Field1(Class665 var1) {
        this.Field5 = var1;
        this.Field2();
        super.Field1(var1);
    }

    public final void Field2() {
        if (Class105.Field37) {
            Field12[1][0] = "Nhân vật";
        }

        if (this.Field43 == null) {
            try {
                this.Field43 = Image.createImage("/0.png");
            } catch (Exception var3) {
            }
        }

        int var1 = Class105.Field13 - 6;
        int var2 = Class105.Field14 - 30;
        if (var1 > 320) {
            var1 = 320;
        }

        if (var2 > 240) {
            var2 = 240;
        }

        this.Field21 = var1;
        this.Field22 = var2;
        this.Field19 = Class105.Field13 / 2 - this.Field21 / 2;
        this.Field20 = Class105.Field14 / 2 - this.Field22 / 2 - 10;
        if (this.Field20 < 8) {
            this.Field20 = 8;
        }

        this.Field25 = Class105.Field13 - 40;
        if (this.Field25 > 200) {
            this.Field25 = 200;
        }

        this.Field26 = Class105.Field14 - 80;
        if (this.Field26 > 180) {
            this.Field26 = 180;
        }

        this.Field23 = Class105.Field13 / 2 - this.Field25 / 2;
        this.Field24 = Class105.Field14 / 2 - this.Field26 / 2;
        if (this.Field24 < 5) {
            this.Field24 = 5;
        }

        for (var1 = 0; var1 < Field12[0].length; ++var1) {
            if (Field17 < Class21.Field10[0].Field1(Field12[0][var1])) {
                Field17 = (short) Class21.Field10[0].Field1(Field12[0][var1]);
            }
        }

        Field17 = (short) (Field17 + 5);
        this.Field4 = -1;
        this.Field38 = !Class105.Field37;
        this.Field7 = false;
        this.Field32 = this.Field31 = this.Field29 = 0;
        this.Field30 = 1;
        super.Field104 = new Class87(Class105.Field37 ? "" : "Chọn", new Class170(this));
        super.Field105 = new Class87("Đóng", new Class168(this));
        this.Field35 = new Class87("Menu", new Class162(this));
        this.Field36 = new Class87("Thông tin ", new Class161(this));
        this.Field9 = new Class433();
        this.Field9.Field1();
        this.Field10 = new Class433();
        this.Field10.Field1();
        this.Field12();
        super.Field2();
        if (Class105.Field37) {
            this.Field12();
            this.Field22 -= 10;
        }

    }

    public final void Field1(Vector var1) {
        if (!this.Field38) {
            this.Field7 = false;
            var1.addElement(new Class87("Bán", new Class160(this)));
            var1.addElement(new Class87("Bán đấu giá", new Class157(this)));
        }
    }

    public final void Field1(int var1, Class537 var2) {
        if (var2.Field5.equals(Class105.Field19.Field15.Field65)) {
            Class105.Field1("Không thể mua vật phẩm do mình đăng bán");
        } else {
            Class105.Field2("Bạn có muốn mua vật phẩm này không ?", new Class368(this, var1));
        }
    }

    public final void Field6() {
        Vector var1 = (Vector) Field1.elementAt(this.Field28);
        if ((!this.Field38 || Class105.Field37) && var1.size() != 0) {
            this.Field18 = 0;
            Class537 var2 = null;
            if (this.Field4 >= 0 && this.Field4 < var1.size() && !(var2 = (Class537) var1.elementAt(this.Field4)).Field32) {
                var2.Field32 = true;
                Class263.Field1().Field1(var2.Field9, Class105.Field19.Field15.Field189);
            }

            String[] var6 = new String[]{""};
            if (var2 != null) {
                if (var2.Field36 > 0) {
                    this.Field44 = new byte[var2.Field36];

                    for (int var7 = 0; var7 < var2.Field36; ++var7) {
                        this.Field44[var7] = -1;
                    }

                    byte var8 = 0;

                    label39:
                    for (int var3 = 0; var3 < var2.Field34.size(); ++var3) {
                        Class818 var4;
                        if ((var4 = (Class818) var2.Field34.elementAt(var3)).Field1(false) == 3) {
                            var3 = 0;

                            while (true) {
                                if (var3 >= var2.Field35) {
                                    break label39;
                                }

                                this.Field44[var8++] = Class804.Field56[var4.Field3() - 10];
                                ++var3;
                            }
                        }
                    }
                }

                var6 = Class21.Field10[0].Field1(var2.Field1(false), this.Field25 - 10);
            }

            Class376 var5;
            (var5 = this).Field40 = new String[]{""};
            var5.Field40 = var6;
            var5.Field7 = true;
        }
    }

    public final void Field7() {
        Vector var1 = (Vector) Field1.elementAt(this.Field28);
        if (this.Field4 >= 0 && this.Field4 < var1.size()) {
            Class537 var3;
            if (Class537.Field1((var3 = (Class537) var1.elementAt(this.Field4)).Field2().Field11[9]) || var3.Field23 > 0) {
                Class105.Field1("Không thể bán vật phẩm này");
                return;
            }

            Class190 var4;
            (var4 = new Class190(10, 40, 120, Class665.Field108)).Field3(3);
            var4.Field5 = true;
            var4.Field1("100000");
            Class523.Field5().Field105 = var4.Field9;
            Class190 var2;
            (var2 = new Class190(10, 75, 120, Class665.Field108)).Field3(3);
            var2.Field1("10000");
            Class523.Field5().Field1(Class105.Field15 - 70, Class105.Field14 - Class665.Field108 - 120, 140, 100, "NHẬP GIÁ BÁN", new Class87("Bán", new Class358(var4, var2, var3)));
            Class523.Field5().Field2 = new Class345(var4, var2);
            Class523.Field5().Field1((Class665) Class105.Field36);
        }

    }

    private void Field1(Graphics var1, int var2, int var3) {
        var1.setColor(9605778);
        var1.fillRect(var2, var3, this.Field21 + 2, 1);
    }

    public final void Field1(Graphics var1) {
        if (this.Field5 != null) {
            this.Field5.Field1(var1);
        }

        Class105.Field1(var1);
        Class804.Field3(var1, this.Field19, this.Field20, this.Field21, this.Field22);
        var1.setColor(7961465);
        var1.fillRect(Class105.Field15 - 51, this.Field20 + 7, 102, 22);
        var1.setColor(!this.Field38 ? 2368548 : 30611);
        var1.fillRect(Class105.Field15 - 50, this.Field20 + 8, 100, 20);
        Class21.Field10[0].Field1(var1, Field11[this.Field28], Class105.Field13 / 2, this.Field20 + 10, 2);
        var1.drawImage(Class804.Field30, Class105.Field15 - 40 + this.Field41, this.Field20 + 17, 3);
        var1.drawRegion(Class804.Field30, 0, 0, 11, 7, 2, Class105.Field15 + 40 + this.Field42, this.Field20 + 17, 3);
        Class21.Field9[0].Field1(var1, Field8 + "$", this.Field19 + this.Field21 - 4, this.Field20 + this.Field22 - 12, 1);
        boolean var2 = false;
        boolean var3 = false;
        if (this.Field28 == 1) {
            int var14 = Class665.Field109 + 10;
            int var15 = this.Field20 + 40;
            if (this.Field37) {
                this.Field9.Field1(Field12[0].length, var14, this.Field19 + 6, this.Field20 + 40, this.Field21, this.Field22 - 40, true, 0);
                this.Field9.Field1(var1, this.Field19 + 6, this.Field20 + 40, this.Field21 - 12, this.Field22 - 55);

                for (int var4 = 0; var4 < Field12[this.Field39].length; ++var4) {
                    Class21.Field10[0].Field1(var1, Field12[this.Field39][var4], this.Field19 + 6, var15 + var4 * var14, 0);
                }

                String[][] var16 = new String[][]{{Field13[this.Field29], String.valueOf(this.Field30), Field15[this.Field31], Field16[this.Field32], String.valueOf(this.Field33)}, {this.Field6.equals("") ? "Nhập tên" : this.Field6}};
                int var5 = this.Field32;
                if (this.Field32 == 1) {
                    var5 = 3;
                } else if (this.Field32 == 3) {
                    var5 = 1;
                }

                for (int var6 = 0; var6 < var16[this.Field39].length; ++var6) {
                    int var10002 = Class105.Field13 / 2 - 40 <= this.Field19 + 6 + Field17 ? this.Field19 + 6 + Field17 : Class105.Field13 / 2 - 40;
                    int var10003 = var15 + var6 * var14;
                    String var10004 = var16[this.Field39][var6];
                    Class21 var12 = Class21.Field10[var6 == 3 ? var5 : 0];
                    String var11 = var10004;
                    int var10 = var10003;
                    int var9 = var10002;
                    var1.drawImage(Class804.Field30, var9 + 100 + (this.Field4 == var6 ? this.Field27 : 0), var10 + 7, 3);
                    var1.drawRegion(Class804.Field30, 0, 0, 11, 7, 2, var9 - (this.Field4 == var6 ? this.Field27 : 0), var10 + 7, 3);
                    var12.Field1(var1, var11, var9 + 50, var10, 2);
                }
            } else {
                this.Field1(var1, (Vector) Field1.elementAt(1), true);
            }
        } else {
            this.Field1(var1, (Vector) Field1.elementAt(this.Field28), false);
        }

        if (this.Field7) {
            this.Field2(var1);
        }

        super.Field1(var1);
    }

    private void Field1(Graphics var1, Vector var2, boolean var3) {
        int var12 = Class665.Field109 * 3 + 10;
        this.Field9.Field1(var2.size(), var12, this.Field19 + 6, this.Field20 + 40, this.Field21, this.Field22 - 40, true, 0);
        this.Field9.Field1(var1, this.Field19 + 6, this.Field20 + 40, this.Field21 - 12, this.Field22 - 55);
        Class798 var4 = null;
        Class537 var5 = null;
        boolean var6 = false;

        for (int var7 = 0; var7 < var2.size(); ++var7) {
            var5 = (Class537) var2.elementAt(var7);
            int var8 = this.Field20 + 40 + var7 * var12;
            var4 = Class804.Field2((int) var5.Field18);
            if (var8 + var12 - this.Field9.Field2 >= this.Field20 + 30 && var8 - this.Field9.Field2 <= this.Field20 + this.Field22) {
                if (this.Field4 == var7) {
                    var1.setColor(34949);
                    var1.fillRect(this.Field19 - 1, var8 - 5, this.Field21 - 2, var12);
                    var6 = true;
                }

                if (var5.Field40 > 0) {
                    var1.drawImage(this.Field43, this.Field19 + 12, var8 + 20, 0);
                }

                this.Field1(var1, this.Field19, var8 - 5);
                var1.drawImage(Class804.Field20, this.Field19 + 6, var8, 0);
                String[] var13 = var5.Field3();

                for (int var9 = 0; var9 < var13.length; ++var9) {
                    byte var10 = (byte) (var13[var9].charAt(0) - 48);
                    byte var11 = 1;
                    if (!Class467.Field1(var13[var9].charAt(0))) {
                        var10 = 0;
                        var11 = 0;
                    }

                    Class21.Field10[var10 >= 5 ? 0 : var10].Field1(var1, var13[var9].substring(var11), 30 + this.Field19, var8 + var9 * Class665.Field109 + 2, 0);
                }

                Class381.Field1(var1, var4.Field8, 16 + this.Field19, var8 + 8);
            }
        }

        this.Field1(var1, this.Field19, this.Field20 + 40 + var2.size() * var12 - 5);
        if (var6 && (this.Field4 == 0 || this.Field4 == 1)) {
            Class105.Field1(var1);
            var2.elementAt(this.Field4);
        }

    }

    private void Field2(Graphics var1) {
        Class105.Field1(var1);
        var1.setColor(16774720);
        var1.fillRect(this.Field23 - 1, this.Field24 - 1, this.Field25 + 2, this.Field26 + 2);
        var1.setColor(25695);
        var1.fillRect(this.Field23, this.Field24, this.Field25, this.Field26);
        this.Field10.Field1(this.Field40.length, Class665.Field109 + 2, this.Field23, this.Field24, this.Field25, this.Field26, true, 0);
        this.Field10.Field1(var1, this.Field23, this.Field24, this.Field25, this.Field26);
        int var2 = 0;

        for (int var3 = 0; var3 < this.Field40.length; ++var3) {
            if (var3 == 1 && this.Field44 != null && this.Field44.length > 0) {
                for (int var4 = 0; var4 < this.Field44.length; ++var4) {
                    var1.drawImage(Class804.Field39, this.Field23 + 12 + var4 * 20, this.Field24 + 12 + var2, 3);
                    if (this.Field44[var4] != -1) {
                        Class804.Field1(var1, this.Field44[var4], this.Field23 + 12 + var4 * 20, this.Field24 + 12 + var2);
                    }
                }

                var2 += 18;
            }

            if (!this.Field40[var3].equals("")) {
                byte var6 = (byte) (this.Field40[var3].charAt(0) - 48);
                byte var5 = 1;
                if (!Class467.Field1(this.Field40[var3].charAt(0))) {
                    var6 = 0;
                    var5 = 0;
                }

                Class21.Field10[var6 >= 5 ? 0 : var6].Field1(var1, this.Field40[var3].substring(var5), this.Field23 + 4, this.Field24 + 4 + var3 * (Class665.Field109 + 2) + var2, 0);
            }
        }

    }

    public final void Field4() {
        if (this.Field5 != null) {
            this.Field5.Field4();
        }

        if (this.Field27 > 0) {
            --this.Field27;
        }

        if (this.Field27 <= 0) {
            this.Field27 = 5;
        }

        if (this.Field41 < 0) {
            ++this.Field41;
        }

        if (this.Field42 > 0) {
            --this.Field42;
        }

        if (Class105.Field23 == null && !Class105.Field21.Field1) {
            Class47 var1;
            if (this.Field7) {
                if ((var1 = this.Field10.Field2()).Field1 || var1.Field3) {
                    this.Field18 = var1.Field2;
                }

                this.Field10.Field3();
            } else {
                if ((var1 = this.Field9.Field2()).Field1 || var1.Field3) {
                    this.Field4 = var1.Field2;
                }

                if (Class105.Field1(this.Field19, this.Field20 + 30, this.Field21, this.Field22 - 30) && Class105.Field7) {
                    Class105.Field7 = false;
                    if (var1.Field2 != -1 && super.Field104 != null) {
                        super.Field104.Field2.Field1();
                    }
                }

                this.Field9.Field3();
            }
        }

        super.Field4();
    }

    public final void Field3() {
        int var1;
        if (this.Field38) {
            if (Class105.Field3[4]) {
                Class105.Field3[4] = false;
                --this.Field28;
                if (this.Field28 < 0) {
                    this.Field28 = Field11.length - 1;
                }

                this.Field41 = -5;
                this.Field9.Field1();
                this.Field4 = -1;
                this.Field12();
            } else if (Class105.Field3[6]) {
                Class105.Field3[6] = false;
                ++this.Field28;
                if (this.Field28 > Field11.length - 1) {
                    this.Field28 = 0;
                }

                this.Field42 = 5;
                this.Field9.Field1();
                this.Field4 = -1;
                this.Field12();
            }

            if (Class105.Field3[8]) {
                Class105.Field3[8] = false;
                this.Field4 = 0;
                this.Field38 = false;
                this.Field12();
            }
        } else {
            var1 = ((Vector) Field1.elementAt(this.Field28)).size();
            if (this.Field37 && this.Field28 == 1) {
                if (Class105.Field3[2]) {
                    Class105.Field3[2] = false;
                    --this.Field4;
                    if (this.Field4 <= -1) {
                        this.Field4 = -1;
                        this.Field38 = true;
                        this.Field12();
                    }

                    this.Field9.Field1(this.Field4 * this.Field9.Field5);
                } else if (Class105.Field3[8]) {
                    Class105.Field3[8] = false;
                    ++this.Field4;
                    if (this.Field4 > Field12[this.Field39].length - 1) {
                        this.Field4 = 0;
                    }

                    this.Field9.Field1(this.Field4 * this.Field9.Field5);
                }
            } else if (!this.Field38) {
                if (Class105.Field3[2]) {
                    Class105.Field3[2] = false;
                    if (this.Field7) {
                        --this.Field18;
                        if (this.Field18 < 0) {
                            this.Field18 = this.Field40.length - 1;
                        }

                        this.Field10.Field1(this.Field18 * this.Field10.Field5);
                    } else {
                        --this.Field4;
                        if (this.Field4 <= -1) {
                            this.Field4 = -1;
                            this.Field38 = true;
                        }

                        this.Field12();
                        this.Field9.Field1(this.Field4 * this.Field9.Field5);
                    }
                } else if (Class105.Field3[8]) {
                    Class105.Field3[8] = false;
                    if (this.Field7) {
                        ++this.Field18;
                        if (this.Field18 > this.Field40.length - 1) {
                            this.Field18 = 0;
                        }

                        this.Field10.Field1(this.Field18 * this.Field10.Field5);
                    } else {
                        ++this.Field4;
                        if (this.Field4 > var1 - 1) {
                            this.Field4 = 0;
                        }

                        this.Field12();
                        this.Field9.Field1(this.Field4 * this.Field9.Field5);
                    }
                }
            }
        }

        super.Field3();
        if (Class105.Field23 == null && !Class105.Field21.Field1 && !this.Field7) {
            switch (this.Field28) {
                case 0:
                    if (Class105.Field7 && Class105.Field1(Class105.Field13 / 2 - 40 <= this.Field19 + 6 + Field17 ? this.Field19 + 6 + Field17 : Class105.Field13 / 2 - 40, this.Field20 + 30, 100, 4 * (Class665.Field109 + 10))) {
                        boolean var2 = false;
                        var1 = (Class105.Field11 - (this.Field20 + 30)) / (Class665.Field109 + 10);
                        Class105.Field7 = false;
                        this.Field12();
                        if (var1 >= 0 && var1 <= 3) {
                            this.Field4 = var1;
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        }
                    }
                case 1:
                case 2:
            }

            if (Class105.Field7) {
                this.Field38 = false;
                Class105.Field7 = false;
                if (Class105.Field11 >= this.Field20 && Class105.Field11 <= this.Field20 + 25) {
                    if (Class105.Field10 > this.Field19 && Class105.Field10 < Class105.Field13 / 2) {
                        --this.Field28;
                        if (this.Field28 < 0) {
                            this.Field28 = Field11.length - 1;
                        }

                        this.Field41 = -5;
                        this.Field9.Field1();
                        this.Field4 = -1;
                        this.Field12();
                    } else if (Class105.Field10 < Class105.Field13 / 2 + this.Field21 / 2 && Class105.Field10 > Class105.Field13 / 2) {
                        ++this.Field28;
                        if (this.Field28 > Field11.length - 1) {
                            this.Field28 = 0;
                        }

                        this.Field42 = 5;
                        this.Field9.Field1();
                        this.Field4 = -1;
                        this.Field12();
                    }
                }

                if (((Vector) Field1.elementAt(this.Field28)).size() > 0 && this.Field4 == -1) {
                    this.Field4 = 0;
                }

                this.Field12();
            }
        }

    }

    public final void Field8() {
        this.Field37 = false;
        this.Field4 = -1;
        if (this.Field39 == 0) {
            Class263.Field1().Field2(this.Field30, Field14[this.Field29], this.Field32, this.Field31 + 1, this.Field33);
        } else {
            if (this.Field39 == 1) {
                Class263.Field1().Field7(this.Field6);
            }

        }
    }

    public final void Field9() {
        if (Class105.Field17 != Class523.Field5()) {
            Vector var1;
            if (this.Field28 == 1) {
                if (!this.Field37) {
                    if (Class105.Field37) {
                        (var1 = new Vector()).addElement(this.Field36);
                        Class105.Field21.Field1(var1, 2);
                        return;
                    }

                    this.Field6();
                    return;
                }

                var1 = new Vector();
                Class87 var2 = null;
                if (this.Field39 == 0) {
                    int var3;
                    switch (this.Field4) {
                        case 0:
                            for (var3 = 0; var3 < Field13.length; ++var3) {
                                var2 = new Class87(Field13[var3], new Class371(this));
                                var1.addElement(var2);
                            }

                            Class105.Field21.Field1(var1, 2);
                            return;
                        case 1:
                            Class105.Field25.Field1("Nhập số", new Class370(this), 3, 3, true);
                            Class105.Field23 = Class105.Field25;
                            return;
                        case 2:
                            for (var3 = 0; var3 < Field15.length; ++var3) {
                                var2 = new Class87(Field15[var3], new Class415(this));
                                var1.addElement(var2);
                            }

                            Class105.Field21.Field1(var1, 2);
                            return;
                        case 3:
                            for (var3 = 0; var3 < Field16.length; ++var3) {
                                var2 = new Class87(Field16[var3], new Class413(this));
                                var1.addElement(var2);
                            }

                            Class105.Field21.Field1(var1, 2);
                            return;
                        case 4:
                            for (var3 = 0; var3 < 16; ++var3) {
                                var2 = new Class87("Cộng " + var3, new Class366(this));
                                var1.addElement(var2);
                            }

                            Class105.Field21.Field1(var1, 2);
                        default:
                            return;
                    }
                }

                if (this.Field39 == 1 && this.Field4 > -1) {
                    Class105.Field25.Field1("Nhập tên", new Class365(this), 0, 25, true);
                    Class105.Field23 = Class105.Field25;
                    return;
                }
            } else {
                if (Class105.Field37) {
                    (var1 = new Vector()).addElement(this.Field36);
                    Class105.Field21.Field1(var1, 2);
                    return;
                }

                this.Field6();
            }

        }
    }

    public static void Field10() {
        Field1.setElementAt(Class537.Field6(), 3);
    }

    public final boolean Field11() {
        if (this.Field28 == 0) {
            if (((Vector) Field1.elementAt(this.Field28)).size() > 0 && !this.Field38 && this.Field4 < ((Vector) Field1.elementAt(this.Field28)).size()) {
                if (this.Field4 < 0) {
                    return false;
                }

                if (((Class537) ((Vector) Field1.elementAt(this.Field28)).elementAt(this.Field4)).Field40 > 0) {
                    return true;
                }
            }
        } else if (this.Field28 == 1 && !this.Field37 && ((Vector) Field1.elementAt(this.Field28)).size() > 0 && !this.Field38 && this.Field4 < ((Vector) Field1.elementAt(this.Field28)).size()) {
            if (this.Field4 < 0) {
                return false;
            }

            if (((Class537) ((Vector) Field1.elementAt(this.Field28)).elementAt(this.Field4)).Field40 > 0) {
                return true;
            }
        }

        return false;
    }

    public final void Field12() {
        if (this.Field28 == 3) {
            Field10();
        }

        if (this.Field28 == 0) {
            if (this.Field11()) {
                super.Field103 = new Class87("Menu", new Class405(this));
                return;
            }

            if (this.Field38) {
                super.Field103 = new Class87("", new Class367(this));
                return;
            }

            if (((Vector) Field1.elementAt(this.Field28)).size() > 0) {
                super.Field103 = new Class87("Mua", new Class406(this));
                return;
            }
        } else {
            if (this.Field28 == 1) {
                super.Field103 = new Class87("Menu", new Class398(this));
                return;
            }

            if (this.Field28 == 2) {
                super.Field103 = this.Field34;
                return;
            }

            if (this.Field28 == 3) {
                super.Field103 = this.Field35;
                return;
            }

            if (this.Field28 == 4) {
                Vector var1;
                if ((var1 = (Vector) Field1.elementAt(this.Field28)).size() <= 0 && Field8 <= 0L) {
                    super.Field103 = new Class87("", new Class363(this));
                    return;
                }

                super.Field103 = new Class87("Menu", new Class327(this, var1));
                return;
            }

            if (this.Field28 == 5) {
                if (((Vector) Field1.elementAt(this.Field28)).size() == 0 || this.Field38) {
                    super.Field103 = new Class87("", new Class318(this));
                    return;
                }

                super.Field103 = new Class87("Menu", new Class317(this));
            }
        }

    }

    public final void Field13() {
        if (this.Field7) {
            this.Field6();
        }

    }

    static int Field1(Class376 var0) {
        return var0.Field28;
    }

    static void Field1(Class376 var0, int var1) {
        var0.Field29 = var1;
    }

    static void Field2(Class376 var0, int var1) {
        var0.Field30 = var1;
    }

    static int Field2(Class376 var0) {
        return var0.Field30;
    }

    static void Field3(Class376 var0, int var1) {
        var0.Field31 = var1;
    }

    static void Field4(Class376 var0, int var1) {
        var0.Field32 = var1;
    }

    static void Field5(Class376 var0, int var1) {
        var0.Field33 = var1;
    }

    static boolean Field3(Class376 var0) {
        return var0.Field38;
    }

    static boolean Field4(Class376 var0) {
        return var0.Field37;
    }

    static byte Field5(Class376 var0) {
        return var0.Field39;
    }

    static void Field1(Class376 var0, byte var1) {
        var0.Field39 = var1;
    }

    static void Field1(Class376 var0, boolean var1) {
        var0.Field37 = false;
    }
}
