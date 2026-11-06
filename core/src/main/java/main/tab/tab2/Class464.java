package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Vector;

public final class Class464 extends Class671 {
    public static Class464 Field1;
    private int Field62;
    private int Field63;
    public int Field2;
    public int Field3;
    public int Field4;
    public int Field5 = 7;
    public int Field6;
    private int Field64;
    private int Field65;
    private int Field66;
    private int Field67;
    public int Field7;
    public int Field8;
    private int Field68;
    private int Field69;
    private int Field70;
    public static String[] Field9 = null;
    private int[][] Field71 = new int[][]{{0, 1, 2}, {0, 1}};
    public int Field10;
    private String[] Field72 = new String[]{"Hành trang", "Trang bị", "Tiềm năng", "Kỹ năng", "Thông tin", "Nhóm", "Nhiệm vụ", "Học kỹ năng", "Trao đổi", "Gian hàng", "Gian hàng", "Áo", "Quần", "Nón", "Nhẫn", "Dây chuyền", "Giày", "Găng tay", "Ngọc bội", "Gian hàng", "Gian hàng", "Luyện đồ", "Kho đồ", "Gian hàng", "Gian hàng", "Khảm", "Hợp thành", "Nhiệm vụ", "Chế đồ", "Kỹ năng bang hội", "Kỹ năng cá nhân", "Trang bị thú", "Hợp đồ thú"};
    private String[] Field73;
    public String Field11 = "";
    private String Field74 = "";
    public Vector Field12 = new Vector();
    private Vector Field75;
    public Vector Field13 = new Vector();
    public boolean Field14 = false;
    public boolean Field15 = false;
    public boolean Field16 = false;
    private boolean Field76 = false;
    private boolean Field77;
    private int Field78;
    private int Field79;
    private static int Field80;
    public static int Field17;
    private static int Field81;
    private static int Field82;
    private static int Field83;
    private static int Field84;
    private static int Field85;
    private static int Field86;
    private static int Field87;
    private static int Field88;
    public static int Field18;
    public static int Field19;
    private static int Field89;
    private static int Field90;
    public static int Field20;
    public static int Field21;
    private static int Field91;
    private static int Field92 = 1;
    public static byte[] Field22;
    private Vector Field93;
    public int Field23;
    public int Field24;
    public short Field25;
    public Vector Field26 = new Vector();
    public Vector Field27 = new Vector();
    public Vector Field28;
    public Vector Field29;
    public Vector Field30 = new Vector();
    private Class534[] Field94 = new Class534[5];
    private short[][] Field95;
    public static byte Field31 = -1;
    private static byte Field96;
    private static byte Field97;
    public static byte Field32;
    public static byte Field33;
    public static byte Field34;
    public static byte Field35;
    public static short Field36 = 0;
    public static short Field37;
    public static short Field38;
    public static Class357 Field39;
    private byte[] Field98;
    public static boolean Field40 = false;
    public boolean Field41 = false;
    int Field42;
    private int Field99;
    private int Field100;
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
    private int Field101 = -1;
    boolean Field56 = false;
    private String[] Field102;
    private boolean Field110;
    private boolean Field111;
    private boolean Field112;
    private int Field113 = 0;
    int Field57;
    int Field58 = 1;
    private String[] Field114 = new String[]{"Trắng", "Hoàn mỹ", "Đỏ", "Xanh"};
    private static int[] Field115 = new int[]{9, 9, 9, 107, 107, 107, 107, 107, 107, 107, 9, 107, 9, 82, 9, 9, 9, 9, 9, 34};
    private static int[] Field116 = new int[]{32, 73, 52, 11, 11, 11, 11, 11, 52, 32, 94, 94, 11, 92, 32, 52, 73, 94, 11, 92};
    public Vector Field59 = new Vector();
    public Image Field60;
    private static byte[] Field117 = new byte[]{12, -1, 0, 9, 2, 8, 1, 8, 10, 11};
    private static byte[] Field118 = new byte[]{18, 19, 14, 20, 15, 21, 16, 22, 17, 23};
    private static byte[][] Field119 = new byte[][]{{10, 11}, {56, 11}, {10, 32}, {56, 32}, {10, 52}, {56, 52}, {10, 73}, {56, 94}, {10, 94}, {56, 94}};
    public static Class534 Field61;

    public static Class464 Field5() {
        return Field1 == null ? (Field1 = new Class464()) : Field1;
    }

    public final void Field1() {
        super.Field1();
        this.Field2();
        this.Field16 = true;
    }

    public final void Field2() {
        this.Field62 = Class106.Field15 - 64;
        this.Field63 = Class106.Field16 - 77;
        this.Field23();
    }

    public Class464() {
        this.Field2();
        super.Field105 = new Class86("Đóng", new Class280(this));
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
        Field83 = this.Field6 * this.Field8 - this.Field3;
        if (Field20 < 0) {
            Field20 = 0;
        }

        if (Field83 < 0) {
            Field83 = 0;
        }

    }

    public final void Field7() {
        if (Class106.Field17 == Field5() && Field21 == 0) {
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
        Field80 = 0;
        Field18 = 0;
        Field17 = 0;
        Field19 = 0;
    }

    public final void Field3() {
        if (this.Field14) {
            if (Class106.Field5[2]) {
                if (this.Field67 >= 100) {
                    if ((Field84 -= 10) < 0) {
                        Field84 = 0;
                    }
                } else {
                    this.Field19();
                }

                Class106.Field3[2] = false;
            } else if (Class106.Field5[8]) {
                if (this.Field67 >= 100) {
                    if ((Field84 += 10) > Field88) {
                        Field84 = Field88;
                    }
                } else {
                    this.Field19();
                }

                Class106.Field3[8] = false;
            }

            Class106.Field2(2);
            Class106.Field2(8);
            if (Class106.Field6 && Class106.Field1(this.Field64, this.Field65, this.Field66 - 1, this.Field67 - 1 + this.Field24 * 15)) {
                if (!this.Field77) {
                    this.Field79 = Field85;
                    this.Field77 = true;
                }

                if ((Field84 = this.Field79 + (Class106.Field30 - Class106.Field11)) < 0) {
                    Field84 = 0;
                }

                if (Field84 > Field88) {
                    Field84 = Field88;
                }
            }

            if (Class106.Field7) {
                this.Field77 = false;
                Class106.Field7 = false;
                if (!Class106.Field1(this.Field64, this.Field65, this.Field66 - 1, this.Field67 - 1 + this.Field24 * 15) && Math.abs(Class106.Field30 - Class106.Field11) < 10 && Math.abs(Class106.Field31 - Class106.Field10) < 10) {
                    this.Field19();
                }
            }
        }

        if (Class106.Field3[4] || Class106.Field3[6]) {
            this.Field19();
        }

        if (Class106.Field7 && Math.abs(Class106.Field11 - Class106.Field30) <= 10 && Math.abs(Class106.Field10 - Class106.Field31) <= 10) {
            if (Class106.Field1(this.Field62 - 5, this.Field63, 30, 35)) {
                this.Field16 = true;
                Class106.Field3[4] = true;
            }

            if (Class106.Field1(this.Field62 + 104, this.Field63, 30, 35)) {
                this.Field16 = true;
                Class106.Field3[6] = true;
            }
        }

        if (this.Field16) {
            if (Class106.Field2(8)) {
                this.Field16 = false;
                this.Field14();
                Class106.Field5[8] = false;
                if (Field22[Field21] == 1) {
                    this.Field4 = 0;
                }
            } else if (Class106.Field2(4)) {
                if (--Field21 < 0) {
                    Field21 = Field22.length - 1;
                }

                if (Field22.length > 1) {
                    Field97 = 5;
                    Field91 = 100;
                    Field92 = 1;
                }

                this.Field25();
                this.Field14();
            } else if (Class106.Field2(6)) {
                if (++Field21 >= Field22.length) {
                    Field21 = 0;
                }

                if (Field22.length > 1) {
                    Field96 = 5;
                    Field92 = -1;
                    Field91 = -100;
                }

                this.Field25();
                this.Field14();
            }
        } else if (Field22[Field21] != 26 && Field17 == 0 && this.Field5 != 0 && this.Field4 / this.Field5 == 0 && Class106.Field2(2) && Field22[Field21] != 32) {
            this.Field16 = true;
            super.Field104 = null;
        }

        boolean var2 = false;
        if (Class106.Field1(this.Field62 + this.Field68, this.Field63 + this.Field69, this.Field2, this.Field3)) {
            Class464 var3;
            int var4;
            int var5;
            if (Field22[Field21] == 26) {
                var3 = this;
                if (Class106.Field7) {
                    var4 = this.Field95.length;

                    for (var5 = 0; var5 < var4; ++var5) {
                        if (Class106.Field1(var3.Field62 + var3.Field68 + var3.Field95[var5][0] - 3, var3.Field63 + var3.Field69 + var3.Field95[var5][1] - 3, 23, 23)) {
                            Class106.Field7 = false;
                            var3.Field4 = var5;
                            if (var3.Field6 != 1) {
                                var3.Field6 = 1;
                                var3.Field5 = 5;
                                Field80 = 0;
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
                if (Class106.Field11 >= this.Field63 + this.Field69 + this.Field95[1][1] && Class106.Field11 <= this.Field95[1][1] + 65 + this.Field63 + this.Field69) {
                    var3 = this;
                    if (Class106.Field7) {
                        var4 = this.Field95.length;

                        for (var5 = 0; var5 < var4; ++var5) {
                            if (Class106.Field1(var3.Field62 + var3.Field68 + var3.Field95[var5][0] - 3, var3.Field63 + var3.Field69 + var3.Field95[var5][1] - 3, 23, 23)) {
                                Class106.Field7 = false;
                                var3.Field4 = var5;
                                if (var3.Field6 != 1) {
                                    var3.Field6 = 1;
                                    var3.Field5 = 5;
                                    Field80 = 0;
                                    Field18 = 0;
                                    Field17 = 0;
                                    Field19 = 0;
                                }

                                var3.Field30();
                            }
                        }
                    }
                } else if (Class106.Field1(this.Field68 + this.Field62, this.Field63 + this.Field69 + 4 * this.Field8 - 5, 120, 20)) {
                    Class106.Field7 = false;
                    var6 = (Class106.Field11 - (this.Field63 + this.Field69 + 4 * this.Field8 - 5)) / this.Field8;
                    var4 = (Class106.Field10 - (this.Field68 + this.Field62 + 5)) / 20;
                    this.Field4 = var6 * 6 + var4 + 6;
                    if (this.Field4 < 6) {
                        this.Field4 = 6;
                    } else if (this.Field4 > 11) {
                        this.Field4 = 11;
                    }

                    if (this.Field6 != 1) {
                        this.Field6 = 1;
                        this.Field5 = 6;
                        Field80 = 0;
                        Field18 = 0;
                        Field17 = 0;
                        Field19 = 0;
                    }

                    this.Field30();
                }
            }

            boolean var7 = false;
            if (Class106.Field6 && Field22[Field21] != 1 && !this.Field14) {
                if (!this.Field77) {
                    this.Field78 = Field17;
                    this.Field79 = Field19;
                    this.Field77 = true;
                    var6 = (Field80 + Class106.Field11 - (this.Field63 + this.Field69)) / this.Field8;
                    var4 = (Field18 + Class106.Field10 - (this.Field62 + this.Field68)) / this.Field7;
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
                    this.Field110 = true;
                }

                this.Field112 = true;
                this.Field111 = true;
                Field80 = this.Field78 + (Class106.Field30 - Class106.Field11);
                if (Field22[Field21] != 32 || Class106.Field11 >= this.Field95[1][1] + 70 + this.Field63 + this.Field69) {
                    Field18 = this.Field79 + (Class106.Field31 - Class106.Field10);
                }

                if (Field80 < -10) {
                    Field80 = -10;
                }

                if (Field80 > Field83 + 10) {
                    Field80 = Field83 + 10;
                }

                if (Field18 < -10) {
                    Field18 = -10;
                }

                if (Field18 > Field20 + 10) {
                    Field18 = Field20 + 10;
                }
            }

            if (Class106.Field7) {
                this.Field50 = -20;
                this.Field16 = false;
                Class106.Field7 = false;
                this.Field77 = false;
                if (Field22[Field21] != 1) {
                    if (Field22[Field21] != 3) {
                        if (Field22[Field21] != 32) {
                            this.Field14();
                            if (super.Field104 != null) {
                                super.Field104.Field2.Field1();
                            }
                        } else if (Class106.Field11 >= this.Field95[1][1] + 90 + this.Field63 + this.Field69 && Math.abs(Class106.Field31 - Class106.Field10) <= 10) {
                            var6 = (Field80 + Class106.Field11 - (this.Field63 + this.Field69)) / this.Field8;
                            var4 = (Field18 + Class106.Field10 - (this.Field62 + this.Field68)) / this.Field7;
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
                        if ((var6 = (Field18 + Class106.Field10 - (this.Field62 + this.Field68)) / this.Field7) < 0) {
                            var6 = 0;
                        } else if (var6 > Class599.Field11[Class106.Field19.Field15.Field93].length - 1) {
                            var6 = Class599.Field11[Class106.Field19.Field15.Field93].length - 1;
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
                } else if (Class106.Field10 >= this.Field62 + 33 && Class106.Field10 <= this.Field62 + 53) {
                    this.Field4 = 4;
                    if (Math.abs(Class106.Field30 - Class106.Field11) < 10 && Math.abs(Class106.Field31 - Class106.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class106.Field10 > this.Field62 + 80 && Class106.Field10 <= this.Field62 + 96) {
                    this.Field4 = 1;
                    if (Math.abs(Class106.Field30 - Class106.Field11) < 10 && Math.abs(Class106.Field31 - Class106.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class106.Field10 > this.Field62 && Class106.Field10 <= this.Field62 + 30) {
                    var6 = (Class106.Field11 - (this.Field63 + this.Field69)) / this.Field8;
                    var4 = (Class106.Field10 - (this.Field62 + this.Field68)) / this.Field7;
                    this.Field4 = var6 * this.Field5 + var4;
                    if (this.Field4 > 12) {
                        this.Field4 = 12;
                    }

                    if (Math.abs(Class106.Field30 - Class106.Field11) < 10 && Math.abs(Class106.Field31 - Class106.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                } else if (Class106.Field10 > this.Field62 + 100 && Class106.Field10 <= this.Field62 + 120) {
                    var6 = (Class106.Field11 - (this.Field63 + this.Field69)) / this.Field8;
                    var4 = (Class106.Field10 - (this.Field62 + this.Field68)) / this.Field7;
                    this.Field4 = var6 * this.Field5 + var4 + 1;
                    if (this.Field4 > 14) {
                        this.Field4 = 14;
                    }

                    if (Math.abs(Class106.Field30 - Class106.Field11) < 10 && Math.abs(Class106.Field31 - Class106.Field10) < 10) {
                        this.Field14();
                        if (super.Field104 != null) {
                            super.Field104.Field2.Field1();
                        }
                    }
                }
            }
        } else {
            this.Field77 = false;
            if (Field22[Field21] == 3 && !this.Field111 && Class106.Field1(this.Field62 + this.Field68, this.Field63 + this.Field69 + 30, this.Field2, 65)) {
                this.Field110 = false;
                if (Class106.Field6) {
                    if (!this.Field112) {
                        this.Field78 = Field17;
                        this.Field112 = true;
                        this.Field14();
                    }

                    if ((Field80 = this.Field78 + (Class106.Field30 - Class106.Field11)) < -10) {
                        Field80 = -10;
                    }

                    if (Field80 > Field83 + 10) {
                        Field80 = Field83 + 10;
                    }
                }

                if (Class106.Field7) {
                    Class106.Field7 = false;
                    this.Field112 = false;
                }
            }
        }

        if (!Class106.Field6) {
            this.Field111 = false;
        }

        byte[] var8;
        if (Class106.Field2(2)) {
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
        } else if (Class106.Field2(4)) {
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
        } else if (Class106.Field2(6)) {
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
        } else if (Class106.Field2(8)) {
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
            if (Class106.Field5[2]) {
                var2 = false;
                if ((Field80 -= 10) < 0) {
                    Field80 = 0;
                }
            } else if (Class106.Field5[8]) {
                var2 = false;
                if ((Field80 += 10) > Field83) {
                    Field80 = Field83;
                }
            }
        }

        if (var2) {
            this.Field110 = false;
            if ((Field80 = this.Field4 / this.Field5 * this.Field8 - this.Field3 / 2) < 0) {
                Field80 = 0;
            }

            if (Field80 > Field83) {
                Field80 = Field83;
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
        int var1 = Class357.Field125.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class534 var3;
            Class805 var4;
            if (((var4 = Class811.Field2((int) (var3 = (Class534) Class357.Field125.elementAt(var2)).Field18)).Field3 == 14 || var4.Field3 == 15 || var4.Field3 == 16 || var4.Field3 == 17 || var4.Field3 == 18) && var3.Field37 == Field32) {
                this.Field30.addElement(var3);
            }
        }

    }

    private void Field25() {
        Field91 = 0;
        super.Field103 = null;
        this.Field76 = false;
        this.Field75 = null;
        this.Field95 = null;
        this.Field12.removeAllElements();
        this.Field68 = 1;
        this.Field69 = 35;
        if (Field22.length > 1) {
            this.Field74 = this.Field11;
            this.Field11 = this.Field72[Field22[Field21]];
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
                this.Field76 = true;
                this.Field1(this.Field32());
                this.Field1(126, 90, 7, this.Field6, 18, 18);
                if (Class106.Field19.Field15.Field35 <= 1) {
                    super.Field103 = new Class86("Chọn", new Class278(this));
                } else {
                    super.Field103 = new Class86("Menu", new Class212(this));
                }
                break;
            case 1:
                this.Field68 += 5;
                this.Field69 += -2;
                this.Field1(117, 104, 3, 5, 97, 21);
                Vector var4 = new Vector();
                if (Class106.Field19.Field15.Field94 != -1) {
                    var4.addElement(new Class86("Thay đồ", new Class215(this)));
                }

                if (Class106.Field19.Field15.Field141) {
                    var4.addElement(new Class86("Cất cuốc", new Class287(this)));
                }

                if (var4.size() == 1) {
                    super.Field103 = (Class86) var4.elementAt(0);
                } else if (var4.size() == 2) {
                    super.Field103 = new Class86("Chọn", new Class349(this, var4));
                }
                break;
            case 2:
                this.Field69 += 13;
                this.Field1(124, 94, 1, 5, 125, 19);
                break;
            case 3:
                super.Field103 = null;
                this.Field68 += 5;
                this.Field69 += 7;
                this.Field4 = 0;
                this.Field1(114, 30, Class106.Field19.Field15.Field24(), 1, 23, 20);
                break;
            case 4:
                super.Field104 = null;
                this.Field76 = true;
                this.Field68 += -4;
                this.Field69 += -2;
                this.Field1(134, 95, 1, 10, 50, 12);
                break;
            case 5:
                this.Field76 = true;
                this.Field68 += -4;
                this.Field69 += -2;
                this.Field1(134, 95, 1, Class357.Field127.size(), 130, 32);
                break;
            case 6:
                this.Field76 = true;
                this.Field68 += -4;
                this.Field69 += -2;
                this.Field34();
                this.Field1(134, 95, 1, this.Field93.size(), 130, 15);
                this.Field93.removeAllElements();
                break;
            case 7:
                this.Field68 += 5;
                this.Field69 += 7;
                super.Field103 = null;
                this.Field14();
                break;
            case 8:
                this.Field68 += 9;
                this.Field69 += -5;
                this.Field11 = "Trao đổi";
                super.Field104 = new Class86("Chọn", new Class340(this));
                super.Field103 = new Class86("Xong", new Class696(this));
                break;
            case 9:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1((Vector) Class106.Field19.Field21, (int) -1);
                this.Field1(this.Field12);
                this.Field9(-1);
                break;
            case 10:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field2(Class106.Field19.Field21);
                this.Field1(this.Field12);
                super.Field103 = new Class86("Mua", new Class768(this));
                break;
            case 11:
            case 12:
            case 13:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(Class106.Field19.Field21, Field22[Field21] - 11);
                this.Field1(this.Field12);
                this.Field9(Field22[Field21] - 11);
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1(Class106.Field19.Field21, Field22[Field21] - 6);
                this.Field1(this.Field12);
                this.Field9(Field22[Field21] - 6);
                break;
            case 19:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field33();
                this.Field1(this.Field12);
                super.Field103 = new Class86("Mua", new Class574(this));
                break;
            case 20:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field31();
                this.Field1(this.Field12);
                super.Field103 = new Class86("Mua", new Class497(this));
                this.Field11 = this.Field11 + " " + (Field21 + 1);
                break;
            case 21:
                ++this.Field68;
                this.Field69 += -6;
                this.Field1(this.Field12);
                this.Field1(126, 110, 3, 5, 20, 23);
                this.Field14();
                this.Field27();
                break;
            case 22:
            case 23:
                this.Field76 = true;
                this.Field68 += 9;
                this.Field69 = this.Field69;
                this.Field4 = 0;
                this.Field2(0);
                this.Field1(108, 90, 6, this.Field6, 18, 18);
                this.Field14();
                super.Field103 = new Class86(Field22[Field21] == 22 ? "Chuyển" : "Chọn", new Class527(this));
                break;
            case 24:
                this.Field76 = true;
                this.Field1(126, 90, 7, this.Field6, 18, 18);
                this.Field1(this.Field11());
                super.Field103 = new Class86("Mua", new Class738(this));
                break;
            case 25:
                this.Field16 = false;
                ++this.Field68;
                this.Field69 += -4;
                this.Field1(this.Field12);
                this.Field1(126, 110, 3, 5, 20, 23);
                if (Field40) {
                    this.Field1(false, 1, Field46);
                } else {
                    this.Field11 = "Đục lỗ";
                    this.Field1(false, 2, Field46);
                }

                super.Field104 = new Class86("", new Class339(this));
                this.Field27();
                break;
            case 26:
                ++this.Field68;
                this.Field69 += -4;
                this.Field1(126, 108, 5, 1, 20, 18);
                this.Field95 = new short[][]{{(short) (this.Field2 / 2 - 44), 20}, {(short) (this.Field2 / 2 + 26), 20}, {(short) (this.Field2 / 2 - 10), 43}, {(short) (this.Field2 / 2 - 44), 65}, {(short) (this.Field2 / 2 + 26), 65}};
                this.Field1(true, 1, 0);
                this.Field28 = new Vector();
                super.Field104 = new Class86("Chọn", new Class338(this));
                super.Field103 = new Class86("Hợp", new Class604(this));
                break;
            case 27:
                this.Field76 = true;
                this.Field68 += -4;
                this.Field69 += -2;
                if (this.Field93 == null) {
                    this.Field93 = new Vector();
                }

                this.Field1(134, 95, 1, this.Field93.size(), 130, 15);
                super.Field103 = new Class86("Hủy", new Class274(this));
                break;
            case 28:
                ++this.Field68;
                this.Field69 += -4;
                if ((var3 = this.Field28.size() / 2) < 6) {
                    var3 = 6;
                }

                this.Field1(126, 108, var3, 3, 20, 18);
                super.Field104 = new Class86("Chọn", new Class346(this));
                super.Field103 = new Class86("Xong", new Class345(this));
                break;
            case 29:
                this.Field1(this.Field26());
                var3 = 0;

                for (var2 = 0; var2 < Class106.Field19.Field96.length; ++var2) {
                    if (Class106.Field19.Field96[var2].Field1 > 0) {
                        ++var3;
                    }
                }

                for (var2 = 0; var2 < Class106.Field19.Field97.length; ++var2) {
                    if (Class106.Field19.Field97[var2].Field1 > 0) {
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
                this.Field68 += 5;
                this.Field69 += -2;
                this.Field1(117, 104, 2, 5, 97, 21);
                break;
            case 32:
                ++this.Field68;
                this.Field69 += -4;
                this.Field1(126, 108, 5, 1, 20, 18);
                this.Field95 = new short[][]{{(short) (this.Field2 / 2 - 44), 0}, {(short) (this.Field2 / 2 + 26), 0}, {(short) (this.Field2 / 2 - 10), 20}, {(short) (this.Field2 / 2 - 44), 42}, {(short) (this.Field2 / 2 + 26), 42}};

                for (var2 = 0; var2 < this.Field94.length; ++var2) {
                    this.Field94[var2] = null;
                }

                this.Field24();
                this.Field28 = new Vector();
                super.Field104 = new Class86("", new Class342(this));
                super.Field103 = new Class86("Hợp", new Class462(this));
                break;
            case 127:
                this.Field76 = true;
                this.Field1(126, 90, 1, 1, 18, 18);
                this.Field1((Vector) Class106.Field19.Field21, (int) -1);
                this.Field1(this.Field12);
                boolean var1 = true;
                super.Field103 = new Class86("Mua", new Class763(this, -1));
        }

        if (this.Field4 >= this.Field6 * this.Field5 - 1) {
            this.Field4 = 0;
        }

    }

    private Vector Field26() {
        Vector var1 = new Vector();
        int var2 = 0;
        int var3 = Class106.Field19.Field96.length;

        int var4;
        for (var4 = 0; var4 < var3; ++var4) {
            if (Class106.Field19.Field96[var4].Field1 > 0) {
                var1.addElement(new Class568(this, "", new Class341(this), var4, var2));
                ++var2;
            }
        }

        var4 = Class106.Field19.Field97.length;

        for (int var5 = 0; var5 < var4; ++var5) {
            if (Class106.Field19.Field97[var5].Field1 > 0) {
                var1.addElement(new Class610(this, "", new Class566(this), var5, var2));
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
                Class272 var4 = (Class272) this.Field28.elementAt(var3);
                int var5 = this.Field29.size();

                for (int var6 = 0; var6 < var5; ++var6) {
                    Class381 var7 = (Class381) this.Field29.elementAt(var6);
                    int var8;
                    if ((var8 = var4.Field1 - var7.Field2) <= 5) {
                        var1[var6][var8] = (byte) var4.Field3;
                        break;
                    }
                }
            }

            Class60.Field9 = var1;
            (new Class603(this, var1)).Field1();
        }
    }

    public final void Field9() {
        boolean var1 = this.Field4 / this.Field5 < 2;
        Class272 var2 = null;
        if (var1) {
            if (this.Field4 < this.Field28.size()) {
                var2 = (Class272) this.Field28.elementAt(this.Field4);
            }
        } else if (this.Field4 % this.Field5 < this.Field27.size()) {
            var2 = (Class272) this.Field27.elementAt(this.Field4 % this.Field5);
        }

        if (var2 != null) {
            Class272 var3 = var2;
            int var4 = this.Field4 % this.Field5 * this.Field7 - Field19;
            int var5 = this.Field4 / this.Field5 * this.Field7;
            short var7 = var2.Field1;
            Vector var6;
            (var6 = new Vector()).addElement(new Class86(!var1 ? "Bỏ vào" : "Lấy ra", new Class602(this, var1, var3)));
            var6.addElement(new Class86("Thông tin", new Class601(this, var7, var4, var5)));
            Class106.Field21.Field1(var6, 2);
        }
    }

    public final void Field10() {
        int var3 = Field39.Field98.size();

        for (int var1 = 0; var1 < var3; ++var1) {
            Class811.Field2((int) ((Class534) Field39.Field98.elementAt(var1)).Field18);
        }

    }

    private Class86 Field1(Class272 var1, int var2, int var3) {
        return new Class86("Thông tin", new Class605(this, var1, var2, var3));
    }

    public final Vector Field11() {
        Vector var1 = new Vector();
        int var2 = this.Field26.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            var1.addElement(new Class528(this, "", new Class536(this, var3), var3));
        }

        return var1;
    }

    public final void Field1(Class534 var1, short var2) {
        this.Field19();
        Class106.Field25.Field1("Nhập giá muốn bán: ", new Class526(this, var1, var2), 1, 10, true);
        Class106.Field23 = Class106.Field25;
    }

    public final void Field1(Class534 var1, short var2, int var3, boolean var4) {
        Class261.Field1().Field1(this.Field53, this.Field54, var1, var2, var3, var4);
        Class187.Field5 = var2;
    }

    public final void Field1(boolean var1, int var2, int var3) {
        this.Field27.removeAllElements();
        Vector var8;
        int var4 = (var8 = var3 == 0 ? Class582.Field37 : Class582.Field38).size();

        for (int var5 = 0; var5 < var4; ++var5) {
            Class272 var6;
            Class750 var7 = Class811.Field1((var6 = (Class272) var8.elementAt(var5)).Field1);
            if (!var1) {
                if (var7.Field8 == var2) {
                    this.Field27.addElement(var6);
                }
            } else if (var7.Field9 == var2) {
                this.Field27.addElement(var6);
            }
        }

        if (this.Field27.size() == 0) {
            Class106.Field1("Không có nguyên liệu.", new Class530(this));
        }

    }

    private void Field27() {
        super.Field103 = new Class86(Field22[Field21] == 21 ? "Đập" : "Xong", new Class529(this));
    }

    public final void Field12() {
        int var1 = this.Field4 / this.Field5;
        int var2 = this.Field4 % this.Field5;
        Class750 var3 = null;
        int var4;
        Class534 var8;
        if (var1 == 4) {
            if (var2 < Class357.Field125.size()) {
                var8 = (Class534) Class357.Field125.elementAt(var2);
                this.Field1(var8, this.Field15, var2 * this.Field7, 4 * this.Field7);
            } else {
                var4 = this.Field27.size();

                for (int var5 = 0; var5 < var4; ++var5) {
                    if (var5 == var2 - Class357.Field125.size()) {
                        Class750 var9;
                        String var7 = Class534.Field1((var9 = Class811.Field1(((Class272) this.Field27.elementAt(var5)).Field1)).Field10, "0");
                        if (Field45 == 1 && Field22[Field21] == 21 || Field46 == 1 && Field22[Field21] == 25) {
                            var7 = var7 + " - Đã khóa";
                        }

                        var7 = var7 + Class534.Field1(var9.Field11, "0");
                        this.Field1(var7, var2 * this.Field7 - Field19, 4 * this.Field7);
                    }
                }

            }
        } else if (var2 == 1) {
            var8 = (Class534) Class357.Field125.elementAt(this.Field101);
            this.Field1((String) var8.Field1(this.Field15), 50, (int) (2 * this.Field7));
        } else {
            var4 = (var1 << 1) + var2 / 2;
            String var6 = Class534.Field1((var3 = Class811.Field1(((Class230) Class582.Field36.elementAt(var4)).Field2)).Field10, "0");
            if (Field45 == 1 && Field22[Field21] == 21 || Field46 == 1 && Field22[Field21] == 25) {
                var6 = var6 + " - Đã khóa";
            }

            var6 = var6 + Class534.Field1(var3.Field11, "0");
            this.Field1(var6, var2 * 50, var1 * this.Field7);
        }
    }

    public final boolean Field13() {
        byte[][] var1;
        int var2 = (var1 = new byte[][]{{4, 5}, {4, 5}, {4, 5, 6, 7}, {4, 5}, {4, 5}})[Class106.Field19.Field15.Field93].length;

        for (int var3 = 0; var3 < var2; ++var3) {
            if (this.Field4 == var1[Class106.Field19.Field15.Field93][var3]) {
                return true;
            }
        }

        return false;
    }

    public final void Field1(int var1, boolean var2) {
        Vector var3 = new Vector();

        for (int var4 = 0; var4 < 5; ++var4) {
            var3.addElement(new Class86("Phím số " + (1 + (var4 << 1)), new Class514(this, var4, var1, var2)));
        }

        Class106.Field21.Field1(var3, 2);
    }

    public final void Field1(Class582 var1, Class678 var2, int var3, boolean var4) {
        Vector var5 = new Vector();
        if (var4) {
            var5.addElement(new Class86("Cho mình", new Class513(this, var1, var3)));
            var5.addElement(new Class86("Cho bạn", new Class517(this, var2, var3)));
        } else {
            Class261.Field1().Field1((short) var1.Field189, (byte) 0, (byte) ((byte) var3), (short) 0);
        }

        Class106.Field21.Field1(var5, 2);
    }

    public final void Field14() {
        this.Field102 = null;
        int var3;
        switch (Field22[Field21]) {
            case 1:
                super.Field104 = new Class86("", new Class556(this));
                return;
            case 2:
                super.Field104 = new Class86("", new Class555(this));
                return;
            case 3:
                if ((Field83 = (Class106.Field19.Field15.Field10(this.Field4).length + 1) * 12 - 72) < 0) {
                    Field83 = 0;
                }

                super.Field104 = new Class86("", new Class561(this));
                return;
            case 4:
                this.Field102 = new String[17];
                Class582 var4 = Class106.Field19.Field15;
                this.Field102[0] = "Nhân vật: " + var4.Field65;
                this.Field102[1] = "Level: " + var4.Field22 + "+" + var4.Field44();
                this.Field102[2] = "HP: " + var4.Field4 + "/" + var4.Field5;
                this.Field102[3] = "MP: " + var4.Field130 + "/" + var4.Field129;
                this.Field102[4] = "Tấn công: " + var4.Field34();
                this.Field102[5] = "Thủ vật lý: " + var4.Field20;
                this.Field102[6] = "Thủ ma pháp: " + var4.Field21;
                this.Field102[7] = "Chính xác: " + var4.Field13;
                this.Field102[8] = "Né tránh: " + var4.Field14;
                this.Field102[9] = "Bạo kích: " + (var4.Field154 > 0 ? var4.Field154 / 10 + "." + var4.Field154 % 10 : "0") + "%";
                this.Field102[10] = "Chí mạng: " + var4.Field15;
                this.Field102[11] = "Cống hiến: " + var4.Field183 + " điểm.";
                this.Field102[12] = "Liên trảm: " + var4.Field156 + " điểm.";
                this.Field102[13] = "Công trạng: " + var4.Field155 + " điểm.";
                this.Field102[14] = "Điểm hoạt động: " + var4.Field157 + " điểm.";
                this.Field102[15] = "Điểm đấu trường: " + var4.Field184 + " điểm.";
                this.Field102[16] = var4.Field185.equals("") ? "Độc thân" : var4.Field185;
                this.Field6 = this.Field102.length + 1;
                if (Field9 != null) {
                    this.Field6 += Field9.length;
                }

                this.Field23();
                return;
            case 5:
                super.Field104 = new Class86("", new Class560(this));
                return;
            case 6:
                super.Field104 = new Class86("", new Class559(this));
                return;
            case 7:
                this.Field75 = new Vector();
                Vector var1 = (Vector) Class62.Field22.elementAt(Class106.Field19.Field15.Field93);
                byte var2 = Class357.Field97[((Class189) var1.elementAt(this.Field4)).Field3];
                this.Field75.addElement("`" + ((Class189) var1.elementAt(this.Field4)).Field1);
                if (var2 == -1) {
                    this.Field75.addElement("`Phí: " + ((Class189) var1.elementAt(this.Field4)).Field4 + " xu");
                }

                String[] var5 = Class21.Field8.Field1(((Class189) var1.elementAt(this.Field4)).Field2, 130);

                for (var3 = 0; var3 < var5.length; ++var3) {
                    this.Field75.addElement(var5[var3]);
                }

                this.Field1(114, 30, var1.size(), 1, 23, 20);
                if ((Field83 = this.Field75.size() * 12 - 72) < 0) {
                    Field83 = 0;
                }

                super.Field104 = new Class86("", new Class558(this, var1));
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
                    super.Field104 = (Class86) this.Field12.elementAt(var3);
                }

                return;
            case 21:
            case 25:
                super.Field104 = new Class86("", new Class553(this));
                return;
            case 22:
            case 23:
                super.Field104 = new Class86("", new Class525(this));
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
                super.Field104 = new Class86("", new Class552(this));
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
                    Vector var12 = Class106.Field19.Field15.Field40;
                    if (var5 < var12.size()) {
                        Object var7 = var9 = var12.elementAt(var5);
                        var1.addElement(new Class86("Hủy", new Class485(this, var12, var5, var7)));
                    }
                } else if ((var5 = this.Field4 / this.Field5 * 3 + (var10 - 3)) < Class106.Field19.Field15.Field41.size()) {
                    var9 = Class106.Field19.Field15.Field41.elementAt(var5);
                }

                if (var9 != null) {
                    var11 = var10 * 18;
                    var5 = this.Field4 / this.Field5 * 18;
                    var1.addElement(new Class86("Thông tin", new Class483(this, var9, var11, var5)));
                }

                Class106.Field21.Field1(var1, 3);
            } else {
                var1 = new Vector();
                if (this.Field4 % this.Field5 < Class357.Field125.size()) {
                    boolean var2 = false;
                    Class534 var3 = (Class534) Class357.Field125.elementAt(this.Field4 % this.Field5);
                    Vector var4;
                    var5 = (var4 = Class106.Field19.Field15.Field40).size();

                    for (int var6 = 0; var6 < var5; ++var6) {
                        if (var4.elementAt(var6) instanceof Class534 && ((Class534) var4.elementAt(var6)).Field9 == var3.Field9) {
                            var2 = true;
                            break;
                        }
                    }

                    if (!var2) {
                        var1.addElement(new Class86("Giao dịch", new Class551(this, var3)));
                    }

                    var1.addElement(new Class86("Thông tin", new Class479(this, var3)));
                } else {
                    int var8 = this.Field4 % this.Field5 - Class357.Field125.size();
                    var10 = 0;
                    var11 = Class582.Field42.length;

                    for (var5 = 0; var5 < var11; ++var5) {
                        if (Class582.Field42[var5].Field1 - Class582.Field42[var5].Field2 > 0 && Class582.Field42[var5].Field6) {
                            if (var10 == var8) {
                                var1.addElement(new Class86("Giao dịch", new Class477(this, var5)));
                                var1.addElement(new Class86("Thông tin", new Class540(this, var5, var10)));
                                break;
                            }

                            ++var10;
                        }
                    }
                }

                Class106.Field21.Field1(var1, 3);
            }
        }
    }

    public final void Field16() {
    }

    public final void Field17() {
        if (Class357.Field127.size() > 0) {
            Class582 var1 = Class106.Field19.Field15;
            Vector var2 = new Vector();
            if (var1.Field189 == var1.Field192) {
                var2.addElement(new Class86("Đuổi", new Class470(this)));
                var2.addElement(new Class86("Giải tán", new Class469(this)));
            } else {
                var2.addElement(new Class86("Rời nhóm", new Class468(this)));
            }

            Class106.Field21.Field1(var2, 2);
        }

    }

    private void Field2(int var1, boolean var2) {
        if (var1 == -1) {
            if (this.Field6 != 1) {
                this.Field6 = 1;
                this.Field4 = 6;
                this.Field5 = 5;
                Field80 = 0;
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

                    Field80 = 0;
                    Field18 = 0;
                    Field17 = 0;
                    Field19 = 0;
                    return;
                } else {
                    this.Field4 = 6;
                    this.Field5 = 6;
                    Field80 = 0;
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
            var4 = Class357.Field128.size();
        } else {
            var4 = this.Field26.size();
        }

        if (Class357.Field125.size() + Class582.Field37.size() < var4) {
            this.Field6 = var4 / 3 + 1;
        } else {
            this.Field6 = (Class357.Field125.size() + Class582.Field37.size()) / 3 + 1;
        }

        if (this.Field6 < 5) {
            this.Field6 = 5;
        }

        if ((this.Field4 % this.Field5 != 2 || var1 != 1) && (this.Field4 % this.Field5 != 3 || var1 != -1)) {
            if ((Field83 = this.Field6 * this.Field7 - this.Field3) < 0) {
                Field83 = 0;
            }

            return false;
        } else {
            if (var1 == -1) {
                Field83 = ((Class357.Field125.size() + Class582.Field37.size()) / 3 + 1) * this.Field7 - this.Field3;
            } else {
                Field83 = (var4 / 3 + 1) * this.Field7 - this.Field3;
            }

            if (Field83 < 0) {
                Field83 = 0;
            }

            var1 = this.Field4 / this.Field5 - Field17 / this.Field7;
            Field17 = Field80 = this.Field113;
            this.Field4 = (Field17 / this.Field7 + var1) * this.Field5 + this.Field4 % this.Field5;
            this.Field113 = var2;
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

            for (int var4 = 0; var4 < Class582.Field42.length; ++var4) {
                if (Class582.Field42[var4].Field1 - Class582.Field42[var4].Field2 > 0 && Class582.Field42[var4].Field6) {
                    ++var1;
                }
            }

            this.Field5 = Class357.Field125.size() + var1;
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
        Field80 = 0;
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
            this.Field5 = Class357.Field125.size() + this.Field27.size();
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
        Field80 = 0;
        Field18 = 0;
        Field17 = 0;
        Field19 = 0;
    }

    public final void Field4() {
        Class106.Field19.Field4();
        if (Field17 != Field80) {
            Field82 = Field80 - Field17 << 2;
            Field81 += Field82;
            Field17 += Field81 >> 4;
            Field81 &= 15;
        }

        if (Field19 != Field18) {
            Field90 = Field18 - Field19 << 2;
            Field89 += Field90;
            Field19 += Field89 >> 4;
            Field89 &= 15;
        }

        if (Math.abs(Field80 - Field17) < 15 && Field17 < 0) {
            Field80 = 0;
        }

        if (Math.abs(Field80 - Field17) < 10 && Field17 > Field83) {
            Field80 = Field83;
        }

        if (0 != Field91 && Class809.Field4(Field91 += (0 - Field91) / 2) <= 1) {
            Field91 = 0;
        }

        if (Field85 != Field84) {
            Field87 = Field84 - Field85 << 2;
            Field86 += Field87;
            Field85 += Field86 >> 4;
            Field86 &= 15;
        }

        if (Field22[Field21] == 31 && Field39 != null && Field39.Field103 != null) {
            if (Class106.Field12 % Field39.Field95 == 0) {
                ++this.Field10;
                if (this.Field10 > this.Field71[Field39.Field120 == 3 ? 0 : 1].length - 1) {
                    this.Field10 = 0;
                }
            }

            this.Field70 = this.Field71[Field39.Field120 == 3 ? 0 : 1][this.Field10];
        }

        if (Class106.Field21.Field1) {
            this.Field19();
        }

        if (Field22[Field21] == 0 && this.Field12 != null && this.Field12.size() > 0) {
            this.Field42 = Class106.Field19.Field15.Field35 - 1;
            if (this.Field42 <= 0) {
                this.Field42 = 0;
            }

            this.Field99 = this.Field12.size() % 42;
            this.Field100 = this.Field12.size();
        }

    }

    public final void Field1(Graphics var1) {
        Class106.Field19.Field1(var1);
        var1.translate(this.Field62, this.Field63);
        Class811.Field1(var1, -10, -10);
        if (Field22[Field21] == 0) {
            Class21.Field7.Field1(var1, this.Field47 + 1 + "/" + Class106.Field19.Field15.Field35, 64, 28, 2);
        }

        if (this.Field76) {
            short var2 = 139;
            if (Class106.Field14 < 196) {
                var2 = 126;
            }

            Class21.Field9[0].Field1(var1, Class106.Field19.Field15.Field122 + "$", 122, var2, 1);
            Class21.Field9[1].Field1(var1, Class106.Field19.Field15.Field100 + "l", 5, var2, 0);
            if (Class106.Field19.Field15.Field101 > -1) {
                if (Class106.Field14 > 190) {
                    Class21.Field9[1].Field1(var1, Class106.Field19.Field15.Field101 + "lk", 63, 130, 2);
                } else {
                    Class21.Field9[1].Field1(var1, Class106.Field19.Field15.Field101 + "lk", 5, 28, 0);
                }
            }
        }

        var1.drawImage(Class811.Field30, 6 - Field97, 18, 3);
        var1.drawRegion(Class811.Field30, 0, 0, 11, 7, 2, 122 + Field96, 19, 3);
        if (Field97 > 0) {
            --Field97;
        }

        if (Field96 > 0) {
            --Field96;
        }

        var1.setColor(7961465);
        var1.fillRect(21, 11, 88, 16);
        var1.fillRect(20, 12, 90, 14);
        var1.setColor(this.Field16 ? 30611 : 2368548);
        var1.fillRect(21, 12, 88, 14);
        var1.setClip(21, 11, 88, 16);
        var1.translate(-Field91, 0);
        int var9;
        if ((var9 = Class21.Field10[0].Field1(this.Field11)) > 88) {
            this.Field57 -= this.Field58;
            if (Class809.Field4(this.Field57) > (var9 - 88) / 2 + 5) {
                this.Field58 = -this.Field58;
            }
        }

        Class21.Field10[0].Field1(var1, this.Field11, 66 + this.Field57, 12, 2);
        if (Field91 != 0) {
            Class21.Field10[0].Field1(var1, this.Field74, 66 + 100 * Field92, 12, 2);
        }

        var1.translate(Field91, 0);
        var1.translate(this.Field68, this.Field69);
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

                var1.drawImage(Class811.Field25[1], 0, -20, 0);
                Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field78), 107, -11, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field80), 107, 8, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field82), 107, 27, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field81), 107, 46, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field83), 107, 65, 2);
                Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field84), 107, 84, 2);
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
            Class106.Field1(var1);
            this.Field17(var1);
        }

        super.Field1(var1);
    }

    private int Field29() {
        int var1 = -1;

        for (int var2 = 0; var2 < this.Field94.length; ++var2) {
            if (this.Field94[var2] == null) {
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
            Field80 = 0;
            Field18 = 0;
            Field17 = 0;
            Field19 = 0;
        }

    }

    public final void Field18() {
        Class534 var1 = (Class534) this.Field30.elementAt(this.Field4 % this.Field5);
        this.Field1(var1, false, this.Field4 % this.Field5 * 20 + 4, 86);
    }

    private void Field30() {
        if (!this.Field14) {
            Vector var1 = new Vector();
            Class272 var2;
            Class534 var3;
            if (this.Field6 != 1) {
                if (this.Field4 % this.Field5 >= 0 && this.Field4 % this.Field5 < this.Field30.size()) {
                    var3 = (Class534) this.Field30.elementAt(this.Field4 % this.Field5);
                    if (this.Field29() > -1) {
                        var1.addElement(new Class86("Bỏ vào", new Class508(this, var3)));
                    }

                    var1.addElement(new Class86("Thông tin ", new Class506(this)));
                } else if ((this.Field4 - this.Field30.size()) % this.Field5 >= 0 && (this.Field4 - this.Field30.size()) % this.Field5 < this.Field27.size()) {
                    var2 = (Class272) this.Field27.elementAt((this.Field4 - this.Field30.size()) % this.Field5);
                    var1.addElement(new Class86("Bỏ vào", new Class504(this, var2)));
                    var1.addElement(this.Field1((Class272) var2, this.Field4 % this.Field5 * 20 + 4, (int) 86));
                }
            } else if (this.Field4 > 5) {
                if (this.Field4 % 6 >= 0 && this.Field4 % 6 < this.Field28.size() && (var2 = (Class272) this.Field28.elementAt(this.Field4 % 6)) != null) {
                    var1.addElement(new Class86("Lấy ra", new Class502(this, var2)));
                }
            } else if (this.Field4 >= 0 && this.Field4 < this.Field94.length && (var3 = this.Field94[this.Field4]) != null) {
                var1.addElement(new Class86("Lấy ra", new Class463(this, var3)));
            }

            Class106.Field21.Field1(var1, 2);
        }
    }

    final int Field1(boolean var1) {
        int var2 = 0;
        int var5;
        if (var1) {
            for (var5 = 0; var5 < this.Field94.length; ++var5) {
                if (this.Field94[var5] != null) {
                    ++var2;
                }
            }
        } else {
            var5 = this.Field28.size();

            for (int var3 = 0; var3 < var5; ++var3) {
                Class272 var4 = (Class272) this.Field28.elementAt(var3);
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

            var1.drawImage(Class811.Field20, var2 * 20, var3, 0);
            Class272 var6 = (Class272) this.Field27.elementAt(var5);
            Class811.Field1(var1, Class811.Field1(var6.Field1).Field12, var2 * 20 + 10, var3 + 10);
            Class750 var7;
            String var9 = (var7 = Class811.Field1(var6.Field1)).Field10.substring(var7.Field10.length() - 1);

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
            var1.drawImage(Class811.Field20, this.Field95[var2][0], this.Field95[var2][1], 0);
        }

        var1.setColor(10595790);
        if (this.Field6 == 1 && this.Field4 < 5) {
            var1.fillRect(this.Field95[this.Field4][0] + 1, this.Field95[this.Field4][1] + 1, 16, 16);
        }

        for (var2 = 0; var2 < this.Field94.length; ++var2) {
            if (this.Field94[var2] != null) {
                Field1(var1, this.Field94[var2], this.Field95[var2][0] + 10, this.Field95[var2][1] + 10);
            }
        }

        byte var6 = 3;
        if (Field32 == 3) {
            var6 = 2;
        } else if (Field32 == 2) {
            var6 = 1;
        }

        Class21.Field10[var6].Field1(var1, this.Field114[var6], this.Field95[2][0] + 10, this.Field95[1][1], 2);
        Class21.Field10[0].Field1(var1, "Số Đá: " + Field34, this.Field95[2][0] + 10, 3 * this.Field8, 2);
        if (this.Field6 == 1 && this.Field4 >= 6 && this.Field4 < 12) {
            var1.fillRect(this.Field4 % 6 * 20 + 5, 4 * this.Field8 - 4, 16, 16);
        }

        for (var2 = 0; var2 < 6; ++var2) {
            var1.drawImage(Class811.Field20, var2 * 20 + 4, 4 * this.Field8 - 5, 0);
        }

        var2 = this.Field28.size();

        int var3;
        for (var3 = 0; var3 < var2; ++var3) {
            Class272 var4;
            Class750 var5;
            int var8 = Integer.parseInt((var5 = Class811.Field1((var4 = (Class272) this.Field28.elementAt(var3)).Field1)).Field10.substring(var5.Field10.length() - 1));
            int var10002 = var3 % 6 * 20 + this.Field7 / 2 + 3;
            int var10003 = 4 * this.Field8;
            Class811.Field1(var1, Class811.Field1(var4.Field1).Field12, var10002, var10003 + 3);
            Class21.Field9[3].Field1(var1, String.valueOf(var8), var3 % 6 * 20 + 5, 4 * this.Field8 - 7, 0);
            Class21.Field9[3].Field1(var1, String.valueOf(var4.Field3), var3 % 6 * 20 + this.Field7 / 2 + 10, 4 * this.Field8 + 8, 1);
        }

        var1.translate(-Field19, 0);
        if (this.Field6 != 1) {
            var1.fillRect(this.Field4 % this.Field5 * 20, 5 * this.Field8 + 1, 17, 16);
        }

        var3 = 0;

        for (int var7 = 0; var7 < this.Field30.size(); ++var7) {
            Class534 var9 = (Class534) this.Field30.elementAt(var7);
            var1.drawImage(Class811.Field20, var3 * 20, 5 * this.Field8, 0);
            var9.Field1(var1, var3 * 20 + 8, this.Field8 * 5 + 8);
            ++var3;
        }

        this.Field1(var1, var3, 5 * this.Field8);

        for (var3 += this.Field27.size(); var3 < 6; ++var3) {
            var1.drawImage(Class811.Field20, var3 * 20, 5 * this.Field8, 0);
        }

    }

    private void Field3(Graphics var1) {
        Class60.Field8 = this;
        boolean var2 = false;
        var1.setClip(0, 0, this.Field2, this.Field3);

        int var6;
        for (var6 = 0; var6 < this.Field29.size(); ++var6) {
            Class381 var3 = (Class381) this.Field29.elementAt(var6);
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
            Class272 var5 = (Class272) this.Field28.elementAt(var4);
            var1.drawImage(Class811.Field20, var4 % var7 * this.Field7 + 4, this.Field29.size() * 13 + var4 / var7 * this.Field7 + 13, 0);
            Class811.Field1(var1, Class811.Field1(var5.Field1).Field12, var4 % var7 * this.Field7 + this.Field7 / 2 + 4, this.Field29.size() * 13 + 13 + var4 / var7 * this.Field7 + this.Field7 / 2);
            Class21.Field9[3].Field1(var1, String.valueOf(var5.Field3), var4 % var7 * this.Field7 + this.Field7 / 2 + 4, this.Field29.size() * 13 + 13 + var4 / var7 * this.Field7 + this.Field7 / 2, 1);
            ++var6;
        }

        while (var6 < 12) {
            var1.drawImage(Class811.Field20, var6 % 6 * this.Field7 + 4, this.Field29.size() * 13 + var6 / 6 * this.Field7 + 13, 0);
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
            var1.drawImage(Class811.Field20, var6 * 20 + 4, 5 * this.Field8, 0);
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
            var1.translate(0, -this.Field113);
        }

        int var4;
        int var5;
        for (var4 = 0; var4 < this.Field6; ++var4) {
            for (var5 = 0; var5 < 3; ++var5) {
                var1.drawImage(Class811.Field20, var5 * 18, var4 * 18, 0);
            }
        }

        int var8;
        int var9;
        Class534 var10;
        for (var4 = 0; var4 < Class357.Field125.size(); ++var4) {
            var8 = var4 % 3 * 18;
            var9 = var4 / 3 * 18;
            if ((var10 = (Class534) Class357.Field125.elementAt(var4)).Field26) {
                var1.setColor(7706352);
                var1.fillRect(var8 + 2, var9 + 2, 14, 14);
            }

            var10.Field1(var1, var8 + 9, var9 + 9);
        }

        var4 = Class357.Field125.size();

        for (var5 = 0; var5 < Class582.Field37.size(); ++var5) {
            var8 = var4 % 3 * 18;
            var9 = var4 / 3 * 18;
            Class272 var6 = (Class272) Class582.Field37.elementAt(var5);
            Class811.Field1(var1, Class811.Field1(var6.Field1).Field12, var8 + 9, var9 + 9);
            Class21.Field9[3].Field1(var1, String.valueOf(var6.Field3), var8 + 18, var9 + 18 - Class21.Field9[3].Field2(), 1);
            ++var4;
        }

        if (this.Field4 % this.Field5 > 2) {
            var1.translate(0, this.Field113);
            var1.translate(0, -Field17);
        } else {
            var1.translate(0, Field17);
            var1.translate(0, -this.Field113);
        }

        int var11;
        for (var5 = 0; var5 < this.Field6; ++var5) {
            for (var11 = 0; var11 < 3; ++var11) {
                var1.setColor(6568449);
                var1.fillRect(var11 * 18 + 54, var5 * 18, 18, 18);
                var1.drawImage(Class811.Field20, var11 * 18 + 54, var5 * 18, 0);
            }
        }

        if (this.Field4 % this.Field5 > 2 && !this.Field16) {
            Field2(var1, this.Field4 % this.Field5 * 18 + 1, this.Field4 / this.Field5 * 18 + 1);
        }

        var10 = null;
        Vector var12;
        if (Field22[Field21] == 22) {
            var12 = Class357.Field128;
        } else {
            var12 = this.Field26;
        }

        for (var11 = 0; var11 < var12.size(); ++var11) {
            if (var12.elementAt(var11) instanceof Class534) {
                ((Class534) var12.elementAt(var11)).Field1(var1, var11 % 3 * 18 + 54 + 9, var11 / 3 * 18 + 9);
            } else {
                Class230 var7 = (Class230) var12.elementAt(var11);
                Class811.Field1(var1, Class811.Field1(var7.Field2).Field12, var11 % 3 * 18 + 54 + 9, var11 / 3 * 18 + 9);
            }
        }

    }

    private void Field5(Graphics var1) {
        var1.setClip(4, 0, this.Field2 - 8, this.Field3);

        int var2;
        for (var2 = 0; var2 < 5; ++var2) {
            var1.drawImage(Class811.Field20, this.Field95[var2][0], this.Field95[var2][1], 0);
        }

        var1.setColor(10595790);
        if (this.Field6 == 1 && this.Field4 < 5) {
            var1.fillRect(this.Field95[this.Field4][0] + 1, this.Field95[this.Field4][1] + 1, 16, 16);
        }

        for (var2 = 0; var2 < this.Field28.size(); ++var2) {
            Class230 var3 = (Class230) this.Field28.elementAt(var2);
            int var10002 = this.Field95[var2][0] + 10;
            short var10003 = this.Field95[var2][1];
            Class811.Field1(var1, Class811.Field1(var3.Field2).Field12, var10002, var10003 + 10);
        }

        var1.translate(-Field19, 0);
        if (this.Field6 != 1) {
            var1.fillRect(this.Field4 % this.Field5 * 20 + 4, 5 * this.Field8 + 1, 16, 16);
        }

        this.Field3(var1, 0, this.Field8 * 5);

        for (var2 = 0 + this.Field27.size(); var2 < 6; ++var2) {
            var1.drawImage(Class811.Field20, var2 * 20 + 4, 5 * this.Field8, 0);
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

            var1.drawImage(Class811.Field20, var2 * 20 + 4, var3, 0);
            Class272 var5 = (Class272) this.Field27.elementAt(var4);
            Class811.Field1(var1, Class811.Field1(var5.Field1).Field12, var2 * 20 + 10 + 4, var3 + 8);
            if (Field22[Field21] != 21) {
                Class750 var6;
                String var8 = (var6 = Class811.Field1(var5.Field1)).Field10.substring(var6.Field10.length() - 1);

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
        Class464 var2 = this;
        if (!this.Field16 && Class106.Field12 % 10 > 3 && this.Field4 / this.Field5 < 4) {
            var1.setColor(10595790);
            if (this.Field4 % this.Field5 == 1 && this.Field4 / this.Field5 != 4) {
                var1.fillRect(25, 0, 75, 86);
            } else {
                var1.fillRect(this.Field4 % this.Field5 * 50 + 4, this.Field4 / this.Field5 * this.Field8 + 1, 17, 17);
            }
        }

        for (int var4 = 0; var4 < 8; ++var4) {
            var3.drawImage(Class811.Field20, var4 / 4 * 5 * var2.Field7 + 4, var4 % 4 * var2.Field8, 0);
        }

        var3.setColor(10595790);
        var3.drawRect(25, 0, 75, 86);
        var1.setClip(4, 0, this.Field2 - 8, this.Field3);
        if (this.Field60 != null) {
            var1.drawImage(this.Field60, 63, 43, 3);
        }

        int var5;
        for (var5 = 0; var5 < Class582.Field36.size(); ++var5) {
            Class230 var6 = (Class230) Class582.Field36.elementAt(var5);
            int var10002 = var5 % 2 * 100 + 10 + 3;
            int var10003 = var5 / 2 * this.Field8;
            Class811.Field1(var1, Class811.Field1(var6.Field2).Field12, var10002, var10003 + this.Field8 / 2);
        }

        var1.translate(-Field19, 0);
        if (this.Field4 / this.Field5 == 4) {
            var1.fillRect(this.Field4 % this.Field5 * this.Field7 + 4, 4 * this.Field8 + 1, 17, 17);
        }

        var5 = 0;

        for (int var7 = 0; var7 < Class357.Field125.size(); ++var7) {
            var1.drawImage(Class811.Field20, var5 * this.Field7 + 4, 4 * this.Field8, 0);
            ((Class534) Class357.Field125.elementAt(var7)).Field1(var1, var5 * 20 + 10 + 4, 4 * this.Field8 + 8);
            ++var5;
        }

        this.Field3(var1, var5, 4 * this.Field8);

        for (var5 += this.Field27.size(); var5 <= 6; ++var5) {
            var1.drawImage(Class811.Field20, var5 * 20 + 4, 4 * this.Field8, 0);
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

                var2.drawImage(Class811.Field20, var4 * 18, var3 * 18, 0);
            }
        }

        var1.translate(-Field19, 0);
        if (!this.Field16) {
            var1.setColor(10595790);
            var1.fillRect(this.Field4 % this.Field5 * 18 + 1, this.Field4 / this.Field5 * 18 + 1, 16, 16);
        }

        int var5 = 0;

        int var6;
        for (var6 = 0; var6 < Class357.Field125.size(); ++var6) {
            Class534 var7;
            Class805 var10 = Class811.Field2((int) (var7 = (Class534) Class357.Field125.elementAt(var6)).Field18);
            var1.drawImage(Class811.Field20, var5, 90, 0);
            if (var7.Field26) {
                var1.setColor(7706352);
                var1.fillRect(var5 + 2, 92, 14, 14);
            }

            Class379.Field1(var1, var10.Field8, var5 + 9, 99);
            var5 += 18;
        }

        for (var6 = 0; var6 < Class582.Field42.length; ++var6) {
            if (Class582.Field42[var6].Field1 - Class582.Field42[var6].Field2 > 0 && Class582.Field42[var6].Field6) {
                var1.drawImage(Class811.Field20, var5, 90, 0);
                Class379.Field1(var1, (short) (Class582.Field42[var6].Field5 + 5500), var5 + 9, 98);
                Class21.Field9[3].Field1(var1, String.valueOf(Class582.Field42[var6].Field1 - Class582.Field42[var6].Field2), var5 + 9, 99, 1);
                var5 += 18;
            }
        }

        if (var5 / 18 < 6) {
            for (var6 = 0; var6 < 6 - var5 / 18; ++var6) {
                var1.drawImage(Class811.Field20, var5 + var6 * 18, 90, 0);
            }
        }

        var1.translate(Field19, 0);
        Vector var9 = Class106.Field19.Field15.Field40;
        Vector var8 = Class106.Field19.Field15.Field41;
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
        if (var1 instanceof Class534) {
            ((Class534) var1).Field1(var0, var2 + 9, var3 + 9);
        } else {
            Class647 var4 = (Class647) var1;
            Class379.Field1(var0, (short) (var4.Field5 + 5500), var2 + 9, var3 + 9);
            Class21.Field9[3].Field1(var0, String.valueOf(var4.Field1), var2 + 17, var3 + 9, 1);
        }
    }

    private void Field8(Graphics var1) {
        String[] var2 = new String[]{"Kiếm sỹ", "Chiến binh", "Pháp sư", "Đấu sỹ", "Cung thủ"};
        Class21.Field10[0].Field1(var1, var2[Class106.Field19.Field15.Field93], 60, -14, 2);
        var1.setColor(11908533);
        var1.fillRect(-8, 0, 133, 1);
        var1.fillRect(-8, 30, 133, 1);
        var1.setClip(0, 0, this.Field2, this.Field3);
        var1.translate(-Field19, 0);

        int var4;
        for (var4 = 0; var4 < this.Field5; ++var4) {
            Class189 var3 = (Class189) ((Vector) Class62.Field22.elementAt(Class106.Field19.Field15.Field93)).elementAt(var4);
            Class379.Field1.Field1(var3.Field3, var4 * 23 + this.Field7 / 2, this.Field3 / 2, 0, 3, var1);
            var1.drawImage(Class811.Field40, var4 * 23 + this.Field7 / 2, this.Field3 / 2, 3);
        }

        if (!this.Field16 && Class106.Field12 % 10 > 3) {
            var1.setColor(14139920);
            var1.drawRect(this.Field4 * this.Field7, 5, this.Field7 - 2, 20);
        }

        if (!this.Field16) {
            var1.translate(Field19, 0);
            var1.setClip(-10, 28, 133, 72);
            var1.translate(0, -Field17);
            if (this.Field75 != null) {
                for (var4 = 0; var4 < this.Field75.size(); ++var4) {
                    String var5;
                    if ((var5 = (String) this.Field75.elementAt(var4)).substring(0, 1).equals("`")) {
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

        for (int var2 = 0; var2 < this.Field93.size(); ++var2) {
            String var3;
            if ((var3 = (String) this.Field93.elementAt(var2)).length() >= 2 && var3.substring(0, 1).equals("`")) {
                var3 = var3.substring(1, var3.length());
                Class21.Field10[0].Field1(var1, var3, 4, var2 * 15, 0);
            } else {
                Class21.Field8.Field1(var1, var3, 4, var2 * 15, 0);
            }
        }

    }

    private static String Field8(int var0) {
        String var1 = "";
        if (var0 == 0 && Class62.Field98 != null) {
            var1 = Class62.Field98.Field1().replace('Â', 'â').replace('Ô', 'ô');
        }

        if (Class62.Field99 != null && var0 == 1) {
            try {
                var1 = Class62.Field99.Field1().replace('Â', 'â').replace('Ô', 'ô');
            } catch (Exception var4) {
            }
        }

        if (Class62.Field100 != null && var0 == 2) {
            try {
                var1 = Class62.Field100.Field1().replace('Â', 'â').replace('Ô', 'ô');
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
                (var4 = new String[(var7 = Class809.Field1(var6, "|")).length + 1])[0] = Class62.Field98.Field9;

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
                (var4 = new String[(var10 = Class809.Field1(var2, "|")).length + 1])[0] = Class62.Field99.Field9;

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
                (var4 = new String[(var10 = Class809.Field1(var3, "|")).length + 1])[0] = Class62.Field100.Field9;

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
        if ((var2 = Class357.Field127.size()) <= 0) {
            Class21.Field8.Field1(var1, "Chưa có nhóm", 8, 5, 0);
        } else {
            if (!this.Field16) {
                var1.setColor(6448384);
                var1.fillRect(2, this.Field4 << 5, 131, 32);
            }

            for (int var4 = 0; var4 < var2; ++var4) {
                Class802 var3 = (Class802) Class357.Field127.elementAt(var4);
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
        if (this.Field102 != null) {
            for (var2 = 0; var2 < this.Field102.length; ++var2) {
                Class21.Field8.Field1(var1, this.Field102[var2], 4, 5 + var2 * 12, 0);
            }
        }

        if (Field9 != null) {
            for (var2 = 0; var2 < Field9.length; ++var2) {
                Class21.Field8.Field1(var1, Field9[var2], 4, 5 + (var2 + this.Field102.length + 1) * 12, 0);
            }
        }

    }

    private void Field14(Graphics var1) {
        Class21.Field7.Field1(var1, String.valueOf(Class106.Field19.Field15.Field79), 105, -8, 2);
        Class21.Field10[0].Field1(var1, "Điểm kỹ năng: ", 60, -14, 2);
        var1.setColor(11908533);
        var1.fillRect(-8, 0, 133, 1);
        var1.fillRect(-8, 30, 133, 1);
        var1.setClip(-3, 0, this.Field2 + 6, this.Field3);
        var1.translate(-Field19, 0);

        int var2;
        for (var2 = 0; var2 < this.Field5; ++var2) {
            Class379.Field1.Field1(var2, var2 * 23 + this.Field7 / 2, this.Field3 / 2, 0, 3, var1);
            var1.drawImage(Class811.Field40, var2 * 23 + this.Field7 / 2, this.Field3 / 2, 3);
            Class21.Field9[1].Field1(var1, String.valueOf(Class357.Field97[var2]), var2 * 23 + this.Field7 - 4, this.Field3 / 2 + 5, 1);
        }

        if (!this.Field16 && Class106.Field12 % 10 > 3) {
            var1.setColor(14139920);
            var1.drawRect(this.Field4 * this.Field7, 5, this.Field7 - 2, this.Field8 + 1);
        }

        if (!this.Field16) {
            if (this.Field4 < 0) {
                this.Field4 = 0;
            } else if (this.Field4 > Class599.Field11[Class106.Field19.Field15.Field93].length - 1) {
                this.Field4 = Class599.Field11[Class106.Field19.Field15.Field93].length - 1;
            }

            var1.translate(Field19, 0);
            var1.setClip(-11, 32, 138, 68);
            String var5 = Class599.Field11[Class106.Field19.Field15.Field93][this.Field4];
            byte var3;
            if ((var3 = Class357.Field97[this.Field4]) == 9) {
                var5 = var5 + " MAX" + var3;
            } else if (var3 >= 1) {
                var5 = var5 + " lv " + var3;
            }

            String[] var6 = Class106.Field19.Field15.Field10(this.Field4);
            var1.translate(0, -Field17);
            Class21.Field10[0].Field1(var1, var5, -5, 29 + (this.Field110 ? Field17 : 0), 0);
            var2 = 40;

            for (int var4 = 0; var4 < var6.length; ++var4) {
                Class21.Field8.Field1(var1, var6[var4], -5, var2 + (this.Field110 ? Field17 : 0), 0);
                var2 += 12;
            }
        }

    }

    private void Field15(Graphics var1) {
        Field39.Field1(var1, (short) 58, (short) 90);
        if (this.Field52 != null && Class106.Field12 % 16 >= 8) {
            var1.drawImage(this.Field52, this.Field2 / 2, 0, 17);
        }

        var1.drawImage(Class811.Field25[0], 0, 0, 0);
        var1.drawImage(Class811.Field18, 25, 83, 0);
        if (!this.Field16 && Class106.Field12 % 10 > 3) {
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
                Class534 var3;
                Class805 var4;
                if ((var4 = Class811.Field2((int) (var3 = (Class534) Field39.Field98.elementAt(var2)).Field18)).Field3 == 8) {
                    if (var3.Field38 == 1) {
                        Field1((Graphics) var1, (Class534) var3, 107, 52);
                    } else {
                        Field1((Graphics) var1, (Class534) var3, 107, 73);
                    }
                } else {
                    Field1(var1, var3, Field115[var4.Field3], Field116[var4.Field3]);
                }
            }
        }

        if (Field39.Field63 > -1 && !Class106.Field19.Field15.Field141) {
            Class379.Field1(var1, (short) (Field39.Field64 + 7500), 82, 92);
        }

    }

    private void Field16(Graphics var1) {
        if (Field39 != null && Field39.Field103 != null && (Field39.Field167 != -1 || Field39.Field106 > -1)) {
            var1.drawRegion(Field39.Field103, 0, Field39.Field92 * this.Field70, Field39.Field91, Field39.Field92, 0, Class811.Field25[0].getWidth() / 2, Class811.Field25[0].getHeight() / 2, 3);
        }

        var1.drawImage(Class811.Field25[0], 0, 0, 0);
        var1.setColor(2368548);

        int var2;
        for (var2 = 0; var2 < 10; ++var2) {
            var1.fillRect(3 + var2 % 2 * this.Field7, 3 + var2 / 2 * 21, 16, 16);
        }

        if (!this.Field16 && Class106.Field12 % 10 > 3) {
            var1.setColor(10595790);
            var1.fillRect(3 + this.Field4 % this.Field5 * this.Field7, 3 + this.Field4 / this.Field5 * 21, 16, 16);
        }

        if (Field39 != null) {
            if (Field39.Field99 != null && (Field39.Field167 != -1 || Field39.Field106 > -1)) {
                int var5 = Field39.Field99.size();

                for (var2 = 0; var2 < var5; ++var2) {
                    Class534 var3;
                    Class805 var4;
                    if ((var3 = (Class534) Field39.Field99.elementAt(var2)) != null && (var4 = Class811.Field2((int) var3.Field18)) != null) {
                        Field1(var1, var3, Field115[var4.Field3], Field116[var4.Field3]);
                    }
                }
            }

            if (Field39.Field63 > -1 && Field39 != null && (Field39.Field167 != -1 || Field39.Field106 > -1)) {
                Class379.Field1(var1, (short) (Field39.Field64 + 7500), 82, 92);
            }
        }

    }

    private static void Field1(Graphics var0, Class534 var1, int var2, int var3) {
        Class805 var4 = Class811.Field2((int) var1.Field18);
        Class379.Field1(var0, var4.Field8, var2, var3);
    }

    private void Field17(Graphics var1) {
        var1.setColor(25695);
        var1.fillRect(this.Field64, this.Field65, this.Field66, this.Field67 + this.Field24 * 15);
        var1.setColor(16774720);
        var1.drawRect(this.Field64, this.Field65, this.Field66 - 1, this.Field67 - 1 + this.Field24 * 15);
        int var2 = 0;
        var1.setClip(this.Field64, this.Field65, this.Field66, this.Field67 + this.Field24 * 15 - 2);
        var1.translate(0, -Field85);

        for (int var3 = 0; var3 < this.Field73.length + this.Field24; ++var3) {
            if (var3 == 1 && this.Field98 != null && this.Field98.length > 0) {
                for (int var4 = 0; var4 < this.Field98.length; ++var4) {
                    var1.drawImage(Class811.Field39, this.Field64 + 12 + var4 * 20, this.Field65 + 12 + var2, 3);
                    if (this.Field98[var4] != -1) {
                        Class811.Field1(var1, this.Field98[var4], this.Field64 + 12 + var4 * 20, this.Field65 + 12 + var2);
                    }
                }

                var2 += 18;
            }

            if (!this.Field73[var3].equals("")) {
                byte var6 = (byte) (this.Field73[var3].charAt(0) - 48);
                byte var5 = 1;
                if (!Field1(this.Field73[var3].charAt(0))) {
                    var6 = 0;
                    var5 = 0;
                }

                Class21.Field10[var6 >= 6 ? 0 : var6].Field1(var1, this.Field73[var3].substring(var5), this.Field64 + 4, this.Field65 + 4 + var2, 0);
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

            if (this.Field47 * 42 + 42 > this.Field100) {
                var3 = this.Field99;
            }

            for (var2 = var2; var2 < var3; ++var2) {
                if (this.Field41) {
                    return;
                }

                int var4;
                Class86 var6;
                if ((var4 = var2 + this.Field47 * 42) < this.Field12.size() && (var6 = (Class86) this.Field12.elementAt(var4)) != null) {
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

                ((Class86) this.Field12.elementAt(var2)).Field1(var1, var2 % this.Field5 * this.Field7 + this.Field7 / 2, var2 / this.Field5 * this.Field8 + this.Field8 / 2);
            }

        } catch (Exception var5) {
        }
    }

    private void Field31() {
        this.Field12.removeAllElements();
        int var1 = Class811.Field6.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class750 var3 = (Class750) Class811.Field6.elementAt(var2);
            if (var3.Field7 == Field21 && var3.Field17) {
                this.Field12.addElement(new Class510(this, "", new Class460(this, var3, var2), var3));
            }
        }

    }

    public final void Field19() {
        this.Field14 = false;
        this.Field98 = null;
    }

    private void Field1(String var1, int var2, int var3) {
        if (!this.Field14) {
            this.Field14 = true;
            var1 = var1.replace('Â', 'â');
            this.Field66 = 125;
            this.Field64 = var2 + this.Field62 + this.Field68 - this.Field66 / 2 + 9;
            this.Field65 = var3 + this.Field63 + this.Field69 + 18;
            this.Field73 = Class21.Field2.Field1(var1, this.Field66 - 10);
            this.Field67 = this.Field73.length * 15 + 8 + (this.Field98 != null ? 16 : 0);
            this.Field64 -= Field19;
            if (1 + this.Field64 + this.Field66 > Class106.Field13) {
                this.Field64 = Class106.Field13 - this.Field66 - 1;
            } else if (1 + this.Field64 < 0) {
                this.Field64 = -1;
            }

            this.Field65 -= Field17;
            if (this.Field24 == 0) {
                this.Field24 = -(this.Field73.length - 1);
            }

            Field84 = 0;
            Field85 = 0;
            Field88 = 0;
            if (this.Field67 > 100) {
                if ((Field88 = this.Field67 - 100) < 0) {
                    Field88 = 0;
                }

                this.Field67 = 100;
            }

            if (this.Field65 + this.Field67 > Class106.Field14 - 20) {
                this.Field65 = Class106.Field14 - 20 - this.Field67;
            }

        } else {
            this.Field24 = 0;
            this.Field19();
        }
    }

    public static int Field4(int var0) {
        return Class106.Field19.Field15.Field121[var0];
    }

    private Vector Field32() {
        Vector var1 = new Vector();
        int var2 = 0;
        int var3 = Class582.Field42.length;

        int var4;
        for (var4 = 1; var4 < var3; ++var4) {
            if (Field4(var4) > 0) {
                var1.addElement(new Class418(this, "", new Class466(this, var4, var2), var4));
                ++var2;
            }
        }

        var4 = Class582.Field39.size();

        int var5;
        for (var5 = 0; var5 < var4; ++var5) {
            Class272 var6 = (Class272) Class582.Field39.elementAt(var5);
            var1.addElement(new Class414(this, "", new Class416(this, var6, var2), var6));
            ++var2;
        }

        var5 = Class582.Field38.size();

        int var11;
        for (var11 = 0; var11 < var5; ++var11) {
            Class272 var9;
            Class750 var7 = Class811.Field1((var9 = (Class272) Class582.Field38.elementAt(var11)).Field1);
            var1.addElement(new Class426(this, "", new Class457(this, var9, var2), var9, var2, var7));
            ++var2;
        }

        var11 = Class582.Field37.size();

        for (var3 = 0; var3 < var11; ++var3) {
            Class272 var13;
            Class750 var10 = Class811.Field1((var13 = (Class272) Class582.Field37.elementAt(var3)).Field1);
            var1.addElement(new Class422(this, "", new Class424(this, var13, var2), var13, var10));
            ++var2;
        }

        var3 = Class357.Field126.size();

        for (var4 = 0; var4 < var3; ++var4) {
            Class42 var12 = (Class42) Class357.Field126.elementAt(var4);
            var1.addElement(new Class454(this, "", new Class420(this, var12, var2), var12));
            ++var2;
        }

        var4 = Class357.Field125.size();

        int var15;
        for (var15 = 0; var15 < var4; ++var15) {
            Class534 var14 = (Class534) Class357.Field125.elementAt(var15);
            var1.addElement(new Class433(this, "", new Class434(this, var14, var2), var14));
            ++var2;
        }

        if (Class582.Field43 != null) {
            var3 = Class582.Field43.length;

            for (var15 = 0; var15 < var3; ++var15) {
                if (Class582.Field43[var15] > 0) {
                    var4 = Class115.Field2[var15] + 8000;
                    String var8 = String.valueOf(Class582.Field43[var15]);
                    var1.addElement(new Class439(this, "", new Class440(this, var15, var2), var4, var8));
                }
            }
        }

        return var1;
    }

    public final void Field1(short var1, int var2, int var3) {
        Class750 var4;
        String var5 = Class534.Field1((var4 = Class811.Field1(var1)).Field10, "0");
        var5 = var5 + Class534.Field1(var4.Field11, "0");
        if (this.Field15) {
            var5 = var5 + Class534.Field1("Giá bán lại: " + var4.Field18 / 5, "0");
        }

        this.Field1(var5, var2, var3);
    }

    public final void Field2(short var1, int var2, int var3) {
        Class750 var4;
        String var5 = Class534.Field1((var4 = Class811.Field1(var1)).Field10, "0");
        var5 = var5 + " - Đã khóa";
        var5 = var5 + Class534.Field1(var4.Field11, "0");
        if (this.Field15) {
            var5 = var5 + Class534.Field1("Giá bán lại: " + var4.Field18 / 5, "0");
        }

        this.Field1(var5, var2, var3);
    }

    public final void Field1(Class230 var1, int var2, int var3) {
        Class750 var5;
        String var4 = Class534.Field1((var5 = Class811.Field1(var1.Field2)).Field10, "0");
        var4 = var4 + Class534.Field1(var5.Field11, "0");
        if (this.Field15) {
            var4 = var4 + Class534.Field1("Giá bán : " + var1.Field3, "0");
        }

        this.Field1(var4, var2, var3);
    }

    public final void Field1(short var1, int var2) {
        Class750 var3;
        String var4 = Class534.Field1((var3 = Class811.Field2(var1)).Field10, "0");
        var4 = var4 + Class534.Field1(var3.Field11, "0");
        if (this.Field15) {
            var4 = var4 + Class534.Field1("Giá bán lại: " + Class106.Field1((long) (var3.Field18 / 5)), "0");
        }

        this.Field1(var4, var2 % this.Field5 * 18, var2 / this.Field5 * 18);
    }

    public static String Field5(int var0) {
        String var1 = "0" + Class115.Field1[var0];
        return var1 + "\nSố lượng: " + Class582.Field43[var0];
    }

    public final void Field20() {
        if (!this.Field16) {
            this.Field19();
            int var1;
            int var2 = var1 = this.Field4 + (Field22[Field21] == 0 ? this.Field47 * 42 : 0);
            int var3 = 0;
            int var4 = Class106.Field19.Field15.Field121.length;

            int var5;
            Vector var8;
            for (var5 = 1; var5 < var4; ++var5) {
                if (Class106.Field19.Field15.Field121[var5] > 0) {
                    if (var1 == var3) {
                        var8 = new Vector();
                        if (var5 >= 14 && var5 <= 18 && Class106.Field19.Field15.Field200 > 0) {
                            var8.addElement(new Class86("Tháo khăn", new Class683(this)));
                        } else {
                            var8.addElement(new Class86("Sử dụng", new Class688(this, var5)));
                        }

                        if (var5 < 14 || var5 >= 21) {
                            var8.addElement(new Class86("Cho vào phím tắt", new Class687(this, var5)));
                        }

                        var8.addElement(new Class86("Bỏ ra đất", new Class691(this, var5)));
                        Class106.Field21.Field1(var8, 2);
                        return;
                    }

                    ++var3;
                }
            }

            var2 -= var3;
            var5 = Class582.Field39.size();
            Vector var11;
            if (var2 < var5) {
                Class272 var19 = (Class272) Class582.Field39.elementAt(var2);
                (var11 = new Vector()).addElement(new Class86("Sử dụng", new Class437(this, var19)));
                var11.addElement(this.Field1((Class272) var19, 1, (byte) 0));
                Class106.Field21.Field1(var11, 2);
                return;
            }

            var2 -= Class582.Field39.size();
            int var6 = Class582.Field38.size();
            Class750 var22;
            if (var2 < var6) {
                Class272 var14 = (Class272) Class582.Field38.elementAt(var2);
                if (this.Field15) {
                    Class750 var17 = Class811.Field1(var14.Field1);
                    Class106.Field2("Bạn có muốn bán vật phẩm này với giá " + var17.Field18 / 5 + "$ không?", new Class435(this, var14, var1));
                    return;
                }

                Vector var15 = new Vector();
                if ((var22 = Class811.Field1(var14.Field1)) != null && var22.Field8 == 4) {
                    Class86 var18 = new Class86("Sử dụng", new Class448(this, var14));
                    var15.addElement(var18);
                }

                var15.addElement(this.Field1((Class272) var14, 0, (byte) 1));
                Class106.Field21.Field1(var15, 2);
                return;
            }

            var2 -= Class582.Field38.size();
            var3 = Class582.Field37.size();
            if (var2 < var3) {
                Class272 var12 = (Class272) Class582.Field37.elementAt(var2);
                if (this.Field15) {
                    var22 = Class811.Field1(var12.Field1);
                    Class106.Field2("Bạn có muốn bán vật phẩm này với giá " + var22.Field18 / 5 + "$ không?", new Class446(this, var12, var1));
                    return;
                }

                Vector var21 = new Vector();
                Class750 var16;
                if ((var16 = Class811.Field1(var12.Field1)) != null && var16.Field8 == 4) {
                    Class86 var13 = new Class86("Sử dụng", new Class444(this, var12));
                    var21.addElement(var13);
                }

                var21.addElement(this.Field1((Class272) var12, 0, (byte) 0));
                Class106.Field21.Field1(var21, 2);
                return;
            }

            var2 -= Class582.Field37.size();
            var4 = Class357.Field126.size();
            if (var2 < var4) {
                Class42 var20 = (Class42) Class357.Field126.elementAt(var2);
                (var8 = new Vector()).addElement(new Class86("Sử dụng", new Class442(this, var20)));
                Class106.Field21.Field1(var8, 2);
                return;
            }

            var2 -= Class357.Field126.size();
            var5 = Class357.Field125.size();
            if (var2 < var5) {
                Class27.Field1 = var2;
                Class534 var10 = (Class534) Class357.Field125.elementAt(var2);
                if (!this.Field15) {
                    (var11 = new Vector()).addElement(new Class86("Sử dụng", new Class707(this, var10)));
                    var11.addElement(new Class86("Làm Đồ", new Class677(8)));
                    if (var10.Field37 == 1 && var10.Field25 >= 50 && !Class534.Field2(var10.Field2().Field3)) {
                        var11.addElement(new Class86("Tách trang bị", new Class706(this, var10)));
                    }

                    var11.addElement(new Class86("Bỏ ra đất", new Class708(this, var10)));
                    if (var10.Field37 != 0 && var10.Field37 != 4) {
                        if (var10.Field37 == 1) {
                            var11.addElement(new Class86("Thăng cấp thường", new Class710(this, var10)));
                            var11.addElement(new Class86("Thăng cấp giữ thuộc tính", new Class721(this, var10)));
                        }

                        if (var10.Field4.equals("")) {
                            var11.addElement(new Class86("Đóng dấu", new Class719(this, var10)));
                        }

                        if (!var10.Field4.toLowerCase().equals(Class106.Field19.Field15.Field65.toLowerCase())) {
                            var11.addElement(new Class86("Đóng dấu lại", new Class673(this, var10)));
                        } else {
                            Class805 var7;
                            if ((var7 = Class811.Field2((int) var10.Field18)).Field3 >= 3 && var7.Field3 <= 7 || var7.Field3 == 8 || var7.Field3 == 9) {
                                var11.addElement(new Class86("Sửa thuộc tính kỹ năng", new Class723(this, var10)));
                            }
                        }

                        if (var10.Field29 == 0) {
                            var11.addElement(new Class86("Khoá", new Class676(this, var10)));
                        }

                        if (var10.Field29 == 1) {
                            var11.addElement(new Class86("Khoá lại", new Class680(this, var10)));
                        }

                        var11.addElement(new Class86("Sửa thuộc tính khác", new Class679(this, var10)));
                    }

                    Class106.Field21.Field1(var11, 2);
                    return;
                }

                Class805 var9 = Class811.Field2((int) var10.Field18);
                Class106.Field2("Bạn có muốn bán vật phẩm này với giá " + var9.Field10 / 5 + "$ không?", new Class682(this, var10, var1));
            }
        }

    }

    private Class86 Field1(Class272 var1, int var2, byte var3) {
        return new Class86("Bỏ ra đất", new Class681(this, var1, var2, var3));
    }

    public final void Field1(Class534 var1) {
        Class805 var3;
        if ((var3 = Class811.Field2((int) var1.Field18)).Field5 != 0 && var3.Field5 != Class106.Field19.Field15.Field68) {
            Class106.Field1("Vật phẩm này chỉ dành cho " + Class811.Field8[var3.Field5] + ".");
        } else {
            short var2;
            if (var3.Field12 != -1 && var3.Field12 != Class106.Field19.Field15.Field93 && (var2 = var3.Field3) >= 3 && var2 <= 7) {
                Class106.Field1("Vật phẩm này chỉ dành cho " + Class59.Field2[var3.Field12][Class59.Field3].Field1 + ".");
            } else if (var3.Field6 > Class106.Field19.Field15.Field22) {
                Class106.Field1("Bạn phải đạt cấp " + var3.Field6 + " để có thể dùng.");
            } else {
                Class261.Field1().Field7(var1.Field9);
            }
        }
    }

    private void Field1(Class534 var1, boolean var2, int var3, int var4) {
        this.Field98 = null;
        if (var1.Field36 > 0) {
            this.Field98 = new byte[var1.Field36];

            for (int var5 = 0; var5 < var1.Field36; ++var5) {
                this.Field98[var5] = -1;
            }

            byte var8 = 0;

            label36:
            for (int var6 = 0; var6 < var1.Field34.size(); ++var6) {
                Class826 var7;
                if ((var7 = (Class826) var1.Field34.elementAt(var6)).Field1(false) == 3) {
                    var6 = 0;

                    while (true) {
                        if (var6 >= var1.Field35) {
                            break label36;
                        }

                        this.Field98[var8++] = Class811.Field56[var7.Field3() - 10];
                        ++var6;
                    }
                }
            }
        }

        this.Field1(var1.Field1(var2), var3, var4);
        if (!var1.Field32) {
            var1.Field32 = true;
            Class261.Field1().Field1(var1.Field9, Field39 == null ? Class106.Field19.Field15.Field189 : Field39.Field189);
        }

    }

    private void Field1(Vector var1, int var2) {
        this.Field12.removeAllElements();
        int var3 = 0;
        int var7 = var1.size();

        for (int var4 = 0; var4 < var7; ++var4) {
            Class534 var5;
            if (Class811.Field2((int) (var5 = (Class534) Class106.Field19.Field21.elementAt(var4)).Field18).Field3 == var2 || var2 == -1) {
                int var6 = var3++;
                this.Field12.addElement(new Class771(this, "", new Class760(this, var5, var6), var5));
            }
        }

    }

    private void Field9(int var1) {
        super.Field103 = new Class86("Mua", new Class765(this, var1));
    }

    private void Field2(Vector var1) {
        this.Field12.removeAllElements();
        int var2 = var1.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class750 var4 = (Class750) var1.elementAt(var3);
            if (var4.Field17) {
                this.Field12.addElement(new Class731(this, "", new Class769(this, var4, var3), var4));
            }
        }

    }

    private void Field33() {
        this.Field12.removeAllElements();
        int var1 = Class106.Field19.Field21.size();

        for (int var2 = 0; var2 < var1; ++var2) {
            Class534 var3 = (Class534) Class106.Field19.Field21.elementAt(var2);
            this.Field12.addElement(new Class584(this, "", new Class585(this, var3), var3));
        }

    }

    public final void Field21() {
        if (this.Field13.size() > 0) {
            if (Field22[Field21] == 10) {
                Class261.Field1().Field1(this.Field13);
            } else if (Field22[Field21] == 19) {
                Class261.Field1().Field3(this.Field13);
            } else {
                Class261.Field1().Field2(this.Field13);
            }

            this.Field13.removeAllElements();
        }

        if (Field22[Field21] != 21 && Field22[Field21] != 25) {
            if (Field22[Field21] == 22) {
                Class106.Field19.Field28.Field9();
            } else {
                if (Field22[Field21] == 8) {
                    Class106.Field19.Field28.Field10((int) Class106.Field19.Field15.Field189);
                    Class106.Field19.Field15.Field139 = false;
                }

            }
        } else {
            if (Field22[Field21] == 21) {
                Class261.Field1().Field6((int) -1);
            } else {
                Class261.Field1().Field19(-1);
            }

            int var1 = Class582.Field36.size();

            for (int var2 = 0; var2 < var1; ++var2) {
                Class272 var3;
                if ((var3 = Class272.Field1(((Class230) Class582.Field36.elementAt(var2)).Field2)) != null) {
                    ++var3.Field3;
                    break;
                }
            }

            Class582.Field36.removeAllElements();
            Class106.Field19.Field15.Field142 = null;
            this.Field60 = null;
            this.Field101 = -1;
        }
    }

    public static void Field22() {
        Class582.Field36.removeAllElements();
    }

    private void Field34() {
        this.Field93 = new Vector();
        String var1 = Field8(0);
        String var2 = Field8(1);
        String var3 = Field8(2);
        int var4;
        String[] var5;
        if (!var1.equals("")) {
            var5 = Class809.Field1(var1, "|");
            this.Field93.addElement(Class62.Field98.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field93.addElement(var5[var4]);
            }
        }

        if (!var2.equals("")) {
            var5 = Class809.Field1(var2, "|");
            this.Field93.addElement(Class62.Field99.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field93.addElement(var5[var4]);
            }
        }

        if (!var3.equals("")) {
            var5 = Class809.Field1(var3, "|");
            this.Field93.addElement(Class62.Field100.Field9);

            for (var4 = 0; var4 < var5.length; ++var4) {
                this.Field93.addElement(var5[var4]);
            }
        }

    }

    public final void Field1(String var1) {
        this.Field93 = new Vector();
        String[] var3 = Class21.Field10[0].Field1(var1, 100);

        for (int var2 = 0; var2 < var3.length; ++var2) {
            this.Field93.addElement(var3[var2]);
        }

        Class106.Field7();
    }

    static void Field1(Class464 var0, String[] var1) {
        var0.Field102 = null;
    }

    static void Field1(Class464 var0, Vector var1) {
        var0.Field93 = null;
    }

    static void Field1(Class464 var0) {
        Vector var1 = new Vector();
        int var2 = var0.Field4 / var0.Field5;
        int var3 = var0.Field4 % var0.Field5;
        int var4 = (var2 << 1) + var3 / 2;
        if (var2 == 4 && (var0.Field101 == -1 || var3 >= Class357.Field125.size()) || var2 != 4 && (var3 == 1 && var0.Field101 != -1 || var3 != 1 && var4 < Class582.Field36.size())) {
            var1.addElement(new Class86(var2 != 4 ? "Lấy ra" : "Bỏ vào", new Class523(var0, var2, var3)));
        }

        if (var2 == 4 || var3 != 1 && var4 < Class582.Field36.size() || var0.Field101 != -1 && var3 == 1) {
            var1.addElement(new Class86("Thông tin", new Class522(var0)));
        }

        Class106.Field21.Field1(var1, 3);
    }

    static void Field2(Class464 var0) {
        Vector var1 = new Vector();
        if (var0.Field6 != 1) {
            if (var0.Field4 % var0.Field5 < var0.Field27.size()) {
                Class272 var2 = (Class272) var0.Field27.elementAt(var0.Field4 % var0.Field5);
                var1.addElement(new Class86("Bỏ vào", new Class600(var0, var2)));
                var1.addElement(var0.Field1((Class272) var2, var0.Field4 % var0.Field5 * 20 + 4, (int) 86));
            }
        } else if (var0.Field4 < var0.Field28.size()) {
            Class230 var4 = (Class230) var0.Field28.elementAt(var0.Field4);
            var1.addElement(new Class86("Lấy ra", new Class606(var0, var4)));
            Class272 var3;
            (var3 = new Class272()).Field1 = var4.Field2;
            var1.addElement(var0.Field1((Class272) var3, var0.Field95[var0.Field4][0], (int) var0.Field95[var0.Field4][1]));
        }

        Class106.Field21.Field1(var1, 2);
    }

    static void Field3(Class464 var0) {
        var0.Field30();
    }

    static void Field1(Class464 var0, Class272 var1) {
        var1 = var1;
        var0 = var0;
        --var1.Field3;
        if (var1.Field3 <= 0) {
            var0.Field28.removeElement(var1);
        }

        boolean var2 = false;
        int var3 = var0.Field27.size();

        for (int var4 = 0; var4 < var3; ++var4) {
            Class272 var5;
            if ((var5 = (Class272) var0.Field27.elementAt(var4)).Field1 == var1.Field1) {
                ++var5.Field3;
                var2 = true;
                break;
            }
        }

        if (!var2) {
            Class272 var6 = new Class272(var1.Field1);
            Class272.Field1(var1, var6);
            var6.Field3 = 1;
            var0.Field27.addElement(var1);
        }

    }

    static void Field4(Class464 var0) {
        var0.Field28();
    }

    static void Field1(Class464 var0, String var1, int var2, int var3) {
        var0.Field1(var1, var2, var3);
    }

    static void Field1(Class464 var0, Class534 var1, boolean var2, int var3, int var4) {
        var0.Field1(var1, var2, var3, var4);
    }

    static void Field1(Class464 var0, int var1) {
        var0.Field101 = var1;
    }

    static int Field5(Class464 var0) {
        return var0.Field101;
    }

    static void Field6(Class464 var0) {
        var0 = var0;
        int var1 = 0;
        boolean var2 = false;
        int var3;
        int var4;
        Class534 var5;
        int var7;
        if (var0.Field4 % 3 == 1) {
            if (Field39.Field141 && var0.Field4 != 4) {
                var7 = (var0.Field4 / 3 << 1) + (var0.Field4 % 3 - (var0.Field4 % 3 > 0 ? 1 : 0));
                var3 = Field39.Field98.size();

                for (var4 = 0; var4 < var3; ++var4) {
                    if (Class811.Field2((int) (var5 = (Class534) Field39.Field98.elementAt(var4)).Field18).Field3 == 13) {
                        var0.Field1(var5, false, Field119[var7][0] + 5, Field119[var7][1] - 2);
                    }
                }

            } else {
                Vector var8;
                if (Field22.length == 1) {
                    if (var0.Field4 != 4) {
                        (var8 = new Vector()).addElement(new Class86("Thông tin", new Class693(var0)));
                        var8.addElement(new Class86("Trang bị linh thú", new Class692(var0)));
                        Class106.Field21.Field1(var8, 3);
                    } else {
                        var3 = Field39.Field98.size();

                        for (var4 = 0; var4 < var3; ++var4) {
                            if (Class811.Field2((int) (var5 = (Class534) Field39.Field98.elementAt(var4)).Field18).Field3 == 19) {
                                var0.Field1(var5, false, Field119[9][0] + 5, Field119[9][1] - 2);
                                return;
                            }
                        }

                    }
                } else if (var0.Field4 != 4) {
                    (var8 = new Vector()).addElement(new Class86("Linh thú", new Class695(var0)));
                    var8.addElement(new Class86("Thú cưng", new Class694(var0)));
                    Class106.Field21.Field1(var8, 3);
                } else {
                    var3 = Field39.Field98.size();

                    for (var4 = 0; var4 < var3; ++var4) {
                        if (Class811.Field2((int) (var5 = (Class534) Field39.Field98.elementAt(var4)).Field18).Field3 == 19) {
                            var0.Field1(var5, false, Field119[9][0] + 5, Field119[9][1] - 2);
                            return;
                        }
                    }

                }
            }
        } else {
            var7 = (var0.Field4 / 3 << 1) + (var0.Field4 % 3 - (var0.Field4 % 3 > 0 ? 1 : 0));
            var3 = Field39.Field98.size();

            for (var4 = 0; var4 < var3; ++var4) {
                Class805 var6;
                if ((var6 = Class811.Field2((int) (var5 = (Class534) Field39.Field98.elementAt(var4)).Field18)).Field3 == Field117[var7] || Field117[var7] == -1 && var6.Field3 > 2 && var6.Field3 < 8) {
                    ++var1;
                    if (var7 != 7 || var1 != 1) {
                        var0.Field1(var5, false, Field119[var7][0] + 5, Field119[var7][1] - 2);
                        return;
                    }
                }
            }

        }
    }

    static void Field7(Class464 var0) {
        if (Class106.Field19.Field15.Field78 == 0) {
            Class106.Field1("Đã hết điểm tiềm năng để cộng. Xin đánh lên level để có điểm tiềm năng.");
        } else {
            Class106.Field25.Field1("Nhập số", new Class697(var0), 1, 10, true);
            Class106.Field23 = Class106.Field25;
        }
    }

    static void Field8(Class464 var0) {
        if (Class357.Field97[var0.Field4] == -1) {
            Class106.Field1("Xin gặp Lâm tướng quân để học kỹ năng này");
        } else {
            Vector var1 = new Vector();
            boolean var2 = false;
            boolean var3;
            if (var3 = var0.Field13()) {
                var2 = Class599.Field4[Class106.Field19.Field15.Field93][var0.Field4 - 4] == -1;
            }

            if (var3 && !var2) {
                var1.addElement(new Class86("Sử dụng", new Class521(var0, var3)));
            }

            if (!var2) {
                var1.addElement(new Class86("Cho vào phím tắt", new Class516(var0, var3)));
            }

            var1.addElement(new Class86("Cộng", new Class515(var0)));
            Class106.Field21.Field1(var1, 2);
        }
    }

    static void Field9(Class464 var0) {
        var0 = var0;
        if (Field39.Field99 != null && Field39.Field99.size() > 0) {
            int var1 = Field39.Field99.size();

            for (int var2 = 0; var2 < var1; ++var2) {
                Class534 var3;
                if (Class811.Field2((int) (var3 = (Class534) Field39.Field99.elementAt(var2)).Field18).Field3 == Field118[var0.Field4]) {
                    var0.Field1(var3, false, Field119[0][0] + 5, Field119[0][1] - 2);
                    return;
                }
            }
        }

    }

    static String Field2(Class464 var0, int var1) {
        var1 = var1;
        String var2;
        if (var1 >= 7 && var1 < 14) {
            if (var1 >= 7 && var1 < 14) {
                var2 = "0" + Class582.Field42[var1].Field7;
                var2 = var2 + "\nSố lượng: " + Class106.Field19.Field15.Field121[var1];
            } else {
                var2 = Class811.Field2;
                var2 = var2 + "\nSố lượng: " + Class106.Field19.Field15.Field121[var1];
            }
        } else {
            var2 = "0" + Class582.Field42[var1].Field7;
            var2 = var2 + "\nSố lượng: " + Class106.Field19.Field15.Field121[var1];
            if (var0.Field15) {
                var2 = var2 + "\nKhông thể bán lại";
            }

            if (var0.Field59.contains(String.valueOf(var1))) {
                Class750 var5 = null;
                int var3 = Class811.Field6.size();

                for (int var4 = 0; var4 < var3; ++var4) {
                    if (((Class750) Class811.Field6.elementAt(var4)).Field15 == var1 - 19) {
                        var5 = (Class750) Class811.Field6.elementAt(var4);
                        break;
                    }
                }

                if (var5 != null && (var1 < 69 || var1 > 77)) {
                    var2 = var2 + Class534.Field1(var5.Field11, "0");
                }
            } else {
                var2 = var2 + Class534.Field1("\nHồi phục: " + (var1 - 19 < 0 ? Class811.Field48[var1].Field2 : Class811.Field48[var1 - 19].Field2) + " " + Class582.Field42[var1].Field8, "0");
            }
        }

        return var2;
    }

    static Class534[] Field10(Class464 var0) {
        return var0.Field94;
    }

    static boolean Field11(Class464 var0) {
        if (var0.Field13.size() >= 100) {
            Class106.Field1("Bạn chỉ được mua 100 vật phẩm một lần.");
            return true;
        } else {
            return false;
        }
    }
}
