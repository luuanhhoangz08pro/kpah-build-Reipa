package main.tab.tab2;

import main.lib.Graphics;
import main.lib.ServerManager;
import main.screen.Main;
import main.tab.tab2.screen.MainTab;

import java.util.Objects;
import java.util.Vector;

public final class Class752 extends Class671 {
    public static Class752 Field1;
    private String[][] Field9 = new String[][]{{ServerManager.decrypt("611b11097d1e:36636235316561353139623739383332373831316365393435663935656562353561386536346137353261326634313832646163323763643938393165373661")}, {"Cài đặt", "Cấu hình", "Bản đồ lớn", "Bật/tắt giao diện", "Hướng dẫn", "âm thanh", "Bật/tắt lời mời", "Bật/tắt auto đánh", "Chế độ focus"}, {"Bản thân", "Hành trang", "Kỹ năng", "Tiềm năng", "Trang bị", "Thông tin", "Trang bị thú", "Cây thần", "Cổ vật", "Khác"}, {"Nap Xu"}, {"Nhiệm vụ"}, {"Đồ sát"}, {"Khác", "Tin nhắn", "Nhóm", "Bạn bè", "Top cao thủ", "Top đại gia", "Bảng Top", "Kênh thế giới", "Diễn đàn", "Rời bang"}, {""}, {"--Cửa Hàng--"}};
    int Field2 = 0;
    int Field3 = -1;
    int Field4;
    public int Field5;
    private int Field10;
    private int Field11;
    private int Field12;
    public int Field6;
    private int Field13;
    private int Field14;
    private int Field15;
    public int Field7;
    public int Field8;
    private boolean Field16 = false;
    private int Field17 = 0;

    public static Class752 Field5() {
        return Field1 == null ? (Field1 = new Class752()) : Field1;
    }

    public final void Field6() {
        if (Class106.Field19.Field15.Field190 == -1) {
            this.Field9[7] = new String[]{"Bang hội", "Top bang hội", "Đăng ký bang hội"};
        } else {
            if (Class106.Field19.Field15.Field57 == 0) {
                this.Field9[7] = new String[]{"Bang hội", "Top bang hội", "Nhiệm vụ", "Thành viên bang hội", "Thông tin bang hội", "Tin nhắn bang hội", "Kỹ năng", "Chat toàn bang", "Quyên góp", "Giải tán bang hội"};
                if (Class357.Field56) {
                    this.Field9[7][9] = "Phục hồi bang hội";
                    return;
                }
            } else {
                this.Field9[7] = new String[]{"Bang hội", "Top bang hội", "Nhiệm vụ", "Thành viên bang hội", "Thông tin bang hội", "Tin nhắn bang hội", "Kỹ năng", "Chat toàn bang", "Quyên góp", "Rời bang"};
            }

        }
    }

    public final void Field2() {
        this.Field15 = 128;
        this.Field7 = 83;
        this.Field8 = 18;
        if (Class106.Field1.hasPointerEvents()) {
            this.Field15 = 170;
            this.Field7 = 130;
            this.Field8 = 24;
        }

        this.Field13 = (Class106.Field13 - this.Field15) / 2;
        this.Field14 = (Class106.Field14 - this.Field7) / 2;
        this.Field10 = 0;
        this.Field6 = this.Field9.length * this.Field8 - this.Field7;
    }

    private Class752() {
        this.Field2();
        super.Field104 = new Class86("Chọn", new Class626(this));
        super.Field105 = new Class86("Đóng", new Class628(this));
    }

    public final void Field1(Graphics var1) {
        Class106.Field19.Field1(var1);
        Class106.Field19.Field2(var1);
        Class811.Field3(var1, this.Field13 - 5, this.Field14 - 10, this.Field15 + 10, this.Field7 + 20);
        var1.setClip(this.Field13, this.Field14 - 2, this.Field15 + 2, this.Field7 + 4);
        int var2 = this.Field14;
        var1.translate(0, -this.Field10);

        for (int var3 = 0; var3 < this.Field4; ++var3) {
            if (var3 == this.Field2) {
                Class811.Field2(var1, this.Field13, var2, this.Field15, this.Field8);
                Class21.Field10[0].Field1(var1, this.Field3 == -1 ? this.Field9[var3][0] : this.Field9[this.Field3][var3 + 1], Class106.Field15, var2 + this.Field8 / 2 - Class21.Field10[0].Field2() / 2, 2);
            } else {
                Class21.Field8.Field1(var1, this.Field3 == -1 ? this.Field9[var3][0] : this.Field9[this.Field3][var3 + 1], Class106.Field15, var2 + this.Field8 / 2 - Class21.Field10[0].Field2() / 2, 2);
            }

            var2 += this.Field8;
        }

        super.Field1(var1);
    }

    public final void Field4() {
        Class106.Field19.Field4();
        if (this.Field10 != this.Field5) {
            this.Field12 = this.Field5 - this.Field10 << 2;
            this.Field11 += this.Field12;
            this.Field10 += this.Field11 >> 4;
            this.Field11 &= 15;
        }

        if (Math.abs(this.Field5 - this.Field10) < 15 && this.Field10 < 0) {
            this.Field5 = 0;
        }

        if (Math.abs(this.Field5 - this.Field10) < 10 && this.Field10 > this.Field6) {
            this.Field5 = this.Field6;
        }

    }

    public final void Field3() {
        if (Class106.Field1(this.Field13, this.Field14, this.Field15, this.Field7)) {
            int var1 = Class106.Field30 - Class106.Field11;
            if (Class106.Field6) {
                if (!this.Field16) {
                    this.Field17 = this.Field10;
                    this.Field16 = true;
                    int var2;
                    if ((var2 = (this.Field5 + Class106.Field11 - this.Field14) / this.Field8) == this.Field2) {
                        this.Field7();
                    }

                    this.Field2 = var2;
                    if (this.Field2 < 0) {
                        this.Field2 = 0;
                    }

                    if (this.Field2 >= this.Field9.length) {
                        this.Field2 = this.Field9.length - 1;
                    }

                    this.Field5 = this.Field2 * this.Field8 - this.Field7 / 2;
                    if (this.Field5 < 0) {
                        this.Field5 = 0;
                    }
                }

                this.Field5 = this.Field17 + (Class106.Field30 - Class106.Field11);
                if (this.Field5 < -10) {
                    this.Field5 = -10;
                }

                if (this.Field5 > this.Field6 + 10) {
                    this.Field5 = this.Field6 + 10;
                }
            }

            if (Class106.Field7) {
                Class106.Field7 = false;
                this.Field16 = false;
                if (Math.abs(var1) < 5 && (this.Field5 + this.Field14) / this.Field8 == this.Field2) {
                    this.Field7();
                }
            }
        }

        if (Class106.Field2(8)) {
            ++this.Field2;
            if (this.Field2 >= this.Field4) {
                this.Field2 = 0;
            }

            this.Field5 = this.Field2 * this.Field8 - this.Field7 / 2;
            if (this.Field5 < 0) {
                this.Field5 = 0;
            }

            if (this.Field5 > this.Field6) {
                this.Field5 = this.Field6;
            }
        }

        if (Class106.Field2(2)) {
            --this.Field2;
            if (this.Field2 < 0) {
                this.Field2 = this.Field4 - 1;
            }

            this.Field5 = this.Field2 * this.Field8 - this.Field7 / 2;
            if (this.Field5 < 0) {
                this.Field5 = 0;
            }

            if (this.Field5 > this.Field6) {
                this.Field5 = this.Field6;
            }
        }

        super.Field3();
    }

    private void Field7() {
        Class65.Field3();
        if (Class388.Field1) {
            (new Thread(new Class65())).start();
            Class388.Field1 = false;
        }

        int var1;
        if (this.Field3 == -1) {
            if (this.Field9[this.Field2].length == 1) {
                switch (this.Field2) {
                    case 0:
                        Class388.Field1();
                        return;
                    case 1:
                    case 2:
                    case 6:
                    case 7:
                    default:
                        break;
                    case 3:
                        Class106.Field19.Field9();
                        super.Field105.Field2.Field1();
                        break;
                    case 4:
                        Field2(6);
                        return;
                    case 5:
                        Class106.Field19.Field1();
                        Class106.Field19.Field28.Field3();
                        return;
                    case 8:
                        int var7 = 0;

                        for (var1 = 0; var1 < Class811.Field6.size(); ++var1) {
                            Class750 var11;
                            if ((var11 = (Class750) Class811.Field6.elementAt(var1)).Field7 + 1 > var7) {
                                var7 = var11.Field7 + 1;
                            }
                        }

                        byte[] var10 = new byte[var7];

                        for (int var12 = 0; var12 < var10.length; ++var12) {
                            var10[var12] = 20;
                        }

                        Class464.Field5().Field1(0, true, var10);
                        Class464.Field5().Field1();
                        return;
                }
            }

            this.Field3 = this.Field2;
            this.Field4 = this.Field9[this.Field2].length - 1;
            this.Field6 = this.Field9[this.Field2].length * this.Field8 - this.Field7;
            if (this.Field6 < 0) {
                this.Field6 = 0;
            }

            this.Field10 = this.Field5 = this.Field2 = 0;
        } else {
            switch (this.Field2) {
                case 0:
                    if (this.Field3 == 1) {
                        Class106.Field19.Field21();
                        Class106.Field19.Field1();
                        return;
                    }

                    if (this.Field3 == 2) {
                        Field2(0);
                        return;
                    }

                    if (this.Field3 == 6) {
                        Class106.Field19.Field1();
                        Class104.Field5().Field1();
                        return;
                    }

                    if (this.Field3 == 7) {
                        Class106.Field19.Field1();
                        Class261.Field1().Field12(5, 0);
                        return;
                    }
                    break;
                case 1:
                    if (this.Field3 == 1) {
                        Class106.Field19.Field1();
                        short[][] var8 = new short[][]{{28, 105}, {55, 100}, {24, 138}, {61, 148}, {105, 76}, {80, 128}, {112, 132}, {136, 111}, {76, 60}, {129, 158}, {173, 155}, {153, 160}, {145, 60}, {127, 87}, {126, 62}, {35, 60}, {35, 60}};
                        short[] var9 = new short[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 110, 111, 112, 202, 104};
                        int var3 = 0;

                        for (int var4 = 0; var4 < var9.length; ++var4) {
                            if (Class106.Field19.Field83 == var9[var4]) {
                                var3 = var4;
                                break;
                            }
                        }

                        Class520.Field5().Field1(Class106.Field15 - 94, Class106.Field16 - 84 - Class671.Field108, 197, 168, Class811.Field57[var3], (Class86) null);
                        Class520.Field5().Field3 = 1;
                        Class520.Field5().Field103 = new Class86("Trở lại", new Class651(this));
                        Class520.Field5().Field2 = new Class653(this, var8, var3);
                        Class520.Field5().Field1();
                        return;
                    }

                    if (this.Field3 == 2) {
                        Field2(3);
                        return;
                    }

                    if (this.Field3 == 6) {
                        Field2(5);
                        return;
                    }

                    if (this.Field3 == 7) {
                        Class106.Field19.Field1();
                        Class106.Field8();
                        if (Class106.Field19.Field15.Field190 == -1) {
                            Class261.Field1().Field11();
                            return;
                        }

                        Class261.Field1().Field20(0);
                        Class62.Field1(0, false, new byte[]{27});
                        Class106.Field8();
                        return;
                    }
                    break;
                case 2:
                    if (this.Field3 == 1) {
                        Class106.Field19.Field1();
                        ++Class106.Field19.Field14;
                        if (Class106.Field19.Field14 > 2) {
                            Class106.Field19.Field14 = 0;
                            return;
                        }
                    } else {
                        if (this.Field3 == 2) {
                            Field2(2);
                            return;
                        }

                        if (this.Field3 == 6) {
                            Class106.Field19.Field1();
                            if (Class496.Field5().Field2 != null && Class496.Field5().Field2.size() != 0) {
                                Vector var6 = new Vector();

                                for (var1 = 0; var1 < Class496.Field5().Field2.size(); ++var1) {
                                    Class357 var2 = (Class357) Class496.Field5().Field2.elementAt(var1);
                                    var6.addElement(var2);
                                }

                                Class496.Field5().Field1(var6, 0, "BẠN BÈ");
                                Class496.Field5().Field1();
                                return;
                            }

                            Class106.Field1("Chưa có bạn");
                            return;
                        }

                        if (this.Field3 == 7) {
                            Class106.Field8();
                            Class261.Field1().Field2((int) Class106.Field19.Field15.Field190, (byte) 0);
                            return;
                        }
                    }
                    break;
                case 3:
                    if (this.Field3 == 1) {
                        Class106.Field19.Field1();
                        Class188.Field5().Field1();
                        return;
                    }

                    if (this.Field3 == 2) {
                        Field2(1);
                        return;
                    }

                    if (this.Field3 == 6) {
                        Class261.Field1().Field12(4, 0);
                        return;
                    }

                    if (this.Field3 == 7) {
                        Class106.Field8();
                        Class261.Field1().Field14(Class106.Field19.Field15.Field190);
                        return;
                    }
                    break;
                case 4:
                    if (this.Field3 == 1) {
                        if (Class167.Field1 != null) {
                            if (Class167.Field1.Field2 != 0) {
                                Class167.Field1.Field2 = 0;
                                Class106.Field19.Field1();
                                return;
                            }

                            Class167.Field1.Field2 = 1;
                            Class106.Field19.Field1();
                            return;
                        }
                    } else {
                        if (this.Field3 == 2) {
                            Field2(4);
                            return;
                        }

                        if (this.Field3 == 6) {
                            Class106.Field19.Field1();
                            Class261.Field1().Field12(3, 0);
                            return;
                        }

                        if (this.Field3 == 7) {
                            Class106.Field19.Field1();
                            Class261.Field1().Field1((String) null, (byte) 1, 0);
                            return;
                        }
                    }
                    break;
                case 5:
                    if (this.Field3 == 7) {
                        Class62.Field1(0, true, new byte[]{29, 30});
                        return;
                    }

                    if (this.Field3 == 2) {
                        Field2(7);
                        return;
                    }

                    if (this.Field3 == 6) {
                        Class261.Field1().Field12(7, 0);
                        return;
                    }

                    if (this.Field3 == 1) {
                        Class106.Field19.Field18 = !Class106.Field19.Field18;
                        Class261.Field1().Field1(!Class106.Field19.Field18 ? 4 : 5);
                        Class106.Field19.Field1();
                        Class106.Field1(!Class106.Field19.Field18 ? "Đã bật chức năng nhận lời mời." : "Đã tắt chức năng nhận lời mời.");
                        return;
                    }
                    break;
                case 6:
                    if (this.Field3 == 7) {
                        Class106.Field19.Field1();
                        Class104.Field5().Field1("", "Bang hội");
                        Class104.Field5().Field1("Bang hội");
                        Class104.Field5().Field1();
                        return;
                    }

                    if (this.Field3 == 1) {
                        Class106.Field35.Field1();
                        return;
                    }

                    if (this.Field3 == 6) {
                        (Class17.Field1 == null ? (Class17.Field1 = new Class17()) : Class17.Field1).Field1();
                        return;
                    }

                    if (this.Field3 == 2) {
                        Class268.Field5().Field1((Class671) Class106.Field19);
                        return;
                    }
                    break;
                case 7:
                    if (this.Field3 == 7) {
                        Class106.Field25.Field1("Số lượng", new Class631(this), 1, 100, false);
                        Class106.Field23 = Class106.Field25;
                        return;
                    }

                    if (this.Field3 == 6) {
                        try {
                            if (!Objects.equals(MainTab.Field6, "")) {
                                Main.instance.platformRequest(MainTab.Field6);
                                return;
                            }
                        } catch (Exception var5) {
                            var5.printStackTrace();
                            return;
                        }
                    } else {
                        if (this.Field3 == 2) {
                            Class358.Field5().Field1((Class671) Class106.Field19);
                            return;
                        }

                        if (this.Field3 == 1) {
                            Class106.Field35.Field1();
                            Class106.Field35.Field5 = true;
                            Class106.Field35.Field10 = Class62.Field65;
                            Class106.Field35.Field6();
                            return;
                        }
                    }
                    break;
                case 8:
                    if (this.Field3 == 2) {
                        Class261.Field1().Field8();
                        return;
                    }

                    if (Class106.Field19.Field15.Field190 == -1) {
                        Class106.Field1("Bạn chưa có bang");
                        return;
                    }

                    if (Class106.Field19.Field15.Field57 == 0) {
                        Class106.Field2(Class357.Field56 ? "Bạn có chắc muốn phục hồi lại bang hội không ?" : "Bạn có chắc muốn giải tán bang hội không ?", new Class634(this));
                        return;
                    }

                    Class106.Field2("Bạn có chắc muốn rời bang không ?", new Class638(this));
                case 9:
                case 10:
                case 11:
            }

        }
    }

    public static void Field2(int var0) {
        Class464.Field5().Field1();
        Class464.Field5().Field1(var0, Class464.Field5().Field15, Class464.Field5().Field15 ? Class464.Field5().Field48 : new byte[]{0, 1, 2, 3, 4, 5, 6, 31});
        Class464.Field39 = Class106.Field19.Field15;
        Class464.Field5().Field10();
    }

    public final void Field1() {
        this.Field4 = this.Field9.length;
        this.Field2 = 0;
        this.Field3 = -1;
        this.Field6 = this.Field4 * 18 - this.Field7;
        this.Field5 = this.Field10 = 0;
        if (Class167.Field1 != null) {
            if (Class167.Field1.Field2 == 1) {
                this.Field9[1][5] = "Tất âm thanh";
            } else {
                this.Field9[1][5] = "Bật âm thanh";
            }
        }

        super.Field1();
        this.Field2();
    }

    static void Field1(Class752 var0) {
        var0.Field7();
    }

    static String[][] Field2(Class752 var0) {
        return var0.Field9;
    }
}
