package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class534 {
    private static String[][] Field43 = new String[][]{{"Quần", "Nhẫn dưới"}, {"Ngọc", "Găng"}, {"áo", "Dây chuyền"}, {"áo", "Dây chuyền"}, {"áo", "Dây chuyền"}, {"áo", "Dây chuyền"}, {"áo", "Dây chuyền"}, {"áo", "Dây chuyền"}, {"Nón", "Vũ khí", "Ngọc bội", "Găng"}, {"Nhẫn dưới", "Quần"}, {"Nón", "Vũ khí"}, {"Giày", "Nhẫn trên"}, {"Giày", "Nhẫn trên"}};
    private static String[][] Field44 = new String[][]{{"Kim"}, {"Thủy"}, {"Mộc"}, {"Hỏa"}, {"Thổ"}};
    private static String[][] Field45 = new String[][]{{"Nón"}, {"Bàn đạp"}, {"Hộ uyển"}, {"Yên cương"}, {"Giáp"}};
    public byte[] Field1 = new byte[10];
    public byte[] Field2 = new byte[15];
    public byte[] Field3 = new byte[3];
    public String Field4 = "";
    public String Field5;
    public String Field6;
    public byte Field7 = 3;
    public byte Field8 = 0;
    public short Field9;
    public short Field10;
    public short Field11;
    public byte Field12;
    public byte Field13;
    public byte Field14 = -1;
    public byte Field15 = 0;
    public byte Field16 = -1;
    public byte Field17 = 2;
    public short Field18;
    public short Field19;
    public short[] Field20 = new short[10];
    public short Field21;
    public short Field22;
    public int Field23;
    public long Field24;
    public short Field25 = -1;
    public boolean Field26 = false;
    public boolean Field27 = false;
    public int Field28 = 0;
    public int Field29 = 0;
    public byte Field30 = -1;
    private static String[] Field46 = new String[]{"Tấn công", "Thủ vật", "Né tránh", "Chính xác", "Chí mạng", "Sức khoẻ", "Thủ ma", "Chỉ số 7", "Chỉ số 8", "Chỉ số 9"};
    public short[] Field31 = null;
    public boolean Field32 = false;
    public short[] Field33;
    public Vector Field34 = new Vector();
    public byte Field35;
    public byte Field36;
    public byte Field37;
    public byte Field38;
    private static boolean[][] Field47 = new boolean[][]{{false, true, true, true, false, false, true, false, false, false}, {false, true, true, true, false, false, true, false, false, false}, {false, true, true, true, false, false, true, false, false, false}, {true, false, false, true, true, false, false, false, false, false}, {true, false, false, true, true, false, false, false, false, false}, {true, false, false, true, true, false, false, false, false, false}, {true, false, false, true, true, false, false, false, false, false}, {true, false, false, true, true, false, false, false, false, false}, {true, false, false, true, false, false, false, false, false, false}, {true, false, false, false, true, false, false, false, false, false}, {false, true, true, false, false, false, true, false, false, false}, {false, true, false, true, true, false, true, false, false, false}, {false, false, false, true, true, true, false, false, false, false}, {true, false, false, false, false, false, false, false, false, false}, {false, true, false, false, false, false, true, false, false, false}, {true, false, false, true, false, false, false, false, false, false}, {false, true, false, false, false, false, true, false, false, false}, {true, false, false, false, true, false, false, false, false, false}, {false, true, false, false, false, false, true, false, false, false}, {false, true, false, false, false, false, true, false, false, false}};
    private static String[] Field48 = new String[]{"Giáp nhẹ", "Giáp nặng", "Giáp vải", "Giáp nặng", "Giáp nhẹ", ""};
    private static String[] Field49;
    private static String[] Field50;
    private static String[] Field51;
    public static byte Field39;
    private int Field52 = Class811.Field13(68);
    public int Field40;
    public long Field41;
    public String Field42 = "";
    private static int[] Field53;

    static {
        String[] var10000 = new String[]{"Giảm st vật: ", "Giảm st ma: ", "Tăng tc: ", "Bỏ qua pt: ", "Phản st: ", "Bỏ qua tc ma", "Bỏ qua tc vật"};
        Field49 = new String[]{"", "nhất phẩm", "nhị phẩm", "tam phẩm", "tứ phẩm", "ngũ phẩm"};
        Field50 = new String[]{"hệ thuỷ", "hệ mộc", "hệ hoả", "hệ thổ", "hệ kim"};
        Field51 = new String[]{"ma pháp", "vật lý", ""};
        Field39 = 2;
        Field53 = new int[]{7667443, 3334656, 16705024};
    }

    public static boolean Field1(int var0) {
        return var0 == 1;
    }

    public final boolean Field1() {
        return this.Field5.equals(Class106.Field19.Field15.Field65);
    }

    public static boolean Field2(int var0) {
        return var0 >= 14 && var0 <= 18;
    }

    private static boolean Field5(int var0) {
        return var0 < 13;
    }

    public final Class805 Field2() {
        return Class811.Field2((int) this.Field18);
    }

    public final String[] Field3() {
        String[] var1 = new String[]{"", "", ""};
        if (this.Field7 == 3) {
            Class805 var2 = Class811.Field2((int) this.Field18);
            String var3 = "";
            if (this.Field19 > 0) {
                var3 = var3 + " +" + this.Field19;
            }

            (new StringBuffer(String.valueOf(var3))).append(" ").append(Field51[this.Field17]).toString();
            var1[0] = this.Field37 + var2.Field1 + (this.Field19 > 0 ? " +" + this.Field19 : "");
            var1[1] = "Giá bán: " + this.Field28 + " xu";
            var1[2] = "Giá bid: " + this.Field40 + " xu";
        }

        return var1;
    }

    public final String Field1(boolean var1) {
        String var2 = "";
        if (this.Field7 == 3) {
            String var3 = "";
            Class805 var4;
            byte var5;
            Class826 var6;
            String var12;
            if (Field1((var4 = Class811.Field2((int) this.Field18)).Field11[9])) {
                var2 = var2 + var4.Field1;
                if (!this.Field4.equals("")) {
                    var2 = var2 + "\n0" + this.Field4.toLowerCase() + (this.Field4.indexOf("-") > -1 ? "" : " tạo");
                }

                for (var5 = 0; var5 < this.Field34.size(); ++var5) {
                    var6 = (Class826) this.Field34.elementAt(var5);
                    var12 = var6.Field1(this.Field30) + var6.Field2() + (var6.Field1() ? "%" : "");
                    var2 = var2 + Field1(var12, String.valueOf(var6.Field1(this.Field15 == 1)));
                }
            } else {
                if (this.Field19 > 0) {
                    var3 = var3 + " +" + this.Field19;
                }

                var3 = var3 + " " + Field51[this.Field17];
                if (this.Field16 > -1) {
                    var3 = var3 + " " + Field49[this.Field16];
                }

                if (this.Field14 > -1) {
                    var3 = var3 + " " + Field50[this.Field14];
                }

                var2 = var2 + Field1(var4.Field1 + var3, "" + this.Field37);
                if (!this.Field4.equals("")) {
                    var2 = var2 + "\n0" + this.Field4.toLowerCase() + (this.Field4.indexOf("-") > -1 ? "" : " tạo");
                }

                if (this.Field29 == 1) {
                    var2 = var2 + "\nĐã khoá";
                }

                if (var4.Field3 < 3 && var4.Field3 != 13 && !Field2(var4.Field3)) {
                    var2 = var2 + "\n" + Field48[this.Field30];
                }

                if (this.Field30 != -1 && var4.Field3 != 13 && var4.Field3 != 19 && !Field2(var4.Field3)) {
                    var2 = var2 + "\n" + Class811.Field58[this.Field30];
                }

                if (this.Field26) {
                    var2 = var2 + "\nGiá bán: " + Class106.Field1((long) this.Field28) + "~";
                } else if (var1) {
                    var2 = var2 + "\nGiá bán lại: " + Class106.Field1((long) (var4.Field10 / 5 + this.Field19 * 1000)) + "~";
                }

                if (var4.Field6 != -1) {
                    var2 = var2 + "\nYêu cầu lv: " + this.Field25;
                }

                var2 = var2 + "\nĐộ bền: " + this.Field21;

                for (var5 = 0; var5 < this.Field34.size(); ++var5) {
                    var6 = (Class826) this.Field34.elementAt(var5);
                    var12 = var6.Field1(this.Field30) + var6.Field2() + (var6.Field1() ? "%" : "");
                    var2 = var2 + Field1(var12, String.valueOf(var6.Field1(this.Field15 == 1)));
                }

                try {
                    if (this.Field16 > 0 && this.Field16 < 5 && var4.Field3 != 13 && var4.Field3 < 13) {
                        if (var4.Field3 != 8) {
                            var2 = var2 + Field1("cần " + Field43[var4.Field3][0] + " hoặc " + Field43[var4.Field3][1] + " hệ " + Field44[this.Field14][0] + " để kích ngũ hành", "0");
                        } else if (this.Field38 == 1) {
                            var2 = var2 + Field1("Nhẫn trên cần " + Field43[var4.Field3][0] + " hoặc " + Field43[var4.Field3][1] + " hệ " + Field44[this.Field14][0] + " để kích ngũ hành", "0");
                        } else {
                            var2 = var2 + Field1("Nhẫn dưới cần " + Field43[var4.Field3][2] + " hoặc " + Field43[var4.Field3][3] + " hệ " + Field44[this.Field14][0] + " để kích ngũ hành", "0");
                        }
                    }

                    if (this.Field16 > 0 && this.Field16 < 5 && Field2(var4.Field3)) {
                        var2 = var2 + Field1("cần " + Field45[var4.Field3 - 14][0] + " hệ " + Field44[this.Field14][0] + " để kích ngũ hành", "0");
                    }
                } catch (Exception var11) {
                }
            }

            if (this.Field23 != 0) {
                long var13;
                if ((var13 = (long) this.Field23 - (System.currentTimeMillis() - this.Field24) / 60000L) < 0L) {
                    var13 = 1L;
                }

                var2 = var2 + Field1("\nThời gian còn lại: " + (var13 / 60L > 0L ? var13 / 60L + "h " : "") + (var13 % 60L > 0L ? var13 % 60L + "p" : ""), "0");
            }

            if (this.Field41 > 0L) {
                var2 = var2 + Field1(this.Field5, "0");
                var2 = var2 + Field1(this.Field42, "0");
                var2 = var2 + Field1("Bid: " + this.Field40 + " xu", "0");
                var2 = var2 + Field1(this.Field6.equals("") ? "----" : this.Field6 + " bid", "0");
                long var9;
                var2 = var2 + Field1((var9 = this.Field41 - System.currentTimeMillis()) <= 0L ? "Hết giờ" : (var9 > 0L && var9 / 60000L == 0L ? (var9 > 0L ? "Còn lại: " + var9 / 1000L + " giây" : "") : (var9 > 0L ? "Còn lại: " + var9 / 60000L + " phút" : "")), "0");
            }
        }

        return var2;
    }

    public static String Field1(String var0, String var1) {
        String var2 = "";
        String[] var4 = Class21.Field2.Field1(var0, 95);

        for (int var3 = 0; var3 < var4.length; ++var3) {
            var2 = var2 + "\n" + var1 + var4[var3];
        }

        return var2;
    }

    public final String Field4() {
        String var1 = "";

        try {
            String[] var2 = new String[]{"Giáp nhẹ", "Giáp nặng", "Giáp vải", "Giáp nặng", "Giáp nhẹ"};
            if (this.Field7 == 3) {
                String var3 = "";
                Class805 var4 = Class811.Field2((int) this.Field18);
                if (this.Field18 >= 264 && this.Field18 <= 267) {
                    var1 = var1 + var4.Field1;
                    var1 = var1 + "\nTấn công tăng: " + var4.Field11[0] + "%";
                    var1 = var1 + "\nThủ tăng: " + var4.Field11[1] + "%";
                    var1 = var1 + "\nHP tăng: " + var4.Field11[2];
                    var1 = var1 + "\nMP tăng: " + var4.Field11[3];
                } else {
                    if (this.Field19 > 0) {
                        var3 = var3 + "+" + this.Field19;
                    }

                    var1 = var1 + "\n" + var4.Field1;
                    var1 = var1 + " " + var3;
                    if ((var4.Field13 < 79 || var4.Field13 > 137) && var4.Field3 != 13 && Field2(var4.Field3)) {
                        var1 = var1 + "\n" + var2[this.Field30];
                    }

                    if (var4.Field13 > 113 && var4.Field13 <= 137 && var4.Field3 != 13) {
                        var1 = var1 + "\n" + Class811.Field58[this.Field30];
                    }

                    if (var4.Field9 == 0) {
                        var1 = var1 + "\nGiá: " + Class106.Field1((long) (var4.Field10 + this.Field19 * 1000)) + " " + "xu";
                    } else {
                        var1 = var1 + "\nGiá: " + Class106.Field1((long) (var4.Field10 + this.Field19)) + " Lượng";
                    }

                    if (this.Field25 != -1) {
                        var1 = var1 + "\nYêu cầu lv: " + this.Field25;
                    }

                    var1 = var1 + "\nĐộ bền: " + this.Field21;
                    if (var4.Field12 != -1 && var4.Field3 != 13) {
                        var1 = var1 + "\nDành cho: " + Class59.Field2[this.Field30][Class59.Field3].Field1;
                    }

                    int[] var7 = Class811.Field1(this.Field13, this.Field18, var4.Field3);
                    if (var4.Field3 < 2 || var4.Field3 == 10 || var4.Field3 == 11 || Field2(var4.Field3)) {
                        if (Field39 == 0) {
                            var7[6] = var7[1];
                            var7[1] /= 10;
                        } else {
                            var7[6] = var7[1] / 10;
                        }
                    }

                    for (int var5 = 0; var5 < 10; ++var5) {
                        if (Field47[var4.Field3][var5]) {
                            var1 = var1 + "\n" + Field46[var5] + ": " + var7[var5];
                        }
                    }
                }

                if (var4.Field9 > 0) {
                    var1 = var1 + Field1("\nThời hạn: " + var4.Field9 + " Phút.", "0");
                }
            }

            if (this.Field7 == 4 && this.Field27) {
                var1 = Class582.Field42[this.Field12].Field7;
                var1 = var1 + "\nGiá: " + Class106.Field1((long) Class811.Field48[this.Field12].Field1) + "$";
                if (Class811.Field48[this.Field12].Field2 >= 80) {
                    var1 = var1 + "\nTăng " + Class811.Field48[this.Field12].Field2 + " " + Class582.Field42[this.Field12].Field8;
                } else if (Class811.Field48[this.Field12].Field2 == 0) {
                    var1 = var1 + "\nKhăn đeo dùng khi đánh nhau.";
                } else if (Class811.Field48[this.Field12].Field2 == -1) {
                    var1 = var1 + "\nDịch chuyển tức thời về làng.";
                }

                int var9 = Class106.Field19.Field15.Field121[this.Field12];
                short var10 = 0;

                for (int var8 = 0; var8 < Class464.Field5().Field13.size(); ++var8) {
                    Class534 var11;
                    if ((var11 = (Class534) Class464.Field5().Field13.elementAt(var8)).Field12 == this.Field12) {
                        var10 = var11.Field10;
                    }
                }

                if (var10 == 0) {
                    var1 = var1 + "\nĐang có: " + var9 + " cái.";
                } else {
                    var1 = var1 + "\nĐang có: " + var9 + "+" + var10 + " cái.";
                }

                if (var9 + var10 >= 999) {
                    var1 = var1 + "\n(tối đa)";
                }
            }
        } catch (Exception var6) {
        }

        return var1;
    }

    public final String Field5() {
        String var1 = "";
        String var2 = "";
        Class805 var3 = Class811.Field2((int) this.Field18);
        if (this.Field19 > 0) {
            var2 = var2 + " +" + this.Field19;
        }

        var2 = var2 + " " + Field51[this.Field17];
        if (this.Field16 > -1) {
            var2 = var2 + " " + Field49[this.Field16];
        }

        if (this.Field14 > -1) {
            var2 = var2 + " " + Field50[this.Field14];
        }

        var1 = var1 + Field1(var3.Field1 + var2, "" + this.Field37);
        if (!this.Field4.equals("")) {
            var1 = var1 + "\n0" + this.Field4.toUpperCase() + " tạo";
        }

        if (this.Field25 != -1) {
            var1 = var1 + "\nYêu cầu lv: " + this.Field25;
        }

        var1 = var1 + "\nĐộ bền: " + this.Field21;
        if (this.Field30 != -1) {
            var1 = var1 + "\nDòng: " + Class59.Field2[this.Field30][Class59.Field3].Field1;
        }

        for (byte var6 = 0; var6 < this.Field34.size(); ++var6) {
            Class826 var5 = (Class826) this.Field34.elementAt(var6);
            String var4 = var5.Field1(this.Field30) + var5.Field2() + (var5.Field1() ? "%" : "");
            var1 = var1 + Field1(var4, String.valueOf(var5.Field1(false)));
        }

        if (this.Field28 > 0) {
            var1 = var1 + "\nGiá bán:\n0" + Class106.Field1((long) this.Field28);
            (new StringBuffer(String.valueOf(this.Field28))).append(" GIA BAN ").append(Class106.Field1((long) this.Field28)).toString();
        }

        return var1;
    }

    public static Vector Field3(int var0) {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < Class357.Field125.size(); ++var2) {
            Class534 var3;
            if ((var3 = (Class534) Class357.Field125.elementAt(var2)).Field37 == var0) {
                var1.addElement(var3);
            }
        }

        return var1;
    }

    public static Vector Field4(int var0) {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < Class357.Field125.size(); ++var2) {
            Class534 var3;
            if ((var3 = (Class534) Class357.Field125.elementAt(var2)).Field37 != var0 && Field5(Class811.Field2((int) var3.Field18).Field3)) {
                var1.addElement(var3);
            }
        }

        return var1;
    }

    public static Vector Field1(int var0, int var1) {
        Vector var5 = new Vector();

        for (int var2 = 0; var2 < Class357.Field125.size(); ++var2) {
            Class534 var3;
            if ((var3 = (Class534) Class357.Field125.elementAt(var2)).Field37 == var0 && var3.Field16 == 1 && Field2(Class811.Field2((int) var3.Field18).Field3)) {
                var5.addElement(var3);
            }
        }

        return var5;
    }

    public static Vector Field6() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < Class357.Field125.size(); ++var1) {
            Class534 var2;
            if (!Field1(Class811.Field2((int) (var2 = (Class534) Class357.Field125.elementAt(var1)).Field18).Field11[9]) && var2.Field29 == 0 && var2.Field23 == 0) {
                var0.addElement(var2);
            }
        }

        return var0;
    }

    public static Vector Field7() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < Class357.Field125.size(); ++var1) {
            Class534 var2;
            if (Field5(Class811.Field2((int) (var2 = (Class534) Class357.Field125.elementAt(var1)).Field18).Field3) && var2.Field23 == 0 && (var2.Field8 == 1 || var2.Field37 != 0)) {
                var0.addElement(var2);
            }
        }

        return var0;
    }

    public static Vector Field8() {
        Vector var0 = new Vector();

        for (int var1 = 0; var1 < Class357.Field125.size(); ++var1) {
            Class534 var2;
            if (!Field1(Class811.Field2((int) (var2 = (Class534) Class357.Field125.elementAt(var1)).Field18).Field11[9])) {
                var0.addElement(var2);
            }
        }

        return var0;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        Class805 var4 = Class811.Field2((int) this.Field18);
        Class379.Field1(var1, var4.Field8, var2, var3);
        if (this.Field19 > 12) {
            Class811.Field1(var1, var2 - 9, var3 - 9, 17, 17, this.Field52, Field53[this.Field19 - 13], 16516369);
            this.Field52 += 3;
            if (this.Field52 > 68) {
                this.Field52 = 0;
            }
        }

    }
}
