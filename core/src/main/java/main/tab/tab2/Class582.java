package main.tab.tab2;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.Vector;

public final class Class582 extends Class357 {
    public static Class250[][] Field1;
    public boolean Field32;
    public boolean Field33;
    public boolean Field34;
    private boolean Field219;
    private boolean Field220;
    public byte Field35;
    public static Vector Field36 = new Vector();
    public static Vector Field37 = new Vector();
    public static Vector Field38 = new Vector();
    public static Vector Field39 = new Vector();
    public Vector Field40 = new Vector();
    public Vector Field41 = new Vector();
    public static Class647[] Field42;
    public static short[] Field43;
    public boolean Field44 = false;
    public short Field45;
    public short Field46;
    public short Field47;
    public int Field48 = 0;
    public short[] Field49;
    public short Field50;
    public int Field183;
    public int Field184;
    public String Field185 = "";
    public boolean Field186 = false;

    public final void Field18() {
        if (Field1 == null) {
            Field1 = new Class250[2][5];

            for (int var6 = 0; var6 < 5; ++var6) {
                Field1[0][var6] = new Class250();
                Field1[1][var6] = new Class250();
            }

            if (Class357.Field97[1] > 0) {
                Field1[0][0].Field1(1, false);
            }

            if (Class357.Field97[2] > 0) {
                Field1[0][1].Field1(2, false);
            }

            Field1[0][2].Field1(0, false);
            Field1[0][3].Field1(1);
            Field1[0][4].Field1(4);
            Field1[1][3].Field1(1);
            Field1[1][4].Field1(4);
            byte[] var7;
            if ((var7 = Class837.Field1("nqshQuickSlot")) != null) {
                ByteArrayInputStream var8 = new ByteArrayInputStream(var7);
                DataInputStream var9 = new DataInputStream(var8);

                try {
                    if (!var9.readUTF().equals(Class106.Field19.Field15.Field65)) {
                        return;
                    }

                    for (int var1 = 0; var1 < Field1.length; ++var1) {
                        for (int var2 = 0; var2 < Field1[var1].length; ++var2) {
                            Class250 var3;
                            (var3 = Field1[var1][var2]).Field1 = var9.readUnsignedByte();
                            byte var4 = var9.readByte();
                            var3.Field2 = var9.readBoolean();
                            if (var3.Field1 == 2) {
                                var3.Field1(var4);
                            } else {
                                var3.Field1(var4, var3.Field2);
                            }

                            Class62.Field46 = var9.readByte();
                        }
                    }

                    var9.close();
                    return;
                } catch (IOException var5) {
                }
            }

        }
    }

    public final String Field44() {
        return super.Field96 / 10 + "." + super.Field96 % 10;
    }

    public static void Field1(Class802 var0) {
        for (int var1 = 0; var1 < Class357.Field127.size(); ++var1) {
            if (((Class802) Class357.Field127.elementAt(var1)).Field2.equals(var0.Field2)) {
                return;
            }
        }

        Class357.Field127.addElement(var0);
    }

    public static String Field2(short var0) {
        String var1 = null;

        for (int var2 = 0; var2 < Class357.Field127.size(); ++var2) {
            if (((Class802) Class357.Field127.elementAt(var2)).Field1 == var0) {
                var1 = ((Class802) Class357.Field127.elementAt(var2)).Field2;
                Class357.Field127.removeElementAt(var2);
                return var1;
            }
        }

        return "";
    }

    public final void Field2() {
        super.Field2();
        byte var3;
        if (!super.Field27 && this.Field49 != null) {
            Class582 var1 = this;
            if (Class809.Field4(super.Field193 - super.Field74) <= 3 && Class809.Field4(super.Field194 - super.Field75) <= 3) {
                for (int var2 = this.Field49.length - 1 - this.Field48; var2 >= 0; --var2) {
                    if (var1.Field49[var2] > 0) {
                        var3 = (byte) (Class62.Field94 + (var1.Field49[var2] >> 8));
                        byte var4 = (byte) (Class62.Field95 + (var1.Field49[var2] & 255));
                        if (Class62.Field48 != 2 && (var1.Field12 == 1 || Class455.Field13) && Class106.Field19.Field1((int) ((var3 << 4) + var1.Field17), (int) ((var4 << 4) + var1.Field17), (int) var1.Field12)) {
                            var1.Field49 = null;
                            var1.Field48 = 0;
                            break;
                        }

                        if (Class106.Field19.Field1((var3 << 4) + var1.Field17, (var4 << 4) + var1.Field17)) {
                            var1.Field49 = null;
                        } else {
                            var1.Field2((short) ((var3 << 4) + var1.Field17), (short) ((var4 << 4) + var1.Field17));
                            Class106.Field19.Field2((int) ((short) ((var3 << 4) + var1.Field17)), (int) ((short) ((var4 << 4) + var1.Field17)));
                            var1.Field49[var2] = -1;
                            ++var1.Field48;
                        }
                        break;
                    }

                    if (var2 == 0) {
                        var1.Field49 = null;
                        var1.Field48 = 0;
                        break;
                    }
                }
            }

            this.Field219 = false;
        }

        if (!this.Field186 && System.currentTimeMillis() - Class62.Field70 >= 0L) {
            Class62.Field70 = System.currentTimeMillis() + (long) Class62.Field69;
            this.Field186 = true;
            Class261.Field1().Field8(super.Field193, super.Field194);
        }

        if (Class106.Field1.hasPointerEvents() && Class62.Field48 != 2) {
            if (this.Field220 && !this.Field219 && super.Field204 == 1) {
                byte var5 = 0;
                var3 = 0;
                if (super.Field12 == 2) {
                    var5 = -32;
                } else if (super.Field12 == 3) {
                    var5 = 32;
                }

                if (super.Field12 == 0) {
                    var3 = 32;
                } else if (super.Field12 == 1) {
                    var3 = -32;
                }

                if ((Math.abs(super.Field193 - this.Field46) >= 16 || Math.abs(super.Field194 - this.Field47) >= 16) && Class106.Field19.Field1((int) (super.Field193 + var5), (int) (super.Field194 + var3), (int) super.Field12)) {
                    this.Field49 = null;
                    this.Field219 = true;
                    return;
                }
            }

            if (super.Field204 == 1) {
                this.Field220 = true;
                return;
            }

            this.Field220 = false;
        }

    }

    public final String[] Field10(int var1) {
        String[] var2 = null;
        if (Class357.Field97[var1] == -1) {
            (var2 = new String[2])[0] = "Chưa học kỹ năng này";
            var2[1] = "Lv yêu cầu: " + Class599.Field2[var1][1];
        } else if (Class357.Field97[var1] == 0) {
            (var2 = new String[2])[0] = "Chưa học kỹ năng này";
            var2[1] = Field14(var1);
        } else if (!Class464.Field5().Field13()) {
            (var2 = new String[5])[0] = "Thời gian đánh: " + Class599.Field1((byte) ((byte) var1), Class357.Field97[var1]) + " ms";
            var2[1] = Class599.Field1[super.Field93][var1] + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
            var2[2] = "Phạm vi: " + Class599.Field1((byte) var1);
            var2[3] = "MP mất: " + Class599.Field2(var1, Class357.Field97[var1]);
            var2[4] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
        } else {
            byte[][] var3 = new byte[][]{{1, 5}, {1, 2}, {3, 4, 5, 6}, {0, 1}, {0, 3}};
            String var4 = "MP mất: " + Class599.Field2(var1, Class357.Field97[var1]);
            switch (super.Field93) {
                case 0:
                    if (var1 == 4) {
                        (var2 = new String[4])[0] = "Đánh xuyên giáp";
                        var2[1] = "Tỷ lệ thành công: " + Class599.Field6[super.Field93][var1][Class357.Field97[var1]] + "%";
                        var2[2] = var4;
                        var2[3] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    } else if (var1 == 5) {
                        (var2 = new String[6])[0] = "Gây tác hại lại 1 phần";
                        var2[1] = "sức công cho đối thủ";
                        var2[2] = "Thời gian: " + Class599.Field7[var3[super.Field93][var1 - 4]][Class357.Field97[var1]] + "s";
                        var2[3] = "Tỷ lệ: " + Class599.Field6[super.Field93][var1][Class357.Field97[var1]] + "%";
                        var2[4] = var4;
                        var2[5] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    }
                    break;
                case 1:
                    if (var1 == 5) {
                        (var2 = new String[4])[0] = "Tăng sức tấn công";
                        var2[1] = "của bản thân";
                        var2[2] = "Tỷ lệ tăng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[3] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    } else if (var1 == 4) {
                        (var2 = new String[4])[0] = "Phòng thủ tăng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[1] = "Thời gian: " + Class599.Field7[var3[super.Field93][var1 - 4]][Class357.Field97[var1]] + "s";
                        var2[2] = var4;
                        var2[3] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    }
                    break;
                case 2:
                    if (var1 == 5) {
                        (var2 = new String[4])[0] = "Tăng tinh thần";
                        var2[1] = "của bản thân";
                        var2[2] = "Tỷ lệ tăng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[3] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    } else if (var1 == 4) {
                        (var2 = new String[4])[0] = "MP + HP tăng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + " %";
                        var2[1] = "Thời gian: " + Class599.Field7[var3[super.Field93][var1 - 4]][Class357.Field97[var1]] + "s";
                        var2[2] = var4;
                        var2[3] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    } else if (var1 == 6) {
                        (var2 = new String[4])[0] = "Hồi sinh";
                        var2[1] = "HP hồi phục: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[2] = var4;
                        var2[3] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    } else if (var1 == 7) {
                        (var2 = new String[7])[0] = "Khiên MP";
                        var2[1] = "Chuyển 1 lượng hao tổn";
                        var2[2] = "HP sang MP";
                        var2[3] = "Tỷ lệ chuyển: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[4] = "Thời gian: " + Class599.Field7[var3[super.Field93][var1 - 4]][Class357.Field97[var1]] + "s";
                        var2[5] = var4;
                        var2[6] = Class357.Field97[var1] < 9 ? "Lv yêu cầu: " + Class599.Field2[var1][Class357.Field97[var1]] : "";
                    }
                    break;
                case 3:
                    if (var1 == 5) {
                        (var2 = new String[4])[0] = "Tăng sức phòng thủ";
                        var2[1] = "của bản thân";
                        var2[2] = "Tỷ lệ tăng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[3] = Field14(var1);
                    } else if (var1 == 4) {
                        (var2 = new String[6])[0] = "Gây choáng cho";
                        var2[1] = "đối phương";
                        var2[2] = "Thời gian: 5s";
                        var2[3] = "Tỷ lệ gây choáng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[4] = var4;
                        var2[5] = Field14(var1);
                    }
                    break;
                case 4:
                    if (var1 == 5) {
                        (var2 = new String[3])[0] = "Tăng độc tính sử dụng";
                        var2[1] = "Tỷ lệ tăng: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "%";
                        var2[2] = Field14(var1);
                    } else if (var1 == 4) {
                        (var2 = new String[5])[0] = "Tẩm độc vào tên: ";
                        var2[1] = "Độc tính: " + Class599.Field1((int) var1, Class357.Field97[var1]);
                        var2[2] = "Thời gian: " + Class599.Field1((int) var1, Class357.Field97[var1]) + "s";
                        var2[3] = var4;
                        var2[4] = Field14(var1);
                    }
            }
        }

        return var2;
    }

    private static String Field14(int var0) {
        return "Lv yêu cầu: " + Class599.Field2[var0][Class357.Field97[var0]];
    }

    public final boolean Field3(int var1, int var2) {
        short var3 = super.Field193;
        if (var1 != 0) {
            if (!Class455.Field1(super.Field193 + var1, super.Field194 - 16, 2) && !Class455.Field1(super.Field193, super.Field194 - 16, 2)) {
                this.Field2(var3, (short) (super.Field194 - 16));
                return true;
            }

            if (!Class455.Field1(super.Field193 + var1, super.Field194 + 16, 2) && !Class455.Field1(super.Field193, super.Field194 + 16, 2)) {
                this.Field2(var3, (short) (super.Field194 + 16));
                return true;
            }
        } else if (var2 != 0) {
            if (!Class455.Field1(super.Field193 - 16, super.Field194 + var2, 2) && !Class455.Field1(super.Field193 - 16, super.Field194, 2)) {
                this.Field2((short) (super.Field193 - 16), super.Field194);
                return true;
            }

            if (!Class455.Field1(super.Field193 + 16, super.Field194 + var2, 2) && !Class455.Field1(super.Field193 + 16, super.Field194, 2)) {
                this.Field2((short) (super.Field193 + 16), super.Field194);
                return true;
            }
        }

        return false;
    }
}
