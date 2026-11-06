package main.tab.tab2;

import main.lib.Graphics;
import main.lib.ServerManager;
import main.screen.Main;

import java.io.*;

public final class Class774 extends Class671 {
    private static Class774 Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    private int Field10 = 200;
    private int Field11 = 135;
    private int Field12 = 91;
    private static int Field13;
    private static int Field14;
    private static int Field15;
    private static int Field16;
    private static int Field17;
    public static int Field1;
    static String[] Field2 = new String[]{"KINH ĐÔ", "Cập nhật!"};
    public static String[] Field3 = new String[]{"19129", "19129"};
    public static short[] Field4 = new short[]{0, 1};
    public static byte[] Field5 = new byte[]{0, 0, 3, 4, 1, 2};
    private boolean Field18;
    private int Field19;

    public static Class774 Field5() {
        return Field6 == null ? (Field6 = new Class774()) : Field6;
    }

    public final void Field1() {
        super.Field1();
        Class106.Field19.Field6();
        this.Field8();
        this.Field2();
    }

    public Class774() {
        byte[] var1;
        if ((var1 = Class837.Field1("iqnqsh")) != null) {
            ByteArrayInputStream var5 = new ByteArrayInputStream(var1);
            DataInputStream var6 = new DataInputStream(var5);

            try {
                byte var2;
                Field2 = new String[var2 = var6.readByte()];
                Field3 = new String[var2];
                Field4 = new short[var2];
                Field5 = new byte[var2];

                for (int var3 = 0; var3 < var2; ++var3) {
                    Field2[var3] = var6.readUTF();
                    Field3[var3] = var6.readUTF();
                    Field4[var3] = var6.readShort();
                    Field5[var3] = var6.readByte();
                }

                var6.close();
            } catch (IOException var4) {
                var4.printStackTrace();
            }
        }

        super.Field103 = new Class86("Cập nhật", new Class583(this));
        super.Field105 = new Class86("Thoát", new Class579(this));
        super.Field104 = new Class86("Chọn", new Class581(this));
    }

    public final void Field2() {
        Class62.Field8 = Class62.Field6;
        Class62.Field9 = Class62.Field7;
        Field13 = 0;
        Field14 = 0;
        Field1 = 0;
        if ((Field17 = (Field2.length << 4) - (this.Field12 - 10)) < 0) {
            Field17 = 0;
        }

    }

    public final void Field6() {
        Class106.Field8();
        String var1;
        if ((var1 = Main.instance.getResponse(ServerManager.decrypt2(ServerManager.updateLinkServer))) == null) {
            Class106.Field1("Không thể kết nối, xin kiểm tra lại GPRS/3G/Wifi.");
        } else {
            String[] var5;
            Field2 = new String[(var5 = Class21.Field1(var1, ",")).length];
            Field3 = new String[var5.length];
            Field4 = new short[var5.length];
            Field5 = new byte[var5.length];

            for (int var2 = 0; var2 < var5.length; ++var2) {
                String[] var3 = Class21.Field1(var5[var2], ":");
                Field2[var2] = var3[0];
                Field3[var2] = var3[1];
                Field4[var2] = Short.parseShort(var3[2].trim());
                Field5[var2] = Byte.parseByte(var3[3].trim());
            }

            if (Field2.length > 0) {
                Field2[0] = "KINH ĐÔ";
            }

            ByteArrayOutputStream var6 = new ByteArrayOutputStream();
            DataOutputStream var7 = new DataOutputStream(var6);

            try {
                var7.writeByte(Field2.length);

                for (int var8 = 0; var8 < Field2.length; ++var8) {
                    var7.writeUTF(Field2[var8]);
                    var7.writeUTF(Field3[var8]);
                    var7.writeShort(Field4[var8]);
                    var7.writeByte(Field5[var8]);
                }

                Class837.Field1("ipnqsh", var6.toByteArray());
                var7.close();
            } catch (Exception var4) {
                var4.printStackTrace();
            }

            this.Field2();
            Class106.Field7();
        }
    }

    public final void Field4() {
        if (Field14 != Field13) {
            Field16 = Field13 - Field14 << 2;
            Field15 += Field16;
            Field14 += Field15 >> 4;
            Field15 &= 15;
        }

        this.Field8();
    }

    public final void Field3() {
        boolean var1 = false;
        if (Class106.Field2(2)) {
            if (--Field1 < 0) {
                Field1 = Field2.length - 1;
            }

            var1 = true;
        } else if (Class106.Field2(8)) {
            if (++Field1 >= Field2.length) {
                Field1 = 0;
            }

            var1 = true;
        }

        if (var1) {
            if ((Field13 = (Field1 << 4) - (this.Field12 - 10) / 2) < 0) {
                Field13 = 0;
            }

            if (Field13 > Field17) {
                Field13 = Field17;
            }
        }

        super.Field3();
        int var3;
        if (Class106.Field6 && Class106.Field1(Class106.Field15 - 61, Class106.Field16 - 19, 120, 100)) {
            if (!this.Field18) {
                this.Field19 = Field14;
                this.Field18 = true;
            }

            if ((var3 = (Field13 + Class106.Field11 - (Class106.Field16 - 20)) / 16) < 0) {
                var3 = 0;
            }

            if (var3 > Field2.length - 1) {
                var3 = Field2.length - 1;
            }

            Field1 = var3;
            if (Math.abs(Class106.Field30 - Class106.Field11) != 0) {
                if ((Field13 = this.Field19 + (Class106.Field30 - Class106.Field11)) < 0) {
                    Field13 = 0;
                }

                if (Field13 > Field17) {
                    Field13 = Field17;
                }

                Field1 = -1;
            }
        }

        if (Class106.Field7) {
            this.Field18 = false;
            Class106.Field7 = false;
            int var10000 = Class106.Field15 - 61;
            int var10001 = Class106.Field16 - 19;
            var1 = true;
            var1 = true;
            int var2 = var10001;
            var3 = var10000;
            if (Class106.Field10 >= var3 && Class106.Field10 <= var3 + 120 && Class106.Field11 >= var2 && Class106.Field11 <= var2 + 100) {
                if ((var3 = (Field13 + Class106.Field11 - (Class106.Field16 - 20)) / 16) < 0) {
                    var3 = 0;
                }

                if (var3 > Field2.length - 1) {
                    var3 = Field2.length - 1;
                }

                if (Math.abs(Class106.Field30 - Class106.Field11) < 10) {
                    Field1 = var3;
                    if (Field14 == Field13 && Field1 != -1 && super.Field104 != null) {
                        super.Field104.Field2.Field1();
                    }
                }
            }
        }

    }

    private void Field8() {
        ++this.Field7;
        if (this.Field7 > 360) {
            this.Field7 = 0;
        }

        this.Field8 = Class809.Field2(this.Field7) * this.Field10 >> 10;
        this.Field9 = Class809.Field1(this.Field7) * this.Field10 >> 10;
        Class62.Field6 = this.Field8 + 380;
        Class62.Field7 = this.Field9 + 380;
        Class106.Field19.Field7();
    }

    public static void Field2(Graphics var0) {
        Class106.Field1(var0);
        var0.translate(-Class62.Field8, -Class62.Field9);
        Class455.Field1(var0);
        Class455.Field2(var0);
    }

    public final void Field1(Graphics var1) {
        Field2(var1);
        Class106.Field1(var1);
        var1.drawImage(Class106.Field1(), Class106.Field15, Class106.Field16 - 70, 3);
        Graphics var3 = var1;
        Class811.Field3(var1, Class106.Field15 - 70, Class106.Field16 - 50 + 20, 140, 100);
        var1.setClip(Class106.Field15 - 69, Class106.Field16 - 28, this.Field11, this.Field12);
        var1.translate(0, -Field14);
        if (Field1 != -1) {
            var1.setColor(11908790);
            var1.fillRect(Class106.Field15 - 61, Class106.Field16 - 21 + (Field1 << 4), 122, 18);
            var1.setColor(34949);
            var1.fillRect(Class106.Field15 - 60, Class106.Field16 - 20 + (Field1 << 4), 120, 16);
        }

        for (int var2 = 0; var2 < Field2.length; ++var2) {
            Class21.Field10[0].Field1(var3, Field2[var2], Class106.Field15, Class106.Field16 - 19 + (var2 << 4), 2);
        }

        super.Field1(var1);
    }

    public static void Field7() {
        Field6 = null;
    }
}
