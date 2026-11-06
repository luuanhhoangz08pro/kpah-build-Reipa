package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;
import main.lib.ServerManager;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Random;
import java.util.Vector;

public final class Class62 extends Class671 {
    public static String Field1 = "";
    public int Field2;
    public int Field3;
    private int Field110;
    private int Field111;
    public int Field4;
    public int Field5;
    private int[] Field112 = new int[]{-1, 2, 1, -2};
    private int[] Field113 = new int[]{-3, 2, -1, 1};
    private int Field114 = -1;
    public static int Field6;
    public static int Field7;
    private static int Field115;
    private static int Field116;
    private static int Field117;
    private static int Field118;
    public static int Field8;
    public static int Field9;
    private static int Field119;
    private static int Field120;
    private static boolean Field121;
    private static boolean Field122;
    public Vector Field10 = new Vector();
    public Vector Field11 = new Vector();
    public static Vector Field12 = new Vector();
    public Vector Field13 = new Vector();
    public int Field14 = 0;
    public Class582 Field15 = new Class582();
    public Class678 Field16;
    public boolean Field17 = true;
    public boolean Field18;
    public boolean Field19 = false;
    public static boolean Field20;
    public Vector Field21 = new Vector();
    public static Vector Field22 = new Vector();
    public Class384 Field23;
    public int Field24;
    public static int Field25;
    public static int Field26;
    private static int Field123;
    private static int Field124;
    public static Vector Field27 = new Vector();
    public Class261 Field28;
    private String[] Field125;
    private int[] Field126;
    private int[] Field127;
    private int[] Field128;
    private int[] Field129;
    private int[] Field130;
    private int[] Field131;
    public short Field29;
    public boolean Field30;
    private boolean Field132;
    public Class194 Field31;
    private Vector Field133;
    public static int Field32 = -1;
    public short Field33;
    public short Field34;
    private int Field134;
    public short Field35;
    public static byte Field36 = -1;
    public static Class384 Field37;
    public boolean Field38;
    private String[] Field135;
    public static Image Field39;
    public static Image Field40;
    public static Image[] Field41;
    public static Image Field42;
    public static Image Field43;
    public Class384 Field44;
    private int Field136;
    private int Field137;
    private static Vector Field138 = new Vector();
    public int Field45;
    private static long Field139 = -1L;
    public static int Field46 = 0;
    private static int Field140 = 0;
    public static int Field47 = -1;
    public static int Field48 = 0;
    private static Class678 Field141;
    public static Class678 Field49;
    public static byte Field50;
    public static byte Field51;
    public static byte Field52;
    public static byte Field53;
    public static int[] Field54;
    public static int[] Field55;
    public static short[] Field56;
    public static Image[] Field57;
    public static String[] Field58;
    public static String[] Field59;
    private static boolean Field142 = false;
    private static boolean Field143 = false;
    private static boolean Field144 = false;
    public static Vector Field60 = new Vector();
    public static Vector Field61;
    public static Vector Field62 = new Vector();
    public static Vector Field63 = new Vector();
    private static Class717[] Field145 = new Class717[1];
    static String[] Field64 = new String[]{"Thanh Long", "Hắc Hổ"};
    public static byte Field65 = 0;
    static Random Field66 = new Random(System.currentTimeMillis());
    private int Field146;
    private int Field147;
    private Class384 Field148;
    public static int Field67;
    public static int Field68;
    private Class384[] Field149;
    private long Field150;
    private int Field151;
    private int[] Field152;
    private int[] Field153;
    private static long Field154;
    public static short Field69 = 250;
    private int[] Field155;
    private int Field156;
    private int Field157;
    private static int[][] Field158 = new int[][]{{-90, 90, -90, 90}, {-90, 90, -90, 90}, {-90, 90, -90, 90}, {-90, 90, -90, 90}};
    private Vector Field159;
    private byte Field160;
    private short Field161;
    private short Field162;
    public static long Field70;
    private int[] Field163;
    public static boolean Field71;
    public static boolean Field72;
    private static boolean Field164;
    private static boolean Field165;
    private static boolean Field166;
    public static boolean Field73;
    private boolean Field167;
    public static long Field74;
    public static Class228 Field75;
    private int Field168;
    private long Field169;
    public static int Field76;
    private byte[] Field170;
    private byte[] Field171;
    public static boolean Field77;
    private int[] Field172;
    private boolean Field173;
    public static int Field78;
    private int Field174;
    private int[] Field175;
    private static int[] Field176;
    public Class472 Field79;
    public static byte Field80;
    public static byte Field81;
    public static byte Field82;
    private static int[] Field177;
    public short Field83;
    public boolean Field84;
    public static short[] Field85;
    public static short[][] Field86;
    private static short[] Field178;
    private static int Field179;
    public short Field87;
    public short Field88;
    public short Field89;
    public short Field90;
    private static int Field180;
    public static int Field91;
    private Vector Field181;
    private Vector Field182;
    private Vector Field183;
    public static int Field92;
    private static int Field184;
    private static int Field185;
    private static int Field186;
    private static int Field187;
    private static int Field188;
    private static int Field189;
    private static int Field190;
    private static int Field191;
    private Class384 Field192;
    private Class3 Field193;
    public static byte[][] Field93;
    public static byte Field94;
    public static byte Field95;
    private static boolean Field194;
    private int Field195;
    private Vector Field196;
    private Vector Field197;
    public Class32[] Field96;
    public Class32[] Field97;
    private static Class80 Field198;
    private Vector Field199;
    private Vector Field200;
    public static Class228 Field98;
    public static Class228 Field99;
    public static Class228 Field100;
    private static Vector Field201;
    private static Vector Field202;
    public static byte[][] Field101;
    public static int[][] Field102;

    static {
        byte[][] var10000 = new byte[][]{{0, 0, -48, 48}, {0, 0, -32, 32}, {0, 0, -16, 16}, new byte[4]};
        var10000 = new byte[][]{{48, -48, 0, 0}, {32, -32, 0, 0}, {16, -16, 0, 0}, new byte[4]};
        Field70 = System.currentTimeMillis();
        Field71 = false;
        Field75 = null;
        Field76 = 50;
        Field77 = false;
        Field176 = new int[]{6898216, 11897430, 14469298};
        Field81 = 0;
        Field82 = 1;
        Field177 = new int[]{3158321, 88080384, 2122, 2037000, 256};
        Field178 = new short[]{90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 102, 103, 104, 108, 109, 260, 261, 262, 263, 264, 265, 266, 267, 268, 269, 270, 271, 29, 30, 31, 30, 31, 72, 73, 74, 78, 79, 82, 83, 84, 88, 89};
        Field179 = -1;
        Field180 = 0;
        Field91 = 1;
        Field92 = 1000;
        Field201 = new Vector();
        Field202 = new Vector();
        Field101 = new byte[2][];
        Field102 = new int[2][];
    }

    public final void Field1() {
        Class106.Field5[2] = false;
        super.Field1();
        this.Field2();
    }

    public final void Field1(Class375 var1) {
        if (this.Field133.size() > 50) {
            this.Field133.removeElementAt(0);
            this.Field136 -= 18;
            this.Field137 -= 18;
        }

        this.Field133.addElement(var1);
        this.Field137 += 18;
    }

    private void Field22() {
        this.Field126 = new int[15];
        this.Field127 = new int[15];
        this.Field128 = new int[15];
        this.Field129 = new int[15];
        this.Field130 = new int[15];
        this.Field131 = new int[15];
        this.Field125 = new String[15];

        for (int var1 = 0; var1 < 15; ++var1) {
            this.Field130[var1] = -1;
        }

    }

    public final void Field1(String var1, int var2, int var3, int var4, int var5, int var6) {
        try {
            boolean var7 = false;
            if (Integer.parseInt(var1.substring(1)) == 2000000) {
                return;
            }
        } catch (Exception var9) {
        }

        int var10 = -1;

        for (int var8 = 0; var8 < 15; ++var8) {
            if (this.Field130[var8] == -1) {
                var10 = var8;
                break;
            }
        }

        if (var10 != -1) {
            this.Field125[var10] = var1.toLowerCase();
            this.Field126[var10] = var3;
            this.Field127[var10] = var4;
            this.Field128[var10] = var5 * (Field66.nextInt(2) == 1 ? -1 : 1);
            this.Field129[var10] = var6;
            this.Field130[var10] = 0;
            this.Field131[var10] = var2;
        }
    }

    private void Field23() {
        for (int var1 = 0; var1 < 15; ++var1) {
            if (this.Field130[var1] != -1) {
                int[] var10000 = this.Field130;
                var10000[var1] += Class809.Field4(this.Field129[var1]);
                if (this.Field130[var1] > 30) {
                    this.Field130[var1] = -1;
                }

                var10000 = this.Field126;
                var10000[var1] += this.Field128[var1];
                var10000 = this.Field127;
                var10000[var1] += this.Field129[var1];
            }
        }

    }

    public final void Field2() {
        this.Field31.Field1 = 2;
        this.Field31.Field2 = Class106.Field14 - 40;
        this.Field31.Field3 = Class106.Field13 - 4;
        if (this.Field149 == null) {
            this.Field149 = new Class384[5];

            for (int var1 = 0; var1 < 5; ++var1) {
                this.Field149[var1] = new Class384();
            }
        }

        this.Field149[0].Field1 = Class106.Field15 - 47;
        this.Field149[0].Field2 = Class106.Field14 - 19;
        this.Field149[1].Field1 = Class106.Field15 - 28;
        this.Field149[1].Field2 = Class106.Field14 - 19;
        this.Field149[2].Field1 = Class106.Field15 - 8;
        this.Field149[2].Field2 = Class106.Field14 - 20;
        this.Field149[3].Field1 = Class106.Field15 + 12;
        this.Field149[3].Field2 = Class106.Field14 - 19;
        this.Field149[4].Field1 = Class106.Field15 + 31;
        this.Field149[4].Field2 = Class106.Field14 - 19;
        this.Field5();
        this.Field6();
    }

    public Class62() {
        new Vector();
        this.Field28 = Class261.Field1();
        this.Field29 = -1;
        this.Field30 = false;
        this.Field31 = new Class194();
        this.Field133 = new Vector();
        this.Field33 = 1;
        this.Field34 = -1;
        this.Field134 = -1;
        this.Field35 = 5;
        this.Field38 = false;
        this.Field135 = null;
        this.Field136 = 0;
        this.Field137 = -18;
        this.Field45 = -1;
        this.Field151 = 10;
        this.Field152 = new int[]{0, 0, -20, 20};
        this.Field153 = new int[]{20, -20, 0, 0};
        this.Field155 = new int[]{4, 0, -4};
        this.Field157 = 0;
        this.Field159 = new Vector();
        this.Field160 = 0;
        this.Field161 = 0;
        this.Field162 = 0;
        this.Field163 = new int[]{1, 3, 5, 7, 9};
        this.Field168 = 1;
        System.currentTimeMillis();
        this.Field169 = 0L;
        this.Field170 = new byte[]{0, 0, -17, 17};
        this.Field171 = new byte[]{17, -17, 0, 0};
        this.Field172 = new int[]{0, 0, 0, 1, 0, 2, 0, 3, 0, 4};
        this.Field173 = false;
        this.Field175 = new int[]{16520709, 16499718, 396543, 1101907};
        this.Field79 = null;
        this.Field83 = -1;
        this.Field87 = 0;
        this.Field88 = 0;
        this.Field89 = 0;
        this.Field90 = 0;
        this.Field181 = new Vector();
        this.Field182 = new Vector();
        this.Field183 = new Vector();
        this.Field193 = new Class3();
        this.Field196 = new Vector();
        this.Field199 = new Vector();
        this.Field200 = new Vector();
        this.Field31 = new Class194();
        this.Field31.Field4 = Class671.Field109 + 2;
        this.Field31.Field5 = true;
        this.Field31.Field2(80);
        this.Field2();
        this.Field132 = false;
        this.Field22();
        this.Field5();
        this.Field146 = 45;
        this.Field147 = 50;
        if (this.Field147 < 30) {
            this.Field147 = 30;
        }

        super.Field103 = new Class86("", new Class197(this));
        super.Field105 = new Class86("", new Class196(this));
        this.Field157 = Class106.Field13 - 20;
    }

    public final void Field5() {
        if (Class455.Field9 != null) {
            if ((Field68 = Class106.Field14 / 5) > 100) {
                Field68 = 100;
            }

            this.Field148 = new Class384(Class106.Field15 + 50, Class106.Field14 - Class671.Field108 - Field68);
            if ((Field67 = Class106.Field13 - this.Field148.Field1 - 1) > 100) {
                Field67 = 100;
            }

            if (Class455.Field9 != null) {
                if (Field67 > Class455.Field9.getWidth()) {
                    Field67 = Class455.Field9.getWidth();
                }

                if (Field68 > Class455.Field9.getHeight()) {
                    Field68 = Class455.Field9.getHeight();
                }
            }

            this.Field148.Field1 = Class106.Field13 - Field67 - 1;
            this.Field148.Field2 = Class106.Field14 - Class671.Field108 - Field68;
        }
    }

    public final void Field6() {
        Field25 = Class106.Field13;
        Field26 = Class106.Field14;
        Field123 = Field25 >> 1;
        Field124 = Field26 >> 1;
        this.Field110 = (Field25 >> 4) + 2;
        this.Field111 = (Field26 >> 4) + 2;
        if (Field25 % 24 != 0) {
            ++this.Field110;
        }

        Field119 = (Class455.Field1 << 4) - Field25;
        Field120 = (Class455.Field2 << 4) - Field26;
        if (this.Field15 != null) {
            Field8 = Field6 = this.Field15.Field193 - Field123;
            Field9 = Field7 = this.Field15.Field194 - Field124;
        }

        if (Field8 < 0) {
            Field8 = 0;
        }

        if (Field8 > Field119) {
            Field8 = Field119;
        }

        if (Field9 < 0) {
            Field9 = 0;
        }

        if (Field9 > Field120) {
            Field9 = Field120;
        }

        this.Field2 = (Field8 >> 4) - 1;
        if (this.Field2 < 0) {
            this.Field2 = 0;
        }

        this.Field3 = Field9 >> 4;
        this.Field4 = this.Field2 + this.Field110;
        this.Field5 = this.Field3 + this.Field111;
        if (this.Field3 < 0) {
            this.Field3 = 0;
        }

        if (this.Field5 > Class455.Field2 - 1) {
            this.Field5 = Class455.Field2 - 1;
        }

        Field122 = false;
        Field121 = false;
        if (Class455.Field3 < Field25 + 32) {
            Field121 = true;
            Field8 = -(Field25 - Class455.Field3) >> 1;
        }

        if (Class455.Field4 < Field26) {
            Field122 = true;
            Field9 = -(Field26 - Class455.Field4) >> 1;
        }

    }

    public final void Field7() {
        if (Field8 != Field6 && !Field121) {
            Field115 = Field6 - Field8 << 2;
            Field117 += Field115;
            Field8 += Field117 >> 4;
            Field117 &= 15;
            if (Field8 < 0) {
                Field8 = 0;
            }

            if (Field8 > Field119) {
                Field8 = Field119;
            }
        }

        if (Field9 != Field7 && !Field122) {
            Field116 = Field7 - Field9 << 2;
            Field118 += Field116;
            Field9 += Field118 >> 4;
            Field118 &= 15;
            if (Field9 < 0) {
                Field9 = 0;
            }

            if (Field9 > Field120) {
                Field9 = Field120;
            }
        }

        if (this.Field114 >= 0) {
            Field8 += this.Field112[this.Field114];
            Field9 += this.Field113[this.Field114];
            ++this.Field114;
            if (this.Field114 == 4) {
                this.Field114 = -1;
            }

            if (Field8 < 0) {
                Field8 = 0;
            }

            if (Field8 > Field119) {
                Field8 = Field119;
            }

            if (Field9 < 0) {
                Field9 = 0;
            }

            if (Field9 > Field120) {
                Field9 = Field120;
            }
        }

        this.Field2 = (Field8 >> 4) - 1;
        if (this.Field2 < 0) {
            this.Field2 = 0;
        }

        this.Field3 = Field9 >> 4;
        this.Field4 = this.Field2 + this.Field110;
        if (this.Field4 > Class455.Field1) {
            this.Field4 = Class455.Field1;
        }

        if (this.Field5 > Class455.Field2) {
            this.Field5 = Class455.Field2;
        }

        this.Field5 = this.Field3 + this.Field111;
        if (this.Field3 < 0) {
            this.Field3 = 0;
        }

        if (this.Field5 > Class455.Field2 - 1) {
            this.Field5 = Class455.Field2 - 1;
        }

    }

    public final void Field4() {
        int var1;
        Class269 var2;
        for (var1 = 0; var1 < this.Field200.size(); ++var1) {
            if ((var2 = (Class269) this.Field200.elementAt(var1)) != null) {
                var2.Field1();
                if (var2.Field2) {
                    this.Field200.removeElementAt(var1);
                }
            }
        }

        Class62 var3 = this;

        for (var1 = 0; var1 < var3.Field199.size(); ++var1) {
            Class354 var5;
            if ((var5 = (Class354) var3.Field199.elementAt(var1)) != null) {
                var5.Field1();
                if (var5.Field2) {
                    var3.Field199.removeElement(var5);
                }
            }
        }

        if (--Field78 < 0) {
            Field78 = 0;
        }

        var1 = Field138.size();

        int var6;
        for (var6 = 0; var6 < var1; ++var6) {
            ((Class177) Field138.elementAt(var6)).Field1();
            if (((Class177) Field138.elementAt(var6)).Field10) {
                Field138.removeElementAt(var6);
            }
        }

        if (this.Field79 != null) {
            Class472 var8;
            if ((var8 = this.Field79).Field1 + Class21.Field10[0].Field1(var8.Field5) + 10 < 0) {
                var8.Field3 -= 2;
            }

            if (var8.Field3 < -18) {
                var8.Field4 = true;
            }

            var8.Field1 -= 2;
            if (this.Field79.Field4) {
                this.Field79 = null;
            }
        }

        if (Field198 != null) {
            Field198.Field1();
            if (Field198.Field1) {
                Field198 = null;
                Field141 = null;
            }
        }

        if (this.Field193 != null) {
            Class3 var9 = this.Field193;
            if (Class106.Field12 % 2 == 0) {
                --var9.Field3;
                if (var9.Field3 < 0) {
                    var9.Field3 = 8;
                }
            }
        }

        this.Field7();
        Field6 = this.Field15.Field193 - Field123 + this.Field152[this.Field15.Field12];
        Field7 = this.Field15.Field194 - Field124 + this.Field153[this.Field15.Field12] - 20;
        if (Class455.Field1 >= Field67 || Class455.Field2 >= Field68) {
            if (Field185 != Field184) {
                Field187 = Field184 - Field185 << 2;
                Field186 += Field187;
                Field185 += Field186 >> 4;
                Field186 &= 15;
            }

            if (Field189 != Field188) {
                Field191 = Field188 - Field189 << 2;
                Field190 += Field191;
                Field189 += Field190 >> 4;
                Field190 &= 15;
            }
        }

        for (var6 = Field12.size() - 1; var6 >= 0; --var6) {
            Class51 var7;
            (var7 = (Class51) Field12.elementAt(var6)).Field1();
            if (var7.Field1) {
                Field12.removeElementAt(var6);
            }
        }

        for (var6 = this.Field13.size() - 1; var6 >= 0; --var6) {
            ((Class51) this.Field13.elementAt(var6)).Field1();
        }

        for (var1 = this.Field11.size() - 1; var1 >= 0; --var1) {
            Class678 var14;
            if ((var14 = (Class678) this.Field11.elementAt(var1)) != null && var14.Field203 == 1) {
                var14.Field2();
            }
        }

        Field202.removeAllElements();
        Vector var10 = new Vector();

        Class678 var11;
        for (var6 = this.Field10.size() - 1; var6 >= 0; --var6) {
            if ((var11 = (Class678) this.Field10.elementAt(var6)).d_()) {
                this.Field2(var11);
            }

            if (var11.g_() && var11.Field187) {
                var10.addElement(var11);
            }

            if (var11.Field188 != 2 && var11.Field188 != 10 && var11.Field188 != 11 && var11.Field188 != 12) {
                var11.Field2();
                if (!Class809.Field1((Class678) var11, (Class678) this.Field15) && var11 != Field49 && var11.Field188 != 127 && var11.Field188 != 0 && var11.Field212 == -1) {
                    var11.Field187 = true;
                }

                if (var11.Field187 && var11.Field212 == -1) {
                    if (this.Field16 == var11) {
                        this.Field16 = null;
                    }

                    if (!Field142 && !Field143 && !Field144 && var11.Field188 != 100) {
                        if (var11.Field188 == 0) {
                            var11.Field211 = true;
                        }

                        var10.addElement(var11);
                    }
                }
            } else {
                var11.Field2();
            }
        }

        if (Field49 != null) {
            Field49.Field2();
        }

        Class809.Field1(this.Field10);
        if (Class106.Field12 % 10 == 0) {
            this.Field16 = this.Field26();
        }

        if (this.Field16 != null && this.Field16.Field188 == 100) {
            this.Field16 = null;
        }

        Class73.Field1.Field1();
        Class73.Field2.Field1();
        this.Field23();
        if (this.Field151 > 0) {
            --this.Field151;
            if (this.Field151 == 0) {
                this.Field150 = System.currentTimeMillis();
                this.Field28.Field4();
            }
        }

        if (this.Field30) {
            this.Field31.Field4();
        }

        if (this.Field45 != -1 && Field139 != -1L && System.currentTimeMillis() > Field139) {
            this.Field45 = -1;
            Field139 = -1L;
        }

        if (Field140 > 0 && (Field140 -= Class811.Field42 / 10) < 0) {
            Field140 = 0;
        }

        if ((Class455.Field1 >= Field67 || Class455.Field2 >= Field68) && System.currentTimeMillis() / 100L > 20L) {
            Field188 = this.Field15.Field193 / 16;
            Field184 = this.Field15.Field194 / 16;
            if (Field188 > Class455.Field1 - Field67 / 2) {
                Field188 = Class455.Field1 - Field67;
            } else if (Field188 < Field67 / 2) {
                Field188 = 0;
            } else {
                Field188 -= Field67 / 2;
            }

            if (Field184 < Field68 / 2) {
                Field184 = 0;
            } else {
                Field184 -= Field68 / 2;
            }

            if (Field184 > Class455.Field2 - Field68) {
                Field184 = Class455.Field2 - Field68;
            }
        }

        try {
            if (this.Field44 != null && Field48 == 2) {
                this.Field30();
                Class106.Field7();
            }
        } catch (Exception var4) {
            this.Field15.Field49 = null;
            this.Field15.Field48 = 0;
        }

        int var13;
        if (Field60.size() > 0) {
            Class376.Field2();
            var2 = null;

            for (var13 = 0; var13 < Field60.size(); ++var13) {
                ((Class376) Field60.elementAt(var13)).Field1();
            }
        }

        if (Field61 != null) {
            for (var6 = 0; var6 < Field61.size(); ++var6) {
                ((Class69) Field61.elementAt(var6)).Field1();
            }
        }

        for (var6 = 0; var6 < var10.size(); ++var6) {
            this.Field10.removeElement(var10.elementAt(var6));
        }

        if (this.Field197 != null && this.Field197.size() > 0) {
            this.Field157 -= 4;
            String var12 = (String) this.Field197.elementAt(0);
            if (this.Field157 + Class21.Field8.Field1(var12) < 0) {
                this.Field197.removeElementAt(0);
                this.Field157 = Class106.Field13 - 20;
            }
        }

        Field24();
        Field25();
        if (this.Field96 != null) {
            for (var6 = 0; var6 < 1; ++var6) {
                if (this.Field96[0].Field1 > 0) {
                    Class32 var15 = this.Field96[0];
                    if (System.currentTimeMillis() / 1000L - (long) var15.Field2 >= (long) var15.Field1) {
                        var15.Field1 = 0;
                    }
                }
            }
        }

        if (this.Field24 > 0) {
            --this.Field24;
        } else {
            this.Field24 = 0;
        }

        if (Class455.Field13 && this.Field83 == 29) {
            if (this.Field15.Field193 >= this.Field87 - 16 && this.Field15.Field193 <= this.Field89 + 40 && this.Field15.Field194 >= this.Field88 - 16 && this.Field15.Field194 <= this.Field90 + 40) {
                this.Field16 = this.Field1((Class114) this.Field15);
            } else {
                var6 = this.Field10.size();
                var3 = null;

                for (var1 = 0; var1 < var6; ++var1) {
                    if ((var11 = (Class678) this.Field10.elementAt(var1)).Field188 == 10) {
                        var11.Field206 = false;
                    }
                }
            }
        }

        if (Field62.size() > 0) {
            ((Class153) Field62.elementAt(0)).Field1();
        }

        if (Field63.size() > 30) {
            Field63.removeElementAt(0);
        }

        if (this.Field15.Field204 != 3 && Field71 && Class106.Field17 instanceof Class62 && Class106.Field23 != null && !this.Field15.Field211 && Class455.Field10 != 0 && Class455.Field10 != 201 && Class455.Field10 != 70 && Class455.Field10 != 80) {
            Class106.Field23 = null;
        }

        if (!Field71) {
            this.Field167 = false;
        } else if (Field154 - System.currentTimeMillis() / 1000L <= 0L) {
            this.Field2((int) this.Field15.Field193, (int) this.Field15.Field194);
            Field154 = System.currentTimeMillis() / 1000L + 10L;
        }

        if (Class455.Field10 == 0 || Class455.Field10 == 70 || Class455.Field10 == 80) {
            Field71 = false;
        }

        if (Class106.Field12 % 200 == 0) {
            Class357.Field32();
        }

        if (Field194) {
            Field194 = false;
            this.Field15.Field74 = this.Field15.Field193;
            this.Field15.Field75 = this.Field15.Field194;
            this.Field15.Field46 = this.Field15.Field193;
            this.Field15.Field47 = this.Field15.Field194;
            ++this.Field156;
            if (this.Field156 > this.Field155.length - 1) {
                this.Field156 = 0;
            }

            var6 = Class455.Field1 / 2 + this.Field155[this.Field156];
            var13 = Class455.Field2 / 2 + this.Field155[this.Field156];
            this.Field15.Field49 = this.Field2(this.Field15.Field193 / 16, this.Field15.Field194 / 16, var6, var13);
            this.Field15.Field48 = 0;
            Field48 = this.Field195;
        }

    }

    private Class678 Field1(Class114 var1) {
        Class678 var2 = null;
        if (Class455.Field13) {
            for (int var3 = 0; var3 < this.Field10.size(); ++var3) {
                Class678 var4;
                if ((var4 = (Class678) this.Field10.elementAt(var3)).Field188 == 10) {
                    if (var1.Field193 >= var4.Field193 + 2 && var1.Field193 <= var4.Field193 + 30 && var1.Field194 >= var4.Field194 && var1.Field194 + 2 <= var4.Field194 + 30) {
                        var4.Field206 = true;
                        var2 = var4;
                    } else {
                        var4.Field206 = false;
                    }
                }
            }
        }

        return var2;
    }

    private static void Field24() {
        Enumeration var0 = Class379.Field3.keys();

        while (var0.hasMoreElements()) {
            String var1 = (String) var0.nextElement();
            Class176 var2;
            if (!(var2 = (Class176) Class379.Field3.get(var1)).Field3 && System.currentTimeMillis() / 1000L - (long) var2.Field2 > 120L) {
                Class379.Field3.remove(var1);
            }
        }

    }

    public static void Field1(byte[] var0, byte var1, byte var2) {
        Class186 var4;
        if ((var4 = (Class186) ((Hashtable) Class811.Field47.elementAt(var1)).get(String.valueOf(var2))) != null) {
            var4.Field1(var0, var1);
        }

    }

    private static void Field25() {
        for (int var0 = Class811.Field47.size() - 1; var0 >= 0; --var0) {
            Hashtable var1;
            Enumeration var2 = (var1 = (Hashtable) Class811.Field47.elementAt(var0)).keys();

            while (var2.hasMoreElements()) {
                String var3 = (String) var2.nextElement();
                Class186 var4 = (Class186) var1.get(var3);
                if (System.currentTimeMillis() / 1000L - (long) var4.Field1 > 60L) {
                    var1.remove(var3);
                }
            }
        }

    }

    private Class678 Field26() {
        int var1 = this.Field15.Field193 + Field158[this.Field15.Field12][0];
        int var2 = this.Field15.Field193 + Field158[this.Field15.Field12][1];
        int var3 = this.Field15.Field194 + Field158[this.Field15.Field12][2];
        int var4 = this.Field15.Field194 + Field158[this.Field15.Field12][3];
        int var5 = 10000;
        int var6 = -1;
        this.Field159.removeAllElements();
        int var7 = this.Field10.size();
        Class678 var8 = null;

        int var9;
        for (var9 = 0; var9 < var7; ++var9) {
            if ((var8 = (Class678) this.Field10.elementAt(var9)).Field193 > var1 && var8.Field193 < var2 && var8.Field194 > var3 && var8.Field194 < var4) {
                if (var8.Field188 != 127 && var8.Field218 && (var8.Field188 != 0 || var8.Field189 != this.Field15.Field189) && var8.Field188 != 10 && var8.Field188 != 11 && var8.Field188 != 12 && (!Field71 || Class106.Field35.Field6 || Class455.Field10 == 0 || Class455.Field10 == 201 || Class455.Field10 == 70 || Class455.Field10 == 80 || Class455.Field13 || !var8.Field3() && var8.Field188 != 126 && var8.Field188 != 2 && var8.Field188 != 0)) {
                    if ((var8.Field188 != 1 || var8.Field204 != 8) && (!Field71 || var8.Field204 != 3 && !var8.b_())) {
                        if (Field65 == 1) {
                            boolean var10 = false;
                            if (var8.Field188 == 0 && (!var8.Field207 || var8.d_()) || var8.Field188 != 1 && var8.Field188 == 0 && !var8.Field207) {
                                continue;
                            }
                        } else if (Field65 == 2) {
                            if (!var8.d_()) {
                                continue;
                            }
                        } else if (Field65 == 3) {
                            if (var8.Field188 == 0 && var8.Field190 == this.Field15.Field190 || var8.d_()) {
                                continue;
                            }
                        } else if (Field65 == 4 && (var8.Field188 == 0 && var8.Field201 == this.Field15.Field201 || var8.d_())) {
                            continue;
                        }

                        this.Field159.addElement(var8);
                        int var11 = Class809.Field4(this.Field15.Field193 - var8.Field193) + Class809.Field4(this.Field15.Field194 - var8.Field194);
                        if (var8.Field188 == 3 || var8.Field188 == 4) {
                            var11 <<= 1;
                        }

                        if (var11 < var5) {
                            var5 = var11;
                            var6 = var9;
                        }
                    }
                } else if ((Field71 || Field73) && var8.Field188 == 2) {
                    Field1((Class678) this.Field15, (String) "Bạn hãy tắt auto trước khi focus", 100);
                }
            }
        }

        if (var6 == -1) {
            return null;
        } else {
            if (Field71 && Class106.Field35.Field6) {
                for (var9 = 0; var9 < this.Field159.size(); ++var9) {
                    Class678 var12;
                    if ((var12 = (Class678) this.Field159.elementAt(var9)) != null && var12.Field207) {
                        return var12;
                    }
                }
            }

            if (this.Field16 == null && var6 < this.Field10.size()) {
                return (Class678) this.Field10.elementAt(var6);
            } else if (!Class106.Field1.hasPointerEvents() && var6 < this.Field10.size()) {
                if (this.Field159.contains(this.Field16)) {
                    return this.Field16;
                } else {
                    return (Class678) this.Field10.elementAt(var6);
                }
            } else {
                if (Class809.Field1(this.Field15.Field193, this.Field15.Field194, this.Field16.Field193, this.Field16.Field194) > Class106.Field13 / 2) {
                    this.Field16 = null;
                }

                return this.Field16;
            }
        }
    }

    private Class678 Field6(int var1) {
        for (int var2 = 0; var2 < this.Field10.size(); ++var2) {
            Class678 var3;
            if ((var3 = (Class678) this.Field10.elementAt(var2)) != null && var3.Field188 == 0 && var3.Field189 == var1) {
                return var3;
            }
        }

        return null;
    }

    public final void Field1(boolean var1) {
        if (this.Field16 == null) {
            this.Field16 = this.Field26();
            if (this.Field16 != null && this.Field16.Field188 == 100) {
                this.Field16 = null;
            }

        } else {
            if (var1 && !this.Field16.Field207 && Field71 && Field65 == 1) {
                this.Field16 = this.Field26();
                if (this.Field16 != null && this.Field16.Field207) {
                    return;
                }
            }

            int var2;
            if ((var2 = this.Field159.indexOf(this.Field16) + 1) >= this.Field159.size() || var2 < 0) {
                var2 = 0;
            }

            if (this.Field159.size() > 0) {
                this.Field16 = (Class678) this.Field159.elementAt(var2);
            }

            if (this.Field16 != null && this.Field16.Field188 == 100) {
                this.Field16 = null;
            }

        }
    }

    public static void Field1(Class678 var0, String var1, int var2) {
        var0.Field209 = new Class577(var2, var1, 1);
        var0.Field209.Field1(var0.Field193, var0.Field194 - var0.Field195);
    }

    public final void Field1(short var1) {
        if (this.Field35 != -1) {
            var1 = this.Field35;
        } else {
            this.Field34 = var1;
        }

        int var2 = this.Field10.size();
        Class678 var3 = null;

        for (int var4 = 0; var4 < var2; ++var4) {
            if ((var3 = (Class678) this.Field10.elementAt(var4)) instanceof Class260 && ((Class260) var3).Field1 == var1) {
                this.Field44 = new Class384(var3.Field193, var3.Field194);
                return;
            }
        }

    }

    private void Field4(Graphics var1) {
        for (int var2 = 0; var2 < Field202.size(); ++var2) {
            Class384 var3 = (Class384) Field202.elementAt(var2);
            this.Field1((Graphics) var1, (Class384) var3, var3.Field7);
        }

    }

    private void Field27() {
        Class106.Field2(2);
        Class106.Field2(4);
        Class106.Field2(6);
        Class106.Field2(8);
        boolean var1 = false;
        boolean var2 = false;
        short var3 = this.Field15.Field193;
        short var4 = this.Field15.Field194;
        short var5 = this.Field15.Field12;
        byte var6 = 0;
        byte var7 = 0;
        short var8 = this.Field15.Field17;
        if (Class106.Field5[2]) {
            label165:
            {
                this.Field15.Field186 = false;
                this.Field28();
                Field71 = false;
                var7 = -16;
                if (Field49 == null || this.Field15.Field194 > Field49.Field194 + 40) {
                    var1 = true;
                    var2 = true;
                }

                this.Field15.Field12 = 1;
                this.Field161 = this.Field15.Field193;
                this.Field162 = (short) (this.Field15.Field194 - var8);

                try {
                    if (!Class455.Field1(this.Field161, this.Field162, 2) && !this.Field1((int) this.Field161, (int) this.Field162)) {
                        break label165;
                    }

                    this.Field162 = this.Field15.Field194;
                    if (this.Field15.Field3(0, -8)) {
                        this.Field15.Field161 = false;
                        return;
                    }
                } catch (Exception var12) {
                    this.Field162 = this.Field15.Field194;
                    var12.printStackTrace();
                    break label165;
                }

                var1 = false;
            }
        } else if (Class106.Field5[8]) {
            label153:
            {
                this.Field15.Field186 = false;
                this.Field28();
                Field71 = false;
                var7 = 16;
                var1 = true;
                var2 = true;
                this.Field15.Field12 = 0;
                this.Field161 = this.Field15.Field193;
                this.Field162 = (short) (this.Field15.Field194 + var8);

                try {
                    if (!Class455.Field1(this.Field161, this.Field162, 2) && !this.Field1((int) this.Field161, (int) this.Field162)) {
                        break label153;
                    }

                    this.Field162 = this.Field15.Field194;
                    if (this.Field15.Field3(0, 8)) {
                        this.Field15.Field161 = false;
                        return;
                    }
                } catch (Exception var11) {
                    this.Field162 = this.Field15.Field194;
                    var11.printStackTrace();
                    break label153;
                }

                var1 = false;
            }
        } else if (Class106.Field5[4]) {
            label155:
            {
                this.Field15.Field186 = false;
                this.Field28();
                Field71 = false;
                var6 = -16;
                var1 = true;
                var2 = true;
                this.Field15.Field12 = 2;
                this.Field161 = (short) (this.Field15.Field193 - var8);
                this.Field162 = this.Field15.Field194;

                try {
                    if (!Class455.Field1(this.Field161, this.Field162, 2) && !this.Field1((int) this.Field161, (int) this.Field162)) {
                        break label155;
                    }

                    this.Field161 = this.Field15.Field193;
                    if (this.Field15.Field3(-8, 0)) {
                        this.Field15.Field161 = false;
                        return;
                    }
                } catch (Exception var10) {
                    this.Field161 = this.Field15.Field193;
                    var10.printStackTrace();
                    break label155;
                }

                var1 = false;
            }
        } else if (Class106.Field5[6]) {
            label157:
            {
                this.Field15.Field186 = false;
                this.Field28();
                Field71 = false;
                var6 = 16;
                var1 = true;
                var2 = true;
                this.Field15.Field12 = 3;
                this.Field162 = this.Field15.Field194;
                this.Field161 = (short) (this.Field15.Field193 + var8);

                try {
                    if (!Class455.Field1(this.Field161, this.Field162, 2) && !this.Field1((int) this.Field161, (int) this.Field162)) {
                        break label157;
                    }

                    this.Field161 = this.Field15.Field193;
                    if (this.Field15.Field3(8, 0)) {
                        this.Field15.Field161 = false;
                        return;
                    }
                } catch (Exception var9) {
                    this.Field161 = this.Field15.Field193;
                    var9.printStackTrace();
                    break label157;
                }

                var1 = false;
            }
        }

        if (this.Field15.Field8()) {
            if (!var2 || !this.Field1((int) (var3 + var6), (int) (var4 + var7), (int) var5)) {
                if (var1) {
                    if (this.Field161 < 0) {
                        this.Field161 = this.Field15.Field193;
                    }

                    if (this.Field162 < 0) {
                        this.Field162 = this.Field15.Field194;
                    }

                    if (this.Field161 > Class455.Field1 << 4) {
                        this.Field161 = this.Field15.Field193;
                    }

                    if (this.Field162 > Class455.Field2 << 4) {
                        this.Field161 = this.Field15.Field194;
                    }

                    this.Field15.Field2(this.Field161, this.Field162);
                    if (Field72 && Field65 == 1) {
                        Class106.Field19.Field15.Field59 = this.Field161;
                        Class106.Field19.Field15.Field60 = this.Field162;
                    }

                    this.Field15.Field161 = false;
                    ++this.Field160;
                }

                if (System.currentTimeMillis() - Field70 >= 0L && !this.Field15.Field186) {
                    Field70 = System.currentTimeMillis() + (long) Field69;
                    this.Field28.Field8(this.Field161, this.Field162);
                }

            }
        }
    }

    public final boolean Field1(int var1, int var2) {
        if (this.Field11.size() == 0) {
            return false;
        } else {
            int var3 = this.Field11.size();
            Class678 var4 = null;

            for (int var5 = 0; var5 < var3; ++var5) {
                if ((var4 = (Class678) this.Field11.elementAt(var5)) != null) {
                    Class742 var7 = (Class742) var4;
                    if (var1 >= var7.Field193 - var7.Field196 / 2 + 10 && var1 <= var7.Field193 + var7.Field196 / 2 - 10 && var2 >= var7.Field194 - var7.Field195 * 3 / 4 - 30 && var2 <= var7.Field194 - 40) {
                        return true;
                    }
                }
            }

            return false;
        }
    }

    private void Field28() {
        if (this.Field83 == 17 && this.Field15.Field141) {
            this.Field16 = null;
            this.Field174 = 0;
        }

    }

    public final void Field3() {
        if (this.Field30 && Class106.Field7) {
            switch (Class106.Field9()) {
                case 0:
                    Class106.Field5();
                    Class106.Field6();
                    this.Field30 = false;
                    Class106.Field7 = false;
                    return;
                case 1:
                    String var1 = this.Field31.Field5();
                    this.Field31.Field1("");
                    this.Field8(var1);
                    Class106.Field7 = false;
                    return;
                case 2:
                    this.Field31.Field1();
                    Class106.Field7 = false;
                    return;
            }
        }

        if (Class106.Field3[11]) {
            Field77 = !Field77;
        }

        boolean var10000;
        int var3;
        label304:
        {
            if (Class455.Field10 == 105) {
                String[] var2 = new String[]{"1Cháu của ta", "1Nay con đã lớn", "1đã đến lúc con phải được học hỏi nhiều hơn", "1phải trải nghiệm nhiều hơn từ quê hương đất nước", "1và có nhiều điều để con phải học hỏi nơi biết bao đấng anh hào, ẩn sỹ.", "1Năm xưa ta có người anh em kết nghĩa là Hai Minh", "1ông ấy giờ đang là trưởng làng của làng này.", "1con hãy đi xuống phương Nam và tìm gặp người này", "1ông ấy sẽ giúp con gia nhập làng nghĩa sĩ này", "1Con hãy cố gắng để trưởng thành, để có thể giúp được quê hương", "1để có được sự nghiệp riêng và để tìm được nguồn gốc và cha mẹ của con…", "1Hãy lên đường đi", "1..nơi đây ta luôn dõi theo bước chân của con", "0Vâng! thưa nội con đi", "1Uhm, chúc con lên đường bình an."};
                if (this.Field16 != null && this.Field16 instanceof Class260 || Class106.Field23 != null) {
                    Class106.Field5[2] = false;
                    if (Class809.Field4(this.Field15.Field194 - this.Field16.Field194) <= 32) {
                        if (this.Field134 == -1) {
                            Class106.Field3[5] = true;
                        }

                        int var4;
                        if (Class106.Field7) {
                            Class106.Field7 = false;
                            var3 = Field8 + Class106.Field10;
                            var4 = Field9 + Class106.Field11;
                            if (Class809.Field4(this.Field16.Field193 - var3) < 20 && Class809.Field4(this.Field16.Field194 - 20 - var4) < 40) {
                                Class106.Field3[5] = true;
                            }
                        }

                        if (Class106.Field2(5) && this.Field134 < var2.length) {
                            ++this.Field134;
                            if (this.Field134 >= var2.length) {
                                this.Field15.Field204 = 0;
                                Random var8 = new Random(System.currentTimeMillis());
                                var4 = 13 + var8.nextInt() % 5;
                                int var5 = 11 + var8.nextInt() % 5;
                                Class261.Field1().Field2(0, var4, var5);
                                Class106.Field5[2] = false;
                                Class106.Field2("Chuyển màn..", true);
                            } else {
                                this.Field15.Field209 = null;
                                this.Field16.Field209 = null;
                                if (var2[this.Field134].startsWith("1")) {
                                    Field1((Class678) this.Field16, (String) var2[this.Field134].substring(1), 500);
                                } else {
                                    Field1((Class678) this.Field15, (String) var2[this.Field134].substring(1), 700);
                                }
                            }
                        }

                        var10000 = true;
                        break label304;
                    }
                }

                Class106.Field5[2] = true;
                this.Field134 = -1;
                this.Field27();
            }

            var10000 = false;
        }

        if (!var10000) {
            if (!this.Field30) {
                if (Field75 != null && Field75.Field18) {
                    Field75.Field1(this.Field15, this.Field16);
                } else {
                    boolean var6 = false;
                    int var7;
                    if (Field56 != null) {
                        for (var7 = 0; var7 < Field56.length; ++var7) {
                            if (Field56[var7] == this.Field15.Field189 && (long) Field54[var7] - (System.currentTimeMillis() / 1L - (long) Field55[var7]) >= 0L) {
                                var6 = true;
                            }
                        }
                    }

                    if (Class106.Field1.hasPointerEvents() && !var6) {
                        this.Field34();
                    }

                    super.Field3();
                    if (this.Field15.Field61) {
                        this.Field15.Field61 = false;
                        this.Field15.Field186 = false;
                        this.Field2((int) this.Field15.Field193, (int) this.Field15.Field194);
                    }

                    if (Class106.Field2(10)) {
                        this.Field31();
                        Class106.Field5();
                    } else if (Class106.Field2(11)) {
                        Vector var10 = new Vector();
                        var10.addElement(new Class86("Tiện ích", new Class110(1)));
                        var10.addElement(new Class86("Khác", new Class110(2)));
                        Class106.Field21.Field1(var10, 3);
                    } else {
                        if (Field71) {
                            if (this.Field45 != -1 && Field139 - System.currentTimeMillis() / 1L > 0L) {
                                Field164 = true;
                            } else {
                                Field164 = false;
                            }
                        }

                        if (this.Field15.Field204 != 3 && (Field71 || Field73) && !this.Field15.Field211 && Class455.Field10 != 0 && Class455.Field10 != 200 && Class455.Field10 != 70 && Class455.Field10 != 80 && !Class455.Field13) {
                            if (Field73 && (Class106.Field35.Field7 || Class106.Field35.Field8) && Field74 - System.currentTimeMillis() / 1L <= 0L) {
                                var7 = this.Field15.Field4 * 100 / this.Field15.Field5;
                                var3 = this.Field15.Field130 * 100 / this.Field15.Field129;
                                if (var7 < Class410.Field1 && this.Field15.Field4 < this.Field15.Field5) {
                                    Field165 = true;
                                }

                                if (var3 < Class410.Field2 && this.Field15.Field130 < this.Field15.Field129) {
                                    Field166 = true;
                                }

                                if (var7 >= Class410.Field1) {
                                    Field165 = false;
                                }

                                if (var3 >= Class410.Field2) {
                                    Field166 = false;
                                }

                                if (Field165 && !this.Field15.Field205) {
                                    this.Field5(7, Field46);
                                }

                                if (Field166 && !this.Field15.Field205) {
                                    this.Field5(9, Field46);
                                }

                                Field74 = System.currentTimeMillis() / 1L + 1L;
                            }

                            if (Field71 && (Class106.Field35.Field6 || Class106.Field35.Field8) && (long) Class410.Field3 - System.currentTimeMillis() / 100L <= 0L) {
                                if (this.Field15.Field141) {
                                    if (this.Field16 != null && this.Field16.Field188 != 2 && this.Field16.Field188 != 0 && this.Field16.Field188 != 126) {
                                        Class106.Field3[5] = true;
                                    } else {
                                        this.Field1(false);
                                    }
                                } else {
                                    if (this.Field16 != null && this.Field16.Field188 != 2 && this.Field16.Field188 != 126) {
                                        boolean var9 = false;
                                        if (this.Field16.Field188 == 0 && !this.Field16.Field207) {
                                            this.Field1(false);
                                            var9 = true;
                                        }

                                        if (!var9) {
                                            Class106.Field3[this.Field168] = true;
                                            this.Field168 += 2;
                                            if (this.Field168 > 5) {
                                                this.Field168 = 1;
                                            }
                                        }
                                    } else {
                                        this.Field1(false);
                                    }

                                    if (!Field164) {
                                        if (this.Field15.Field93 != 2) {
                                            this.Field5(1, 1);
                                            this.Field5(3, 1);
                                            this.Field5(5, 1);
                                        } else if (!this.Field29()) {
                                            this.Field5(1, 1);
                                            this.Field5(3, 1);
                                            this.Field5(5, 1);
                                        }
                                    }
                                }

                                Class410.Field3 = (int) (System.currentTimeMillis() / 100L + 10L);
                            }

                            if (Class106.Field3[7]) {
                                Class106.Field3[7] = false;
                                this.Field5(7, Field46);
                            }

                            if (Class106.Field3[9]) {
                                Class106.Field3[9] = false;
                                this.Field5(9, Field46);
                            }
                        }

                        for (var7 = 0; var7 < this.Field163.length; ++var7) {
                            if (Class106.Field2(this.Field163[var7])) {
                                if (!this.Field15.Field205) {
                                    this.Field5(this.Field163[var7], Field46);
                                }
                            }
                        }

                        if (Class106.Field21.Field1) {
                            Class106.Field3[5] = false;
                        } else if ((Class106.Field2(2) || Class106.Field2(4) || Class106.Field2(6) || Class106.Field2(8)) && this.Field15.Field204 == 3) {
                            this.Field15.Field186 = false;
                        } else {
                            if ((this.Field15.Field204 == 1 || this.Field15.Field204 == 0 || this.Field15.Field204 == 4) && !var6) {
                                this.Field27();
                            }

                        }
                    }
                }
            }
        }
    }

    private boolean Field29() {
        byte[] var1 = new byte[]{1, 3, 5};

        for (int var2 = 0; var2 < var1.length; ++var2) {
            Class250 var3 = Class582.Field1[1][this.Field172[var1[var2]]];
            if (this.Field15.Field93 == 2 && var3.Field2() == 6) {
                return true;
            }
        }

        return false;
    }

    private void Field30() {
        if (this.Field15.Field49 == null) {
            if (Class357.Field97[0] == 0) {
                if (this.Field44 != null && this.Field44.Field1 / 16 == 6 && this.Field44.Field2 / 16 == 7) {
                    this.Field44.Field1 = 160;
                }

                if (Class809.Field1(this.Field15.Field193, this.Field15.Field194, this.Field44.Field1, this.Field44.Field2) > 32) {
                    this.Field15.Field49 = this.Field2(this.Field15.Field193 / 16, this.Field15.Field194 / 16, this.Field44.Field1 / 16, this.Field44.Field2 / 16 + 2);
                    this.Field15.Field48 = 0;
                    return;
                }

                this.Field15.Field12 = 1;
                if (System.currentTimeMillis() / 100L - this.Field169 > (long) Field76) {
                    Field76 = 3;
                    Class678 var1 = null;

                    for (int var2 = 0; var2 < this.Field10.size(); ++var2) {
                        if ((var1 = (Class678) this.Field10.elementAt(var2)) instanceof Class260 && ((Class260) var1).Field1 == this.Field35) {
                            this.Field16 = var1;
                            break;
                        }
                    }

                    this.Field169 = System.currentTimeMillis() / 100L;
                    if (Class106.Field21.Field1) {
                        Class106.Field21.Field104.Field2.Field1();
                        Class106.Field21.Field1 = false;
                        return;
                    }

                    Class106.Field3[5] = true;
                    return;
                }
            } else {
                Field48 = 0;
            }
        }

    }

    public final boolean Field1(int var1, int var2, int var3) {
        Class793 var6;
        if ((var6 = Class455.Field1(var1 + this.Field170[var3], var2 + this.Field171[var3])) == null) {
            return false;
        } else {
            Class259.Field5().Field1(this.Field83, var6.Field2, var6.Field3);
            this.Field15.Field204 = 0;
            if (!Class455.Field13) {
                var2 = var6.Field1;
                var3 = Field178.length;

                int var4;
                boolean var10000;
                label63:
                {
                    for (var4 = 0; var4 < var3; ++var4) {
                        if (var2 == Field178[var4]) {
                            var10000 = true;
                            break label63;
                        }
                    }

                    var10000 = false;
                }

                if (!var10000) {
                    Class62 var8 = this;
                    var3 = Field86.length;
                    var4 = 0;

                    short var12;
                    label52:
                    while (true) {
                        if (var4 >= var3) {
                            var12 = -1;
                            break;
                        }

                        for (int var5 = 0; var5 < Field86[var4].length; ++var5) {
                            if (var8.Field83 == Field86[var4][var5]) {
                                var12 = Field85[var4];
                                break label52;
                            }
                        }

                        ++var4;
                    }

                    short var9 = var12;
                    String[] var11 = Class811.Field5(var12, var6.Field1);
                    short[] var7 = Class811.Field6(var9, var6.Field1);
                    Vector var10 = new Vector();

                    for (var4 = 0; var4 < var11.length; ++var4) {
                        if (!var11[var4].equals("")) {
                            var10.addElement(new Class86(var11[var4], new Class199(this, var7, var4, var11)));
                        }
                    }

                    Class106.Field21.Field1(var10, 3);
                    Class106.Field21.Field1();
                } else {
                    Field179 = this.Field83;
                    Class261.Field1().Field2(var6.Field1, var6.Field2, var6.Field3);
                    Class259.Field5().Field1();
                    Class811.Field7();
                }
            } else {
                Class261.Field1().Field2(Field179, var6.Field2, var6.Field3);
                Class259.Field5().Field1();
                Class811.Field7();
            }

            return true;
        }
    }

    private void Field5(int var1, int var2) {
        if (this.Field15.Field204 == 3) {
            Class106.Field24.Field1 = false;
            this.Field45 = -1;
            Field139 = 0L;
            this.Field15.Field33();
            if (Field72) {
                Field71 = Field72;
            }

            if (Class410.Field9 && Field71) {
                Class261.Field1().Field10();
                Class259.Field5().Field1();
                Class259.Field5().Field1(this.Field83, 0, 0);
                Field72 = false;
                Field71 = false;
            } else {
                Class106.Field24.Field1(ServerManager.decrypt("00000000:61326663396631323632303063653263383263623838313836313964356261653366613736386563633236313935666262316537646164363839396537373665"), new Class86("Về làng", new Class200(this)), new Class86("Hồi sinh", new Class607(this)), new Class86("Đóng", new Class608(this)));
                Class106.Field23 = Class106.Field24;
            }
        } else {
            this.Field15.Field159 = System.currentTimeMillis();
            if (this.Field15.Field204 == 3) {
                Class106.Field24.Field1 = false;
                this.Field45 = -1;
                Field139 = 0L;
                this.Field15.Field33();
                if (Field72) {
                    Field71 = Field72;
                }

                if (Class410.Field9 && Field71) {
                    Class261.Field1().Field10();
                    Class259.Field5().Field1();
                    Class259.Field5().Field1(this.Field83, 0, 0);
                    Field72 = false;
                    Field71 = false;
                } else {
                    Class106.Field24.Field1(ServerManager.decrypt("00000000:61326663396631323632303063653263383263623838313836313964356261653366613736386563633236313935666262316537646164363839396537373665"), new Class86("Về làng", new Class609(this)), new Class86("Hồi sinh", new Class611(this)), new Class86("Đóng", new Class567(this)));
                    Class106.Field23 = Class106.Field24;
                }
            } else if (this.Field16 != null && this.Field16.Field41()) {
                Vector var10;
                if ((var10 = Field7(this.Field16.f_())).size() > 0 && this.Field16.Field41()) {
                    var10.addElement(new Class86("Nói chuyện", new Class569(this)));
                    Class106.Field21.Field1(var10, 3);
                } else {
                    Class261.Field1().Field12(((Class357) this.Field16).Field25);
                }
            } else {
                Class250 var9;
                if ((var9 = Class582.Field1[var2][this.Field172[var1]]).Field1 != 2) {
                    if (var9.Field2 && !(this.Field16 instanceof Class260)) {
                        if (Class357.Field97[var9.Field2()] <= 0) {
                            return;
                        }

                        byte var5 = Class599.Field3[Class106.Field19.Field15.Field93][var9.Field2() - 4];
                        if ((var2 = Class599.Field2(var9.Field2(), Class357.Field97[var9.Field2() - 4])) > Class106.Field19.Field15.Field130) {
                            if (!this.Field173) {
                                this.Field1(new Class375("", "Không đủ MP"));
                                this.Field173 = true;
                            }

                            return;
                        }

                        this.Field173 = false;
                        Class582 var10000;
                        if (this.Field16 != null && this.Field16.Field188 == 0) {
                            if (var9.Field2() == 6) {
                                Class261.Field1().Field1((short) this.Field16.Field189, (byte) 0, (byte) ((byte) var5), (short) 0);
                                var10000 = this.Field15;
                                var10000.Field130 -= var2;
                                return;
                            }

                            var10000 = this.Field15;
                            var10000.Field130 -= var2;
                            this.Field45 = var9.Field2();
                            Class464.Field5().Field1(this.Field15, this.Field16, var5, Class599.Field4[this.Field15.Field93][var9.Field2() - 4] == 1);
                            return;
                        }

                        if (var9.Field2() != 6) {
                            var10000 = this.Field15;
                            var10000.Field130 -= var2;
                            if (var9.Field2 && (Class106.Field19.Field45 == -1 || Class106.Field19.Field45 == var9.Field2())) {
                                Class106.Field19.Field45 = var9.Field2();
                            }

                            long var7 = System.currentTimeMillis() - this.Field15.Field69[var9.Field2()];
                            if (Field71 && var7 <= Class106.Field19.Field15.Field72[var9.Field2()] && Field139 - System.currentTimeMillis() / 1000L < 0L && this.Field132) {
                                var7 = Class106.Field19.Field15.Field72[var9.Field2()] + 1L;
                                this.Field132 = false;
                            }

                            if (var7 > Class106.Field19.Field15.Field72[var9.Field2()]) {
                                Class261.Field1().Field1((short) Class106.Field19.Field15.Field189, (byte) 0, (byte) ((byte) var5), (short) 0);
                                this.Field15.Field72[var9.Field2()] = Class599.Field1((byte) var9.Field2(), Class357.Field97[var9.Field2()]);
                                this.Field15.Field69[var9.Field2()] = System.currentTimeMillis();
                                return;
                            }
                        } else {
                            Class106.Field1("Chỉ có thể hồi sinh cho người đã hết HP.");
                        }

                        return;
                    }

                    if (this.Field16 != null && this.Field16.Field188 == 2 && Class357.Field97[var9.Field2()] >= 0) {
                        this.Field1(var9.Field2());
                    }

                    if (this.Field16 == null) {
                        return;
                    }

                    long var4 = System.currentTimeMillis() - this.Field15.Field69[var9.Field2()];
                    if (this.Field16.Field188 != 2 && var4 > Class106.Field19.Field15.Field72[var9.Field2()] && (Class357.Field97[var9.Field2()] > 0 || this.Field16.Field188 == 10)) {
                        this.Field1(var9.Field2());
                        return;
                    }
                } else if (var9.Field1 == 2) {
                    this.Field2(var9.Field3());
                }

            }
        }
    }

    public final void Field2(int var1) {
        if (Class106.Field19.Field15.Field121[var1] <= 0) {
            int var8 = Class582.Field1[Field46].length;
            int[] var3 = new int[]{94, 93, 22, 21, 3, 2, 1};
            int[] var7 = new int[]{96, 95, 24, 23, 6, 5, 4};

            for (int var4 = 0; var4 < var8; ++var4) {
                if (Class582.Field1[Field46][var4].Field1 == 2 && Class582.Field1[Field46][var4].Field3() == var1) {
                    Class582.Field1[Field46][var4].Field4();
                    int var6;
                    if (var1 == 1 || var1 == 2 || var1 == 3 || var1 == 21 || var1 == 22 || var1 == 93 || var1 == 94) {
                        boolean var5 = false;

                        for (var6 = 1; var6 <= 3; ++var6) {
                            if (var6 != var1 && Class106.Field19.Field15.Field121[var6] > 0) {
                                Class582.Field1[Field46][var4].Field1(var6);
                                var5 = true;
                                break;
                            }
                        }

                        if (!var5) {
                            for (var6 = 0; var6 < var3.length; ++var6) {
                                if (Class106.Field19.Field15.Field121[var3[var6]] > 0) {
                                    Class582.Field1[Field46][var4].Field1(var3[var6]);
                                    break;
                                }
                            }
                        }
                    }

                    if (var1 == 4 || var1 == 5 || var1 == 6 || var1 == 23 || var1 == 24 || var1 == 95 || var1 == 96) {
                        for (var6 = 4; var6 <= 6; ++var6) {
                            if (var6 != var1 && Class106.Field19.Field15.Field121[var6] > 0) {
                                Class582.Field1[Field46][var4].Field1(var6);
                                break;
                            }
                        }

                        for (var6 = 0; var6 < var7.length; ++var6) {
                            if (Class106.Field19.Field15.Field121[var7[var6]] > 0) {
                                Class582.Field1[Field46][var4].Field1(var7[var6]);
                                break;
                            }
                        }
                    }
                }
            }

            Class837.Field2();
        } else {
            long var2;
            if ((var2 = System.currentTimeMillis()) - this.Field15.Field123[var1] >= Class582.Field42[var1].Field3) {
                if (this.Field15.Field4 < this.Field15.Field5 || var1 != 1 && var1 != 2 && var1 != 3 && var1 != 21 && var1 != 22 && var1 != 93 && var1 != 94) {
                    if (this.Field15.Field130 < this.Field15.Field129 || var1 != 4 && var1 != 5 && var1 != 6 && var1 != 23 && var1 != 24 && var1 != 95 && var1 != 96) {
                        if (var1 == 19) {
                            if (this.Field83 == 0) {
                                Class106.Field1("Không thể sử dụng trong làng.");
                                return;
                            }

                            Class106.Field19.Field15.Field70 = System.currentTimeMillis();
                            Class106.Field19.Field15.Field161 = true;
                            Class106.Field19.Field15.Field204 = 4;
                        }

                        if (var1 < 10 || var1 > 20) {
                            int var10002 = this.Field15.Field121[var1]--;
                            this.Field15.Field123[var1] = var2;
                        }

                        if (this.Field15.Field204 != 3 && Field71 && !this.Field15.Field211 && Class455.Field10 != 0 && Class455.Field10 != 201 && Class455.Field10 != 70 && Class455.Field10 != 80 && !Class455.Field13) {
                            Class582 var10000 = this.Field15;
                            var10000.Field4 += Field6(0, var1);
                            var10000 = this.Field15;
                            var10000.Field130 += Field6(1, var1);
                            if (this.Field15.Field4 >= this.Field15.Field5) {
                                this.Field15.Field4 = this.Field15.Field5;
                            }

                            if (this.Field15.Field130 >= this.Field15.Field129) {
                                this.Field15.Field130 = this.Field15.Field129;
                            }
                        }

                        Class261.Field1().Field11(var1);
                    }
                }
            }
        }
    }

    private static int Field6(int var0, int var1) {
        for (int var2 = 0; var2 < Field101[var0].length; ++var2) {
            if (Field101[var0][var2] == var1) {
                return Field102[var0][var2];
            }
        }

        return 0;
    }

    private void Field31() {
        if (this.Field16 == null) {
            this.Field8();
        } else if (this.Field16.Field188 == 0) {
            Vector var1;
            (var1 = new Vector()).addElement(new Class86("Mời party", new Class594(this)));
            var1.addElement(new Class86("Trao đổi", new Class595(this)));
            var1.addElement(new Class86("Mời đám cưới", new Class597(this)));
            if (this.Field16 instanceof Class357) {
                var1.addElement(new Class86("Nhắn tin", new Class598(this)));
            }

            var1.addElement(new Class86("Kết bạn", new Class531(this)));
            if ((Class106.Field19.Field15.Field57 == 0 || Class106.Field19.Field15.Field57 == 1 || Class106.Field19.Field15.Field57 == 2) && ((Class357) this.Field16).Field190 == -1) {
                var1.addElement(new Class86("Mời vào bang hội", new Class532(this)));
            }

            if (((Class357) this.Field16).Field190 != -1) {
                var1.addElement(new Class86("Xem thông tin bang hội", new Class533(this)));
            }

            var1.addElement(new Class86("Xem thông tin", new Class535(this)));
            var1.addElement(new Class86("Xuống ngựa", new Class537(this)));
            Class106.Field21.Field1(var1, 2);
        } else {
            Class106.Field3[5] = false;
        }
    }

    public final void Field8() {
        if (this.Field15.Field167 != -1 || this.Field15.Field106 > -1) {
            Class106.Field2("Ngựa sẽ bị mất nếu rương đồ không còn chỗ. Bạn có muốn xuống ngựa không ?", new Class590(this));
        }

    }

    private Vector Field1(Class678 var1, int var2) {
        Vector var3;
        (var3 = new Vector()).addElement(var1);
        int var4 = this.Field10.size();
        Class678 var5 = null;

        for (int var6 = 0; var6 < var4; ++var6) {
            if ((var5 = (Class678) this.Field10.elementAt(var6)).Field188 == 1 && var5.Field204 != 8 && var5.Field189 != var1.Field189 && Field3(var5.Field193 - var1.Field193) <= var2 && Field3(var5.Field194 - var1.Field194) <= var2) {
                var3.addElement(var5);
                if (var3.size() > 10) {
                    break;
                }
            }
        }

        return var3;
    }

    public static void Field1(String var0, Class678 var1) {
        var1.Field209 = null;
        Class678 var10000 = var1;
        String var10001 = var0;
        boolean var2 = true;
        String var4 = var10001;
        Class678 var3 = var10000;
        var10000.Field209 = new Class577(50, var4, 0);
        var3.Field209.Field1(var3.Field193, var3.Field194);
    }

    public static void Field1(String var0) {
        Class153 var1 = new Class153(var0);
        Field62.addElement(var1);
        Field63.addElement(var1);
    }

    public final void Field2(int var1, int var2) {
        if (System.currentTimeMillis() - Field70 >= 0L) {
            Field70 = System.currentTimeMillis() + (long) Field69;
            this.Field28.Field8(var1, var2);
            this.Field15.Field186 = true;
        }

    }

    private void Field1(byte var1) {
        try {
            if (this.Field16 != null) {
                if (Field71 && (this.Field16.d_() || this.Field16.Field41())) {
                    return;
                }

                if (Field48 != 2 && Field78 <= 0) {
                    this.Field15.Field49 = null;
                    this.Field193.Field1 = this.Field193.Field2 = -1;
                }

                if (this.Field16.Field22() || this.Field15.Field201 != this.Field16.Field201 && this.Field16.Field42() || this.Field16.Field42() && (Field47 == Class455.Field10 && this.Field15.Field190 != ((Class357) this.Field16).Field190 || this.Field16.Field200 > 0 && this.Field15.Field200 > 0 && this.Field16.Field200 != this.Field15.Field200) || this.Field15.Field207 && this.Field16.Field42() || this.Field16.Field42() && ((this.Field15.Field193 > Field50 << 4 && this.Field15.Field194 > Field51 << 4 && this.Field15.Field193 < Field52 << 4 && this.Field15.Field194 < Field53 << 4 || Field20) && this.Field16.Field188 != 2 && Class455.Field10 == 201 || Class455.Field10 == 112 || Class455.Field10 == 2541 || Class455.Field10 == 2542 || Class455.Field10 == 2543 || Class455.Field10 == 2544 || ((Class357) this.Field16).Field207) || this.Field16.Field42() && ((Class357) this.Field16).Field150 || this.Field15.Field150 && (this.Field16.Field22() || this.Field16.Field42())) {
                    boolean var2 = false;
                    if (this.Field16.Field22() && this.Field16.Field23()) {
                        var2 = true;
                        var1 = 0;
                    }

                    if (!this.Field16.Field42() || !this.Field16.d_()) {
                        int var3;
                        if ((var3 = Class599.Field2(var1, Class357.Field97[var1])) > this.Field15.Field130) {
                            if (!this.Field173) {
                                this.Field1(new Class375("", "Không đủ MP"));
                                this.Field173 = true;
                            }

                            return;
                        }

                        if (this.Field15.Field36() < 0) {
                            Field1((Class678) this.Field15, (String) "Không thể tấn công khi vũ khí bị hư hại. Hãy đến thợ rèn để sửa lại.", 70);
                            return;
                        }

                        this.Field173 = false;
                        Class114 var4;
                        if (((var4 = (Class114) this.Field16).Field2 <= 0 || var4.Field4 <= 0) && var4.Field188 == 0) {
                            return;
                        }

                        int var5 = Class599.Field1(var1);
                        if (var2) {
                            var5 = 30;
                        }

                        if (Class809.Field1(this.Field15.Field193, this.Field15.Field194, var4.Field193, var4.Field194) > var5) {
                            ++this.Field174;
                            this.Field2(var4, var5);
                            this.Field167 = true;
                        } else {
                            this.Field167 = false;
                            this.Field174 = 0;
                            if (this.Field15.Field207 && this.Field16.Field188 == 0 && ((Class357) this.Field16).Field22 < 10 && this.Field15.Field201 == this.Field16.Field201) {
                                return;
                            }

                            if (this.Field16.Field188 == 1 && ((Class126) this.Field16).Field204 == 5) {
                                return;
                            }

                            if (System.currentTimeMillis() - this.Field15.Field69[var1] > this.Field15.Field72[var1]) {
                                this.Field15.Field12 = Class809.Field2(this.Field15, var4);
                                Class794 var13;
                                (var13 = new Class794()).Field1 = 2000000;
                                Class582 var10000 = this.Field15;
                                var10000.Field130 -= var3;
                                this.Field15.Field1(var4, var13, var1, Class357.Field97[var1]);
                                var2 = Class599.Field4(this.Field15.Field93, var1);
                                Vector var15 = new Vector();
                                if (var2) {
                                    if (var4.Field188 == 1) {
                                        this.Field15.Field58.Field1(var15 = this.Field1((Class678) var4, (int) Class599.Field5(this.Field15.Field93, var1)));
                                    } else if (var4.Field188 == 0) {
                                        var15.addElement(var4);
                                        this.Field15.Field58.Field1(var15);
                                    }
                                }

                                switch (var4.Field188) {
                                    case 0:
                                        this.Field28.Field3(var4.Field189, var1);
                                        this.Field15.Field37();
                                        return;
                                    case 1:
                                        if (!var2) {
                                            this.Field28.Field2(var4.Field189, var1);
                                        } else {
                                            this.Field28.Field1(var1, var15);
                                        }

                                        this.Field15.Field37();
                                    default:
                                        return;
                                }
                            }
                        }
                    }
                }

                if (this.Field16 != null && this.Field16.Field3()) {
                    Class125 var10 = (Class125) this.Field16;
                    if (Class809.Field1(this.Field15.Field193, this.Field15.Field194, var10.Field193, var10.Field194) <= 35) {
                        boolean var11 = true;
                        String var14 = "";
                        if (var10.Field188 == 4) {
                            if (var10.Field3 == 0 && this.Field15.Field122 > 100000000L) {
                                var11 = false;
                                var14 = "Quá nhiều tiền";
                            }
                        } else if (var10.Field188 == 3 && Class106.Field19.Field15.Field20()) {
                            var14 = "Hành trang đã đầy";
                            var11 = false;
                        }

                        if (!var11) {
                            this.Field1(new Class375("", var14));
                            this.Field1(false);
                            return;
                        }

                        this.Field15.Field12 = Class809.Field2(this.Field15, var10);
                        this.Field2((int) this.Field15.Field193, (int) this.Field15.Field194);
                        this.Field28.Field1(var10.Field188, var10.Field189);
                        return;
                    }

                    this.Field2(var10, 35);
                }

                Vector var12;
                if (this.Field16.d_()) {
                    if (this.Field16.e_() == 1) {
                        Class261.Field1().Field12(this.Field16.f_());
                        return;
                    }

                    if (!Class455.Field13) {
                        if ((var12 = Field7(this.Field16.f_())).size() > 0 && !this.Field16.Field41()) {
                            if (Field37 != null && ((Class260) this.Field16).Field1 == Field37.Field6) {
                                var12.addElement(new Class86("Nhiệm vụ Bang hội", new Class592(this)));
                            }

                            var12.addElement(new Class86("Nói chuyện", new Class427(this)));
                            Class106.Field21.Field1(var12, 3);
                            return;
                        }

                        this.Field16.Field209 = null;
                        if (!this.Field16.Field41() && this.Field16.f_() != 7 && this.Field16.f_() != 10 && this.Field16.f_() != 22 && this.Field16.f_() != 31 && this.Field16.f_() != 21 && this.Field16.f_() != 25) {
                            Field1((Class678) this.Field16, (String) Class811.Field1(this.Field16.f_()), 500);
                        } else if (!this.Field16.Field41()) {
                            this.Field1(this.Field16.f_(), new Vector());
                        }
                    } else if (this.Field16.f_() != 2 && (this.Field16.f_() <= 10 || this.Field16.f_() == 29 || this.Field16.f_() == 24 || this.Field16.f_() == 26 || this.Field16.f_() == 30) && this.Field16.f_() != 3 && this.Field16.f_() != 27 && this.Field16.f_() != 28) {
                        Class261.Field1().Field12(this.Field16.f_());
                    } else {
                        this.Field1(this.Field16.f_(), new Vector());
                    }
                }

                if (this.Field16.Field188 == 10) {
                    var12 = new Vector();
                    if (this.Field16 != null) {
                        if (((Class685) this.Field16).Field2) {
                            var12.addElement(new Class86("Xem thông tin", new Class428(this)));
                            var12.addElement(new Class86("Nâng cấp đất", new Class429(this)));
                            var12.addElement(new Class86("Trồng cây", new Class456(this)));
                            var12.addElement(new Class86("Thu hoạch", new Class458(this)));
                            var12.addElement(new Class86("Nhổ bỏ", new Class415(this)));
                        } else {
                            var12.addElement(new Class86("Mua đất", new Class419(this)));
                        }
                    }

                    Class106.Field21.Field1(var12, 3);
                    return;
                }
            }
        } catch (Exception var9) {
        }

    }

    private void Field2(Class678 var1, int var2) {
        if (!Field71 || Field65 != 1 || this.Field15.Field49 == null) {
            if (this.Field15.Field49 == null && (!Field20 || this.Field83 != 201)) {
                int var3 = Class809.Field1(var1.Field193 - this.Field15.Field193, -(var1.Field194 - this.Field15.Field194));
                int var5;
                int var4 = ((var5 = Class809.Field1(this.Field15.Field193, this.Field15.Field194, var1.Field193, var1.Field194)) - var2) * Class809.Field2(var3) >> 10;
                var5 = -((var5 - var2) * Class809.Field1(var3)) >> 10;
                boolean var6 = false;
                if (var4 > 0) {
                    if (var4 > 50) {
                        var4 = 50;
                    }
                } else if (var4 < 0 && var4 < -50) {
                    var4 = -50;
                }

                if (var5 > 0) {
                    if (var5 > 50) {
                        var5 = 50;
                    }
                } else if (var5 < 0 && var5 < -50) {
                    var5 = -50;
                }

                if (Field71 && Field65 == 1 && this.Field16 != null && this.Field16.Field207) {
                    var6 = true;
                }

                if (this.Field83 == 17) {
                    if (Field71 && this.Field15.Field141 && this.Field174 > 10) {
                        this.Field1(false);
                        this.Field174 = 0;
                    }
                } else if (Field71 && !var6) {
                    var5 = 0;
                    var4 = 0;
                    this.Field1(false);
                }

                if (var6 && Field78 <= 0 && (Math.abs(this.Field15.Field193 - this.Field15.Field59) > 120 || Math.abs(this.Field15.Field194 - this.Field15.Field60) > 120)) {
                    var5 = 0;
                    var4 = 0;
                    this.Field1(true);
                    this.Field15.Field164 = System.currentTimeMillis() - 1L;
                    this.Field4(this.Field15.Field59, this.Field15.Field60);
                }

                this.Field15.Field2((short) (this.Field15.Field193 + var4), (short) (this.Field15.Field194 + var5));
                if (!Field71 || var6) {
                    this.Field2((int) ((short) (this.Field15.Field193 + var4)), (int) ((short) (this.Field15.Field194 + var5)));
                }

            }
        }
    }

    private void Field1(int var1, Vector var2) {
        var2 = var2;
        if (var1 != 3 && var1 != 27) {
            if (var1 != 2 && var1 != 28) {
                if (var1 == 7) {
                    var2.addElement(new Class86("Đi đến", new Class482(this)));
                    var2.addElement(new Class86("Giao tiếp", new Class539(this, var1)));
                } else if (var1 == 10) {
                    var2.addElement(new Class86("Lên tàu", new Class498(this)));
                    var2.addElement(new Class86("Mua vé (" + Field92 + " " + "xu" + ")", new Class499(this)));
                    var2.addElement(new Class86("Nói chuyện", new Class500(this, var1)));
                } else if (var1 != 22 && var1 != 31) {
                    if (var1 == 25) {
                        var2.addElement(new Class86("Giao tiếp", new Class505(this, var1)));
                        var2.addElement(new Class86("Chuyển thẻ", new Class507(this)));
                    } else if (var1 == 21) {
                        var2.addElement(new Class86("Học kỹ năng", new Class509(this)));
                        var2.addElement(new Class86("Nói chuyện", new Class511(this, var1)));
                    } else if (var1 > 10 && var1 != 30) {
                        var2.addElement(new Class86("Bán", new Class461(this, var1)));
                        var2.addElement(new Class86("Mua", new Class71(this, var1)));
                    }
                } else {
                    var2.addElement(new Class86("Nạp xu", new Class501(this)));
                    var2.addElement(new Class86("Nói chuyện", new Class503(this, var1)));
                }
            } else {
                var2.addElement(new Class86("Mua bán", new Class423(this, var1)));
                var2.addElement(new Class86("Nghiền bột", new Class425(this)));
                var2.addElement(new Class86("Thêm dòng", new Class449(this)));
                var2.addElement(new Class86("Luyện đồ", new Class450(this)));
                var2.addElement(new Class86("Luyện đồ tự động", new Class385(this)));
                var2.addElement(new Class86("Cộng thuộc tính", new Class387(this)));
                var2.addElement(new Class86("Khóa đồ thú", new Class436(this)));
                var2.addElement(new Class86("Khóa trang bị", new Class438(this)));
                var2.addElement(new Class86("Sửa đồ", new Class61(this)));
                var2.addElement(new Class86("Đục lỗ", new Class478(this)));
                var2.addElement(new Class86("Khảm", new Class480(this)));
                var2.addElement(new Class86("Hợp thành", new Class481(this)));
            }
        } else {
            for (int var3 = 0; var3 < Class811.Field58.length; ++var3) {
                var2.addElement(new Class86(Class811.Field58[var3], new Class421(this, var1, var3)));
            }

            Class106.Field21.Field1(var2, 3);
        }

        Class106.Field21.Field1(var2, 3);
    }

    public final void Field3(int var1, int var2) {
        var1 = var1;
        int var3 = Field86.length;
        int var4 = 0;

        short var10000;
        int var5;
        label34:
        while (true) {
            if (var4 >= var3) {
                var10000 = -1;
                break;
            }

            for (var5 = 0; var5 < Field86[var4].length; ++var5) {
                if (var1 == Field86[var4][var5]) {
                    var10000 = Field85[var4];
                    break label34;
                }
            }

            ++var4;
        }

        short var7 = var10000;
        String[] var9 = Class811.Field52[var7];
        short[] var8 = Class811.Field51[var7];
        Vector var10 = new Vector();

        for (var5 = 0; var5 < var9.length; ++var5) {
            var10.addElement(new Class86(var9[var5], new Class77(this, var2, var8, var5, var9)));
        }

        Class106.Field21.Field1(var10, 3);
        Class106.Field21.Field1();
    }

    public final void Field9() {
        if (this.Field181.size() == 0) {
            Class106.Field1("Chức năng này hiện đang tạm khóa");
        } else {
            Vector var1 = new Vector();
            int var2 = this.Field181.size();

            for (int var3 = 0; var3 < var2; ++var3) {
                String var4 = (String) this.Field182.elementAt(var3);
                String var5 = (String) this.Field183.elementAt(var3);
                String var6 = (String) this.Field181.elementAt(var3);
                if (var5.length() >= 4) {
                    var1.addElement(new Class86((String) this.Field181.elementAt(var3), new Class75(this, var4, var5)));
                } else {
                    var1.addElement(new Class86((String) this.Field181.elementAt(var3), new Class36(this, var4, var6)));
                }
            }

            Class106.Field21.Field1(var1, 3);
        }
    }

    public final void Field2(String var1) {
        Vector var2;
        (var2 = new Vector()).addElement(new Class86("Nạp lượng", new Class7(this, var1)));
        var2.addElement(new Class86("Nạp xu", new Class6(this, var1)));
        Class106.Field21.Field1(var2, 3);
    }

    private void Field1(Graphics var1, Class384 var2, int var3) {
        if (var2 != null) {
            int var4 = var2.Field1 / 16;
            int var5 = var2.Field2 / 16;
            if (var4 - 4 <= Field189) {
                var4 = Field189 + 4;
            } else if (var4 + 6 > Field189 + Field67) {
                var4 = Field189 + Field67 - 6;
            }

            if (var5 - 4 <= Field185) {
                var5 = Field185 + 4;
            } else if (var5 + 6 > Field185 + Field68) {
                var5 = Field185 + Field68 - 6;
            }

            var1.setColor(this.Field175[var3]);
            var1.fillRect(var4, var5, 3, 3);
            var1.setColor(16777215);
            var1.drawRect(var4 - 1, var5 - 1, 4, 4);
        }

    }

    private void Field5(Graphics var1) {
        if (Class455.Field1 >= Class106.Field13 / 16 || Class455.Field2 >= Class106.Field14 / 16) {
            Class106.Field1(var1);
            if (this.Field45 != -1 && Field139 - System.currentTimeMillis() / 1000L > 0L) {
                Class379.Field1.Field1(this.Field45, Class106.Field13, Class106.Field14 - Field68 - Class671.Field108, 0, 40, var1);
                Class21.Field9[0].Field1(var1, String.valueOf((Field139 - System.currentTimeMillis()) / 1000L), Class106.Field13 - 10, Class106.Field14 - Field68 - Class671.Field108 - 28, 2);
            }

            var1.translate(this.Field148.Field1, this.Field148.Field2);
            int var2 = this.Field15.Field193 / 16;
            int var3 = this.Field15.Field194 / 16;

            int var4;
            for (var4 = 0; var4 < 3; ++var4) {
                var1.setColor(Field176[var4]);
                var1.drawRect(var4, var4, Field67 - (var4 << 1), Field68 - (var4 << 1));
            }

            var1.setClip(3, 3, Field67 - 5, Field68 - 5);
            var1.translate(-Field189, -Field185);
            if (Class455.Field9 != null) {
                var1.drawImage(Class455.Field9, 0, 0, 0);
            }

            var1.setColor(16777215);
            var1.fillRect(var2, var3 - 2, 5, 5);
            var1.setColor(255);
            var1.fillRect(var2 + 1, var3 - 1, 3, 3);
            this.Field4(var1);
            this.Field1((Graphics) var1, (Class384) Field37, 1);
            this.Field1((Graphics) var1, (Class384) this.Field23, 2);
            var1.setColor(16516117);
            Class802 var8 = null;
            Class678 var7 = null;

            for (var3 = 0; var3 < Class357.Field127.size(); ++var3) {
                var8 = (Class802) Class357.Field127.elementAt(var3);
                if ((var7 = this.Field2((short) var8.Field1)) != null) {
                    var1.fillRect(var7.Field193 / 16, var7.Field194 / 16, 2, 2);
                }
            }

            byte var5;
            if (this.Field15.Field49 != null) {
                if (this.Field192 != null) {
                    var1.setColor(15198737);
                    var1.fillRect(this.Field192.Field1, this.Field192.Field2, 3, 3);
                    this.Field193.Field1 = (short) this.Field192.Field1;
                    this.Field193.Field2 = (short) this.Field192.Field2;
                }

                var3 = this.Field15.Field49.length;

                for (var2 = 0; var2 < var3; ++var2) {
                    var1.setColor(15198737);
                    byte var9 = (byte) (Field94 + (this.Field15.Field49[var2] >> 8));
                    var5 = (byte) (Field95 + (this.Field15.Field49[var2] & 255));
                    if (var9 != -1) {
                        var1.fillRect(var9 + 1, var5 + 1, 1, 1);
                    }
                }
            }

            var1.setColor(16317005);
            var3 = Class455.Field6.size();

            for (var2 = 0; var2 < var3; ++var2) {
                Class519 var10 = (Class519) Class455.Field6.elementAt(var2);
                var5 = 0;
                byte var6 = 0;
                if (var10.Field193 / 16 >= Field67 - 3) {
                    var5 = -3;
                }

                if (var10.Field193 / 16 <= 3) {
                    var5 = 3;
                }

                if (var10.Field194 / 16 <= 3) {
                    var6 = 3;
                }

                if (var10.Field194 >= Field68 - 3) {
                    var6 = -3;
                }

                var1.fillRect(var10.Field193 / 16 + var5, var10.Field194 / 16 + var6, 3, 3);
            }

            Class106.Field1(var1);
            Class21.Field1.Field1(var1, Field1, 2, Class106.Field14 - 30, 0);
            Class21.Field7.Field1(var1, this.Field15.Field193 / 16 + "." + this.Field15.Field194 / 16, Class106.Field13 - 2, Class106.Field14 - Class671.Field108 - 7, 1);
            if (this.Field15.Field201 > -1) {
                Class21.Field1.Field1(var1, Field64[this.Field15.Field202], 2, Class106.Field14 - 42, 0);
            }

            var2 = 0;
            if (this.Field96 != null) {
                for (var4 = 0; var4 < this.Field96.length; ++var4) {
                    if (this.Field96[var4].Field1 > 0) {
                        Class379.Field1(var1, (short) (this.Field96[var4].Field4 + 2600), Class106.Field13 - 9, this.Field148.Field2 - 85 + var2 * 16);
                        Class21.Field9[0].Field1(var1, String.valueOf(this.Field96[var4].Field5), Class106.Field13 - 9 + 4, this.Field148.Field2 - 85 + var2 * 16 - 2, 2);
                        ++var2;
                    }
                }
            }

            var2 = 0;
            if (this.Field97 != null) {
                for (var4 = 0; var4 < this.Field97.length; ++var4) {
                    if (this.Field97[var4].Field1 > 0) {
                        Class379.Field1(var1, (short) (this.Field97[var4].Field4 + 2600), Class106.Field13 - 9 - 6 - 12, this.Field148.Field2 - 85 + var2 * 16);
                        Class21.Field9[0].Field1(var1, String.valueOf(this.Field97[var4].Field5), Class106.Field13 - 9 - 6 - 12 + 4, this.Field148.Field2 - 85 + var2 * 16 - 2, 2);
                        ++var2;
                    }
                }
            }

        }
    }

    private void Field6(Graphics var1) {
        for (int var2 = 0; var2 < this.Field199.size(); ++var2) {
            Class354 var3;
            if ((var3 = (Class354) this.Field199.elementAt(var2)) != null) {
                var3.Field1(var1, Class106.Field13, Field68 + var2 * 18 + 16);
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field17) {
            Class106.Field1(var1);
            if (this.Field19) {
                var1.setColor(16777215);
                var1.fillRect(0, 0, Class106.Field13, Class106.Field14);
            } else {
                if (Field121 || Field122) {
                    var1.setColor(0);
                    var1.fillRect(0, 0, Class106.Field13, Class106.Field14);
                }

                int var2 = 0;
                if (this.Field24 > 0) {
                    var2 = Field66.nextInt(2);
                }

                var1.translate(-Field8 + var2, -Field9 - var2);
                var1.setColor(0);
                var1.fillRect(Field8 - 5, Field9 - 5, Class106.Field13 + 10, Class106.Field14 + 10);

                try {
                    Class455.Field1(var1);
                } catch (Exception var20) {
                }

                Class3 var24;
                if (this.Field15.Field49 != null && this.Field192 != null && (var24 = this.Field193).Field1 != -1 && Class106.Field19.Field15.Field204 == 1 && var24.Field2 != -1) {
                    var1.setColor(16777215);
                    var1.drawArc((var24.Field1 << 4) - 3 + 16, (var24.Field2 << 4) - 3, 6, 6, 0, 360);
                    var1.drawArc((var24.Field1 << 4) - var24.Field3 + 16, (var24.Field2 << 4) - var24.Field3, var24.Field3 + var24.Field3, var24.Field3 + var24.Field3, 0, 360);
                    var1.drawArc((var24.Field1 << 4) - (var24.Field3 + 2) + 16, (var24.Field2 << 4) - (var24.Field3 + 2), var24.Field3 + 2 + var24.Field3 + 2, var24.Field3 + 2 + var24.Field3 + 2, 0, 360);
                }

                Class73.Field1.Field1(var1);

                for (var2 = 0; var2 < this.Field200.size(); ++var2) {
                    Class269 var3;
                    if ((var3 = (Class269) this.Field200.elementAt(var2)) != null) {
                        var3.Field2(var1);
                    }
                }

                for (var2 = 0; var2 < Field138.size(); ++var2) {
                    Class177 var25;
                    if ((var25 = (Class177) Field138.elementAt(var2)) != null) {
                        var25.Field1(var1);
                    }
                }

                int var26;
                Class51 var27;
                for (var26 = 0; var26 < this.Field13.size(); ++var26) {
                    if ((var27 = (Class51) this.Field13.elementAt(var26)) != null) {
                        var27.Field1(var1);
                    }
                }

                var26 = 0;
                var2 = 0;
                int var4 = 0;

                int var5;
                int var6;
                Class678 var34;
                int var37;
                try {
                    if (Class455.Field5 != null) {
                        label452:
                        for (var5 = this.Field3; var5 < this.Field5 + 5; ++var5) {
                            if (Field180 == 1) {
                                for (var6 = Class455.Field5.size(); var26 < var6 && (Class264) Class455.Field5.elementAt(var26) != null; ++var26) {
                                    Class264 var7;
                                    if ((var7 = (Class264) Class455.Field5.elementAt(var26)).Field194 == var5) {
                                        if (var7.Field193 - Class811.Field10(var7.Field1) / 32 <= this.Field4 && var7.Field193 + Class811.Field10(var7.Field1) / 32 >= this.Field2) {
                                            var7.Field1(var1);
                                        }
                                    } else if (var7.Field194 > var5) {
                                        break;
                                    }
                                }
                            }

                            for (var6 = this.Field11.size(); var4 < var6; ++var4) {
                                Class678 var35;
                                if ((var35 = (Class678) this.Field11.elementAt(var4)) != null && var35.Field203 == 1 && Field1(var35)) {
                                    var35.Field1(var1);
                                }
                            }

                            var37 = this.Field10.size();

                            while (true) {
                                do {
                                    do {
                                        do {
                                            do {
                                                if (var2 >= var37) {
                                                    continue label452;
                                                }

                                                if ((var34 = (Class678) this.Field10.elementAt(var2)).Field188 != 2) {
                                                    if (var34.Field194 >> 4 > var5) {
                                                        continue label452;
                                                    }

                                                    if (((var34.Field188 == 0 && Field91 == 1 || var34.Field189 == this.Field15.Field189 || var34.Field188 != 0) && var34.Field194 >> 4 == var5 && var34.Field194 <= this.Field5 << 4 && var34.Field194 >= this.Field3 << 4 || var34.Field45()) && !(var34 instanceof Class643)) {
                                                        var34.Field1(var1);
                                                    }
                                                } else if (var34.Field188 == 2 && var34.Field203 != 1 && Field1(var34)) {
                                                    var34.Field1(var1);
                                                }

                                                ++var2;
                                            } while (var34 != this.Field16);
                                        } while (this.Field16.Field188 == 10);
                                    } while (this.Field16.Field188 == 11);
                                } while (this.Field16.Field188 == 12);

                                if (!(this.Field16.Field188 == 2 ? this.Field44 != null && var34.Field193 / 16 == this.Field44.Field1 / 16 && var34.Field194 / 16 == this.Field44.Field2 / 16 : false) && !this.Field167) {
                                    var1.drawImage(Class811.Field12, var34.Field193, var34.Field194 - var34.Field195, 33);
                                }
                            }
                        }

                        Class455.Field2(var1);
                    }
                } catch (Exception var23) {
                    var23.printStackTrace();
                }

                if (Field49 != null) {
                    Field49.Field1(var1);
                }

                for (var5 = 0; var5 < Field12.size(); ++var5) {
                    if ((var27 = (Class51) Field12.elementAt(var5)) != null) {
                        var27.Field1(var1);
                    }
                }

                Class678 var33 = null;
                var6 = this.Field10.size();

                for (var37 = 0; var37 < var6; ++var37) {
                    if ((var33 = (Class678) this.Field10.elementAt(var37)) != null) {
                        var33.a_(var1);
                    }
                }

                Class73.Field2.Field1(var1);

                for (var37 = 0; var37 < this.Field200.size(); ++var37) {
                    Class269 var36;
                    if ((var36 = (Class269) this.Field200.elementAt(var37)) != null) {
                        var36.Field1(var1);
                    }
                }

                try {
                    Graphics var28 = var1;
                    Class62 var31 = this;

                    for (var4 = 0; var4 < 15; ++var4) {
                        if (var31.Field130[var4] != -1) {
                            if (var31.Field131[var4] != 0) {
                                Class21.Field9[var31.Field131[var4]].Field1(var28, var31.Field125[var4], var31.Field126[var4], var31.Field127[var4], 0);
                            } else {
                                Class21.Field6.Field1(var28, var31.Field125[var4], var31.Field126[var4], var31.Field127[var4], 0);
                            }
                        }
                    }
                } catch (Exception var22) {
                }

                var37 = Class455.Field6.size();

                for (var6 = 0; var6 < var37; ++var6) {
                    Class519 var8;
                    if ((var8 = (Class519) Class455.Field6.elementAt(var6)) != null) {
                        if (Class455.Field13) {
                            var8.Field2 = "thoát";
                        } else {
                            var8.Field2 = "vào";
                        }

                        var8.Field1(var1);
                    }
                }

                int var38;
                if (Field60.size() > 0 && !Class455.Field13 && Field60.size() > 0) {
                    var34 = null;

                    for (var38 = 0; var38 < Field60.size(); ++var38) {
                        Class376 var39;
                        if ((var39 = (Class376) Field60.elementAt(var38)) != null) {
                            var39.Field1(var1);
                        }
                    }
                }

                if (Field198 != null) {
                    Field198.Field1(var1, Field141.Field193 - 30, Field141.Field194 - 40 - Field141.Field43());
                }

                String var32;
                try {
                    if (this.Field14 != 2) {
                        Class106.Field1(var1);
                        if (!this.Field167 && this.Field16 != null) {
                            if (this.Field16.Field188 != 10 && this.Field16.Field188 != 11 && this.Field16.Field188 != 12) {
                                Class21.Field1.Field1(var1, this.Field16.a_(), Class106.Field13 - 30, 0, 1);
                                this.Field16.a_(var1, Class106.Field13 - 15, 20);
                            }

                            Class114 var29;
                            if ((this.Field16.Field188 == 0 || this.Field16.Field188 == 1) && (var29 = (Class114) this.Field16).Field5 != 0 && var29.Field25 == -1) {
                                Class106.Field1(var1);
                                var1.drawImage(Field40, Class106.Field13 - 80, 14, 20);
                                var5 = (int) ((long) var29.Field4 * (long) this.Field147 / (long) var29.Field5);
                                if (var29.Field4 <= 0) {
                                    var5 = 0;
                                }

                                var1.setColor(2368805);
                                var1.fillRect(Class106.Field13 - 79, 15, this.Field147 - var5, 3);
                                Class21.Field7.Field1(var1, (var29.Field4 > 0 ? var29.Field4 : 1) + "/" + var29.Field5, Class106.Field13 - 10 - (this.Field147 >> 1), 22, 1);
                                Class21.Field9[0].Field1(var1, "lv" + var29.Field22, Class106.Field13 - 2, 22, 1);
                            }
                        }
                    }

                    if (this.Field14 != 2) {
                        Class106.Field1(var1);
                        var1.drawImage(Field39, 0, 0, 20);
                        Class811.Field3(2, this.Field15.Field88).Field1(var1, (short) 20, (short) 18, 0, this.Field15.Field23);
                        Class21.Field2.Field1(var1, "Lv " + this.Field15.Field22 + "+" + this.Field15.Field44(), 37, Field39.getHeight() - 9, 0);
                        Class677.Field1(var1);
                        if (this.Field15.Field199 > 0) {
                            Class21.Field7.Field1(var1, String.valueOf(this.Field15.Field199), 5, Field39.getHeight() + 2, 0);
                        }

                        if (this.Field15.Field146 >= 0) {
                            int[] var30 = this.Field15.Field30();
                            Class21.Field10[0].Field1(var1, var30[0] + " : " + var30[1], 5, Field39.getHeight() + 10, 0);
                        }

                        if (!(var32 = this.Field15.Field25()).equals("")) {
                            Class21.Field10[0].Field1(var1, var32, 98, 3, 0);
                            Class21.Field9[0].Field1(var1, Class357.Field147, 98, 17, 0);
                        }

                        int var15 = this.Field15.Field4 * this.Field146 / this.Field15.Field5;
                        int var16 = this.Field15.Field130 * this.Field146 / this.Field15.Field129;
                        var1.setColor(0);
                        var1.fillRect(var15 + 46, 8, this.Field146 - var15 - 1, 3);
                        var1.setColor(0);
                        var1.fillRect(var16 + 46, 18, this.Field146 - var16 - 1, 3);
                        if (Class106.Field12 % 10 > 3) {
                            if (this.Field15.Field78 > 0) {
                                var1.drawImage(Field41[0], Class106.Field13 - 2, Field39.getHeight() + 5, 24);
                            }

                            if (this.Field15.Field79 > 0) {
                                var1.drawImage(Field41[1], Class106.Field13 - 2, Field39.getHeight() + 16, 24);
                            }
                        }
                    }
                } catch (Exception var21) {
                    var21.printStackTrace();
                }

                try {
                    if (this == Class106.Field17) {
                        this.Field5(var1);
                        this.Field9(var1);
                        this.Field2(var1);
                    }
                } catch (Exception var19) {
                    var19.printStackTrace();
                }

                super.Field1(var1);

                try {
                    if (Class455.Field10 == 201 && Field54 != null) {
                        Field7(var1);
                    }
                } catch (Exception var18) {
                    var18.printStackTrace();
                }

                try {
                    if (this == Class106.Field17) {
                        this.Field8(var1);
                        if (Class106.Field23 == null && !Class106.Field21.Field1 && !this.Field30) {
                            var1.drawImage(Class811.Field9[0], 2, Class106.Field14 - 13, 0);
                            var1.drawImage(Class811.Field9[1], Class106.Field13 - 15, Class106.Field14 - 13, 0);
                        }
                    }
                } catch (Exception var17) {
                    var17.printStackTrace();
                }

                if (this.Field197 != null && this.Field197.size() > 0) {
                    Class106.Field1(var1);
                    var1.drawImage(Class811.Field31, 0, Class106.Field14 + 3, 36);
                    var1.setClip(15, Class106.Field14 - 20, Class106.Field13 - 30, 20);
                    var32 = (String) this.Field197.elementAt(0);
                    Class21.Field8.Field1(var1, var32, this.Field157, Class106.Field14 - 10 - Class21.Field8.Field2() / 2, 0);
                    var1.setClip(0, 0, Class106.Field14, Class106.Field13);
                }

                this.Field6(var1);
                if (Field62.size() > 0) {
                    Class153 var40 = (Class153) Field62.elementAt(0);

                    for (var38 = 0; var38 < Class106.Field13; var38 += Class811.Field17.getWidth()) {
                        if (var40.Field2.length == 1) {
                            var1.drawImage(Class811.Field17, var38, -1 + (this.Field79 == null ? 0 : 17), 0);
                        } else if (var40.Field2.length == 2) {
                            var1.drawImage(Class811.Field17, var38, -1 + (this.Field79 == null ? 0 : 17), 0);
                            var1.drawImage(Class811.Field17, var38, -1 + (this.Field79 == null ? 17 : 34), 0);
                        }
                    }

                    if (this.Field79 != null) {
                        var1.setColor(16777215);
                        var1.fillRect(0, 18, Class106.Field13, 1);
                    }

                    var40.Field1(var1);
                }

            }
        }
    }

    private static boolean Field1(Class678 var0) {
        return var0.Field193 + var0.Field196 / 2 >= Field8 && var0.Field193 - var0.Field196 / 2 <= Field8 + Class106.Field13 && var0.Field194 - var0.Field195 <= Field9 + Class106.Field14 && var0.Field194 >= Field9;
    }

    private static void Field7(Graphics var0) {
        int var1 = 38;

        for (int var2 = 0; var2 < Field54.length; ++var2) {
            if ((long) Field54[var2] - (System.currentTimeMillis() / 1000L - (long) Field55[var2]) > 0L) {
                Class21.Field8.Field1(var0, var2 + 1 + ": " + Field58[var2] + " (" + ((long) Field54[var2] - (System.currentTimeMillis() / 1000L - (long) Field55[var2])) + ")", Class106.Field15 + 2, var1 + 1, 3);
                Class21.Field5.Field1(var0, var2 + 1 + ": " + Field58[var2] + " (" + ((long) Field54[var2] - (System.currentTimeMillis() / 1000L - (long) Field55[var2])) + ")", Class106.Field15, var1, 3);
                var1 += 10;
            } else if (!Field59[var2].equals("")) {
                Class21.Field8.Field1(var0, var2 + 1 + ": " + Field59[var2], Class106.Field15 + 2, var1 + 1, 3);
                Class21.Field5.Field1(var0, var2 + 1 + ": " + Field59[var2], Class106.Field15, var1, 3);
                var1 += 10;
            }
        }

    }

    public final void Field2(Graphics var1) {
        if (Field27.size() > 0 && this.Field79 == null) {
            this.Field79 = new Class472(this, (String) Field27.elementAt(0), Class106.Field13 + 10, 2);
            Field27.removeElementAt(0);
        }

        if (this.Field79 != null) {
            var1 = var1;
            Class472 var3 = this.Field79;

            for (int var2 = 0; var2 < Class106.Field13; var2 += Class811.Field17.getWidth()) {
                var1.drawImage(Class811.Field17, var2, var3.Field3, 0);
            }

            Class21.Field10[0].Field1(var1, var3.Field5, var3.Field1, var3.Field2, 0);
        }

    }

    public final boolean Field1(int var1) {
        if (this.Field30) {
            this.Field31.Field1(var1);
            if (var1 == -7) {
                this.Field31.Field1();
            }

            if (var1 == -6) {
                Class106.Field5();
                Class106.Field6();
                this.Field30 = false;
            }

            if (var1 == -5) {
                String var2 = this.Field31.Field5();
                this.Field31.Field1("");
                this.Field8(var2);
            }

            return true;
        } else {
            if (Class520.Field1 != Class106.Field17) {
                switch (var1) {
                    case 48:
                        if (Field46 == 0) {
                            Field46 = 1;
                        } else {
                            Field46 = 0;
                        }

                        Field140 = Class811.Field42;
                        break;
                    case 98:
                        Class106.Field3[8] = true;
                        break;
                    case 102:
                        Class106.Field3[4] = true;
                        break;
                    case 103:
                        Class106.Field3[5] = true;
                        break;
                    case 104:
                        Class106.Field3[6] = true;
                        break;
                    case 106:
                        Class106.Field3[11] = true;
                        break;
                    case 109:
                        Class106.Field3[0] = true;
                        break;
                    case 110:
                        Class106.Field3[9] = true;
                        break;
                    case 114:
                        Class106.Field3[1] = true;
                        break;
                    case 116:
                        Class106.Field3[2] = true;
                        break;
                    case 117:
                        Class106.Field3[10] = true;
                        break;
                    case 118:
                        Class106.Field3[7] = true;
                        break;
                    case 121:
                        Class106.Field3[3] = true;
                }
            }

            return false;
        }
    }

    private void Field8(String var1) {
        if (Field80 == 0) {
            this.Field15.Field209 = null;
            Field1((Class678) this.Field15, (String) var1, 200);
            Class104.Field5().Field1(this.Field15.Field65 + ": " + var1, (String) null);
            Class261.Field1().Field1(var1);
        }

    }

    private void Field8(Graphics var1) {
        if ((this.Field14 != 2 || this.Field30) && !Class106.Field21.Field1) {
            if (this.Field14 == 0) {
                var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
                if (Class106.Field23 != null || this != Class106.Field17) {
                    return;
                }

                if (this.Field16 != null && this.Field16.Field188 != 2 || this.Field16 == null) {
                    int var2 = Class21.Field2.Field1("Đóng") + 10;
                    var1.setClip(var2, Class106.Field14 - 16, Class106.Field13 - var2 - 13, 20);
                    if (this.Field136 < this.Field137) {
                        ++this.Field136;
                    }

                    if (this.Field197 != null && this.Field197.size() > 0) {
                        int var3 = this.Field133.size();

                        for (int var4 = 0; var4 < var3; ++var4) {
                            Class375 var5 = (Class375) this.Field133.elementAt(var4);
                            String var6 = "";
                            if (!var5.Field1.equals("")) {
                                var6 = var6 + var5.Field1 + ": ";
                            }

                            var6 = var6 + var5.Field3;
                            int var7;
                            if ((var7 = Class106.Field14 - 16 - this.Field136 + var4 * 18) + 13 >= Class106.Field14 - 20 && var7 <= Class106.Field14) {
                                Class21.Field8.Field1(var1, var6, var2, var7, 0);
                            }
                        }
                    }

                    var1.setClip(0, 0, Class106.Field13, Class106.Field14);
                }
            }

            if (this.Field30) {
                var1.setClip(0, 0, Class106.Field13, Class106.Field14);
                this.Field31.Field1(var1);
                var1.setClip(0, 0, Class106.Field13, Class106.Field14);
                Class21.Field2.Field1(var1, "Đóng", 5, Class106.Field14 - Class671.Field108, 0);
                Class21.Field2.Field1(var1, "Xóa", Class106.Field13 - 5, Class106.Field14 - Class671.Field108, 1);
            }
        }
    }

    private void Field9(Graphics var1) {
        if (this.Field14 != 2) {
            if (Class106.Field23 == null) {
                if (!this.Field30) {
                    if (this.Field16 != null && this.Field16.Field188 == 2) {
                        Class21.Field2.Field1(var1, "Giao tiếp", Class106.Field15, Class106.Field14 - Class671.Field108, 2);
                    } else {
                        Class106.Field1(var1);
                        int var2 = Class811.Field15.getWidth();
                        int var3 = Class811.Field15.getHeight();
                        var1.setColor(Field177[this.Field15.Field93]);
                        var1.fillRect(Class106.Field15 - var2 / 2 + 3, Class106.Field14 - 12 - var3 + Field140, var2 - 3, var3 - 5);

                        for (int var4 = 0; var4 < 5; ++var4) {
                            if (Class582.Field1 != null && Class582.Field1[Field46][var4] != null) {
                                Class582.Field1[Field46][var4].Field1(var1, Class106.Field15 - var2 / 2 + var4 * Class811.Field42 + Class811.Field42 / 2 - 8, Class106.Field14 - 16 - 6 + Class811.Field42 / 2 - var3 + Field140 - (var4 == 2 ? 1 : 0));
                            }

                            Class21.Field2.Field1(var1, String.valueOf(1 + (var4 << 1)), Class106.Field15 - var2 / 2 + var4 * Class811.Field42 + Class811.Field42 / 2 + Class811.Field42 / 2 - 14, Class106.Field14 - 16 - 10 - var3 + Field140 - (var4 == 2 ? 2 : 0), 2);
                        }

                        var1.drawImage(Class811.Field15, Class106.Field15 - var2 / 2, Class106.Field14 - 16 - var3 + Field140, 0);
                        if (Class106.Field17 == this && !this.Field30) {
                            var1.drawImage(Class811.Field9[0], 2, Class106.Field14 - 13, 0);
                            var1.drawImage(Class811.Field9[1], Class106.Field13 - 15, Class106.Field14 - 13, 0);
                        }

                        var1.setColor(9043835);
                        var1.fillRect(Class106.Field15 - 50, Class106.Field14 - Class671.Field108, this.Field15.Field96 / 10, 1);
                        var1.setColor(1422592);
                        var1.fillRect(Class106.Field15 - 50, Class106.Field14 - Class671.Field108, this.Field15.Field96 / 10, 1);
                    }
                }
            }
        }
    }

    public static void Field1(int var0, int var1, Vector var2) {
        for (int var3 = 0; var3 < var2.size(); ++var3) {
            Class114 var4 = (Class114) var2.elementAt(var3);
            Class73.Field2(new Class467(var0, var1, var4.Field193, var4.Field194, var4));
        }

    }

    public static void Field2(int var0, int var1, Vector var2) {
        for (int var3 = 0; var3 < var2.size(); ++var3) {
            Class114 var4 = (Class114) var2.elementAt(var3);
            Class73.Field2(new Class195(var0, var1, var4));
        }

    }

    public static void Field1(Class114 var0, Class114 var1, int var2) {
        if (var0 != null && var1 != null) {
            Class489 var3 = new Class489(var0, var1, 30);
            Field12.addElement(var3);
        }

    }

    public final void Field1(int var1, int var2, Class114 var3, Class114 var4, int var5, boolean var6, int var7, int var8, int var9, int var10, boolean var11) {
        Class49 var12;
        if (var6) {
            if (var3 != null && var4 != null) {
                var12 = new Class49(var1, 10, var3, var4, var5, var7, var8, var9, var10, var11);
                Field12.addElement(var12);
                return;
            }
        } else {
            var12 = new Class49(var1, 10, var3, var4, var5, var7, var8, var9, var10, var11);
            this.Field13.addElement(var12);
        }

    }

    public final void Field1(Class114 var1, Class114 var2, int var3, int var4) {
        for (var3 = 0; var3 < 12; ++var3) {
            this.Field1(var3 * 30, 10, var1, var2, 0, true, 4, 52, 0, 0, var3 == 11);
        }

        this.Field24 = 20;
    }

    public final void Field1(Class114 var1, Class114 var2, int var3, int var4, int var5, int var6, int var7) {
        if (var1 != null && var2 != null) {
            Class301 var8 = new Class301(var1, var2, var3, var4, var6, var7);
            if (var5 == 1) {
                this.Field13.addElement(var8);
                return;
            }

            Field12.addElement(var8);
        }

    }

    public static void Field1(int var0, Class114 var1, Class114 var2, int var3, int var4, int var5, byte var6) {
        Class173 var7;
        (var7 = new Class173()).Field1(var0, var3, var4, var5, var6, var1, var2);
        Field12.addElement(var7);
    }

    public static void Field1(int var0, Class114 var1, Class114 var2, int var3, int var4, int var5, byte var6, int var7) {
        Class173 var8;
        (var8 = new Class173()).Field1(var0, var3, var4, var5, var6, var1, var2);
        var8.Field1(var7);
        Field12.addElement(var8);
    }

    public static void Field2(int var0, Class114 var1, Class114 var2, int var3, int var4, int var5, byte var6, int var7) {
        Class804 var8;
        (var8 = new Class804(var7)).Field1(var0, var3, var4, var5, var6, var1, var2);
        Field12.addElement(var8);
    }

    public final void Field1(byte var1, short var2, short var3, short var4, short var5, byte var6, int var7, byte var8, byte var9, boolean var10) {
        if (this.Field17) {
            Field143 = true;
            Class678 var11 = null;

            for (int var12 = this.Field10.size() - 1; var12 >= 0; --var12) {
                var11 = (Class678) this.Field10.elementAt(var12);
                if (var1 == var11.Field188 && var11.Field189 == var3) {
                    var11.Field218 = var10;
                    var11.Field1(var4, var5);
                    if (var11.Field188 == 0) {
                        var11.Field200 = var6;
                        if (var11.Field39() <= 0 || var11.Field40() <= 0) {
                            var11.Field9(3);
                        }
                    }

                    Field143 = false;
                    return;
                }
            }

            Field143 = false;
            Class678 var13 = Field1(var1, var2, var3, var4, var5, var8, var9);
            if (Class809.Field1((Class678) this.Field15, (Class678) var13)) {
                this.Field10.addElement(var13);
                var13.Field218 = var10;
                if (this.Field10.size() < 200) {
                    switch (var1) {
                        case 0:
                            if (var9 == -1) {
                                ((Class357) var13).Field159 = System.currentTimeMillis();
                                ((Class357) var13).Field200 = var6;
                            }

                            this.Field28.Field2(var3);
                            return;
                        case 1:
                            ((Class126) var13).Field36 = var7;
                            this.Field28.Field3(var3);
                    }
                }

            }
        }
    }

    public static void Field1(Class357 var0) {
        if (var0.Field25 != -1) {
            var0.Field12 = 0;
        }

        if (Field56 != null) {
            int var1 = Field56.length;

            for (int var2 = 0; var2 < var1; ++var2) {
                if (Field56[var2] == var0.Field189) {
                    if (var0 != null) {
                        var0.Field169 = null;
                    }

                    if (var0 != null && Field54[var2] > 0) {
                        var0.Field169 = new Class226(var0.Field193, var0.Field194 - 5, (short) 1, (byte) 1, false);
                    }
                }
            }
        }

        if (var0.Field20 > 0 || var0.Field21 > 0) {
            boolean var3 = false;
            byte var4;
            if (var0.Field20 > var0.Field21) {
                var4 = 21;
            } else {
                var4 = 36;
            }

            var0.Field148 = new Class177(var0.Field193, var0.Field194, var4);
        }

    }

    public final void Field1(short var1, short var2, byte var3, int var4, int var5, byte var6, byte var7, byte var8, byte var9) {
        if (this.Field17) {
            Class357 var11;
            if (var1 == this.Field15.Field189) {
                if ((var11 = (Class357) this.Field2(var2)) != null) {
                    if (this.Field15.Field90 == 0) {
                        this.Field15.Field90 = var4;
                    }

                    if (var11 != null) {
                        var11.Field2(var5);
                        if (var11.Field4 <= 0 || var11.Field2 <= 0) {
                            var11.Field204 = 3;
                        }

                        Class794.Field1(var6, var11.Field193, var11.Field194 - 25);
                        if (var8 == 0) {
                            Class794.Field1(var6, var11.Field193, var11.Field194 + 35);
                        }
                    }

                    if (var4 > 0) {
                        for (int var10 = 0; var10 < var7; ++var10) {
                            Class106.Field19.Field1("-" + var4 / var7, 0, var11.Field193 + (var10 % 2 == 0 ? 0 : -20), var11.Field194 - (var10 % 2 == 0 ? 20 : 30), 1, -2);
                        }

                        return;
                    }
                }
            } else {
                Class357 var13;
                if (var2 == this.Field15.Field189) {
                    if ((var11 = (Class357) this.Field2(var1)) != null) {
                        var11.Field12 = Class809.Field2(var11, this.Field15);
                        var11.Field1(this.Field15, new Class794(var4, var6), var3, Class357.Field97[var3]);
                        if (Class599.Field4(this.Field15.Field93, var3 / 10)) {
                            Vector var14;
                            (var14 = new Vector()).addElement(this.Field15);
                            var11.Field58.Field2(var14);
                        }

                        if (var8 == 0) {
                            Class106.Field19.Field1(Class794.Field4[3], 0, var11.Field193, var11.Field194 - 35, 1, -2);
                        }
                    }

                    this.Field15.Field38();
                    this.Field15.Field2(var5);
                    var13 = null;

                    for (int var12 = this.Field10.size() - 1; var12 >= 0; --var12) {
                        if (((Class678) this.Field10.elementAt(var12)).Field189 == var1) {
                            return;
                        }
                    }

                    return;
                }

                if ((var11 = (Class357) this.Field2(var2)) != null) {
                    var11.Field2(var5);
                    if (var5 == 0) {
                        var11.Field204 = 3;
                    }

                    if (var8 == 0) {
                        Class106.Field19.Field1(Class794.Field4[3], 0, var11.Field193, var11.Field194 - 35, 1, -2);
                    }
                }

                if ((var13 = (Class357) this.Field2(var1)) != null) {
                    var13.Field12 = Class809.Field2(var13, var11);
                    var13.Field1(var11, new Class794(var4, var6), var3, var9);
                }
            }

        }
    }

    public final void Field1(Class85 var1) {
        try {
            short var2 = var1.Field2().readShort();
            byte var3 = var1.Field2().readByte();
            int var4 = var1.Field2().readInt();
            byte var5 = var1.Field2().readByte();
            byte var6 = var1.Field2().readByte();
            byte var7 = var1.Field2().readByte();
            Class357 var8 = (Class357) this.Field2(var2);
            byte var9 = var1.Field2().readByte();
            Vector var10 = new Vector();

            for (int var11 = 0; var11 < var9; ++var11) {
                try {
                    Class126 var12 = this.Field14(var1.Field2().readShort());
                    int var13 = var1.Field2().readInt();
                    if (var12 != null) {
                        var10.addElement(var12);
                        var12.Field2(var13);
                        if (var13 <= 0) {
                            var13 = 0;
                            int var14 = 0;
                            if (var8 != null) {
                                var13 = var12.Field193 - var8.Field193 << 1;

                                for (var14 = var12.Field194 - var8.Field194 << 1; var13 > 10 || var14 > 10 || var13 < -10 || var14 < -10; var14 >>= 1) {
                                    var13 >>= 1;
                                }
                            }

                            var12.Field1(var13, var14);
                        }

                        Class794.Field1(var5, var12.Field193, var12.Field194 - 25);
                        if (var4 > 0) {
                            Class106.Field19.Field1("-" + var4, 0, var12.Field193, var12.Field194 - 15, 1, -2);
                        }

                        if (var7 == 0) {
                            Class106.Field19.Field1(Class794.Field4[3], 0, var12.Field193, var12.Field194 - 35, 1, -2);
                        }
                    }
                } catch (Exception var15) {
                    (new StringBuffer("LOI TRONG HAM onAttackMultiTarget()")).append(var15.toString()).toString();
                }
            }

            if (this.Field15.Field189 == var2) {
                if (this.Field15.Field90 == 0) {
                    this.Field15.Field90 = var4;
                }

                if (var4 > 0) {
                    Class106.Field19.Field1("-" + var4, 0, ((Class126) var10.elementAt(0)).Field193, ((Class126) var10.elementAt(0)).Field194 - 15, 1, -2);
                }

                return;
            }

            if (var8 != null && var8.Field58 != null) {
                var8.Field1((Class126) var10.elementAt(0), new Class794(var4, var5), var3, var6);
                var8.Field58.Field1(var10);
                return;
            }
        } catch (Exception var16) {
        }

    }

    public final void Field2(short var1, short var2, byte var3, int var4, int var5, byte var6, byte var7, byte var8, byte var9) {
        if (this.Field17) {
            Class126 var13;
            if ((var13 = this.Field14(var2)) != null) {
                var13.Field2(var5);
            }

            if (this.Field15.Field189 != var1) {
                try {
                    Class357 var12;
                    if ((var12 = (Class357) this.Field2(var1)) != null && var13 != null) {
                        var12.Field12 = Class809.Field2(var12, var13);
                        var12.Field1(var13, new Class794(var4, var6), var3, var9);
                        if (var8 == 0) {
                            Class794.Field1((byte) 3, var13.Field193, var13.Field194 + 35);
                            return;
                        }
                    }
                } catch (Exception var10) {
                    var10.printStackTrace();
                }

            } else {
                if (this.Field15.Field90 == 0) {
                    this.Field15.Field90 = var4;
                }

                Class794.Field1(var6, var13.Field193, var13.Field194 - 25);
                if (var8 == 0) {
                    Class794.Field1((byte) 3, var13.Field193, var13.Field194 + 35);
                }

                if (var4 > 0) {
                    for (int var11 = 0; var11 < var7; ++var11) {
                        Class106.Field19.Field1("-" + var4, 0, var13.Field193 + (var11 % 2 == 0 ? 0 : -20), var13.Field194 - (var11 % 2 == 0 ? 20 : 30), 1, -2);
                    }
                }

            }
        }
    }

    public final void Field1(Class14 var1) {
        if (this.Field17) {
            Class126 var2;
            if ((var2 = this.Field14(var1.Field2)) != null) {
                short var5 = var1.Field1;
                Class357 var3 = (Class357) this.Field2((short) var5);
                if (var2 != null) {
                    int var9 = 0;
                    int var6 = 0;
                    if (var3 != null) {
                        var9 = var2.Field193 - var3.Field193 << 1;

                        for (var6 = var2.Field194 - var3.Field194 << 1; var9 > 10 || var6 > 10 || var9 < -10 || var6 < -10; var6 >>= 1) {
                            var9 >>= 1;
                        }
                    }

                    var2.Field1(var9, var6);
                }

                if (this.Field16 == var2) {
                    this.Field16 = null;
                }

                int var8;
                if (var1.Field4 != null) {
                    for (var8 = 0; var8 < var1.Field4.length; ++var8) {
                        Class125 var4;
                        (var4 = (Class125) Field1((byte) var1.Field4[var8].Field1, (short) var1.Field4[var8].Field2, (short) var1.Field4[var8].Field3, var1.Field4[var8].Field4, (short) var1.Field4[var8].Field5, (byte) 0, (byte) -1)).Field1(var2.Field193, var2.Field194, var4.Field193, var4.Field194);
                        this.Field10.addElement(var4);
                    }
                }

                if (this.Field15.Field189 == var1.Field1) {
                    Class794.Field1(var1.Field6, var2.Field193, var2.Field194 - 25);

                    try {
                        if (var1.Field5 > 0) {
                            if (Field98 != null && Field98.Field4()) {
                                if (Field98.Field2()) {
                                    Field98.Field1(var2.Field42, var2.a_());
                                } else if (Field98.Field3()) {
                                    Field98.Field2(Field3(this.Field15.Field22 - var2.Field22));
                                }
                            }

                            if (Field99 != null && Field99.Field4()) {
                                if (Field99.Field2()) {
                                    Field99.Field1(var2.Field42, var2.a_());
                                } else if (Field99.Field3()) {
                                    Field99.Field2(Field3(this.Field15.Field22 - var2.Field22));
                                }
                            }

                            if (Field100 != null && Field100.Field4()) {
                                if (Field100.Field2()) {
                                    Field100.Field1(var2.Field42, var2.a_());
                                } else if (Field100.Field3()) {
                                    Field100.Field2(Field3(this.Field15.Field22 - var2.Field22));
                                }
                            }

                            if (this.Field15.Field90 == 0) {
                                this.Field15.Field90 = var1.Field5;
                            }

                            if (this.Field15.Field6(var2.Field42)) {
                                this.Field1(new Class375("", "Giết " + this.Field15.Field181 + " " + var2.a_()));
                                if (Class464.Field31 != -1) {
                                    if (Class464.Field36 + 1 >= Class464.Field37) {
                                        Class464.Field31 = -1;
                                        this.Field1(new Class375("", "Hoàn thành nhiệm vụ."));
                                    } else {
                                        this.Field1(new Class375("", "Giết được " + ++Class464.Field36 + "/" + Class464.Field37));
                                    }
                                }
                            }

                            if (var1.Field5 > 0) {
                                for (var8 = 0; var8 < var1.Field7; ++var8) {
                                    Class106.Field19.Field1("-" + var1.Field5, 0, var2.Field193 + (var8 % 2 == 0 ? 0 : -20), var2.Field194 - (var8 % 2 == 0 ? 20 : 30), 1, -2);
                                }

                                return;
                            }
                        }
                    } catch (Exception var7) {
                        var7.printStackTrace();
                    }

                } else {
                    var1.Field5 = (short) (var1.Field5 / var1.Field7);
                    if ((var3 = (Class357) this.Field2(var1.Field1)) != null && var2 != null) {
                        var3.Field12 = Class809.Field2(var3, var2);
                        if (!Class599.Field4(var3.Field93, var1.Field3 / 10)) {
                            var3.Field1(var2, new Class794(var1.Field5, var1.Field6), var1.Field3, var1.Field8);
                        }
                    }

                }
            }
        }
    }

    public final void Field1(short var1, short var2) {
        this.Field10.addElement(new Class795(var1, var2));
    }

    public final Class678 Field2(short var1) {
        Field142 = true;

        for (int var2 = this.Field10.size() - 1; var2 >= 0; --var2) {
            Class678 var3;
            if ((var3 = (Class678) this.Field10.elementAt(var2)).Field188 == 0 && var3.Field189 == var1) {
                Field142 = false;
                return var3;
            }
        }

        Field142 = false;
        return null;
    }

    private Class126 Field14(short var1) {
        Field144 = true;
        Class678 var2 = null;

        for (int var3 = this.Field10.size() - 1; var3 >= 0; --var3) {
            if ((var2 = (Class678) this.Field10.elementAt(var3)).Field188 == 1 && var2.Field189 == var1) {
                Field144 = false;
                return (Class126) var2;
            }
        }

        Field144 = false;
        return null;
    }

    public final Class678 Field3(short var1) {
        Class678 var2 = null;

        for (int var3 = this.Field10.size() - 1; var3 >= 0; --var3) {
            if ((var2 = (Class678) this.Field10.elementAt(var3)).Field189 == var1) {
                return var2;
            }
        }

        return null;
    }

    private Class678 Field4(short var1, byte var2) {
        Class678 var3 = null;

        for (int var4 = this.Field10.size() - 1; var4 >= 0; --var4) {
            if ((var3 = (Class678) this.Field10.elementAt(var4)).Field189 == var1 && var3.Field188 == var2) {
                return var3;
            }
        }

        return null;
    }

    private Class125 Field1(short var1, int var2) {
        for (int var3 = this.Field10.size() - 1; var3 >= 0; --var3) {
            Class678 var4;
            if ((var4 = (Class678) this.Field10.elementAt(var3)).Field188 == var2 && var4.Field189 == var1) {
                return (Class125) var4;
            }
        }

        return null;
    }

    public final void Field10() {
        Class379.Field1().Field2();
        this.Field15.Field163 = System.currentTimeMillis();
        if (this.Field15.Field68 <= 0) {
            this.Field15.Field68 = Class357.Field160[this.Field15.Field93];
        }

        if (this.Field15.Field22 == 1 && this.Field15.Field96 == 0) {
            this.Field173 = true;
            this.Field15.Field32 = this.Field15.Field33 = this.Field15.Field34 = true;
        }

        if (this.Field15.Field20 > 0 || this.Field15.Field21 > 0) {
            boolean var1 = false;
            byte var2;
            if (this.Field15.Field20 > this.Field15.Field21) {
                var2 = 21;
            } else {
                var2 = 36;
            }

            this.Field15.Field148 = new Class177(this.Field15.Field193, this.Field15.Field194, var2);
        }

        this.Field15.Field18();
        Class752.Field5().Field6();
    }

    public final void Field1(Class184 var1) {
        if (this.Field17) {
            Class126 var2;
            if ((var2 = this.Field14(var1.Field1)) != null) {
                var2.Field1(var1);
            }

        }
    }

    public final void Field4(short var1) {
        if (this.Field17) {
            Class678 var2 = null;

            for (int var3 = 0; var3 < this.Field10.size(); ++var3) {
                if ((var2 = (Class678) this.Field10.elementAt(var3)).Field188 == 0 && var2.Field189 == var1) {
                    var2.Field187 = true;
                    return;
                }
            }

        }
    }

    public final void Field2(Class85 var1) {
        try {
            short var2 = var1.Field2().readShort();
            byte var3 = var1.Field2().readByte();
            Class126 var12;
            if ((var12 = this.Field14(var2)) != null) {
                byte var4 = var1.Field2().readByte();
                Vector var5 = new Vector();

                int var6;
                for (var6 = 0; var6 < var4; ++var6) {
                    short var7 = var1.Field2().readShort();
                    Class114 var8;
                    if ((var8 = (Class114) this.Field3(var7)) != null) {
                        var8.Field18 = var1.Field2().readInt();
                        int var9 = var1.Field2().readInt();
                        if (this.Field15.Field189 == var7) {
                            if (this.Field15.Field161) {
                                this.Field15.Field204 = 0;
                                this.Field15.Field161 = false;
                            }

                            this.Field15.Field2 = this.Field15.Field4 = var9;
                            var12.Field12 = Class809.Field2(var12, this.Field15);
                            if (this.Field16 == null) {
                                this.Field16 = var12;
                            }

                            var5.addElement(this.Field15);
                        } else {
                            if (var12.Field42 != 90) {
                                var12.getClass();
                            }

                            if (var8 != null) {
                                var8.Field2 = var8.Field4 = var9;
                                if (var8.Field4 <= 0) {
                                    ((Class357) var8).Field204 = 3;
                                }

                                var12.Field12 = Class809.Field2(var12, var8);
                            }

                            var5.addElement(var8);
                        }
                    } else {
                        var1.Field2().readInt();
                        var1.Field2().readInt();
                    }
                }

                var12.Field1(var5, var3);

                try {
                    var6 = var1.Field2().readUnsignedByte();
                    var12.Field11(var6);
                    int var13 = var1.Field2().readUnsignedByte();
                    var12.Field12(var13);
                    return;
                } catch (Exception var10) {
                    return;
                }
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }

    }

    public final void Field1(short var1, short var2, int var3, int var4) {
        if (this.Field17) {
            Class126 var5;
            if ((var5 = this.Field14(var1)) != null) {
                if (var2 == 32001) {
                    var5.Field18();
                    return;
                }

                if (var5.Field42 != 84) {
                    var5.Field21();
                }

                Vector var7;
                if (this.Field15.Field189 == var2) {
                    var5.Field1((Class114) this.Field15);
                    if (this.Field15.Field161) {
                        this.Field15.Field204 = 0;
                        this.Field15.Field161 = false;
                    }

                    this.Field15.Field2 = this.Field15.Field4 = var4;
                    if (var5.Field42 == 90) {
                        this.Field1(var3 != 0 ? "-" + var3 : "MISS", var3 == 0 ? 0 : 4, this.Field15.Field193, this.Field15.Field194 - 40, 0, -1);
                        var5.Field1(this.Field15, var3, (byte) 8, (byte) 4);
                        if (this.Field15.Field4 <= 0) {
                            this.Field15.Field204 = 3;
                        }

                        return;
                    }

                    var5.Field12 = Class809.Field2(var5, this.Field15);
                    if (this.Field16 == null) {
                        this.Field16 = var5;
                    }

                    if (Class809.Field4(this.Field15.Field193 - var5.Field193) + Class809.Field4(this.Field15.Field194 - var5.Field194) < 48) {
                        this.Field15.Field13();
                        this.Field1(var3 != 0 ? "-" + var3 : "MISS", var3 == 0 ? 0 : 4, this.Field15.Field193, this.Field15.Field194 - 40, 0, -1);
                        if (var5.Field42 != 90) {
                            Class73.Field1(this.Field15.Field193, this.Field15.Field194 - 10, 9);
                        }

                        if (this.Field15.Field4 <= 0) {
                            this.Field15.Field204 = 3;
                        }
                    } else if (var5.Field42 != 90) {
                        Field1((int) 20, (Class114) var5, (Class114) this.Field15, (int) var5.Field193, var5.Field194, var3, (byte) 0);
                    }

                    this.Field15.Field38();
                    if (var5.Field42 == 84) {
                        (var7 = new Vector()).addElement(this.Field15);
                        var5.Field1(var7, (byte) 0);
                        return;
                    }
                } else {
                    Class357 var6;
                    if ((var6 = (Class357) this.Field2(var2)) != null) {
                        var5.Field1((Class114) var6);
                        var6.Field2 = var6.Field4 = var4;
                        if (var6.Field4 <= 0) {
                            var6.Field204 = 3;
                        }

                        var5.Field12 = Class809.Field2(var5, var6);
                        var6.Field13();
                        this.Field1(var3 != 0 ? "-" + var3 : "MISS", var3 == 0 ? 0 : 4, var6.Field193, var6.Field194 - 40, 0, -1);
                        if (var5.Field42 == 90) {
                            var5.Field1(var6, var3, (byte) 8, (byte) 4);
                            return;
                        }

                        Class73.Field2.addElement(new Class177(var6.Field193, var6.Field194 - 10, 9));
                        if (var5.Field42 == 84) {
                            (var7 = new Vector()).addElement(var6);
                            var5.Field1(var7, (byte) 0);
                        }
                    }
                }
            }

        }
    }

    public final void Field11() {
        System.currentTimeMillis();
        this.Field151 = 30;
    }

    public static void Field12() {
        Class106.Field2("Xin chờ..", true);
    }

    public final void Field13() {
        Class106.Field1("Không thể kết nối. Vui lòng chọn server khác", new Class9(this));
    }

    public final void Field14() {
        if (Class106.Field17 != Class106.Field22) {
            if (Field71) {
                Field71 = false;
                Class106.Field38.Field2.Field1();
                return;
            }

            Field71 = false;
            Class106.Field24.Field1((String) "Bị ngắt kết nối.", (Class86) null, new Class86("OK", new Class8(this)), (Class86) null);
            Class106.Field23 = Class106.Field24;
        }

    }

    public final void Field1(short var1, short var2, short var3, short var4, String var5, byte[] var6) {
        (new StringBuffer("onMap: ")).append(var1).toString();
        Class106.Field7();
        this.Field15.Field49 = null;
        this.Field15.Field169 = null;
        this.Field16 = null;
        this.Field199.removeAllElements();
        Field198 = null;
        Field141 = null;
        this.Field159.removeAllElements();
        if (Field61 != null) {
            Field61.removeAllElements();
        }

        Field49 = null;
        if ((var4 = var4) == -1) {
            var4 = var1;
        }

        if (var2 != -1 && var3 != -1) {
            this.Field15.Field193 = this.Field15.Field74 = (short) ((var2 << 4) + 8);
            this.Field15.Field194 = this.Field15.Field75 = (short) ((var3 << 4) + 8);
            Class582 var10000;
            if (this.Field15.Field193 / 16 <= 1) {
                var10000 = this.Field15;
                var10000.Field193 = (short) (var10000.Field193 + 32);
            }

            if (this.Field15.Field194 / 16 <= 1) {
                var10000 = this.Field15;
                var10000.Field194 = (short) (var10000.Field194 + 32);
            }

            this.Field15.Field74 = this.Field15.Field193;
            this.Field15.Field75 = this.Field15.Field194;
            if (this.Field15.Field152 != null) {
                Field2(this.Field15.Field152, this.Field15);
            }
        }

        boolean var8 = false;
        this.Field10.removeAllElements();
        if (this.Field15 != null) {
            this.Field10.addElement(this.Field15);
        }

        if (this.Field83 != var1) {
            var8 = true;
            this.Field83 = var1;
            Class811.Field45.Field1(var4, new Class10(this), var6);
        }

        if (var4 == 107) {
            this.Field15.Field146 = 1;
            this.Field15.Field162 = 1;
            this.Field15.Field143 = System.currentTimeMillis();
        } else if (var4 == 10) {
            this.Field15.Field146 = -1;
            this.Field15.Field162 = -1;
            if (this.Field15.Field121[20] > 0) {
                int var10002 = this.Field15.Field121[20]--;
            }
        }

        if (var4 != 201) {
            Field54 = null;
        }

        this.Field15.Field204 = 0;
        this.Field15.Field161 = false;

        try {
            if (Class106.Field22 != null) {
                Class106.Field22 = null;
                Class185.Field1 = null;
                Class106.Field29 = null;
                Class774.Field7();
            }

            Class106.Field23 = null;
            Class106.Field5();
            Class106.Field6();
            Class455.Field1(var4);
            Field1 = var5;
            if (!var8) {
                Class106.Field19.Field1();
                this.Field32();
                this.Field15();
            }
        } catch (Exception var7) {
        }

        Field145[0] = new Class717();
    }

    public final void Field15() {
        int var1 = this.Field196.size();
        Class348 var2 = null;

        for (int var3 = 0; var3 < var1; ++var3) {
            var2 = (Class348) this.Field196.elementAt(var3);
            if (!this.Field10.contains(var2)) {
                this.Field10.addElement(var2);

                for (int var4 = 0; var4 < var2.Field2 / 2; ++var4) {
                    int var5;
                    if ((var5 = var2.Field194 / 16 * Class455.Field1 + (var2.Field193 / 16 - var4)) < Class455.Field7.length) {
                        Class455.Field7[var5] = 2;
                    }

                    if ((var5 = var2.Field194 / 16 * Class455.Field1 + var2.Field193 / 16 + var4) < Class455.Field7.length) {
                        Class455.Field7[var5] = 2;
                    }

                    for (var5 = 0; var5 < var2.Field3 / 2; ++var5) {
                        int var6;
                        if ((var6 = (var2.Field194 / 16 - var5) * Class455.Field1 + (var2.Field193 / 16 - var4)) < Class455.Field7.length) {
                            Class455.Field7[var6] = 2;
                        }

                        if ((var6 = (var2.Field194 / 16 - var5) * Class455.Field1 + var2.Field193 / 16 + var4) < Class455.Field7.length) {
                            Class455.Field7[var6] = 2;
                        }
                    }
                }
            }
        }

        this.Field196.removeAllElements();
    }

    private void Field32() {
        if (Class357.Field97[0] == 0 && (Class455.Field10 != 0 || Class455.Field10 != 101) && Class455.Field10 != 105 && Field48 == 0) {
            Field48 = 1;
            Class106.Field1("Bạn có muốn hệ thống tự động làm nhiệm vụ cho bạn hay không ?", new Class15(this), new Class16(this));
        }

    }

    public final void Field3(String var1) {
        if (var1.startsWith("1")) {
            Class106.Field1(var1.substring(1), new Class20(this));
        } else {
            Class106.Field1(var1);
        }
    }

    public final void Field1(String var1, String[] var2, short[] var3, String[] var4) {
        Class106.Field7();
        Class106.Field1(var1, new Class58(this, var2, var3, var4));
    }

    public final void Field1(short var1, Vector var2, byte var3, byte var4, String var5, Class145 var6, short[] var7, byte var8) {
        if (var1 == this.Field15.Field189) {
            this.Field15.Field94 = var3;
            this.Field15.Field1(var2);
            this.Field15.Field63 = var4;
            this.Field15.Field66 = var5;
            this.Field15.Field153 = var7;
            this.Field15.Field64 = var8;
            if (var6 != null) {
                var6.Field40 = this.Field15.Field189;
                this.Field1((Class145) var6, (Class357) this.Field15);
                return;
            }

            if (this.Field15.Field152 != null) {
                this.Field15.Field152.Field32 = 3;
                this.Field15.Field152.Field48 = 20;
                return;
            }
        } else {
            Class357 var9;
            if ((var9 = (Class357) this.Field2(var1)) != null) {
                var9.Field94 = var3;
                var9.Field1(var2);
                var9.Field63 = var4;
                var9.Field66 = var5;
                var9.Field153 = var7;
                var9.Field64 = var8;
                if (var6 != null) {
                    var6.Field40 = var9.Field189;
                    this.Field1(var6, var9);
                    return;
                }

                if (var9.Field152 != null) {
                    var9.Field152.Field32 = 3;
                    var9.Field152.Field48 = 20;
                }
            }
        }

    }

    private void Field1(Class145 var1, Class357 var2) {
        if (var1.Field43 == 5) {
            this.Field15(var2.Field189);
            Class124 var7 = new Class124(var2, var1.Field44);
            Field2(var1, var2);
            this.Field10.addElement(var7);
        } else {
            this.Field15(var2.Field189);
            int var3 = this.Field10.size();

            for (int var4 = 0; var4 < var3; ++var4) {
                Class678 var5;
                Class145 var6;
                if ((var5 = (Class678) this.Field10.elementAt(var4)) != null && var5.Field188 == var1.Field188 && !var5.g_() && (var6 = (Class145) var5).Field40 == var1.Field40) {
                    var6.Field43 = var1.Field43;
                    var6.Field44 = var1.Field44;
                    var6.Field38 = var1.Field38;
                    var6.Field50 = var1.Field50;
                    var6.Field47 = var1.Field47;
                    var6.Field49 = var1.Field49;
                    Field2(var6, var2);
                    return;
                }
            }

            var1.Field18();
            Field2(var1, var2);
            this.Field10.addElement(var1);
        }
    }

    private void Field15(short var1) {
        for (int var2 = 0; var2 < this.Field10.size(); ++var2) {
            Class678 var3;
            if ((var3 = (Class678) this.Field10.elementAt(var2)) != null && var3.Field188 == 12 && var3.Field189 == var1 && var3.g_()) {
                this.Field10.removeElement(var3);
            }
        }

    }

    private static void Field2(Class145 var0, Class357 var1) {
        var0.Field37 = 1;
        var0.Field36 = 1;
        var0.Field41 = var1;
        var1.Field152 = var0;
        var0.Field193 = var0.Field34 = var1.Field12 != 2 && var1.Field12 != 1 ? (short) (var1.Field193 - 20) : (short) (var1.Field193 + 20);
        var0.Field194 = var0.Field35 = var1.Field194;
        if (var0.Field43 != 1) {
            var0.Field39 = (short) (-var1.Field195 + 15);
        } else {
            var0.Field39 = 0;
        }

        var0.Field42 = (byte) var1.Field17;
        var0.Field32 = 0;
        var0.Field45 = var0.Field46 = 0;
        var0.Field18();
    }

    public final void Field1(short var1, Vector var2, Image var3, byte var4, int var5, int var6, byte var7) {
        if (var1 == this.Field15.Field189) {
            this.Field15.Field103 = var3;
            this.Field15.Field120 = var4;
            this.Field15.Field91 = var5;
            this.Field15.Field92 = var6;
            this.Field15.Field95 = var7;
            this.Field15.Field2(var2);
        } else {
            Class357 var8;
            if ((var8 = (Class357) this.Field2(var1)) != null) {
                var8.Field103 = var3;
                var8.Field120 = var4;
                var8.Field91 = var5;
                var8.Field92 = var6;
                var8.Field95 = var7;
                var8.Field2(var2);
                Class464.Field5().Field1(0, false, new byte[]{31});
                Class464.Field39 = var8;
                Class464.Field5().Field1();
                Class464.Field5().Field11 = "Trang bị thú";
                Class106.Field7();
            }

        }
    }

    public final void Field1(long var1, int[] var3, Vector var4, Vector var5, int var6) {
        this.Field15.Field1(var1, var3, var4, var5, var6);
        this.Field33();
        if (Class106.Field17 == Class464.Field5() && Class464.Field22[Class464.Field21] == 0) {
            Class464.Field5().Field41 = true;
            Class752.Field5();
            Class752.Field2(0);
            Class464.Field5().Field41 = false;
        }

    }

    public static int Field3(int var0) {
        return var0 > 0 ? var0 : -var0;
    }

    public final void Field1(short var1, Class534 var2) {
        short var4 = var2.Field11;
        Class62 var3 = this;
        Class678 var5 = null;
        int var6 = this.Field10.size() - 1;

        Class265 var10000;
        while (true) {
            if (var6 < 0) {
                var10000 = null;
                break;
            }

            if ((var5 = (Class678) var3.Field10.elementAt(var6)).Field188 == 3 && var5.Field189 == var4) {
                var10000 = (Class265) var5;
                break;
            }

            --var6;
        }

        Class265 var7 = var10000;
        if (var10000 != null) {
            Class357 var8;
            if ((var8 = (Class357) this.Field2(var1)) != null) {
                if (var8 == this.Field15) {
                    this.Field1(new Class375("", "Nhặt được " + var7.a_()));
                }

                var7.Field2(var8.Field193, var8.Field194);
            }

            var7.Field187 = true;
        }

        if (var1 == this.Field15.Field189) {
            Class357.Field125.addElement(var2);
            if (this.Field15.Field32) {
                Class106.Field1("Bạn vừa nhặt được một món đồ.", false, 10);
                this.Field15.Field32 = false;
            }
        }

    }

    public final void Field1(short var1, short var2, short var3, short var4) {
        Class300 var6;
        if ((var6 = (Class300) this.Field1((short) var2, (int) 4)) != null) {
            Class357 var5;
            if ((var5 = (Class357) this.Field2(var1)) != null) {
                if (var5 == this.Field15) {
                    this.Field1("+" + var4 + var6.Field10().toLowerCase(), 2, this.Field15.Field193 - 10, this.Field15.Field194 - 30, 1, -1);
                    if (this.Field15.Field7(var6.Field3)) {
                        this.Field1(new Class375("", "Nhặt " + this.Field15.Field181 + " " + var6.Field10()));
                    }
                }

                var6.Field2(var5.Field193, var5.Field194);
            } else {
                var6.Field187 = true;
            }
        }

        if (var1 == this.Field15.Field189) {
            if (var3 == 0) {
                Class582 var10000 = this.Field15;
                var10000.Field122 += (long) var4;
            } else {
                int[] var7 = this.Field15.Field121;
                var7[var3] += var4;
            }

            if (var3 == 0) {
                if (this.Field15.Field33) {
                    Class106.Field1("Bạn vừa nhặt được xu Bạn có thể dùng xu để mua HP, MP và đồ dùng khác.", false, 1);
                    this.Field15.Field33 = false;
                    return;
                }
            } else {
                if (Field36 != -1 && Field36 == var3) {
                    if (++Class464.Field36 >= Class464.Field37) {
                        Field36 = -1;
                        this.Field1(new Class375("", "Hoàn thành nhiệm vụ."));
                    } else {
                        this.Field1(new Class375("", "Nhặt được: " + Class464.Field36 + "/" + Class464.Field37));
                    }
                }

                if (this.Field15.Field34) {
                    Class106.Field1("Bạn vừa nhặt được một vật phẩm dùng được. Xin vào mục hành trang để xem.", false, 1);
                    this.Field15.Field34 = false;
                }
            }
        }

    }

    public final void Field1(short var1, short var2, byte var3) {
        Class39 var5;
        if ((var5 = (Class39) this.Field1((short) var2, (int) var3)) != null) {
            Class357 var4;
            if ((var4 = (Class357) this.Field2(var1)) != null) {
                var5.Field2(var4.Field193, var4.Field194);
                return;
            }

            var5.Field187 = true;
        }

    }

    public final void Field2(short var1, short var2, byte var3) {
        Class115 var5;
        if ((var5 = (Class115) this.Field1((short) var2, (int) 14)) != null) {
            Class357 var4;
            if ((var4 = (Class357) this.Field2(var1)) != null) {
                var5.Field2(var4.Field193, var4.Field194);
            } else {
                var5.Field187 = true;
            }

            if (this.Field15.Field189 == var1) {
                if (Field98 != null && Field98.Field4()) {
                    Field98.Field1(var3);
                }

                if (Field99 != null && Field99.Field4()) {
                    Field99.Field1(var3);
                }

                if (Field100 != null && Field100.Field4()) {
                    Field100.Field1(var3);
                }
            }
        }

    }

    private void Field1(Vector var1, Class534 var2) {
        Class534 var3;
        if ((var3 = Field1(var1, var2.Field9)) != null) {
            var3.Field32 = true;
            var3.Field30 = var2.Field30;
            var3.Field23 = var2.Field23;
            var3.Field33 = var2.Field33;
            var3.Field34 = var2.Field34;
            var3.Field20 = var2.Field20;
            var3.Field21 = var2.Field21;
            var3.Field24 = System.currentTimeMillis();
            var3.Field29 = var2.Field29;
            if (var2.Field19 > -1) {
                var3.Field19 = var2.Field19;
            }
        }

    }

    public final void Field1(Class534 var1) {
        this.Field1(Class357.Field125, var1);
        if (Class464.Field39 != null) {
            this.Field1(Class464.Field39.Field98, var1);
            if ((Class464.Field39.Field167 != -1 || Class464.Field39.Field106 > -1) && Class464.Field39.Field99 != null && Class464.Field39.Field99.size() > 0) {
                this.Field1(Class464.Field39.Field99, var1);
            }
        }

        this.Field1(this.Field15.Field40, var1);
        this.Field1(this.Field15.Field41, var1);
        this.Field1(Class357.Field128, var1);
        this.Field1(Class464.Field5().Field26, var1);
        if (Class464.Field5().Field30 != null && Class464.Field5().Field30.size() > 0) {
            this.Field1(Class464.Field5().Field30, var1);
        }

        if (Class106.Field17 == Class464.Field5()) {
            Class464.Field5().Field19();
            if (Class464.Field22[Class464.Field21] != 21 && Class464.Field22[Class464.Field21] != 25) {
                if (Class464.Field22[Class464.Field21] == 32) {
                    Class464.Field5().Field18();
                } else {
                    Class464.Field5().Field104.Field2.Field1();
                }
            } else {
                Class464.Field5().Field12();
            }
        } else if (Class106.Field17 == Class352.Field5()) {
            Class352.Field5().Field7(var1.Field9);
        } else {
            if (Class106.Field17 == Class106.Field36) {
                Class106.Field36.Field13();
            }

        }
    }

    public final void Field1(short var1, int var2, int var3) {
        Class357 var4;
        if ((var4 = (Class357) this.Field2(var1)) != null) {
            if (var2 == 1) {
                var4.Field200 = (byte) var3;
            } else {
                var4.Field200 = 0;
            }
        }
    }

    public final void Field1(short var1, byte var2, short var3, int var4, int var5) {
        Class357 var6;
        if ((var6 = (Class357) this.Field2(var1)) != null) {
            if (var4 <= 0) {
                var6.Field4 = 0;
                var6.Field2 = 0;
                var6.Field204 = 3;
            } else {
                switch (var2) {
                    case 1:
                    case 2:
                    case 3:
                    case 21:
                    case 22:
                        if (var6.Field4 < var4) {
                            var6.Field4 = var6.Field2 = var4;
                        }

                        this.Field1(var3 > 0 ? "hp+" : "hp" + var3, 4, var6.Field193 - 10, var6.Field194 - 30, 0, -1);
                        return;
                    case 4:
                    case 5:
                    case 6:
                    case 23:
                    case 24:
                        if (var6.Field130 < var4) {
                            var6.Field130 = var4;
                        }

                        this.Field1(var3 > 0 ? "mp+" : "mp" + var3, 3, var6.Field193 - 10, var6.Field194 - 40, 0, -1);
                    case 34:
                    case 82:
                    case 85:
                        if (var5 == 1) {
                            if (var6.Field4 < var4) {
                                var6.Field4 = var6.Field2 = var4;
                            }

                            this.Field1(var3 > 0 ? "hp+" : "hp" + var3, 4, var6.Field193 - 10, var6.Field194 - 30, 0, -1);
                            return;
                        } else {
                            if (var6.Field130 < var4) {
                                var6.Field130 = var4;
                            }

                            this.Field1(var3 > 0 ? "mp+" : "mp" + var3, 3, var6.Field193 - 10, var6.Field194 - 40, 0, -1);
                        }
                    default:
                }
            }
        }
    }

    private static Class534 Field1(Vector var0, short var1) {
        int var2 = var0.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class534 var4;
            if ((var4 = (Class534) var0.elementAt(var3)).Field9 == var1) {
                return var4;
            }
        }

        return null;
    }

    public final void Field5(short var1) {
        Class534 var2;
        if ((var2 = Field1(Class357.Field125, var1)) != null) {
            Class357.Field125.removeElement(var2);
            if (Class357.Field1(Class357.Field128, var2) == -1) {
                Class357.Field128.addElement(var2);
            }

        } else {
            if (Class464.Field5() == Class106.Field17 && Class464.Field22[Class464.Field21] == 22) {
                Class464.Field5().Field2(0);
            }

        }
    }

    public final void Field6(short var1) {
        Class534 var2;
        if ((var2 = Field1(Class357.Field128, var1)) != null) {
            Class357.Field128.removeElement(var2);
            if (Class357.Field1(Class357.Field125, var2) == -1) {
                Class357.Field125.addElement(var2);
            }

        }
    }

    public final void Field1(Vector var1) {
        Class357.Field128 = var1;
        Field1(0, true, new byte[]{22});
    }

    public final void Field1(byte[] var1) {
        this.Field21.removeAllElements();
        int var2 = var1.length;
        Class534 var3 = null;

        for (int var4 = 0; var4 < var2; ++var4) {
            (var3 = new Class534()).Field7 = 4;
            var3.Field12 = var1[var4];
            var3.Field32 = true;
            var3.Field27 = true;
            this.Field21.addElement(var3);
        }

        Field1(1, true, new byte[]{0, 19});
    }

    public final void Field16() {
        this.Field21.removeAllElements();
        int var1 = Class811.Field5.size();
        Class750 var2 = null;

        for (int var3 = 0; var3 < var1; ++var3) {
            if ((var2 = (Class750) Class811.Field5.elementAt(var3)).Field17) {
                this.Field21.addElement(var2);
            }
        }

        Field1(1, true, new byte[]{0, 10});
    }

    public final void Field2(Vector var1) {
        this.Field21 = var1;
        Class805 var2;
        if (((var2 = Class811.Field2((int) ((Class534) var1.elementAt(0)).Field18)).Field3 <= 2 || var2.Field3 >= 8) && (var2.Field3 < 14 || var2.Field3 > 18)) {
            Class464.Field5().Field1(0, true, new byte[]{11, 12, 13, 14, 15, 16, 17, 18, 0});
        } else {
            Class464.Field5().Field1(1, true, new byte[]{0, 9});
        }

        Class464.Field5().Field1();
    }

    public final void Field1(short var1, String var2) {
        Class678 var3;
        if ((var3 = this.Field3(var1)) != null) {
            var3.Field209 = null;
            if (var3 instanceof Class357) {
                if (((Class357) var3).Field25 != -1) {
                    Field1((Class678) var3, (String) var2, 500);
                    return;
                }

                Field1((Class678) var3, (String) var2, 50);
                Class104.Field5().Field1(((Class357) var3).Field65 + ": " + var2, (String) null);
                return;
            }

            Field1((Class678) var3, (String) var2, 50);
        }

    }

    public final void Field7(short var1) {
        Class534 var2;
        if ((var2 = Field1(Class357.Field125, var1)) != null) {
            Class357.Field125.removeElement(var2);
            Class805 var3 = Class811.Field2((int) var2.Field18);
            Class582 var10000 = this.Field15;
            var10000.Field122 += (long) (var3.Field10 / 5);
            Class106.Field1("Đã bán thành công.", false);
        }

    }

    public final void Field8(short var1) {
        Class272 var2;
        if ((var2 = Class272.Field2(var1)) != null) {
            --var2.Field3;
            if (var2.Field3 <= 0) {
                Class582.Field37.removeElement(var2);
                Class750 var3 = Class811.Field1(var2.Field1);
                Class582 var10000 = this.Field15;
                var10000.Field122 += (long) (var3.Field18 / 5);
                Class106.Field1("Đã bán thành công.");
            }
        }

    }

    public final void Field1(short var1, short var2, Class234 var3) {
        Class534 var4;
        Class125 var5;
        if ((var4 = Field1(Class357.Field125, var2)) != null) {
            Class357.Field125.removeElement(var4);
            (var5 = (Class125) Field1((byte) var3.Field1, (short) var3.Field2, (short) var3.Field3, var3.Field4, (short) var3.Field5, (byte) 0, (byte) -1)).Field1(this.Field15.Field193, this.Field15.Field194, var5.Field193, var5.Field194);
            this.Field10.addElement(var5);
            if (this.Field15.Field189 == var1) {
                Class106.Field1("Đã bỏ vật phẩm ra đất.");
            }

        } else {
            (var5 = (Class125) Field1((byte) var3.Field1, (short) var3.Field2, (short) var3.Field3, var3.Field4, (short) var3.Field5, (byte) 0, (byte) -1)).Field1(this.Field15.Field193, this.Field15.Field194, var5.Field193, var5.Field194);
            this.Field10.addElement(var5);
        }
    }

    public final void Field1(short var1, short var2, int var3) {
        Class357 var4;
        if ((var4 = (Class357) this.Field2(var1)) != null) {
            var4.Field96 = var2;
            this.Field1("+" + var3 + "xp", 2, var4.Field193, var4.Field194 - 30, -1, -1);
        }

    }

    public final void Field1(short var1, Class797[] var2) {
        Class357 var3;
        if ((var3 = (Class357) this.Field2(var1)) != null) {
            for (int var4 = 0; var4 < var2.length; ++var4) {
                var3.Field1(var2[var4]);
            }
        }

    }

    public final void Field1(short var1, byte var2, int var3, int var4) {
        Class357 var5;
        if ((var5 = (Class357) this.Field2(var1)) != null) {
            var5.Field22 = var2;
            var5.Field132 = 30;
            var5.Field12 = 0;
            var5.Field5 = var3;
            var5.Field129 = var4;
            var5.Field4 = var3;
            var5.Field130 = var4;
            var5.Field2 = var5.Field4;
            this.Field1("level-up", 3, var5.Field193, var5.Field194 - 30, -1, 1);
            this.Field1("level-up", 3, var5.Field193, var5.Field194 - 30, 1, -1);
            this.Field1("level-up", 3, var5.Field193, var5.Field194 - 30, -1, -1);
            this.Field1("level-up", 3, var5.Field193, var5.Field194 - 30, 1, 1);
            if (var5 != null) {
                Class73.Field1(var5.Field193, var5.Field194 - 30, 18);
            }

            if (var5 == this.Field15) {
                this.Field1(new Class375("", "Đạt được level " + var2));
                if (var2 == 2) {
                    Class106.Field1("Xin chúc mừng! Bạn vừa lên cấp. Chọn menu, nhân vật để tăng điểm tiềm năng và kỹ năng", false, 20);
                }
            }

        }
    }

    public final void Field1(short var1, byte var2) {
        int var3 = this.Field10.size();
        Class678 var4 = null;

        for (int var5 = 0; var5 < var3; ++var5) {
            if ((var4 = (Class678) this.Field10.elementAt(var5)).Field188 == var2 && var4.Field189 == var1) {
                this.Field10.removeElement(var4);
                return;
            }
        }

    }

    public final void Field9(short var1) {
        this.Field15.Field191 = var1;
        this.Field15.Field192 = this.Field15.Field189;
        if (Field32 != -1) {
            this.Field28.Field5((int) Field32, (int) 0);
            Field32 = -1;
        }

    }

    public final void Field3(Class85 var1) {
        try {
            byte var2;
            byte var4;
            short var9;
            String var10;
            if ((var2 = var1.Field2().readByte()) == 0) {
                short var5 = var1.Field2().readShort();
                var9 = var1.Field2().readShort();
                var10 = var1.Field2().readUTF();
                var4 = var1.Field2().readByte();
                var1.Field2().readShort();
                Class85 var11 = new Class85((byte) 49);
                if (Field71 && Class106.Field35.Field4 && !this.Field18) {
                    try {
                        var11.Field3().writeByte(1);
                        var11.Field3().writeShort(var9);
                        this.Field28.Field1.Field1(var11);
                        var11.Field4();
                        Class582.Field1(new Class802(var9, var10, var4, var1.Field2().readByte()));
                        this.Field15.Field192 = var9;
                        this.Field15.Field191 = var5;

                        while (var1.Field2().available() > 0) {
                            Class582.Field1(new Class802(var1.Field2().readShort(), var1.Field2().readUTF(), var1.Field2().readByte(), var1.Field2().readByte()));
                        }

                        this.Field1(new Class375("", "Đã tham gia nhóm"));
                    } catch (Exception var7) {
                        var7.printStackTrace();
                    }

                    Class106.Field23 = null;
                    return;
                }

                Class106.Field1(var10 + " mời bạn tham gia nhóm.", new Class55(this, var11, var9, var10, var4, var1, var5), new Class54(this, var11, var9));
                return;
            }

            if (var2 == 1) {
                var9 = var1.Field2().readShort();
                var10 = var1.Field2().readUTF();
                var4 = var1.Field2().readByte();
                if (Class357.Field127.size() <= 0) {
                    this.Field15.Field192 = this.Field15.Field189;
                }

                Class582.Field1(new Class802(var9, var10, var4, var1.Field2().readByte()));
                this.Field1(new Class375("", var10 + " đã tham gia nhóm."));
                return;
            }

            if (var2 == 2) {
                Class106.Field1(var1.Field2().readUTF() + " từ chối vào nhóm.");
                return;
            }

            if (var2 == 3) {
                int var6 = var1.Field2().available();

                while (var6 > 0) {
                    Class802 var3 = new Class802(var1.Field2().readShort(), var1.Field2().readUTF(), var1.Field2().readByte(), var1.Field2().readByte());
                    this.Field1(new Class375("", var3.Field2 + " đã vào nhóm."));
                    Class582.Field1(var3);
                }

                return;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
        }

    }

    public final void Field4(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();
            String var3 = null;
            if (var2 == 0 || var2 == 2) {
                short var5;
                if ((var5 = var1.Field2().readShort()) == this.Field15.Field189) {
                    this.Field15.Field191 = -1;
                    this.Field15.Field192 = -1;
                    Class357.Field127.removeAllElements();
                    if (var2 == 0) {
                        this.Field1(new Class375("", "Bị đuổi khỏi nhóm"));
                        return;
                    }

                    this.Field1(new Class375("", "Rời khỏi nhóm"));
                    return;
                }

                if (!(var3 = Class582.Field2(var5)).equals("")) {
                    if (var2 == 0) {
                        this.Field1(new Class375("", var3 + " bị đuổi khỏi nhóm"));
                    } else {
                        this.Field1(new Class375("", var3 + " rời khỏi nhóm"));
                    }
                }

                if (Class357.Field127.size() <= 0) {
                    Class357.Field127.removeAllElements();
                    this.Field15.Field191 = -1;
                    this.Field15.Field192 = -1;
                    this.Field1(new Class375("", "Nhóm đã bị giải tán"));
                }

                return;
            }

            if (var2 == 1) {
                this.Field15.Field191 = -1;
                this.Field15.Field192 = -1;
                Class357.Field127.removeAllElements();
                this.Field1(new Class375("", "Nhóm đã bị giải tán"));
                return;
            }
        } catch (Exception var4) {
        }

    }

    public final void Field5(final Class85 class85) {
        try {
            final byte byte1 = class85.Field2().readByte();
            final short short1 = class85.Field2().readShort();
            if (byte1 == 2) {
                for (int i = 0; i < this.Field10.size(); ++i) {
                    final Class678 class86;
                    if ((class86 = (Class678) this.Field10.elementAt(i)).Field188 == 0 && class86.Field189 == short1) {
                        class85.Field2().read(((Class357) class86).Field133, 0, ((Class357) class86).Field133.length);
                        for (int j = 0; j < ((Class357) class86).Field133.length; ++j) {
                            ((Class357) class86).Field135[j] = class85.Field2().readShort();
                        }
                        ((Class357) class86).Field1(((Class357) class86).Field133, ((Class357) class86).Field135);
                        class85.Field2().read(((Class357) class86).Field134, 0, ((Class357) class86).Field134.length);
                        return;
                    }
                }
                return;
            }
            final byte byte2 = class85.Field2().readByte();
            final short short2 = class85.Field2().readShort();
            if (byte1 == 1) {
                final byte byte3 = class85.Field2().readByte();
                int n;
                for (n = 0; n < Class357.Field182.length && Class357.Field182[n] != byte2; ++n) {
                }
                if (short1 == ((Class678) this.Field15).Field189) {
                    if (!((Class357) this.Field15).Field5((int) byte2)) {
                        final Class829 class87;
                        (class87 = new Class829((int) ((Class678) this.Field15).Field193, (int) ((Class678) this.Field15).Field194, (int) byte2)).Field1((int) short2);
                        Class62.Field139 = class87.Field1;
                        this.Field132 = true;
                        ((Class357) this.Field15).Field134[n] = byte3;
                        ((Class357) this.Field15).Field133[n] = byte2;
                        ((Class678) this.Field15).Field213.addElement(class87);
                    }
                    return;
                }
                for (int size = this.Field10.size(), k = 0; k < size; ++k) {
                    final Class678 class88;
                    if ((class88 = (Class678) this.Field10.elementAt(k)).Field188 == 0 && class88.Field189 == short1) {
                        if (!((Class357) class88).Field5((int) byte2)) {
                            final Class829 class89;
                            (class89 = new Class829((int) class88.Field193, (int) class88.Field194, (int) byte2)).Field1((int) short2);
                            ((Class357) class88).Field134[n] = byte3;
                            ((Class357) class88).Field133[n] = byte2;
                            ((Class678) class88).Field213.addElement(class89);
                        }
                        return;
                    }
                }
            } else if (byte1 == 0) {
                for (int size2 = this.Field10.size(), l = 0; l < size2; ++l) {
                    final Class678 class90;
                    if ((class90 = (Class678) this.Field10.elementAt(l)).Field188 == 0 && class90.Field189 == short1) {
                        ((Class357) class90).Field4((int) byte2);
                        return;
                    }
                }
            }
        } catch (final Exception ex) {
            ex.printStackTrace();
        }
    }

    public final void Field4(String var1) {
        this.Field1(new Class375("", var1));
    }

    public static void Field17() {
        Class106.Field7();
    }

    public final void Field6(final Class85 class85) {
        try {
            final short short1 = class85.Field2().readShort();
            final int int1 = class85.Field2().readInt();
            final int int2 = class85.Field2().readInt();
            final short short2 = class85.Field2().readShort();
            final int int3 = class85.Field2().readInt();
            if (short1 != ((Class678) this.Field15).Field189) {
                for (int size = this.Field10.size(), i = 0; i < size; ++i) {
                    final Class678 class86;
                    if ((class86 = (Class678) this.Field10.elementAt(i)).Field188 == 0 && class86.Field189 == short1) {
                        ((Class114) class86).Field4 = int3;
                        ((Class114) class86).Field2 = int3;
                        ((Class114) class86).Field5 = int1;
                        ((Class357) class86).Field129 = int2;
                        ((Class114) class86).Field20 = short2;
                        if (((Class678) class86).Field204 == 3 && ((Class114) this.Field15).Field4 > 0) {
                            ((Class678) class86).Field204 = 0;
                            this.Field1(new Class375("", String.valueOf(((Class357) class86).Field65) + " đã được hồi sinh."));
                        }
                        return;
                    }
                }
                return;
            }
            ((Class114) this.Field15).Field5 = int1;
            ((Class357) this.Field15).Field129 = int2;
            ((Class114) this.Field15).Field20 = short2;
            ((Class114) this.Field15).Field4 = int3;
            ((Class114) this.Field15).Field2 = int3;
            if (((Class678) this.Field15).Field204 == 3 && ((Class114) this.Field15).Field4 > 0) {
                ((Class678) this.Field15).Field204 = 0;
                this.Field1(new Class375("", "Đã được hồi sinh."));
            }
        } catch (final Exception ex) {
        }
    }

    public final void Field1(int var1, int var2, short var3) {
        if (this.Field15.Field189 == var1) {
            this.Field15.Field207 = var2 == 1;
            this.Field15.Field199 = var3;
        } else {
            int var4 = this.Field10.size();
            Class678 var5 = null;

            for (int var6 = 0; var6 < var4; ++var6) {
                if ((var5 = (Class678) this.Field10.elementAt(var6)).Field188 == 0 && var5.Field189 == var1) {
                    ((Class357) var5).Field207 = var2 == 1;
                    var5.Field199 = var3;
                    return;
                }
            }

        }
    }

    public final void Field10(short var1) {
        Class357 var2;
        if ((var2 = (Class357) this.Field2(var1)) != null) {
            Class106.Field1(var2.Field65 + " đề nghị giao dịch với bạn.", new Class57(this, var1), new Class56(this, var1));
        }

    }

    public final void Field11(short var1) {
        Class357 var2 = (Class357) this.Field2(var1);
        String var3 = "Bắt đầu giao dịch";
        if (var1 != this.Field15.Field189 && var2 != null) {
            var3 = var2.Field65 + " đồng ý giao dịch";
        }

        this.Field1(new Class375("", var3));
        this.Field33();
        Class464.Field5().Field1(0, true, new byte[]{8});
        Class464.Field5().Field1(108, 90, 6, 6, 18, 18);
        Class464.Field5().Field1();
    }

    public final void Field12(short var1) {
        Class357 var3 = (Class357) this.Field2(var1);
        String var2 = "";
        if (var3 != null) {
            var2 = var3.Field65;
        }

        this.Field1(new Class375("", var2 + " không đồng ý giao dịch"));
        this.Field33();
    }

    public final void Field1(short var1, Class85 var2, byte var3) {
        try {
            if (var3 == 0) {
                Class534 var8 = new Class534();
                (var8).Field13 = var8.Field30 = var2.Field2().readByte();
                var8.Field9 = var2.Field2().readShort();
                var8.Field11 = var8.Field9;
                var8.Field18 = var2.Field2().readShort();
                var8.Field19 = var2.Field2().readByte();
                var8.Field25 = var2.Field2().readByte();
                var8.Field21 = var2.Field2().readShort();
                var8.Field22 = var2.Field2().readShort();
                byte var4 = var2.Field2().readByte();

                for (byte var5 = 0; var5 < var4; ++var5) {
                    Class826 var6 = new Class826((short) var2.Field2().readUnsignedByte(), var2.Field2().readShort());
                    var8.Field34.addElement(var6);
                }

                var8.Field37 = var2.Field2().readByte();
                var8.Field14 = var2.Field2().readByte();
                var8.Field16 = var2.Field2().readByte();
                var8.Field17 = var2.Field2().readByte();
                var8.Field32 = true;
                int var10;
                if (var1 == this.Field15.Field189) {
                    if ((var10 = Class357.Field1(this.Field15.Field40, var8)) == -1) {
                        this.Field15.Field40.addElement(var8);
                        return;
                    }

                    this.Field15.Field40.removeElementAt(var10);
                    return;
                }

                if ((Class357) this.Field2(var1) != null) {
                    if ((var10 = Class357.Field1(this.Field15.Field41, var8)) == -1) {
                        this.Field15.Field41.addElement(var8);
                        return;
                    }

                    this.Field15.Field41.removeElementAt(var10);
                    return;
                }
            } else {
                if (var3 == 1) {
                    Class647 var9;
                    (var9 = new Class647()).Field4 = var2.Field2().readByte();
                    var9.Field5 = Class582.Field42[var9.Field4].Field5;
                    var9.Field1 = var2.Field2().readShort();
                    if (var1 == this.Field15.Field189) {
                        Class647 var10000 = Class582.Field42[var9.Field4];
                        var10000.Field2 += var9.Field1;
                        Field1(this.Field15.Field40, var9);
                        return;
                    }

                    Field1(this.Field15.Field41, var9);
                    return;
                }

                if (var3 == 2) {
                    var3 = var2.Field2().readByte();
                    if (var1 == this.Field15.Field189) {
                        Class582.Field42[var3].Field2 = 0;
                        Field1((Vector) this.Field15.Field40, (int) var3);
                        return;
                    }

                    Field1((Vector) this.Field15.Field41, (int) var3);
                    return;
                }
            }
        } catch (Exception var7) {
            var7.printStackTrace();
        }

    }

    private static void Field1(Vector var0, Class647 var1) {
        int var2 = var0.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class647 var4;
            if (var0.elementAt(var3) instanceof Class647 && (var4 = (Class647) var0.elementAt(var3)).Field5 == Class582.Field42[var1.Field4].Field5) {
                var4.Field1 += var1.Field1;
                return;
            }
        }

        var0.addElement(var1);
    }

    private static void Field1(Vector var0, int var1) {
        int var2 = var0.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class647 var4;
            if (var0.elementAt(var3) instanceof Class647 && (var4 = (Class647) var0.elementAt(var3)).Field5 == Class582.Field42[var1].Field5) {
                var0.removeElement(var4);
                return;
            }
        }

    }

    public final void Field18() {
        if (Class464.Field22[Class464.Field21] == 8) {
            Class464.Field5().Field103 = new Class86("Chuyển", new Class96(this));
        }

    }

    public final void Field19() {
        this.Field33();
        Class106.Field1("Giao dịch hoàn thành", false);
    }

    public final void Field20() {
        this.Field33();
        Class106.Field1("Giao dịch bị hủy.");
    }

    public final void Field2(Class114 var1, Class114 var2, int var3) {
        Class380 var4 = new Class380(var1, var2, var3);
        if (var1.Field12 != 1) {
            Field12.addElement(var4);
        } else {
            this.Field13.addElement(var4);
        }
    }

    private void Field33() {
        this.Field15.Field139 = false;
        this.Field15.Field40.removeAllElements();
        this.Field15.Field41.removeAllElements();
        if (Class582.Field42 != null) {
            for (int var1 = 0; var1 < Class582.Field42.length; ++var1) {
                Class582.Field42[var1].Field2 = 0;
            }
        }

        if (Class106.Field17 == Class464.Field5() && Class464.Field22[Class464.Field21] == 8) {
            this.Field1();
        }

    }

    private static Vector Field3(Vector var0) {
        Vector var1 = new Vector();

        for (int var2 = 0; var2 < var0.size(); ++var2) {
            Class272 var3;
            if (Class811.Field1((var3 = (Class272) var0.elementAt(var2)).Field1).Field8 == 0) {
                Class272 var4 = new Class272(var3.Field1);
                Class272.Field1(var3, var4);
                var1.addElement(var4);
            }
        }

        return var1;
    }

    public final void Field2(short var1, byte var2) {
        Class464.Field5().Field55 = var1;
        Vector var7 = new Vector();
        Class464.Field45 = var2;
        Class272 var9;
        int var10;
        if (var2 == 0) {
            var7 = Field3(Class582.Field37);
        } else if (var2 == 1) {
            var7 = Field3(Class582.Field38);
        } else {
            int var8 = Class582.Field37.size();
            var10 = Class582.Field38.size();

            int var3;
            Class272 var4;
            for (var3 = 0; var3 < var8; ++var3) {
                if (Class811.Field1((var4 = (Class272) Class582.Field37.elementAt(var3)).Field1).Field8 == 0) {
                    Class272 var6 = new Class272(var4.Field1);
                    Class272.Field1(var4, var6);
                    var7.addElement(var6);
                }
            }

            for (var3 = 0; var3 < var10; ++var3) {
                var4 = (Class272) Class582.Field38.elementAt(var3);
                boolean var5 = false;

                for (int var11 = 0; var11 < var7.size(); ++var11) {
                    if ((var9 = (Class272) var7.elementAt(var11)).Field1 == var4.Field1) {
                        var9.Field3 += var4.Field3;
                        var5 = true;
                    }
                }

                if (!var5 && Class811.Field1(var4.Field1).Field8 == 0) {
                    var9 = new Class272(var4.Field1);
                    Class272.Field1(var4, var9);
                    var7.addElement(var9);
                }
            }
        }

        var9 = null;

        for (var10 = 0; var10 < var7.size(); ++var10) {
            var9 = (Class272) var7.elementAt(var10);
            Class464.Field5().Field27.addElement(var9);
        }

        Field1(0, false, new byte[]{21});
        Class464.Field5().Field11 = "Luyện đồ";
    }

    public final void Field3(short var1, byte var2) {
        Class464.Field5().Field55 = var1;
        Vector var7 = new Vector();
        Class464.Field46 = var2;
        int var3;
        int var8;
        if (var2 == 0) {
            var7 = Class582.Field37;
        } else if (var2 == 1) {
            var7 = Class582.Field38;
        } else {
            var8 = Class582.Field37.size();
            int var9 = Class582.Field38.size();

            Class272 var4;
            for (var3 = 0; var3 < var8; ++var3) {
                var4 = (Class272) Class582.Field37.elementAt(var3);
                Class272 var5 = new Class272(var4.Field1);
                Class272.Field1(var4, var5);
                var7.addElement(var5);
            }

            for (var3 = 0; var3 < var9; ++var3) {
                var4 = (Class272) Class582.Field38.elementAt(var3);
                boolean var12 = false;

                for (var8 = 0; var8 < var7.size(); ++var8) {
                    Class272 var6;
                    if ((var6 = (Class272) var7.elementAt(var8)).Field1 == var4.Field1) {
                        var6.Field3 += var4.Field3;
                        var12 = true;
                    }
                }

                if (!var12) {
                    Class272 var10 = new Class272(var4.Field1);
                    Class272.Field1(var4, var10);
                    var7.addElement(var10);
                }
            }
        }

        var8 = var7.size();
        Class272 var11 = null;

        for (var3 = 0; var3 < var8; ++var3) {
            var11 = (Class272) var7.elementAt(var3);
            Class464.Field5().Field27.addElement(var11);
        }

        Field1(0, false, new byte[]{25});
    }

    public final void Field1(short var1, byte var2, byte var3, short var4, byte var5, byte var6, byte var7) {
        Class464.Field5().Field27.removeAllElements();
        Class464.Field5().Field55 = 1000;
        Class464.Field32 = var2;
        Class464.Field33 = var3;
        Class464.Field5();
        Class464.Field34 = var5;
        Class464.Field35 = var6;
        Vector var10 = new Vector();
        Class464.Field44 = var7;
        int var11;
        int var15;
        if (var7 == 0) {
            var10 = Class582.Field37;
        } else if (var7 == 1) {
            var10 = Class582.Field38;
        } else {
            var11 = Class582.Field37.size();
            int var12 = Class582.Field38.size();

            Class272 var16;
            for (var15 = 0; var15 < var11; ++var15) {
                var16 = (Class272) Class582.Field37.elementAt(var15);
                Class272 var8 = new Class272(var16.Field1);
                Class272.Field1(var16, var8);
                var10.addElement(var8);
            }

            for (var15 = 0; var15 < var12; ++var15) {
                var16 = (Class272) Class582.Field38.elementAt(var15);
                boolean var17 = false;

                for (var11 = 0; var11 < var10.size(); ++var11) {
                    Class272 var9;
                    if ((var9 = (Class272) var10.elementAt(var11)).Field1 == var16.Field1) {
                        var9.Field3 += var16.Field3;
                        var17 = true;
                    }
                }

                if (!var17) {
                    Class272 var13 = new Class272(var16.Field1);
                    Class272.Field1(var16, var13);
                    var10.addElement(var13);
                }
            }
        }

        var11 = var10.size();
        Class272 var14 = null;

        for (var15 = 0; var15 < var11; ++var15) {
            if ((var14 = (Class272) var10.elementAt(var15)).Field1 >= var4 && var14.Field1 <= var4 + 5) {
                Class464.Field5().Field27.addElement(var14);
            }
        }

        if (Class464.Field5().Field27.size() == 0) {
            Class106.Field1("Không có nguyên liệu.");
        } else {
            Field1(0, false, new byte[]{32});
            Class464.Field5().Field11 = "Đồ " + (var6 == 0 ? "ma" : "vật") + " " + var3;
            Class106.Field7();
        }
    }

    public final void Field13(short var1) {
        Class464.Field5().Field55 = var1;
        Field1(0, false, new byte[]{26});
        Class464.Field5().Field11 = "Hợp thành";
        Class106.Field7();
    }

    public static void Field7(Class85 var0) {
        Class582.Field39.removeAllElements();

        try {
            byte var1 = var0.Field2().readByte();
            Class272 var2 = null;

            for (int var3 = 0; var3 < var1; ++var3) {
                (var2 = new Class272()).Field2 = var0.Field2().readShort();
                var2.Field1 = var0.Field2().readByte();
                var2.Field3 = var0.Field2().readShort();
                Class582.Field39.addElement(var2);
            }
        } catch (Exception var4) {
        }

        Class464.Field5().Field7();
    }

    public static void Field8(Class85 var0) {
        try {
            Vector var1;
            (var1 = new Vector()).removeAllElements();
            short var2 = var0.Field2().readShort();
            Class272 var3 = null;

            for (int var4 = 0; var4 < var2; ++var4) {
                (var3 = new Class272()).Field2 = var0.Field2().readShort();
                var3.Field1 = var0.Field2().readShort();
                var3.Field3 = var0.Field2().readShort();
                var1.addElement(var3);
            }

            byte var6 = 0;

            try {
                var6 = var0.Field2().readByte();
            } catch (Exception var5) {
            }

            if (var6 == 0) {
                Class582.Field37 = var1;
            } else {
                Class582.Field38 = var1;
            }

            if (Class106.Field17 == Class464.Field5()) {
                if (Class464.Field22[Class464.Field21] == 26) {
                    Class464.Field5().Field1(true, 1, var6);
                }

                if (Class464.Field22[Class464.Field21] == 0) {
                    Class752.Field5();
                    Class752.Field2(0);
                }
            }
        } catch (Exception e) {

        }

    }

    public static void Field5(String var0) {
        Class106.Field1(var0, false);
        Class464.Field5();
        Class464.Field22();
    }

    public final void Field9(Class85 var1) {
        try {
            short var2 = var1.Field2().readShort();
            byte var9 = var1.Field2().readByte();
            int var3 = this.Field10.size();
            Class678 var4 = null;
            int var5 = 0;

            while (true) {
                if (var5 >= var3) {
                    return;
                }

                if ((var4 = (Class678) this.Field10.elementAt(var5)).Field189 == var2) {
                    if (var9 == 1) {
                        boolean var7 = false;
                        boolean var10 = false;
                        int var8 = var4.Field193 - 5 << 1;

                        int var11;
                        for (var11 = var4.Field194 - 5 << 1; var8 > 10 || var11 > 10 || var8 < -10 || var11 < -10; var11 >>= 1) {
                            var8 >>= 1;
                        }

                        ((Class126) var4).Field1(var8, var11);
                        var4.Field217 = true;
                        return;
                    }

                    if (var9 == 0) {
                        var4.Field31();
                        if (var4.Field189 == this.Field15.Field189 && Class410.Field9 && Field71) {
                            Class106.Field23 = null;
                            this.Field5(0, 0);
                            return;
                        }
                    }
                    break;
                }

                ++var5;
            }
        } catch (Exception var6) {
        }

    }

    public final void Field10(final Class85 class85) {
        try {
            final short short1 = class85.Field2().readShort();
            final byte byte1 = class85.Field2().readByte();
            final byte byte2 = class85.Field2().readByte();
            final short short2 = class85.Field2().readShort();
            final byte byte3 = class85.Field2().readByte();
            final byte byte4 = class85.Field2().readByte();
            int byte5 = -1;
            try {
                byte5 = class85.Field2().readByte();
            } catch (final Exception ex) {
            }
            for (int size = this.Field10.size(), i = 0; i < size; ++i) {
                final Class678 class86;
                if ((class86 = (Class678) this.Field10.elementAt(i)).Field189 == short1) {
                    switch (byte4) {
                        case -1:
                            this.Field1("-" + short2, 1, class86.Field193, class86.Field194 - 40, 0, -1);
                            if (byte1 == 1) {
                                ((Class126) class86).Field4((int) short2);
                                if (((Class114) class86).Field4 <= 0) {
                                    ((Class678) class86).Field187 = true;
                                    return;
                                }
                                break;
                            } else {
                                final Class357 class87 = (Class357) class86;
                                ((Class114) class87).Field4 -= short2;
                                if (((Class114) class86).Field4 <= 0) {
                                    ((Class678) class86).Field204 = 3;
                                    return;
                                }
                                break;
                            }
                        case 0:
                            return;
                        case 1:
                            return;
                        case 2: {
                            if (byte3 != 7 || short2 <= 0) {
                                break;
                            }
                            this.Field1("-" + short2, 3, class86.Field193, class86.Field194 - 40, 0, -1);
                            final Class357 class88 = (Class357) class86;
                            class88.Field130 -= short2;
                            if (((Class357) class86).Field130 <= 0) {
                                ((Class357) class86).Field130 = 0;
                                return;
                            }
                            break;
                        }
                        case 3:
                            if (byte3 == 4) {
                                class86.Field205 = true;
                                class86.Field208 = System.currentTimeMillis() + ((byte5 > 0) ? (byte5 * 1000) : 3000);
                                final Class829 class89;
                                (class89 = new Class829((int) class86.Field193, (int) class86.Field194, 19)).Field1((byte5 > 0) ? byte5 : 3);
                                class86.Field1(class89);
                                return;
                            }
                            break;
                        case 4:
                            if (byte3 == 4) {
                                final Class829 class90;
                                (class90 = new Class829((int) class86.Field193, (int) class86.Field194, 22)).Field1((byte5 > 0) ? byte5 : 36);
                                class86.Field1(class90);
                                class86.Field215 = System.currentTimeMillis();
                                class86.Field214 = short2;
                                class86.Field216 = byte2;
                                break;
                            }
                            break;
                    }
                    return;
                }
            }
        } catch (final Exception ex2) {
        }
    }

    public final void Field2(byte[] var1) {
        Class106.Field23 = null;
        Vector var2 = new Vector();

        for (int var3 = 0; var3 < 3; ++var3) {
            var2.addElement(new Class86("Gian hàng " + (var3 + 1), new Class101(this, var3, var1)));
        }

        Class106.Field21.Field1(var2, 3);
    }

    public final void Field2(int var1, int var2, int var3) {
        if (var2 == 0) {
            Class464.Field5().Field53 = var3;
            Class464.Field5().Field54 = var1;
            Class106.Field8();
            this.Field28.Field1((int) var3, (int) var1, (int) this.Field15.Field189);
        } else {
            if (var2 == 1) {
                this.Field28.Field3(var3, var1);
                Class106.Field8();
            }

        }
    }

    public static void Field1(Class85 var0, int var1, String var2) {
        try {
            Vector var3 = new Vector();
            short var4 = var0.Field2().readShort();

            for (int var5 = 0; var5 < var4; ++var5) {
                Class357 var6;
                (var6 = new Class357()).Field65 = var0.Field2().readUTF();
                var6.Field88 = var0.Field2().readByte();
                var6.Field12 = 0;
                var6.Field22 = var0.Field2().readByte();
                var6.Field76 = 0;
                byte var7 = var0.Field2().readByte();
                Vector var8 = new Vector();

                for (int var9 = 0; var9 < var7; ++var9) {
                    Class534 var10 = new Class534();
                    var6.Field93 = var10.Field13 = var0.Field2().readByte();
                    var10.Field18 = var0.Field2().readShort();
                    var10.Field25 = var0.Field2().readByte();
                    var10.Field19 = var0.Field2().readByte();
                    var8.addElement(var10);
                }

                var6.Field190 = var0.Field2().readShort();
                var6.Field57 = var0.Field2().readByte();
                if (var1 == 3 || var1 == 4 || var1 == 7 || var1 == 8) {
                    var6.Field122 = var0.Field2().readLong();
                    var6.Field100 = var0.Field2().readInt();
                    var6.Field201 = var0.Field2().readByte();
                    if (var1 == 7) {
                        var6.Field155 = var0.Field2().readInt();
                        var6.Field156 = var0.Field2().readInt();
                    }
                }

                var6.Field1(var8);
                var3.addElement(var6);
            }

            if (var3.size() > 0) {
                if (var1 == 0) {
                    Class496.Field5().Field2 = var3;
                    return;
                }

                if (var1 == 1 || var1 == 3 || var1 == 4 || var1 == 6 || var1 == 7 || var1 == 8) {
                    Class496.Field5().Field1(var3, var1, var2);
                    Class496.Field5().Field1();
                    Class106.Field7();
                    return;
                }
            }
        } catch (Exception var11) {
            (new StringBuffer("loi onFriendList >> ")).append(var11.toString()).toString();
        }

    }

    public final void Field11(Class85 var1) {
        try {
            Vector var2 = new Vector();
            byte var3 = var1.Field2().readByte();
            byte var4 = var1.Field2().readByte();
            byte var5 = var1.Field2().readByte();
            switch (var3) {
                case 0:
                    var3 = var1.Field2().readByte();

                    for (int var16 = 0; var16 < var3; ++var16) {
                        String var17 = var1.Field2().readUTF();
                        short var19;
                        if ((var19 = var1.Field2().readShort()) != this.Field15.Field189) {
                            var2.addElement(new Class86(var17, new Class206(this, var4, var5, var19)));
                        }
                    }

                    Class106.Field23 = null;
                    if (var2.size() > 0) {
                        Class106.Field21.Field1(var2, 3);
                        return;
                    }
                    break;
                case 1:
                    Class106.Field23 = null;
                    Class464.Field5().Field26.removeAllElements();
                    byte var6 = var1.Field2().readByte();
                    short var7 = var1.Field2().readShort();

                    for (int var8 = 0; var8 < var6; ++var8) {
                        Class534 var12 = new Class534();
                        (var12).Field30 = var12.Field13 = var1.Field2().readByte();
                        var12.Field9 = var1.Field2().readShort();
                        var12.Field18 = var1.Field2().readShort();
                        var12.Field19 = var1.Field2().readByte();
                        var12.Field28 = var1.Field2().readInt();
                        var12.Field25 = var1.Field2().readByte();
                        var12.Field21 = var1.Field2().readShort();
                        var12.Field35 = var1.Field2().readByte();
                        var12.Field36 = var1.Field2().readByte();
                        var12.Field34.removeAllElements();
                        var3 = var1.Field2().readByte();

                        for (byte var9 = 0; var9 < var3; ++var9) {
                            Class826 var10 = new Class826((short) var1.Field2().readUnsignedByte(), var1.Field2().readShort());
                            var12.Field34.addElement(var10);
                        }

                        var12.Field37 = var1.Field2().readByte();
                        var12.Field14 = var1.Field2().readByte();
                        var12.Field15 = var1.Field2().readByte();
                        var12.Field16 = var1.Field2().readByte();
                        var12.Field17 = var1.Field2().readByte();
                        var12.Field29 = var1.Field2().readByte();
                        var12.Field4 = var1.Field2().readUTF();
                        if (this.Field15.Field189 == var7) {
                            int var20 = Class357.Field125.size();

                            for (int var21 = 0; var21 < var20; ++var21) {
                                Class534 var14;
                                if ((var14 = (Class534) Class357.Field125.elementAt(var21)).Field9 == var12.Field9) {
                                    var14.Field28 = var12.Field28;
                                    var14.Field26 = true;
                                    Class464.Field5().Field26.addElement(var14);
                                }
                            }
                        } else {
                            Class464.Field5().Field26.addElement(var12);
                        }
                    }

                    byte var18 = var1.Field2().readByte();

                    for (int var13 = 0; var13 < var18; ++var13) {
                        Class230 var15;
                        (var15 = new Class230()).Field1 = var1.Field2().readShort();
                        var15.Field2 = var1.Field2().readShort();
                        var15.Field3 = var1.Field2().readInt();
                        Class464.Field5().Field26.addElement(var15);
                    }

                    Class464.Field5().Field53 = var4;
                    Class464.Field5().Field54 = var5;
                    if (this.Field15.Field189 == var7) {
                        Field1(0, true, new byte[]{23});
                        return;
                    }

                    if (Class464.Field5().Field26.size() <= 0) {
                        break;
                    }

                    Class464.Field5().Field25 = var7;
                    Field1(0, true, new byte[]{24});
                default:
                    return;
            }
        } catch (Exception var11) {
            var11.printStackTrace();
        }

    }

    public static void Field1(int var0, boolean var1, byte[] var2) {
        Class464.Field5().Field1(var0, var1, var2);
        Class464.Field5().Field1();
    }

    public final void Field12(Class85 var1) {
        try {
            boolean var6 = var1.Field2().readBoolean();
            short var2 = var1.Field2().readShort();
            int var3 = 0;
            if (var6) {
                var3 = var1.Field2().readInt();
            }

            if (var1.Field2().readByte() != 0) {
                short var10 = var1.Field2().readShort();
                Class230 var4;
                Class272 var8;
                if (var6) {
                    if ((var8 = Class272.Field2(var2)) != null) {
                        --var8.Field3;
                        if (var8.Field3 <= 0) {
                            Class582.Field37.removeElement(var8);
                        }

                        (var4 = new Class230(var8.Field2)).Field2 = var10;
                        var4.Field3 = var3;
                        Class464.Field5().Field26.addElement(var4);
                    }
                } else {
                    int var7 = Class464.Field5().Field26.size();
                    var4 = null;

                    for (int var11 = 0; var11 < var7; ++var11) {
                        if ((var4 = (Class230) Class464.Field5().Field26.elementAt(var11)).Field1 == var2) {
                            Class464.Field5().Field26.removeElement(var4);
                            if ((var8 = Class272.Field1(var4.Field2)) != null) {
                                ++var8.Field3;
                            } else {
                                (var8 = new Class272()).Field2 = var4.Field1;
                                var8.Field1 = var4.Field2;
                                var8.Field3 = 1;
                                Class582.Field37.addElement(var8);
                            }
                            break;
                        }
                    }
                }

                Class106.Field7();
                return;
            }

            Class534 var9;
            if ((var9 = Field1(Class357.Field125, var2)) != null) {
                var9.Field26 = var6;
                if (var6) {
                    var9.Field28 = var3;
                    Class464.Field5().Field26.addElement(var9);
                    Class106.Field1("Đã bỏ vào gian hàng.");
                    return;
                }

                var9.Field28 = 0;
                Class464.Field5().Field26.removeElement(var9);
                Class106.Field1("Đã lấy vật phẩm khỏi gian hàng.");
                return;
            }
        } catch (Exception var5) {
            (new StringBuffer("LOI HAM ON_USER_SELL_ITEM")).append(var5.toString()).toString();
        }

    }

    public final void Field3(short var1, short var2, byte var3) {
        if (this.Field15.Field189 == var2) {
            Class106.Field1("Món đồ đã ở trong hành trang.");
        }

        int var5 = Class464.Field5().Field26.size();

        for (int var6 = 0; var6 < var5; ++var6) {
            if (var3 == 0 && Class464.Field5().Field26.elementAt(var6) instanceof Class534) {
                if (((Class534) Class464.Field5().Field26.elementAt(var6)).Field9 == var1) {
                    Class464.Field5().Field26.removeElementAt(var6);
                    if (Class464.Field5() == Class106.Field17 && Class464.Field22[Class464.Field21] == 24) {
                        Class464.Field5().Field1(Class464.Field5().Field11());
                    }

                    return;
                }
            } else if (Class464.Field5().Field26.elementAt(var6) instanceof Class230 && ((Class230) Class464.Field5().Field26.elementAt(var6)).Field1 == var1) {
                Class464.Field5().Field26.removeElementAt(var6);
                if (Class464.Field5() == Class106.Field17 && Class464.Field22[Class464.Field21] == 24) {
                    Class464.Field5().Field1(Class464.Field5().Field11());
                }

                return;
            }
        }

    }

    public final void Field13(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();
            String var3 = var1.Field2().readUTF();
            short var5 = var1.Field2().readShort();
            switch (var2) {
                case -1:
                default:
                    return;
                case 0:
                    Class106.Field1(var3 + " muốn kết bạn với bạn", new Class204(this, var5), new Class211(this, var5));
                    return;
                case 1:
            }
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public final void Field14(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                this.Field181.addElement(var1.Field2().readUTF());
                this.Field182.addElement(var1.Field2().readUTF());
                this.Field183.addElement(var1.Field2().readUTF());
            }

        } catch (Exception e) {

        }

    }

    public static void Field4(int var0) {
        int var1;
        switch (var0) {
            case 0:
                Field180 = 0;
                Field91 = 1;
                if (Class455.Field5 != null) {
                    var0 = Class455.Field5.size();

                    for (var1 = 0; var1 < var0; ++var1) {
                        Class455.Field5.elementAt(var1);
                    }

                    return;
                }
                break;
            case 1:
            case 2:
                Field180 = 1;
                Field91 = 1;
                return;
            case 3:
                Field180 = 0;
                Field91 = 0;
                if (Class455.Field5 != null) {
                    var0 = Class455.Field5.size();

                    for (var1 = 0; var1 < var0; ++var1) {
                        Class455.Field5.elementAt(var1);
                    }
                }
        }

    }

    public final void Field21() {
        Vector var1 = new Vector();
        String[] var2 = new String[]{"Thấp", "Vừa", "Cao", "Rất thấp"};

        for (int var3 = 0; var3 < 4; ++var3) {
            var1.addElement(new Class86(var2[var3], new Class208(this, var3)));
        }

        Class106.Field21.Field1(var1, 3);
    }

    public final void Field1(short[] var1) {
        Vector var2 = new Vector();
        int var3 = var1.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            var2.addElement(new Class276(this, "", new Class218(this, var1, var4), var1, var4));
        }

        Class801.Field5().Field1(20, 20, Class106.Field13 - 40, Class106.Field14 - 40 - Class671.Field108, (Class106.Field13 - 40) / 20);
        Class801.Field5().Field1(var2, "ICON");
        Class801.Field5().Field1();
    }

    public static void Field1(Class830 var0) {
        Class798.Field5().Field1(var0);
        Class798.Field5().Field1();
        Class106.Field7();
    }

    public static void Field2(Class357 var0) {
        Class464.Field5().Field1(0, false, new byte[]{1});
        Class464.Field39 = var0;
        Class464.Field5().Field1();
        Class464.Field5().Field11 = "Trang bị";
        Class106.Field7();
    }

    public final void Field1(String var1, short var2, short var3, short var4, short var5, short var6, short var7, byte var8, byte var9) {
        short var12 = var2;
        Class62 var10 = this;
        if (var9 == 1) {
            int var20 = this.Field11.size();
            Class678 var21 = null;
            int var22 = 0;

            while (true) {
                if (var22 >= var20) {
                    Class742 var25;
                    (var25 = new Class742()).Field3 = var1;
                    var25.Field1 = var25.Field189 = var12;
                    var25.Field5 = var3;
                    var25.Field193 = var4;
                    var25.Field194 = var5;
                    var25.Field196 = var6;
                    var25.Field195 = var7;
                    var25.Field6 = var8;
                    var25.Field203 = var9;
                    var10.Field11.addElement(var25);
                    break;
                }

                Class742 var23;
                Class260 var24;
                if ((var21 = (Class678) var10.Field11.elementAt(var22)) != null && var21.Field188 == 2 && (var24 = (Class260) var21).Field4 == 1 && (var23 = (Class742) var24).Field189 == var12) {
                    var23.Field3 = var1;
                    var23.Field1 = var23.Field189 = var12;
                    var23.Field5 = var3;
                    var23.Field193 = var4;
                    var23.Field194 = var5;
                    var23.Field196 = var6;
                    var23.Field195 = var7;
                    var23.Field6 = var8;
                    var24.Field203 = var9;
                    break;
                }

                ++var22;
            }
        }

        int var26 = this.Field10.size();
        Class678 var11 = null;

        for (int var28 = 0; var28 < var26; ++var28) {
            Class742 var13;
            Class260 var27;
            if ((var11 = (Class678) this.Field10.elementAt(var28)) != null && var11.Field188 == 2 && (var27 = (Class260) var11).Field4 == 1 && (var13 = (Class742) var27).Field189 == var2) {
                var13.Field3 = var1;
                var13.Field1 = var13.Field189 = var2;
                var13.Field5 = var3;
                var13.Field193 = var4;
                var13.Field194 = var5;
                var13.Field196 = var6;
                var13.Field195 = var7;
                var13.Field6 = var8;
                var27.Field203 = var9;
                return;
            }
        }

        Class742 var29;
        (var29 = new Class742()).Field3 = var1;
        var29.Field1 = var29.Field189 = var2;
        var29.Field5 = var3;
        var29.Field193 = var4;
        var29.Field194 = var5;
        var29.Field196 = var6;
        var29.Field195 = var7;
        var29.Field6 = var8;
        var29.Field203 = var9;
        this.Field10.addElement(var29);
    }

    public final void Field1(int var1, int var2, int var3, int var4, String var5, String var6, int var7, int var8, boolean var9, byte var10, byte var11) {
        int var15 = this.Field10.size();

        for (int var12 = 0; var12 < var15; ++var12) {
            Class678 var13;
            Class685 var14;
            if ((var13 = (Class678) this.Field10.elementAt(var12)).Field188 == 10 && (var14 = (Class685) var13).Field189 == var1) {
                var14.Field1(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11);
                return;
            }
        }

        this.Field10.addElement(new Class685(var1, var2, var3, var4, var5, var7, var8, var9, var10, var11));
    }

    private static Class678 Field1(byte var0, short var1, short var2, short var3, short var4, byte var5, byte var6) {
        Object var7 = null;
        switch (var0) {
            case 0:
                if (var6 > -1) {
                    ((Class678) (var7 = new Class99())).Field1((int) var6);
                } else {
                    var7 = new Class357();
                }
                break;
            case 1:
                if (var1 != 91 && var1 != 92) {
                    if (var1 == 93) {
                        var7 = new Class224();
                    } else if (var1 == 94) {
                        var7 = new Class235();
                    } else if (var1 == 46) {
                        var7 = new Class412();
                    } else if (var1 == 43) {
                        var7 = new Class741(0);
                    } else if (var1 == 36) {
                        var7 = new Class741(1);
                    } else if (var1 == 37) {
                        var7 = new Class741(2);
                    } else if (var1 == 38) {
                        var7 = new Class23();
                    } else if (var1 == 39) {
                        var7 = new Class178();
                    } else if (var1 == 82) {
                        var7 = new Class359();
                    } else if (var1 == 83) {
                        Field49 = (Class678) (var7 = new Class643());
                    } else if (var1 == 84) {
                        var7 = new Class64();
                    } else if (var1 == 113) {
                        var7 = new Class827(113);
                    } else if (var1 == 115) {
                        var7 = new Class827(115);
                    } else if (var1 == 116) {
                        var7 = new Class827(116);
                    } else if (var1 == 117) {
                        var7 = new Class827(117);
                    } else if (var1 >= 95 && var1 <= 112) {
                        var7 = new Class827(var1);
                    } else if (var5 == 1) {
                        var7 = new Class827(var1);
                    } else {
                        var7 = new Class126();
                    }
                } else {
                    var7 = new Class823();
                }
            case 2:
            case 5:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            default:
                break;
            case 3:
                var7 = new Class265();
                break;
            case 4:
                var7 = new Class300();
                break;
            case 6:
            case 7:
                var7 = new Class39();
                break;
            case 14:
                var7 = new Class115();
        }

        ((Class678) var7).Field13(var5);
        if (var1 >= 85 && var1 <= 89 && var0 == 1) {
            ((Class126) var7).Field1 = true;
        }

        ((Class678) var7).Field193 = var3;
        ((Class678) var7).Field194 = var4;
        ((Class678) var7).Field188 = var0;
        ((Class678) var7).Field189 = var2;
        ((Class678) var7).Field197 = var3;
        ((Class678) var7).Field198 = var4;
        ((Class678) var7).Field1(var1);
        return (Class678) var7;
    }

    public final void Field3(byte[] var1) {
        Image var5;
        int var2 = (var5 = Image.createImage(var1, 0, var1.length)).getWidth() + 35;
        int var3 = var5.getHeight() + 60;
        Class194 var4;
        (var4 = new Class194(5, var3 - 26, var2 - 10, 20)).Field5 = true;
        Class520.Field5().Field1(Class106.Field15 - var2 / 2, Class106.Field16 - var3 / 2 - Class671.Field108, var2, var3, "NHẬP CHỮ", (Class86) null);
        Class520.Field5().Field103 = new Class86("Ok", new Class222(this, var4));
        Class520.Field5().Field105 = var4.Field9;
        Class520.Field5().Field2 = new Class279(this, var4, var5, var2);
        Class520.Field5().Field1();
    }

    private void Field34() {
        if (!Class106.Field1(Class106.Field15 - 40, 0, 80, 20)) {
            if (Class106.Field1(0, 0, Class106.Field13, Class106.Field14)) {
                int var1;
                int var2;
                int var3;
                if (Class106.Field7) {
                    var1 = Class811.Field15.getWidth();
                    var2 = Class811.Field15.getHeight();
                    if (Class106.Field1(Class106.Field15 - var1 / 2, Class106.Field14 - var2 - 20, var1, var2)) {
                        var3 = (Class106.Field10 - (Class106.Field15 - var1 / 2)) / Class811.Field42;
                        Class106.Field3[1 + (var3 << 1)] = true;
                        Class106.Field7 = false;
                        Class106.Field6 = false;
                        return;
                    }
                }

                if (Class106.Field1(this.Field148.Field1, this.Field148.Field2, Field67, Field68) && Class106.Field7) {
                    var1 = Class106.Field31 - Class106.Field10;
                    if (Class809.Field4(Class106.Field30 - Class106.Field11) < 10 && Class809.Field4(var1) < 10) {
                        if (this.Field192 == null) {
                            this.Field192 = new Class384(0, 0);
                        }

                        this.Field192.Field1 = (short) (Field188 + Class106.Field10 - this.Field148.Field1);
                        this.Field192.Field2 = (short) (Field184 + Class106.Field11 - this.Field148.Field2);
                        this.Field15.Field49 = null;
                        if (!Class455.Field1((this.Field192.Field1 << 4) + 2, (this.Field192.Field2 << 4) + 2, 2) && !this.Field1((this.Field192.Field1 << 4) + 2, (this.Field192.Field2 << 4) + 2)) {
                            this.Field15.Field74 = this.Field15.Field193;
                            this.Field15.Field75 = this.Field15.Field194;
                            this.Field15.Field46 = this.Field15.Field193;
                            this.Field15.Field47 = this.Field15.Field194;
                            this.Field193.Field3 = 8;
                            this.Field15.Field49 = this.Field2(this.Field15.Field193 / 16, this.Field15.Field194 / 16, this.Field192.Field1, this.Field192.Field2);
                            this.Field15.Field48 = 0;
                            Class106.Field7 = false;
                            return;
                        }
                    }
                }

                if (Class106.Field7) {
                    var1 = Field8 + Class106.Field10;
                    var2 = Field9 + Class106.Field11;
                    if (this.Field16 != null) {
                        Class678 var4;
                        int var5;
                        if (this.Field16.Field188 != 10) {
                            var3 = this.Field10.size();
                            var4 = null;

                            for (var5 = 0; var5 < var3; ++var5) {
                                if (Class809.Field4((var4 = (Class678) this.Field10.elementAt(var5)).Field193 - var1) < 20 && Class809.Field4(var4.Field194 - 20 - var2) < 40) {
                                    Class106.Field7 = false;
                                    if (this.Field16.Field189 == var4.Field189) {
                                        if (var4 instanceof Class357 && (this.Field15.Field200 <= 0 || this.Field83 / 100 == 3)) {
                                            if (((Class357) this.Field16).Field25 == -1) {
                                                this.Field31();
                                                return;
                                            }

                                            this.Field5(5, Field46);
                                            return;
                                        }

                                        if (this.Field16.Field188 != 2 || var4.Field188 != 2) {
                                            this.Field5(5, Field46);
                                            return;
                                        }

                                        if (((Class260) this.Field16).Field1 == ((Class260) var4).Field1) {
                                            if (((Class260) var4).Field1 != 4) {
                                                this.Field5(5, Field46);
                                                return;
                                            }

                                            if (((Class260) this.Field16).Field2 == ((Class260) var4).Field2) {
                                                this.Field5(5, Field46);
                                                return;
                                            }

                                            if (var4.Field189 != this.Field15.Field189) {
                                                this.Field16 = var4;
                                                this.Field5(5, Field46);
                                                return;
                                            }
                                        }
                                    }

                                    if (var4.Field189 != this.Field15.Field189) {
                                        boolean var6;
                                        label159:
                                        {
                                            var6 = false;
                                            if (Field65 == 1) {
                                                if (var4.Field188 == 0 && (!var4.Field207 || var4.d_())) {
                                                    var6 = true;
                                                }

                                                if (var4.Field188 == 1 || var4.Field188 != 0 || var4.Field207) {
                                                    break label159;
                                                }
                                            } else if (Field65 == 2) {
                                                if (var4.d_()) {
                                                    break label159;
                                                }
                                            } else {
                                                if (Field65 == 3) {
                                                    if (var4.Field188 == 0 && var4.Field190 == this.Field15.Field190 || var4.d_()) {
                                                        var6 = true;
                                                    }
                                                    break label159;
                                                }

                                                if (Field65 != 4 || (var4.Field188 != 0 || var4.Field201 != this.Field15.Field201) && !var4.d_()) {
                                                    break label159;
                                                }
                                            }

                                            var6 = true;
                                        }

                                        if (!var6) {
                                            this.Field16 = var4;
                                        }

                                        if (this.Field83 == 29) {
                                            this.Field7(var1, var2);
                                        }
                                    }

                                    return;
                                }
                            }
                        } else if (this.Field15.Field193 >= this.Field87 && this.Field15.Field193 <= this.Field89 + 32 && this.Field15.Field194 >= this.Field88 && this.Field15.Field194 <= this.Field90 + 32) {
                            var3 = this.Field10.size();
                            var4 = null;

                            for (var5 = 0; var5 < var3; ++var5) {
                                var4 = (Class678) this.Field10.elementAt(var5);
                                if (var1 >= var4.Field193 + 2 && var1 <= var4.Field193 + 30 && var2 >= var4.Field194 && var2 <= var4.Field194 + 30) {
                                    Class106.Field7 = false;
                                    if (this.Field16.Field189 != -1 && this.Field16.Field189 == var4.Field189) {
                                        if (this.Field15.Field204 == 0) {
                                            this.Field5(5, Field46);
                                        }

                                        return;
                                    }

                                    if (var4.Field189 != this.Field15.Field189) {
                                        this.Field7(var1, var2);
                                    }

                                    return;
                                }
                            }
                        }

                        this.Field16 = null;
                    }

                    this.Field7(var1, var2);
                }
            }

        }
    }

    private void Field7(int var1, int var2) {
        var1 /= 16;
        var2 /= 16;
        if (!Class455.Field1(Field8 + Class106.Field10, Field9 + Class106.Field11, 2) && !this.Field1(Field8 + Class106.Field10, Field9 + Class106.Field11)) {
            if (this.Field192 == null) {
                this.Field192 = new Class384(0, 0);
            }

            this.Field192.Field1 = (short) var1;
            this.Field192.Field2 = (short) var2;
            Class106.Field7 = false;
            this.Field15.Field74 = this.Field15.Field193;
            this.Field15.Field75 = this.Field15.Field194;
            this.Field15.Field46 = this.Field15.Field193;
            this.Field15.Field47 = this.Field15.Field194;
            this.Field193.Field3 = 8;
            this.Field15.Field49 = this.Field2(this.Field15.Field193 / 16, this.Field15.Field194 / 16, var1, var2);
            this.Field15.Field48 = 0;
        }

    }

    public final void Field4(int var1, int var2) {
        var1 /= 16;
        var2 /= 16;
        if (this.Field192 == null) {
            this.Field192 = new Class384(0, 0);
        }

        this.Field192.Field1 = (short) var1;
        this.Field192.Field2 = (short) var2;
        this.Field15.Field74 = this.Field15.Field193;
        this.Field15.Field75 = this.Field15.Field194;
        this.Field15.Field46 = this.Field15.Field193;
        this.Field15.Field47 = this.Field15.Field194;
        this.Field193.Field3 = 8;
        this.Field15.Field49 = this.Field2(this.Field15.Field193 / 16, this.Field15.Field194 / 16, var1, var2);
        this.Field15.Field48 = 0;
        Field78 = 100;
    }

    private static int Field1(int var0, int var1, int var2, int var3) {
        return Class809.Field4(var0 - var2) + Class809.Field4(var1 - var3);
    }

    private short[] Field2(int var1, int var2, int var3, int var4) {
        if (Class809.Field1(var1 << 4, var2 << 4, var3 << 4, var4 << 4) <= 16) {
            return null;
        } else if (this.Field1(var3, var4)) {
            return null;
        } else {
            Field94 = (byte) Field189;
            Field95 = (byte) Field185;
            var1 -= Field94;
            var2 -= Field95;
            var3 -= Field94;
            var4 -= Field95;
            int var5 = Field93.length;

            int var7;
            int var8;
            for (int var6 = 0; var6 < var5; ++var6) {
                for (var7 = 0; var7 < Field93[var6].length; ++var7) {
                    if ((var8 = (Field95 + var7) * Class455.Field1 + Field94 + var6) < Class455.Field7.length - 1) {
                        if (Class455.Field7[var8] == 2) {
                            Field93[var6][var7] = -1;
                        } else {
                            Field93[var6][var7] = 0;
                        }
                    }
                }
            }

            var7 = var1;
            var8 = var2;
            short var18 = (short) var1;
            short var19 = (short) var2;
            if (var1 >= 0 && var1 < Field93.length) {
                if (var1 < Field93.length && var2 < Field93[var1].length) {
                    Field93[var1][var2] = 1;
                }

                short var20 = 2;
                int var10 = Field93.length;
                int var11 = Field93[0].length;
                int var12 = 0;

                while (true) {
                    ++var12;
                    if (var12 > 500) {
                        if (Field48 == 2) {
                            this.Field195 = Field48;
                            Field194 = true;
                            var12 = 0;
                        }

                        Field48 = 1;
                        (new StringBuffer("Cout DAY ROI------: ")).append(var12).toString();
                        return null;
                    }

                    var5 = -1;
                    int var9 = -1;
                    if (var7 + 1 < var10 && Field93[var7 + 1][var8] == 0) {
                        Field93[var7 + 1][var8] = (byte) var20;
                        var5 = var7 + 1;
                        var9 = var8;
                    }

                    if (var7 - 1 >= 0 && Field93[var7 - 1][var8] == 0) {
                        Field93[var7 - 1][var8] = (byte) var20;
                        if (var5 == -1 || Field1(var5, var9, var3, var4) > Field1(var7 - 1, var8, var3, var4)) {
                            var5 = var7 - 1;
                            var9 = var8;
                        }
                    }

                    if (var8 + 1 < var11 && Field93[var7][var8 + 1] == 0) {
                        Field93[var7][var8 + 1] = (byte) var20;
                        if (var5 == -1 || Field1(var5, var9, var3, var4) > Field1(var7, var8 + 1, var3, var4)) {
                            var5 = var7;
                            var9 = var8 + 1;
                        }
                    }

                    if (var8 - 1 >= 0 && Field93[var7][var8 - 1] == 0) {
                        Field93[var7][var8 - 1] = (byte) var20;
                        if (var5 == -1 || Field1(var5, var9, var3, var4) > Field1(var7, var8 - 1, var3, var4)) {
                            var5 = var7;
                            var9 = var8 - 1;
                        }
                    }

                    byte var13 = -1;
                    if (var5 != -1) {
                        var13 = 0;
                        var7 = var5;
                        var8 = var9;
                    } else {
                        var8 = 1000;
                        var7 = 1000;
                    }

                    for (short var21 = 0; var21 < var10; ++var21) {
                        for (short var14 = 0; var14 < var11; ++var14) {
                            if (Field93[var21][var14] > 1) {
                                byte[][] var17 = Field93;
                                if ((var21 + 1 < var17.length && var17[var21 + 1][var14] == 0 ? true : (var21 - 1 >= 0 && var17[var21 - 1][var14] == 0 ? true : (var14 + 1 < var17[var21].length && var17[var21][var14 + 1] == 0 ? true : var14 - 1 >= 0 && var17[var21][var14 - 1] == 0))) && Field93[var21][var14] + Field1((int) var21, (int) var14, (int) var3, (int) var4) < var20 + Field1(var7, var8, var3, var4)) {
                                    var7 = var21;
                                    var8 = var14;
                                    var20 = Field93[var21][var14];
                                    var13 = 0;
                                }
                            }
                        }
                    }

                    if (var7 == var3 && var8 == var4) {
                        if (var20 >= 127) {
                            return null;
                        }

                        int var23 = 0;
                        short[] var22 = new short[var20];

                        while (true) {
                            var22[var23] = (short) ((var7 << 8) + var8);
                            if (var7 + 1 < var10 && Field93[var7 + 1][var8] == Field93[var7][var8] - 1) {
                                var7 = (short) (var7 + 1);
                            } else if (var7 - 1 >= 0 && Field93[var7 - 1][var8] == Field93[var7][var8] - 1) {
                                var7 = (short) (var7 - 1);
                            } else if (var8 + 1 < var11 && Field93[var7][var8 + 1] == Field93[var7][var8] - 1) {
                                var8 = (short) (var8 + 1);
                            } else if (var8 - 1 >= 0 && Field93[var7][var8 - 1] == Field93[var7][var8] - 1) {
                                var8 = (short) (var8 - 1);
                            }

                            if (var7 == var18 && var8 == var19) {
                                return var22;
                            }

                            ++var23;
                        }
                    }

                    if (var13 != 0) {
                        (new StringBuffer("TOI DAY ROI------: ")).append(var5).toString();
                        return null;
                    }

                    ++var20;
                }
            } else {
                return null;
            }
        }
    }

    public final void Field1(int var1, byte var2, String[] var3) {
        if (Class106.Field21.Field1) {
            Class106.Field21.Field1 = false;
        }

        Vector var4 = new Vector();
        int var5 = var3.length;

        for (int var6 = 0; var6 < var5; ++var6) {
            var4.addElement(new Class86(var3[var6], new Class277(this, var1, var2, var6)));
        }

        Class106.Field21.Field1(var4, 3);
        Class106.Field23 = null;
    }

    public final void Field1(int var1, byte var2, String var3, int var4) {
        Class106.Field25.Field1(var3, new Class293(this, var1, var2), var4, 40, true);
        Class106.Field23 = Class106.Field25;
    }

    public final void Field6(String var1) {
        Class106.Field2(var1, new Class295(this));
    }

    public static void Field1(byte var0, int var1, int var2) {
        if (var0 != -1) {
            Field60.addElement(new Class376(var0, true, var1, var2));
        } else {
            for (int var3 = 0; var3 < Field60.size(); ++var3) {
                ((Class376) Field60.elementAt(var3)).Field1 = true;
            }

        }
    }

    public final void Field1(short var1, byte[] var2, byte[] var3) {
        Class114 var9;
        if ((var9 = (Class114) this.Field3(var1)) != null) {
            int var10 = var2.length;

            for (int var4 = 0; var4 < var10; ++var4) {
                boolean var5 = false;
                int var6 = var9.Field26.size();

                for (int var7 = 0; var7 < var6; ++var7) {
                    Class52 var8;
                    if ((var8 = (Class52) var9.Field26.elementAt(var7)).Field8 == var2[var4]) {
                        var8.Field1 = var3[var4];
                        var5 = true;
                        break;
                    }
                }

                if (!var5) {
                    var9.Field26.addElement(new Class52(var2[var4], var3[var4], var9));
                }
            }
        }

    }

    public final void Field1(Class348 var1) {
        this.Field196.addElement(var1);
        this.Field10.addElement(var1);
    }

    public static void Field1(Class69 var0) {
        if (Field61 == null) {
            Field61 = new Vector();
        }

        Field61.addElement(var0);
    }

    public final void Field1(String var1, short var2, Vector var3, int var4, int var5) {
        Class464.Field5().Field27.removeAllElements();
        Class464.Field5().Field29 = var3;
        Class464.Field5().Field28 = new Vector();
        Class464.Field38 = var2;
        Class464.Field51 = (byte) var4;
        if (var3.size() == 0) {
            Class106.Field1("Vật phẩm không thể thăng cấp");
        } else {
            Class464.Field43 = (byte) var5;
            Vector var10 = new Vector();
            int var6;
            Class272 var8;
            int var11;
            if (var5 == 0) {
                var10 = Class582.Field37;
            } else if (var5 == 1) {
                var10 = Class582.Field38;
            } else {
                var11 = Class582.Field37.size();
                var5 = Class582.Field38.size();

                Class272 var7;
                for (var6 = 0; var6 < var11; ++var6) {
                    var7 = (Class272) Class582.Field37.elementAt(var6);
                    var8 = new Class272(var7.Field1);
                    Class272.Field1(var7, var8);
                    var10.addElement(var8);
                }

                for (var6 = 0; var6 < var5; ++var6) {
                    var7 = (Class272) Class582.Field38.elementAt(var6);
                    boolean var15 = false;

                    for (var11 = 0; var11 < var10.size(); ++var11) {
                        Class272 var9;
                        if ((var9 = (Class272) var10.elementAt(var11)).Field1 == var7.Field1) {
                            var9.Field3 += var7.Field3;
                            var15 = true;
                        }
                    }

                    if (!var15) {
                        Class272 var12 = new Class272(var7.Field1);
                        Class272.Field1(var7, var12);
                        var10.addElement(var12);
                    }
                }
            }

            var11 = var3.size();
            Class381 var13 = null;

            for (var6 = 0; var6 < var11; ++var6) {
                var13 = (Class381) var3.elementAt(var6);

                for (int var14 = 0; var14 < var10.size(); ++var14) {
                    var8 = (Class272) var10.elementAt(var14);
                    if ((var4 > 2 || var4 == 2 && (var4 != 2 || var6 != 0)) && var4 <= 2) {
                        if (var8.Field1 == var13.Field2 + 5) {
                            Class464.Field5().Field27.addElement(var8);
                        }
                    } else if (var8.Field1 >= var13.Field2 + (var4 == 0 ? 0 : 3) && var8.Field1 <= var13.Field2 + 5) {
                        Class464.Field5().Field27.addElement(var8);
                    }
                }
            }

            if (Class464.Field5().Field27.size() == 0) {
                Class106.Field1("Không có nguyên liệu.");
            } else {
                Field1(0, false, new byte[]{28});
                Class464.Field5().Field11 = var1;
            }
        }
    }

    public final void Field7(String var1) {
        if (this.Field197 == null) {
            this.Field197 = new Vector();
        }

        this.Field197.addElement(var1);
        Class104.Field5().Field1(var1, (String) null);
    }

    public final void Field15(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                Class125 var4;
                (var4 = (Class125) Field1((byte) var1.Field2().readByte(), (short) var1.Field2().readShort(), (short) var1.Field2().readShort(), var1.Field2().readShort(), (short) var1.Field2().readShort(), (byte) 0, (byte) -1)).Field1(var4.Field193, var4.Field194, var4.Field193, var4.Field194);
                this.Field10.addElement(var4);
            }

        } catch (Exception var5) {
        }
    }

    public final void Field1(Class32[] var1, Class32[] var2) {
        this.Field96 = var1;
        this.Field97 = var2;
    }

    public final void Field16(Class85 var1) {
        try {
            byte var2;
            byte var3;
            if ((var2 = var1.Field2().readByte()) == 0) {
                Class377.Field5().Field6();
                Class377.Field2.removeAllElements();
                var1.Field2().readByte();
                var2 = var1.Field2().readByte();

                for (var3 = 0; var3 < var2; ++var3) {
                    Class773 var4;
                    (var4 = new Class773()).Field1 = var1.Field2().readByte();
                    var4.Field3 = var1.Field2().readShort();
                    var4.Field4 = var1.Field2().readUTF();
                    var4.Field5 = new String[var1.Field2().readByte()];

                    for (int var5 = 0; var5 < var4.Field5.length; ++var5) {
                        var4.Field5[var5] = var1.Field2().readUTF();
                    }

                    var4.Field2 = var1.Field2().readByte();
                    Class377.Field2.addElement(var4);
                }

                if ((Class377.Field4 = (short) Class377.Field2.size()) < 32) {
                    Class377.Field4 = 32;
                }

                Class377.Field5().Field1 = this;
                Class377.Field5().Field1();
                return;
            }

            if (var2 == 1) {
                Class587.Field5().Field2 = this;
                Class587.Field5().Field1();
                Class587.Field4 = new byte[var2 = var1.Field2().readByte()];

                for (var3 = 0; var3 < var2; ++var3) {
                    Class587.Field4[var3] = var1.Field2().readByte();
                }

                Class587.Field5().Field7();
                return;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

    }

    public static void Field17(Class85 var0) {
        try {
            short var1 = var0.Field2().readShort();
            Class324.Field5().Field33 = var1;
            var1 = var0.Field2().readShort();
            Vector var2 = new Vector();

            for (int var3 = 0; var3 < var1; ++var3) {
                Class534 var4;
                (var4 = new Class534()).Field13 = var0.Field2().readByte();
                var4.Field9 = var0.Field2().readShort();
                var4.Field18 = var0.Field2().readShort();
                var4.Field19 = var0.Field2().readByte();
                var4.Field25 = var0.Field2().readByte();
                var4.Field22 = var0.Field2().readShort();
                var4.Field21 = var0.Field2().readShort();
                var4.Field30 = var0.Field2().readByte();
                var4.Field35 = var0.Field2().readByte();
                var4.Field36 = var0.Field2().readByte();
                var4.Field37 = var0.Field2().readByte();
                var4.Field14 = var0.Field2().readByte();
                var4.Field15 = var0.Field2().readByte();
                var4.Field16 = var0.Field2().readByte();
                var4.Field17 = var0.Field2().readByte();
                var4.Field29 = var0.Field2().readByte();
                var4.Field4 = var0.Field2().readUTF();
                var4.Field34.removeAllElements();
                var4.Field24 = System.currentTimeMillis();
                var4.Field23 = var0.Field2().readUnsignedShort();
                byte var5 = var0.Field2().readByte();

                for (byte var6 = 0; var6 < var5; ++var6) {
                    Class826 var7 = new Class826((short) var0.Field2().readUnsignedByte(), var0.Field2().readShort());
                    var4.Field34.addElement(var7);
                }

                var4.Field8 = var0.Field2().readByte();
                var4.Field32 = true;
                var2.addElement(var4);
            }

            Class324.Field26 = var0.Field2().readUTF();
            Class324.Field32 = var0.Field2().readUTF();
            Class324.Field5().Field23 = var2;
            System.out.println("cho nay ne " + Class324.Field26);
            Class752.Field5();
            boolean var9 = false;
            Class324.Field5().Field1();
            Class324.Field5().Field1(0, Class324.Field5().Field10, Class324.Field5().Field10 ? Class324.Field5().Field24 : new byte[]{0, 1, 2, 3, 4, 5, 6, 31});
            Class324.Field22 = Class106.Field19.Field15;
            Class324.Field5().Field8();
        } catch (Exception var8) {
        }
    }

    public final void Field18(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();
            short var3 = var1.Field2().readShort();
            String var4 = var1.Field2().readUTF();
            int var5 = var1.Field2().readInt();
            boolean var6 = false;
            boolean var7 = false;

            short var16;
            byte var17;
            try {
                var16 = var1.Field2().readShort();
                var17 = var1.Field2().readByte();
            } catch (Exception var10) {
                var16 = -1;
                var17 = -1;
            }

            long var8 = System.currentTimeMillis() + (long) (var5 * 1000);
            if (var2 != -1) {
                if (var5 > 0) {
                    Class678 var12;
                    if ((var12 = this.Field4(var3, var2)) != null) {
                        Field141 = var12;
                    }

                    Field198 = new Class80(var8, var4);
                }

                if (var5 == 0) {
                    Field198 = null;
                    Field141 = null;
                }
            }

            if (var2 == -1 && var5 >= 0) {
                short var15 = var3;
                Class62 var13 = this;
                int var18 = 0;

                Class354 var10000;
                while (true) {
                    if (var18 >= var13.Field199.size()) {
                        var10000 = null;
                        break;
                    }

                    Class354 var9;
                    if ((var9 = (Class354) var13.Field199.elementAt(var18)) != null && var9.Field3 == var15) {
                        var10000 = var9;
                        break;
                    }

                    ++var18;
                }

                Class354 var14 = var10000;
                if (var14 == null) {
                    var14 = new Class354(var3, var16, (long) var5, var4, var17);
                    this.Field199.addElement(var14);
                }

                if (var14 != null) {
                    var14.Field1 = var4;
                    var14.Field4 = var16;
                    var14.Field1((long) var5);
                    if (var17 == -2) {
                        var14.Field2 = true;
                        return;
                    }
                }
            }
        } catch (Exception var11) {
        }

    }

    private void Field2(Class678 var1) {
        if (Field98 != null && (Field98.Field13 == 1 || Field98.Field13 == 2) && Field98.Field4 == var1.f_()) {
            Field3(var1.f_(), Field98.Field13 == 1 ? 3 : 0, var1.Field193, var1.Field194);
        } else if (Field99 != null && (Field99.Field13 == 1 || Field99.Field13 == 2) && Field99.Field4 == var1.f_()) {
            Field3(var1.f_(), Field99.Field13 == 1 ? 3 : 0, var1.Field193, var1.Field194);
        } else if (Field100 != null && (Field100.Field13 == 1 || Field100.Field13 == 2) && Field100.Field4 == var1.f_()) {
            Field3(var1.f_(), Field100.Field13 == 1 ? 3 : 0, var1.Field193, var1.Field194);
        } else {
            for (int var3 = 0; var3 < Field201.size(); ++var3) {
                Class228 var2;
                if ((var2 = (Class228) Field201.elementAt(var3)).Field13 == 0 && var2.Field3 == var1.f_()) {
                    Field3(var1.f_(), 0, var1.Field193, var1.Field194);
                }
            }

        }
    }

    private static Vector Field7(int var0) {
        Vector var1 = new Vector();
        if (Field98 != null && (Field98.Field13 == 1 || Field98.Field13 == 2) && Field98.Field4 == var0) {
            var1.addElement(new Class86("Trả " + Field98.Field9, new Class294()));
        }

        if (Field99 != null && (Field99.Field13 == 1 || Field99.Field13 == 2) && Field99.Field4 == var0) {
            var1.addElement(new Class86("Trả " + Field99.Field9, new Class297()));
        }

        if (Field100 != null && (Field100.Field13 == 1 || Field100.Field13 == 2) && Field100.Field4 == var0) {
            var1.addElement(new Class86("Trả " + Field100.Field9, new Class296()));
        }

        for (int var2 = 0; var2 < Field201.size(); ++var2) {
            Class228 var3;
            if ((var3 = (Class228) Field201.elementAt(var2)).Field13 == 0 && var3.Field3 == var0) {
                var1.addElement(new Class86(var3.Field9, new Class298(var3)));
            }
        }

        return var1;
    }

    public static Image Field5(int var0) {
        if (Field98 != null && (Field98.Field13 == 1 || Field98.Field13 == 2) && Field98.Field4 == var0) {
            return Class811.Field14;
        } else if (Field99 != null && (Field99.Field13 == 1 || Field99.Field13 == 2) && Field99.Field4 == var0) {
            return Class811.Field14;
        } else if (Field100 != null && (Field100.Field13 == 1 || Field100.Field13 == 2) && Field100.Field4 == var0) {
            return Class811.Field14;
        } else {
            for (int var1 = 0; var1 < Field201.size(); ++var1) {
                Class228 var2;
                if ((var2 = (Class228) Field201.elementAt(var1)).Field13 == 0 && var2.Field3 == var0) {
                    if (var2.Field1 == 3) {
                        return Class811.Field14;
                    }

                    return Class811.Field13;
                }
            }

            return Class811.Field12;
        }
    }

    private static void Field3(int var0, int var1, int var2, int var3) {
        for (int var4 = 0; var4 < Field202.size(); ++var4) {
            Class384 var5;
            if ((var5 = (Class384) Field202.elementAt(var4)) != null && var5.Field8 == var0) {
                return;
            }
        }

        Class384 var6;
        (var6 = new Class384()).Field8 = var0;
        var6.Field7 = (short) var1;
        var6.Field1 = var2;
        var6.Field2 = var3;
        Field202.addElement(var6);
    }

    public final void Field19(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();
            byte var3 = var1.Field2().readByte();
            if (var2 == 0) {
                Field201.removeAllElements();
            }

            for (int var4 = 0; var4 < var3; ++var4) {
                short var5 = var1.Field2().readShort();
                Class228 var12;
                (var12 = new Class228(var5)).Field13 = var2;
                var12.Field5 = var1.Field2().readByte();
                var12.Field9 = var1.Field2().readUTF();
                String[] var13;
                int var14;
                switch (var2) {
                    case 0:
                        var12.Field3 = var1.Field2().readByte();
                        var13 = Class809.Field1(var1.Field2().readUTF(), ">");

                        for (var14 = 0; var14 < var13.length; ++var14) {
                            var12.Field6.addElement(var13[var14]);
                        }

                        var12.Field1 = var1.Field2().readByte();
                        var12.Field19 = var1.Field2().readByte();
                        break;
                    case 1:
                        var12.Field4 = var1.Field2().readByte();
                        var13 = Class809.Field1(var1.Field2().readUTF(), ">");

                        for (var14 = 0; var14 < var13.length; ++var14) {
                            var12.Field7.addElement(var13[var14]);
                        }

                        var12.Field8 = var1.Field2().readUTF();
                        var12.Field17 = var1.Field2().readUTF();
                        break;
                    case 2:
                        var12.Field1 = var1.Field2().readByte();
                        var12.Field8 = var1.Field2().readUTF();
                        var12.Field4 = var1.Field2().readByte();
                        var12.Field19 = var1.Field2().readByte();
                        var12.Field17 = var1.Field2().readUTF();
                        int var6;
                        byte var7;
                        short var8;
                        short var9;
                        short var10;
                        if (var12.Field1 == 2) {
                            var7 = var1.Field2().readByte();
                            var12.Field14 = new short[var7];
                            var12.Field16 = new short[var7];
                            var12.Field15 = new short[var7];

                            for (var6 = 0; var6 < var7; ++var6) {
                                var8 = var1.Field2().readShort();
                                var9 = var1.Field2().readShort();
                                var10 = var1.Field2().readShort();
                                var12.Field14[var6] = var8;
                                var12.Field15[var6] = var9;
                                var12.Field16[var6] = var10;
                            }
                        } else if (var12.Field1 == 0) {
                            var7 = var1.Field2().readByte();
                            var12.Field10 = new short[var7];
                            var12.Field12 = new short[var7];
                            var12.Field11 = new short[var7];

                            for (var6 = 0; var6 < var7; ++var6) {
                                var8 = var1.Field2().readShort();
                                var9 = var1.Field2().readShort();
                                var10 = var1.Field2().readShort();
                                var12.Field10[var6] = var8;
                                var12.Field11[var6] = var9;
                                var12.Field12[var6] = var10;
                            }
                        } else if (var12.Field1 == 4) {
                            var12.Field12 = new short[1];
                            var12.Field11 = new short[1];
                            var12.Field11[0] = var1.Field2().readShort();
                            var12.Field12[0] = var1.Field2().readShort();
                        }
                }

                if (var2 == 0) {
                    Field201.addElement(var12);
                    if (var12.Field5 == 0 && Class357.Field97[0] == 0) {
                        this.Field35 = var12.Field3;
                        this.Field1(this.Field35);
                    }
                } else if (var12.Field5 == 0) {
                    Field98 = var12;
                } else if (var12.Field5 == 1) {
                    Field99 = var12;
                } else if (var12.Field5 == 2) {
                    Field100 = var12;
                }
            }

        } catch (Exception var11) {
            var11.printStackTrace();
        }
    }

    public static void Field20(Class85 var0) {
        try {
            Class268 var10000 = Class268.Field5();
            Class85 var1 = var0;
            Class268 var10 = var10000;

            try {
                byte var2;
                if ((var2 = var1.Field2().readByte()) == 0) {
                    var10.Field9();
                    var10.Field6 = new Vector();
                    Class740 var11 = null;
                    var10.Field2 = var1.Field2().readUTF();
                    byte var12 = var1.Field2().readByte();

                    for (int var4 = 0; var4 < var12; ++var4) {
                        String var5 = var1.Field2().readUTF();
                        byte var6 = var1.Field2().readByte();
                        byte var7 = var1.Field2().readByte();
                        (var11 = new Class740(var10)).Field3 = var6;
                        var11.Field5 = var5;
                        var11.Field4 = var7;
                        var11.Field1 = var10.Field3[var4];
                        var11.Field2 = var10.Field4[var4];
                        var10.Field6.addElement(var11);
                    }

                    return;
                }

                if (var2 == 1) {
                    var2 = var1.Field2().readByte();
                    Class740 var3;
                    (var3 = (Class740) var10.Field6.elementAt(var2)).Field6 = var1.Field2().readUTF();
                    var10.Field1(var3.Field6);
                    return;
                }
            } catch (Exception var8) {
                var8.printStackTrace();
            }

        } catch (Exception var9) {
        }
    }

    public static void Field21(Class85 var0) {
        Class358.Field5().Field1(var0);
    }

    public static void Field1(Class114 var0, Class114 var1, int var2, byte var3, int var4) {
        Class804 var5;
        (var5 = new Class804(var4)).Field1(0, var0.Field193, var0.Field194, var2, var3, var0, var1);
        if (var4 == 10) {
            var5.Field2 = 46;
        } else if (var4 == 11) {
            var5.Field2 = 45;
        } else if (var4 == 12) {
            var5.Field2 = 30;
        } else if (var4 == 15) {
            var5.Field2 = 58;
        }

        Field12.addElement(var5);
    }

    public static Class177 Field1(Class114 var0, int var1, int var2, int var3) {
        Class177 var4 = new Class177(var1, var2, var3);
        if (var0 != null) {
            var4.Field11 = var0;
            if (var0.Field14() != -1) {
                var4.Field13 = -5;
            }
        }

        switch (var3) {
            case 41:
                var4.Field12 = 2;
                var4.Field13 = (byte) (var4.Field13 - 6);
                break;
            case 42:
            case 56:
                var4.Field12 = 2;
                var4.Field13 = (byte) (var4.Field13 - 6);
                break;
            case 43:
                var4.Field12 = 3;
                var4.Field13 = (byte) (var4.Field13 - 6);
                break;
            case 44:
            case 47:
            case 57:
                var4.Field12 = 1;
                var4.Field6 -= 6;
                var4.Field13 = (byte) (var4.Field13 - 6);
            case 45:
            case 46:
            case 48:
            case 49:
            case 50:
            case 51:
            case 52:
            case 53:
            case 54:
            case 55:
        }

        return var4;
    }

    public final void Field22(Class85 var1) {
        int[] var2 = new int[]{41, 42, 43, 56};
        int[] var3 = new int[]{12, 10, 11, 15};
        int[] var4 = new int[]{44, 44, 47, 57};

        try {
            short var5 = var1.Field2().readShort();
            Class114 var19;
            if ((var19 = (Class114) this.Field6((int) var5)) != null) {
                byte var6 = var1.Field2().readByte();
                byte var7 = var1.Field2().readByte();
                byte var8 = var1.Field2().readByte();
                Vector var9 = new Vector();
                Vector var10 = new Vector();
                Vector var11 = new Vector();

                for (int var12 = 0; var12 < var8; ++var12) {
                    short var13 = var1.Field2().readShort();
                    int var14 = var1.Field2().readInt();
                    int var15 = var1.Field2().readInt();
                    int var16;
                    if (var6 == 0) {
                        Class357 var22;
                        if ((var22 = (Class357) this.Field6((int) var13)) != null) {
                            var10.addElement(String.valueOf(var14));
                            var9.addElement(var22);
                            var11.addElement(String.valueOf(var15));

                            for (var16 = 0; var16 < 3; ++var16) {
                                Class357 var23;
                                (var23 = new Class357()).Field193 = (short) (var22.Field193 + (Field66.nextInt() % 10 << 4));
                                var23.Field194 = (short) (var22.Field194 + (Field66.nextInt() % 10 << 4));
                                var9.addElement(var23);
                                var10.addElement(String.valueOf(var14));
                                var11.addElement(String.valueOf(var15));
                            }
                        }
                    } else {
                        Class126 var21;
                        if (var6 == 1 && (var21 = this.Field14(var13)) != null) {
                            var10.addElement(String.valueOf(var14));
                            var9.addElement(var21);
                            var11.addElement(String.valueOf(var15));

                            for (var16 = 0; var16 < 3; ++var16) {
                                Class126 var17;
                                (var17 = new Class126()).Field193 = (short) (var21.Field193 + (Field66.nextInt() % 10 << 4));
                                var17.Field194 = (short) (var21.Field194 + (Field66.nextInt() % 10 << 4));
                                var9.addElement(var17);
                                var10.addElement(String.valueOf(var14));
                                var11.addElement(String.valueOf(var15));
                            }
                        }
                    }
                }

                Class177 var20;
                (var20 = Field1(var19, var19.Field193, var19.Field194, var2[var7])).Field14 = new Class796();
                var20.Field14.Field1 = var19;
                var20.Field14.Field2 = var9;
                var20.Field14.Field5 = var4[var7];
                var20.Field14.Field3 = var10;
                var20.Field14.Field4 = var11;
                var20.Field14.Field6 = 0;
                var20.Field14.Field7 = var3[var7];
                Class73.Field2.addElement(var20);
                return;
            }
        } catch (Exception var18) {
        }

    }

    public final void Field23(Class85 var1) {
        try {
            if (var1.Field2().readByte() == 0) {
                Class352.Field5().Field1((Class671) this);
                Class352.Field5().Field1((byte) 1, false);
                return;
            }

            String var4 = var1.Field2().readUTF();
            byte var5 = var1.Field2().readByte();
            if (Class106.Field17 == Class352.Field5()) {
                Class352.Field5().Field19 = var4;
                Class352.Field5().Field9();
                Class106.Field7();
            }

            if (var5 == 1) {
                Class352.Field5().Field10();
                Class352.Field26 = true;
                return;
            }
        } catch (Exception var3) {
        }

    }

    public final void Field24(Class85 var1) {
        try {
            byte var2;
            if ((var2 = var1.Field2().readByte()) == 0) {
                Class352.Field5().Field1((Class671) this);
                Class352.Field5().Field1((byte) 0, false);
                return;
            }

            if (var2 == 4) {
                Class106.Field17.a_(var1.Field2().readShort(), var1.Field2().readByte(), var1.Field2().readByte());
                return;
            }
        } catch (Exception var3) {
        }

    }

    public static void Field25(Class85 var0) {
        try {
            byte var1;
            if ((var1 = var0.Field2().readByte()) == -1) {
                Class106.Field36.Field1(Class106.Field17);
                return;
            }

            byte var2 = var1;
            if (var1 == 3) {
                var2 = 4;
            } else if (var1 == 4) {
                var2 = 5;
            }

            ((Vector) Class374.Field1.elementAt(var2)).removeAllElements();
            byte var3 = var0.Field2().readByte();

            for (int var4 = 0; var4 < var3; ++var4) {
                Class534 var5;
                (var5 = new Class534()).Field32 = true;
                var5.Field30 = var0.Field2().readByte();
                var5.Field18 = var0.Field2().readShort();
                var5.Field19 = var0.Field2().readByte();
                var5.Field25 = var0.Field2().readByte();
                var5.Field22 = var0.Field2().readShort();
                var5.Field21 = var0.Field2().readShort();
                var5.Field35 = var0.Field2().readByte();
                var5.Field36 = var0.Field2().readByte();
                var5.Field37 = var0.Field2().readByte();
                var5.Field14 = var0.Field2().readByte();
                var5.Field15 = var0.Field2().readByte();
                var5.Field16 = var0.Field2().readByte();
                var5.Field17 = var0.Field2().readByte();
                var5.Field29 = var0.Field2().readByte();
                var5.Field4 = var0.Field2().readUTF();
                var5.Field5 = var0.Field2().readUTF();
                var5.Field6 = var0.Field2().readUTF();
                var5.Field28 = var0.Field2().readInt();
                var5.Field40 = var0.Field2().readInt();
                var5.Field41 = var0.Field2().readLong();
                var5.Field42 = var0.Field2().readUTF();
                var5.Field34.removeAllElements();
                byte var6 = var0.Field2().readByte();

                for (byte var7 = 0; var7 < var6; ++var7) {
                    Class826 var8 = new Class826((short) var0.Field2().readUnsignedByte(), var0.Field2().readShort());
                    var5.Field34.addElement(var8);
                }

                ((Vector) Class374.Field1.elementAt(var2)).addElement(var5);
            }

            if (var1 == 0) {
                Class374.Field10();
            }

            if (var1 == 3) {
                Class374.Field8 = var0.Field2().readLong();
            }

            Class374.Field2[var2] = var0.Field2().readShort();
            if (Class374.Field3[var2] >= Class374.Field2[var2]) {
                Class374.Field3[var2] = 0;
                return;
            }
        } catch (Exception var9) {
            var9.printStackTrace();
        }

    }

    public static void Field26(Class85 var0) {
        try {
            short var1 = (short) var0.Field2().readUnsignedByte();
            short var2 = var0.Field2().readShort();
            if (var1 == 0) {
                byte[] var4 = new byte[var0.Field2().readByte()];
                var0.Field2().read(var4, 0, var4.length);
                Class811.Field1(var2, var4);
                Class811.Field46[var2].Field12 = var0.Field2().readUTF();
                var0.Field2().readByte();
                var0.Field2().readInt();
                Class811.Field46[var2].Field13 = var0.Field2().readByte();
                Class811.Field46[var2].Field14 = var0.Field2().readByte();
                byte var5 = var0.Field2().readByte();
                Class811.Field46[var2].Field11 = var5;
                if (var5 == 1) {
                    var4 = new byte[var0.Field2().readShort()];
                    var0.Field2().read(var4, 0, var4.length);
                    Class811.Field46[var2].Field2(var4);
                    return;
                }
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

    }

    public static void Field27(Class85 var0) {
        try {
            short var1 = var0.Field2().readShort();
            byte var2;
            if ((var2 = var0.Field2().readByte()) == 0) {
                short var3 = var0.Field2().readShort();
                byte var4;
                int[] var5 = new int[var4 = var0.Field2().readByte()];
                int[] var6 = new int[var4];
                Vector var7 = new Vector();
                Class678 var8;
                if ((var8 = Class106.Field19.Field4((short) var1, (byte) 12)) != null) {
                    int var9 = 0;

                    while (true) {
                        if (var9 >= var4) {
                            var8.Field1(var7, var2, var3, var5, var6);
                            break;
                        }

                        byte var10 = var0.Field2().readByte();
                        short var11 = var0.Field2().readShort();
                        Class678 var13;
                        if ((var13 = Class106.Field19.Field4(var11, var10)) != null) {
                            var7.addElement(var13);
                        }

                        var5[var9] = var0.Field2().readInt();
                        var6[var9] = var0.Field2().readInt();
                        ++var9;
                    }
                }
            }

            if (var2 == 1) {
                Class678 var14 = Class106.Field19.Field3(var1);
                short var15 = var0.Field2().readShort();
                long var16 = var0.Field2().readLong();
                if (var14 != null) {
                    var14.Field1(var15, var14.Field193, var14.Field194, var16);
                    return;
                }
            }
        } catch (Exception var12) {
        }

    }

    public final void Field28(Class85 var1) {
        try {
            byte var2 = var1.Field2().readByte();
            short var3 = var1.Field2().readShort();
            short var4 = var1.Field2().readShort();
            long var5 = var1.Field2().readLong();
            int var7 = var1.Field2().readByte() << 4;
            int var8 = var1.Field2().readByte() << 4;
            byte var9 = var1.Field2().readByte();
            byte var10 = var1.Field2().readByte();
            Class114 var11 = (Class114) (var9 == 0 ? this.Field2(var4) : this.Field14(var4));
            Class48 var14;
            (var14 = new Class48(var3)).Field2 = var5;
            var14.Field193 = (short) var7;
            var14.Field194 = (short) var8;
            var14.Field188 = var9;
            var14.Field4 = var1.Field2().readByte();
            byte var15 = var1.Field2().readByte();
            boolean var6 = false;

            try {
                int var16 = var1.Field2().readInt();
                var14.Field3 = var16;
            } catch (Exception var12) {
            }

            if (var11 != null && var2 == 1) {
                if (var10 == 0) {
                    var11.Field2(var14, var15);
                    return;
                }

                var11.Field1(var14, var15);
                return;
            }

            if (var4 > 32000 || var2 == 0) {
                if (var11 != null) {
                    var14.Field193 = var11.Field193;
                    var14.Field194 = var11.Field194;
                }

                this.Field10.addElement(var14);
                return;
            }
        } catch (Exception var13) {
            var13.printStackTrace();
        }

    }

    public final void Field29(Class85 var1) {
        try {
            switch (var1.Field2().readByte()) {
                case 0:
                    byte var2 = var1.Field2().readByte();
                    short var3 = var1.Field2().readShort();
                    short var4 = var1.Field2().readShort();
                    int var5 = var1.Field2().readInt();
                    boolean var6 = var1.Field2().readBoolean();
                    boolean var7 = var1.Field2().readBoolean();
                    long var9 = 0L;
                    if (var5 > 0) {
                        var9 = (long) var5 + System.currentTimeMillis();
                    }

                    Class678 var13 = this.Field4(var3, var2);
                    var2 = 0;

                    try {
                        var2 = var1.Field2().readByte();
                    } catch (Exception var11) {
                    }

                    if (var13 != null) {
                        var13.Field1(var4, var13.Field193, var13.Field194, var9, var6, var7, true, 0, (byte) Class811.Field1(1, 8), var2);
                        return;
                    }
                    break;
                default:
                    return;
            }
        } catch (Exception var12) {
        }

    }

    public static void Field1(Class114 var0, int var1, long var2, int var4, int var5, int var6) {
        Class48 var7;
        (var7 = new Class48(var1)).Field2 = var2;
        var7.Field193 = var0.Field193;
        var7.Field194 = var0.Field194;
        var7.Field188 = var0.Field188;
        var7.Field4 = 0;
        var7.Field5 = var5;
        if (var6 == 0) {
            var0.Field1(var7, 0);
        } else {
            Class106.Field19.Field10.addElement(var7);
        }
    }

    public static void Field3(Graphics var0) {
        Class106.Field1(var0);
        if (Field42 != null) {
            byte var1 = 15;
            if (Class106.Field17 == Class106.Field19) {
                var1 = 40;
            }

            var0.drawImage(Field42, 0, var1, 0);
        }

    }

    static void Field1(Class62 var0, int var1, Vector var2) {
        var0.Field1(var1, var2);
    }

    static void Field1(Class62 var0, int var1, String var2, String var3) {
        Class194 var4;
        (var4 = new Class194(10, 40, 120, Class671.Field108)).Field5 = true;
        Class520.Field5().Field105 = var4.Field9;
        Class194 var5;
        (var5 = new Class194(10, 75, 120, Class671.Field108)).Field3(3);
        Class520.Field5().Field1(Class106.Field15 - 70, Class106.Field14 - Class671.Field108 - 120, 140, 100, var3, new Class86("Nạp", new Class38(var0, var1, var2, var4, var5)));
        Class520.Field5().Field103 = new Class86("Đóng", new Class44(var0));
        Class520.Field5().Field2 = new Class5(var0, var4, var5);
        Class520.Field5().Field1();
    }

    static void Field1(Class62 var0) {
        var0.Field32();
    }
}
