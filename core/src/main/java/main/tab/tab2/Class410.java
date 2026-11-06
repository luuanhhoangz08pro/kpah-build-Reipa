package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class410 extends Class671 {
    public static int Field1 = 50;
    public static int Field2 = 50;
    public static int Field3 = 1;
    private int Field13 = 0;
    private int Field14;
    private int Field15;
    private boolean Field16;
    private int Field17;
    private int Field18;
    private static String Field19 = "";
    private Class194 Field20 = new Class194();
    private Class194 Field21;
    public boolean Field4;
    private boolean Field22;
    private boolean Field23;
    private boolean Field24;
    private boolean Field25;
    public boolean Field5;
    public boolean Field6;
    public boolean Field7;
    public boolean Field8;
    private Class86 Field26;
    private Class86 Field27;
    private Class86 Field28;
    private Class86 Field29;
    private static int Field30;
    private static int Field31;
    private static int Field32;
    private static int Field33;
    private static int Field34;
    public static boolean Field9;
    private String[] Field35 = new String[]{"Chế độ thường", "Đánh quái ", "Chọn NPC", "Chế độ chiếm thành", "Chế độ quốc chiến"};
    private String[] Field36 = new String[]{"Chọn toàn bộ", "Chỉ chọn quái, người trong chế độ đồ sát và khác quốc gia ", "Chỉ chọn NPC", "Chỉ chọn người khác bang", "Chỉ người khác nước"};
    private String[] Field37;
    public byte Field10;
    int[] Field11 = new int[]{-1, -1, -1};
    int[] Field12 = new int[]{-1, -1, -1};

    public final void Field1() {
        this.Field2();
        super.Field104.Field1 = "Chọn";
        super.Field104 = this.Field28;
        this.Field5 = false;
        super.Field1();
    }

    public final void Field2() {
        this.Field21.Field1 = this.Field20.Field1 = Class106.Field15;
        this.Field20.Field2 = Class106.Field16 - 50;
        this.Field21.Field2 = Class106.Field16 - 25;
        this.Field13 = 0;
        this.Field14 = 0;
        this.Field20.Field5 = false;
        this.Field21.Field5 = false;
        this.Field16 = true;
    }

    public Class410() {
        this.Field20.Field3 = 30;
        this.Field20.Field4 = 20;
        this.Field20.Field5 = false;
        this.Field20.Field3(1);
        this.Field20.Field1(String.valueOf(Field1));
        this.Field21 = new Class194();
        this.Field21.Field3 = 30;
        this.Field21.Field4 = 20;
        this.Field21.Field5 = false;
        this.Field21.Field3(1);
        this.Field21.Field1(String.valueOf(Field2));
        this.Field28 = new Class86("", new Class31(this));
        super.Field104 = this.Field28;
        this.Field26 = new Class86("", new Class18(this));
        this.Field27 = new Class86("", new Class22(this));
        this.Field29 = new Class86("", new Class11(this));
        super.Field103 = new Class86("Đóng", new Class12(this));
        super.Field105 = null;
    }

    public final void Field5() {
        try {
            Field1 = Integer.parseInt(this.Field20.Field5());
            Field2 = Integer.parseInt(this.Field21.Field5());
        } catch (Exception var1) {
        }
    }

    public final void Field2(int var1) {
        this.Field6 = false;
        this.Field8 = false;
        this.Field7 = false;
        if (var1 == 0) {
            this.Field6 = true;
            Class62.Field71 = true;
            Class62.Field73 = false;
        } else if (var1 == 1) {
            this.Field7 = true;
            Class62.Field71 = false;
            Class62.Field73 = true;
        } else if (var1 == 2) {
            this.Field8 = true;
            Class62.Field71 = true;
            Class62.Field73 = true;
        } else {
            Class62.Field71 = false;
            Class62.Field73 = false;
        }

        Class62.Field72 = Class62.Field71;
        Field1 = Integer.parseInt(this.Field20.Field5());
        Field2 = Integer.parseInt(this.Field21.Field5());
        Field3 = (int) (System.currentTimeMillis() / 100L) + 10;
        Class62.Field74 = (long) ((int) (System.currentTimeMillis() / 1000L) + 1);
        Class106.Field19.Field1();
        if (Class62.Field71) {
            Class106.Field19.Field15.Field59 = Class106.Field19.Field15.Field193;
            Class106.Field19.Field15.Field60 = Class106.Field19.Field15.Field194;
        }

    }

    public final void Field4() {
        Class106.Field19.Field4();
        if (!this.Field5) {
            if (Field31 != Field30) {
                Field33 = Field30 - Field31 << 2;
                Field32 += Field33;
                Field31 += Field32 >> 4;
                Field32 &= 15;
            }

            if (Math.abs(Field30 - Field31) < 15 && Field31 < 0) {
                Field30 = 0;
            }

            if (Math.abs(Field30 - Field31) < 10 && Field31 > Field34) {
                Field30 = Field34;
            }

            this.Field20.Field4();
            this.Field21.Field4();
        }

        super.Field4();
    }

    public final void Field3() {
        if (this.Field5) {
            boolean var1 = false;
            boolean var2 = false;
            if (Class106.Field1(Class106.Field13 / 2 - 75, Class106.Field14 / 2 - 80, 75, 30)) {
                var1 = true;
            } else if (Class106.Field1(Class106.Field13 / 2, Class106.Field14 / 2 - 80, 75, 30)) {
                var2 = true;
            }

            if (Class106.Field7) {
                if (var1) {
                    Class106.Field3[4] = true;
                    Class106.Field7 = false;
                } else if (var2) {
                    Class106.Field3[6] = true;
                    Class106.Field7 = false;
                }
            }

            if (Class106.Field3[4]) {
                Class106.Field3[4] = false;
                if (--Class62.Field65 < 0) {
                    Class62.Field65 = (byte) (this.Field35.length - 1);
                }

                this.Field6();
                this.Field17 = 5;
            } else if (Class106.Field3[6]) {
                Class106.Field3[6] = false;
                if (++Class62.Field65 > this.Field35.length - 1) {
                    Class62.Field65 = 0;
                }

                this.Field6();
                this.Field18 = 5;
            }
        } else {
            switch (this.Field14) {
                case 0:
                    Field19 = "Trị";
                    if (Class106.Field3[2]) {
                        --this.Field13;
                        if (this.Field13 == 0) {
                            this.Field16 = true;
                            this.Field20.Field5 = false;
                            this.Field21.Field5 = false;
                            super.Field104.Field1 = "Chọn";
                            super.Field104 = this.Field28;
                            super.Field105 = null;
                        }

                        if (this.Field13 < 0) {
                            this.Field13 = 0;
                        }
                    } else if (Class106.Field3[8]) {
                        this.Field16 = false;
                        ++this.Field13;
                        if (this.Field13 > 4) {
                            this.Field13 = 4;
                        }
                    }

                    if (this.Field13 == 1) {
                        this.Field20.Field5 = true;
                        this.Field21.Field5 = false;
                        super.Field105 = this.Field20.Field9;
                    } else if (this.Field13 == 2) {
                        this.Field20.Field5 = false;
                        this.Field21.Field5 = true;
                        super.Field105 = this.Field21.Field9;
                        super.Field104.Field1 = "Chọn";
                        super.Field104 = this.Field28;
                    } else if (this.Field13 == 3) {
                        this.Field20.Field5 = false;
                        this.Field21.Field5 = false;
                        super.Field104.Field1 = "Chọn";
                        super.Field104 = this.Field26;
                    } else if (this.Field13 == 4) {
                        this.Field20.Field5 = false;
                        this.Field21.Field5 = false;
                        super.Field104.Field1 = "Chọn";
                        super.Field104 = this.Field27;
                    }
                    break;
                case 1:
                    Field19 = "Đánh";
                    if ((Field34 = Class106.Field19.Field15.Field24() * 23 - 114) < 0) {
                        Field34 = 0;
                    }

                    if (Class106.Field3[2]) {
                        --this.Field13;
                        if (this.Field13 < 0) {
                            this.Field13 = 0;
                        }

                        if (this.Field13 == 0) {
                            this.Field16 = true;
                            super.Field104 = this.Field28;
                            super.Field104.Field1 = "Chọn";
                            super.Field104 = this.Field28;
                        }
                    } else if (Class106.Field3[8]) {
                        ++this.Field13;
                        this.Field16 = false;
                        if (this.Field13 > 1) {
                            this.Field13 = 1;
                        }

                        if (this.Field13 == 1) {
                            super.Field104 = this.Field29;
                            super.Field104.Field1 = "";
                        }
                    }

                    if (this.Field13 == 1) {
                        if (Class106.Field3[4]) {
                            --this.Field15;
                            if (this.Field15 < 0) {
                                this.Field15 = 0;
                            }
                        } else if (Class106.Field3[6]) {
                            ++this.Field15;
                            if (this.Field15 > Class106.Field19.Field15.Field24() - 1) {
                                this.Field15 = Class106.Field19.Field15.Field24() - 1;
                            }
                        } else if (Class106.Field3[5]) {
                            super.Field104.Field2.Field1();
                        }
                    }
                    break;
                case 2:
                    Field19 = "Nhặt";
                    if (!Class106.Field3[2]) {
                        if (Class106.Field3[8]) {
                            this.Field16 = false;
                            ++this.Field13;
                            if (this.Field13 == 1) {
                                super.Field104 = this.Field26;
                                super.Field104.Field1 = "Chọn";
                            }

                            if (this.Field13 > 4) {
                                this.Field13 = 4;
                            }
                        }
                    } else {
                        --this.Field13;
                        if (this.Field13 == 0) {
                            this.Field16 = true;
                            if (!Class62.Field71 && !Class62.Field73) {
                                super.Field104.Field1 = "Bật";
                            } else {
                                super.Field104.Field1 = "Tắt";
                            }

                            super.Field104 = this.Field28;
                        }

                        if (this.Field13 < 0) {
                            this.Field13 = 0;
                        }
                    }
            }

            if (this.Field13 == 0) {
                if (Class106.Field3[4]) {
                    --this.Field14;
                    this.Field17 = 5;
                    if (this.Field14 < 0) {
                        this.Field14 = 1;
                    }
                } else if (Class106.Field3[6]) {
                    ++this.Field14;
                    this.Field18 = 5;
                    if (this.Field14 > 1) {
                        this.Field14 = 0;
                    }
                }
            }

            if (this.Field14 == 1 && this.Field13 == 1) {
                if ((Field30 = this.Field15 % Class106.Field19.Field15.Field24() * 23 - 57) < 0) {
                    Field30 = 0;
                }

                if (Field30 > Field34) {
                    Field30 = Field34;
                }
            } else {
                Field30 = 0;
                Field31 = 0;
                this.Field15 = 0;
            }
        }

        super.Field3();
    }

    public final boolean Field1(int var1) {
        if (this.Field20.Field5) {
            if (this.Field20.Field1(var1)) {
                return true;
            }
        } else if (this.Field21.Field5 && this.Field21.Field1(var1)) {
            return true;
        }

        return super.Field1(var1);
    }

    public final void Field6() {
        this.Field37 = Class21.Field10[0].Field1(this.Field36[Class62.Field65], 135);
        super.Field104 = new Class86("Chọn", new Class107(this));
        super.Field105 = new Class86("Đóng", new Class103(this));
        super.Field103 = new Class86("", new Class105(this));
    }

    public final void Field1(Graphics var1) {
        Class106.Field19.Field1(var1);
        if (this.Field17 > 0) {
            --this.Field17;
        }

        if (this.Field18 > 0) {
            --this.Field18;
        }

        if (this.Field5) {
            Class811.Field4(var1, Class106.Field13 / 2 - 80, Class106.Field14 / 2 - 80, 160, 160);
            var1.drawImage(Class811.Field30, Class106.Field13 / 2 - 65 - this.Field17, Class106.Field14 / 2 - 66, 3);
            var1.drawRegion(Class811.Field30, 0, 0, 11, 7, 2, Class106.Field13 / 2 + 65 + this.Field18, Class106.Field14 / 2 - 66, 3);
            Class21.Field10[0].Field1(var1, this.Field35[Class62.Field65], Class106.Field13 / 2, Class106.Field14 / 2 - 73, 2);

            for (int var6 = 0; var6 < this.Field37.length; ++var6) {
                Class21.Field10[0].Field1(var1, this.Field37[var6], Class106.Field13 / 2 - 72, Class106.Field14 / 2 - 50 + var6 * Class671.Field109, 0);
            }

            super.Field1(var1);
        } else {
            var1.translate(Class106.Field15 - 70, Class106.Field16 - 80);
            Class811.Field4(var1, 2, 2, 140, 145);
            var1.drawImage(Class811.Field30, 13 - this.Field17, 16, 3);
            var1.drawRegion(Class811.Field30, 0, 0, 11, 7, 2, 127 + this.Field18, 17, 3);
            var1.setColor(7961465);
            var1.fillRect(27, 8, 88, 16);
            var1.fillRect(26, 9, 90, 14);
            var1.setColor(this.Field16 ? 30611 : 2368548);
            var1.fillRect(27, 9, 88, 14);
            Class21.Field10[0].Field1(var1, Field19, 72, 9, 2);
            Class106.Field1(var1);
            switch (this.Field14) {
                case 0:
                    Class21.Field10[0].Field1(var1, "HP: ", Class106.Field15 - 60, Class106.Field16 - 45, 0);
                    Class21.Field10[0].Field1(var1, "MP: ", Class106.Field15 - 60, Class106.Field16 - 20, 0);
                    Class21.Field10[0].Field1(var1, "%", Class106.Field15 + 45, Class106.Field16 - 45, 1);
                    Class21.Field10[0].Field1(var1, "%", Class106.Field15 + 45, Class106.Field16 - 20, 1);
                    var1.setColor(16777215);
                    var1.fillRect(Class106.Field15 - 65, Class106.Field16 + 5, 135, 1);
                    Class21.Field10[0].Field1(var1, "Tự vào nhóm:", Class106.Field15 - 60, Class106.Field16 + 15, 0);
                    Class811.Field36.Field1(this.Field13 == 3 ? 1 : 0, Class106.Field15 + 30, Class106.Field16 + 23, 0, 3, var1);
                    Class21.Field10[0].Field1(var1, "Tự về làng:", Class106.Field15 - 60, Class106.Field16 + 35, 0);
                    Class811.Field36.Field1(this.Field13 == 4 ? 1 : 0, Class106.Field15 + 30, Class106.Field16 + 43, 0, 3, var1);
                    if (this.Field4) {
                        Class811.Field36.Field1(2, Class106.Field15 + 30, Class106.Field16 + 23, 0, 3, var1);
                    }

                    if (Field9) {
                        Class811.Field36.Field1(2, Class106.Field15 + 30, Class106.Field16 + 43, 0, 3, var1);
                    }

                    this.Field20.Field1(var1);
                    Class106.Field1(var1);
                    this.Field21.Field1(var1);
                    break;
                case 1:
                    Class21.Field10[0].Field1(var1, "Đánh:", Class106.Field15 - 15, Class106.Field16 - 50, 0);
                    var1.setColor(16777215);
                    var1.drawRect(Class106.Field15 - 50, Class106.Field16 - 35, 17, 17);
                    var1.drawRect(Class106.Field15 - 8, Class106.Field16 - 35, 17, 17);
                    var1.drawRect(Class106.Field15 + 35, Class106.Field16 - 35, 17, 17);
                    Class21.Field10[0].Field1(var1, "Hổ trợ:", Class106.Field15 - 15, Class106.Field16 - 8, 0);
                    var1.setColor(16777215);
                    var1.drawRect(Class106.Field15 - 50, Class106.Field16 + 7, 17, 17);
                    var1.drawRect(Class106.Field15 - 8, Class106.Field16 + 7, 17, 17);
                    var1.drawRect(Class106.Field15 + 35, Class106.Field16 + 7, 17, 17);
                    var1.fillRect(Class106.Field15 - 65, Class106.Field16 + 33, 135, 1);
                    Graphics var3 = var1;
                    Class410 var2 = this;
                    var1.setClip(Class106.Field15 - 60, Class106.Field16 + 35, 125, 26);
                    var1.translate(-Field31, 0);

                    for (int var4 = 0; var4 < Class106.Field19.Field15.Field24(); ++var4) {
                        Class379.Field1.Field1(var4, var4 * 23 + 11 + Class106.Field15 - 60, Class106.Field16 + 48, 0, 3, var3);
                        var3.drawImage(Class811.Field40, var4 * 23 + 11 + Class106.Field15 - 60, Class106.Field16 + 48, 3);
                        Class21.Field9[1].Field1(var3, String.valueOf(Class357.Field97[var4]), var4 * 23 + 23 - 4 + Class106.Field15 - 60, Class106.Field16 + 48 + 5, 1);
                    }

                    if (this.Field13 == 1 && Class106.Field12 % 10 > 3) {
                        var3.setColor(16388369);
                        var3.drawRect(this.Field15 * 23 + Class106.Field15 - 60, Class106.Field16 + 38, 21, 21);
                    }

                    Class106.Field1(var3);
                    int[] var7 = new int[]{Class106.Field15 - 51, Class106.Field15 - 9, Class106.Field15 + 34};
                    int var5;
                    if (this.Field12 != null) {
                        for (var5 = 0; var5 < var2.Field12.length; ++var5) {
                            if (var2.Field12[var5] != -1) {
                                Class379.Field1.Field1(var2.Field12[var5], var7[var5], Class106.Field16 - 36, 0, 0, var3);
                            }
                        }
                    }

                    if (var2.Field11 != null) {
                        for (var5 = 0; var5 < var2.Field11.length; ++var5) {
                            if (var2.Field11[var5] != -1) {
                                Class379.Field1.Field1(var2.Field11[var5], var7[var5], Class106.Field16 + 6, 0, 0, var3);
                            }
                        }
                    }
                    break;
                case 2:
                    Class21.Field10[0].Field1(var1, "HP + MP: ", Class106.Field15 - 60, Class106.Field16 - 45, 0);
                    Class811.Field36.Field1(this.Field13 == 1 ? 1 : 0, Class106.Field15 + 30, Class106.Field16 - 38, 0, 3, var1);
                    if (this.Field22) {
                        Class811.Field36.Field1(2, Class106.Field15 + 30, Class106.Field16 - 38, 0, 3, var1);
                    }

                    Class21.Field10[0].Field1(var1, "Trang bị: ", Class106.Field15 - 60, Class106.Field16 - 25, 0);
                    Class811.Field36.Field1(this.Field13 == 2 ? 1 : 0, Class106.Field15 + 30, Class106.Field16 - 18, 0, 3, var1);
                    if (this.Field23) {
                        Class811.Field36.Field1(2, Class106.Field15 + 30, Class106.Field16 - 18, 0, 3, var1);
                    }

                    Class21.Field10[0].Field1(var1, "Nguyên liệu: ", Class106.Field15 - 60, Class106.Field16 - 5, 0);
                    Class811.Field36.Field1(this.Field13 == 3 ? 1 : 0, Class106.Field15 + 30, Class106.Field16 + 2, 0, 3, var1);
                    if (this.Field24) {
                        Class811.Field36.Field1(2, Class106.Field15 + 30, Class106.Field16 + 2, 0, 3, var1);
                    }

                    Class21.Field10[0].Field1(var1, "Nhặt hết: ", Class106.Field15 - 60, Class106.Field16 + 15, 0);
                    Class811.Field36.Field1(this.Field13 == 4 ? 1 : 0, Class106.Field15 + 30, Class106.Field16 + 22, 0, 3, var1);
                    if (this.Field25) {
                        Class811.Field36.Field1(2, Class106.Field15 + 30, Class106.Field16 + 22, 0, 3, var1);
                    }
            }

            super.Field1(var1);
        }
    }

    private boolean Field7() {
        byte[][] var1 = new byte[][]{{4, 5}, {4, 5}, {4, 5, 6, 7}, {4, 5}, {4, 5}};

        for (int var2 = 0; var2 < var1[Class106.Field19.Field15.Field93].length; ++var2) {
            if (this.Field15 == var1[Class106.Field19.Field15.Field93][var2]) {
                return true;
            }
        }

        return false;
    }

    private void Field1(int var1, boolean var2) {
        Vector var3 = new Vector();

        for (int var4 = 0; var4 < 3; ++var4) {
            var3.addElement(new Class86("Phím số " + (1 + (var4 << 1)), new Class201(this, var2, var4, var1)));
        }

        Class106.Field21.Field1(var3, 2);
    }

    static void Field1(Class410 var0) {
        var0 = var0;

        try {
            if (!var0.Field20.Field5().equals("") && !var0.Field21.Field5().equals("")) {
                if (Integer.parseInt(var0.Field20.Field5()) <= 100 && Integer.parseInt(var0.Field21.Field5()) <= 100) {
                    Vector var1 = new Vector();
                    String[] var2 = new String[]{"Auto đánh", "Auto bơm máu", "Auto đánh, bơm máu"};
                    if (Class62.Field71 || Class62.Field73) {
                        var2 = new String[]{"Auto đánh", "Auto bơm máu", "Auto đánh, bơm máu", "Tắt auto"};
                    }

                    for (int var3 = 0; var3 < var2.length; ++var3) {
                        Class86 var4 = new Class86(var2[var3], new Class108(var0, var3));
                        var1.addElement(var4);
                    }

                    Class106.Field21.Field1(var1, 2);
                } else {
                    Class106.Field1("Giá trị không hợp lệ.");
                }
            } else {
                Class106.Field1("HP, Mp không được bỏ trống.");
            }
        } catch (Exception var5) {
            Class106.Field1("Vui lòng chỉ nhập số.");
        }
    }

    static void Field2(Class410 var0) {
        if (var0.Field14 == 0) {
            var0.Field4 = !var0.Field4;
        } else {
            if (var0.Field14 == 2) {
                switch (var0.Field13) {
                    case 1:
                        var0.Field22 = !var0.Field22;
                        break;
                    case 2:
                        var0.Field23 = !var0.Field23;
                        break;
                    case 3:
                        var0.Field24 = !var0.Field24;
                        break;
                    case 4:
                        var0.Field25 = !var0.Field25;
                        if (var0.Field25) {
                            var0.Field24 = var0.Field23 = var0.Field22 = true;
                        } else {
                            var0.Field24 = var0.Field23 = var0.Field22 = false;
                        }
                }

                if (var0.Field22 && var0.Field23 && var0.Field24) {
                    var0.Field25 = true;
                    return;
                }

                var0.Field25 = false;
            }

        }
    }

    static void Field3(Class410 var0) {
        if (Class357.Field97[var0.Field15] == -1) {
            Class106.Field1("Xin gặp Lâm tướng quân để học kỹ năng này");
        } else {
            new Vector();
            boolean var1 = false;
            boolean var2;
            if (var2 = var0.Field7()) {
                var1 = Class599.Field4[Class106.Field19.Field15.Field93][var0.Field15 - 4] == -1;
            }

            if (!var1) {
                if (Class357.Field97[var0.Field15] > 0) {
                    if (Class106.Field19.Field15.Field93 != 2) {
                        var0.Field1(var0.Field15, var2);
                        return;
                    }

                    if (var0.Field15 == 6) {
                        Class106.Field1("Không thể dùng skill này");
                        return;
                    }

                    var0.Field1(var0.Field15, var2);
                    return;
                }

                Class106.Field1("Chưa học kỹ năng này");
            }

        }
    }
}
