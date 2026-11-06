package main.tab.tab1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import main.lib.Graphics;
import main.lib.Image;
import main.lib.TextureService;
import main.screen.Main;

import java.io.IOException;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

public final class Class804 {
    public static String Field1 = "";
    public static String Field2 = "";
    public static String Field3 = "";
    public static Vector Field4 = new Vector();
    public static Vector Field5 = new Vector();
    public static Vector Field6 = new Vector();
    public static Class2[] Field7;
    private static String[][] Field59 = new String[][]{{"Vào trong đi cậu. Đủ loại HP từ lớn đến bé!"}, {"Hò ơ… mua gì cũng có, hỏi gì cũng biết", "Gánh hàng nhỏ nhưng món gì cũng có đây", "Mua gì đây, nói ta nghe"}, {"Vũ khí ở đây rất lợi hại, vào trong tôi cho cậu xem!", "Ngươi muốn sửa chữa đồ?", "Ngươi muốn luyện đồ?"}, {"Mua giáp hộ thân nào …", "Mua giáp của ta, ngươi sẽ luôn được bảo vệ an toàn", "Đến với ta, ta sẽ nói cho ngươi biết tại sao người ta gọi ta là Thiết Bì"}, {"Trách nhiệm của ta là bảo vệ ngôi làng này."}, {"Cố gắng lên con, hãy hoàn thành các nhiệm vụ đi nhé", "Anh hùng xuất thiếu niên..anh hùng xuất thiếu niên", "Con là thành viên của làng Nghĩa Sĩ này ! Hãy nhớ lấy điều đó"}, {"Chào chàng trai trẻ", "Muốn mua ngọc thì vào nhà", "Ngươi muốn mua vật phẩm để luyện đồ?"}, {"Đường xa vạn lý, không làm nản lòng xa phu ta đây", "Đi lâu thành lối, lối thành đường đi.", "Nói ta nghe ngươi muốn đi đâu?"}, {""}, {"Gửi đồ chỗ ta là an toàn nhất đó", "Ngươi muốn nhờ ta giữ đồ?", "Ngươi có nhiều đồ muốn gửi àh?"}, {"Bạn phải có vé mới được lên tàu."}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Muốn nhờ ta bán gì nào"}, {"Tập luyện nào, tập luyện nào ..", "Sức khỏe trước đã, tập luyện nào …", "Cho ta xem khả năng của các ngươi nào !!"}, {"Giao tiền ta giữ nào, yên tâm nhé", "Ngươi muốn đổi tiền à, nói ta nghe", "Ta lấy chữ Tín làm đầu, yên tâm nào"}, {"Chà, lâu rồi mới có người đi qua."}, {"Ngươi muốn thuê gì?"}, {"Hãy quản lý bang của ngươi thật tốt vào."}, {"Hò ơ… mua gì cũng có, hỏi gì cũng biết", "Gánh hàng nhỏ nhưng món gì cũng có đây", "Mua gì đây, nói ta nghe"}, {"Mua giáp hộ thân nào …", "Mua giáp của ta, ngươi sẽ luôn được bảo vệ an toàn", "Đến với ta, ta sẽ nói cho ngươi biết tại sao người ta gọi ta là Giáp Sư"}, {"Vũ khí ở đây rất lợi hại, vào trong tôi cho cậu xem!", "Ngươi muốn sửa chữa đồ?", "Ngươi muốn luyện đồ?"}, {"Chào chàng trai trẻ", "Muốn mua ngọc thì vào nhà", "Ngươi muốn mua vật phẩm để luyện đồ?"}, {"Gửi đồ chỗ ta là an toàn nhất đó", "Ngươi muốn nhờ ta giữ đồ?", "Ngươi có nhiều đồ muốn gửi àh?"}, {"Giao tiền ta giữ nào, yên tâm nhé", "Ngươi muốn đổi tiền à, nói ta nghe", "Ta lấy chữ Tín làm đầu, yên tâm nào"}};
    private static Random Field60;
    public static final String[] Field8;
    public static Image[] Field9;
    public static Image Field10;
    public static Image Field11;
    public static Image Field12;
    public static Image Field13;
    public static Image Field14;
    public static Image Field15;
    public static Image Field16;
    public static Image Field17;
    public static Image Field18;
    private static Image[] Field61;
    public static Image Field19;
    public static Image Field20;
    public static Image Field21;
    public static Image Field22;
    public static Image Field23;
    public static Image[] Field24;
    private static Image[] Field62;
    public static Image[] Field25;
    public static Image Field26;
    public static Image Field27;
    public static Image[] Field28;
    public static Image[] Field29;
    public static Image Field30;
    public static Image Field31;
    public static Image[] Field32;
    public static Image Field33;
    public static Class568 Field34;
    public static Class568 Field35;
    public static Class568 Field36;
    public static Class568 Field37;
    public static Image Field38;
    private static Image Field63;
    public static Image Field39;
    private static Image Field64;
    public static Image Field40;
    public static Image Field41;
    public static int Field42;
    public static Class301[][] Field43;
    public static byte[] Field44;
    public static Class403 Field45;
    public static Class50[] Field46;
    public static Vector Field47;
    private static Class182 Field65;
    private static Class182 Field66;
    private static Class182 Field67;
    private static Hashtable Field68;
    public static Class118[] Field48;
    public static int[] Field49;
    private static int Field69;
    private static int Field70;
    public static String Field50;
    private static Random Field71;
    public static short[][] Field51;
    public static String[][] Field52;
    public static String[][][] Field53;
    public static short[][][] Field54;
    public static String[] Field55;
    public static byte[] Field56;
    public static final String[] Field57;
    public static final String[] Field58;

    static {
        String[] var10000 = new String[]{"Tăng Hp ", "Tăng Mp ", "Sức mạnh +", "Nhanh nhẹn +", "Tinh thần +", "Sức khoẻ +", "", "Chí mạng tăng ", "Tăng st chí mạng "};
        var10000 = new String[]{"Tăng công ", "Tăng thủ ma ", "Tăng thủ vật "};
        Field60 = new Random(System.currentTimeMillis());
        Field8 = new String[]{"bất kỳ", "nam", "nữ"};
        Field61 = new Image[66];
        Field24 = new Image[3];
        Field62 = new Image[18];
        Field32 = new Image[2];
        Class53.Field2("/main.sh");
        Field37 = new Class568(Class53.Field1("no"), 10, 10);
        Field39 = Class53.Field1("kham");
        Field33 = Class53.Field1("msg0");
        Field26 = Class53.Field1("wicon");
        Field30 = Class53.Field1("bar");
        Field64 = Class53.Field1("kc");
        Class522.Field3 = Class568.Field1("arF", 11, 9);
        Field1();
        Field29 = new Image[3];

        int var0;
        for (var0 = 0; var0 < 3; ++var0) {
            Field29[var0] = Class53.Field1("inv" + var0);
        }

        if (Class105.Field1.hasPointerEvents()) {
            Field15 = Class53.Field1("panel150x36");
            Field42 = 30;
        } else {
            Field15 = Class53.Field1("panel");
            Field42 = 20;
        }

        Field40 = Class53.Field1("sk31");
        Field21 = Class53.Field1("die");
        Field22 = Class53.Field1("eye");
        Class53.Field1("plus");
        Field10 = Class53.Field1("shadow");
        Field20 = Class53.Field1("grid");
        Field25 = new Image[2];

        for (var0 = 0; var0 < Field25.length; ++var0) {
            Field25[var0] = Class53.Field1("inv_" + var0);
        }

        Class580.Field8 = Class53.Field1("c");
        Class580.Field9 = Class53.Field1("ar");
        Class252.Field1();
        Field34 = new Class568(Class53.Field1("smoke"), 14, 15);
        Field36 = new Class568(Class53.Field1("check"), 10, 10);
        Class21.Field1();
        Class53.Field1();
        Class53.Field2("/eff.sh");
        Field19 = Class53.Field1("explosion");
        Class53.Field1();
        Class53.Field2("/g.sh");
        Field24[0] = Class53.Field1("g0");
        Field24[1] = Class53.Field1("g1");
        Field24[2] = Class53.Field1("g2");
        Class53.Field1();
        Class53.Field2("/nation");
        Field41 = Class53.Field1("icon");
        Class53.Field1();
        Class53.Field2("/box.sh");
        Field32[0] = Class53.Field1("b0");
        Field32[1] = Class53.Field1("b1");
        Class53.Field1();

        try {
            if (Field18 == null) {
                Field18 = Image.createImage("/m/coat.png");
            }

            if (Field16 == null) {
                Field16 = Image.createImage("/m/imgshadow.png");
            }

            Field17 = Image.createImage("/m/notice.png");
        } catch (Exception var2) {
            (new StringBuffer("loi load hinh res  ++  ")).append(var2.toString()).toString();
        }

        try {
            Field23 = Image.createImage("/sword skill/h0.png");
            Class63.Field42 = Image.createImage("/plus12.png");
            Class63.Field43 = Image.createImage("/shadow.png");
            (Class63.Field57 = new Image[2])[0] = Image.createImage("/m1.png");
            Class63.Field57[1] = Image.createImage("/m2.png");
        } catch (Exception var1) {
        }

        Field43 = new Class301[5][3];
        Field44 = new byte[]{20, 50, 10, 70, 20};
        Field45 = new Class403();
        new Hashtable();
        Field46 = new Class50[115];
        (Field47 = new Vector()).addElement(new Hashtable());
        Field47.addElement(new Hashtable());
        Field47.addElement(new Hashtable());
        Field47.addElement(new Hashtable());
        Field47.addElement(new Hashtable());
        Field68 = new Hashtable();
        Field48 = new Class118[Class359.Field51];
        Field49 = new int[]{8346120, 15852810, 14527502, 14595691, 11241794, 4858880, 2181450};
        Field69 = 6;
        Field50 = "xu";
        Field71 = new Random();
        Field57 = new String[]{"Làng Sơn Nam", "Dao Châu", "Tiên Du", "Phù Liệt", "Kỳ Bố", "Hàm Tử", "Thạch Giang", "Đông Sơn", "Tử Quan", "Trường Giang", "Lộc Trĩ", "Sơn Lâm", "Hang động", "Hang mãng xà", "Hang thằn lằn", "Đấu trường", "Khu vực 1"};
        Field58 = new String[]{"Kiếm khách", "Chiến binh", "Pháp sư", "Đấu sĩ", "Cung thủ", ""};
    }

    public static String Field1(int var0) {
        String var1 = "";

        try {
            var1 = Field59[var0][Class63.Field3(Field60.nextInt(Field59[var0].length))];
        } catch (Exception var2) {
        }

        return var1;
    }

    public static void Field1() {
        Gdx.app.postRunnable(() -> {
            SpriteBatch batch = new SpriteBatch();
            Graphics g = new Graphics(batch);
            int var0 = Class105.Field13 / 2 + 1;
            Texture texture = TextureService.instance.spriteBatchToTexture(batch, () -> {
                for (int var2 = 0; var2 < var0; ++var2) {
                    g.drawImage(Field64, var2 << 1, 0, 0);
                }
            }, Class105.Field13, Field64.getHeight());
            Field31 = new Image(texture);
        });
    }

    public static void Field1(byte[] var0) {
        Class53.Field1(var0);
        Field19 = Class53.Field1("explosion");
        Class53.Field1();
    }

    public static void Field2() {
        if (Field12 == null) {
            Class53.Field2("/main.sh");
            Field12 = Class53.Field1("select");
            Field13 = Class53.Field1("select1");
            Field14 = Class53.Field1("select3");
            Class63.Field41 = new Image[2];

            int var0;
            for (var0 = 0; var0 < 2; ++var0) {
                Class63.Field41[var0] = Class53.Field1("cong" + (var0 + 1));
            }

            if (Class63.Field39 == null) {
                Class63.Field39 = Class53.Field1("info");
            }

            if (Class63.Field40 == null) {
                Class63.Field40 = Class53.Field1("mauquai");
            }

            Class169.Field2 = Class53.Field1("fire");
            Class359.Field52 = Class53.Field1("flg");
            Class359.Field53 = Class53.Field1("light");
            Field9 = new Image[2];

            for (var0 = 0; var0 < 2; ++var0) {
                Field9[var0] = Class53.Field1("soft" + var0);
            }

            Field27 = Class53.Field1("nguhanh");
            if (Field28 == null) {
                Field28 = new Image[2];
            }

            for (var0 = 0; var0 < 2; ++var0) {
                Field28[var0] = Class53.Field1("ch" + var0);
            }

            Class53.Field1();
        }

    }

    public static Class743 Field1(short var0) {
        for (int var1 = 0; var1 < Field5.size(); ++var1) {
            Class743 var2;
            if ((var2 = (Class743) Field5.elementAt(var1)).Field15 == var0) {
                return var2;
            }
        }

        return null;
    }

    public static int Field1(int var0, int var1) {
        return var0 + Field71.nextInt(var1 - var0);
    }

    public static boolean Field1(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        return var0 <= var3 && var1 >= var2 && var4 <= var7 && var5 >= var6;
    }

    public static int[] Field1(int var0, int var1, int var2) {
        int[] var3 = new int[10];
        Class798 var5 = ((Class798[]) Field4.elementAt(0))[var1];
        var3[0] = var5.Field11[0];

        int var4;
        for (var4 = 1; var4 < 4; ++var4) {
            var3[var4] = (short) (var5.Field11[var4] + (Class537.Field2(var2) ? 0 : var5.Field11[var4] * Field44[var0] / 100));
        }

        for (var4 = 4; var4 < 10; ++var4) {
            var3[var4] = var5.Field11[var4];
        }

        return var3;
    }

    public static Class798 Field2(int var0) {
        Class798[] var1 = (Class798[]) Field4.elementAt(0);

        for (int var2 = 0; var2 < var1.length; ++var2) {
            if (var1[var2] != null && var1[var2].Field13 == var0) {
                return var1[var2];
            }
        }

        return null;
    }

    public static Class743 Field2(short var0) {
        for (int var1 = 0; var1 < Field6.size(); ++var1) {
            Class743 var2;
            if ((var2 = (Class743) Field6.elementAt(var1)).Field15 == var0) {
                return var2;
            }
        }

        return null;
    }

    public static Class2 Field3() {
        return Class458.Field11 >= 0 ? Field7[Class458.Field11] : null;
    }

    public static Image Field1(byte[] var0, byte[] var1) {
        byte[] var2 = new byte[var0.length + var1.length];
        System.arraycopy(var0, 0, var2, 0, var0.length);
        System.arraycopy(var1, 0, var2, var0.length, var1.length);
        return Image.createImage(var2, 0, var2.length);
    }

    public static void Field4() {
        int var0;
        int var1;
        for (var0 = 0; var0 < Class359.Field171.length; ++var0) {
            for (var1 = 0; var1 < Class359.Field171[var0].length; ++var1) {
                for (int var2 = 0; var2 < Class359.Field171[var0][var1].length; ++var2) {
                    Class359.Field171[var0][var1][var2] = null;
                }
            }
        }

        for (var0 = 0; var0 < 5; ++var0) {
            for (var1 = 0; var1 < 3; ++var1) {
                Field43[var0][var1] = null;
            }
        }

    }

    public static Class391 Field2(int var0, int var1, int var2) {
        Class403 var3;
        if (Class359.Field171[var0][var1][var2] == null && (var3 = Field45).Field1 == -1 && var3.Field2 == -1) {
            var3.Field1 = var0;
            var3.Field2 = var1;
            var3.Field3 = var2;
        }

        return Class359.Field171[var0][var1][var2];
    }

    public static Image Field3(int var0) {
        Image var1 = null;
        var1 = null;
        if (var0 < Field62.length - 1) {
            if (Field62[var0] == null && Field62[var0] == null && Field45.Field5 == -1) {
                Field45.Field5 = var0;
            }

            if ((var1 = Field62[var0]) != null) {
                return var1;
            }
        }

        Class172 var2;
        return (var2 = Class381.Field1((short) (var0 + 10000))) != null && var2.Field1 != null ? var2.Field1 : null;
    }

    public static Image Field4(int var0) {
        Class403 var1 = null;
        var1 = null;
        if (var0 <= Field61.length - 1) {
            if (Field61[var0] == null && (var1 = Field45).Field4 == -1) {
                var1.Field4 = var0;
            }

            Image var3;
            if ((var3 = Field61[var0]) != null) {
                return var3;
            }
        }

        Class172 var4;
        return (var4 = Class381.Field1((short) (var0 + 9000))) != null && var4.Field1 != null ? var4.Field1 : null;
    }

    public static void Field5(int var0) {
        Class53.Field2("/arrow.sh");

        try {
            if (var0 == 7) {
                Field62[var0] = Image.createImage("/sword skill/kiem.png");
            } else if (var0 == 8) {
                Field62[var0] = Image.createImage("/sword skill/skillboss.png");
            } else if (var0 == 9) {
                Field62[var0] = Image.createImage("/sword skill/nut.png");
            } else if (var0 == 10) {
                Field62[10] = Image.createImage("/newEf/46.png");
            } else if (var0 == 11) {
                Field62[11] = Image.createImage("/newEf/47.png");
            } else if (var0 == 12) {
                Field62[12] = Image.createImage("/newEf/48.png");
            } else if (var0 == 13) {
                Field62[var0] = Image.createImage("/newEf/54.png");
            } else if (var0 == 14) {
                Field62[var0] = Image.createImage("/newEf/56.png");
            }
        } catch (Exception var1) {
        }

        Class53.Field1();
    }

    public static void Field1(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        try {
            Image var10;
            if ((var10 = Field4(var1)) != null) {
                var0.drawRegion(var10, 0, var3, var4, var5, 0, var6, var7, var8);
                return;
            }
        } catch (Exception var9) {
        }

    }

    public static Image Field6(int var0) {
        Class172 var1;
        if ((var1 = Class381.Field1((short) (var0 + 9000))) != null && var1.Field1 != null) {
            if (var0 == 32) {
                Field35 = new Class568(var1.Field1, 12, 13);
            }

            return var1.Field1;
        } else {
            return null;
        }
    }

    public static void Field7(int var0) {
        Class53.Field2("/eff.sh");
        if (var0 < 25 || var0 > 33) {
            try {
                Field61[var0] = Class53.Field1("g" + var0);
            } catch (Exception var1) {
            }
        }

        if (Field61[26] == null) {
            Field61[25] = Class53.Field1("g25");
            Field61[26] = Class53.Field1("g26");
            Field61[27] = Class53.Field1("g25");
            Field61[28] = Class53.Field1("g27");
            Field61[29] = Class53.Field1("g28");
            Field61[30] = Class53.Field1("g29");
            Field61[31] = Class53.Field1("g30");
            Field61[32] = Class53.Field1("g31");
            Field61[33] = Class53.Field1("g32");
            Field61[41] = Image.createImage("/newEf/42.png");
            Field61[42] = Image.createImage("/newEf/43.png");
            Field61[43] = Image.createImage("/newEf/44.png");
            Field61[44] = Image.createImage("/newEf/45.png");
            Field61[45] = Image.createImage("/newEf/49.png");
            Field61[46] = Image.createImage("/newEf/50.png");
            Field61[47] = Image.createImage("/newEf/51.png");
            Field61[48] = Image.createImage("/newEf/52.png");
            Field61[49] = Image.createImage("/newEf/53.png");
            Field61[50] = Image.createImage("/newEf/55.png");
            Field61[51] = Image.createImage("/newEf/57.png");
            Field61[52] = Image.createImage("/newEf/58.png");
            Field61[53] = Image.createImage("/newEf/59.png");
            Field61[54] = Image.createImage("/newEf/60.png");
            Field61[55] = Image.createImage("/newEf/61.png");
            Field61[63] = Image.createImage("/newEf/63.png");
            Field61[64] = Image.createImage("/newEf/64.png");
            Field61[65] = Image.createImage("/newEf/65.png");
            Field35 = new Class568(Field61[32], 12, 13);
        }

        Class53.Field1();
    }

    public static void Field3(int var0, int var1, int var2) {
        String[] var3 = new String[]{"kiem", "daidao", "phapsu", "bua", "cung"};
        Class53.Field2("/wpsplash/" + var3[var0] + "/" + var1);
        Class359.Field171[var0][var1][var2] = new Class391();

        try {
            byte[] var6 = Class53.Field1.Field3(var2 + "_h");
            byte[] var4 = Class53.Field1.Field3("data");
            Class359.Field171[var0][var1][var2].Field1 = Field1(var6, var4);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        Class53.Field1();
    }

    public static Class301 Field2(int var0, int var1) {
        try {
            Field43[var0][var1] = new Class301();
            int var3 = var1;
            if (var0 != 3 && var0 != 4 && (var0 != 2 || var1 != 1)) {
                if ((var0 == 0 || var0 == 1) && var1 == 2) {
                    var3 = 1;
                }
            } else {
                var3 = 0;
            }

            Class53 var2 = new Class53("/wpsplash/" + var0 + ".wp", (byte[]) null);
            Field43[var0][var1].Field7 = var2.Field4(var3 + ".png");
            InputStream var6;
            if ((var6 = var2.Field5(var3 + ".d")) != null) {
                for (var3 = 0; var3 < 4; ++var3) {
                    for (int var4 = 0; var4 < 8; ++var4) {
                        Field43[var0][var1].Field1[var3][var4] = var6.read();
                        Field43[var0][var1].Field2[var3][var4] = var6.read();
                        Field43[var0][var1].Field3[var3][var4] = Field1(var6);
                        Field43[var0][var1].Field4[var3][var4] = Field1(var6);
                        Field43[var0][var1].Field5[var3][var4] = var6.read();
                        Field43[var0][var1].Field6[var3][var4] = var6.read();
                    }
                }
            }

            Class53.Field1();
        } catch (IOException var5) {
            Field43[var0][var1] = null;
        }

        return Field43[var0][var1];
    }

    public static void Field5() {
        Field63 = null;
    }

    public static void Field1(int var0, byte[] var1) {
        Class50 var10000 = Field46[var0];
        (new StringBuffer("m")).append(var0).toString();
        var10000.Field1(var0, "", var1[0], var1[1], var1[2], var1[3], var1[4], var1[5], var1[6], var1[7], var1[8]);
    }

    public static void Field6() {
        if (Field46 != null) {
            for (int var0 = 0; var0 < Field46.length; ++var0) {
                if (Field46[var0] != null) {
                    Field46[var0].Field1 = null;
                    Field46[var0].Field16 = null;
                }
            }
        }

    }

    public static void Field7() {
        Field6();
        Field68.clear();
    }

    public static Class182 Field3(int var0, int var1) {
        Class182 var2 = null;
        Hashtable var3;
        if ((var2 = (Class182) (var3 = (Hashtable) Field47.elementAt(var0)).get(String.valueOf(var1))) == null) {
            (var2 = new Class182(var0, var1)).Field3 = (int) (System.currentTimeMillis() / 1000L);
            if (var2.Field2 == null) {
                Class263.Field1().Field4(-1, var0, var1);
            }

            var3.put(String.valueOf(var1), var2);
        }

        if (var2.Field2 == null && System.currentTimeMillis() / 1000L - (long) var2.Field3 == 15L) {
            Class263.Field1().Field4(-1, var0, var1);
            var2.Field3 = (int) (System.currentTimeMillis() / 1000L);
        }

        var2.Field1 = (int) (System.currentTimeMillis() / 1000L);
        return var2;
    }

    public static void Field1(Graphics var0, int var1, int var2, int var3, int var4) {
        if (var4 == 1 && Field65 != null) {
            Field65.Field1(var0, var1, var4, var2, var3);
        }

        if (var4 == 0 && Field66 != null) {
            Field66.Field1(var0, var1, var4, var2, var3);
        }

        if (var4 == 2 && Field67 != null) {
            Field67.Field1(var0, var1, var4, var2, var3);
        }

    }

    public static void Field8() {
        if (Field65 == null) {
            Field65 = Field3(1, 54);
        }

        if (Field66 == null) {
            Field66 = Field3(0, 54);
        }

        if (Field67 == null) {
            Field67 = Field3(2, 27);
        }

    }

    public static Class680 Field8(int var0) {
        Class680 var1;
        if ((var1 = (Class680) Field68.get("" + var0)) == null) {
            (var1 = new Class680()).Field6 = (short) var0;
            Field68.put("" + var0, var1);
        }

        return var1;
    }

    public static int Field9(int var0) {
        Class680 var1;
        if ((var1 = Field8(var0)) != null) {
            return var1.Field5 != null ? var1.Field5.getHeight() : 0;
        } else {
            return 0;
        }
    }

    public static int Field10(int var0) {
        Class680 var1;
        if ((var1 = Field8(var0)) != null) {
            return var1.Field5 != null ? var1.Field5.getWidth() : 0;
        } else {
            return 0;
        }
    }

    public static int Field11(int var0) {
        Class680 var1;
        return (var1 = Field8(var0)) != null ? var1.Field2 : 0;
    }

    public static int Field1(InputStream var0) {
        byte[] var1 = new byte[1];

        try {
            var0.read(var1, 0, 1);
        } catch (IOException var2) {
            var2.printStackTrace();
        }

        return var1[0];
    }

    public static final void Field12(int var0) {
        if (Field11 == null) {
            try {
                InputStream var1 = null;
                byte[] var6;
                if (var0 > 200) {
                    Field11 = Image.createImage(var6 = Class826.Field1(Class105.Field39[1]), 0, var6.length);
                    var1 = Main.instance.getResourceAsStream("/t_thanh.type");
                    Field38 = Image.createImage("/t_thanh_s.png");
                } else if (var0 < 110) {
                    Field11 = Image.createImage("/t.png");
                    var1 = Main.instance.getResourceAsStream("/t.type");
                    Field38 = Image.createImage("/t_small.png");
                } else {
                    Field11 = Image.createImage(var6 = Class826.Field1(Class105.Field39[0]), 0, var6.length);

                    var1 = Main.instance.getResourceAsStream("/t_hang.type");
                    Field38 = Image.createImage("/t_hang_s.png");
                }

                try {
                    Class458.Field8 = null;
                    Class458.Field8 = new int[var1.available()];

                    for (var0 = 0; var0 < Class458.Field8.length; ++var0) {
                        Class458.Field8[var0] = var1.read();
                    }

                    return;
                } catch (Exception var4) {
                    return;
                } finally {
                    var1.close();
                }
            } catch (Exception var5) {
            }
        }

    }

    public static void Field1(Graphics var0, int var1, int var2) {
        var1 -= 10;
        int var3 = var2 + 14;
        var0.drawImage(Field29[2], var1 + 15, var3, 20);
        var0.drawImage(Field29[2], var1 + 85, var3, 20);
        var0.drawImage(Field29[2], var1 + 15, var3 + 46, 20);
        var0.drawImage(Field29[2], var1 + 85, var3 + 46, 20);
        if (Class105.Field17 == Class60.Field5()) {
            var0.drawImage(Field29[2], var1 + 15, var3 + 92 - 10, 20);
            var0.drawImage(Field29[2], var1 + 85, var3 + 92 - 10, 20);
        } else {
            var0.drawImage(Field29[2], var1 + 15, var3 + 92, 20);
            var0.drawImage(Field29[2], var1 + 85, var3 + 92, 20);
            var0.drawImage(Field29[2], var1 + 15, var3 + 92 + 5, 20);
            var0.drawImage(Field29[2], var1 + 85, var3 + 92 + 5, 20);
        }

        var3 = var1 + 12;
        int var4 = var2 + 11;
        short var5 = 144;
        if (Class105.Field17 == Class60.Field5()) {
            var5 = 129;
        }

        for (int var6 = 0; var6 < 3; ++var6) {
            var0.setColor(Field49[var6]);
            var0.drawRect(var3 + var6, var4 + var6, 144 - (var6 << 1), var5 - (var6 << 1) + 5);
        }

        var0.drawImage(Field29[0], var1 + 10, var2 + 9, 20);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 2, var1 + 159, var2 + 9, 24);
        if (Class105.Field17 == Class60.Field5()) {
            var0.drawRegion(Field29[0], 0, 0, 18, 19, 6, var1 + 10, var2 + 148, 36);
            var0.drawRegion(Field29[0], 0, 0, 18, 19, 3, var1 + 159, var2 + 148, 40);
        } else {
            var0.drawRegion(Field29[0], 0, 0, 18, 19, 6, var1 + 10, var2 + 163, 36);
            var0.drawRegion(Field29[0], 0, 0, 18, 19, 3, var1 + 159, var2 + 163, 40);
        }
    }

    public static void Field2(Graphics var0, int var1, int var2, int var3, int var4) {
        var0.setColor(34949);
        var0.fillRect(var1, var2, var3, var4);
        var0.setColor(11908790);
        var0.drawRect(var1, var2, var3, var4);
    }

    public static void Field3(Graphics var0, int var1, int var2, int var3, int var4) {
        int var5 = var3 / 70 + 1;
        int var6 = var4 / 47 + 1;
        var0.setClip(var1, var2, var3, var4);

        int var7;
        for (var7 = 0; var7 < var5; ++var7) {
            for (int var8 = 0; var8 < var6; ++var8) {
                var0.drawImage(Field29[2], var1 + var7 * 70, var2 + var8 * 47, 0);
            }
        }

        var0.setClip(0, 0, Class105.Field13, Class105.Field14);

        for (var7 = 0; var7 < 3; ++var7) {
            var0.setColor(Field49[var7]);
            var0.drawRect(var1 + var7, var2 + var7, var3 - (var7 << 1), var4 - (var7 << 1));
        }

        var0.drawImage(Field29[0], var1 - 2, var2 - 2, 0);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 2, var1 + var3 - 15, var2 - 2, 0);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 6, var1 - 2, var2 + var4 - 15, 0);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 3, var1 + var3 - 15, var2 + var4 - 16, 0);
        var0.drawImage(Field29[1], var1 + var3 / 2, var2 - 4, 3);
    }

    public static void Field1(Graphics var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        var0.setColor(var6);
        var0.drawRect(var1, var2, var3, var4);
        var0.setColor(var7);
        if (var5 < var3) {
            if ((var6 = Field69) + var5 >= var3) {
                var6 = var3 - var5;
            }

            var0.fillRect(var1 + var5, var2, var6, 1);
        } else if (var5 < var3 + var4) {
            if ((var6 = Field69) + (var5 - var3) >= var4) {
                var6 = var4 - (var5 - var3);
            }

            var0.fillRect(var1 + var3, var2 + (var5 - var3), 1, var6);
        } else if (var5 < (var3 << 1) + var4) {
            if ((var6 = Field69) + (var5 - var3 - var4) >= var3) {
                var6 = var3 - (var5 - var3 - var4);
            }

            var0.fillRect(var1 + (var3 - (var5 - var3 - var4)) - var6, var2 + var4, var6, 1);
        } else if (var5 < var3 * var4 << 1) {
            if ((var6 = Field69) + (var5 - (var3 << 1) - var4) >= var4) {
                var6 = var4 - (var5 - (var3 << 1) - var4);
            }

            var0.fillRect(var1, var2 + (var4 - (var5 - (var3 << 1) - var4)) - var6, 1, var6);
        }

        if (++Field70 >= 4) {
            Field70 = 0;
        }

    }

    public static void Field4(Graphics var0, int var1, int var2, int var3, int var4) {
        int var5 = var3 / 70 + 1;
        var0.setClip(var1, var2, var3, var4);

        int var6;
        for (var6 = 0; var6 < var5; ++var6) {
            var0.drawImage(Field29[2], var1 + var6 * 70, var2, 0);
        }

        var0.setColor(277044);
        var0.fillRect(var1, var2 + 25, var3, var4);
        var0.setClip(0, 0, Class105.Field13, Class105.Field14);

        for (var6 = 0; var6 < 3; ++var6) {
            var0.setColor(Field49[var6]);
            var0.drawRect(var1 + var6, var2 + var6, var3 - (var6 << 1) - 1, var4 - (var6 << 1) - 1);
            var0.fillRect(var1 + 3, var2 + 25, var3 - 6, 1);
        }

        var0.drawImage(Field29[0], var1 - 2, var2 - 2, 0);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 2, var1 + var3 + 2, var2 - 2, 24);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 6, var1 - 2, var2 + var4 + 2, 36);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 3, var1 + var3 + 2, var2 + var4 + 2, 40);
    }

    public static void Field1(Graphics var0, int var1, int var2, int var3, int var4, int var5, String var6, boolean var7, int var8) {
        int var9 = var3 / 70 + 1;
        var0.setClip(var1, var2, var3, var4);

        int var10;
        for (var10 = 0; var10 < var9; ++var10) {
            var0.drawImage(Field29[2], var1 + var10 * 70, var2, 0);
        }

        var0.setColor(277044);
        var0.fillRect(var1, var2 + 25, var3, var4);
        var0.setClip(0, 0, Class105.Field13, Class105.Field14);

        for (var10 = 0; var10 < 3; ++var10) {
            var0.setColor(Field49[var10]);
            var0.drawRect(var1 + var10, var2 + var10, var3 - (var10 << 1) - 1, var4 - (var10 << 1) - 1);
        }

        var0.fillRect(var1 + 3, var2 + 25, var3 - 6, 1);
        if (!var7) {
            var0.fillRect(var1 + 3, var2 + 25 + var5 + var8, var3 - 6, 1);
        } else {
            var0.fillRect(var1 + 3, var2 + 25 + var5 + var8, var3 - 6, 1);
            var0.fillRect(var1 + 3, var2 + var5 + var8 - 2, var3 - 6, 1);
        }

        Class21.Field10[0].Field1(var0, var6, var1 + var3 / 2, var2 + 8, 2);
        var0.drawImage(Field29[0], var1 - 2, var2 - 2, 0);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 2, var1 + var3 + 2, var2 - 2, 24);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 6, var1 - 2, var2 + var4 + 2, 36);
        var0.drawRegion(Field29[0], 0, 0, 18, 19, 3, var1 + var3 + 2, var2 + var4 + 2, 40);
    }

    public static void Field5(Graphics var0, int var1, int var2, int var3, int var4) {
        Class381.Field1(var0, (short) (var1 + 5500), var2, var3, var4);
    }

    public static void Field1(Graphics var0, int var1, int var2, int var3) {
        Class381.Field1(var0, (short) (var1 + 6500), var2, var3, 3);
    }

    public static void Field2(Graphics var0, int var1, int var2, int var3) {
        Class381.Field1(var0, (short) (var1 + 6500), var2, var3, 3);
    }

    public static Image Field2(byte[] var0) {
        return Image.createImage(var0, 0, var0.length);
    }

    public static int Field13(int var0) {
        return Field71.nextInt(var0);
    }

    public static int Field4(int var0, int var1) {
        return Field71.nextInt(2) == 0 ? var0 : var1;
    }

    public static String[] Field5(int var0, int var1) {
        try {
            return Field53[var0][var1];
        } catch (Exception var2) {
            var2.printStackTrace();
            return null;
        }
    }

    public static short[] Field6(int var0, int var1) {
        try {
            return Field54[var0][var1];
        } catch (Exception var2) {
            return null;
        }
    }

    public static Image Field9() {
        if (Field63 == null) {
            Class53.Field2("/main.sh");
            Field63 = Class53.Field1("waypoint");
            Class53.Field1();
        }

        return Field63;
    }

    public static Image Field1(Image var0) {
        try {
            int var1 = var0.getWidth();
            int var2 = var0.getHeight();
            int[] var3 = new int[var1 * var2];
            var0.getRGB(var3, 0, var1, 0, 0, var1, var2);
            for (int var4 = 0; var4 < var3.length; ++var4) {
                if (var3[var4] == -65315) {
                    var3[var4] = 16777215;
                }
            }
            return Image.createRGBImage(var3, var1, var2, true);
        } catch (Exception e) {
            return null;
        }
    }

    public static int Field14(int var0) {
        return Field71.nextInt(var0);
    }

    public static int Field1(int var0, int var1, int var2, int var3) {
        int var10000 = var0 - var2;
        var1 -= var3;
        var0 = var10000;
        if ((var0 = var10000 * var0 + var1 * var1) <= 0) {
            return 0;
        } else {
            var1 = (var0 + 1) / 2;

            do {
                var2 = var1;
                var1 = var1 / 2 + var0 / (var1 * 2);
            } while (Math.abs(var2 - var1) > 1);

            return var1;
        }
    }

    public static int Field15(int var0) {
        for (var0 = 0; var0 == 0; var0 = Field71.nextInt() % 3) {
        }

        return var0;
    }

    public static int Field2(int var0, int var1, int var2, int var3) {
        return Math.abs(var0 - var1) + Math.abs(var2 - var3);
    }
}
