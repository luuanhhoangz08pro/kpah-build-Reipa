package main.tab.tab1;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Vector;

public final class Class326 extends Class665 {
    private static Class326 Field34;
    private int Field35;
    private int Field36;
    public int Field1;
    public int Field2;
    public int Field3;
    public int Field4 = 7;
    private int Field37;
    private int Field38;
    private int Field39;
    private int Field40;
    private int Field41;
    public int Field5;
    public int Field6;
    private int Field42;
    private int Field43;
    private static String[] Field44 = null;
    private int[][] Field45 = new int[][]{{0, 1, 2}, {0, 1}};
    private int Field46;
    private String[] Field47 = new String[]{"Hành trang", "Trang bị", "Tiềm năng", "Kỹ năng", "Thông tin", "Nhóm", "Nhiệm vụ", "Học kỹ năng", "Trao đổi", "Gian hàng", "Gian hàng", "Áo", "Quần", "Nón", "Nhẫn", "Dây chuyền", "Giày", "Găng tay", "Ngọc bội", "Gian hàng", "Gian hàng", "Luyện đồ", "Kho đồ", "Gian hàng", "Gian hàng", "Khảm", "Hợp thành", "Nhiệm vụ", "Chế đồ", "Kỹ năng bang hội", "Kỹ năng cá nhân", "Trang bị thú", "Hợp đồ thú"};
    private String[] Field48;
    private String Field49 = "";
    private String Field50 = "";
    public Vector Field7 = new Vector();
    private Vector Field51;
    public Vector Field8 = new Vector();
    public boolean Field9 = false;
    public boolean Field10 = false;
    public boolean Field11 = false;
    private boolean Field52 = false;
    private boolean Field53;
    private int Field54;
    private int Field55;
    private static int Field56;
    public static int Field12;
    private static int Field57;
    private static int Field58;
    private static int Field59;
    private static int Field60;
    private static int Field61;
    private static int Field62;
    private static int Field63;
    private static int Field64;
    public static int Field13;
    public static int Field14;
    private static int Field65;
    private static int Field66;
    public static int Field15;
    public static int Field16;
    private static int Field67;
    private static int Field68 = 1;
    public static byte[] Field17;
    private Vector Field69;
    private int Field70;
    public Vector Field18 = new Vector();
    public Vector Field19 = new Vector();
    public Vector Field20;
    public Vector Field21 = new Vector();
    private Class537[] Field71 = new Class537[5];
    private short[][] Field72;
    private static byte Field73;
    private static byte Field74;
    public static Class359 Field22;
    private byte[] Field75;
    private static boolean Field76 = false;
    private boolean Field77 = false;
    private int Field78;
    private int Field79;
    private int Field80;
    public Vector Field23 = new Vector();
    private int Field81 = 0;
    public byte[] Field24;
    int Field25;
    public static String Field26 = "";
    int Field27 = -20;
    Image Field28;
    private int Field82 = -1;
    boolean Field29 = false;
    private String[] Field83;
    private boolean Field84;
    private boolean Field85;
    private int Field86 = 0;
    int Field30;
    int Field31 = 1;
    public static String Field32 = "";
    public short Field33;
    private static byte[] Field87;
    private static byte[] Field88;
    private static byte[][] Field89;

    static {
        int[] var10000 = new int[]{9, 9, 9, 107, 107, 107, 107, 107, 107, 107, 9, 107, 9, 82, 9, 9, 9, 9, 9, 34};
        var10000 = new int[]{32, 73, 52, 11, 11, 11, 11, 11, 52, 32, 94, 94, 11, 92, 32, 52, 73, 94, 11, 92};
        Field87 = new byte[]{12, -1, 0, 9, 2, 8, 1, 8, 10, 11};
        Field88 = new byte[]{18, 19, 14, 20, 15, 21, 16, 22, 17, 23};
        Field89 = new byte[][]{{10, 11}, {56, 11}, {10, 32}, {56, 32}, {10, 52}, {56, 52}, {10, 73}, {56, 94}, {10, 94}, {56, 94}};
    }

    public static Class326 Field5() {
        return Field34 == null ? (Field34 = new Class326()) : Field34;
    }

    public final void Field1() {
        super.Field1();
        this.Field2();
        this.Field11 = true;
    }

    public final void Field2() {
        this.Field35 = Class105.Field15 - 64;
        this.Field36 = Class105.Field16 - 77;
        this.Field16();
    }

    public Class326() {
        String[] var10000 = new String[]{"Trắng", "Hoàn mỹ", "Đỏ", "Xanh"};
        new Vector();
        this.Field2();
        super.Field105 = new Class87("Đóng", new Class768(this));
        this.Field3 = 0;
        Field16 = 0;
        this.Field30 = 0;
        this.Field31 = 1;
    }

    private void Field1(Vector var1) {
        this.Field7 = var1;
        this.Field4 = 7;
        this.Field37 = var1.size() / this.Field4;
        if (var1.size() % this.Field4 != 0) {
            ++this.Field37;
        }

        if (this.Field37 < 5) {
            this.Field37 = 5;
        }

        if (Field17[Field16] == 0 && this.Field37 > 6) {
            this.Field37 = 6;
        }

        this.Field16();
        this.Field11 = true;
        this.Field22();
    }

    private void Field16() {
        Field15 = this.Field4 * this.Field5 - this.Field1;
        Field59 = this.Field37 * this.Field6 - this.Field2;
        if (Field15 < 0) {
            Field15 = 0;
        }

        if (Field59 < 0) {
            Field59 = 0;
        }

    }

    public final void Field1(int var1, boolean var2, byte[] var3) {
        this.Field10 = var2;
        if (var2) {
            this.Field24 = var3;
        }

        Field17 = var3;
        Field16 = var1;
        this.Field3 = 0;
        this.Field22();
        Class326 var4 = this;
        Field67 = 0;
        super.Field103 = null;
        this.Field52 = false;
        this.Field51 = null;
        this.Field72 = null;
        this.Field7.removeAllElements();
        this.Field42 = 1;
        this.Field43 = 35;
        if (Field17.length > 1) {
            this.Field50 = this.Field49;
            this.Field49 = this.Field47[Field17[Field16]];
        }

        this.Field81 = 0;
        if (Field17[Field16] != 0) {
            this.Field25 = Field16;
        }

        (new StringBuffer("Tab duoc chon la tab : ")).append(Field17[Field16]).toString();
        int var6;
        switch (Field17[Field16]) {
            case 0:
                this.Field52 = true;
                this.Field1(this.Field26());
                this.Field1(126, 90, 7, this.Field37, 18, 18);
                super.Field103 = new Class87(Field26, new Class770(this));
                break;
            case 1:
                this.Field42 += 5;
                this.Field43 += -2;
                this.Field1(117, 104, 3, 5, 97, 21);
                Vector var7 = new Vector();
                if (Class105.Field19.Field15.Field94 != -1) {
                    var7.addElement(new Class87("Thay đồ", new Class775(this)));
                }

                if (Class105.Field19.Field15.Field141) {
                    var7.addElement(new Class87("Cất cuốc", new Class779(this)));
                }

                if (var7.size() == 1) {
                    super.Field103 = (Class87) var7.elementAt(0);
                } else if (var7.size() == 2) {
                    super.Field103 = new Class87("Chọn", new Class784(this, var7));
                }
                break;
            case 2:
                this.Field43 += 13;
                this.Field1(124, 94, 1, 5, 125, 19);
                break;
            case 3:
                super.Field103 = null;
                this.Field42 += 5;
                this.Field43 += 7;
                this.Field3 = 0;
                this.Field1(114, 30, Class105.Field19.Field15.Field24(), 1, 23, 20);
                break;
            case 4:
                super.Field104 = null;
                this.Field52 = true;
                this.Field42 += -4;
                this.Field43 += -2;
                this.Field1(134, 95, 1, 10, 50, 12);
                break;
            case 5:
                this.Field52 = true;
                this.Field42 += -4;
                this.Field43 += -2;
                this.Field1(134, 95, 1, Class359.Field127.size(), 130, 32);
                break;
            case 6:
                this.Field52 = true;
                this.Field42 += -4;
                this.Field43 += -2;
                this.Field28();
                this.Field1(134, 95, 1, this.Field69.size(), 130, 15);
                this.Field69.removeAllElements();
                break;
            case 7:
                this.Field42 += 5;
                this.Field43 += 7;
                super.Field103 = null;
                this.Field22();
                break;
            case 8:
                this.Field42 += 9;
                this.Field43 += -5;
                this.Field49 = "Trao đổi";
                super.Field104 = new Class87("Chọn", new Class729(this));
                super.Field103 = new Class87("Xong", new Class666(this));
                break;
            case 9:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1((Vector) Class105.Field19.Field21, -1);
                this.Field1(this.Field7);
                this.Field7(-1);
                break;
            case 10:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field2(Class105.Field19.Field21);
                this.Field1(this.Field7);
                super.Field103 = new Class87("Mua", new Class719(this));
                break;
            case 11:
            case 12:
            case 13:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(Class105.Field19.Field21, Field17[Field16] - 11);
                this.Field1(this.Field7);
                this.Field7(Field17[Field16] - 11);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(Class105.Field19.Field21, Field17[Field16] - 6);
                this.Field1(this.Field7);
                this.Field7(Field17[Field16] - 6);
                break;
            case 19:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field27();
                this.Field1(this.Field7);
                break;
            case 20:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(this.Field7);
                super.Field103 = new Class87("Mua", new Class781(this));
                this.Field49 = this.Field49 + " " + (Field16 + 1);
                break;
            case 21:
                ++this.Field42;
                this.Field43 += -6;
                this.Field1(this.Field7);
                this.Field1(126, 110, 3, 5, 20, 23);
                this.Field22();
                this.Field20();
                break;
            case 22:
            case 23:
                this.Field52 = true;
                this.Field42 += 9;
                this.Field43 = this.Field43;
                this.Field3 = 0;
                this.Field3(0);
                this.Field1(108, 90, 6, this.Field37, 18, 18);
                this.Field22();
                break;
            case 24:
                this.Field52 = true;
                this.Field1(126, 90, 7, this.Field37, 18, 18);
                this.Field1(this.Field19());
                super.Field103 = new Class87("Mua", new Class653(this));
                break;
            case 25:
                this.Field11 = false;
                ++this.Field42;
                this.Field43 += -4;
                this.Field1(this.Field7);
                this.Field1(126, 110, 3, 5, 20, 23);
                this.Field49 = "Đục lỗ";
                this.Field1(false, 2, 0);
                super.Field104 = new Class87("", new Class732(this));
                this.Field20();
                break;
            case 26:
                ++this.Field42;
                this.Field43 += -4;
                this.Field1(126, 108, 5, 1, 20, 18);
                this.Field72 = new short[][]{{(short) (this.Field1 / 2 - 44), 20}, {(short) (this.Field1 / 2 + 26), 20}, {(short) (this.Field1 / 2 - 10), 43}, {(short) (this.Field1 / 2 - 44), 65}, {(short) (this.Field1 / 2 + 26), 65}};
                this.Field1(true, 1, 0);
                this.Field20 = new Vector();
                super.Field104 = new Class87("Chọn", new Class731(this));
                super.Field103 = new Class87("Hợp", new Class648(this));
                break;
            case 27:
                this.Field52 = true;
                this.Field42 += -4;
                this.Field43 += -2;
                if (this.Field69 == null) {
                    this.Field69 = new Vector();
                }

                this.Field1(134, 95, 1, this.Field69.size(), 130, 15);
                super.Field103 = new Class87("Hủy", new Class576(this));
                break;
            case 28:
                ++this.Field42;
                this.Field43 += -4;
                if ((var1 = this.Field20.size() / 2) < 6) {
                    var1 = 6;
                }

                this.Field1(126, 108, var1, 3, 20, 18);
                super.Field104 = new Class87("Chọn", new Class574(this));
                super.Field103 = new Class87("Xong", new Class579(this));
                break;
            case 29:
                this.Field1(this.Field18());
                var1 = 0;

                for (var6 = 0; var6 < Class105.Field19.Field96.length; ++var6) {
                    if (Class105.Field19.Field96[var6].Field1 > 0) {
                        ++var1;
                    }
                }

                for (var6 = 0; var6 < Class105.Field19.Field97.length; ++var6) {
                    if (Class105.Field19.Field97[var6].Field1 > 0) {
                        ++var1;
                    }
                }

                if (var1 < 5) {
                    var1 = 5;
                }

                this.Field1(126, 100, 1, var1, 126, 20);
                this.Field11 = true;
                break;
            case 30:
                this.Field1(this.Field18());
                this.Field1(126, 100, 1, 6, 126, 20);
                this.Field11 = true;
                break;
            case 31:
                this.Field42 += 5;
                this.Field43 += -2;
                this.Field1(117, 104, 2, 5, 97, 21);
                break;
            case 32:
                ++this.Field42;
                this.Field43 += -4;
                this.Field1(126, 108, 5, 1, 20, 18);
                this.Field72 = new short[][]{{(short) (this.Field1 / 2 - 44), 0}, {(short) (this.Field1 / 2 + 26), 0}, {(short) (this.Field1 / 2 - 10), 20}, {(short) (this.Field1 / 2 - 44), 42}, {(short) (this.Field1 / 2 + 26), 42}};

                for (var6 = 0; var6 < var4.Field71.length; ++var6) {
                    var4.Field71[var6] = null;
                }

                var4.Field17();
                var4.Field20 = new Vector();
                var4.Field104 = new Class87("", new Class578(var4));
                var4.Field103 = new Class87("Hợp", new Class776(var4));
                break;
            case 127:
                this.Field52 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1((Vector) Class105.Field19.Field21, -1);
                this.Field1(this.Field7);
                boolean var5 = true;
                super.Field103 = new Class87("Mua", new Class669(this, -1));
        }

        if (var4.Field3 >= var4.Field37 * var4.Field4 - 1) {
            var4.Field3 = 0;
        }

    }

    private void Field1(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.Field1 = var1;
        this.Field2 = var2;
        this.Field4 = var3;
        this.Field37 = var4;
        this.Field5 = var5;
        this.Field6 = var6;
        this.Field16();
        Field56 = 0;
        Field13 = 0;
        Field12 = 0;
        Field14 = 0;
    }

    public final void Field3() {
        if (this.Field9) {
            if (Class105.Field5[2]) {
                if (this.Field41 >= 100) {
                    if ((Field60 -= 10) < 0) {
                        Field60 = 0;
                    }
                } else {
                    this.Field14();
                }

                Class105.Field3[2] = false;
            } else if (Class105.Field5[8]) {
                if (this.Field41 >= 100) {
                    if ((Field60 += 10) > Field64) {
                        Field60 = Field64;
                    }
                } else {
                    this.Field14();
                }

                Class105.Field3[8] = false;
            }

            Class105.Field2(2);
            Class105.Field2(8);
            if (Class105.Field6 && Class105.Field1(this.Field38, this.Field39, this.Field40 - 1, this.Field41 - 1 + this.Field70 * 15)) {
                if (!this.Field53) {
                    this.Field55 = Field61;
                    this.Field53 = true;
                }

                if ((Field60 = this.Field55 + (Class105.Field30 - Class105.Field11)) < 0) {
                    Field60 = 0;
                }

                if (Field60 > Field64) {
                    Field60 = Field64;
                }
            }

            if (Class105.Field7) {
                this.Field53 = false;
                Class105.Field7 = false;
                if (!Class105.Field1(this.Field38, this.Field39, this.Field40 - 1, this.Field41 - 1 + this.Field70 * 15) && Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                    this.Field14();
                }
            }
        }

        if (Class105.Field3[4] || Class105.Field3[6]) {
            this.Field14();
        }

        if (Class105.Field7 && Math.abs(Class105.Field11 - Class105.Field30) <= 10 && Math.abs(Class105.Field10 - Class105.Field31) <= 10) {
            if (Class105.Field1(this.Field35 - 5, this.Field36, 30, 35)) {
                this.Field11 = true;
                Class105.Field3[4] = true;
            }

            if (Class105.Field1(this.Field35 + 104, this.Field36, 30, 35)) {
                this.Field11 = true;
                Class105.Field3[6] = true;
            }
        }

        if (this.Field11) {
            if (Class105.Field2(8)) {
                this.Field11 = false;
                this.Field22();
                Class105.Field5[8] = false;
                if (Field17[Field16] == 1) {
                    this.Field3 = 0;
                }
            } else if (!Class105.Field2(4)) {
                Class105.Field2(6);
            }
        } else if (Field17[Field16] != 26 && Field12 == 0 && this.Field4 != 0 && this.Field3 / this.Field4 == 0 && Class105.Field2(2) && Field17[Field16] != 32) {
            this.Field11 = true;
            super.Field104 = null;
        }

        boolean var2 = false;
        if (Class105.Field1(this.Field35 + this.Field42, this.Field36 + this.Field43, this.Field1, this.Field2)) {
            Class326 var3;
            int var4;
            int var5;
            if (Field17[Field16] == 26) {
                var3 = this;
                if (Class105.Field7) {
                    var4 = this.Field72.length;

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (Class105.Field1(var3.Field35 + var3.Field42 + var3.Field72[var5][0] - 3, var3.Field36 + var3.Field43 + var3.Field72[var5][1] - 3, 23, 23)) {
                            Class105.Field7 = false;
                            var3.Field3 = var5;
                            if (var3.Field37 != 1) {
                                var3.Field37 = 1;
                                var3.Field4 = 5;
                                Field56 = 0;
                                Field13 = 0;
                                Field12 = 0;
                                Field14 = 0;
                            }
                        }
                    }
                }
            }

            int var6;
            if (Field17[Field16] == 32) {
                if (Class105.Field11 >= this.Field36 + this.Field43 + this.Field72[1][1] && Class105.Field11 <= this.Field72[1][1] + 65 + this.Field36 + this.Field43) {
                    var3 = this;
                    if (Class105.Field7) {
                        var4 = this.Field72.length;

                        for (var5 = 0; var5 < var4; ++var5) {
                            if (Class105.Field1(var3.Field35 + var3.Field42 + var3.Field72[var5][0] - 3, var3.Field36 + var3.Field43 + var3.Field72[var5][1] - 3, 23, 23)) {
                                Class105.Field7 = false;
                                var3.Field3 = var5;
                                if (var3.Field37 != 1) {
                                    var3.Field37 = 1;
                                    var3.Field4 = 5;
                                    Field56 = 0;
                                    Field13 = 0;
                                    Field12 = 0;
                                    Field14 = 0;
                                }

                                var3.Field25();
                            }
                        }
                    }
                } else if (Class105.Field1(this.Field42 + this.Field35, this.Field36 + this.Field43 + 4 * this.Field6 - 5, 120, 20)) {
                    Class105.Field7 = false;
                    var6 = (Class105.Field11 - (this.Field36 + this.Field43 + 4 * this.Field6 - 5)) / this.Field6;
                    var4 = (Class105.Field10 - (this.Field42 + this.Field35 + 5)) / 20;
                    this.Field3 = var6 * 6 + var4 + 6;
                    if (this.Field3 < 6) {
                        this.Field3 = 6;
                    } else if (this.Field3 > 11) {
                        this.Field3 = 11;
                    }

                    if (this.Field37 != 1) {
                        this.Field37 = 1;
                        this.Field4 = 6;
                        Field56 = 0;
                        Field13 = 0;
                        Field12 = 0;
                        Field14 = 0;
                    }

                    this.Field25();
                }
            }

            boolean var7 = false;
            if (Class105.Field6 && Field17[Field16] != 1 && !this.Field9) {
                if (!this.Field53) {
                    this.Field54 = Field12;
                    this.Field55 = Field14;
                    this.Field53 = true;
                    var6 = (Field56 + Class105.Field11 - (this.Field36 + this.Field43)) / this.Field6;
                    var4 = (Field13 + Class105.Field10 - (this.Field35 + this.Field42)) / this.Field5;
                    if (Field17[Field16] != 3) {
                        if (Field17[Field16] != 32) {
                            var2 = true;
                        }

                        this.Field22();
                        if (var6 == 5 && this.Field37 != 5 && Field17[Field16] == 26) {
                            this.Field3 = 3;
                            this.Field2(1, false);
                        } else if (var6 != 4 && (Field17[Field16] == 21 || Field17[Field16] == 25)) {
                            var4 = var4;
                            if (var4 > 0 && var4 < 5) {
                                this.Field3 = 1;
                            } else {
                                if (var4 == 5) {
                                    var4 = 2;
                                }

                                this.Field3 = var6 * this.Field4 + var4;
                            }
                        } else if (var6 == 5 && this.Field37 != 5 && Field17[Field16] == 32) {
                            this.Field3 = 3;
                            this.Field2(1, true);
                        } else {
                            if ((Field17[Field16] == 21 || Field17[Field16] == 25) && var6 == 4 && this.Field3 / this.Field4 != 4) {
                                this.Field3 = 10;
                                this.Field5(1);
                            }

                            if (Field17[Field16] != 32) {
                                this.Field3 = var6 * this.Field4 + var4;
                            }
                        }
                    }
                }

                this.Field85 = true;
                this.Field84 = true;
                Field56 = this.Field54 + (Class105.Field30 - Class105.Field11);
                if (Field17[Field16] != 32 || Class105.Field11 >= this.Field72[1][1] + 70 + this.Field36 + this.Field43) {
                    Field13 = this.Field55 + (Class105.Field31 - Class105.Field10);
                }

                if (Field56 < -10) {
                    Field56 = -10;
                }

                if (Field56 > Field59 + 10) {
                    Field56 = Field59 + 10;
                }

                if (Field13 < -10) {
                    Field13 = -10;
                }

                if (Field13 > Field15 + 10) {
                    Field13 = Field15 + 10;
                }
            }

            if (Class105.Field7) {
                this.Field27 = -20;
                this.Field11 = false;
                Class105.Field7 = false;
                this.Field53 = false;
                if (Field17[Field16] != 1) {
                    if (Field17[Field16] != 3) {
                        if (Field17[Field16] != 32) {
                            this.Field22();
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        } else if (Class105.Field11 >= this.Field72[1][1] + 90 + this.Field36 + this.Field43 && Math.abs(Class105.Field31 - Class105.Field10) <= 10) {
                            var6 = (Field56 + Class105.Field11 - (this.Field36 + this.Field43)) / this.Field6;
                            var4 = (Field13 + Class105.Field10 - (this.Field35 + this.Field42)) / this.Field5;
                            this.Field4 = this.Field21.size() + this.Field19.size();
                            if (this.Field4 < 6) {
                                this.Field4 = 6;
                            }

                            this.Field37 = 5;
                            if ((Field15 = this.Field4 * 20 - (this.Field1 - 8)) < 0) {
                                Field15 = 0;
                            }

                            this.Field3 = (var6 - 1) * this.Field4 + var4;
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        }
                    } else {
                        if ((var6 = (Field13 + Class105.Field10 - (this.Field35 + this.Field42)) / this.Field5) < 0) {
                            var6 = 0;
                        } else if (var6 > Class602.Field11[Class105.Field19.Field15.Field93].length - 1) {
                            var6 = Class602.Field11[Class105.Field19.Field15.Field93].length - 1;
                        }

                        if (this.Field3 != var6) {
                            this.Field3 = var6;
                        } else {
                            this.Field22();
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        }
                    }
                } else if (Class105.Field10 >= this.Field35 + 33 && Class105.Field10 <= this.Field35 + 53) {
                    this.Field3 = 4;
                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field22();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class105.Field10 > this.Field35 + 80 && Class105.Field10 <= this.Field35 + 96) {
                    this.Field3 = 1;
                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field22();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class105.Field10 > this.Field35 && Class105.Field10 <= this.Field35 + 30) {
                    var6 = (Class105.Field11 - (this.Field36 + this.Field43)) / this.Field6;
                    var4 = (Class105.Field10 - (this.Field35 + this.Field42)) / this.Field5;
                    this.Field3 = var6 * this.Field4 + var4;
                    if (this.Field3 > 12) {
                        this.Field3 = 12;
                    }

                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field22();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class105.Field10 > this.Field35 + 100 && Class105.Field10 <= this.Field35 + 120) {
                    var6 = (Class105.Field11 - (this.Field36 + this.Field43)) / this.Field6;
                    var4 = (Class105.Field10 - (this.Field35 + this.Field42)) / this.Field5;
                    this.Field3 = var6 * this.Field4 + var4 + 1;
                    if (this.Field3 > 14) {
                        this.Field3 = 14;
                    }

                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field22();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                }
            }
        } else {
            this.Field53 = false;
            if (Field17[Field16] == 3 && !this.Field84 && Class105.Field1(this.Field35 + this.Field42, this.Field36 + this.Field43 + 30, this.Field1, 65)) {
                if (Class105.Field6) {
                    if (!this.Field85) {
                        this.Field54 = Field12;
                        this.Field85 = true;
                        this.Field22();
                    }

                    if ((Field56 = this.Field54 + (Class105.Field30 - Class105.Field11)) < -10) {
                        Field56 = -10;
                    }

                    if (Field56 > Field59 + 10) {
                        Field56 = Field59 + 10;
                    }
                }

                if (Class105.Field7) {
                    Class105.Field7 = false;
                    this.Field85 = false;
                }
            }
        }

        if (!Class105.Field6) {
            this.Field84 = false;
        }

        byte[] var8;
        if (Class105.Field2(2)) {
            this.Field27 = -20;
            if (Field17[Field16] == 32) {
                this.Field2(-1, true);
            } else if (Field17[Field16] == 26) {
                this.Field2(-1, false);
            } else {
                if (Field17[Field16] == 8) {
                    this.Field4(-1);
                } else if (Field17[Field16] == 21 || Field17[Field16] == 25) {
                    this.Field5(-1);
                }

                if (Field17[Field16] != 1) {
                    if (this.Field3 / this.Field4 > 0) {
                        var2 = true;
                        this.Field3 -= this.Field4;
                        this.Field22();
                    }
                } else {
                    var8 = new byte[]{0, 4, 2, 0, 12, 2, 3, 2, 5, 6, 6, 8, 9, 9, 11};
                    this.Field3 = var8[this.Field3];
                    var2 = true;
                    this.Field22();
                }
            }
        } else if (Class105.Field2(4)) {
            if (Field17[Field16] == 32) {
                --this.Field3;
                var2 = true;
                if (this.Field3 < 0) {
                    this.Field3 = 0;
                }

                if (this.Field3 == 5) {
                    this.Field3 = 6;
                }

                if (this.Field3 > 12 && this.Field3 < this.Field3 % this.Field4) {
                    this.Field3 = this.Field37 * this.Field4 - 1;
                }
            } else if (Field17[Field16] != 1) {
                if (this.Field4 > 1 && this.Field3 % this.Field4 > 0) {
                    if (Field17[Field16] != 22 && Field17[Field16] != 23 || !this.Field3(-1)) {
                        var2 = true;
                    }

                    --this.Field3;
                    this.Field22();
                }
            } else {
                var8 = new byte[]{0, 4, 1, 3, 12, 1, 6, 6, 1, 9, 9, 1, 12, 12, 1};
                var2 = true;
                this.Field3 = var8[this.Field3];
                this.Field22();
            }
        } else if (Class105.Field2(6)) {
            if (Field17[Field16] == 32) {
                ++this.Field3;
                var2 = true;
                if (this.Field3 == 12) {
                    this.Field3 = 11;
                }

                if (this.Field3 == 5) {
                    this.Field3 = 4;
                }

                if (this.Field3 > 12 && this.Field3 > this.Field37 * this.Field4 - 1) {
                    this.Field3 = (this.Field37 - 1) * this.Field4;
                }
            } else if (Field17[Field16] != 1) {
                if (this.Field4 > 1 && this.Field3 < this.Field37 * this.Field4 - 1) {
                    if (Field17[Field16] != 22 && Field17[Field16] != 23 || !this.Field3(1)) {
                        var2 = true;
                    }

                    ++this.Field3;
                    this.Field22();
                }
            } else {
                var8 = new byte[]{4, 2, 2, 4, 1, 5, 4, 4, 8, 4, 9, 11, 4, 12, 14};
                var2 = true;
                this.Field3 = var8[this.Field3];
                this.Field22();
            }
        } else if (Class105.Field2(8)) {
            this.Field27 = -20;
            if (Field17[Field16] == 32) {
                this.Field2(1, true);
            } else if (Field17[Field16] == 26) {
                this.Field2(1, false);
            } else {
                if (Field17[Field16] == 8) {
                    this.Field4(1);
                }

                if (Field17[Field16] != 1) {
                    if (this.Field3 / this.Field4 < this.Field37 - 1) {
                        if (Field17[Field16] == 21 || Field17[Field16] == 25) {
                            this.Field5(1);
                        }

                        var2 = true;
                        this.Field3 += this.Field4;
                        this.Field22();
                    }
                } else {
                    var8 = new byte[]{3, 2, 5, 6, 1, 8, 9, 2, 11, 12, 14, 14, 4, 13, 14};
                    this.Field3 = var8[this.Field3];
                    var2 = true;
                    this.Field22();
                }
            }
        }

        if (this.Field7.size() == 0 && Field17[Field16] != 22 && Field17[Field16] != 23) {
            if (Class105.Field5[2]) {
                var2 = false;
                if ((Field56 -= 10) < 0) {
                    Field56 = 0;
                }
            } else if (Class105.Field5[8]) {
                var2 = false;
                if ((Field56 += 10) > Field59) {
                    Field56 = Field59;
                }
            }
        }

        if (var2) {
            if ((Field56 = this.Field3 / this.Field4 * this.Field6 - this.Field2 / 2) < 0) {
                Field56 = 0;
            }

            if (Field56 > Field59) {
                Field56 = Field59;
            }

            if (Field17[Field16] != 32) {
                Field13 = this.Field3 % this.Field4 * this.Field5 - this.Field1 / 2;
            } else if (this.Field3 > 4) {
                Field13 = this.Field3 % this.Field4 * this.Field5 - this.Field1 / 2;
            }

            if (Field13 < 0) {
                Field13 = 0;
            }

            if (Field13 > Field15) {
                Field13 = Field15;
            }
        }

        super.Field3();
    }

    private void Field17() {
        this.Field21 = new Vector();
        int var1 = this.Field23.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class537 var3;
            Class798 var4;
            if (((var4 = Class804.Field2((int) (var3 = (Class537) this.Field23.elementAt(var2)).Field18)).Field3 == 14 || var4.Field3 == 15 || var4.Field3 == 16 || var4.Field3 == 17 || var4.Field3 == 18) && var3.Field37 == 0) {
                this.Field21.addElement(var3);
            }
        }

    }

    private Vector Field18() {
        Vector var1 = new Vector();
        int var2 = 0;
        int var3 = Class105.Field19.Field96.length;

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            if (Class105.Field19.Field96[var4].Field1 > 0) {
                var1.addElement(new Class581(this, "", new Class583(this), var4, var2));
                ++var2;
            }
        }

        var4 = Class105.Field19.Field97.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            if (Class105.Field19.Field97[var5].Field1 > 0) {
                var1.addElement(new Class592(this, "", new Class589(this), var5, var2));
                ++var2;
            }
        }

        return var1;
    }

    public final void Field6() {
//        if (this.Field20.size() != 0) {
//            byte[][] var1 = new byte[null.size()][6];
//            int var2 = this.Field20.size();
//
//            for (int var3 = 0; var3 < var2; ++var3) {
//                Class274 var4 = (Class274) this.Field20.elementAt(var3);
//                int var5 = null.size();
//
//                for (int var6 = 0; var6 < var5; ++var6) {
//                    Class383 var7 = (Class383) null.elementAt(var6);
//                    int var8;
//                    if ((var8 = var4.Field1 - var7.Field2) <= 5) {
//                        var1[var6][var8] = (byte) var4.Field3;
//                        break;
//                    }
//                }
//            }
//
//            Class105.Field2("Bạn có muốn hoàn thành không ?", new Class591(this, var1));
//        }
    }

    public final void Field7() {
        boolean var1 = this.Field3 / this.Field4 < 2;
        Class274 var2 = null;
        if (var1) {
            if (this.Field3 < this.Field20.size()) {
                var2 = (Class274) this.Field20.elementAt(this.Field3);
            }
        } else if (this.Field3 % this.Field4 < this.Field19.size()) {
            var2 = (Class274) this.Field19.elementAt(this.Field3 % this.Field4);
        }

        if (var2 != null) {
            Class274 var3 = var2;
            int var4 = this.Field3 % this.Field4 * this.Field5 - Field14;
            int var5 = this.Field3 / this.Field4 * this.Field5;
            short var7 = var2.Field1;
            Vector var6;
            (var6 = new Vector()).addElement(new Class87(!var1 ? "Bỏ vào" : "Lấy ra", new Class643(this, var1, var3)));
            var6.addElement(new Class87("Thông tin", new Class642(this, var7, var4, var5)));
            Class105.Field21.Field1(var6, 2);
        }
    }

    public final void Field8() {
        int var3 = Field22.Field98.size();

        for (int var1 = 0; var1 < var3; ++var1) {
            Class804.Field2((int) ((Class537) Field22.Field98.elementAt(var1)).Field18);
        }

    }

    private Class87 Field1(Class274 var1, int var2, int var3) {
        return new Class87("Thông tin", new Class649(this, var1, var2, var3));
    }

    private Vector Field19() {
        Vector var1 = new Vector();
        int var2 = this.Field18.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            var1.addElement(new Class655(this, "", new Class656(this, var3), var3));
        }

        return var1;
    }

    private void Field1(boolean var1, int var2, int var3) {
        this.Field19.removeAllElements();
        Vector var8;
        int var4 = (var8 = var3 == 0 ? Class585.Field37 : Class585.Field38).size();

        for (int var5 = 0; var5 < var4; ++var5) {
            Class274 var6;
            Class743 var7 = Class804.Field1((var6 = (Class274) var8.elementAt(var5)).Field1);
            if (!var1) {
                if (var7.Field8 == var2) {
                    this.Field19.addElement(var6);
                }
            } else if (var7.Field9 == var2) {
                this.Field19.addElement(var6);
            }
        }

        if (this.Field19.size() == 0) {
            Class105.Field1("Không có nguyên liệu.", new Class659(this));
        }

    }

    private void Field20() {
        super.Field103 = new Class87(Field17[Field16] == 21 ? "Đập" : "Xong", new Class658(this));
    }

    public final void Field9() {
        int var1 = this.Field3 / this.Field4;
        int var2 = this.Field3 % this.Field4;
        Class743 var3 = null;
        int var4;
        Class537 var8;
        if (var1 == 4) {
            if (var2 < this.Field23.size()) {
                var8 = (Class537) this.Field23.elementAt(var2);
                this.Field1(var8, this.Field10, var2 * this.Field5, 4 * this.Field5);
            } else {
                var4 = this.Field19.size();

                for (int var5 = 0; var5 < var4; ++var5) {
                    if (var5 == var2 - this.Field23.size()) {
                        Class743 var9;
                        String var7 = Class537.Field1((var9 = Class804.Field1(((Class274) this.Field19.elementAt(var5)).Field1)).Field10, "0");
                        var7 = var7 + Class537.Field1(var9.Field11, "0");
                        this.Field1(var7, var2 * this.Field5 - Field14, 4 * this.Field5);
                    }
                }

            }
        } else if (var2 == 1) {
            var8 = (Class537) this.Field23.elementAt(this.Field82);
            this.Field1((String) var8.Field1(this.Field10), 50, 2 * this.Field5);
        } else {
            var4 = (var1 << 1) + var2 / 2;
            String var6 = Class537.Field1((var3 = Class804.Field1(((Class231) Class585.Field36.elementAt(var4)).Field2)).Field10, "0");
            var6 = var6 + Class537.Field1(var3.Field11, "0");
            this.Field1(var6, var2 * 50, var1 * this.Field5);
        }
    }

    private boolean Field21() {
        byte[][] var1;
        int var2 = (var1 = new byte[][]{{4, 5}, {4, 5}, {4, 5, 6, 7}, {4, 5}, {4, 5}})[Class105.Field19.Field15.Field93].length;

        for (int var3 = 0; var3 < var2; ++var3) {
            if (this.Field3 == var1[Class105.Field19.Field15.Field93][var3]) {
                return true;
            }
        }

        return false;
    }

    public final void Field1(int var1, boolean var2) {
        Vector var3 = new Vector();

        for (int var4 = 0; var4 < 3; ++var4) {
            var3.addElement(new Class87("Phím số " + (1 + (var4 << 1)), new Class630(this, var4, var1, var2)));
        }

        Class105.Field21.Field1(var3, 2);
    }

    public final void Field1(Class585 var1, Class672 var2, int var3, boolean var4) {
        Vector var5 = new Vector();
        if (var4) {
            var5.addElement(new Class87("Cho mình", new Class627(this, var1, var3)));
            var5.addElement(new Class87("Cho bạn", new Class635(this, var2, var3)));
        } else {
            Class263.Field1().Field1((short) var1.Field189, (byte) 0, (byte) ((byte) var3), (short) 0);
        }

        Class105.Field21.Field1(var5, 2);
    }

    private void Field22() {
        this.Field83 = null;
        int var3;
        switch (Field17[Field16]) {
            case 1:
                super.Field104 = new Class87("", new Class634(this));
                return;
            case 2:
                super.Field104 = new Class87("", new Class636(this));
                return;
            case 3:
                if ((Field59 = (Class105.Field19.Field15.Field10(this.Field3).length + 1) * 12 - 72) < 0) {
                    Field59 = 0;
                }

                super.Field104 = new Class87("", new Class692(this));
                return;
            case 4:
                this.Field83 = new String[17];
                Class585 var4 = Class105.Field19.Field15;
                this.Field83[0] = "Nhân vật: " + var4.Field65;
                this.Field83[1] = "Level: " + var4.Field22 + "+" + var4.Field44();
                this.Field83[2] = "HP: " + var4.Field4 + "/" + var4.Field5;
                this.Field83[3] = "MP: " + var4.Field130 + "/" + var4.Field129;
                this.Field83[4] = "Tấn công: " + var4.Field34();
                this.Field83[5] = "Thủ vật lý: " + var4.Field20;
                this.Field83[6] = "Thủ ma pháp: " + var4.Field21;
                this.Field83[7] = "Chính xác: " + var4.Field13;
                this.Field83[8] = "Né tránh: " + var4.Field14;
                this.Field83[9] = "Bạo kích: " + (var4.Field154 > 0 ? var4.Field154 / 10 + "." + var4.Field154 % 10 : "0") + "%";
                this.Field83[10] = "Chí mạng: " + var4.Field15;
                this.Field83[11] = "Cống hiến: " + var4.Field183 + " điểm.";
                this.Field83[12] = "Liên trảm: " + var4.Field156 + " điểm.";
                this.Field83[13] = "Công trạng: " + var4.Field155 + " điểm.";
                this.Field83[14] = "Điểm hoạt động: " + var4.Field157 + " điểm.";
                this.Field83[15] = "Điểm đấu trường: " + var4.Field184 + " điểm.";
                this.Field83[16] = var4.Field185.equals("") ? "Độc thân" : var4.Field185;
                this.Field37 = this.Field83.length + 1;
                this.Field16();
                return;
            case 5:
                super.Field104 = new Class87("", new Class640(this));
                return;
            case 6:
                super.Field104 = new Class87("", new Class694(this));
                return;
            case 7:
                this.Field51 = new Vector();
                Vector var1 = (Vector) Class63.Field22.elementAt(Class105.Field19.Field15.Field93);
                byte var2 = Class359.Field97[((Class185) var1.elementAt(this.Field3)).Field3];
                this.Field51.addElement("`" + ((Class185) var1.elementAt(this.Field3)).Field1);
                if (var2 == -1) {
                    this.Field51.addElement("`Phí: " + ((Class185) var1.elementAt(this.Field3)).Field4 + " xu");
                }

                String[] var5 = Class21.Field8.Field1(((Class185) var1.elementAt(this.Field3)).Field2, 130);

                for (var3 = 0; var3 < var5.length; ++var3) {
                    this.Field51.addElement(var5[var3]);
                }

                this.Field1(114, 30, var1.size(), 1, 23, 20);
                if ((Field59 = this.Field51.size() * 12 - 72) < 0) {
                    Field59 = 0;
                }

                super.Field104 = new Class87("", new Class693(this, var1));
                return;
            case 8:
                return;
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 24:
            default:
                byte var10001 = Field17[Field16];
                var3 = this.Field3;
                super.Field104 = null;
                if (!this.Field11 && var3 < this.Field7.size()) {
                    super.Field104 = (Class87) this.Field7.elementAt(var3);
                }

                return;
            case 21:
            case 25:
                super.Field104 = new Class87("", new Class695(this));
                return;
            case 22:
            case 23:
                super.Field104 = new Class87("", new Class657(this));
                return;
            case 26:
                return;
            case 27:
                return;
            case 28:
                this.Field23();
                return;
            case 29:
                return;
            case 30:
                return;
            case 31:
                super.Field104 = new Class87("", new Class699(this));
                return;
            case 32:
        }
    }

    private void Field23() {
        int var1 = this.Field3 % this.Field4;
        if (this.Field3 / this.Field4 == 1) {
            int var2;
            if ((var2 = this.Field20.size() / 2) < 6) {
                var2 = 6;
            }

            this.Field4 = var2;
            if (this.Field4 < 6) {
                this.Field4 = 6;
            }

            if (var1 >= this.Field4) {
                var1 = this.Field4 - 1;
            }

            this.Field3 = this.Field4 + var1;
        } else if (this.Field3 / this.Field4 == 2) {
            this.Field4 = this.Field19.size();
            if (this.Field4 < 6) {
                this.Field4 = 6;
            }

            if (var1 >= this.Field4) {
                var1 = this.Field4 - 1;
            }

            this.Field3 = 2 * this.Field4 + var1;
        }

        this.Field16();
        if (Field14 > Field15) {
            Field14 = Field13 = Field15;
        }

    }

    public final void Field10() {
        if (this.Field9) {
            this.Field14();
        } else {
            Vector var1;
            int var5;
            int var10;
            int var11;
            if (this.Field3 / this.Field4 + 1 != this.Field37) {
                var1 = new Vector();
                Object var9 = null;
                if ((var10 = this.Field3 % this.Field4) <= 2) {
                    var5 = this.Field3 / this.Field4 * 3 + var10;
                    Vector var12 = Class105.Field19.Field15.Field40;
                    if (var5 < var12.size()) {
                        Object var7 = var9 = var12.elementAt(var5);
                        var1.addElement(new Class87("Hủy", new Class806(this, var12, var5, var7)));
                    }
                } else if ((var5 = this.Field3 / this.Field4 * 3 + (var10 - 3)) < Class105.Field19.Field15.Field41.size()) {
                    var9 = Class105.Field19.Field15.Field41.elementAt(var5);
                }

                if (var9 != null) {
                    var11 = var10 * 18;
                    var5 = this.Field3 / this.Field4 * 18;
                    var1.addElement(new Class87("Thông tin", new Class808(this, var9, var11, var5)));
                }

                Class105.Field21.Field1(var1, 3);
            } else {
                var1 = new Vector();
                if (this.Field3 % this.Field4 < this.Field23.size()) {
                    boolean var2 = false;
                    Class537 var3 = (Class537) this.Field23.elementAt(this.Field3 % this.Field4);
                    Vector var4;
                    var5 = (var4 = Class105.Field19.Field15.Field40).size();

                    for (int var6 = 0; var6 < var5; ++var6) {
                        if (var4.elementAt(var6) instanceof Class537 && ((Class537) var4.elementAt(var6)).Field9 == var3.Field9) {
                            var2 = true;
                            break;
                        }
                    }

                    if (!var2) {
                        var1.addElement(new Class87("Giao dịch", new Class698(this, var3)));
                    }

                    var1.addElement(new Class87("Thông tin", new Class801(this, var3)));
                } else {
                    int var8 = this.Field3 % this.Field4 - this.Field23.size();
                    var10 = 0;
                    var11 = Class585.Field42.length;

                    for (var5 = 0; var5 < var11; ++var5) {
                        if (Class585.Field42[var5].Field1 - Class585.Field42[var5].Field2 > 0 && Class585.Field42[var5].Field6) {
                            if (var10 == var8) {
                                var1.addElement(new Class87("Giao dịch", new Class799(this, var5)));
                                var1.addElement(new Class87("Thông tin", new Class807(this, var5, var10)));
                                break;
                            }

                            ++var10;
                        }
                    }
                }

                Class105.Field21.Field1(var1, 3);
            }
        }
    }

    public final void Field11() {
    }

    public final void Field12() {
        if (Class359.Field127.size() > 0) {
            Class585 var1 = Class105.Field19.Field15;
            Vector var2 = new Vector();
            if (var1.Field189 == var1.Field192) {
                var2.addElement(new Class87("Đuổi", new Class810(this)));
                var2.addElement(new Class87("Giải tán", new Class809(this)));
            } else {
                var2.addElement(new Class87("Rời nhóm", new Class812(this)));
            }

            Class105.Field21.Field1(var2, 2);
        }

    }

    private void Field2(int var1, boolean var2) {
        if (var1 == -1) {
            if (this.Field37 != 1) {
                this.Field37 = 1;
                this.Field3 = 6;
                this.Field4 = 5;
                Field56 = 0;
                Field13 = 0;
                Field12 = 0;
                Field14 = 0;
                return;
            }

            if (this.Field3 == 2) {
                this.Field3 = 0;
                return;
            }

            if (this.Field3 == 3) {
                this.Field3 = 2;
                return;
            }

            if (this.Field3 == 4) {
                this.Field3 = 1;
                return;
            }

            if (this.Field3 >= 6 && this.Field3 < 12) {
                this.Field3 = 4;
                return;
            }
        } else {
            if (this.Field3 == 3 || this.Field3 == 4) {
                if (!var2) {
                    this.Field4 = this.Field19.size();
                    if (this.Field4 < 6) {
                        this.Field4 = 6;
                    }

                    this.Field37 = 5;
                    this.Field3 = (this.Field37 - 1) * this.Field4;
                    if ((Field15 = this.Field4 * 20 - (this.Field1 - 8)) < 0) {
                        Field15 = 0;
                    }

                    Field56 = 0;
                    Field13 = 0;
                    Field12 = 0;
                    Field14 = 0;
                    return;
                } else {
                    this.Field3 = 6;
                    this.Field4 = 6;
                    Field56 = 0;
                    Field13 = 0;
                    Field12 = 0;
                    Field14 = 0;
                    return;
                }
            }

            if (this.Field3 == 2) {
                this.Field3 = 3;
                return;
            }

            if (this.Field3 == 0) {
                this.Field3 = 2;
                return;
            }

            if (this.Field3 == 1) {
                this.Field3 = 4;
                return;
            }

            if (this.Field3 >= 6 && this.Field3 < 12) {
                this.Field2(-1);
            }
        }

    }

    private boolean Field3(int var1) {
        int var2 = Field12;
        boolean var3 = false;
        int var4;
        if (Field17[Field16] == 22) {
            var4 = Class359.Field128.size();
        } else {
            var4 = this.Field18.size();
        }

        if (this.Field23.size() + Class585.Field37.size() < var4) {
            this.Field37 = var4 / 3 + 1;
        } else {
            this.Field37 = (this.Field23.size() + Class585.Field37.size()) / 3 + 1;
        }

        if (this.Field37 < 5) {
            this.Field37 = 5;
        }

        if ((this.Field3 % this.Field4 != 2 || var1 != 1) && (this.Field3 % this.Field4 != 3 || var1 != -1)) {
            if ((Field59 = this.Field37 * this.Field5 - this.Field2) < 0) {
                Field59 = 0;
            }

            return false;
        } else {
            if (var1 == -1) {
                Field59 = ((this.Field23.size() + Class585.Field37.size()) / 3 + 1) * this.Field5 - this.Field2;
            } else {
                Field59 = (var4 / 3 + 1) * this.Field5 - this.Field2;
            }

            if (Field59 < 0) {
                Field59 = 0;
            }

            var1 = this.Field3 / this.Field4 - Field12 / this.Field5;
            Field12 = Field56 = this.Field86;
            this.Field3 = (Field12 / this.Field5 + var1) * this.Field4 + this.Field3 % this.Field4;
            this.Field86 = var2;
            return true;
        }
    }

    private void Field4(int var1) {
        int var2;
        if ((var2 = this.Field3 % this.Field4 - Field14 / 18) < 0) {
            var2 = 0;
        }

        int var3 = this.Field3 / this.Field4;
        if (this.Field3 / this.Field4 + 2 == this.Field37 && var1 == 1) {
            var1 = 0;

            for (int var4 = 0; var4 < Class585.Field42.length; ++var4) {
                if (Class585.Field42[var4].Field1 - Class585.Field42[var4].Field2 > 0 && Class585.Field42[var4].Field6) {
                    ++var1;
                }
            }

            this.Field4 = this.Field23.size() + var1;
            if (this.Field4 < 6) {
                this.Field4 = 6;
            }

            Field15 = this.Field4 * 18 - this.Field1;
        } else {
            this.Field4 = 6;
            Field15 = 0;
        }

        if (var2 >= this.Field4) {
            var2 = this.Field4 - 1;
        }

        this.Field3 = var3 * this.Field4 + var2;
        Field56 = 0;
        Field13 = 0;
        Field12 = 0;
        Field14 = 0;
    }

    private void Field5(int var1) {
        int var2;
        if ((var2 = this.Field3 % this.Field4 - Field14 / 20) < 0) {
            var2 = 0;
        }

        int var3;
        if ((var3 = this.Field3 / this.Field4) + 2 == 5 && var1 == 1) {
            this.Field4 = this.Field23.size() + this.Field19.size();
            if (this.Field4 < 6) {
                this.Field4 = 6;
            }

            if ((Field15 = this.Field4 * 20 - this.Field1 + 6) < 0) {
                Field15 = 0;
            }
        } else {
            this.Field4 = 3;
            Field15 = 0;
        }

        if (var2 >= this.Field4) {
            var2 = this.Field4 - 1;
        }

        this.Field3 = var3 * this.Field4 + var2;
        Field56 = 0;
        Field13 = 0;
        Field12 = 0;
        Field14 = 0;
    }

    public final void Field4() {
        Class105.Field19.Field4();
        if (Field12 != Field56) {
            Field58 = Field56 - Field12 << 2;
            Field57 += Field58;
            Field12 += Field57 >> 4;
            Field57 &= 15;
        }

        if (Field14 != Field13) {
            Field66 = Field13 - Field14 << 2;
            Field65 += Field66;
            Field14 += Field65 >> 4;
            Field65 &= 15;
        }

        if (Math.abs(Field56 - Field12) < 15 && Field12 < 0) {
            Field56 = 0;
        }

        if (Math.abs(Field56 - Field12) < 10 && Field12 > Field59) {
            Field56 = Field59;
        }

        if (0 != Field67 && Class802.Field4(Field67 += (0 - Field67) / 2) <= 1) {
            Field67 = 0;
        }

        if (Field61 != Field60) {
            Field63 = Field60 - Field61 << 2;
            Field62 += Field63;
            Field61 += Field62 >> 4;
            Field62 &= 15;
        }

        if (Field17[Field16] == 31 && Field22 != null && Field22.Field103 != null && Class105.Field12 % Field22.Field95 == 0) {
            ++this.Field46;
            if (this.Field46 > this.Field45[Field22.Field120 == 3 ? 0 : 1].length - 1) {
                this.Field46 = 0;
            }
        }

        if (Class105.Field21.Field1) {
            this.Field14();
        }

        if (Field17[Field16] == 0 && this.Field7 != null && this.Field7.size() > 0) {
            this.Field78 = Class105.Field19.Field15.Field35 - 1;
            if (this.Field78 <= 0) {
                this.Field78 = 0;
            }

            this.Field79 = this.Field7.size() % 42;
            this.Field80 = this.Field7.size();
        }

    }

    public final void Field1(Graphics var1) {
        Class105.Field19.Field1(var1);
        var1.translate(this.Field35, this.Field36);
        Class804.Field1(var1, -10, -10);
        if (this.Field52) {
            short var2 = 139;
            if (Class105.Field14 < 196) {
                var2 = 126;
            }

            Class21.Field9[0].Field1(var1, Class105.Field19.Field15.Field122 + "$", 122, var2, 1);
            Class21.Field9[1].Field1(var1, Class105.Field19.Field15.Field100 + "l", 5, var2, 0);
            if (Class105.Field19.Field15.Field101 > -1) {
                if (Class105.Field14 > 190) {
                    Class21.Field9[1].Field1(var1, Class105.Field19.Field15.Field101 + "lk", 63, 130, 2);
                } else {
                    Class21.Field9[1].Field1(var1, Class105.Field19.Field15.Field101 + "lk", 5, 28, 0);
                }
            }
        }

        var1.drawImage(Class804.Field30, 6 - Field74, 18, 3);
        var1.drawRegion(Class804.Field30, 0, 0, 11, 7, 2, 122 + Field73, 19, 3);
        if (Field74 > 0) {
            --Field74;
        }

        if (Field73 > 0) {
            --Field73;
        }

        var1.setColor(7961465);
        var1.fillRect(21, 11, 88, 16);
        var1.fillRect(20, 12, 90, 14);
        var1.setColor(this.Field11 ? 30611 : 2368548);
        var1.fillRect(21, 12, 88, 14);
        var1.setClip(21, 11, 88, 16);
        var1.translate(-Field67, 0);
        int var9;
        if ((var9 = Class21.Field10[0].Field1(this.Field49)) > 88) {
            this.Field30 -= this.Field31;
            if (Class802.Field4(this.Field30) > (var9 - 88) / 2 + 5) {
                this.Field31 = -this.Field31;
            }
        }

        Class21.Field10[0].Field1(var1, Field32, 66 + this.Field30, 12, 2);
        if (Field67 != 0) {
            Class21.Field10[0].Field1(var1, this.Field50, 66 + 100 * Field68, 12, 2);
        }

        var1.translate(Field67, 0);
        var1.translate(this.Field42, this.Field43);
        var1.setClip(-100, -100, 300, 300);
        var1.setClip(0, 0, this.Field4 * this.Field5 + 1, 5 * this.Field6 + 1);
        var1.translate(0, -Field12);
        if ((var9 = Field12 / this.Field6) < 0) {
            var9 = 0;
        }

        int var3 = var9 + this.Field1 / this.Field6;
        if (Field17[Field16] == 0 && var3 > 42) {
            var3 = 42;
        }

        for (var9 = var9; var9 < var3; ++var9) {
            for (int var4 = 0; var4 < this.Field4; ++var4) {
                int var10002 = var4 * this.Field5;
                int var8 = var9 * this.Field6;
                int var7 = var10002;
                var1.setColor(6513507);
                var1.drawRect(var7, var8, this.Field5, this.Field6);
                var1.setColor(8684162);
                var1.drawRect(var7 + 1, var8 + 1, this.Field5 - 2, this.Field6 - 2);
            }
        }

        if (!this.Field11) {
            var1.setColor(10595790);
            var1.fillRect(this.Field3 % this.Field4 * this.Field5 + 1, this.Field3 / this.Field4 * this.Field6 + 1, this.Field5 - 2, this.Field6 - 2);
        }

        this.Field3(var1);
        if (this.Field9) {
            Class105.Field1(var1);
            this.Field2(var1);
        }

        super.Field1(var1);
    }

    private int Field24() {
        int var1 = -1;

        for (int var2 = 0; var2 < this.Field71.length; ++var2) {
            if (this.Field71[var2] == null) {
                ++var1;
            }
        }

        return var1;
    }

    public final void Field2(int var1) {
        this.Field4 = this.Field21.size() + this.Field19.size();
        if (this.Field4 < 6) {
            this.Field4 = 6;
        }

        this.Field37 = 5;
        if (var1 == -1) {
            this.Field3 = (this.Field37 - 1) * this.Field4;
        } else {
            this.Field3 -= this.Field37;
            if (this.Field3 > this.Field37 * this.Field4 - 1) {
                this.Field3 = this.Field37 * this.Field4 - 1;
            }

            if (this.Field3 < (this.Field37 - 1) * this.Field4) {
                this.Field3 = (this.Field37 - 1) * this.Field4;
            }

            if ((Field13 = this.Field3 % this.Field4 * this.Field5 - this.Field1 / 2) < 0) {
                Field13 = 0;
            }

            if (Field13 > Field15) {
                Field13 = Field15;
            }

            Field14 = Field13;
        }

        if ((Field15 = this.Field4 * 20 - (this.Field1 - 8)) < 0) {
            Field15 = 0;
        }

        if (var1 == -1) {
            Field56 = 0;
            Field13 = 0;
            Field12 = 0;
            Field14 = 0;
        }

    }

    public final void Field13() {
        Class537 var1 = (Class537) this.Field21.elementAt(this.Field3 % this.Field4);
        this.Field1(var1, false, this.Field3 % this.Field4 * 20 + 4, 86);
    }

    private void Field25() {
        if (!this.Field9) {
            Vector var1 = new Vector();
            Class274 var2;
            Class537 var3;
            if (this.Field37 != 1) {
                if (this.Field3 % this.Field4 >= 0 && this.Field3 % this.Field4 < this.Field21.size()) {
                    var3 = (Class537) this.Field21.elementAt(this.Field3 % this.Field4);
                    if (this.Field24() > -1) {
                        var1.addElement(new Class87("Bỏ vào", new Class811(this, var3)));
                    }

                    var1.addElement(new Class87("Thông tin ", new Class813(this)));
                } else if ((this.Field3 - this.Field21.size()) % this.Field4 >= 0 && (this.Field3 - this.Field21.size()) % this.Field4 < this.Field19.size()) {
                    var2 = (Class274) this.Field19.elementAt((this.Field3 - this.Field21.size()) % this.Field4);
                    var1.addElement(new Class87("Bỏ vào", new Class774(this, var2)));
                    var1.addElement(this.Field1((Class274) var2, this.Field3 % this.Field4 * 20 + 4, 86));
                }
            } else if (this.Field3 > 5) {
                if (this.Field3 % 6 >= 0 && this.Field3 % 6 < this.Field20.size() && (var2 = (Class274) this.Field20.elementAt(this.Field3 % 6)) != null) {
                    var1.addElement(new Class87("Lấy ra", new Class772(this, var2)));
                }
            } else if (this.Field3 >= 0 && this.Field3 < this.Field71.length && (var3 = this.Field71[this.Field3]) != null) {
                var1.addElement(new Class87("Lấy ra", new Class778(this, var3)));
            }

            Class105.Field21.Field1(var1, 2);
        }
    }

    final int Field1(boolean var1) {
        int var2 = 0;
        int var5;
        if (var1) {
            for (var5 = 0; var5 < this.Field71.length; ++var5) {
                if (this.Field71[var5] != null) {
                    ++var2;
                }
            }
        } else {
            var5 = this.Field20.size();

            for (int var3 = 0; var3 < var5; ++var3) {
                Class274 var4 = (Class274) this.Field20.elementAt(var3);
                var2 += var4.Field3;
            }
        }

        return var2;
    }

    private static String Field6(int var0) {
        String var1 = "";
        if (var0 == 0 && Class63.Field98 != null) {
            var1 = Class63.Field98.Field1().replace('Â', 'â').replace('Ô', 'ô');
        }

        if (Class63.Field99 != null && var0 == 1) {
            try {
                var1 = Class63.Field99.Field1().replace('Â', 'â').replace('Ô', 'ô');
            } catch (Exception var4) {
            }
        }

        if (Class63.Field100 != null && var0 == 2) {
            try {
                var1 = Class63.Field100.Field1().replace('Â', 'â').replace('Ô', 'ô');
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }

        return var1;
    }

    private void Field2(Graphics var1) {
        var1.setColor(25695);
        var1.fillRect(this.Field38, this.Field39, this.Field40, this.Field41 + this.Field70 * 15);
        var1.setColor(16774720);
        var1.drawRect(this.Field38, this.Field39, this.Field40 - 1, this.Field41 - 1 + this.Field70 * 15);
        int var2 = 0;
        var1.setClip(this.Field38, this.Field39, this.Field40, this.Field41 + this.Field70 * 15 - 2);
        var1.translate(0, -Field61);

        for (int var3 = 0; var3 < this.Field48.length + this.Field70; ++var3) {
            if (var3 == 1 && this.Field75 != null && this.Field75.length > 0) {
                for (int var4 = 0; var4 < this.Field75.length; ++var4) {
                    var1.drawImage(Class804.Field39, this.Field38 + 12 + var4 * 20, this.Field39 + 12 + var2, 3);
                    if (this.Field75[var4] != -1) {
                        Class804.Field1(var1, this.Field75[var4], this.Field38 + 12 + var4 * 20, this.Field39 + 12 + var2);
                    }
                }

                var2 += 18;
            }

            if (!this.Field48[var3].equals("")) {
                byte var7 = (byte) (this.Field48[var3].charAt(0) - 48);
                byte var5 = 1;
                char var6;
                if ((var6 = this.Field48[var3].charAt(0)) < '0' || var6 > '9') {
                    var7 = 0;
                    var5 = 0;
                }

                Class21.Field10[var7 >= 6 ? 0 : var7].Field1(var1, this.Field48[var3].substring(var5), this.Field38 + 4, this.Field39 + 4 + var2, 0);
                var2 += 15;
            }
        }

        if (this.Field70 < 0) {
            ++this.Field70;
        }

    }

    private void Field3(Graphics var1) {
        try {
            int var2;
            if ((var2 = Field12 / this.Field6 * this.Field4) < 0) {
                var2 = 0;
            }

            int var3;
            if ((var3 = var2 + this.Field4 * this.Field37) > 42) {
                var3 = 42;
            }

            if (42 > this.Field80) {
                var3 = this.Field79;
            }

            for (var2 = var2; var2 < var3; ++var2) {
                Class87 var4;
                if (var2 < this.Field7.size() && (var4 = (Class87) this.Field7.elementAt(var2)) != null) {
                    var4.Field1(var1, var2 % this.Field4 * this.Field5 + this.Field5 / 2, var2 / this.Field4 * this.Field6 + this.Field6 / 2);
                }
            }

        } catch (Exception var5) {
        }
    }

    public final void Field14() {
        this.Field9 = false;
        this.Field75 = null;
    }

    private void Field1(String var1, int var2, int var3) {
        if (!this.Field9) {
            this.Field9 = true;
            var1 = var1.replace('Â', 'â');
            this.Field40 = 125;
            this.Field38 = var2 + this.Field35 + this.Field42 - this.Field40 / 2 + 9;
            this.Field39 = var3 + this.Field36 + this.Field43 + 18;
            this.Field48 = Class21.Field2.Field1(var1, this.Field40 - 10);
            this.Field41 = this.Field48.length * 15 + 8 + (this.Field75 != null ? 16 : 0);
            this.Field38 -= Field14;
            if (1 + this.Field38 + this.Field40 > Class105.Field13) {
                this.Field38 = Class105.Field13 - this.Field40 - 1;
            } else if (1 + this.Field38 < 0) {
                this.Field38 = -1;
            }

            this.Field39 -= Field12;
            if (this.Field70 == 0) {
                this.Field70 = -(this.Field48.length - 1);
            }

            Field60 = 0;
            Field61 = 0;
            Field64 = 0;
            if (this.Field41 > 100) {
                if ((Field64 = this.Field41 - 100) < 0) {
                    Field64 = 0;
                }

                this.Field41 = 100;
            }

            if (this.Field39 + this.Field41 > Class105.Field14 - 20) {
                this.Field39 = Class105.Field14 - 20 - this.Field41;
            }

        } else {
            this.Field70 = 0;
            this.Field14();
        }
    }

    private Vector Field26() {
        Vector var1 = new Vector();
        int var2 = 0;
        int var3 = this.Field23.size();

        for (int var4 = 0; var4 < var3; ++var4) {
            Class537 var6 = (Class537) this.Field23.elementAt(var4);
            var1.addElement(new Class783(this, "", new Class785(this, var6, var2), var6));
            ++var2;
        }

        return var1;
    }

    public final void Field1(short var1, int var2, int var3) {
        Class743 var4;
        String var5 = Class537.Field1((var4 = Class804.Field1(var1)).Field10, "0");
        var5 = var5 + Class537.Field1(var4.Field11, "0");
        if (this.Field10) {
            var5 = var5 + Class537.Field1("Giá bán lại: " + var4.Field18 / 5, "0");
        }

        this.Field1(var5, var2, var3);
    }

    public final void Field1(Class231 var1, int var2, int var3) {
        Class743 var5;
        String var4 = Class537.Field1((var5 = Class804.Field1(var1.Field2)).Field10, "0");
        var4 = var4 + Class537.Field1(var5.Field11, "0");
        if (this.Field10) {
            var4 = var4 + Class537.Field1("Giá bán : " + var1.Field3, "0");
        }

        this.Field1(var4, var2, var3);
    }

    private void Field1(Class537 var1, boolean var2, int var3, int var4) {
        this.Field75 = null;
        if (var1.Field36 > 0) {
            this.Field75 = new byte[var1.Field36];

            for (int var5 = 0; var5 < var1.Field36; ++var5) {
                this.Field75[var5] = -1;
            }

            byte var8 = 0;

            label36:
            for (int var6 = 0; var6 < var1.Field34.size(); ++var6) {
                Class818 var7;
                if ((var7 = (Class818) var1.Field34.elementAt(var6)).Field1(false) == 3) {
                    var6 = 0;

                    while (true) {
                        if (var6 >= var1.Field35) {
                            break label36;
                        }

                        this.Field75[var8++] = Class804.Field56[var7.Field3() - 10];
                        ++var6;
                    }
                }
            }
        }

        this.Field1(var1.Field1(var2), var3, var4);
        if (!var1.Field32) {
            var1.Field32 = true;
            Class263.Field1().Field1(var1.Field9, Field22 == null ? Class105.Field19.Field15.Field189 : Field22.Field189);
        }

    }

    private void Field1(Vector var1, int var2) {
        this.Field7.removeAllElements();
        int var3 = 0;
        int var7 = var1.size();

        for (int var4 = 0; var4 < var7; ++var4) {
            Class537 var5;
            if (Class804.Field2((int) (var5 = (Class537) Class105.Field19.Field21.elementAt(var4)).Field18).Field3 == var2 || var2 == -1) {
                int var6 = var3++;
                this.Field7.addElement(new Class668(this, "", new Class714(this, var5, var6), var5));
            }
        }

    }

    private void Field7(int var1) {
        super.Field103 = new Class87("Mua", new Class721(this, var1));
    }

    private void Field2(Vector var1) {
        this.Field7.removeAllElements();
        int var2 = var1.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class743 var4 = (Class743) var1.elementAt(var3);
            if (var4.Field17) {
                this.Field7.addElement(new Class723(this, "", new Class728(this, var4, var3), var4));
            }
        }

    }

    private void Field27() {
        this.Field7.removeAllElements();
        int var1 = Class105.Field19.Field21.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class537 var3 = (Class537) Class105.Field19.Field21.elementAt(var2);
            this.Field7.addElement(new Class730(this, "", new Class724(this, var3), var3));
        }

    }

    public final void Field15() {
        if (this.Field8.size() > 0) {
            if (Field17[Field16] == 10) {
                Class263.Field1().Field1(this.Field8);
            } else if (Field17[Field16] == 19) {
                Class263.Field1().Field3(this.Field8);
            } else {
                Class263.Field1().Field2(this.Field8);
            }

            this.Field8.removeAllElements();
        }

        if (Field17[Field16] != 21 && Field17[Field16] != 25) {
            if (Field17[Field16] == 22) {
                Class105.Field19.Field28.Field9();
            } else {
                if (Field17[Field16] == 8) {
                    Class105.Field19.Field28.Field10((int) Class105.Field19.Field15.Field189);
                    Class105.Field19.Field15.Field139 = false;
                }

            }
        } else {
            if (Field17[Field16] == 21) {
                Class263.Field1().Field6((int) -1);
            } else {
                Class263.Field1().Field19(-1);
            }

            int var1 = Class585.Field36.size();

            for (int var2 = 0; var2 < var1; ++var2) {
                Class274 var3;
                if ((var3 = Class274.Field1(((Class231) Class585.Field36.elementAt(var2)).Field2)) != null) {
                    ++var3.Field3;
                    break;
                }
            }

            Class585.Field36.removeAllElements();
            Class105.Field19.Field15.Field142 = null;
            this.Field82 = -1;
        }
    }

    private void Field28() {
        this.Field69 = new Vector();
        String var1 = Field6(0);
        String var2 = Field6(1);
        String var3 = Field6(2);
        int var4;
        String[] var5;
        if (!var1.equals("")) {
            var5 = Class802.Field1(var1, "|");
            this.Field69.addElement(Class63.Field98.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field69.addElement(var5[var4]);
            }
        }

        if (!var2.equals("")) {
            var5 = Class802.Field1(var2, "|");
            this.Field69.addElement(Class63.Field99.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field69.addElement(var5[var4]);
            }
        }

        if (!var3.equals("")) {
            var5 = Class802.Field1(var3, "|");
            this.Field69.addElement(Class63.Field100.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field69.addElement(var5[var4]);
            }
        }

    }

    static void Field1(Class326 var0, String[] var1) {
        var0.Field83 = null;
    }

    static void Field1(Class326 var0, Vector var1) {
        var0.Field69 = null;
    }

    static void Field1(Class326 var0) {
        Vector var1 = new Vector();
        int var2 = var0.Field3 / var0.Field4;
        int var3 = var0.Field3 % var0.Field4;
        int var4 = (var2 << 1) + var3 / 2;
        if (var2 == 4 && (var0.Field82 == -1 || var3 >= var0.Field23.size()) || var2 != 4 && (var3 == 1 && var0.Field82 != -1 || var3 != 1 && var4 < Class585.Field36.size())) {
            var1.addElement(new Class87(var2 != 4 ? "Lấy ra" : "Bỏ vào", new Class664(var0, var2, var3)));
        }

        if (var2 == 4 || var3 != 1 && var4 < Class585.Field36.size() || var0.Field82 != -1 && var3 == 1) {
            var1.addElement(new Class87("Thông tin", new Class620(var0)));
        }

        Class105.Field21.Field1(var1, 3);
    }

    static void Field2(Class326 var0) {
        Vector var1 = new Vector();
        if (var0.Field37 != 1) {
            if (var0.Field3 % var0.Field4 < var0.Field19.size()) {
                Class274 var2 = (Class274) var0.Field19.elementAt(var0.Field3 % var0.Field4);
                var1.addElement(new Class87("Bỏ vào", new Class646(var0, var2)));
                var1.addElement(var0.Field1((Class274) var2, var0.Field3 % var0.Field4 * 20 + 4, 86));
            }
        } else if (var0.Field3 < var0.Field20.size()) {
            Class231 var4 = (Class231) var0.Field20.elementAt(var0.Field3);
            var1.addElement(new Class87("Lấy ra", new Class644(var0, var4)));
            Class274 var3;
            (var3 = new Class274()).Field1 = var4.Field2;
            var1.addElement(var0.Field1((Class274) var3, var0.Field72[var0.Field3][0], var0.Field72[var0.Field3][1]));
        }

        Class105.Field21.Field1(var1, 2);
    }

    static void Field3(Class326 var0) {
        var0.Field25();
    }

    static void Field1(Class326 var0, Class274 var1) {
        var1 = var1;
        var0 = var0;
        --var1.Field3;
        if (var1.Field3 <= 0) {
            var0.Field20.removeElement(var1);
        }

        boolean var2 = false;
        int var3 = var0.Field19.size();

        for (int var4 = 0; var4 < var3; ++var4) {
            Class274 var5;
            if ((var5 = (Class274) var0.Field19.elementAt(var4)).Field1 == var1.Field1) {
                ++var5.Field3;
                var2 = true;
                break;
            }
        }

        if (!var2) {
            Class274 var6 = new Class274(var1.Field1);
            Class274.Field1(var1, var6);
            var6.Field3 = 1;
            var0.Field19.addElement(var1);
        }

    }

    static void Field4(Class326 var0) {
        var0.Field23();
    }

    static void Field1(Class326 var0, String var1, int var2, int var3) {
        var0.Field1(var1, var2, var3);
    }

    static void Field1(Class326 var0, Class537 var1, boolean var2, int var3, int var4) {
        var0.Field1(var1, var2, var3, var4);
    }

    static void Field1(Class326 var0, int var1) {
        var0.Field82 = var1;
    }

    static int Field5(Class326 var0) {
        return var0.Field82;
    }

    static void Field6(Class326 var0) {
        var0 = var0;
        int var1 = 0;
        boolean var2 = false;
        int var3;
        int var4;
        Class537 var5;
        int var7;
        if (var0.Field3 % 3 == 1) {
            if (Field22.Field141 && var0.Field3 != 4) {
                var7 = (var0.Field3 / 3 << 1) + (var0.Field3 % 3 - (var0.Field3 % 3 > 0 ? 1 : 0));
                var3 = Field22.Field98.size();

                for (var4 = 0; var4 < var3; ++var4) {
                    if (Class804.Field2((int) (var5 = (Class537) Field22.Field98.elementAt(var4)).Field18).Field3 == 13) {
                        var0.Field1(var5, false, Field89[var7][0] + 5, Field89[var7][1] - 2);
                    }
                }

            } else {
                Vector var8;
                if (Field17.length == 1) {
                    if (var0.Field3 != 4) {
                        (var8 = new Vector()).addElement(new Class87("Thông tin", new Class709(var0)));
                        var8.addElement(new Class87("Trang bị linh thú", new Class710(var0)));
                        Class105.Field21.Field1(var8, 3);
                    } else {
                        var3 = Field22.Field98.size();

                        for (var4 = 0; var4 < var3; ++var4) {
                            if (Class804.Field2((int) (var5 = (Class537) Field22.Field98.elementAt(var4)).Field18).Field3 == 19) {
                                var0.Field1(var5, false, Field89[9][0] + 5, Field89[9][1] - 2);
                                return;
                            }
                        }

                    }
                } else if (var0.Field3 != 4) {
                    (var8 = new Vector()).addElement(new Class87("Linh thú", new Class707(var0)));
                    var8.addElement(new Class87("Thú cưng", new Class708(var0)));
                    Class105.Field21.Field1(var8, 3);
                } else {
                    var3 = Field22.Field98.size();

                    for (var4 = 0; var4 < var3; ++var4) {
                        if (Class804.Field2((int) (var5 = (Class537) Field22.Field98.elementAt(var4)).Field18).Field3 == 19) {
                            var0.Field1(var5, false, Field89[9][0] + 5, Field89[9][1] - 2);
                            return;
                        }
                    }

                }
            }
        } else {
            var7 = (var0.Field3 / 3 << 1) + (var0.Field3 % 3 - (var0.Field3 % 3 > 0 ? 1 : 0));
            var3 = Field22.Field98.size();

            for (var4 = 0; var4 < var3; ++var4) {
                Class798 var6;
                if ((var6 = Class804.Field2((int) (var5 = (Class537) Field22.Field98.elementAt(var4)).Field18)).Field3 == Field87[var7] || Field87[var7] == -1 && var6.Field3 > 2 && var6.Field3 < 8) {
                    ++var1;
                    if (var7 != 7 || var1 != 1) {
                        var0.Field1(var5, false, Field89[var7][0] + 5, Field89[var7][1] - 2);
                        return;
                    }
                }
            }

        }
    }

    static void Field7(Class326 var0) {
        if (Class105.Field19.Field15.Field78 == 0) {
            Class105.Field1("Đã hết điểm tiềm năng để cộng. Xin đánh lên level để có điểm tiềm năng.");
        } else {
            Class105.Field25.Field1("Nhập số", new Class716(var0), 1, 10, true);
            Class105.Field23 = Class105.Field25;
        }
    }

    static void Field8(Class326 var0) {
        if (Class359.Field97[var0.Field3] == -1) {
            Class105.Field1("Xin gặp Lâm tướng quân để học kỹ năng này");
        } else {
            Vector var1 = new Vector();
            boolean var2 = false;
            boolean var3;
            if (var3 = var0.Field21()) {
                var2 = Class602.Field4[Class105.Field19.Field15.Field93][var0.Field3 - 4] == -1;
            }

            if (var3 && !var2) {
                var1.addElement(new Class87("Sử dụng", new Class619(var0, var3)));
            }

            if (!var2) {
                var1.addElement(new Class87("Cho vào phím tắt", new Class624(var0, var3)));
            }

            var1.addElement(new Class87("Cộng", new Class622(var0)));
            Class105.Field21.Field1(var1, 2);
        }
    }

    static void Field9(Class326 var0) {
        var0 = var0;
        if (Field22.Field99 != null && Field22.Field99.size() > 0) {
            int var1 = Field22.Field99.size();

            for (int var2 = 0; var2 < var1; ++var2) {
                Class537 var3;
                if (Class804.Field2((int) (var3 = (Class537) Field22.Field99.elementAt(var2)).Field18).Field3 == Field88[var0.Field3]) {
                    var0.Field1(var3, false, Field89[0][0] + 5, Field89[0][1] - 2);
                    return;
                }
            }
        }

    }

    static String Field2(Class326 var0, int var1) {
        return "";
    }

    static Class537[] Field10(Class326 var0) {
        return var0.Field71;
    }

    static boolean Field11(Class326 var0) {
        if (var0.Field8.size() >= 100) {
            Class105.Field1("Bạn chỉ được mua 100 vật phẩm một lần.");
            return true;
        } else {
            return false;
        }
    }
}
