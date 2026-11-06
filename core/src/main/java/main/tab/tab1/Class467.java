package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

import java.util.Vector;

public final class Class467 extends Class665 {
    public static Class467 Field1;
    private int Field61;
    private int Field62;
    public int Field2;
    public int Field3;
    public int Field4;
    public int Field5 = 7;
    public int Field6;
    private int Field63;
    private int Field64;
    private int Field65;
    private int Field66;
    public int Field7;
    public int Field8;
    private int Field67;
    private int Field68;
    private int Field69;
    public static String[] Field9 = null;
    private int[][] Field70 = new int[][]{{0, 1, 2}, {0, 1}};
    public int Field10;
    private String[] Field71 = new String[]{"Hành trang", "Trang bị", "Tiềm năng", "Kỹ năng", "Thông tin", "Nhóm", "Nhiệm vụ", "Học kỹ năng", "Trao đổi", "Gian hàng", "Gian hàng", "Áo", "Quần", "Nón", "Nhẫn", "Dây chuyền", "Giày", "Găng tay", "Ngọc bội", "Gian hàng", "Gian hàng", "Luyện đồ", "Kho đồ", "Gian hàng", "Gian hàng", "Khảm", "Hợp thành", "Nhiệm vụ", "Chế đồ", "Kỹ năng bang hội", "Kỹ năng cá nhân", "Trang bị thú", "Hợp đồ thú"};
    private String[] Field72;
    public String Field11 = "";
    private String Field73 = "";
    public Vector Field12 = new Vector();
    private Vector Field74;
    public Vector Field13 = new Vector();
    public boolean Field14 = false;
    public boolean Field15 = false;
    public boolean Field16 = false;
    private boolean Field75 = false;
    private boolean Field76;
    private int Field77;
    private int Field78;
    private static int Field79;
    public static int Field17;
    private static int Field80;
    private static int Field81;
    private static int Field82;
    private static int Field83;
    private static int Field84;
    private static int Field85;
    private static int Field86;
    private static int Field87;
    public static int Field18;
    public static int Field19;
    private static int Field88;
    private static int Field89;
    public static int Field20;
    public static int Field21;
    private static int Field90;
    private static int Field91 = 1;
    public static byte[] Field22;
    private Vector Field92;
    public int Field23;
    public int Field24;
    public short Field25;
    public Vector Field26 = new Vector();
    public Vector Field27 = new Vector();
    public Vector Field28;
    public Vector Field29;
    public Vector Field30 = new Vector();
    private Class537[] Field93 = new Class537[5];
    private short[][] Field94;
    public static byte Field31 = -1;
    private static byte Field95;
    private static byte Field96;
    public static byte Field32;
    public static byte Field33;
    public static byte Field34;
    public static byte Field35;
    public static short Field36 = 0;
    public static short Field37;
    public static short Field38;
    public static Class359 Field39;
    private byte[] Field97;
    public static boolean Field40 = false;
    public boolean Field41 = false;
    int Field42;
    private int Field98;
    private int Field99;
    public static byte Field43;
    public static byte Field44;
    public static byte Field45;
    public static byte Field46;
    int Field47 = 0;
    byte[] Field48;
    int Field49;
    int Field50 = -20;
    public static byte Field51 = 0;
    Image Field52;
    public int Field53;
    public int Field54;
    public int Field55;
    private int Field100 = -1;
    boolean Field56 = false;
    private String[] Field101;
    private boolean Field102;
    private boolean Field110;
    private boolean Field111;
    private int Field112 = 0;
    int Field57;
    int Field58 = 1;
    private String[] Field113 = new String[]{"Trắng", "Hoàn mỹ", "Đỏ", "Xanh"};
    private static int[] Field114 = new int[]{9, 9, 9, 107, 107, 107, 107, 107, 107, 107, 9, 107, 9, 82, 9, 9, 9, 9, 9, 34};
    private static int[] Field115 = new int[]{32, 73, 52, 11, 11, 11, 11, 11, 52, 32, 94, 94, 11, 92, 32, 52, 73, 94, 11, 92};
    public Vector Field59 = new Vector();
    public Image Field60;
    private static byte[] Field116 = new byte[]{12, -1, 0, 9, 2, 8, 1, 8, 10, 11};
    private static byte[] Field117 = new byte[]{18, 19, 14, 20, 15, 21, 16, 22, 17, 23};
    private static byte[][] Field118 = new byte[][]{{10, 11}, {56, 11}, {10, 32}, {56, 32}, {10, 52}, {56, 52}, {10, 73}, {56, 94}, {10, 94}, {56, 94}};

    public static Class467 Field5() {
        return Field1 == null ? (Field1 = new Class467()) : Field1;
    }

    public final void Field1() {
        super.Field1();
        this.Field2();
        this.Field16 = true;
    }

    public final void Field2() {
        this.Field61 = Class105.Field15 - 64;
        this.Field62 = Class105.Field16 - 77;
        this.Field23();
    }

    public Class467() {
        this.Field2();
        super.Field105 = new Class87("Đóng", new Class282(this));
        this.Field4 = 0;
        Field21 = 0;
        this.Field57 = 0;
        this.Field58 = 1;
    }

    public final void Field1(Vector var1) {
        this.Field12 = var1;
        this.Field5 = 7;
        this.Field6 = var1.size() / this.Field5;
        if (var1.size() % this.Field5 != 0) {
            ++this.Field6;
        }

        if (this.Field6 < 5) {
            this.Field6 = 5;
        }

        if (Field22[Field21] == 0 && this.Field6 > 6) {
            this.Field6 = 6;
        }

        this.Field23();
        this.Field16 = true;
        this.Field14();
    }

    public static int Field6() {
        return Field22[Field21];
    }

    private void Field23() {
        Field20 = this.Field5 * this.Field7 - this.Field2;
        Field82 = this.Field6 * this.Field8 - this.Field3;
        if (Field20 < 0) {
            Field20 = 0;
        }

        if (Field82 < 0) {
            Field82 = 0;
        }

    }

    public final void Field7() {
        if (Class105.Field17 == Field5() && Field21 == 0) {
            this.Field25();
            this.Field16 = false;
        }

    }

    public final void Field1(int var1, boolean var2, byte[] var3) {
        this.Field15 = var2;
        if (var2) {
            this.Field48 = var3;
        }

        Field22 = var3;
        Field21 = var1;
        this.Field4 = 0;
        this.Field14();
        this.Field25();
    }

    public final void Field1(int var1, int var2, int var3, int var4, int var5, int var6) {
        this.Field2 = var1;
        this.Field3 = var2;
        this.Field5 = var3;
        this.Field6 = var4;
        this.Field7 = var5;
        this.Field8 = var6;
        this.Field23();
        Field79 = 0;
        Field18 = 0;
        Field17 = 0;
        Field19 = 0;
    }

    public final void Field3() {
        if (this.Field14) {
            if (Class105.Field5[2]) {
                if (this.Field66 >= 100) {
                    if ((Field83 -= 10) < 0) {
                        Field83 = 0;
                    }
                } else {
                    this.Field19();
                }

                Class105.Field3[2] = false;
            } else if (Class105.Field5[8]) {
                if (this.Field66 >= 100) {
                    if ((Field83 += 10) > Field87) {
                        Field83 = Field87;
                    }
                } else {
                    this.Field19();
                }

                Class105.Field3[8] = false;
            }

            Class105.Field2(2);
            Class105.Field2(8);
            if (Class105.Field6 && Class105.Field1(this.Field63, this.Field64, this.Field65 - 1, this.Field66 - 1 + this.Field24 * 15)) {
                if (!this.Field76) {
                    this.Field78 = Field84;
                    this.Field76 = true;
                }

                if ((Field83 = this.Field78 + (Class105.Field30 - Class105.Field11)) < 0) {
                    Field83 = 0;
                }

                if (Field83 > Field87) {
                    Field83 = Field87;
                }
            }

            if (Class105.Field7) {
                this.Field76 = false;
                Class105.Field7 = false;
                if (!Class105.Field1(this.Field63, this.Field64, this.Field65 - 1, this.Field66 - 1 + this.Field24 * 15) && Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                    this.Field19();
                }
            }
        }

        if (Class105.Field3[4] || Class105.Field3[6]) {
            this.Field19();
        }

        if (Class105.Field7 && Math.abs(Class105.Field11 - Class105.Field30) <= 10 && Math.abs(Class105.Field10 - Class105.Field31) <= 10) {
            if (Class105.Field1(this.Field61 - 5, this.Field62, 30, 35)) {
                this.Field16 = true;
                Class105.Field3[4] = true;
            }

            if (Class105.Field1(this.Field61 + 104, this.Field62, 30, 35)) {
                this.Field16 = true;
                Class105.Field3[6] = true;
            }
        }

        if (this.Field16) {
            if (Class105.Field2(8)) {
                this.Field16 = false;
                this.Field14();
                Class105.Field5[8] = false;
                if (Field22[Field21] == 1) {
                    this.Field4 = 0;
                }
            } else if (Class105.Field2(4)) {
                if (--Field21 < 0) {
                    Field21 = Field22.length - 1;
                }

                if (Field22.length > 1) {
                    Field96 = 5;
                    Field90 = 100;
                    Field91 = 1;
                }

                this.Field25();
                this.Field14();
            } else if (Class105.Field2(6)) {
                if (++Field21 >= Field22.length) {
                    Field21 = 0;
                }

                if (Field22.length > 1) {
                    Field95 = 5;
                    Field91 = -1;
                    Field90 = -100;
                }

                this.Field25();
                this.Field14();
            }
        } else if (Field22[Field21] != 26 && Field17 == 0 && this.Field5 != 0 && this.Field4 / this.Field5 == 0 && Class105.Field2(2) && Field22[Field21] != 32) {
            this.Field16 = true;
            super.Field104 = null;
        }

        boolean var2 = false;
        if (Class105.Field1(this.Field61 + this.Field67, this.Field62 + this.Field68, this.Field2, this.Field3)) {
            Class467 var3;
            int var4;
            int var5;
            if (Field22[Field21] == 26) {
                var3 = this;
                if (Class105.Field7) {
                    var4 = this.Field94.length;

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (Class105.Field1(var3.Field61 + var3.Field67 + var3.Field94[var5][0] - 3, var3.Field62 + var3.Field68 + var3.Field94[var5][1] - 3, 23, 23)) {
                            Class105.Field7 = false;
                            var3.Field4 = var5;
                            if (var3.Field6 != 1) {
                                var3.Field6 = 1;
                                var3.Field5 = 5;
                                Field79 = 0;
                                Field18 = 0;
                                Field17 = 0;
                                Field19 = 0;
                            }
                        }
                    }
                }
            }

            int var6;
            if (Field22[Field21] == 32) {
                if (Class105.Field11 >= this.Field62 + this.Field68 + this.Field94[1][1] && Class105.Field11 <= this.Field94[1][1] + 65 + this.Field62 + this.Field68) {
                    var3 = this;
                    if (Class105.Field7) {
                        var4 = this.Field94.length;

                        for (var5 = 0; var5 < var4; ++var5) {
                            if (Class105.Field1(var3.Field61 + var3.Field67 + var3.Field94[var5][0] - 3, var3.Field62 + var3.Field68 + var3.Field94[var5][1] - 3, 23, 23)) {
                                Class105.Field7 = false;
                                var3.Field4 = var5;
                                if (var3.Field6 != 1) {
                                    var3.Field6 = 1;
                                    var3.Field5 = 5;
                                    Field79 = 0;
                                    Field18 = 0;
                                    Field17 = 0;
                                    Field19 = 0;
                                }

                                var3.Field30();
                            }
                        }
                    }
                } else if (Class105.Field1(this.Field67 + this.Field61, this.Field62 + this.Field68 + 4 * this.Field8 - 5, 120, 20)) {
                    Class105.Field7 = false;
                    var6 = (Class105.Field11 - (this.Field62 + this.Field68 + 4 * this.Field8 - 5)) / this.Field8;
                    var4 = (Class105.Field10 - (this.Field67 + this.Field61 + 5)) / 20;
                    this.Field4 = var6 * 6 + var4 + 6;
                    if (this.Field4 < 6) {
                        this.Field4 = 6;
                    } else if (this.Field4 > 11) {
                        this.Field4 = 11;
                    }

                    if (this.Field6 != 1) {
                        this.Field6 = 1;
                        this.Field5 = 6;
                        Field79 = 0;
                        Field18 = 0;
                        Field17 = 0;
                        Field19 = 0;
                    }

                    this.Field30();
                }
            }

            boolean var7 = false;
            if (Class105.Field6 && Field22[Field21] != 1 && !this.Field14) {
                if (!this.Field76) {
                    this.Field77 = Field17;
                    this.Field78 = Field19;
                    this.Field76 = true;
                    var6 = (Field79 + Class105.Field11 - (this.Field62 + this.Field68)) / this.Field8;
                    var4 = (Field18 + Class105.Field10 - (this.Field61 + this.Field67)) / this.Field7;
                    if (Field22[Field21] != 3) {
                        if (Field22[Field21] != 32) {
                            var2 = true;
                        }

                        this.Field14();
                        if (var6 == 5 && this.Field6 != 5 && Field22[Field21] == 26) {
                            this.Field4 = 3;
                            this.Field2(1, false);
                        } else if (var6 != 4 && (Field22[Field21] == 21 || Field22[Field21] == 25)) {
                            var4 = var4;
                            if (var4 > 0 && var4 < 5) {
                                this.Field4 = 1;
                            } else {
                                if (var4 == 5) {
                                    var4 = 2;
                                }

                                this.Field4 = var6 * this.Field5 + var4;
                            }
                        } else if (var6 == 5 && this.Field6 != 5 && Field22[Field21] == 32) {
                            this.Field4 = 3;
                            this.Field2(1, true);
                        } else {
                            if ((Field22[Field21] == 21 || Field22[Field21] == 25) && var6 == 4 && this.Field4 / this.Field5 != 4) {
                                this.Field4 = 10;
                                this.Field7(1);
                            }

                            if (Field22[Field21] != 32) {
                                this.Field4 = var6 * this.Field5 + var4;
                            }
                        }
                    }
                } else {
                    this.Field102 = true;
                }

                this.Field111 = true;
                this.Field110 = true;
                Field79 = this.Field77 + (Class105.Field30 - Class105.Field11);
                if (Field22[Field21] != 32 || Class105.Field11 >= this.Field94[1][1] + 70 + this.Field62 + this.Field68) {
                    Field18 = this.Field78 + (Class105.Field31 - Class105.Field10);
                }

                if (Field79 < -10) {
                    Field79 = -10;
                }

                if (Field79 > Field82 + 10) {
                    Field79 = Field82 + 10;
                }

                if (Field18 < -10) {
                    Field18 = -10;
                }

                if (Field18 > Field20 + 10) {
                    Field18 = Field20 + 10;
                }
            }

            if (Class105.Field7) {
                this.Field50 = -20;
                this.Field16 = false;
                Class105.Field7 = false;
                this.Field76 = false;
                if (Field22[Field21] != 1) {
                    if (Field22[Field21] != 3) {
                        if (Field22[Field21] != 32) {
                            this.Field14();
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        } else if (Class105.Field11 >= this.Field94[1][1] + 90 + this.Field62 + this.Field68 && Math.abs(Class105.Field31 - Class105.Field10) <= 10) {
                            var6 = (Field79 + Class105.Field11 - (this.Field62 + this.Field68)) / this.Field8;
                            var4 = (Field18 + Class105.Field10 - (this.Field61 + this.Field67)) / this.Field7;
                            this.Field5 = this.Field30.size() + this.Field27.size();
                            if (this.Field5 < 6) {
                                this.Field5 = 6;
                            }

                            this.Field6 = 5;
                            if ((Field20 = this.Field5 * 20 - (this.Field2 - 8)) < 0) {
                                Field20 = 0;
                            }

                            this.Field4 = (var6 - 1) * this.Field5 + var4;
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        }
                    } else {
                        if ((var6 = (Field18 + Class105.Field10 - (this.Field61 + this.Field67)) / this.Field7) < 0) {
                            var6 = 0;
                        } else if (var6 > Class602.Field11[Class105.Field19.Field15.Field93].length - 1) {
                            var6 = Class602.Field11[Class105.Field19.Field15.Field93].length - 1;
                        }

                        if (this.Field4 != var6) {
                            this.Field4 = var6;
                        } else {
                            this.Field14();
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        }
                    }
                } else if (Class105.Field10 >= this.Field61 + 33 && Class105.Field10 <= this.Field61 + 53) {
                    this.Field4 = 4;
                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class105.Field10 > this.Field61 + 80 && Class105.Field10 <= this.Field61 + 96) {
                    this.Field4 = 1;
                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class105.Field10 > this.Field61 && Class105.Field10 <= this.Field61 + 30) {
                    var6 = (Class105.Field11 - (this.Field62 + this.Field68)) / this.Field8;
                    var4 = (Class105.Field10 - (this.Field61 + this.Field67)) / this.Field7;
                    this.Field4 = var6 * this.Field5 + var4;
                    if (this.Field4 > 12) {
                        this.Field4 = 12;
                    }

                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class105.Field10 > this.Field61 + 100 && Class105.Field10 <= this.Field61 + 120) {
                    var6 = (Class105.Field11 - (this.Field62 + this.Field68)) / this.Field8;
                    var4 = (Class105.Field10 - (this.Field61 + this.Field67)) / this.Field7;
                    this.Field4 = var6 * this.Field5 + var4 + 1;
                    if (this.Field4 > 14) {
                        this.Field4 = 14;
                    }

                    if (Math.abs(Class105.Field30 - Class105.Field11) < 10 && Math.abs(Class105.Field31 - Class105.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                }
            }
        } else {
            this.Field76 = false;
            if (Field22[Field21] == 3 && !this.Field110 && Class105.Field1(this.Field61 + this.Field67, this.Field62 + this.Field68 + 30, this.Field2, 65)) {
                this.Field102 = false;
                if (Class105.Field6) {
                    if (!this.Field111) {
                        this.Field77 = Field17;
                        this.Field111 = true;
                        this.Field14();
                    }

                    if ((Field79 = this.Field77 + (Class105.Field30 - Class105.Field11)) < -10) {
                        Field79 = -10;
                    }

                    if (Field79 > Field82 + 10) {
                        Field79 = Field82 + 10;
                    }
                }

                if (Class105.Field7) {
                    Class105.Field7 = false;
                    this.Field111 = false;
                }
            }
        }

        if (!Class105.Field6) {
            this.Field110 = false;
        }

        byte[] var8;
        if (Class105.Field2(2)) {
            this.Field50 = -20;
            if (Field22[Field21] == 32) {
                this.Field2(-1, true);
            } else if (Field22[Field21] == 26) {
                this.Field2(-1, false);
            } else {
                if (Field22[Field21] == 8) {
                    this.Field6(-1);
                } else if (Field22[Field21] == 21 || Field22[Field21] == 25) {
                    this.Field7(-1);
                }

                if (Field22[Field21] != 1) {
                    if (this.Field4 / this.Field5 > 0) {
                        var2 = true;
                        this.Field4 -= this.Field5;
                        this.Field14();
                    }
                } else {
                    var8 = new byte[]{0, 4, 2, 0, 12, 2, 3, 2, 5, 6, 6, 8, 9, 9, 11};
                    this.Field4 = var8[this.Field4];
                    var2 = true;
                    this.Field14();
                }
            }
        } else if (Class105.Field2(4)) {
            if (Field22[Field21] == 32) {
                --this.Field4;
                var2 = true;
                if (this.Field4 < 0) {
                    this.Field4 = 0;
                }

                if (this.Field4 == 5) {
                    this.Field4 = 6;
                }

                if (this.Field4 > 12 && this.Field4 < this.Field4 % this.Field5) {
                    this.Field4 = this.Field6 * this.Field5 - 1;
                }
            } else if (Field22[Field21] != 1) {
                if (this.Field5 > 1 && this.Field4 % this.Field5 > 0) {
                    if (Field22[Field21] != 22 && Field22[Field21] != 23 || !this.Field2(-1)) {
                        var2 = true;
                    }

                    --this.Field4;
                    this.Field14();
                }
            } else {
                var8 = new byte[]{0, 4, 1, 3, 12, 1, 6, 6, 1, 9, 9, 1, 12, 12, 1};
                var2 = true;
                this.Field4 = var8[this.Field4];
                this.Field14();
            }
        } else if (Class105.Field2(6)) {
            if (Field22[Field21] == 32) {
                ++this.Field4;
                var2 = true;
                if (this.Field4 == 12) {
                    this.Field4 = 11;
                }

                if (this.Field4 == 5) {
                    this.Field4 = 4;
                }

                if (this.Field4 > 12 && this.Field4 > this.Field6 * this.Field5 - 1) {
                    this.Field4 = (this.Field6 - 1) * this.Field5;
                }
            } else if (Field22[Field21] != 1) {
                if (this.Field5 > 1 && this.Field4 < this.Field6 * this.Field5 - 1) {
                    if (Field22[Field21] != 22 && Field22[Field21] != 23 || !this.Field2(1)) {
                        var2 = true;
                    }

                    ++this.Field4;
                    this.Field14();
                }
            } else {
                var8 = new byte[]{4, 2, 2, 4, 1, 5, 4, 4, 8, 4, 9, 11, 4, 12, 14};
                var2 = true;
                this.Field4 = var8[this.Field4];
                this.Field14();
            }
        } else if (Class105.Field2(8)) {
            this.Field50 = -20;
            if (Field22[Field21] == 32) {
                this.Field2(1, true);
            } else if (Field22[Field21] == 26) {
                this.Field2(1, false);
            } else {
                if (Field22[Field21] == 8) {
                    this.Field6(1);
                }

                if (Field22[Field21] != 1) {
                    if (this.Field4 / this.Field5 < this.Field6 - 1) {
                        if (Field22[Field21] == 21 || Field22[Field21] == 25) {
                            this.Field7(1);
                        }

                        var2 = true;
                        this.Field4 += this.Field5;
                        this.Field14();
                    }
                } else {
                    var8 = new byte[]{3, 2, 5, 6, 1, 8, 9, 2, 11, 12, 14, 14, 4, 13, 14};
                    this.Field4 = var8[this.Field4];
                    var2 = true;
                    this.Field14();
                }
            }
        }

        if (this.Field12.size() == 0 && Field22[Field21] != 22 && Field22[Field21] != 23) {
            if (Class105.Field5[2]) {
                var2 = false;
                if ((Field79 -= 10) < 0) {
                    Field79 = 0;
                }
            } else if (Class105.Field5[8]) {
                var2 = false;
                if ((Field79 += 10) > Field82) {
                    Field79 = Field82;
                }
            }
        }

        if (var2) {
            this.Field102 = false;
            if ((Field79 = this.Field4 / this.Field5 * this.Field8 - this.Field3 / 2) < 0) {
                Field79 = 0;
            }

            if (Field79 > Field82) {
                Field79 = Field82;
            }

            if (Field22[Field21] != 32) {
                Field18 = this.Field4 % this.Field5 * this.Field7 - this.Field2 / 2;
            } else if (this.Field4 > 4) {
                Field18 = this.Field4 % this.Field5 * this.Field7 - this.Field2 / 2;
            }

            if (Field18 < 0) {
                Field18 = 0;
            }

            if (Field18 > Field20) {
                Field18 = Field20;
            }
        }

        super.Field3();
    }

    private void Field24() {
        this.Field30 = new Vector();
        int var1 = Class359.Field125.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class537 var3;
            Class798 var4;
            if (((var4 = Class804.Field2((int) (var3 = (Class537) Class359.Field125.elementAt(var2)).Field18)).Field3 == 14 || var4.Field3 == 15 || var4.Field3 == 16 || var4.Field3 == 17 || var4.Field3 == 18) && var3.Field37 == Field32) {
                this.Field30.addElement(var3);
            }
        }

    }

    private void Field25() {
        Field90 = 0;
        super.Field103 = null;
        this.Field75 = false;
        this.Field74 = null;
        this.Field94 = null;
        this.Field12.removeAllElements();
        this.Field67 = 1;
        this.Field68 = 35;
        if (Field22.length > 1) {
            this.Field73 = this.Field11;
            this.Field11 = this.Field71[Field22[Field21]];
        }

        this.Field47 = 0;
        if (Field22[Field21] != 0) {
            this.Field49 = Field21;
        }

        (new StringBuffer("Tab duoc chon la tab : ")).append(Field22[Field21]).toString();
        int var2;
        int var3;
        switch (Field22[Field21]) {
            case 0:
                this.Field75 = true;
                this.Field1(this.Field32());
                this.Field1(126, 90, 7, this.Field6, 18, 18);
                if (Class105.Field19.Field15.Field35 <= 1) {
                    super.Field103 = new Class87("Chọn", new Class280(this));
                } else {
                    super.Field103 = new Class87("Menu", new Class209(this));
                }
                break;
            case 1:
                this.Field67 += 5;
                this.Field68 += -2;
                this.Field1(117, 104, 3, 5, 97, 21);
                Vector var4 = new Vector();
                if (Class105.Field19.Field15.Field94 != -1) {
                    var4.addElement(new Class87("Thay đồ", new Class212(this)));
                }

                if (Class105.Field19.Field15.Field141) {
                    var4.addElement(new Class87("Cất cuốc", new Class289(this)));
                }

                if (var4.size() == 1) {
                    super.Field103 = (Class87) var4.elementAt(0);
                } else if (var4.size() == 2) {
                    super.Field103 = new Class87("Chọn", new Class351(this, var4));
                }
                break;
            case 2:
                this.Field68 += 13;
                this.Field1(124, 94, 1, 5, 125, 19);
                break;
            case 3:
                super.Field103 = null;
                this.Field67 += 5;
                this.Field68 += 7;
                this.Field4 = 0;
                this.Field1(114, 30, Class105.Field19.Field15.Field24(), 1, 23, 20);
                break;
            case 4:
                super.Field104 = null;
                this.Field75 = true;
                this.Field67 += -4;
                this.Field68 += -2;
                this.Field1(134, 95, 1, 10, 50, 12);
                break;
            case 5:
                this.Field75 = true;
                this.Field67 += -4;
                this.Field68 += -2;
                this.Field1(134, 95, 1, Class359.Field127.size(), 130, 32);
                break;
            case 6:
                this.Field75 = true;
                this.Field67 += -4;
                this.Field68 += -2;
                this.Field34();
                this.Field1(134, 95, 1, this.Field92.size(), 130, 15);
                this.Field92.removeAllElements();
                break;
            case 7:
                this.Field67 += 5;
                this.Field68 += 7;
                super.Field103 = null;
                this.Field14();
                break;
            case 8:
                this.Field67 += 9;
                this.Field68 += -5;
                this.Field11 = "Trao đổi";
                super.Field104 = new Class87("Chọn", new Class342(this));
                super.Field103 = new Class87("Xong", new Class690(this));
                break;
            case 9:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1((Vector) Class105.Field19.Field21, (int) -1);
                this.Field1(this.Field12);
                this.Field9(-1);
                break;
            case 10:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field2(Class105.Field19.Field21);
                this.Field1(this.Field12);
                super.Field103 = new Class87("Mua", new Class761(this));
                break;
            case 11:
            case 12:
            case 13:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(Class105.Field19.Field21, Field22[Field21] - 11);
                this.Field1(this.Field12);
                this.Field9(Field22[Field21] - 11);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(Class105.Field19.Field21, Field22[Field21] - 6);
                this.Field1(this.Field12);
                this.Field9(Field22[Field21] - 6);
                break;
            case 19:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field33();
                this.Field1(this.Field12);
                super.Field103 = new Class87("Mua", new Class577(this));
                break;
            case 20:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field31();
                this.Field1(this.Field12);
                super.Field103 = new Class87("Mua", new Class500(this));
                this.Field11 = this.Field11 + " " + (Field21 + 1);
                break;
            case 21:
                ++this.Field67;
                this.Field68 += -6;
                this.Field1(this.Field12);
                this.Field1(126, 110, 3, 5, 20, 23);
                this.Field14();
                this.Field27();
                break;
            case 22:
            case 23:
                this.Field75 = true;
                this.Field67 += 9;
                this.Field68 = this.Field68;
                this.Field4 = 0;
                this.Field2(0);
                this.Field1(108, 90, 6, this.Field6, 18, 18);
                this.Field14();
                super.Field103 = new Class87(Field22[Field21] == 22 ? "Chuyển" : "Chọn", new Class530(this));
                break;
            case 24:
                this.Field75 = true;
                this.Field1(126, 90, 7, this.Field6, 18, 18);
                this.Field1(this.Field11());
                super.Field103 = new Class87("Mua", new Class594(this));
                break;
            case 25:
                this.Field16 = false;
                ++this.Field67;
                this.Field68 += -4;
                this.Field1(this.Field12);
                this.Field1(126, 110, 3, 5, 20, 23);
                if (Field40) {
                    this.Field1(false, 1, Field46);
                } else {
                    this.Field11 = "Đục lỗ";
                    this.Field1(false, 2, Field46);
                }

                super.Field104 = new Class87("", new Class341(this));
                this.Field27();
                break;
            case 26:
                ++this.Field67;
                this.Field68 += -4;
                this.Field1(126, 108, 5, 1, 20, 18);
                this.Field94 = new short[][]{{(short) (this.Field2 / 2 - 44), 20}, {(short) (this.Field2 / 2 + 26), 20}, {(short) (this.Field2 / 2 - 10), 43}, {(short) (this.Field2 / 2 - 44), 65}, {(short) (this.Field2 / 2 + 26), 65}};
                this.Field1(true, 1, 0);
                this.Field28 = new Vector();
                super.Field104 = new Class87("Chọn", new Class340(this));
                super.Field103 = new Class87("Hợp", new Class608(this));
                break;
            case 27:
                this.Field75 = true;
                this.Field67 += -4;
                this.Field68 += -2;
                if (this.Field92 == null) {
                    this.Field92 = new Vector();
                }

                this.Field1(134, 95, 1, this.Field92.size(), 130, 15);
                super.Field103 = new Class87("Hủy", new Class276(this));
                break;
            case 28:
                ++this.Field67;
                this.Field68 += -4;
                if ((var3 = this.Field28.size() / 2) < 6) {
                    var3 = 6;
                }

                this.Field1(126, 108, var3, 3, 20, 18);
                super.Field104 = new Class87("Chọn", new Class348(this));
                super.Field103 = new Class87("Xong", new Class347(this));
                break;
            case 29:
                this.Field1(this.Field26());
                var3 = 0;

                for (var2 = 0; var2 < Class105.Field19.Field96.length; ++var2) {
                    if (Class105.Field19.Field96[var2].Field1 > 0) {
                        ++var3;
                    }
                }

                for (var2 = 0; var2 < Class105.Field19.Field97.length; ++var2) {
                    if (Class105.Field19.Field97[var2].Field1 > 0) {
                        ++var3;
                    }
                }

                if (var3 < 5) {
                    var3 = 5;
                }

                this.Field1(126, 100, 1, var3, 126, 20);
                this.Field16 = true;
                break;
            case 30:
                this.Field1(this.Field26());
                this.Field1(126, 100, 1, 6, 126, 20);
                this.Field16 = true;
                break;
            case 31:
                this.Field67 += 5;
                this.Field68 += -2;
                this.Field1(117, 104, 2, 5, 97, 21);
                break;
            case 32:
                ++this.Field67;
                this.Field68 += -4;
                this.Field1(126, 108, 5, 1, 20, 18);
                this.Field94 = new short[][]{{(short) (this.Field2 / 2 - 44), 0}, {(short) (this.Field2 / 2 + 26), 0}, {(short) (this.Field2 / 2 - 10), 20}, {(short) (this.Field2 / 2 - 44), 42}, {(short) (this.Field2 / 2 + 26), 42}};

                for (var2 = 0; var2 < this.Field93.length; ++var2) {
                    this.Field93[var2] = null;
                }

                this.Field24();
                this.Field28 = new Vector();
                super.Field104 = new Class87("", new Class344(this));
                super.Field103 = new Class87("Hợp", new Class465(this));
                break;
            case 127:
                this.Field75 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1((Vector) Class105.Field19.Field21, (int) -1);
                this.Field1(this.Field12);
                boolean var1 = true;
                super.Field103 = new Class87("Mua", new Class756(this, -1));
        }

        if (this.Field4 >= this.Field6 * this.Field5 - 1) {
            this.Field4 = 0;
        }

    }

    private Vector Field26() {
        Vector var1 = new Vector();
        int var2 = 0;
        int var3 = Class105.Field19.Field96.length;

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            if (Class105.Field19.Field96[var4].Field1 > 0) {
                var1.addElement(new Class571(this, "", new Class343(this), var4, var2));
                ++var2;
            }
        }

        var4 = Class105.Field19.Field97.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            if (Class105.Field19.Field97[var5].Field1 > 0) {
                var1.addElement(new Class614(this, "", new Class569(this), var5, var2));
                ++var2;
            }
        }

        return var1;
    }

    public final void Field8() {
        if (this.Field28.size() != 0) {
            byte[][] var1 = new byte[this.Field29.size()][6];
            int var2 = this.Field28.size();

            for (int var3 = 0; var3 < var2; ++var3) {
                Class274 var4 = (Class274) this.Field28.elementAt(var3);
                int var5 = this.Field29.size();

                for (int var6 = 0; var6 < var5; ++var6) {
                    Class383 var7 = (Class383) this.Field29.elementAt(var6);
                    int var8;
                    if ((var8 = var4.Field1 - var7.Field2) <= 5) {
                        var1[var6][var8] = (byte) var4.Field3;
                        break;
                    }
                }
            }

            Class61.Field9 = var1;
            Class105.Field2("Bạn có muốn hoàn thành không ?", new Class607(this, var1));
        }
    }

    public final void Field9() {
        boolean var1 = this.Field4 / this.Field5 < 2;
        Class274 var2 = null;
        if (var1) {
            if (this.Field4 < this.Field28.size()) {
                var2 = (Class274) this.Field28.elementAt(this.Field4);
            }
        } else if (this.Field4 % this.Field5 < this.Field27.size()) {
            var2 = (Class274) this.Field27.elementAt(this.Field4 % this.Field5);
        }

        if (var2 != null) {
            Class274 var3 = var2;
            int var4 = this.Field4 % this.Field5 * this.Field7 - Field19;
            int var5 = this.Field4 / this.Field5 * this.Field7;
            short var7 = var2.Field1;
            Vector var6;
            (var6 = new Vector()).addElement(new Class87(!var1 ? "Bỏ vào" : "Lấy ra", new Class606(this, var1, var3)));
            var6.addElement(new Class87("Thông tin", new Class605(this, var7, var4, var5)));
            Class105.Field21.Field1(var6, 2);
        }
    }

    public final void Field10() {
        int var3 = Field39.Field98.size();

        for (int var1 = 0; var1 < var3; ++var1) {
            Class804.Field2((int) ((Class537) Field39.Field98.elementAt(var1)).Field18);
        }

    }

    private Class87 Field1(Class274 var1, int var2, int var3) {
        return new Class87("Thông tin", new Class609(this, var1, var2, var3));
    }

    public final Vector Field11() {
        Vector var1 = new Vector();
        int var2 = this.Field26.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            var1.addElement(new Class531(this, "", new Class539(this, var3), var3));
        }

        return var1;
    }

    public final void Field1(Class537 var1, short var2) {
        this.Field19();
        Class105.Field25.Field1("Nhập giá muốn bán: ", new Class529(this, var1, var2), 1, 10, true);
        Class105.Field23 = Class105.Field25;
    }

    public final void Field1(Class537 var1, short var2, int var3, boolean var4) {
        Class263.Field1().Field1(this.Field53, this.Field54, var1, var2, var3, var4);
        Class105.Field8();
    }

    public final void Field1(boolean var1, int var2, int var3) {
        this.Field27.removeAllElements();
        Vector var8;
        int var4 = (var8 = var3 == 0 ? Class585.Field37 : Class585.Field38).size();

        for (int var5 = 0; var5 < var4; ++var5) {
            Class274 var6;
            Class743 var7 = Class804.Field1((var6 = (Class274) var8.elementAt(var5)).Field1);
            if (!var1) {
                if (var7.Field8 == var2) {
                    this.Field27.addElement(var6);
                }
            } else if (var7.Field9 == var2) {
                this.Field27.addElement(var6);
            }
        }

        if (this.Field27.size() == 0) {
            Class105.Field1("Không có nguyên liệu.", new Class533(this));
        }

    }

    private void Field27() {
        super.Field103 = new Class87(Field22[Field21] == 21 ? "Đập" : "Xong", new Class532(this));
    }

    public final void Field12() {
        int var1 = this.Field4 / this.Field5;
        int var2 = this.Field4 % this.Field5;
        Class743 var3 = null;
        int var4;
        Class537 var8;
        if (var1 == 4) {
            if (var2 < Class359.Field125.size()) {
                var8 = (Class537) Class359.Field125.elementAt(var2);
                this.Field1(var8, this.Field15, var2 * this.Field7, 4 * this.Field7);
            } else {
                var4 = this.Field27.size();

                for (int var5 = 0; var5 < var4; ++var5) {
                    if (var5 == var2 - Class359.Field125.size()) {
                        Class743 var9;
                        String var7 = Class537.Field1((var9 = Class804.Field1(((Class274) this.Field27.elementAt(var5)).Field1)).Field10, "0");
                        if (Field45 == 1 && Field22[Field21] == 21 || Field46 == 1 && Field22[Field21] == 25) {
                            var7 = var7 + " - Đã khóa";
                        }

                        var7 = var7 + Class537.Field1(var9.Field11, "0");
                        this.Field1(var7, var2 * this.Field7 - Field19, 4 * this.Field7);
                    }
                }

            }
        } else if (var2 == 1) {
            var8 = (Class537) Class359.Field125.elementAt(this.Field100);
            this.Field1((String) var8.Field1(this.Field15), 50, (int) (2 * this.Field7));
        } else {
            var4 = (var1 << 1) + var2 / 2;
            String var6 = Class537.Field1((var3 = Class804.Field1(((Class231) Class585.Field36.elementAt(var4)).Field2)).Field10, "0");
            if (Field45 == 1 && Field22[Field21] == 21 || Field46 == 1 && Field22[Field21] == 25) {
                var6 = var6 + " - Đã khóa";
            }

            var6 = var6 + Class537.Field1(var3.Field11, "0");
            this.Field1(var6, var2 * 50, var1 * this.Field7);
        }
    }

    public final boolean Field13() {
        byte[][] var1;
        int var2 = (var1 = new byte[][]{{4, 5}, {4, 5}, {4, 5, 6, 7}, {4, 5}, {4, 5}})[Class105.Field19.Field15.Field93].length;

        for (int var3 = 0; var3 < var2; ++var3) {
            if (this.Field4 == var1[Class105.Field19.Field15.Field93][var3]) {
                return true;
            }
        }

        return false;
    }

    public final void Field1(int var1, boolean var2) {
        Vector var3 = new Vector();

        for (int var4 = 0; var4 < 5; ++var4) {
            var3.addElement(new Class87("Phím số " + (1 + (var4 << 1)), new Class517(this, var4, var1, var2)));
        }

        Class105.Field21.Field1(var3, 2);
    }

    public final void Field1(Class585 var1, Class672 var2, int var3, boolean var4) {
        Vector var5 = new Vector();
        if (var4) {
            var5.addElement(new Class87("Cho mình", new Class516(this, var1, var3)));
            var5.addElement(new Class87("Cho bạn", new Class520(this, var2, var3)));
        } else {
            Class263.Field1().Field1((short) var1.Field189, (byte) 0, (byte) ((byte) var3), (short) 0);
        }

        Class105.Field21.Field1(var5, 2);
    }

    public final void Field14() {
        this.Field101 = null;
        int var3;
        switch (Field22[Field21]) {
            case 1:
                super.Field104 = new Class87("", new Class559(this));
                return;
            case 2:
                super.Field104 = new Class87("", new Class558(this));
                return;
            case 3:
                if ((Field82 = (Class105.Field19.Field15.Field10(this.Field4).length + 1) * 12 - 72) < 0) {
                    Field82 = 0;
                }

                super.Field104 = new Class87("", new Class564(this));
                return;
            case 4:
                this.Field101 = new String[17];
                Class585 var4 = Class105.Field19.Field15;
                this.Field101[0] = "Nhân vật: " + var4.Field65;
                this.Field101[1] = "Level: " + var4.Field22 + "+" + var4.Field44();
                this.Field101[2] = "HP: " + var4.Field4 + "/" + var4.Field5;
                this.Field101[3] = "MP: " + var4.Field130 + "/" + var4.Field129;
                this.Field101[4] = "Tấn công: " + var4.Field34();
                this.Field101[5] = "Thủ vật lý: " + var4.Field20;
                this.Field101[6] = "Thủ ma pháp: " + var4.Field21;
                this.Field101[7] = "Chính xác: " + var4.Field13;
                this.Field101[8] = "Né tránh: " + var4.Field14;
                this.Field101[9] = "Bạo kích: " + (var4.Field154 > 0 ? var4.Field154 / 10 + "." + var4.Field154 % 10 : "0") + "%";
                this.Field101[10] = "Chí mạng: " + var4.Field15;
                this.Field101[11] = "Cống hiến: " + var4.Field183 + " điểm.";
                this.Field101[12] = "Liên trảm: " + var4.Field156 + " điểm.";
                this.Field101[13] = "Công trạng: " + var4.Field155 + " điểm.";
                this.Field101[14] = "Điểm hoạt động: " + var4.Field157 + " điểm.";
                this.Field101[15] = "Điểm đấu trường: " + var4.Field184 + " điểm.";
                this.Field101[16] = var4.Field185.equals("") ? "Độc thân" : var4.Field185;
                this.Field6 = this.Field101.length + 1;
                if (Field9 != null) {
                    this.Field6 += Field9.length;
                }

                this.Field23();
                return;
            case 5:
                super.Field104 = new Class87("", new Class563(this));
                return;
            case 6:
                super.Field104 = new Class87("", new Class562(this));
                return;
            case 7:
                this.Field74 = new Vector();
                Vector var1 = (Vector) Class63.Field22.elementAt(Class105.Field19.Field15.Field93);
                byte var2 = Class359.Field97[((Class185) var1.elementAt(this.Field4)).Field3];
                this.Field74.addElement("`" + ((Class185) var1.elementAt(this.Field4)).Field1);
                if (var2 == -1) {
                    this.Field74.addElement("`Phí: " + ((Class185) var1.elementAt(this.Field4)).Field4 + " xu");
                }

                String[] var5 = Class21.Field8.Field1(((Class185) var1.elementAt(this.Field4)).Field2, 130);

                for (var3 = 0; var3 < var5.length; ++var3) {
                    this.Field74.addElement(var5[var3]);
                }

                this.Field1(114, 30, var1.size(), 1, 23, 20);
                if ((Field82 = this.Field74.size() * 12 - 72) < 0) {
                    Field82 = 0;
                }

                super.Field104 = new Class87("", new Class561(this, var1));
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
                var3 = this.Field4 + (Field22[Field21] == 0 ? this.Field47 * 42 : 0);
                super.Field104 = null;
                if (!this.Field16 && var3 < this.Field12.size()) {
                    super.Field104 = (Class87) this.Field12.elementAt(var3);
                }

                return;
            case 21:
            case 25:
                super.Field104 = new Class87("", new Class556(this));
                return;
            case 22:
            case 23:
                super.Field104 = new Class87("", new Class528(this));
                return;
            case 26:
                return;
            case 27:
                return;
            case 28:
                this.Field28();
                return;
            case 29:
                return;
            case 30:
                return;
            case 31:
                super.Field104 = new Class87("", new Class555(this));
                return;
            case 32:
        }
    }

    private void Field28() {
        int var1 = this.Field4 % this.Field5;
        if (this.Field4 / this.Field5 == 1) {
            int var2;
            if ((var2 = this.Field28.size() / 2) < 6) {
                var2 = 6;
            }

            this.Field5 = var2;
            if (this.Field5 < 6) {
                this.Field5 = 6;
            }

            if (var1 >= this.Field5) {
                var1 = this.Field5 - 1;
            }

            this.Field4 = this.Field5 + var1;
        } else if (this.Field4 / this.Field5 == 2) {
            this.Field5 = this.Field27.size();
            if (this.Field5 < 6) {
                this.Field5 = 6;
            }

            if (var1 >= this.Field5) {
                var1 = this.Field5 - 1;
            }

            this.Field4 = 2 * this.Field5 + var1;
        }

        this.Field23();
        if (Field19 > Field20) {
            Field19 = Field18 = Field20;
        }

    }

    public final void Field15() {
        if (this.Field14) {
            this.Field19();
        } else {
            Vector var1;
            int var5;
            int var10;
            int var11;
            if (this.Field4 / this.Field5 + 1 != this.Field6) {
                var1 = new Vector();
                Object var9 = null;
                if ((var10 = this.Field4 % this.Field5) <= 2) {
                    var5 = this.Field4 / this.Field5 * 3 + var10;
                    Vector var12 = Class105.Field19.Field15.Field40;
                    if (var5 < var12.size()) {
                        Object var7 = var9 = var12.elementAt(var5);
                        var1.addElement(new Class87("Hủy", new Class488(this, var12, var5, var7)));
                    }
                } else if ((var5 = this.Field4 / this.Field5 * 3 + (var10 - 3)) < Class105.Field19.Field15.Field41.size()) {
                    var9 = Class105.Field19.Field15.Field41.elementAt(var5);
                }

                if (var9 != null) {
                    var11 = var10 * 18;
                    var5 = this.Field4 / this.Field5 * 18;
                    var1.addElement(new Class87("Thông tin", new Class486(this, var9, var11, var5)));
                }

                Class105.Field21.Field1(var1, 3);
            } else {
                var1 = new Vector();
                if (this.Field4 % this.Field5 < Class359.Field125.size()) {
                    boolean var2 = false;
                    Class537 var3 = (Class537) Class359.Field125.elementAt(this.Field4 % this.Field5);
                    Vector var4;
                    var5 = (var4 = Class105.Field19.Field15.Field40).size();

                    for (int var6 = 0; var6 < var5; ++var6) {
                        if (var4.elementAt(var6) instanceof Class537 && ((Class537) var4.elementAt(var6)).Field9 == var3.Field9) {
                            var2 = true;
                            break;
                        }
                    }

                    if (!var2) {
                        var1.addElement(new Class87("Giao dịch", new Class554(this, var3)));
                    }

                    var1.addElement(new Class87("Thông tin", new Class482(this, var3)));
                } else {
                    int var8 = this.Field4 % this.Field5 - Class359.Field125.size();
                    var10 = 0;
                    var11 = Class585.Field42.length;

                    for (var5 = 0; var5 < var11; ++var5) {
                        if (Class585.Field42[var5].Field1 - Class585.Field42[var5].Field2 > 0 && Class585.Field42[var5].Field6) {
                            if (var10 == var8) {
                                var1.addElement(new Class87("Giao dịch", new Class480(this, var5)));
                                var1.addElement(new Class87("Thông tin", new Class543(this, var5, var10)));
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

    public final void Field16() {
    }

    public final void Field17() {
        if (Class359.Field127.size() > 0) {
            Class585 var1 = Class105.Field19.Field15;
            Vector var2 = new Vector();
            if (var1.Field189 == var1.Field192) {
                var2.addElement(new Class87("Đuổi", new Class473(this)));
                var2.addElement(new Class87("Giải tán", new Class472(this)));
            } else {
                var2.addElement(new Class87("Rời nhóm", new Class471(this)));
            }

            Class105.Field21.Field1(var2, 2);
        }

    }

    private void Field2(int var1, boolean var2) {
        if (var1 == -1) {
            if (this.Field6 != 1) {
                this.Field6 = 1;
                this.Field4 = 6;
                this.Field5 = 5;
                Field79 = 0;
                Field18 = 0;
                Field17 = 0;
                Field19 = 0;
                return;
            }

            if (this.Field4 == 2) {
                this.Field4 = 0;
                return;
            }

            if (this.Field4 == 3) {
                this.Field4 = 2;
                return;
            }

            if (this.Field4 == 4) {
                this.Field4 = 1;
                return;
            }

            if (this.Field4 >= 6 && this.Field4 < 12) {
                this.Field4 = 4;
                return;
            }
        } else {
            if (this.Field4 == 3 || this.Field4 == 4) {
                if (!var2) {
                    this.Field5 = this.Field27.size();
                    if (this.Field5 < 6) {
                        this.Field5 = 6;
                    }

                    this.Field6 = 5;
                    this.Field4 = (this.Field6 - 1) * this.Field5;
                    if ((Field20 = this.Field5 * 20 - (this.Field2 - 8)) < 0) {
                        Field20 = 0;
                    }

                    Field79 = 0;
                    Field18 = 0;
                    Field17 = 0;
                    Field19 = 0;
                    return;
                } else {
                    this.Field4 = 6;
                    this.Field5 = 6;
                    Field79 = 0;
                    Field18 = 0;
                    Field17 = 0;
                    Field19 = 0;
                    return;
                }
            }

            if (this.Field4 == 2) {
                this.Field4 = 3;
                return;
            }

            if (this.Field4 == 0) {
                this.Field4 = 2;
                return;
            }

            if (this.Field4 == 1) {
                this.Field4 = 4;
                return;
            }

            if (this.Field4 >= 6 && this.Field4 < 12) {
                this.Field3(-1);
            }
        }

    }

    public final boolean Field2(int var1) {
        int var2 = Field17;
        boolean var3 = false;
        int var4;
        if (Field22[Field21] == 22) {
            var4 = Class359.Field128.size();
        } else {
            var4 = this.Field26.size();
        }

        if (Class359.Field125.size() + Class585.Field37.size() < var4) {
            this.Field6 = var4 / 3 + 1;
        } else {
            this.Field6 = (Class359.Field125.size() + Class585.Field37.size()) / 3 + 1;
        }

        if (this.Field6 < 5) {
            this.Field6 = 5;
        }

        if ((this.Field4 % this.Field5 != 2 || var1 != 1) && (this.Field4 % this.Field5 != 3 || var1 != -1)) {
            if ((Field82 = this.Field6 * this.Field7 - this.Field3) < 0) {
                Field82 = 0;
            }

            return false;
        } else {
            if (var1 == -1) {
                Field82 = ((Class359.Field125.size() + Class585.Field37.size()) / 3 + 1) * this.Field7 - this.Field3;
            } else {
                Field82 = (var4 / 3 + 1) * this.Field7 - this.Field3;
            }

            if (Field82 < 0) {
                Field82 = 0;
            }

            var1 = this.Field4 / this.Field5 - Field17 / this.Field7;
            Field17 = Field79 = this.Field112;
            this.Field4 = (Field17 / this.Field7 + var1) * this.Field5 + this.Field4 % this.Field5;
            this.Field112 = var2;
            return true;
        }
    }

    private void Field6(int var1) {
        int var2;
        if ((var2 = this.Field4 % this.Field5 - Field19 / 18) < 0) {
            var2 = 0;
        }

        int var3 = this.Field4 / this.Field5;
        if (this.Field4 / this.Field5 + 2 == this.Field6 && var1 == 1) {
            var1 = 0;

            for (int var4 = 0; var4 < Class585.Field42.length; ++var4) {
                if (Class585.Field42[var4].Field1 - Class585.Field42[var4].Field2 > 0 && Class585.Field42[var4].Field6) {
                    ++var1;
                }
            }

            this.Field5 = Class359.Field125.size() + var1;
            if (this.Field5 < 6) {
                this.Field5 = 6;
            }

            Field20 = this.Field5 * 18 - this.Field2;
        } else {
            this.Field5 = 6;
            Field20 = 0;
        }

        if (var2 >= this.Field5) {
            var2 = this.Field5 - 1;
        }

        this.Field4 = var3 * this.Field5 + var2;
        Field79 = 0;
        Field18 = 0;
        Field17 = 0;
        Field19 = 0;
    }

    private void Field7(int var1) {
        int var2;
        if ((var2 = this.Field4 % this.Field5 - Field19 / 20) < 0) {
            var2 = 0;
        }

        int var3;
        if ((var3 = this.Field4 / this.Field5) + 2 == 5 && var1 == 1) {
            this.Field5 = Class359.Field125.size() + this.Field27.size();
            if (this.Field5 < 6) {
                this.Field5 = 6;
            }

            if ((Field20 = this.Field5 * 20 - this.Field2 + 6) < 0) {
                Field20 = 0;
            }
        } else {
            this.Field5 = 3;
            Field20 = 0;
        }

        if (var2 >= this.Field5) {
            var2 = this.Field5 - 1;
        }

        this.Field4 = var3 * this.Field5 + var2;
        Field79 = 0;
        Field18 = 0;
        Field17 = 0;
        Field19 = 0;
    }

    public final void Field4() {
        Class105.Field19.Field4();
        if (Field17 != Field79) {
            Field81 = Field79 - Field17 << 2;
            Field80 += Field81;
            Field17 += Field80 >> 4;
            Field80 &= 15;
        }

        if (Field19 != Field18) {
            Field89 = Field18 - Field19 << 2;
            Field88 += Field89;
            Field19 += Field88 >> 4;
            Field88 &= 15;
        }

        if (Math.abs(Field79 - Field17) < 15 && Field17 < 0) {
            Field79 = 0;
        }

        if (Math.abs(Field79 - Field17) < 10 && Field17 > Field82) {
            Field79 = Field82;
        }

        if (0 != Field90 && Class802.Field4(Field90 += (0 - Field90) / 2) <= 1) {
            Field90 = 0;
        }

        if (Field84 != Field83) {
            Field86 = Field83 - Field84 << 2;
            Field85 += Field86;
            Field84 += Field85 >> 4;
            Field85 &= 15;
        }

        if (Field22[Field21] == 31 && Field39 != null && Field39.Field103 != null) {
            if (Class105.Field12 % Field39.Field95 == 0) {
                ++this.Field10;
                if (this.Field10 > this.Field70[Field39.Field120 == 3 ? 0 : 1].length - 1) {
                    this.Field10 = 0;
                }
            }

            this.Field69 = this.Field70[Field39.Field120 == 3 ? 0 : 1][this.Field10];
        }

        if (Class105.Field21.Field1) {
            this.Field19();
        }

        if (Field22[Field21] == 0 && this.Field12 != null && this.Field12.size() > 0) {
            this.Field42 = Class105.Field19.Field15.Field35 - 1;
            if (this.Field42 <= 0) {
                this.Field42 = 0;
            }

            this.Field98 = this.Field12.size() % 42;
            this.Field99 = this.Field12.size();
        }

    }

    public final void Field1(Graphics var1) {
        Class105.Field19.Field1(var1);
        var1.translate(this.Field61, this.Field62);
        Class804.Field1(var1, -10, -10);
        if (Field22[Field21] == 0) {
            Class21.Field7.Field1(var1, this.Field47 + 1 + "/" + Class105.Field19.Field15.Field35, 64, 28, 2);
        }

        if (this.Field75) {
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

        var1.drawImage(Class804.Field30, 6 - Field96, 18, 3);
        var1.drawRegion(Class804.Field30, 0, 0, 11, 7, 2, 122 + Field95, 19, 3);
        if (Field96 > 0) {
            --Field96;
        }

        if (Field95 > 0) {
            --Field95;
        }

        var1.setColor(7961465);
        var1.fillRect(21, 11, 88, 16);
        var1.fillRect(20, 12, 90, 14);
        var1.setColor(this.Field16 ? 30611 : 2368548);
        var1.fillRect(21, 12, 88, 14);
        var1.setClip(21, 11, 88, 16);
        var1.translate(-Field90, 0);
        int var9;
        if ((var9 = Class21.Field10[0].Field1(this.Field11)) > 88) {
            this.Field57 -= this.Field58;
            if (Class802.Field4(this.Field57) > (var9 - 88) / 2 + 5) {
                this.Field58 = -this.Field58;
            }
        }

        Class21.Field10[0].Field1(var1, this.Field11, 66 + this.Field57, 12, 2);
        if (Field90 != 0) {
            Class21.Field10[0].Field1(var1, this.Field73, 66 + 100 * Field91, 12, 2);
        }

        var1.translate(Field90, 0);
        var1.translate(this.Field67, this.Field68);
        var1.setClip(-100, -100, 300, 300);
        switch (Field22[Field21]) {
            case 1:
                this.Field15(var1);
                break;
            case 2:
                if (!this.Field16) {
                    var1.setColor(7278866);
                    var1.fillRect(5, this.Field4 * 19, 119, 18);
                }

                var1.drawImage(Class804.Field25[1], 0, -20, 0);
                Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field78), 107, -11, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field80), 107, 8, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field82), 107, 27, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field81), 107, 46, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field83), 107, 65, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field84), 107, 84, 2);
                break;
            case 3:
                this.Field14(var1);
                break;
            case 4:
                this.Field13(var1);
                break;
            case 5:
                this.Field12(var1);
                break;
            case 6:
                this.Field11(var1);
                break;
            case 7:
                this.Field8(var1);
                break;
            case 8:
                this.Field7(var1);
                break;
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
            case 29:
            case 30:
            default:
                var1.setClip(0, 0, this.Field5 * this.Field7 + 1, 5 * this.Field8 + 1);
                var1.translate(0, -Field17);
                if ((var9 = Field17 / this.Field8) < 0) {
                    var9 = 0;
                }

                int var3 = var9 + this.Field2 / this.Field8;
                if (Field22[Field21] == 0 && var3 > 42) {
                    var3 = 42;
                }

                for (var9 = var9; var9 < var3; ++var9) {
                    for (int var4 = 0; var4 < this.Field5; ++var4) {
                        int var10002 = var4 * this.Field7;
                        int var8 = var9 * this.Field8;
                        int var7 = var10002;
                        var1.setColor(6513507);
                        var1.drawRect(var7, var8, this.Field7, this.Field8);
                        var1.setColor(8684162);
                        var1.drawRect(var7 + 1, var8 + 1, this.Field7 - 2, this.Field8 - 2);
                    }
                }

                if (!this.Field16) {
                    var1.setColor(10595790);
                    var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 1, this.Field4 / this.Field5 * this.Field8 + 1, this.Field7 - 2, this.Field8 - 2);
                }

                if (Field22[Field21] != 0) {
                    this.Field19(var1);
                } else {
                    this.Field18(var1);
                }
                break;
            case 21:
            case 25:
                this.Field6(var1);
                break;
            case 22:
            case 23:
                this.Field4(var1);
                break;
            case 26:
                this.Field5(var1);
                break;
            case 27:
                this.Field10(var1);
                break;
            case 28:
                this.Field3(var1);
                break;
            case 31:
                this.Field16(var1);
                break;
            case 32:
                this.Field2(var1);
        }

        if (this.Field14) {
            Class105.Field1(var1);
            this.Field17(var1);
        }

        super.Field1(var1);
    }

    private int Field29() {
        int var1 = -1;

        for (int var2 = 0; var2 < this.Field93.length; ++var2) {
            if (this.Field93[var2] == null) {
                ++var1;
            }
        }

        return var1;
    }

    public final void Field3(int var1) {
        this.Field5 = this.Field30.size() + this.Field27.size();
        if (this.Field5 < 6) {
            this.Field5 = 6;
        }

        this.Field6 = 5;
        if (var1 == -1) {
            this.Field4 = (this.Field6 - 1) * this.Field5;
        } else {
            this.Field4 -= this.Field6;
            if (this.Field4 > this.Field6 * this.Field5 - 1) {
                this.Field4 = this.Field6 * this.Field5 - 1;
            }

            if (this.Field4 < (this.Field6 - 1) * this.Field5) {
                this.Field4 = (this.Field6 - 1) * this.Field5;
            }

            if ((Field18 = this.Field4 % this.Field5 * this.Field7 - this.Field2 / 2) < 0) {
                Field18 = 0;
            }

            if (Field18 > Field20) {
                Field18 = Field20;
            }

            Field19 = Field18;
        }

        if ((Field20 = this.Field5 * 20 - (this.Field2 - 8)) < 0) {
            Field20 = 0;
        }

        if (var1 == -1) {
            Field79 = 0;
            Field18 = 0;
            Field17 = 0;
            Field19 = 0;
        }

    }

    public final void Field18() {
        Class537 var1 = (Class537) this.Field30.elementAt(this.Field4 % this.Field5);
        this.Field1(var1, false, this.Field4 % this.Field5 * 20 + 4, 86);
    }

    private void Field30() {
        if (!this.Field14) {
            Vector var1 = new Vector();
            Class274 var2;
            Class537 var3;
            if (this.Field6 != 1) {
                if (this.Field4 % this.Field5 >= 0 && this.Field4 % this.Field5 < this.Field30.size()) {
                    var3 = (Class537) this.Field30.elementAt(this.Field4 % this.Field5);
                    if (this.Field29() > -1) {
                        var1.addElement(new Class87("Bỏ vào", new Class511(this, var3)));
                    }

                    var1.addElement(new Class87("Thông tin ", new Class509(this)));
                } else if ((this.Field4 - this.Field30.size()) % this.Field5 >= 0 && (this.Field4 - this.Field30.size()) % this.Field5 < this.Field27.size()) {
                    var2 = (Class274) this.Field27.elementAt((this.Field4 - this.Field30.size()) % this.Field5);
                    var1.addElement(new Class87("Bỏ vào", new Class507(this, var2)));
                    var1.addElement(this.Field1((Class274) var2, this.Field4 % this.Field5 * 20 + 4, (int) 86));
                }
            } else if (this.Field4 > 5) {
                if (this.Field4 % 6 >= 0 && this.Field4 % 6 < this.Field28.size() && (var2 = (Class274) this.Field28.elementAt(this.Field4 % 6)) != null) {
                    var1.addElement(new Class87("Lấy ra", new Class505(this, var2)));
                }
            } else if (this.Field4 >= 0 && this.Field4 < this.Field93.length && (var3 = this.Field93[this.Field4]) != null) {
                var1.addElement(new Class87("Lấy ra", new Class466(this, var3)));
            }

            Class105.Field21.Field1(var1, 2);
        }
    }

    final int Field1(boolean var1) {
        int var2 = 0;
        int var5;
        if (var1) {
            for (var5 = 0; var5 < this.Field93.length; ++var5) {
                if (this.Field93[var5] != null) {
                    ++var2;
                }
            }
        } else {
            var5 = this.Field28.size();

            for (int var3 = 0; var3 < var5; ++var3) {
                Class274 var4 = (Class274) this.Field28.elementAt(var3);
                var2 += var4.Field3;
            }
        }

        return var2;
    }

    private void Field1(Graphics var1, int var2, int var3) {
        int var4 = this.Field27.size();

        for (int var5 = 0; var5 < var4; ++var5) {
            if (Field44 == 1) {
                var1.setColor(3276851);
                var1.fillRect(var2 * 20, var3, 17, 17);
            }

            if (this.Field6 != 1 && this.Field4 % this.Field5 == var2 && Field44 == 1) {
                var1.setColor(10595790);
                var1.fillRect(this.Field4 % this.Field5 * 20, 5 * this.Field8 + 1, 17, 16);
            }

            var1.drawImage(Class804.Field20, var2 * 20, var3, 0);
            Class274 var6 = (Class274) this.Field27.elementAt(var5);
            Class804.Field1(var1, Class804.Field1(var6.Field1).Field12, var2 * 20 + 10, var3 + 10);
            Class743 var7;
            String var9 = (var7 = Class804.Field1(var6.Field1)).Field10.substring(var7.Field10.length() - 1);

            try {
                int var10 = Integer.parseInt(var9);
                Class21.Field9[3].Field1(var1, String.valueOf(var10), var2 * 20, var3 - 2, 0);
            } catch (Exception var8) {
            }

            Class21.Field9[3].Field1(var1, String.valueOf(var6.Field3), var2 * 20 + 14, var3 + 15, 1);
            ++var2;
        }

    }

    private void Field2(Graphics var1) {
        var1.setClip(0, 0, this.Field2 - 4, this.Field3 + 4);

        int var2;
        for (var2 = 0; var2 < 5; ++var2) {
            var1.drawImage(Class804.Field20, this.Field94[var2][0], this.Field94[var2][1], 0);
        }

        var1.setColor(10595790);
        if (this.Field6 == 1 && this.Field4 < 5) {
            var1.fillRect(this.Field94[this.Field4][0] + 1, this.Field94[this.Field4][1] + 1, 16, 16);
        }

        for (var2 = 0; var2 < this.Field93.length; ++var2) {
            if (this.Field93[var2] != null) {
                Field1(var1, this.Field93[var2], this.Field94[var2][0] + 10, this.Field94[var2][1] + 10);
            }
        }

        byte var6 = 3;
        if (Field32 == 3) {
            var6 = 2;
        } else if (Field32 == 2) {
            var6 = 1;
        }

        Class21.Field10[var6].Field1(var1, this.Field113[var6], this.Field94[2][0] + 10, this.Field94[1][1], 2);
        Class21.Field10[0].Field1(var1, "Số Đá: " + Field34, this.Field94[2][0] + 10, 3 * this.Field8, 2);
        if (this.Field6 == 1 && this.Field4 >= 6 && this.Field4 < 12) {
            var1.fillRect(this.Field4 % 6 * 20 + 5, 4 * this.Field8 - 4, 16, 16);
        }

        for (var2 = 0; var2 < 6; ++var2) {
            var1.drawImage(Class804.Field20, var2 * 20 + 4, 4 * this.Field8 - 5, 0);
        }

        var2 = this.Field28.size();

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            Class274 var4;
            Class743 var5;
            int var8 = Integer.parseInt((var5 = Class804.Field1((var4 = (Class274) this.Field28.elementAt(var3)).Field1)).Field10.substring(var5.Field10.length() - 1));
            int var10002 = var3 % 6 * 20 + this.Field7 / 2 + 3;
            int var10003 = 4 * this.Field8;
            Class804.Field1(var1, Class804.Field1(var4.Field1).Field12, var10002, var10003 + 3);
            Class21.Field9[3].Field1(var1, String.valueOf(var8), var3 % 6 * 20 + 5, 4 * this.Field8 - 7, 0);
            Class21.Field9[3].Field1(var1, String.valueOf(var4.Field3), var3 % 6 * 20 + this.Field7 / 2 + 10, 4 * this.Field8 + 8, 1);
        }

        var1.translate(-Field19, 0);
        if (this.Field6 != 1) {
            var1.fillRect(this.Field4 % this.Field5 * 20, 5 * this.Field8 + 1, 17, 16);
        }

        var3 = 0;

        for (int var7 = 0; var7 < this.Field30.size(); ++var7) {
            Class537 var9 = (Class537) this.Field30.elementAt(var7);
            var1.drawImage(Class804.Field20, var3 * 20, 5 * this.Field8, 0);
            var9.Field1(var1, var3 * 20 + 8, this.Field8 * 5 + 8);
            ++var3;
        }

        this.Field1(var1, var3, 5 * this.Field8);

        for (var3 += this.Field27.size(); var3 < 6; ++var3) {
            var1.drawImage(Class804.Field20, var3 * 20, 5 * this.Field8, 0);
        }

    }

    private void Field3(Graphics var1) {
        Class61.Field8 = this;
        boolean var2 = false;
        var1.setClip(0, 0, this.Field2, this.Field3);

        int var6;
        for (var6 = 0; var6 < this.Field29.size(); ++var6) {
            Class383 var3 = (Class383) this.Field29.elementAt(var6);
            Class21.Field10[0].Field1(var1, var3.Field1 + ": " + var3.Field3 + " Cái.", 0, var6 * 13 + 2, 0);
        }

        var1.setColor(16766498);
        var1.fillRect(0, 4 + this.Field29.size() * 13, this.Field2, 2);
        var1.fillRect(0, 4 + this.Field8 * 3 + this.Field29.size() * 13, this.Field2, 2);
        var1.setColor(10595790);
        if (this.Field4 / this.Field5 < 2) {
            var1.translate(-Field19, 0);
            var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, this.Field29.size() * 13 + this.Field4 / this.Field5 * this.Field7 + 13, 17, 17);
        }

        var6 = 0;
        int var7;
        if ((var7 = this.Field28.size() / 2) < 6) {
            var7 = 6;
        }

        for (int var4 = 0; var4 < this.Field28.size(); ++var4) {
            Class274 var5 = (Class274) this.Field28.elementAt(var4);
            var1.drawImage(Class804.Field20, var4 % var7 * this.Field7 + 4, this.Field29.size() * 13 + var4 / var7 * this.Field7 + 13, 0);
            Class804.Field1(var1, Class804.Field1(var5.Field1).Field12, var4 % var7 * this.Field7 + this.Field7 / 2 + 4, this.Field29.size() * 13 + 13 + var4 / var7 * this.Field7 + this.Field7 / 2);
            Class21.Field9[3].Field1(var1, String.valueOf(var5.Field3), var4 % var7 * this.Field7 + this.Field7 / 2 + 4, this.Field29.size() * 13 + 13 + var4 / var7 * this.Field7 + this.Field7 / 2, 1);
            ++var6;
        }

        while (var6 < 12) {
            var1.drawImage(Class804.Field20, var6 % 6 * this.Field7 + 4, this.Field29.size() * 13 + var6 / 6 * this.Field7 + 13, 0);
            ++var6;
        }

        if (this.Field4 / this.Field5 < 2) {
            var1.translate(Field19, 0);
        }

        if (this.Field4 / this.Field5 >= 2) {
            var1.translate(-Field19, 0);
            var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, this.Field8 * 5, 17, 17);
        }

        this.Field3(var1, 0, this.Field8 * 5);

        for (var6 = 0 + this.Field27.size(); var6 < 6; ++var6) {
            var1.drawImage(Class804.Field20, var6 * 20 + 4, 5 * this.Field8, 0);
        }

    }

    private static void Field2(Graphics var0, int var1, int var2) {
        var0.setColor(10595790);
        var0.fillRect(var1, var2, 16, 16);
    }

    private void Field4(Graphics var1) {
        var1.setClip(0, 0, this.Field2, this.Field3);
        boolean var2 = false;
        boolean var3 = false;
        if (this.Field4 % this.Field5 < 3) {
            var1.translate(0, -Field17);
            if (!this.Field16) {
                Field2(var1, this.Field4 % this.Field5 * 18 + 1, this.Field4 / this.Field5 * 18 + 1);
            }
        } else {
            var1.translate(0, -this.Field112);
        }

        int var4;
        int var5;
        for (var4 = 0; var4 < this.Field6; ++var4) {
            for (var5 = 0; var5 < 3; ++var5) {
                var1.drawImage(Class804.Field20, var5 * 18, var4 * 18, 0);
            }
        }

        int var8;
        int var9;
        Class537 var10;
        for (var4 = 0; var4 < Class359.Field125.size(); ++var4) {
            var8 = var4 % 3 * 18;
            var9 = var4 / 3 * 18;
            if ((var10 = (Class537) Class359.Field125.elementAt(var4)).Field26) {
                var1.setColor(7706352);
                var1.fillRect(var8 + 2, var9 + 2, 14, 14);
            }

            var10.Field1(var1, var8 + 9, var9 + 9);
        }

        var4 = Class359.Field125.size();

        for (var5 = 0; var5 < Class585.Field37.size(); ++var5) {
            var8 = var4 % 3 * 18;
            var9 = var4 / 3 * 18;
            Class274 var6 = (Class274) Class585.Field37.elementAt(var5);
            Class804.Field1(var1, Class804.Field1(var6.Field1).Field12, var8 + 9, var9 + 9);
            Class21.Field9[3].Field1(var1, String.valueOf(var6.Field3), var8 + 18, var9 + 18 - Class21.Field9[3].Field2(), 1);
            ++var4;
        }

        if (this.Field4 % this.Field5 > 2) {
            var1.translate(0, this.Field112);
            var1.translate(0, -Field17);
        } else {
            var1.translate(0, Field17);
            var1.translate(0, -this.Field112);
        }

        int var11;
        for (var5 = 0; var5 < this.Field6; ++var5) {
            for (var11 = 0; var11 < 3; ++var11) {
                var1.setColor(6568449);
                var1.fillRect(var11 * 18 + 54, var5 * 18, 18, 18);
                var1.drawImage(Class804.Field20, var11 * 18 + 54, var5 * 18, 0);
            }
        }

        if (this.Field4 % this.Field5 > 2 && !this.Field16) {
            Field2(var1, this.Field4 % this.Field5 * 18 + 1, this.Field4 / this.Field5 * 18 + 1);
        }

        var10 = null;
        Vector var12;
        if (Field22[Field21] == 22) {
            var12 = Class359.Field128;
        } else {
            var12 = this.Field26;
        }

        for (var11 = 0; var11 < var12.size(); ++var11) {
            if (var12.elementAt(var11) instanceof Class537) {
                ((Class537) var12.elementAt(var11)).Field1(var1, var11 % 3 * 18 + 54 + 9, var11 / 3 * 18 + 9);
            } else {
                Class231 var7 = (Class231) var12.elementAt(var11);
                Class804.Field1(var1, Class804.Field1(var7.Field2).Field12, var11 % 3 * 18 + 54 + 9, var11 / 3 * 18 + 9);
            }
        }

    }

    private void Field5(Graphics var1) {
        var1.setClip(4, 0, this.Field2 - 8, this.Field3);

        int var2;
        for (var2 = 0; var2 < 5; ++var2) {
            var1.drawImage(Class804.Field20, this.Field94[var2][0], this.Field94[var2][1], 0);
        }

        var1.setColor(10595790);
        if (this.Field6 == 1 && this.Field4 < 5) {
            var1.fillRect(this.Field94[this.Field4][0] + 1, this.Field94[this.Field4][1] + 1, 16, 16);
        }

        for (var2 = 0; var2 < this.Field28.size(); ++var2) {
            Class231 var3 = (Class231) this.Field28.elementAt(var2);
            int var10002 = this.Field94[var2][0] + 10;
            short var10003 = this.Field94[var2][1];
            Class804.Field1(var1, Class804.Field1(var3.Field2).Field12, var10002, var10003 + 10);
        }

        var1.translate(-Field19, 0);
        if (this.Field6 != 1) {
            var1.fillRect(this.Field4 % this.Field5 * 20 + 4, 5 * this.Field8 + 1, 16, 16);
        }

        this.Field3(var1, 0, this.Field8 * 5);

        for (var2 = 0 + this.Field27.size(); var2 < 6; ++var2) {
            var1.drawImage(Class804.Field20, var2 * 20 + 4, 5 * this.Field8, 0);
        }

    }

    private void Field3(Graphics var1, int var2, int var3) {
        for (int var4 = 0; var4 < this.Field27.size(); ++var4) {
            if (Field43 == 1 && Field22[Field21] == 28 || Field45 == 1 && Field22[Field21] == 21 || Field46 == 1 && Field22[Field21] == 25) {
                var1.setColor(3276851);
                var1.fillRect(var2 * 20 + 4, var3, 17, 17);
            }

            if (Field43 == 1 && this.Field4 / this.Field5 >= 2 && this.Field4 % this.Field5 == var2) {
                var1.setColor(10595790);
                var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, this.Field8 * 5, 17, 17);
            }

            if (this.Field4 / this.Field5 == 4 && Field45 == 1 && Field22[Field21] == 21 && this.Field4 % this.Field5 == var2) {
                var1.setColor(10595790);
                var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, 4 * this.Field8 + 1, 17, 17);
            }

            if (this.Field4 / this.Field5 == 4 && Field46 == 1 && Field22[Field21] == 25 && this.Field4 % this.Field5 == var2) {
                var1.setColor(10595790);
                var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, 4 * this.Field8 + 1, 17, 17);
            }

            var1.drawImage(Class804.Field20, var2 * 20 + 4, var3, 0);
            Class274 var5 = (Class274) this.Field27.elementAt(var4);
            Class804.Field1(var1, Class804.Field1(var5.Field1).Field12, var2 * 20 + 10 + 4, var3 + 8);
            if (Field22[Field21] != 21) {
                Class743 var6;
                String var8 = (var6 = Class804.Field1(var5.Field1)).Field10.substring(var6.Field10.length() - 1);

                try {
                    int var9 = Integer.parseInt(var8);
                    Class21.Field9[3].Field1(var1, String.valueOf(var9), var2 * 20 + 4, var3, 0);
                } catch (Exception var7) {
                }
            }

            Class21.Field9[3].Field1(var1, String.valueOf(var5.Field3), var2 * 20 + 16 + 4, var3 + 10, 1);
            ++var2;
        }

    }

    private void Field6(Graphics var1) {
        Graphics var3 = var1;
        Class467 var2 = this;
        if (!this.Field16 && Class105.Field12 % 10 > 3 && this.Field4 / this.Field5 < 4) {
            var1.setColor(10595790);
            if (this.Field4 % this.Field5 == 1 && this.Field4 / this.Field5 != 4) {
                var1.fillRect(25, 0, 75, 86);
            } else {
                var1.fillRect(this.Field4 % this.Field5 * 50 + 4, this.Field4 / this.Field5 * this.Field8 + 1, 17, 17);
            }
        }

        for (int var4 = 0; var4 < 8; ++var4) {
            var3.drawImage(Class804.Field20, var4 / 4 * 5 * var2.Field7 + 4, var4 % 4 * var2.Field8, 0);
        }

        var3.setColor(10595790);
        var3.drawRect(25, 0, 75, 86);
        var1.setClip(4, 0, this.Field2 - 8, this.Field3);
        if (this.Field60 != null) {
            var1.drawImage(this.Field60, 63, 43, 3);
        }

        int var5;
        for (var5 = 0; var5 < Class585.Field36.size(); ++var5) {
            Class231 var6 = (Class231) Class585.Field36.elementAt(var5);
            int var10002 = var5 % 2 * 100 + 10 + 3;
            int var10003 = var5 / 2 * this.Field8;
            Class804.Field1(var1, Class804.Field1(var6.Field2).Field12, var10002, var10003 + this.Field8 / 2);
        }

        var1.translate(-Field19, 0);
        if (this.Field4 / this.Field5 == 4) {
            var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, 4 * this.Field8 + 1, 17, 17);
        }

        var5 = 0;

        for (int var7 = 0; var7 < Class359.Field125.size(); ++var7) {
            var1.drawImage(Class804.Field20, var5 * this.Field7 + 4, 4 * this.Field8, 0);
            ((Class537) Class359.Field125.elementAt(var7)).Field1(var1, var5 * 20 + 10 + 4, 4 * this.Field8 + 8);
            ++var5;
        }

        this.Field3(var1, var5, 4 * this.Field8);

        for (var5 += this.Field27.size(); var5 <= 6; ++var5) {
            var1.drawImage(Class804.Field20, var5 * 20 + 4, 4 * this.Field8, 0);
        }

    }

    private void Field7(Graphics var1) {
        var1.setClip(0, 0, this.Field2, this.Field3 + 18);
        Graphics var2 = var1;

        int var4;
        for (int var3 = 0; var3 < 5; ++var3) {
            for (var4 = 0; var4 < 6; ++var4) {
                if (var4 > 2) {
                    var2.setColor(6568449);
                    var2.fillRect(var4 * 18, var3 * 18, 18, 18);
                }

                var2.drawImage(Class804.Field20, var4 * 18, var3 * 18, 0);
            }
        }

        var1.translate(-Field19, 0);
        if (!this.Field16) {
            var1.setColor(10595790);
            var1.fillRect(this.Field4 % this.Field5 * 18 + 1, this.Field4 / this.Field5 * 18 + 1, 16, 16);
        }

        int var5 = 0;

        int var6;
        for (var6 = 0; var6 < Class359.Field125.size(); ++var6) {
            Class537 var7;
            Class798 var10 = Class804.Field2((int) (var7 = (Class537) Class359.Field125.elementAt(var6)).Field18);
            var1.drawImage(Class804.Field20, var5, 90, 0);
            if (var7.Field26) {
                var1.setColor(7706352);
                var1.fillRect(var5 + 2, 92, 14, 14);
            }

            Class381.Field1(var1, var10.Field8, var5 + 9, 99);
            var5 += 18;
        }

        for (var6 = 0; var6 < Class585.Field42.length; ++var6) {
            if (Class585.Field42[var6].Field1 - Class585.Field42[var6].Field2 > 0 && Class585.Field42[var6].Field6) {
                var1.drawImage(Class804.Field20, var5, 90, 0);
                Class381.Field1(var1, (short) (Class585.Field42[var6].Field5 + 5500), var5 + 9, 98);
                Class21.Field9[3].Field1(var1, String.valueOf(Class585.Field42[var6].Field1 - Class585.Field42[var6].Field2), var5 + 9, 99, 1);
                var5 += 18;
            }
        }

        if (var5 / 18 < 6) {
            for (var6 = 0; var6 < 6 - var5 / 18; ++var6) {
                var1.drawImage(Class804.Field20, var5 + var6 * 18, 90, 0);
            }
        }

        var1.translate(Field19, 0);
        Vector var9 = Class105.Field19.Field15.Field40;
        Vector var8 = Class105.Field19.Field15.Field41;
        var4 = var9.size();

        for (var5 = 0; var5 < var4; ++var5) {
            Field1(var1, var9.elementAt(var5), var5 % 3 * 18, var5 / 3 * 18);
        }

        var5 = var8.size();

        for (var6 = 0; var6 < var5; ++var6) {
            Field1(var1, var8.elementAt(var6), 54 + var6 % 3 * 18, var6 / 3 * 18);
        }

    }

    private static void Field1(Graphics var0, Object var1, int var2, int var3) {
        if (var1 instanceof Class537) {
            ((Class537) var1).Field1(var0, var2 + 9, var3 + 9);
        } else {
            Class641 var4 = (Class641) var1;
            Class381.Field1(var0, (short) (var4.Field5 + 5500), var2 + 9, var3 + 9);
            Class21.Field9[3].Field1(var0, String.valueOf(var4.Field1), var2 + 17, var3 + 9, 1);
        }
    }

    private void Field8(Graphics var1) {
        String[] var2 = new String[]{"Kiếm sỹ", "Chiến binh", "Pháp sư", "Đấu sỹ", "Cung thủ"};
        Class21.Field10[0].Field1(var1, var2[Class105.Field19.Field15.Field93], 60, -14, 2);
        var1.setColor(11908533);
        var1.fillRect(-8, 0, 133, 1);
        var1.fillRect(-8, 30, 133, 1);
        var1.setClip(0, 0, this.Field2, this.Field3);
        var1.translate(-Field19, 0);

        int var4;
        for (var4 = 0; var4 < this.Field5; ++var4) {
            Class185 var3 = (Class185) ((Vector) Class63.Field22.elementAt(Class105.Field19.Field15.Field93)).elementAt(var4);
            Class381.Field1.Field1(var3.Field3, var4 * 23 + this.Field7 / 2, this.Field3 / 2, 0, 3, var1);
            var1.drawImage(Class804.Field40, var4 * 23 + this.Field7 / 2, this.Field3 / 2, 3);
        }

        if (!this.Field16 && Class105.Field12 % 10 > 3) {
            var1.setColor(14139920);
            var1.drawRect(this.Field4 * this.Field7, 5, this.Field7 - 2, 20);
        }

        if (!this.Field16) {
            var1.translate(Field19, 0);
            var1.setClip(-10, 28, 133, 72);
            var1.translate(0, -Field17);
            if (this.Field74 != null) {
                for (var4 = 0; var4 < this.Field74.size(); ++var4) {
                    String var5;
                    if ((var5 = (String) this.Field74.elementAt(var4)).substring(0, 1).equals("`")) {
                        Class21.Field10[0].Field1(var1, var5.substring(1, var5.length()), -5, 30 + var4 * 12, 0);
                    } else {
                        Class21.Field8.Field1(var1, var5, -5, 30 + var4 * 12, 0);
                    }
                }
            }
        }

    }

    private void Field9(Graphics var1) {
        var1.setColor(11908533);
        var1.drawRect(0, 0, this.Field2, this.Field3 + 1);
        var1.setClip(0, 0, this.Field2, this.Field3 + 1);
        var1.translate(0, 1 - Field17);
    }

    private void Field10(Graphics var1) {
        this.Field9(var1);

        for (int var2 = 0; var2 < this.Field92.size(); ++var2) {
            String var3;
            if ((var3 = (String) this.Field92.elementAt(var2)).length() >= 2 && var3.substring(0, 1).equals("`")) {
                var3 = var3.substring(1, var3.length());
                Class21.Field10[0].Field1(var1, var3, 4, var2 * 15, 0);
            } else {
                Class21.Field8.Field1(var1, var3, 4, var2 * 15, 0);
            }
        }

    }

    private static String Field8(int var0) {
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

    private void Field11(Graphics var1) {
        this.Field9(var1);
        String var6 = Field8(0);
        String var2 = Field8(1);
        String var3 = Field8(2);
        if (var6.equals("") && var2.equals("") && var3.equals("")) {
            Class21.Field8.Field1(var1, "Chưa nhận nhiệm vụ", 8, 1, 0);
        } else {
            String[] var4 = null;
            int var5;
            if (!var6.equals("")) {
                String[] var7;
                (var4 = new String[(var7 = Class802.Field1(var6, "|")).length + 1])[0] = Class63.Field98.Field9;

                for (var5 = 0; var5 < var7.length; ++var5) {
                    var4[var5 + 1] = var7[var5];
                }
            }

            int var8 = 0;
            if (var4 != null) {
                Class21.Field10[0].Field1(var1, var4[0], 4, 0, 0);

                for (var5 = 1; var5 < var4.length; ++var5) {
                    Class21.Field8.Field1(var1, var4[var5], 4, var5 * 15, 0);
                }

                var8 = var4.length;
            }

            var4 = null;
            int var9;
            String[] var10;
            if (!var2.equals("")) {
                (var4 = new String[(var10 = Class802.Field1(var2, "|")).length + 1])[0] = Class63.Field99.Field9;

                for (var9 = 0; var9 < var10.length; ++var9) {
                    var4[var9 + 1] = var10[var9];
                }
            }

            if (var4 != null) {
                Class21.Field10[0].Field1(var1, var4[0], 4, var8 * 15, 0);

                for (var5 = 1; var5 < var4.length; ++var5) {
                    Class21.Field8.Field1(var1, var4[var5], 4, (var5 + var8) * 15, 0);
                }

                var8 += var4.length;
            }

            var4 = null;
            if (!var3.equals("")) {
                (var4 = new String[(var10 = Class802.Field1(var3, "|")).length + 1])[0] = Class63.Field100.Field9;

                for (var9 = 0; var9 < var10.length; ++var9) {
                    var4[var9 + 1] = var10[var9];
                }
            }

            if (var4 != null) {
                Class21.Field10[0].Field1(var1, var4[0], 4, var8 * 15, 0);

                for (var5 = 1; var5 < var4.length; ++var5) {
                    Class21.Field8.Field1(var1, var4[var5], 4, (var5 + var8) * 15, 0);
                }
            }

        }
    }

    private void Field12(Graphics var1) {
        this.Field9(var1);
        int var2;
        if ((var2 = Class359.Field127.size()) <= 0) {
            Class21.Field8.Field1(var1, "Chưa có nhóm", 8, 5, 0);
        } else {
            if (!this.Field16) {
                var1.setColor(6448384);
                var1.fillRect(2, this.Field4 << 5, 131, 32);
            }

            for (int var4 = 0; var4 < var2; ++var4) {
                Class795 var3 = (Class795) Class359.Field127.elementAt(var4);
                Class21.Field8.Field1(var1, "NV:" + var3.Field2, 8, var4 * 33, 0);
                Class21.Field8.Field1(var1, "LV: " + var3.Field3, 8, (var4 << 1) + 1 << 4, 0);
                var1.setColor(16777215);
                var1.fillRect(2, ((var4 << 1) + 1 << 4) + 15, 131, 1);
            }

        }
    }

    private void Field13(Graphics var1) {
        this.Field9(var1);
        int var2;
        if (this.Field101 != null) {
            for (var2 = 0; var2 < this.Field101.length; ++var2) {
                Class21.Field8.Field1(var1, this.Field101[var2], 4, 5 + var2 * 12, 0);
            }
        }

        if (Field9 != null) {
            for (var2 = 0; var2 < Field9.length; ++var2) {
                Class21.Field8.Field1(var1, Field9[var2], 4, 5 + (var2 + this.Field101.length + 1) * 12, 0);
            }
        }

    }

    private void Field14(Graphics var1) {
        Class21.Field7.Field1(var1, String.valueOf(Class105.Field19.Field15.Field79), 105, -8, 2);
        Class21.Field10[0].Field1(var1, "Điểm kỹ năng: ", 60, -14, 2);
        var1.setColor(11908533);
        var1.fillRect(-8, 0, 133, 1);
        var1.fillRect(-8, 30, 133, 1);
        var1.setClip(-3, 0, this.Field2 + 6, this.Field3);
        var1.translate(-Field19, 0);

        int var2;
        for (var2 = 0; var2 < this.Field5; ++var2) {
            Class381.Field1.Field1(var2, var2 * 23 + this.Field7 / 2, this.Field3 / 2, 0, 3, var1);
            var1.drawImage(Class804.Field40, var2 * 23 + this.Field7 / 2, this.Field3 / 2, 3);
            Class21.Field9[1].Field1(var1, String.valueOf(Class359.Field97[var2]), var2 * 23 + this.Field7 - 4, this.Field3 / 2 + 5, 1);
        }

        if (!this.Field16 && Class105.Field12 % 10 > 3) {
            var1.setColor(14139920);
            var1.drawRect(this.Field4 * this.Field7, 5, this.Field7 - 2, this.Field8 + 1);
        }

        if (!this.Field16) {
            if (this.Field4 < 0) {
                this.Field4 = 0;
            } else if (this.Field4 > Class602.Field11[Class105.Field19.Field15.Field93].length - 1) {
                this.Field4 = Class602.Field11[Class105.Field19.Field15.Field93].length - 1;
            }

            var1.translate(Field19, 0);
            var1.setClip(-11, 32, 138, 68);
            String var5 = Class602.Field11[Class105.Field19.Field15.Field93][this.Field4];
            byte var3;
            if ((var3 = Class359.Field97[this.Field4]) == 9) {
                var5 = var5 + " MAX" + var3;
            } else if (var3 >= 1) {
                var5 = var5 + " lv " + var3;
            }

            String[] var6 = Class105.Field19.Field15.Field10(this.Field4);
            var1.translate(0, -Field17);
            Class21.Field10[0].Field1(var1, var5, -5, 29 + (this.Field102 ? Field17 : 0), 0);
            var2 = 40;

            for (int var4 = 0; var4 < var6.length; ++var4) {
                Class21.Field8.Field1(var1, var6[var4], -5, var2 + (this.Field102 ? Field17 : 0), 0);
                var2 += 12;
            }
        }

    }

    private void Field15(Graphics var1) {
        Field39.Field1(var1, (short) 58, (short) 90);
        if (this.Field52 != null && Class105.Field12 % 16 >= 8) {
            var1.drawImage(this.Field52, this.Field2 / 2, 0, 17);
        }

        var1.drawImage(Class804.Field25[0], 0, 0, 0);
        var1.drawImage(Class804.Field18, 25, 83, 0);
        if (!this.Field16 && Class105.Field12 % 10 > 3) {
            var1.setColor(10595790);
            if (this.Field4 % 3 != 1 && this.Field4 != 4) {
                var1.fillRect(3 + (this.Field4 % this.Field5 - (this.Field4 % this.Field5 > 0 ? 1 : 0)) * this.Field7, 3 + this.Field4 / this.Field5 * 21, 16, 16);
            } else if (this.Field4 == 4) {
                var1.fillRect(26, 84, 16, 16);
            } else {
                var1.fillRect(this.Field7 - 23, 84, 16, 16);
            }
        }

        if (Field39.Field98 != null) {
            int var5 = Field39.Field98.size();

            for (int var2 = 0; var2 < var5; ++var2) {
                Class537 var3;
                Class798 var4;
                if ((var4 = Class804.Field2((int) (var3 = (Class537) Field39.Field98.elementAt(var2)).Field18)).Field3 == 8) {
                    if (var3.Field38 == 1) {
                        Field1((Graphics) var1, (Class537) var3, 107, 52);
                    } else {
                        Field1((Graphics) var1, (Class537) var3, 107, 73);
                    }
                } else {
                    Field1(var1, var3, Field114[var4.Field3], Field115[var4.Field3]);
                }
            }
        }

        if (Field39.Field63 > -1 && !Class105.Field19.Field15.Field141) {
            Class381.Field1(var1, (short) (Field39.Field64 + 7500), 82, 92);
        }

    }

    private void Field16(Graphics var1) {
        if (Field39 != null && Field39.Field103 != null && (Field39.Field167 != -1 || Field39.Field106 > -1)) {
            var1.drawRegion(Field39.Field103, 0, Field39.Field92 * this.Field69, Field39.Field91, Field39.Field92, 0, Class804.Field25[0].getWidth() / 2, Class804.Field25[0].getHeight() / 2, 3);
        }

        var1.drawImage(Class804.Field25[0], 0, 0, 0);
        var1.setColor(2368548);

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            var1.fillRect(3 + var2 % 2 * this.Field7, 3 + var2 / 2 * 21, 16, 16);
        }

        if (!this.Field16 && Class105.Field12 % 10 > 3) {
            var1.setColor(10595790);
            var1.fillRect(3 + this.Field4 % this.Field5 * this.Field7, 3 + this.Field4 / this.Field5 * 21, 16, 16);
        }

        if (Field39 != null) {
            if (Field39.Field99 != null && (Field39.Field167 != -1 || Field39.Field106 > -1)) {
                int var5 = Field39.Field99.size();

                for (var2 = 0; var2 < var5; ++var2) {
                    Class537 var3;
                    Class798 var4;
                    if ((var3 = (Class537) Field39.Field99.elementAt(var2)) != null && (var4 = Class804.Field2((int) var3.Field18)) != null) {
                        Field1(var1, var3, Field114[var4.Field3], Field115[var4.Field3]);
                    }
                }
            }

            if (Field39.Field63 > -1 && Field39 != null && (Field39.Field167 != -1 || Field39.Field106 > -1)) {
                Class381.Field1(var1, (short) (Field39.Field64 + 7500), 82, 92);
            }
        }

    }

    private static void Field1(Graphics var0, Class537 var1, int var2, int var3) {
        Class798 var4 = Class804.Field2((int) var1.Field18);
        Class381.Field1(var0, var4.Field8, var2, var3);
    }

    private void Field17(Graphics var1) {
        var1.setColor(25695);
        var1.fillRect(this.Field63, this.Field64, this.Field65, this.Field66 + this.Field24 * 15);
        var1.setColor(16774720);
        var1.drawRect(this.Field63, this.Field64, this.Field65 - 1, this.Field66 - 1 + this.Field24 * 15);
        int var2 = 0;
        var1.setClip(this.Field63, this.Field64, this.Field65, this.Field66 + this.Field24 * 15 - 2);
        var1.translate(0, -Field84);

        for (int var3 = 0; var3 < this.Field72.length + this.Field24; ++var3) {
            if (var3 == 1 && this.Field97 != null && this.Field97.length > 0) {
                for (int var4 = 0; var4 < this.Field97.length; ++var4) {
                    var1.drawImage(Class804.Field39, this.Field63 + 12 + var4 * 20, this.Field64 + 12 + var2, 3);
                    if (this.Field97[var4] != -1) {
                        Class804.Field1(var1, this.Field97[var4], this.Field63 + 12 + var4 * 20, this.Field64 + 12 + var2);
                    }
                }

                var2 += 18;
            }

            if (!this.Field72[var3].equals("")) {
                byte var6 = (byte) (this.Field72[var3].charAt(0) - 48);
                byte var5 = 1;
                if (!Field1(this.Field72[var3].charAt(0))) {
                    var6 = 0;
                    var5 = 0;
                }

                Class21.Field10[var6 >= 6 ? 0 : var6].Field1(var1, this.Field72[var3].substring(var5), this.Field63 + 4, this.Field64 + 4 + var2, 0);
                var2 += 15;
            }
        }

        if (this.Field24 < 0) {
            ++this.Field24;
        }

    }

    public static boolean Field1(char var0) {
        return var0 >= '0' && var0 <= '9';
    }

    private void Field18(Graphics var1) {
        try {
            int var2;
            if ((var2 = Field17 / this.Field8 * this.Field5) < 0) {
                var2 = 0;
            }

            int var3;
            if ((var3 = var2 + this.Field5 * this.Field6) > 42) {
                var3 = 42;
            }

            if (this.Field47 * 42 + 42 > this.Field99) {
                var3 = this.Field98;
            }

            for (var2 = var2; var2 < var3; ++var2) {
                if (this.Field41) {
                    return;
                }

                int var4;
                Class87 var6;
                if ((var4 = var2 + this.Field47 * 42) < this.Field12.size() && (var6 = (Class87) this.Field12.elementAt(var4)) != null) {
                    var6.Field1(var1, var2 % this.Field5 * this.Field7 + this.Field7 / 2, var2 / this.Field5 * this.Field8 + this.Field8 / 2);
                }
            }

        } catch (Exception var5) {
        }
    }

    private void Field19(Graphics var1) {
        try {
            int var2;
            if ((var2 = Field17 / this.Field8 * this.Field5) < 0) {
                var2 = 0;
            }

            int var3;
            if ((var3 = var2 + this.Field5 * this.Field6) > this.Field12.size()) {
                var3 = this.Field12.size();
            }

            for (var2 = var2; var2 < var3; ++var2) {
                if (this.Field41) {
                    return;
                }

                ((Class87) this.Field12.elementAt(var2)).Field1(var1, var2 % this.Field5 * this.Field7 + this.Field7 / 2, var2 / this.Field5 * this.Field8 + this.Field8 / 2);
            }

        } catch (Exception var5) {
        }
    }

    private void Field31() {
        this.Field12.removeAllElements();
        int var1 = Class804.Field6.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class743 var3 = (Class743) Class804.Field6.elementAt(var2);
            if (var3.Field7 == Field21 && var3.Field17) {
                this.Field12.addElement(new Class513(this, "", new Class463(this, var3, var2), var3));
            }
        }

    }

    public final void Field19() {
        this.Field14 = false;
        this.Field97 = null;
    }

    private void Field1(String var1, int var2, int var3) {
        if (!this.Field14) {
            this.Field14 = true;
            var1 = var1.replace('Â', 'â');
            this.Field65 = 125;
            this.Field63 = var2 + this.Field61 + this.Field67 - this.Field65 / 2 + 9;
            this.Field64 = var3 + this.Field62 + this.Field68 + 18;
            this.Field72 = Class21.Field2.Field1(var1, this.Field65 - 10);
            this.Field66 = this.Field72.length * 15 + 8 + (this.Field97 != null ? 16 : 0);
            this.Field63 -= Field19;
            if (1 + this.Field63 + this.Field65 > Class105.Field13) {
                this.Field63 = Class105.Field13 - this.Field65 - 1;
            } else if (1 + this.Field63 < 0) {
                this.Field63 = -1;
            }

            this.Field64 -= Field17;
            if (this.Field24 == 0) {
                this.Field24 = -(this.Field72.length - 1);
            }

            Field83 = 0;
            Field84 = 0;
            Field87 = 0;
            if (this.Field66 > 100) {
                if ((Field87 = this.Field66 - 100) < 0) {
                    Field87 = 0;
                }

                this.Field66 = 100;
            }

            if (this.Field64 + this.Field66 > Class105.Field14 - 20) {
                this.Field64 = Class105.Field14 - 20 - this.Field66;
            }

        } else {
            this.Field24 = 0;
            this.Field19();
        }
    }

    public static int Field4(int var0) {
        return Class105.Field19.Field15.Field121[var0];
    }

    private Vector Field32() {
        Vector var1 = new Vector();
        int var2 = 0;
        int var3 = Class585.Field42.length;

        int var4;
        for (var4 = 1; var4 < var3; ++var4) {
            if (Field4(var4) > 0) {
                var1.addElement(new Class421(this, "", new Class469(this, var4, var2), var4));
                ++var2;
            }
        }

        var4 = Class585.Field39.size();

        int var5;
        for (var5 = 0; var5 < var4; ++var5) {
            Class274 var6 = (Class274) Class585.Field39.elementAt(var5);
            var1.addElement(new Class417(this, "", new Class419(this, var6, var2), var6));
            ++var2;
        }

        var5 = Class585.Field38.size();

        int var11;
        for (var11 = 0; var11 < var5; ++var11) {
            Class274 var9;
            Class743 var7 = Class804.Field1((var9 = (Class274) Class585.Field38.elementAt(var11)).Field1);
            var1.addElement(new Class429(this, "", new Class460(this, var9, var2), var9, var2, var7));
            ++var2;
        }

        var11 = Class585.Field37.size();

        for (var3 = 0; var3 < var11; ++var3) {
            Class274 var13;
            Class743 var10 = Class804.Field1((var13 = (Class274) Class585.Field37.elementAt(var3)).Field1);
            var1.addElement(new Class425(this, "", new Class427(this, var13, var2), var13, var10));
            ++var2;
        }

        var3 = Class359.Field126.size();

        for (var4 = 0; var4 < var3; ++var4) {
            Class42 var12 = (Class42) Class359.Field126.elementAt(var4);
            var1.addElement(new Class457(this, "", new Class423(this, var12, var2), var12));
            ++var2;
        }

        var4 = Class359.Field125.size();

        int var15;
        for (var15 = 0; var15 < var4; ++var15) {
            Class537 var14 = (Class537) Class359.Field125.elementAt(var15);
            var1.addElement(new Class436(this, "", new Class437(this, var14, var2), var14));
            ++var2;
        }

        if (Class585.Field43 != null) {
            var3 = Class585.Field43.length;

            for (var15 = 0; var15 < var3; ++var15) {
                if (Class585.Field43[var15] > 0) {
                    var4 = Class112.Field2[var15] + 8000;
                    String var8 = String.valueOf(Class585.Field43[var15]);
                    var1.addElement(new Class442(this, "", new Class443(this, var15, var2), var4, var8));
                }
            }
        }

        return var1;
    }

    public final void Field1(short var1, int var2, int var3) {
        Class743 var4;
        String var5 = Class537.Field1((var4 = Class804.Field1(var1)).Field10, "0");
        var5 = var5 + Class537.Field1(var4.Field11, "0");
        if (this.Field15) {
            var5 = var5 + Class537.Field1("Giá bán lại: " + var4.Field18 / 5, "0");
        }

        this.Field1(var5, var2, var3);
    }

    public final void Field2(short var1, int var2, int var3) {
        Class743 var4;
        String var5 = Class537.Field1((var4 = Class804.Field1(var1)).Field10, "0");
        var5 = var5 + " - Đã khóa";
        var5 = var5 + Class537.Field1(var4.Field11, "0");
        if (this.Field15) {
            var5 = var5 + Class537.Field1("Giá bán lại: " + var4.Field18 / 5, "0");
        }

        this.Field1(var5, var2, var3);
    }

    public final void Field1(Class231 var1, int var2, int var3) {
        Class743 var5;
        String var4 = Class537.Field1((var5 = Class804.Field1(var1.Field2)).Field10, "0");
        var4 = var4 + Class537.Field1(var5.Field11, "0");
        if (this.Field15) {
            var4 = var4 + Class537.Field1("Giá bán : " + var1.Field3, "0");
        }

        this.Field1(var4, var2, var3);
    }

    public final void Field1(short var1, int var2) {
        Class743 var3;
        String var4 = Class537.Field1((var3 = Class804.Field2(var1)).Field10, "0");
        var4 = var4 + Class537.Field1(var3.Field11, "0");
        if (this.Field15) {
            var4 = var4 + Class537.Field1("Giá bán lại: " + Class105.Field1((long) (var3.Field18 / 5)), "0");
        }

        this.Field1(var4, var2 % this.Field5 * 18, var2 / this.Field5 * 18);
    }

    public static String Field5(int var0) {
        String var1 = "0" + Class112.Field1[var0];
        return var1 + "\nSố lượng: " + Class585.Field43[var0];
    }

    public final void Field20() {
        if (!this.Field16) {
            this.Field19();
            int var1;
            int var2 = var1 = this.Field4 + (Field22[Field21] == 0 ? this.Field47 * 42 : 0);
            int var3 = 0;
            int var4 = Class105.Field19.Field15.Field121.length;

            int var5;
            Vector var8;
            for (var5 = 1; var5 < var4; ++var5) {
                if (Class105.Field19.Field15.Field121[var5] > 0) {
                    if (var1 == var3) {
                        var8 = new Vector();
                        if (var5 >= 14 && var5 <= 18 && Class105.Field19.Field15.Field200 > 0) {
                            var8.addElement(new Class87("Tháo khăn", new Class677(this)));
                        } else {
                            var8.addElement(new Class87("Sử dụng", new Class682(this, var5)));
                        }

                        if (var5 < 14 || var5 >= 21) {
                            var8.addElement(new Class87("Cho vào phím tắt", new Class681(this, var5)));
                        }

                        var8.addElement(new Class87("Bỏ ra đất", new Class685(this, var5)));
                        Class105.Field21.Field1(var8, 2);
                        return;
                    }

                    ++var3;
                }
            }

            var2 -= var3;
            var5 = Class585.Field39.size();
            Vector var11;
            if (var2 < var5) {
                Class274 var19 = (Class274) Class585.Field39.elementAt(var2);
                (var11 = new Vector()).addElement(new Class87("Sử dụng", new Class440(this, var19)));
                var11.addElement(this.Field1((Class274) var19, 1, (byte) 0));
                Class105.Field21.Field1(var11, 2);
                return;
            }

            var2 -= Class585.Field39.size();
            int var6 = Class585.Field38.size();
            Class743 var22;
            if (var2 < var6) {
                Class274 var14 = (Class274) Class585.Field38.elementAt(var2);
                if (this.Field15) {
                    Class743 var17 = Class804.Field1(var14.Field1);
                    Class105.Field2("Bạn có muốn bán vật phẩm này với giá " + var17.Field18 / 5 + "$ không?", new Class438(this, var14, var1));
                    return;
                }

                Vector var15 = new Vector();
                if ((var22 = Class804.Field1(var14.Field1)) != null && var22.Field8 == 4) {
                    Class87 var18 = new Class87("Sử dụng", new Class451(this, var14));
                    var15.addElement(var18);
                }

                var15.addElement(this.Field1((Class274) var14, 0, (byte) 1));
                Class105.Field21.Field1(var15, 2);
                return;
            }

            var2 -= Class585.Field38.size();
            var3 = Class585.Field37.size();
            if (var2 < var3) {
                Class274 var12 = (Class274) Class585.Field37.elementAt(var2);
                if (this.Field15) {
                    var22 = Class804.Field1(var12.Field1);
                    Class105.Field2("Bạn có muốn bán vật phẩm này với giá " + var22.Field18 / 5 + "$ không?", new Class449(this, var12, var1));
                    return;
                }

                Vector var21 = new Vector();
                Class743 var16;
                if ((var16 = Class804.Field1(var12.Field1)) != null && var16.Field8 == 4) {
                    Class87 var13 = new Class87("Sử dụng", new Class447(this, var12));
                    var21.addElement(var13);
                }

                var21.addElement(this.Field1((Class274) var12, 0, (byte) 0));
                Class105.Field21.Field1(var21, 2);
                return;
            }

            var2 -= Class585.Field37.size();
            var4 = Class359.Field126.size();
            if (var2 < var4) {
                Class42 var20 = (Class42) Class359.Field126.elementAt(var2);
                (var8 = new Vector()).addElement(new Class87("Sử dụng", new Class445(this, var20)));
                var8.addElement(new Class87("Thêm vào Slot 0", new Class27(this, var20, 0)));
                var8.addElement(new Class87("Thêm vào Slot 1", new Class27(this, var20, 1)));
                var8.addElement(new Class87("Thêm vào Slot 2", new Class27(this, var20, 2)));
                var8.addElement(new Class87("Thêm vào Slot 3", new Class27(this, var20, 3)));
                var8.addElement(new Class87("Thêm vào Slot 4", new Class27(this, var20, 4)));
                Class105.Field21.Field1(var8, 2);
                return;
            }

            var2 -= Class359.Field126.size();
            var5 = Class359.Field125.size();
            if (var2 < var5) {
                Class537 var10 = (Class537) Class359.Field125.elementAt(var2);
                if (!this.Field15) {
                    (var11 = new Vector()).addElement(new Class87("Sử dụng", new Class701(this, var10)));
                    if (var10.Field37 == 1 && var10.Field25 >= 50 && !Class537.Field2(var10.Field2().Field3)) {
                        var11.addElement(new Class87("Tách trang bị", new Class700(this, var10)));
                    }

                    var11.addElement(new Class87("Bỏ ra đất", new Class702(this, var10)));
                    if (var10.Field37 != 0 && var10.Field37 != 4) {
                        if (var10.Field37 == 1) {
                            var11.addElement(new Class87("Thăng cấp thường", new Class704(this, var10)));
                            var11.addElement(new Class87("Thăng cấp giữ thuộc tính", new Class715(this, var10)));
                        }

                        if (var10.Field4.equals("")) {
                            var11.addElement(new Class87("Đóng dấu", new Class713(this, var10)));
                        }

                        if (!var10.Field4.toLowerCase().equals(Class105.Field19.Field15.Field65.toLowerCase())) {
                            var11.addElement(new Class87("Đóng dấu lại", new Class667(this, var10)));
                        } else {
                            Class798 var7;
                            if ((var7 = Class804.Field2((int) var10.Field18)).Field3 >= 3 && var7.Field3 <= 7 || var7.Field3 == 8 || var7.Field3 == 9) {
                                var11.addElement(new Class87("Sửa thuộc tính kỹ năng", new Class717(this, var10)));
                            }
                        }

                        if (var10.Field29 == 0) {
                            var11.addElement(new Class87("Khoá", new Class670(this, var10)));
                        }

                        if (var10.Field29 == 1) {
                            var11.addElement(new Class87("Khoá lại", new Class674(this, var10)));
                        }

                        var11.addElement(new Class87("Sửa thuộc tính khác", new Class673(this, var10)));
                    }

                    Class105.Field21.Field1(var11, 2);
                    return;
                }

                Class798 var9 = Class804.Field2((int) var10.Field18);
                Class105.Field2("Bạn có muốn bán vật phẩm này với giá " + var9.Field10 / 5 + "$ không?", new Class676(this, var10, var1));
            }
        }

    }

    private Class87 Field1(Class274 var1, int var2, byte var3) {
        return new Class87("Bỏ ra đất", new Class675(this, var1, var2, var3));
    }

    public final void Field1(Class537 var1) {
        Class798 var3;
        if ((var3 = Class804.Field2((int) var1.Field18)).Field5 != 0 && var3.Field5 != Class105.Field19.Field15.Field68) {
            Class105.Field1("Vật phẩm này chỉ dành cho " + Class804.Field8[var3.Field5] + ".");
        } else {
            short var2;
            if (var3.Field12 != -1 && var3.Field12 != Class105.Field19.Field15.Field93 && (var2 = var3.Field3) >= 3 && var2 <= 7) {
                Class105.Field1("Vật phẩm này chỉ dành cho " + Class60.Field2[var3.Field12][Class60.Field3].Field1 + ".");
            } else if (var3.Field6 > Class105.Field19.Field15.Field22) {
                Class105.Field1("Bạn phải đạt cấp " + var3.Field6 + " để có thể dùng.");
            } else {
                Class263.Field1().Field7(var1.Field9);
            }
        }
    }

    private void Field1(Class537 var1, boolean var2, int var3, int var4) {
        this.Field97 = null;
        if (var1.Field36 > 0) {
            this.Field97 = new byte[var1.Field36];

            for (int var5 = 0; var5 < var1.Field36; ++var5) {
                this.Field97[var5] = -1;
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

                        this.Field97[var8++] = Class804.Field56[var7.Field3() - 10];
                        ++var6;
                    }
                }
            }
        }

        this.Field1(var1.Field1(var2), var3, var4);
        if (!var1.Field32) {
            var1.Field32 = true;
            Class263.Field1().Field1(var1.Field9, Field39 == null ? Class105.Field19.Field15.Field189 : Field39.Field189);
        }

    }

    private void Field1(Vector var1, int var2) {
        this.Field12.removeAllElements();
        int var3 = 0;
        int var7 = var1.size();

        for (int var4 = 0; var4 < var7; ++var4) {
            Class537 var5;
            if (Class804.Field2((int) (var5 = (Class537) Class105.Field19.Field21.elementAt(var4)).Field18).Field3 == var2 || var2 == -1) {
                int var6 = var3++;
                this.Field12.addElement(new Class764(this, "", new Class753(this, var5, var6), var5));
            }
        }

    }

    private void Field9(int var1) {
        super.Field103 = new Class87("Mua", new Class758(this, var1));
    }

    private void Field2(Vector var1) {
        this.Field12.removeAllElements();
        int var2 = var1.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class743 var4 = (Class743) var1.elementAt(var3);
            if (var4.Field17) {
                this.Field12.addElement(new Class725(this, "", new Class762(this, var4, var3), var4));
            }
        }

    }

    private void Field33() {
        this.Field12.removeAllElements();
        int var1 = Class105.Field19.Field21.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class537 var3 = (Class537) Class105.Field19.Field21.elementAt(var2);
            this.Field12.addElement(new Class587(this, "", new Class588(this, var3), var3));
        }

    }

    public final void Field21() {
        if (this.Field13.size() > 0) {
            if (Field22[Field21] == 10) {
                Class263.Field1().Field1(this.Field13);
            } else if (Field22[Field21] == 19) {
                Class263.Field1().Field3(this.Field13);
            } else {
                Class263.Field1().Field2(this.Field13);
            }

            this.Field13.removeAllElements();
        }

        if (Field22[Field21] != 21 && Field22[Field21] != 25) {
            if (Field22[Field21] == 22) {
                Class105.Field19.Field28.Field9();
            } else {
                if (Field22[Field21] == 8) {
                    Class105.Field19.Field28.Field10((int) Class105.Field19.Field15.Field189);
                    Class105.Field19.Field15.Field139 = false;
                }

            }
        } else {
            if (Field22[Field21] == 21) {
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
            this.Field60 = null;
            this.Field100 = -1;
        }
    }

    public static void Field22() {
        Class585.Field36.removeAllElements();
    }

    private void Field34() {
        this.Field92 = new Vector();
        String var1 = Field8(0);
        String var2 = Field8(1);
        String var3 = Field8(2);
        int var4;
        String[] var5;
        if (!var1.equals("")) {
            var5 = Class802.Field1(var1, "|");
            this.Field92.addElement(Class63.Field98.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field92.addElement(var5[var4]);
            }
        }

        if (!var2.equals("")) {
            var5 = Class802.Field1(var2, "|");
            this.Field92.addElement(Class63.Field99.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field92.addElement(var5[var4]);
            }
        }

        if (!var3.equals("")) {
            var5 = Class802.Field1(var3, "|");
            this.Field92.addElement(Class63.Field100.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field92.addElement(var5[var4]);
            }
        }

    }

    public final void Field1(String var1) {
        this.Field92 = new Vector();
        String[] var3 = Class21.Field10[0].Field1(var1, 100);

        for (int var2 = 0; var2 < var3.length; ++var2) {
            this.Field92.addElement(var3[var2]);
        }

        Class105.Field7();
    }

    static void Field1(Class467 var0, String[] var1) {
        var0.Field101 = null;
    }

    static void Field1(Class467 var0, Vector var1) {
        var0.Field92 = null;
    }

    static void Field1(Class467 var0) {
        Vector var1 = new Vector();
        int var2 = var0.Field4 / var0.Field5;
        int var3 = var0.Field4 % var0.Field5;
        int var4 = (var2 << 1) + var3 / 2;
        if (var2 == 4 && (var0.Field100 == -1 || var3 >= Class359.Field125.size()) || var2 != 4 && (var3 == 1 && var0.Field100 != -1 || var3 != 1 && var4 < Class585.Field36.size())) {
            var1.addElement(new Class87(var2 != 4 ? "Lấy ra" : "Bỏ vào", new Class526(var0, var2, var3)));
        }

        if (var2 == 4 || var3 != 1 && var4 < Class585.Field36.size() || var0.Field100 != -1 && var3 == 1) {
            var1.addElement(new Class87("Thông tin", new Class525(var0)));
        }

        Class105.Field21.Field1(var1, 3);
    }

    static void Field2(Class467 var0) {
        Vector var1 = new Vector();
        if (var0.Field6 != 1) {
            if (var0.Field4 % var0.Field5 < var0.Field27.size()) {
                Class274 var2 = (Class274) var0.Field27.elementAt(var0.Field4 % var0.Field5);
                var1.addElement(new Class87("Bỏ vào", new Class604(var0, var2)));
                var1.addElement(var0.Field1((Class274) var2, var0.Field4 % var0.Field5 * 20 + 4, (int) 86));
            }
        } else if (var0.Field4 < var0.Field28.size()) {
            Class231 var4 = (Class231) var0.Field28.elementAt(var0.Field4);
            var1.addElement(new Class87("Lấy ra", new Class610(var0, var4)));
            Class274 var3;
            (var3 = new Class274()).Field1 = var4.Field2;
            var1.addElement(var0.Field1((Class274) var3, var0.Field94[var0.Field4][0], (int) var0.Field94[var0.Field4][1]));
        }

        Class105.Field21.Field1(var1, 2);
    }

    static void Field3(Class467 var0) {
        var0.Field30();
    }

    static void Field1(Class467 var0, Class274 var1) {
        var1 = var1;
        var0 = var0;
        --var1.Field3;
        if (var1.Field3 <= 0) {
            var0.Field28.removeElement(var1);
        }

        boolean var2 = false;
        int var3 = var0.Field27.size();

        for (int var4 = 0; var4 < var3; ++var4) {
            Class274 var5;
            if ((var5 = (Class274) var0.Field27.elementAt(var4)).Field1 == var1.Field1) {
                ++var5.Field3;
                var2 = true;
                break;
            }
        }

        if (!var2) {
            Class274 var6 = new Class274(var1.Field1);
            Class274.Field1(var1, var6);
            var6.Field3 = 1;
            var0.Field27.addElement(var1);
        }

    }

    static void Field4(Class467 var0) {
        var0.Field28();
    }

    static void Field1(Class467 var0, String var1, int var2, int var3) {
        var0.Field1(var1, var2, var3);
    }

    static void Field1(Class467 var0, Class537 var1, boolean var2, int var3, int var4) {
        var0.Field1(var1, var2, var3, var4);
    }

    static void Field1(Class467 var0, int var1) {
        var0.Field100 = var1;
    }

    static int Field5(Class467 var0) {
        return var0.Field100;
    }

    static void Field6(Class467 var0) {
        var0 = var0;
        int var1 = 0;
        boolean var2 = false;
        int var3;
        int var4;
        Class537 var5;
        int var7;
        if (var0.Field4 % 3 == 1) {
            if (Field39.Field141 && var0.Field4 != 4) {
                var7 = (var0.Field4 / 3 << 1) + (var0.Field4 % 3 - (var0.Field4 % 3 > 0 ? 1 : 0));
                var3 = Field39.Field98.size();

                for (var4 = 0; var4 < var3; ++var4) {
                    if (Class804.Field2((int) (var5 = (Class537) Field39.Field98.elementAt(var4)).Field18).Field3 == 13) {
                        var0.Field1(var5, false, Field118[var7][0] + 5, Field118[var7][1] - 2);
                    }
                }

            } else {
                Vector var8;
                if (Field22.length == 1) {
                    if (var0.Field4 != 4) {
                        (var8 = new Vector()).addElement(new Class87("Thông tin", new Class687(var0)));
                        var8.addElement(new Class87("Trang bị linh thú", new Class686(var0)));
                        Class105.Field21.Field1(var8, 3);
                    } else {
                        var3 = Field39.Field98.size();

                        for (var4 = 0; var4 < var3; ++var4) {
                            if (Class804.Field2((int) (var5 = (Class537) Field39.Field98.elementAt(var4)).Field18).Field3 == 19) {
                                var0.Field1(var5, false, Field118[9][0] + 5, Field118[9][1] - 2);
                                return;
                            }
                        }

                    }
                } else if (var0.Field4 != 4) {
                    (var8 = new Vector()).addElement(new Class87("Linh thú", new Class689(var0)));
                    var8.addElement(new Class87("Thú cưng", new Class688(var0)));
                    Class105.Field21.Field1(var8, 3);
                } else {
                    var3 = Field39.Field98.size();

                    for (var4 = 0; var4 < var3; ++var4) {
                        if (Class804.Field2((int) (var5 = (Class537) Field39.Field98.elementAt(var4)).Field18).Field3 == 19) {
                            var0.Field1(var5, false, Field118[9][0] + 5, Field118[9][1] - 2);
                            return;
                        }
                    }

                }
            }
        } else {
            var7 = (var0.Field4 / 3 << 1) + (var0.Field4 % 3 - (var0.Field4 % 3 > 0 ? 1 : 0));
            var3 = Field39.Field98.size();

            for (var4 = 0; var4 < var3; ++var4) {
                Class798 var6;
                if ((var6 = Class804.Field2((int) (var5 = (Class537) Field39.Field98.elementAt(var4)).Field18)).Field3 == Field116[var7] || Field116[var7] == -1 && var6.Field3 > 2 && var6.Field3 < 8) {
                    ++var1;
                    if (var7 != 7 || var1 != 1) {
                        var0.Field1(var5, false, Field118[var7][0] + 5, Field118[var7][1] - 2);
                        return;
                    }
                }
            }

        }
    }

    static void Field7(Class467 var0) {
        if (Class105.Field19.Field15.Field78 == 0) {
            Class105.Field1("Đã hết điểm tiềm năng để cộng. Xin đánh lên level để có điểm tiềm năng.");
        } else {
            Class105.Field25.Field1("Nhập số", new Class691(var0), 1, 10, true);
            Class105.Field23 = Class105.Field25;
        }
    }

    static void Field8(Class467 var0) {
        if (Class359.Field97[var0.Field4] == -1) {
            Class105.Field1("Xin gặp Lâm tướng quân để học kỹ năng này");
        } else {
            Vector var1 = new Vector();
            boolean var2 = false;
            boolean var3;
            if (var3 = var0.Field13()) {
                var2 = Class602.Field4[Class105.Field19.Field15.Field93][var0.Field4 - 4] == -1;
            }

            if (var3 && !var2) {
                var1.addElement(new Class87("Sử dụng", new Class524(var0, var3)));
            }

            if (!var2) {
                var1.addElement(new Class87("Cho vào phím tắt", new Class519(var0, var3)));
            }

            var1.addElement(new Class87("Cộng", new Class518(var0)));
            Class105.Field21.Field1(var1, 2);
        }
    }

    static void Field9(Class467 var0) {
        var0 = var0;
        if (Field39.Field99 != null && Field39.Field99.size() > 0) {
            int var1 = Field39.Field99.size();

            for (int var2 = 0; var2 < var1; ++var2) {
                Class537 var3;
                if (Class804.Field2((int) (var3 = (Class537) Field39.Field99.elementAt(var2)).Field18).Field3 == Field117[var0.Field4]) {
                    var0.Field1(var3, false, Field118[0][0] + 5, Field118[0][1] - 2);
                    return;
                }
            }
        }

    }

    static String Field2(Class467 var0, int var1) {
        var1 = var1;
        String var2;
        if (var1 >= 7 && var1 < 14) {
            if (var1 >= 7 && var1 < 14) {
                var2 = "0" + Class585.Field42[var1].Field7;
                var2 = var2 + "\nSố lượng: " + Class105.Field19.Field15.Field121[var1];
            } else {
                var2 = Class804.Field2;
                var2 = var2 + "\nSố lượng: " + Class105.Field19.Field15.Field121[var1];
            }
        } else {
            var2 = "0" + Class585.Field42[var1].Field7;
            var2 = var2 + "\nSố lượng: " + Class105.Field19.Field15.Field121[var1];
            if (var0.Field15) {
                var2 = var2 + "\nKhông thể bán lại";
            }

            if (var0.Field59.contains(String.valueOf(var1))) {
                Class743 var5 = null;
                int var3 = Class804.Field6.size();

                for (int var4 = 0; var4 < var3; ++var4) {
                    if (((Class743) Class804.Field6.elementAt(var4)).Field15 == var1 - 19) {
                        var5 = (Class743) Class804.Field6.elementAt(var4);
                        break;
                    }
                }

                if (var5 != null && (var1 < 69 || var1 > 77)) {
                    var2 = var2 + Class537.Field1(var5.Field11, "0");
                }
            } else {
                var2 = var2 + Class537.Field1("\nHồi phục: " + (var1 - 19 < 0 ? Class804.Field48[var1].Field2 : Class804.Field48[var1 - 19].Field2) + " " + Class585.Field42[var1].Field8, "0");
            }
        }

        return var2;
    }

    static Class537[] Field10(Class467 var0) {
        return var0.Field93;
    }

    static boolean Field11(Class467 var0) {
        if (var0.Field13.size() >= 100) {
            Class105.Field1("Bạn chỉ được mua 100 vật phẩm một lần.");
            return true;
        } else {
            return false;
        }
    }
}
