package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class Class357 extends Class114 {
    public static short Field51 = 25;
    public static Image Field52 = null;
    public static Image Field53;
    public int Field54 = 1;
    public int Field55;
    public static boolean Field56 = false;
    public byte Field57 = 3;
    public Class432 Field58;
    private byte Field1;
    public int Field59;
    public int Field60;
    public boolean Field61 = false;
    public boolean Field62 = true;
    public byte Field63 = -1;
    public byte Field64 = 0;
    public String Field65;
    public String Field66 = "";
    public Class114 Field67;
    private byte Field32;
    public byte Field68;
    public long[] Field69 = new long[11];
    public long Field70;
    public long Field71;
    public long[] Field72 = new long[11];
    public short Field73;
    public short Field74;
    public short Field75;
    public short Field76 = -1;
    public short Field77;
    public short Field78;
    public short Field79;
    public short Field80;
    public short Field81;
    public short Field82;
    public short Field83;
    public short Field84;
    public short Field85 = -1;
    public short Field86 = -1;
    public short Field87 = -1;
    public short Field88 = -1;
    public short Field89 = -1;
    public int Field90;
    public int Field91;
    public int Field92;
    public byte Field93;
    public byte Field94 = -1;
    public byte Field95 = 1;
    public short Field96;
    public static byte[] Field97;
    public Vector Field98;
    public Vector Field99;
    public int Field100 = 0;
    public int Field101 = -1;
    public Image Field102;
    public Image Field103;
    public short Field104;
    public short Field105;
    public short Field106 = -1;
    private short Field33 = -1;
    private short Field34 = -1;
    private short Field35 = -1;
    private short Field36 = -1;
    public short Field107 = -1;
    private short[] Field37;
    private byte[] Field38;
    private short Field39 = -1;
    public short Field108 = -1;
    public short Field109 = -1;
    public byte Field110 = -1;
    public byte Field111 = 0;
    public byte Field112 = 0;
    public byte Field113 = 0;
    public byte Field114 = -1;
    public short Field115 = -1;
    public short Field116 = -1;
    public int Field117 = -1;
    public int Field118 = -1;
    public byte Field119 = 0;
    public byte Field120;
    public int[] Field121;
    public long Field122;
    public long[] Field123;
    public static byte[] Field124 = new byte[5];
    public static Vector Field125 = new Vector();
    public static Vector Field126 = new Vector();
    public static Vector Field127 = new Vector();
    public static Vector Field128 = new Vector();
    public int Field129;
    public int Field130;
    public byte Field131;
    public int Field132;
    public byte[] Field133;
    public byte[] Field134;
    public short[] Field135;
    public boolean Field136;
    public byte Field137;
    public byte Field138;
    public boolean Field139;
    public boolean Field140;
    public boolean Field141;
    public Class534 Field142;
    public long Field143;
    public long Field144;
    public static int Field145 = 0;
    public int Field146;
    public static String Field147 = "";
    public Class177 Field148;
    public Class177 Field149;
    public boolean Field150;
    public Class732 Field151;
    public Class145 Field152;
    public short[] Field153;
    public short Field154;
    public int Field155;
    public int Field156;
    public int Field157;
    public static byte Field158 = 3;
    public long Field159;
    private static byte[] Field40;
    private static byte[] Field41;
    private static byte[] Field42;
    public static final byte[] Field160;
    public boolean Field161;
    public int Field162;
    public long Field163;
    public long Field164;
    public long Field165;
    private static Hashtable Field43;
    private int Field44;
    private static short[][][] Field45;
    private static byte[][] Field46;
    private static byte[][] Field47;
    private static byte[][] Field48;
    private static byte[][][] Field49;
    private static byte[][][] Field50;
    private static byte[][] Field183;
    private static byte[][][] Field184;
    private static byte[] Field185;
    public byte Field166;
    public byte Field167;
    public byte Field168;
    private short[] Field186;
    private static byte[][][] Field219;
    private int Field220;
    private int Field221;
    private int Field222;
    private static byte[] Field223;
    public Class177 Field169;
    private static int Field224;
    private byte Field225;
    public byte Field170;
    private int Field226;
    private int Field227;
    private static byte[] Field228;
    private static byte[][] Field229;
    public static Class389[][][] Field171;
    private static byte[][] Field230;
    private static byte[][] Field231;
    private static byte[][] Field232;
    private static byte[][] Field233;
    private static byte[][] Field234;
    private static byte[] Field235;
    private static byte[] Field236;
    public static byte[][] Field172;
    public static byte[][] Field173;
    public static byte[][] Field174;
    public static byte[][] Field175;
    public static byte[][] Field176;
    private byte Field237;
    private byte Field238;
    private byte Field239;
    private byte Field240;
    private byte Field241;
    private static byte[][] Field242;
    private static byte[][] Field243;
    private byte Field244;
    private byte Field245;
    private byte Field246;
    public static int[][] Field177;
    public static int[][] Field178;
    public static int[][] Field179;
    public static int[][] Field180;
    private byte Field247;
    public String Field181;
    public static final byte[] Field182;

    static {
        byte[] var10000 = new byte[]{0, 0, -1, 1};
        var10000 = new byte[]{1, -1, 0, 0};
        Field40 = new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1};
        Field41 = new byte[]{2, 2, 2, 0, 0, 0, 3, 3, 3, 0, 0, 0};
        Field42 = new byte[]{2, 2, 2, 0, 0, 3, 3, 3, 0, 0};
        Field160 = new byte[]{1, 1, 2, 1, 2};
        Field43 = new Hashtable();
        Field45 = new short[][][]{{{95, 112, 130}, {246, 263, 280}, {216, 182, 149}, {298, 329, 363}}, {{119, 138, 158}, {308, 325, 341}, {267, 223, 178}, {359, 400, 444}}, {{107, 124, 140}, {276, 292, 309}, {239, 197, 158}, {324, 362, 404}}, {{115, 133, 150}, {296, 313, 330}, {254, 210, 167}, {347, 387, 433}}, {{129, 152, 179, 152}, {210, 233, 260, 233}, {0, 43, 86, 43}, {291, 334, 377, 334}}, {{180, 210, 255, 210}, {303, 333, 379, 333}, {0, 60, 120, 60}, {427, 487, 547, 487}}, {{0, 24, 48}, {171, 192, 213}, {72, 106, 140}, {234, 265, 299}}, {{180, 210, 255, 210}, {303, 333, 379, 333}, {0, 60, 120, 60}, {427, 487, 547, 487}}};
        Field46 = new byte[][]{{0, 0, -3, 3}, {0, 0, -3, 3}, {0, 0, -3, 3}, {0, 0, -3, 3}, {0, 0, -3, 3}, {0, 0, 3, -4}, {0, 0, -3, 3}, {0, 0, 3, -4}};
        Field47 = new byte[][]{new byte[4], new byte[4], new byte[4], new byte[4], new byte[4], {-2, 0, 7, 7}, new byte[4], {-2, 0, 7, 7}};
        Field48 = new byte[][]{{-12, -7, -10, -10}, {-12, -7, -10, -10}, {-12, -7, -10, -10}, {-12, -7, -10, -10}, {-12, -7, -10, -10}, {-12, -7, -10, -10}, {-12, -7, -10, -10}, {-12, -7, -10, -10}};
        Field49 = new byte[][][]{{{0, -2, 0}, {0, -2, 0}, {0, -2, 2}, {0, -2, 2}}, {{0, -2, 0}, {0, -2, 0}, {0, -2, 2}, {0, -2, 2}}, {{0, -2, 0}, {0, -2, 0}, {0, -2, 2}, {0, -2, 2}}, {{0, -2, 0}, {0, -2, 0}, {0, -2, 2}, {0, -2, 2}}, {{0, -2, 0, -2}, {0, -2, 0, -2}, {0, -2, 0, -2}, {0, -2, 0, -2}}, {{-3, -2, 1, -2}, {0, -2, 1, -2}, {0, -2, 1, -2}, {0, -2, 1, -2}}, {{0, -2, 0}, {0, -2, 0}, {0, -2, 2}, {0, -2, 2}}, {{-3, -2, 1, -2}, {0, -2, 1, -2}, {0, -2, 1, -2}, {0, -2, 1, -2}}};
        Field50 = new byte[][][]{{new byte[3], new byte[3], {0, -2, 0}, {0, 2, 0}}, {new byte[3], new byte[3], {0, -2, 0}, {0, 2, 0}}, {new byte[3], new byte[3], {-2, -2, -2}, {2, 2, 2}}, {new byte[3], new byte[3], {-2, -2, -2}, {2, 2, 2}}, {new byte[4], new byte[4], {-4, -4, -4, -4}, {2, 2, 2, 2}}, {new byte[4], new byte[4], {-4, -4, -2, -4}, {2, 2, 1, 2}}, {new byte[3], new byte[3], {0, -2, 0}, {0, 2, 0}}, {new byte[4], new byte[4], {-4, -4, -2, -4}, {2, 2, 1, 2}}};
        Field183 = new byte[][]{{0, 0, -2, 2}, {0, 0, -2, 2}, {0, 0, -2, 2}, {0, 0, -2, 2}, {0, 0, -2, 2}, {0, 0, -2, 2}, {0, 0, -2, 2}, {0, 0, -2, 2}};
        Field184 = new byte[][][]{{{18, 18, 18}, {17, 17, 17}, {31, 34, 33}, {31, 34, 33}}, {{20, 20, 20}, {17, 17, 17}, {41, 44, 44}, {41, 44, 44}}, {{17, 17, 17}, {16, 16, 16}, {37, 42, 40}, {37, 42, 40}}, {{17, 17, 17}, {17, 17, 17}, {41, 45, 43}, {41, 45, 43}}, {{23, 27, 31, 27}, {23, 27, 31, 27}, {43, 43, 43, 43}, {43, 43, 43, 43}}, {{30, 45, 48, 45}, {30, 45, 48, 45}, {60, 60, 60, 60}, {60, 60, 60, 60}}, {{24, 24, 24}, {21, 21, 21}, {34, 34, 31}, {31, 34, 34}}, {{30, 45, 48, 45}, {30, 45, 48, 45}, {60, 60, 60, 60}, {60, 60, 60, 60}}};
        Field185 = new byte[]{28, 26, 23, 27, 35, 45, 37, 45};
        Field219 = new byte[][][]{{{5, 4, 0, 1, 2, 3}, {1, 4, 2, 3, 5}, {4, 5, 0, 1, 2, 3}, {4, 5, 0, 1, 2, 3}}, {{4, 0, 1, 2, 3, 5}, {0, 1, 4, 2, 3, 5}, {4, 0, 1, 2, 3, 5}, {4, 0, 1, 2, 3, 5}}};
        Field223 = new byte[]{2, 2, 2, 3, 3, 4, 4, 4};
        Field224 = 0;
        Field228 = new byte[]{0, 1, 2, 3, 2, 1};
        Field229 = new byte[][]{{0, 1, 2, 0, 0, 2, 2, 2, 2}, {0, 1, 2, 0, 0, 2, 2, 2, 2}, {0, 1, 2, 0, 0, 0, 2, 2, 2, 2, 2}, {0, 1, 2, 0, 0, 2, 2, 2, 2}, {0, 1, 2, 0, 0, 2, 2, 2, 2}};
        Field171 = new Class389[5][15][7];
        Field230 = new byte[][]{{2, 0, 0, 0}, {0, 2, 2, 0}, {2, 0, 0, 2}, {0, 2, 0, 0}, {0, 2, 2, 0}};
        Field231 = new byte[][]{{0, 0, 21, 21, 0, 0, 21, 21, 0, 0, 21, 21, 0, 0, 21, 21, 0, 0, 21, 21, 0, 0, 21, 21, 0, 0, 29, 14}, {12, 12, 0, 0, 12, 12, 0, 0, 12, 12, 0, 0, 12, 12, 0, 0, 12, 12, 0, 0, 12, 12, 0, 0, 11, 11, 0, 0}, new byte[28], {15, 15, 38, 0, 15, 15, 38, 0, 15, 15, 38, 0, 15, 15, 38, 0, 15, 15, 38, 0, 15, 15, 38, 0, 16, 16, 43, 0}, {14, 14, 0, 0, 15, 15, 0, 0, 15, 15, 0, 0, 15, 15, 0, 0, 16, 16, 0, 0, 19, 19, 0, 0, 21, 21, 0, 0}};
        Field232 = new byte[][]{{21, 21, 11, 11, 21, 21, 11, 11, 21, 21, 11, 11, 21, 21, 11, 11, 21, 21, 11, 11, 21, 21, 11, 11, 14, 14, 5, 15}, {19, 19, 9, 11, 19, 19, 9, 11, 19, 19, 9, 11, 19, 19, 9, 11, 20, 20, 12, 12, 19, 19, 9, 11, 20, 20, 12, 12}, {14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 14, 15, 15, 15, 15, 14, 14, 14, 14, 15, 15, 15, 15}, {24, 24, 8, 15, 24, 24, 8, 15, 24, 24, 8, 15, 24, 24, 8, 15, 24, 24, 8, 15, 24, 24, 8, 15, 24, 24, 8, 15}, {21, 21, 14, 14, 21, 21, 15, 15, 21, 21, 15, 15, 21, 21, 15, 15, 22, 22, 16, 16, 21, 21, 15, 15, 26, 26, 20, 20}};
        Field233 = new byte[][]{{0, 0, -6, 0, 0, 0, -6, 0, 0, 0, -6, 0, 0, 0, -6, 0, 0, 0, -6, 0, 0, 0, -6, 0, 6, 2, 0, 1}, {0, 0, -5, 0, 0, 0, -5, 0, 0, 0, -5, 0, 0, 0, -5, 0, 0, 0, -7, 0, 0, 0, -5, 0, 0, 0, -7, 0}, new byte[28], new byte[28], {0, 0, 0, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 0, 0, -1, 0, 3, -2, 1, 1, 0, -2, -2, -2}};
        Field234 = new byte[][]{{0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0, 1, 0}, {0, 0, -3, 0, 0, 0, -3, 0, 0, 0, -3, 0, 0, 0, -3, 0, 0, 0, -3, 0, 0, 0, -3, 0, 0, 0, -3, 0}, new byte[28], new byte[28], new byte[28]};
        Field235 = new byte[]{21, 40, 14, 28, 20};
        Field236 = new byte[]{0, -1, 0, 0, 0};
        Field172 = new byte[][]{{0, 0, 7, -7}};
        Field173 = new byte[][]{{-20, -15, -15, -15}};
        Field174 = new byte[][]{new byte[1], new byte[1]};
        Field175 = new byte[][]{new byte[1], new byte[1]};
        Field176 = new byte[][]{new byte[1], new byte[1]};
        Field242 = new byte[][]{{7, -15, 7, -12}, {6, -14, -4, -1}, {-12, 3, 8, -12}, {9, -15, 7, -10}, {-14, -13, 7, -11}};
        Field243 = new byte[][]{{-12, -8, -10, -1}, {-12, -8, -15, -11}, {-6, -6, -6, -6}, {-12, -5, -19, 0}, {-18, 3, 0, -4}};
        Field177 = new int[][]{new int[5], {2, 0, 0, 3, 0}, new int[5], new int[5], {0, 4, 0, 0, 0}};
        Field178 = new int[][]{new int[5], new int[5], new int[5], new int[5], {1, 0, 0, 0, 0}};
        Field179 = new int[][]{{0, -25, 0, 25, 15}, {10, 0, -15, 10, -10}, {5, 0, 0, -35, -5}, {-20, 5, 35, 0, -10}, {80, -5, 5, 30, 0}};
        Field180 = new int[][]{{0, -5, -15, 20, 0}, {-90, 0, -15, 40, -35}, {0, 0, 0, -5, -15}, {-20, 10, 5, 0, -10}, {-25, 0, 0, 20, 0}};
        Field182 = new byte[]{19, 20, 22, 23, 24, 25, 27};
    }

    public final boolean Field20() {
        return this.Field21() > 42 * Class106.Field19.Field15.Field35;
    }

    public final int Field21() {
        int var10000 = Field125.size() + Class582.Field37.size();
        Class357 var3 = this;
        int var1 = 0;

        for (int var2 = 1; var2 < var3.Field121.length; ++var2) {
            if (var3.Field121[var2] > 0) {
                ++var1;
            }
        }

        return var10000 + var1 + Class582.Field39.size();
    }

    public final byte Field24() {
        return Field124[this.Field93];
    }

    public final String Field25() {
        String var1 = "";
        int var2 = Field145 * '\uea60';
        long var3 = System.currentTimeMillis() - this.Field144;
        long var5;
        if ((var5 = (long) var2 - var3) > 0L) {
            long var7 = var5 / 3600000L;
            long var9 = var5 % 3600000L / 1000L / 60L;
            var1 = var7 + " : " + var9;
            if (var7 == 0L && var9 == 0L) {
                var1 = "";
            }
        }

        return var1;
    }

    public static int Field26() {
        int var0 = 0;

        for (int var1 = 0; var1 < Class582.Field36.size(); ++var1) {
            Class230 var2;
            if ((var2 = (Class230) Class582.Field36.elementAt(var1)).Field2 > 7 && var2.Field2 < 12 || var2.Field2 == 158 || var2.Field2 == 157) {
                ++var0;
            }
        }

        return var0;
    }

    public static int Field27() {
        int var0 = 0;

        for (int var1 = 0; var1 < Class582.Field36.size(); ++var1) {
            if (((Class230) Class582.Field36.elementAt(var1)).Field2 < 5) {
                ++var0;
            }
        }

        return var0;
    }

    public static boolean Field28() {
        for (int var0 = 0; var0 < Class582.Field37.size(); ++var0) {
            Class272 var1;
            if ((var1 = (Class272) Class582.Field37.elementAt(var0)).Field1 > 7 && var1.Field1 < 12 || var1.Field1 == 66 || var1.Field1 == 245 || var1.Field1 == 158 || var1.Field1 == 157) {
                return true;
            }
        }

        return false;
    }

    public static boolean Field29() {
        for (int var0 = 0; var0 < Class582.Field36.size(); ++var0) {
            Class230 var1;
            if ((var1 = (Class230) Class582.Field36.elementAt(var0)).Field2 > 7 && var1.Field2 < 12 || var1.Field2 == 158 || var1.Field2 == 66 || var1.Field2 == 245 || var1.Field2 == 157 || var1.Field2 >= 12 && var1.Field2 <= 66) {
                return true;
            }
        }

        return false;
    }

    public static int Field1(Vector var0, Class534 var1) {
        for (int var2 = 0; var2 < var0.size(); ++var2) {
            if (var0.elementAt(var2) instanceof Class534 && ((Class534) var0.elementAt(var2)).Field9 == var1.Field9) {
                return var2;
            }
        }

        return -1;
    }

    public final void Field19() {
        super.Field204 = 3;
    }

    public Class357() {
        this.Field121 = new int[Field51];
        this.Field123 = new long[Field51];
        this.Field133 = new byte[]{-1, -1, -1, -1, -1, -1, -1};
        this.Field134 = new byte[7];
        this.Field135 = new short[7];
        this.Field136 = false;
        this.Field137 = 0;
        this.Field138 = 3;
        this.Field146 = -1;
        this.Field151 = null;
        this.Field153 = new short[]{-1, -1, -1, -1, -1};
        this.Field161 = false;
        this.Field162 = 0;
        this.Field163 = 0L;
        this.Field165 = 0L;
        this.Field44 = 0;
        this.Field166 = 0;
        this.Field167 = -1;
        this.Field168 = 0;
        this.Field186 = new short[]{-1, -1, -1, -1, -1, -1};
        this.Field221 = 0;
        this.Field225 = 0;
        this.Field170 = 0;
        this.Field226 = 0;
        this.Field237 = 0;
        this.Field238 = 0;
        this.Field239 = 0;
        this.Field240 = 0;
        this.Field241 = 0;
        this.Field181 = "";
        super.Field188 = 0;
        super.Field17 = Field158;
        this.Field32 = 0;
        super.Field195 = 32;
        super.Field196 = 40;
        super.Field4 = 1;
        super.Field2 = 1;
        super.Field12 = (short) Class114.Field30.nextInt(4);
        this.Field163 = System.currentTimeMillis();
        super.Field211 = false;
    }

    public final String a_() {
        return this.Field65 == null ? "" : this.Field65;
    }

    public void a_(Graphics var1, int var2, int var3) {
        var1.translate(-super.Field193 + var2 + 2, -super.Field194 + 20 - 10);
        if (this.Field88 != -1) {
            Class811.Field3(2, this.Field88).Field1(var1, (short) super.Field193, (short) ((short) (super.Field194 + (this.Field87 != -1 ? 5 : 0))), super.Field12, super.Field23);
        }

        if (this.Field87 != -1) {
            Class811.Field3(3, this.Field87).Field1(var1, (short) super.Field193, (short) super.Field194, super.Field12, super.Field23);
        }

    }

    public void Field2(short var1, short var2) {
        if (this.Field9()) {
            this.Field74 = var1;
            this.Field75 = var2;
            if (super.Field193 == var1 && super.Field194 == var2) {
                this.Field159 = System.currentTimeMillis();
                if (super.Field204 == 2) {
                    return;
                }

                if (super.Field204 != 3) {
                    super.Field204 = 0;
                    return;
                }
            } else {
                super.Field204 = 1;
            }

        }
    }

    private void Field18() {
        for (int var1 = 0; var1 < super.Field213.size(); ++var1) {
            Class829 var2;
            (var2 = (Class829) super.Field213.elementAt(var1)).Field1();
            if (var2.Field10) {
                this.Field133[var1] = -1;
                this.Field134[var1] = -1;
                super.Field213.removeElementAt(var1);
            } else {
                var2.Field1(super.Field193, var2.Field2() ? super.Field194 - 12 : super.Field194);
            }
        }

    }

    public final void Field4(int var1) {
        for (int var2 = 0; var2 < super.Field213.size(); ++var2) {
            if (((Class829) super.Field213.elementAt(var2)).Field8 == var1) {
                super.Field213.removeElementAt(var2);
                return;
            }
        }

    }

    public final boolean Field5(int var1) {
        for (int var2 = 0; var2 < super.Field213.size(); ++var2) {
            if (((Class829) super.Field213.elementAt(var2)).Field8 == var1) {
                return true;
            }
        }

        return false;
    }

    public final int[] Field30() {
        long var1 = System.currentTimeMillis() - this.Field143;
        return new int[]{this.Field146, 59 - (int) var1 / 1000 % 60};
    }

    public final void Field31() {
        super.Field4 = 0;
        super.Field215 = 0L;
        super.Field216 = 0;
        super.Field31 = 36;
        super.Field204 = 3;
        super.Field214 = 0;
    }

    public final void Field6() {
        if (System.currentTimeMillis() - super.Field215 >= (long) (super.Field216 * 1000) && super.Field216 > 0) {
            super.Field4 -= super.Field214;
            super.Field31 -= super.Field216;
            super.Field215 = System.currentTimeMillis();
            if (super.Field31 == 0) {
                super.Field216 = 0;
                super.Field31 = 36;
            }

            if (super.Field4 <= 0 && super.Field204 != 3) {
                super.Field4 = 1;
                super.Field214 = 0;
                super.Field216 = 0;
                super.Field31 = 36;
            }
        }

    }

    public final byte Field14() {
        return Class455.Field13 ? -1 : this.Field167;
    }

    private static Class269 Field2(short var0) {
        if (var0 == -1) {
            return null;
        } else {
            Class269 var1;
            if ((var1 = (Class269) Field43.get(String.valueOf(var0))) == null) {
                var1 = new Class269(var0);
                Field43.put(String.valueOf(var0), var1);
                var1.Field4 = (long) ((int) (System.currentTimeMillis() / 1000L));
            } else {
                var1.Field4 = System.currentTimeMillis();
            }

            return var1;
        }
    }

    public static void Field32() {
        Enumeration var0 = Field43.keys();

        while (var0.hasMoreElements()) {
            String var1 = (String) var0.nextElement();
            Class269 var2 = (Class269) Field43.get(var1);
            if ((System.currentTimeMillis() - var2.Field4) / 1000L > 200L) {
                Field43.remove(var1);
            }
        }

    }

    public void Field2() {
        if (super.Field189 != 32001) {
            int var1;
            Class48 var2;
            if (super.Field28 != null) {
                for (var1 = 0; var1 < super.Field28.size(); ++var1) {
                    (var2 = (Class48) super.Field28.elementAt(var1)).Field2();
                    if (var2.Field4()) {
                        super.Field28.removeElementAt(var1);
                        if (var2.Field5 < 2000000000) {
                            Class106.Field19.Field1("-" + var2.Field5, 0, super.Field193, super.Field194 + super.Field16 - 15, 1, -2);
                        }
                    }
                }
            }

            if (super.Field29 != null) {
                for (var1 = 0; var1 < super.Field29.size(); ++var1) {
                    (var2 = (Class48) super.Field29.elementAt(var1)).Field2();
                    if (var2.Field4()) {
                        super.Field29.removeElementAt(var1);
                        if (var2.Field5 < 2000000000) {
                            Class106.Field19.Field1("-" + var2.Field5, 0, super.Field193, super.Field194 + super.Field16 - 15, 1, -2);
                        }
                    }
                }
            }

            boolean var7;
            if (!super.Field27) {
                if (this.Field169 != null) {
                    this.Field169.Field1();
                }

                if (this.Field148 != null) {
                    this.Field148.Field1();
                }

                if (super.Field205 && System.currentTimeMillis() > super.Field208) {
                    super.Field205 = false;
                }

                if (System.currentTimeMillis() - this.Field163 > 180L && (var1 = this.Field86 != -1 && this.Field85 != -1 ? (this.Field88 == -1 ? 2 : 1) : 0) != 1) {
                    if (super.Field189 != Class106.Field19.Field15.Field189) {
                        if (Class62.Field91 == 1) {
                            Class261.Field1().Field2(super.Field189);
                            (new StringBuffer(String.valueOf(var1))).append(" GUI THONG TIN REQUEST CHAR ").append(this.a_()).append(" >> ").append(super.Field189).toString();
                        }
                    } else {
                        Class261.Field1().Field6();
                    }

                    this.Field163 = System.currentTimeMillis();
                }

                this.Field6();
                if (this.Field146 >= 0) {
                    var1 = (int) (System.currentTimeMillis() - this.Field143) / '\uea60';
                    this.Field146 = this.Field162 - var1;
                }

                if (this.Field132 > 0) {
                    --this.Field132;
                    return;
                }

                var7 = false;
                if (super.Field189 == Class106.Field19.Field15.Field189) {
                    if (Class62.Field71 && Class62.Field65 == 1 && System.currentTimeMillis() - this.Field164 < 0L) {
                        this.Field164 = System.currentTimeMillis() + 30000L;
                        var7 = true;
                    }

                    if (var7 && Class106.Field19.Field15.Field49 == null && Class62.Field78 <= 0 && (Math.abs(super.Field193 - this.Field59) > 120 || Math.abs(super.Field194 - this.Field60) > 120)) {
                        Class106.Field19.Field4(this.Field59, this.Field60);
                    }
                }
            }

            super.Field2();
            if (super.Field3 > 0) {
                --super.Field3;
                if (super.Field3 == 0) {
                    if (super.Field2 < 0) {
                        super.Field2 = 0;
                    }

                    super.Field4 = super.Field2;
                }
            }

            if (super.Field204 != 3 && super.Field2 <= 0 && super.Field19 != 0) {
                super.Field204 = 3;
                this.Field73 = 0;
                Class106.Field19.Field1(super.Field193, super.Field194);
            }

            if (this.Field150) {
                if (this.Field149 != null) {
                    this.Field149.Field1();
                }

                if (System.currentTimeMillis() / 1000L - this.Field165 > 0L) {
                    this.Field149 = null;
                }

                if (this.Field151 != null) {
                    this.Field151.Field1();
                    this.Field151.Field11 = super.Field12;
                    this.Field151.Field10 = super.Field204;
                }
            }

            switch (super.Field204) {
                case 0:
                    if (super.Field188 == 0 && System.currentTimeMillis() - this.Field159 > 300000L && Class106.Field19.Field15 != null && super.Field189 != Class106.Field19.Field15.Field189) {
                        super.Field187 = true;
                    }

                    if (super.Field189 == Class106.Field19.Field15.Field189 && Class62.Field72) {
                        Class62.Field71 = Class62.Field72;
                    }

                    ++this.Field73;
                    if (this.Field14() != -1 && this.Field168 != 0) {
                        if (this.Field73 >= (this.Field34() > -1 ? Field41.length : Field42.length)) {
                            this.Field73 = 0;
                        }

                        if (this.Field14() != -1 && Class379.Field2 != null) {
                            if (this.Field73 % 3 == 0) {
                                this.Field44 = (this.Field44 + 1) % (this.Field168 == 1 ? 4 : 3);
                            }
                        } else {
                            super.Field23 = Field42[this.Field73];
                        }
                    } else {
                        if (this.Field73 >= Field40.length) {
                            this.Field73 = 0;
                        }

                        super.Field23 = Field40[this.Field73];
                        this.Field76 = super.Field23;
                        this.Field44 = 0;
                    }

                    if (super.Field23 > 3) {
                        super.Field23 = 0;
                    }

                    this.Field221 = super.Field23;
                    break;
                case 1:
                    ++this.Field73;
                    if (this.Field73 >= (this.Field14() > -1 ? Field41.length : Field42.length)) {
                        this.Field73 = 0;
                    }

                    if (this.Field14() != -1 && Class379.Field2 != null) {
                        if (this.Field73 % 3 == 0) {
                            this.Field44 = (this.Field44 + 1) % (this.Field168 == 1 ? 4 : 3);
                        }
                    } else {
                        super.Field23 = Field42[this.Field73];
                    }

                    boolean var6 = false;
                    var7 = false;
                    int var3 = Class106.Field1(super.Field193 - this.Field74);
                    int var4 = Class106.Field1(super.Field194 - this.Field75);
                    int var5 = super.Field17;
                    if (var3 <= 100 && var4 <= 100) {
                        if (var3 <= 70 && var4 <= 70) {
                            if (var3 <= 50 && var4 <= 50) {
                                if (var3 > 30 || var4 > 30) {
                                    var5 = super.Field17 + 1;
                                }
                            } else {
                                var5 = super.Field17 + 2;
                            }
                        } else {
                            var5 = super.Field17 + 3;
                        }
                    } else {
                        var5 = super.Field17 + 4;
                    }

                    if (var3 < var5) {
                        super.Field193 = this.Field74;
                        var6 = true;
                    }

                    if (var4 < var5) {
                        super.Field194 = this.Field75;
                        var7 = true;
                    }

                    if (var6 && var7) {
                        this.Field73 = 0;
                        super.Field204 = 0;
                        this.Field61 = true;
                        this.Field159 = System.currentTimeMillis();
                    } else {
                        if (super.Field193 < this.Field74) {
                            super.Field193 = (short) (super.Field193 + var5);
                            super.Field12 = 3;
                        } else if (super.Field193 > this.Field74) {
                            super.Field193 = (short) (super.Field193 - var5);
                            super.Field12 = 2;
                        } else if (super.Field194 > this.Field75) {
                            super.Field194 = (short) (super.Field194 - var5);
                            super.Field12 = 1;
                        } else if (super.Field194 < this.Field75) {
                            super.Field194 = (short) (super.Field194 + var5);
                            super.Field12 = 0;
                        }

                        if (super.Field23 > 3) {
                            super.Field23 = 0;
                        }

                        this.Field76 = super.Field23;
                        if (super.Field189 == Class106.Field19.Field15.Field189) {
                            Class62.Field71 = false;
                        }

                        if (this.Field106 != -1) {
                            ++this.Field222;
                            if (this.Field222 > Field223.length - 1) {
                                this.Field222 = 0;
                            }

                            this.Field221 = Field223[this.Field222];
                        }
                    }
                    break;
                case 2:
                    if (this.Field58 != null) {
                        this.Field58.Field1(this);
                    }
                    break;
                case 3:
                    if (super.Field4 > 0 && super.Field2 > 0) {
                        super.Field204 = 0;
                    }

                    ++this.Field73;
                    if (this.Field73 == 40 && super.Field189 == Class106.Field19.Field15.Field189) {
                        Class106.Field24.Field1 = false;
                        this.Field146 = -1;
                        this.Field169 = null;
                    }

                    this.Field150 = false;
                    this.Field151 = null;
                    break;
                case 4:
                    if (this.Field161) {
                        long var9;
                        if ((var9 = System.currentTimeMillis() - this.Field70) > 180L) {
                            this.Field33();
                            Class261.Field1().Field10();
                            this.Field161 = false;
                        }

                        this.Field226 = (int) (var9 / 1000L);
                        this.Field226 = (this.Field226 << 5) / 10;
                        if (this.Field226 > 32) {
                            this.Field226 = 32;
                        }
                    }
                case 5:
            }

            Class269 var8;
            if (Class106.Field12 % 5 == 0 && this.Field106 != -1 && (var8 = Field2(this.Field106)) != null) {
                int var10;
                if ((var10 = var8.Field1.size() / 21) == 0) {
                    var10 = 1;
                }

                this.Field220 = (byte) ((this.Field220 + 1) % var10);
            }

            this.Field18();
            super.Field2();
        }
    }

    private boolean Field44() {
        return this.Field151 != null && Class732.Field4[this.Field151.Field9] != null;
    }

    public final void Field33() {
        super.Field213.removeAllElements();

        for (int var1 = 0; var1 < this.Field133.length; ++var1) {
            this.Field133[var1] = -1;
            this.Field134[var1] = 0;
            this.Field135[var1] = 0;
        }

    }

    private void Field4(Graphics var1) {
        for (int var2 = 0; var2 < super.Field213.size(); ++var2) {
            ((Class829) super.Field213.elementAt(var2)).Field1(var1);
        }

    }

    private int Field10(int var1) {
        short var2 = -1;
        if (!this.Field44()) {
            if (var1 == 1) {
                if (this.Field85 != -1) {
                    var2 = this.Field85;
                    if (this.Field153[2] != -1) {
                        var2 = this.Field153[2];
                    }
                }
            } else if (var1 == 0) {
                byte var3 = this.Field14();
                if (this.Field86 != -1 && var3 == -1) {
                    var2 = this.Field86;
                    if (this.Field153[3] != -1) {
                        var2 = this.Field153[3];
                    }
                }
            } else if (var1 == 2) {
                if (this.Field88 != -1) {
                    var2 = this.Field88;
                    if (this.Field153[0] != -1) {
                        var2 = this.Field153[0];
                    }
                }
            } else if (var1 == 3) {
                if (this.Field153[1] != -1) {
                    this.Field87 = this.Field153[1];
                }

                if (this.Field87 != -1) {
                    var2 = this.Field87;
                    if (this.Field153[1] != -1) {
                        var2 = this.Field153[1];
                    }
                }
            } else if (var1 == 4 && this.Field89 > -1) {
                var2 = this.Field89;
            }
        }

        return var2;
    }

    private int Field2(int var1, int var2, int var3) {
        int var4 = 0;
        if (this.Field106 != -1) {
            return this.Field48();
        } else {
            byte var5 = this.Field14();
            int var10000;
            int var10001;
            switch (var1) {
                case 0:
                    var4 = super.Field6 + super.Field16;
                    return var4;
                case 1:
                    if (var5 <= -1) {
                        var4 = super.Field6 + super.Field16;
                        return var4;
                    }

                    if (var3 == 0) {
                        var10000 = super.Field6;
                        var10001 = Field48[var5][var2] + Field49[var5][var2][this.Field44];
                    } else if (var2 < 2) {
                        var10000 = super.Field6;
                        var10001 = Field48[var5][var2] - (var2 == 1 ? 5 : 0) + Field49[var5][var2][this.Field44];
                    } else {
                        var10000 = super.Field6;
                        var10001 = Field48[var5][var2] + Field49[var5][var2][this.Field44];
                    }
                    break;
                case 2:
                    var4 = super.Field6 + (var5 == -1 ? 0 : Field48[var5][var2] - (var2 == 1 && this.Field168 == 1 ? 5 : 0) + Field49[var5][var2][this.Field44]) + super.Field16;
                    return var4;
                case 3:
                    var4 = super.Field6 + (var5 != -1 ? Field48[var5][var2] + Field49[var5][var2][this.Field44] : 0) - (var2 == 1 && this.Field168 == 1 ? 5 : 0) + super.Field16;
                    return var4;
                case 4:
                    var10000 = super.Field6;
                    var10001 = var5 != -1 ? Field48[var5][var2] + Field49[var5][var2][this.Field44] : 0;
                    break;
                default:
                    return var4;
            }

            var4 = var10000 + var10001 + super.Field16;
            return var4;
        }
    }

    private int Field46() {
        return this.Field33 != -1 ? Field172[this.Field33][super.Field12] : 0;
    }

    private int Field3(int var1, int var2) {
        byte var3 = 0;
        if (this.Field106 != -1) {
            return this.Field46();
        } else {
            byte var4 = this.Field14();
            byte var10000;
            switch (var1) {
                case 0:
                default:
                    return var3;
                case 1:
                    if (var4 <= -1 || var2 <= 1) {
                        return var3;
                    }

                    var10000 = Field50[var4][var2][this.Field44];
                    break;
                case 2:
                    var3 = var4 != -1 ? Field50[var4][var2][this.Field44] : 0;
                    return var3;
                case 3:
                    var3 = var4 != -1 ? Field50[var4][var2][this.Field44] : 0;
                    return var3;
                case 4:
                    var10000 = var4 != -1 ? Field50[var4][var2][this.Field44] : 0;
            }

            var3 = var10000;
            return var3;
        }
    }

    private int Field47() {
        if (super.Field12 == 0) {
            return this.Field221 + this.Field220 * 21;
        } else {
            return super.Field12 == 1 ? this.Field221 + 7 + this.Field220 * 21 : this.Field221 + 14 + this.Field220 * 21;
        }
    }

    public void Field1(Graphics var1) {
        this.Field186[2] = this.Field88;
        if (super.Field193 < Class62.Field8 ? false : (super.Field193 > Class62.Field8 + Class106.Field13 ? false : (super.Field194 < Class62.Field9 ? false : super.Field194 <= Class62.Field9 + Class106.Field14 + 30))) {
            boolean var2 = false;
            if (this.Field106 > -1 || this.Field167 != -1) {
                var2 = true;
            }

            try {
                if (!super.Field27) {
                    byte var3 = this.Field14();
                    if (Class379.Field2 == null) {
                        var3 = -1;
                    }

                    if (this.Field148 != null) {
                        this.Field148.Field5 = super.Field193;
                        this.Field148.Field6 = super.Field194;
                        if (!this.Field44() && var3 != -1) {
                            Class177 var10000 = this.Field148;
                            var10000.Field5 += Field183[var3][super.Field12];
                            var10000 = this.Field148;
                            var10000.Field6 -= this.Field168 == 0 ? 3 : -6;
                        }

                        this.Field148.Field1(var1);
                    }

                    if (super.Field204 == 3) {
                        var1.drawImage(Class811.Field21, super.Field193 - 10, super.Field194 - 27 + super.Field16, 0);
                        if (Class106.Field12 % 20 != 17 && Class106.Field12 % 20 != 13) {
                            var1.drawImage(Class811.Field22, super.Field193 - 4, super.Field194 - 19 + super.Field16, 0);
                        }

                        return;
                    }

                    this.Field1(var1, super.Field193, super.Field194 - (this.Field168 == 0 ? 0 : 6) + this.Field48(), var2);
                    this.Field3(var1, 0);
                    byte var4 = 0;
                    byte var5 = 0;
                    if (!this.Field44() && var3 != -1) {
                        super.Field6 = 0;
                        if (this.Field168 == 1) {
                            var4 = (new byte[]{-1, -1, -5, -1})[this.Field44];
                            var5 = (new byte[]{-1, -2, -3, -2})[this.Field44];
                        }
                    }

                    short var9 = super.Field12;
                    boolean var10 = var9 != 1 && super.Field23 < 4;
                    byte[] var6 = Field219[var10 ? 0 : 1][var9];
                    if (!this.Field44() && this.Field11()) {
                        for (int var7 = 0; var7 < var6.length; ++var7) {
                            if (this.Field10(var6[var7]) > -1 || var6[var7] == 4 && this.Field107 != -1 || var6[var7] == 5 && this.Field186[var6[var7]] > -1 || this.Field39 != -1) {
                                if (var6[var7] == 5) {
                                    this.Field2(var1, var5);
                                } else {
                                    int var8;
                                    if (var6[var7] == 0 && super.Field29 != null) {
                                        for (var8 = 0; var8 < super.Field29.size(); ++var8) {
                                            ((Class48) super.Field29.elementAt(var8)).Field1(var1, super.Field193, super.Field194);
                                        }
                                    }

                                    if (var6[var7] != 0 || this.Field106 == -1) {
                                        Class269 var11;
                                        int var12;
                                        if (var6[var7] == 2 && this.Field34 != -1) {
                                            if ((var11 = Field2(this.Field34)) != null && Class106.Field12 % 6 == 0) {
                                                if ((var12 = var11.Field1.size() / 18) == 0) {
                                                    var12 = 1;
                                                }

                                                this.Field237 = (byte) ((this.Field237 + 1) % var12);
                                            }

                                            if (var11 != null) {
                                                var11.Field2(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(2, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(2, super.Field12, this.Field168)) + this.Field48() + var4, this.Field52(), super.Field12 == 3 ? 2 : 0);
                                                var11.Field1(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(2, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(2, super.Field12, this.Field168)) + this.Field48() + var4, this.Field52(), super.Field12 == 3 ? 2 : 0);
                                            }
                                        } else if (var6[var7] == 0 && this.Field36 != -1) {
                                            if ((var11 = Field2(this.Field36)) != null && Class106.Field12 % 6 == 0) {
                                                if ((var12 = var11.Field1.size() / 18) == 0) {
                                                    var12 = 1;
                                                }

                                                this.Field239 = (byte) ((this.Field239 + 1) % var12);
                                            }

                                            if (var11 != null) {
                                                var11.Field2(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(0, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(0, super.Field12, this.Field168)) + this.Field48() + var5, this.Field50(), super.Field12 == 3 ? 2 : 0);
                                                var11.Field1(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(0, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(0, super.Field12, this.Field168)) + this.Field48() + var5, this.Field50(), super.Field12 == 3 ? 2 : 0);
                                            }
                                        } else if (var6[var7] == 4 && this.Field107 != -1) {
                                            if ((var11 = Field2(this.Field107)) != null && Class106.Field12 % 10 == 0) {
                                                if ((var12 = var11.Field1.size() / 18) == 0) {
                                                    var12 = 1;
                                                }

                                                this.Field240 = (byte) ((this.Field240 + 1) % var12);
                                            }

                                            if (var11 != null) {
                                                var11.Field2(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(4, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(4, super.Field12, this.Field168)) + this.Field48() + var5, this.Field51(), super.Field12 == 3 ? 2 : 0);
                                                var11.Field1(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(4, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(4, super.Field12, this.Field168)) + this.Field48() + var5, this.Field51(), super.Field12 == 3 ? 2 : 0);
                                            }
                                        } else if (var6[var7] != 1) {
                                            boolean var17 = true;
                                            if (var6[var7] == 3) {
                                                var17 = this.Field62;
                                            }

                                            if (var17) {
                                                Class811.Field3(var6[var7], this.Field10(var6[var7])).Field1(var1, (int) (super.Field193 + this.Field3(var6[var7], super.Field12)), (int) (var4 + super.Field194 + this.Field2(var6[var7], super.Field12, this.Field168)), super.Field12, super.Field23);
                                            }
                                        } else {
                                            Class269 var16;
                                            if ((var16 = Field2(this.Field106)) != null) {
                                                if (super.Field12 == 2 || super.Field12 == 3 || super.Field12 == 0) {
                                                    if (this.Field35 == -1) {
                                                        Class811.Field3(var6[var7], this.Field10(var6[var7])).Field1(var1, (int) (super.Field193 + this.Field3(var6[var7], super.Field12)), (int) (var4 + super.Field194 + this.Field2(var6[var7], super.Field12, this.Field168)), super.Field12, super.Field23);
                                                    } else {
                                                        this.Field1(var1, var5);
                                                    }
                                                }

                                                var16.Field2(var1, super.Field193, super.Field194, this.Field47(), super.Field12 == 3 ? 2 : 0);
                                                var16.Field1(var1, super.Field193, super.Field194, this.Field47(), super.Field12 == 3 ? 2 : 0);
                                                if (super.Field12 == 1) {
                                                    if (this.Field35 == -1) {
                                                        Class811.Field3(var6[var7], this.Field10(var6[var7])).Field1(var1, (int) (super.Field193 + this.Field3(var6[var7], super.Field12)), (int) (var4 + super.Field194 + this.Field2(var6[var7], super.Field12, this.Field168)), super.Field12, super.Field23);
                                                    } else {
                                                        this.Field1(var1, var5);
                                                    }
                                                }
                                            }

                                            if (var3 <= -1) {
                                                if (this.Field106 == -1) {
                                                    if (this.Field35 == -1) {
                                                        Class811.Field3(var6[var7], this.Field10(var6[var7])).Field1(var1, (int) (super.Field193 + this.Field3(var6[var7], super.Field12)), (int) (var4 + super.Field194 + this.Field2(var6[var7], super.Field12, this.Field168)), super.Field12, super.Field23);
                                                    } else {
                                                        this.Field1(var1, var5);
                                                    }
                                                }
                                            } else {
                                                if (super.Field12 < 2 && this.Field168 == 0) {
                                                    if (this.Field35 == -1) {
                                                        Class811.Field3(var6[var7], this.Field10(var6[var7])).Field1(var1, (int) (super.Field193 + this.Field3(var6[var7], super.Field12)), (int) (var4 + super.Field194 + this.Field2(var6[var7], super.Field12, this.Field168)), super.Field12, super.Field23);
                                                    } else {
                                                        this.Field1(var1, var5);
                                                    }
                                                }

                                                var1.drawImage(Class811.Field10, super.Field193 + Field183[var3][super.Field12], super.Field194 - (this.Field168 == 0 ? 3 : -6), 3);
                                                if (super.Field29 != null) {
                                                    for (var8 = 0; var8 < super.Field29.size(); ++var8) {
                                                        ((Class48) super.Field29.elementAt(var8)).Field1(var1, super.Field193, super.Field194);
                                                    }
                                                }

                                                if (Class379.Field2.size() > 0) {
                                                    var1.drawRegion((Image) Class379.Field2.elementAt(this.Field166), Field45[var3][super.Field12][this.Field44], 0, Field184[var3][super.Field12][this.Field44], Field185[var3], 0, super.Field193 + Field46[var3][super.Field12], super.Field194 + Field47[var3][super.Field12] + super.Field16, 33);
                                                }

                                                if (super.Field12 > 1 && this.Field168 == 0) {
                                                    var1.drawImage(Class811.Field28[super.Field12 - 2], super.Field193 - (super.Field12 == 2 ? -2 : 1) + Field50[var3][super.Field12][this.Field44], super.Field194 - 10 + Field49[var3][super.Field12][this.Field44] + super.Field16, 3);
                                                }

                                                if (super.Field12 > 1 && this.Field168 == 0 || this.Field168 == 1) {
                                                    if (this.Field35 == -1) {
                                                        Class811.Field3(var6[var7], this.Field10(var6[var7])).Field1(var1, (int) (super.Field193 + this.Field3(var6[var7], super.Field12)), (int) (var4 + super.Field194 + this.Field2(var6[var7], super.Field12, this.Field168)), super.Field12, super.Field23);
                                                    } else {
                                                        this.Field1(var1, var5);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }

                    if (this.Field44() && this.Field151 != null) {
                        this.Field151.Field1(var1, super.Field193, super.Field194 + super.Field6 + super.Field16);
                        var1.drawImage(Class811.Field10, super.Field193, super.Field194 - 2, 3);
                    }

                    if (this.Field150 && this.Field149 != null) {
                        this.Field149.Field5 = super.Field193;
                        this.Field149.Field6 = super.Field194;
                        this.Field149.Field1(var1);
                    }

                    if (this.Field161) {
                        var1.setColor(0);
                        var1.fillRect(super.Field193 - 16, super.Field194 - 46, 32, 4);
                        var1.setColor(1165236);
                        var1.fillRect(super.Field193 - 16, super.Field194 - 46, this.Field226, 4);
                        var1.setColor(3363085);
                        var1.drawRect(super.Field193 - 16, super.Field194 - 46, 32, 4);
                    }

                    this.Field4(var1);
                }
            } catch (Exception var13) {
                var13.printStackTrace();
            }

            super.Field1(var1);
            if (this.Field169 != null && !super.Field27) {
                this.Field169.Field1(var1);
            }

            Image var14;
            if (this.d_() && !(var14 = Class62.Field5((int) super.Field25)).equals(Class811.Field12)) {
                var1.drawImage(var14, super.Field193, super.Field194 - super.Field195 - 5, 33);
            }

            if (super.Field28 != null) {
                for (int var15 = 0; var15 < super.Field28.size(); ++var15) {
                    ((Class48) super.Field28.elementAt(var15)).Field1(var1, super.Field193, super.Field194);
                }
            }

            this.Field2(var1, super.Field193, super.Field194 - (this.Field168 == 0 ? 0 : 6) + this.Field48(), var2);
            this.Field3(var1, 1);
        }
    }

    public final void Field3(Graphics var1) {
        if (!super.Field27) {
            byte var2 = this.Field14();
            if (Class379.Field2 == null) {
                var2 = -1;
            }

            if (this.Field148 != null) {
                this.Field148.Field5 = super.Field193;
                this.Field148.Field6 = super.Field194;
                if (!this.Field44() && var2 != -1) {
                    Class177 var10000 = this.Field148;
                    var10000.Field5 += Field183[var2][super.Field12];
                    var10000 = this.Field148;
                    var10000.Field6 -= this.Field168 == 0 ? 3 : -6;
                }

                this.Field148.Field1(var1);
            }

            if (super.Field204 == 3) {
                var1.drawImage(Class811.Field21, super.Field193 - 10, super.Field194 - 27 + super.Field16, 0);
                if (Class106.Field12 % 20 != 17 && Class106.Field12 % 20 != 13) {
                    var1.drawImage(Class811.Field22, super.Field193 - 4, super.Field194 - 19 + super.Field16, 0);
                }

                return;
            }

            boolean var3 = (super.Field12 == 0 || super.Field12 == 2 || super.Field12 == 3) && super.Field23 < 4;
            byte var4 = 0;
            byte var5 = 0;
            if (!this.Field44() && var2 != -1) {
                super.Field6 = 0;
                if (this.Field168 == 1) {
                    var4 = (new byte[]{-1, -1, -5, -1})[this.Field44];
                    var5 = (new byte[]{-1, -2, -3, -2})[this.Field44];
                }
            }

            if (!this.Field44() && var3) {
                this.Field2(var1, var5);
            }

            short var6;
            if (!this.Field44() && this.Field86 != -1 && var2 == -1) {
                var6 = this.Field86;
                if (this.Field153[3] != -1) {
                    var6 = this.Field153[3];
                }

                Class811.Field3(0, var6).Field1(var1, (int) super.Field193, (int) (super.Field194 + super.Field6 + super.Field16), super.Field12, super.Field23);
            }

            if (!this.Field44() && this.Field85 != -1) {
                var6 = this.Field85;
                if (this.Field153[2] != -1) {
                    var6 = this.Field153[2];
                }

                if (var2 == -1) {
                    if (!this.Field44()) {
                        Class811.Field3(1, var6).Field1(var1, (int) super.Field193, (int) (var4 + super.Field194 + super.Field6 + super.Field16), super.Field12, super.Field23);
                    }
                } else {
                    if (super.Field12 < 2 && this.Field168 == 0) {
                        Class811.Field3(1, var6).Field1(var1, (int) super.Field193, (int) (var4 + super.Field194 + super.Field6 + Field48[var2][super.Field12] + Field49[var2][super.Field12][this.Field44] + super.Field16), super.Field12, super.Field23);
                    }

                    var1.drawImage(Class811.Field10, super.Field193 + Field183[var2][super.Field12], super.Field194 - (this.Field168 == 0 ? 3 : -6), 3);
                    if (Class379.Field2.size() > 0) {
                        var1.drawRegion((Image) Class379.Field2.elementAt(this.Field166), Field45[var2][super.Field12][this.Field44], 0, Field184[var2][super.Field12][this.Field44], Field185[var2], 0, super.Field193 + Field46[var2][super.Field12], super.Field194 + Field47[var2][super.Field12] + super.Field16, 33);
                    }

                    if (super.Field12 > 1 && this.Field168 == 0) {
                        var1.drawImage(Class811.Field28[super.Field12 - 2], super.Field193 - (super.Field12 == 2 ? -2 : 1) + Field50[var2][super.Field12][this.Field44], super.Field194 - 10 + Field49[var2][super.Field12][this.Field44] + super.Field16, 3);
                    }

                    if (super.Field12 > 1 && this.Field168 == 0) {
                        Class811.Field3(1, var6).Field1(var1, (int) (super.Field193 + Field50[var2][super.Field12][this.Field44]), (int) (var4 + super.Field194 + super.Field6 + Field48[var2][super.Field12] + Field49[var2][super.Field12][this.Field44] + super.Field16), super.Field12, super.Field23);
                    } else if (this.Field168 == 1) {
                        if (super.Field12 >= 2) {
                            Class811.Field3(1, var6).Field1(var1, (int) (super.Field193 + Field50[var2][super.Field12][this.Field44]), (int) (var4 + super.Field194 + super.Field6 + Field48[var2][super.Field12] + Field49[var2][super.Field12][this.Field44] + super.Field16), super.Field12, super.Field23);
                        } else {
                            Class811.Field3(1, var6).Field1(var1, (int) super.Field193, (int) (var4 + super.Field194 + super.Field6 + Field48[var2][super.Field12] - (super.Field12 == 1 && this.Field168 == 1 ? 5 : 0) + Field49[var2][super.Field12][this.Field44] + super.Field16), super.Field12, super.Field23);
                        }
                    }
                }
            }

            if (!this.Field44() && this.Field88 != -1) {
                var6 = this.Field88;
                if (this.Field153[0] != -1) {
                    var6 = this.Field153[0];
                }

                Class811.Field3(2, var6).Field1(var1, (int) (super.Field193 + (var2 != -1 ? Field50[var2][super.Field12][this.Field44] : 0)), (int) (var4 + super.Field194 + super.Field6 + (var2 != -1 ? Field48[var2][super.Field12] - (super.Field12 == 1 && this.Field168 == 1 ? 5 : 0) + Field49[var2][super.Field12][this.Field44] : 0) + super.Field16), super.Field12, super.Field23);
            }

            if (!this.Field44()) {
                if (this.Field153[1] != -1) {
                    this.Field87 = this.Field153[1];
                }

                if (this.Field87 != -1) {
                    var6 = this.Field87;
                    if (this.Field153[1] != -1) {
                        var6 = this.Field153[1];
                    }

                    if (this.Field153[0] == 26 && this.Field153[1] == 50 || this.Field153[0] != 26) {
                        Class811.Field3(3, var6).Field1(var1, (int) (super.Field193 + (var2 != -1 ? Field50[var2][super.Field12][this.Field44] : 0)), (int) (var4 + super.Field194 + super.Field6 + (var2 != -1 ? Field48[var2][super.Field12] + Field49[var2][super.Field12][this.Field44] : 0) + super.Field16), super.Field12, super.Field23);
                    }
                }
            }

            if (!this.Field44() && !var3) {
                this.Field2(var1, var5);
            }

            if (this.Field44() && this.Field151 != null) {
                this.Field151.Field1(var1, super.Field193, super.Field194 + super.Field6 + super.Field16);
                var1.drawImage(Class811.Field10, super.Field193, super.Field194 - 2, 3);
            }

            if (this.Field150 && this.Field149 != null) {
                this.Field149.Field5 = super.Field193;
                this.Field149.Field6 = super.Field194;
                this.Field149.Field1(var1);
            }

            if (this.Field161) {
                var1.setColor(0);
                var1.fillRect(super.Field193 - 16, super.Field194 - 46, 32, 4);
                var1.setColor(1165236);
                var1.fillRect(super.Field193 - 16, super.Field194 - 46, this.Field226, 4);
                var1.setColor(3363085);
                var1.drawRect(super.Field193 - 16, super.Field194 - 46, 32, 4);
            }

            this.Field4(var1);
        }

        super.Field1(var1);
        if (this.Field169 != null && !super.Field27) {
            this.Field169.Field1(var1);
        }

    }

    public final void a_(Graphics var1) {
        if (!Class455.Field13) {
            if (this.Field65 != null && Class106.Field19.Field14 != 2) {
                int var2 = -(this.Field14() != -1 && Class379.Field2 != null ? 10 : 2);
                byte var3 = 0;
                if (this.Field106 != -1) {
                    var2 = Field173[0][super.Field12];
                }

                if (super.Field190 != -1) {
                    var3 = 8;
                    Class176 var4 = Class379.Field1((short) (super.Field190 + 1000));
                    int var5 = 0;
                    int[][] var6;
                    if (var4 != null) {
                        if (!var4.Field3) {
                            var1.drawImage(var4.Field1, super.Field193 - this.Field77 / 2 - 6, super.Field194 - super.Field195 - 6 + var2, 3);
                            var5 = var4.Field1.getWidth();
                        }

                        if (this.Field57 >= 0 && this.Field57 < 3) {
                            var6 = new int[][]{{16450576, 14548228}, {14548228, 16450576}, {1049853, 16450576}};
                            Class811.Field1(var1, super.Field193 - this.Field77 / 2 - var5 / 2 - 8, super.Field194 - super.Field195 - 6 + var2 - var5 / 2 - 1, var5 + 2, var5 + 2, Field224, var6[this.Field57][0], var6[this.Field57][1]);
                            if ((Field224 += 3) > 46) {
                                Field224 = 0;
                            }
                        }
                    } else if (this.Field57 >= 0 && this.Field57 < 3) {
                        var6 = new int[][]{{16450576, 14548228}, {14548228, 16450576}, {1049853, 16450576}};
                        Class811.Field1(var1, super.Field193 - this.Field77 / 2 - 8, super.Field194 - super.Field195 - 6 + var2 - 1, 10, 10, Field224, var6[this.Field57][0], var6[this.Field57][1]);
                        if ((Field224 += 3) > 46) {
                            Field224 = 0;
                        }
                    }
                }

                if (super.Field201 > -1 && super.Field25 == -1 && (super.Field201 != super.Field202 || super.Field189 == Class106.Field19.Field15.Field189) && (super.Field201 != super.Field202 || super.Field189 == Class106.Field19.Field15.Field189)) {
                    var1.drawRegion(Class811.Field41, 0, super.Field201 * 11, 11, 11, 0, super.Field193 + this.Field77 / 2 + 9, super.Field194 - super.Field195 - 12 + var2, 20);
                }

                if (super.Field189 != Class106.Field19.Field15.Field189 && super.Field201 != Class106.Field19.Field15.Field201 && super.Field25 == -1) {
                    Class21.Field9[4].Field1(var1, this.Field65, super.Field193 + var3, super.Field194 - 43 + var2 - this.Field170, 2);
                } else {
                    Class21.Field7.Field1(var1, this.Field65, super.Field193 + var3, super.Field194 - 40 + var2 - this.Field170, 2);
                }

                byte var7 = 0;
                byte var8 = 0;
                if (this.Field140) {
                    var8 = 5;
                }

                if (super.Field200 > 0) {
                    var7 = -5;
                    var1.drawRegion(Field52, 0, (super.Field200 - 14) * 10, 11, 10, 0, super.Field193 + var8, super.Field194 - 41 + var2, 33);
                } else if (super.Field199 > 0 || super.Field207) {
                    var7 = -5;
                    var1.drawRegion(Field52, 0, 50, 11, 10, 0, super.Field193 + var8, super.Field194 - 41 + var2, 33);
                }

                if (this.Field140) {
                    Class811.Field37.Field1(this.Field225 / 5, super.Field193 + var7, super.Field194 - 41 + var2 - 2, 0, 33, var1);
                }

                ++this.Field225;
                if (this.Field225 >= 10) {
                    this.Field225 = 0;
                }
            }

            super.a_(var1);
        }
    }

    private int Field48() {
        return this.Field33 != -1 ? Field173[this.Field33][super.Field12] : 0;
    }

    private int Field49() {
        if (super.Field12 == 0) {
            return super.Field23 + this.Field238 * 18;
        } else {
            return super.Field12 == 1 ? super.Field12 * 6 + super.Field23 + this.Field238 * 18 : super.Field23 + 12 + this.Field238 * 18;
        }
    }

    private int Field50() {
        if (super.Field12 == 0) {
            return super.Field23 + this.Field239 * 18;
        } else {
            return super.Field12 == 1 ? super.Field12 * 6 + super.Field23 + this.Field239 * 18 : super.Field23 + 12 + this.Field239 * 18;
        }
    }

    private int Field51() {
        if (super.Field12 == 0) {
            return super.Field23 + this.Field240 * 18;
        } else {
            return super.Field12 == 1 ? super.Field12 * 6 + super.Field23 + this.Field240 * 18 : super.Field23 + 12 + this.Field240 * 18;
        }
    }

    private int Field52() {
        if (super.Field12 == 0) {
            return super.Field23 + this.Field237 * 18;
        } else {
            return super.Field12 == 1 ? super.Field12 * 6 + super.Field23 + this.Field237 * 18 : super.Field23 + 12 + this.Field237 * 18;
        }
    }

    private int Field53() {
        if (super.Field12 == 0) {
            return super.Field23 + this.Field241 * 18;
        } else {
            return super.Field12 == 1 ? super.Field12 * 6 + super.Field23 + this.Field241 * 18 : super.Field23 + 12 + this.Field241 * 18;
        }
    }

    private void Field1(Graphics var1, int var2) {
        Class269 var3;
        if ((var3 = Field2(this.Field35)) != null && Class106.Field12 % 6 == 0) {
            int var4;
            if ((var4 = var3.Field1.size() / 18) == 0) {
                var4 = 1;
            }

            this.Field238 = (byte) ((this.Field238 + 1) % var4);
        }

        if (var3 != null) {
            var3.Field2(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(1, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(1, super.Field12, this.Field168)) + this.Field48() + var2, this.Field49(), super.Field12 == 3 ? 2 : 0);
            var3.Field1(var1, super.Field193 + (this.Field106 != -1 ? 0 : this.Field3(1, super.Field12)) + this.Field46(), super.Field194 + (this.Field106 != -1 ? 0 : this.Field2(1, super.Field12, this.Field168)) + this.Field48() + var2, this.Field49(), super.Field12 == 3 ? 2 : 0);
        }

    }

    private void Field2(Graphics var1, int var2) {
        byte var6;
        if (this.Field39 != -1) {
            var6 = this.Field14();
            if (Class379.Field2 == null) {
                var6 = -1;
            }

            Class269 var9;
            if ((var9 = Field2(this.Field39)) != null && Class106.Field12 % 5 == 0) {
                int var12;
                if ((var12 = var9.Field1.size() / 18) == 0) {
                    var12 = 1;
                }

                this.Field241 = (byte) ((this.Field241 + 1) % var12);
            }

            if (var9 != null) {
                var9.Field2(var1, super.Field193 + (var6 != -1 ? Field50[var6][super.Field12][this.Field44] : 0) + this.Field46(), super.Field194 + (var6 != -1 ? Field48[var6][super.Field12] : 0) + this.Field48() + var2, this.Field53(), super.Field12 == 3 ? 2 : 0);
                var9.Field1(var1, super.Field193 + (var6 != -1 ? Field50[var6][super.Field12][this.Field44] : 0) + this.Field46(), super.Field194 + (var6 != -1 ? Field48[var6][super.Field12] : 0) + this.Field48() + var2, this.Field53(), super.Field12 == 3 ? 2 : 0);
            }

        } else {
            int var3;
            if ((var3 = this.Field118 - 3) >= 0 && var3 < 5) {
                byte var4 = this.Field14();
                if (Class379.Field2 == null) {
                    var4 = -1;
                }

                byte var5 = this.Field93;
                var6 = this.Field119;
                if (this.Field153[4] > -1) {
                    var3 = 1;
                    var6 = 0;
                    var5 = 1;
                }

                if (this.Field141) {
                    var5 = 3;
                    var6 = 0;
                    var3 = 3;
                }

                byte var7 = Field229[var5][this.Field1];
                if (super.Field204 != 2) {
                    var7 = 0;
                }

                if (this.Field76 >= 0 && var3 >= 0) {
                    Class299 var8;
                    if ((var8 = Class811.Field43[var3][var7]) == null) {
                        Class811.Field2(var3, var7);
                        return;
                    }

                    var3 = this.Field117;
                    if (this.Field153[4] > -1 && !this.Field141) {
                        var3 = this.Field153[4];
                    }

                    if (this.Field141) {
                        var3 = 0;
                    }

                    if (super.Field204 == 2) {
                        if (!this.Field141) {
                            var3 = this.Field118 - 3;
                            var7 = Field229[var5][this.Field1];
                            var5 = this.Field93;
                            if ((var8 = Class811.Field43[var3][var7]) == null) {
                                Class811.Field2(var3, var7);
                                return;
                            }
                        }

                        if (this.Field76 < var8.Field1[super.Field12].length && var8.Field7 != null) {
                            var1.drawRegion(var8.Field7, var8.Field1[super.Field12][this.Field76], var8.Field2[super.Field12][this.Field76], var8.Field5[super.Field12][this.Field76], var8.Field6[super.Field12][this.Field76], 0, super.Field193 + var8.Field3[super.Field12][this.Field76] + (var4 != -1 ? Field50[var4][super.Field12][this.Field44] : 0), var2 + super.Field194 + var8.Field4[super.Field12][this.Field76] + super.Field6 + (var4 != -1 ? Field48[var4][super.Field12] : 0) + super.Field16, 0);
                        }
                    } else {
                        if (this.Field76 > 1) {
                            this.Field76 = 0;
                        }

                        if (this.Field76 < 0) {
                            this.Field76 = 0;
                        }

                        if (var3 != -1 && Class811.Field2(var5, var3, var6) != null) {
                            Class389 var13 = Class811.Field2(var5, var3, var6);
                            if (this.Field153[4] > -1 && !this.Field141) {
                                var3 = 4;
                            }

                            var1.drawRegion(var13.Field1, Field231[var5][super.Field12 + (var3 << 2)], 0, Field232[var5][super.Field12 + (var3 << 2)], Field235[var5], Field230[var5][super.Field12], super.Field193 + Field233[var5][super.Field12 + (var3 << 2)] + var8.Field3[super.Field12][this.Field76] + (var4 != -1 ? Field50[var4][super.Field12][this.Field44] : 0) + this.Field46(), var2 + super.Field194 + Field234[var5][super.Field12 + (var3 << 2)] + var8.Field4[super.Field12][this.Field76] + (super.Field12 == 2 && this.Field76 == 1 ? Field236[var5] : 0) + super.Field6 + (var4 != -1 ? Field48[var4][super.Field12] : 0) - (super.Field12 == 1 && this.Field168 == 1 ? 5 : 0) + super.Field16 + this.Field48(), 0);
                        }
                    }

                    if (super.Field204 == 0 || super.Field204 == 1 || super.Field204 == 4) {
                        Class357 var11 = this;
                        var3 = 0;

                        short var10000;
                        while (true) {
                            if (var3 >= var11.Field98.size()) {
                                var10000 = -1;
                                break;
                            }

                            Class805 var15;
                            if ((var15 = Class811.Field2((int) ((Class534) var11.Field98.elementAt(var3)).Field18)).Field3 == 3 || var15.Field3 == 4 || var15.Field3 == 5 || var15.Field3 == 6 || var15.Field3 == 7) {
                                var10000 = var15.Field4;
                                break;
                            }

                            ++var3;
                        }

                        short var16 = var10000;
                        if (Class106.Field12 % 2 == 0) {
                            this.Field227 = (this.Field227 + 1) % Field228.length;
                        }

                        if (var16 > 1) {
                            if ((var2 = var16 - 1) > 3) {
                                var2 = 3;
                            }

                            byte var10 = 0;
                            if (this.Field14() == -1 || Class379.Field2 == null) {
                                var10 = 9;
                            }

                            var1.drawRegion(Field53, 0, var2 * 28 + Field228[this.Field227] * 7, 7, 7, 0, super.Field193 + Field242[var5][super.Field12], 5 + super.Field194 + var10 + var8.Field4[super.Field12][this.Field76] + Field243[var5][super.Field12] + super.Field16, 0);
                        }
                    }
                }

            }
        }
    }

    public final void Field1(Graphics var1, short var2, short var3) {
        short var4 = this.Field86;
        short var5 = this.Field85;
        short var6 = this.Field88;
        short var7 = this.Field87;
        short var8 = this.Field89;
        if (this.Field153[0] != -1) {
            var6 = this.Field153[0];
        }

        if (this.Field153[1] != -1) {
            var7 = this.Field153[1];
        }

        if (this.Field153[2] != -1) {
            var5 = this.Field153[2];
        }

        if (this.Field153[3] != -1) {
            var4 = this.Field153[3];
        }

        Class176 var9;
        if (var8 != -1) {
            if (this.Field115 == -1) {
                Class811.Field3(4, var8).Field1(var1, var2, var3);
            } else if ((var9 = Class379.Field1(this.Field115)) != null && var9.Field1 != null) {
                if (Class106.Field12 % 5 == 0) {
                    this.Field244 = (byte) ((this.Field244 + 1) % this.Field112);
                }

                var1.drawRegion(var9.Field1, 0, var9.Field1.getHeight() / this.Field112 * this.Field244, var9.Field1.getWidth(), var9.Field1.getHeight() / this.Field112, 0, var2 + Field175[0][this.Field110], var3 + Field175[1][this.Field110], 0);
            }
        }

        if (var4 != -1 && this.Field116 == -1) {
            Class811.Field3(0, var4).Field1(var1, var2, var3);
        }

        if (var5 != -1 && this.Field116 == -1) {
            Class811.Field3(1, var5).Field1(var1, var2, var3);
        }

        if (var6 != -1 && this.Field116 == -1) {
            Class811.Field3(2, var6).Field1(var1, var2, var3);
        }

        if (var7 != -1 && this.Field116 == -1) {
            Class811.Field3(3, var7).Field1(var1, var2, var3);
        }

        if (this.Field116 != -1 && (var9 = Class379.Field1(this.Field116)) != null && var9.Field1 != null) {
            if (Class106.Field12 % 5 == 0) {
                this.Field246 = (byte) ((this.Field246 + 1) % this.Field113);
            }

            var1.drawRegion(var9.Field1, 0, var9.Field1.getHeight() / this.Field113 * this.Field246, var9.Field1.getWidth(), var9.Field1.getHeight() / this.Field113, 0, var2 + Field176[0][this.Field114], var3 + Field176[1][this.Field114], 0);
        }

        if (this.Field118 != -1 && this.Field117 != -1 && this.Field109 == -1 && this.Field102 != null) {
            var1.drawImage(this.Field102, var2 + this.Field104, var3 + this.Field105, 0);
        }

        if (this.Field109 != -1 && (var9 = Class379.Field1(this.Field109)) != null && var9.Field1 != null) {
            if (Class106.Field12 % 5 == 0) {
                this.Field245 = (byte) ((this.Field245 + 1) % this.Field111);
            }

            var1.drawRegion(var9.Field1, 0, var9.Field1.getHeight() / this.Field111 * this.Field245, var9.Field1.getWidth(), var9.Field1.getHeight() / this.Field111, 0, var2 + Field174[0][this.Field108], var3 + Field174[1][this.Field108], 0);
        }

    }

    public void Field1(short var1, short var2) {
        this.Field2(var1, var2);
    }

    public void Field1(Class114 var1, Class794 var2, byte var3, byte var4) {
        this.Field1 = var3;
        if (this.Field141) {
            this.Field58 = Class599.Field6(0, this.Field93);
        } else {
            this.Field58 = Class599.Field6(this.Field1, this.Field93);
        }

        this.Field72[this.Field1] = Class599.Field1((byte) this.Field1, Field97[var3]);
        this.Field58.Field1(var4);
        this.Field67 = var1;
        this.Field69[this.Field1] = System.currentTimeMillis();
        super.Field204 = 2;
        this.Field90 = 0;
        this.Field58.Field1();
        this.Field90 = var2.Field1;
        this.Field131 = var2.Field2;
        this.Field73 = 0;
    }

    public final void Field1(Vector var1) {
        this.Field98 = var1;
        this.Field141 = false;
        this.Field85 = -1;
        this.Field86 = -1;
        this.Field87 = -1;
        this.Field117 = -1;
        this.Field118 = -1;
        this.Field89 = -1;

        for (int var2 = 0; var2 < var1.size(); ++var2) {
            Class805 var3;
            if ((var3 = Class811.Field2((int) ((Class534) var1.elementAt(var2)).Field18)).Field3 == 0) {
                this.Field85 = var3.Field4;
                this.Field186[1] = var3.Field4;
            }

            if (var3.Field3 == 1) {
                this.Field86 = var3.Field4;
                this.Field186[0] = var3.Field4;
            }

            if (var3.Field3 == 2) {
                this.Field87 = var3.Field4;
                this.Field186[3] = var3.Field4;
            }

            if (var3.Field3 == 3 || var3.Field3 == 4 || var3.Field3 == 5 || var3.Field3 == 6 || var3.Field3 == 7) {
                this.Field118 = var3.Field3;
                this.Field117 = var3.Field4;
                this.Field119 = var3.Field15;
                this.Field186[5] = var3.Field4;
            }

            if (var3.Field3 == 19) {
                this.Field89 = var3.Field4;
                this.Field186[4] = var3.Field4;
            }

            if (var3.Field3 == 13) {
                this.Field141 = true;
            }
        }

        if (super.Field4 <= 0) {
            super.Field204 = 3;
        }

    }

    public final void Field2(Vector var1) {
        this.Field99 = var1;
    }

    public final void Field1(long var1, int[] var3, Vector var4, Vector var5, int var6) {
        if (var6 == 0) {
            this.Field121 = var3;
            this.Field122 = var1;
        }

        if (var6 == 1) {
            Field125.removeAllElements();
            Field125 = var4;
        }

        if (var6 == 2) {
            Field126.removeAllElements();
            Field126 = var5;
        }

    }

    public final int Field34() {
        int var10001 = super.Field19;
        return super.Field19 + 0 / 100;
    }

    public final void Field1(Class797 var1) {
        if (var1.Field2.equals("hp")) {
            super.Field2 = super.Field4 = var1.Field1;
        }

        if (var1.Field2.equals("mp")) {
            this.Field130 = var1.Field1;
        }

        if (var1.Field2.equals("bp")) {
            this.Field78 = (short) var1.Field1;
        }

        if (var1.Field2.equals("sp")) {
            this.Field79 = (short) var1.Field1;
        }

    }

    public final void Field1(byte[] var1, short[] var2) {
        for (int var3 = 0; var3 < var1.length; ++var3) {
            if (var1[var3] <= 0) {
                if (!this.Field5(Field182[var3])) {
                    this.Field4(Field182[var3]);
                }
            } else if (!this.Field5(var1[var3])) {
                Class829 var4;
                (var4 = new Class829(super.Field193, super.Field194, var1[var3])).Field1(var2[var3]);
                super.Field213.addElement(var4);
            }
        }

    }

    public final void Field35() {
        this.Field74 = super.Field193;
        this.Field75 = super.Field193;
        this.Field77 = (short) Class21.Field7.Field1(this.Field65);
        super.Field2 = super.Field4;
        this.Field68 = Field160[this.Field93];
        this.Field1(this.Field133, this.Field135);
        if (super.Field199 > 0) {
            super.Field207 = true;
        }

        if (super.Field4 <= 0) {
            super.Field204 = 3;
        }

    }

    public final boolean Field6(int var1) {
        return false;
    }

    public final boolean Field7(int var1) {
        return false;
    }

    public final int Field36() {
        for (int var1 = 0; var1 < this.Field98.size(); ++var1) {
            Class534 var2;
            Class805 var3;
            if ((var3 = Class811.Field2((int) (var2 = (Class534) this.Field98.elementAt(var1)).Field18)).Field3 == 3 || var3.Field3 == 4 || var3.Field3 == 5 || var3.Field3 == 6 || var3.Field3 == 7) {
                return var2.Field21;
            }
        }

        return 0;
    }

    public final int Field8(int var1) {
        int var2 = 0;
        int var3 = 0;
        boolean var4 = false;

        int var6;
        for (var6 = 0; var6 < this.Field98.size(); ++var6) {
            Class805 var5;
            if ((var5 = Class811.Field2((int) ((Class534) this.Field98.elementAt(var6)).Field18)).Field3 != 3 && var5.Field3 != 4 && var5.Field3 != 5 && var5.Field3 != 6 && var5.Field3 != 7) {
                var2 += var5.Field10 / 10;
            } else {
                var3 += var5.Field10 / 10;
            }
        }

        if (var1 == 0) {
            var6 = var2;
        } else if (var1 == 1) {
            var6 = var3;
        } else {
            var6 = var2 + var3;
        }

        return var6;
    }

    public final void Field37() {
        for (int var1 = 0; var1 < this.Field98.size(); ++var1) {
            Class534 var2;
            Class805 var3;
            if (((var3 = Class811.Field2((int) (var2 = (Class534) this.Field98.elementAt(var1)).Field18)).Field3 == 3 || var3.Field3 == 4 || var3.Field3 == 5 || var3.Field3 == 6 || var3.Field3 == 7) && var2.Field22 > 0) {
                --var2.Field22;
                if (var2.Field22 % 10 == 0) {
                    --var2.Field21;
                }
            }
        }

    }

    public final void Field38() {
        for (int var1 = 0; var1 < this.Field98.size(); ++var1) {
            Class534 var2;
            Class805 var3;
            if (((var3 = Class811.Field2((int) (var2 = (Class534) this.Field98.elementAt(var1)).Field18)).Field3 == 0 || var3.Field3 == 1 || var3.Field3 == 2) && var2.Field22 > 0) {
                --var2.Field22;
                if (var2.Field22 % 10 == 0) {
                    --var2.Field21;
                }
            }
        }

    }

    private void Field3(Graphics var1, int var2) {
        if (this.Field37 != null && this.Field37.length > 0) {
            for (int var3 = 0; var3 < this.Field37.length; ++var3) {
                Class269 var4;
                if ((var4 = Field2(this.Field37[var3])) != null) {
                    if (Class106.Field12 % this.Field38[var3] == 0 && var4 != null) {
                        int var5;
                        if ((var5 = var4.Field1.size()) == 0) {
                            var5 = 1;
                        }

                        this.Field247 = (byte) ((this.Field247 + 1) % var5);
                    }

                    if (var2 == 0) {
                        var4.Field2(var1, super.Field193, super.Field194 - (this.Field168 == 0 ? 0 : 6) + this.Field48(), this.Field247, 0);
                    } else {
                        var4.Field1(var1, super.Field193, super.Field194 - (this.Field168 == 0 ? 0 : 6) + this.Field48(), this.Field247, 0);
                    }
                }
            }
        }

    }

    public final int Field39() {
        return super.Field4;
    }

    public final void Field9(int var1) {
        super.Field204 = 3;
    }

    public final int Field40() {
        return super.Field2;
    }

    public final boolean d_() {
        return super.Field25 != -1;
    }

    public final boolean Field41() {
        return this.d_();
    }

    public final boolean Field42() {
        return true;
    }

    public final int f_() {
        return this.d_() ? super.Field25 : super.f_();
    }

    public final void Field2(int var1, int var2) {
        this.Field106 = (short) var1;
        this.Field33 = (short) var2;
    }

    public final void Field1(int var1, int var2, int var3) {
        this.Field39 = (short) var1;
        this.Field108 = (short) var2;
        this.Field109 = (short) var3;
    }

    public final void Field1(short var1, short var2, short var3) {
        this.Field34 = var1;
        this.Field35 = var2;
        this.Field36 = var3;
    }

    public final void Field1(short[] var1, byte[] var2) {
        this.Field37 = var1;
        this.Field38 = var2;
    }

    public final short Field43() {
        return (short) (this.Field167 == -1 && this.Field106 <= -1 ? 0 : 35);
    }
}
