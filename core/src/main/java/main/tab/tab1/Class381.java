package main.tab.tab1;

import main.lib.Graphics;
import main.lib.Image;

import java.io.*;
import java.util.Hashtable;
import java.util.Vector;

public final class Class381 {
    private static Class381 Field4;
    public static Class568 Field1;
    public static Vector Field2 = new Vector();
    public static Hashtable Field3 = new Hashtable();
    private boolean Field5 = false;
    private static byte Field6 = 0;
    private static Image Field7;

    static {
        try {
            if (Field7 == null) {
                Field7 = Image.createImage("/waiting.png");
            }
        } catch (Exception var1) {
            var1.printStackTrace();
        }

    }

    public static Class381 Field1() {
        return Field4 == null ? (Field4 = new Class381()) : Field4;
    }

    public final void Field2() {
        if (!this.Field5) {
            try {
                Class826.deleteFile("nqshImgPotion");
            } catch (Exception var11) {
            }

            byte[] var1 = Class826.Field1("nqshImgPotionNew");
            byte var2 = 0;
            ByteArrayInputStream var13;
            DataInputStream var14;
            byte[] var15;
            if (var1 == null) {
                var2 = 0;
            } else {
                var13 = new ByteArrayInputStream(var1);
                var14 = new DataInputStream(var13);

                try {
                    var15 = new byte[var14.readShort()];
                    var14.read(var15);
                    byte var4 = var14.readByte();
                    int var5 = 0;

                    while (true) {
                        if (var5 >= var4) {
                            var2 = var14.readByte();
                            var14.close();
                            break;
                        }

                        byte[] var6 = new byte[var14.readShort()];
                        var14.read(var6);
                        byte var7;
                        byte[][] var16 = new byte[var7 = var14.readByte()][];

                        for (int var8 = 0; var8 < var7; ++var8) {
                            short var9 = var14.readShort();
                            var16[var8] = new byte[var9];
                            var14.read(var16[var8]);
                        }

                        Field1(var6, var16);
                        ++var5;
                    }
                } catch (IOException var12) {
                    var12.printStackTrace();
                }
            }

            Class263.Field1().Field2((byte) 2, (int) var2);
            var1 = Class826.Field1("gemItem");
            var2 = 0;
            if (var1 == null) {
                var2 = 0;
            } else {
                var13 = new ByteArrayInputStream(var1);
                var14 = new DataInputStream(var13);

                try {
                    var2 = var14.readByte();
                    var15 = new byte[var14.readShort()];
                    var14.read(var15);
                    var14.close();
                } catch (IOException var10) {
                    var10.printStackTrace();
                }
            }

            Class263.Field1().Field2((byte) 3, (int) var2);
            this.Field5 = true;
        }

    }

    private static void Field1(byte[] var0, byte[][] var1) {
        for (int var2 = 0; var2 < var1.length; ++var2) {
            Field2.addElement(Class804.Field1(var1[var2], var0));
        }

    }

    public static void Field1(byte var0, byte[] var1, byte[][] var2, byte[][][] var3) {
        ByteArrayOutputStream var4 = new ByteArrayOutputStream();
        DataOutputStream var5 = new DataOutputStream(var4);

        try {
            var5.writeShort(var1.length);
            var5.write(var1);
            var5.writeByte(var2.length);

            for (int var8 = 0; var8 < var2.length; ++var8) {
                var5.writeShort(var2[var8].length);
                var5.write(var2[var8]);
                var5.writeByte(var3[var8].length);

                for (int var6 = 0; var6 < var3[var8].length; ++var6) {
                    var5.writeShort(var3[var8][var6].length);
                    var5.write(var3[var8][var6]);
                }

                Field1(var2[var8], var3[var8]);
            }

            var5.writeByte(var0);
            Class826.Field1("nqshImgPotionNew", var4.toByteArray());
            var5.close();
        } catch (Exception var7) {
            var7.printStackTrace();
        }
    }

    public static void Field1(byte[] var0) {
        Field1 = new Class568(Image.createImage(var0, 0, var0.length), 20, 20);
    }

    public static void Field1(byte var0, byte[] var1) {
        ByteArrayOutputStream var2 = new ByteArrayOutputStream();
        DataOutputStream var3 = new DataOutputStream(var2);

        try {
            var3.writeByte(var0);
            var3.writeShort(var1.length);
            var3.write(var1);
            Class826.Field1("gemItem", var2.toByteArray());
            var3.close();
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    private static void Field3() {
        if (Class105.Field12 % 5 == 0) {
            Field6 = (byte) ((Field6 + 1) % (Field7.getHeight() / 18));
        }

    }

    public static void Field1(Graphics var0, short var1, int var2, int var3) {
        try {
            Class172 var7;
            if ((var7 = Field1(var1)) != null) {
                if (!var7.Field3) {
                    int var4 = var7.Field1.getWidth();
                    int var5 = var7.Field1.getHeight();
                    byte var6 = 1;
                    if (var5 > 25) {
                        var5 /= 3;
                        var6 = 3;
                    }

                    if (Class105.Field12 % 5 == 0) {
                        var7.Field5 = (byte) ((var7.Field5 + 1) % var6);
                    }

                    var0.drawRegion(var7.Field1, 0, var7.Field5 * var5, var4, var5, 0, var2, var3, 3);
                    return;
                }

                var0.drawRegion(Field7, 0, Field6 * 18, 18, 18, 0, var2, var3, 3);
                Field3();
            }
        } catch (Exception e) {

        }


    }

    public static void Field1(Graphics var0, short var1, int var2, int var3, int var4) {
        Class172 var8;
        if ((var8 = Field1(var1)) != null) {
            if (!var8.Field3) {
                int var5 = var8.Field1.getWidth();
                int var6 = var8.Field1.getHeight();
                byte var7 = 1;
                if (var6 > 25) {
                    var6 /= 3;
                    var7 = 3;
                }

                if (Class105.Field12 % 5 == 0) {
                    var8.Field5 = (byte) ((var8.Field5 + 1) % var7);
                }

                var0.drawRegion(var8.Field1, 0, var8.Field5 * var6, var5, var6, 0, var2, var3, var4);
                return;
            }

            var0.drawRegion(Field7, 0, Field6 * 18, 18, 18, 0, var2, var3, 3);
            Field3();
        }

    }

    public static void Field2(Graphics var0, short var1, int var2, int var3) {
        Class172 var4;
        if ((var4 = Field1((short) 800)) != null) {
            if (!var4.Field3) {
                var0.drawImage(var4.Field1, 98, 95, 3);
                return;
            }

            var0.drawRegion(Field7, 0, Field6 * 18, 18, 18, 0, 98, 95, 3);
            Field3();
        }

    }

    public static void Field2(Graphics var0, short var1, int var2, int var3, int var4) {
        Class172 var5;
        if ((var5 = Field1(var1)) != null) {
            if (!var5.Field3) {
                var0.drawImage(var5.Field1, var2, var3, var4);
                return;
            }

            var0.drawRegion(Field7, 0, Field6 * 18, 18, 18, 0, var2, var3, 3);
            Field3();
        }

    }

    public static Class172 Field1(short var0) {
        Class172 var1;
        if ((var1 = (Class172) Field3.get(String.valueOf(var0))) == null) {
            (var1 = new Class172()).Field3 = true;
            Field3.put("" + var0, var1);
            Class263.Field1().Field10(var0);
            var1.Field4 = (long) ((int) (System.currentTimeMillis() / 1000L));
        } else {
            if (var1.Field1 == null && System.currentTimeMillis() / 1000L - var1.Field4 > 30L) {
                Class263.Field1().Field10(var0);
                var1.Field4 = (long) ((int) (System.currentTimeMillis() / 1000L));
            }

            var1.Field2 = (int) (System.currentTimeMillis() / 1000L);
        }

        return var1;
    }
}
