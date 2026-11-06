package main.tab.tab2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import main.lib.Graphics;
import main.lib.Image;
import main.lib.TextureService;
import main.screen.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public final class Class455 {
    public static int Field1;
    public static int Field2;
    public static int Field3;
    public static int Field4;
    public static Vector Field5 = new Vector();
    public static Vector Field6 = new Vector();
    private static short[] Field14;
    public static int[] Field7;
    public static int[] Field8;
    public static Image Field9;
    public static short Field10 = 0;
    public static byte Field11 = -1;
    public static int Field12 = 0;
    private static Hashtable Field15 = new Hashtable();
    private static Vector Field16 = new Vector();
    public static boolean Field13;
    private static int Field17 = 4;

    public static void Field1() {
        Class811.Field5();
        Class811.Field4();
        Class811.Field7();
        Class811.Field8();
        Field16.removeAllElements();
        Class106.Field19.Field10.removeAllElements();
        Class106.Field19.Field11.removeAllElements();
        Class106.Field19.Field10.addElement(Class106.Field19.Field15);
        if (Class106.Field19.Field15.Field152 != null) {
            Class106.Field19.Field10.addElement(Class106.Field19.Field15.Field152);
        }

        Class732.Field4 = new Image[10];
        Field12 = 0;
    }

    public static void Field1(int var0, byte[] var1) {
        int var19;
        try {
            Class811.Field11 = null;
            Class811.Field12(var0);
            Field14 = null;
            Field9 = null;
            Field7 = null;
            Field5.removeAllElements();
            Field6.removeAllElements();
            Field16.removeAllElements();
            Field10 = (short) var0;
            InputStream var2 = null;
            DataInputStream var3 = null;
            if (var1 == null) {
                var2 = Main.instance.getResourceAsStream("/" + var0);
                var3 = new DataInputStream(var2);
            } else {
                ByteArrayInputStream var17 = new ByteArrayInputStream(var1);
                var3 = new DataInputStream(var17);
            }

            Field1 = var3.read();
            Field2 = var3.read();
            Field3 = Field1 << 4;
            Field4 = Field2 << 4;
            Field14 = new short[Field1 * Field2];
            Field15.clear();
            Field7 = new int[Field1 * Field2];

            int var18;
            for (var18 = 0; var18 < Field1 * Field2; ++var18) {
                Field14[var18] = (short) var3.read();
                if (Field14[var18] == 254) {
                    Field14[var18] = 255;
                }

                if (Field14[var18] != 255 && Field14[var18] != -1) {
                    Field7[var18] = Field8[Field14[var18]];
                }
            }

            int var4;
            int var5;
            int var6;
            while ((var18 = var3.read()) != 255) {
                var19 = var3.read();
                var4 = var3.read();
                var5 = var3.read();

                for (var6 = var19; var6 < var19 + var5; ++var6) {
                    for (int var7 = var18; var7 < var18 + var4; ++var7) {
                        short var8;
                        if ((var8 = (short) var3.read()) != 255) {
                            Class127 var9;
                            (var9 = new Class127()).Field2 = (short) var6;
                            var9.Field1 = (short) var7;
                            var9.Field3 = var8;
                            Field15.put(var6 * Field1 + var7, var9);
                        }
                    }
                }
            }

            while ((var18 = var3.read()) != 255) {
                var19 = var3.read();
                short var22;
                if ((var22 = (short) var3.read()) != 255) {
                    Class127 var23;
                    (var23 = new Class127()).Field2 = (short) var19;
                    var23.Field1 = (short) var18;
                    var23.Field3 = var22;
                    Field15.put(var19 * Field1 + var18, var23);
                }
            }

            Vector var20 = new Vector();

            while (true) {
                if ((var19 = var3.read()) == 254) {
                    var19 = 255;
                }

                if (var19 == 255) {
                    for (var19 = 0; var19 < var20.size(); ++var19) {
                        Field5.addElement(var20.elementAt(var19));
                    }

                    Field13 = var3.read() == 1;
                    var19 = var3.read();
                    Vector var26 = new Vector();
                    Vector var27 = new Vector();
                    byte var28 = -1;
                    var18 = -1;
                    var4 = -1;
                    var5 = 0;
                    var6 = 0;

                    int var10;
                    int var11;
                    int var13;
                    int var14;
                    Class519 var30;
                    for (var10 = 0; var10 < var19; ++var10) {
                        var11 = var3.read();
                        int var12 = var3.read();
                        if (var28 == -1) {
                            var18 = var11;
                            var4 = var12;
                            var28 = 0;
                            var26.addElement(String.valueOf(var11));
                            var27.addElement(String.valueOf(var12));
                            var6 = var11;
                            var5 = var12;
                        } else if (var11 == var18 && var12 != var4 && Class62.Field3(var12 - var5) <= 1) {
                            var26.addElement(String.valueOf(var11));
                            var27.addElement(String.valueOf(var12));
                            var6 = var11;
                            var5 = var12;
                        } else if (var12 == var4 && var11 != var18 && var11 - var6 <= 1) {
                            var26.addElement(String.valueOf(var11));
                            var27.addElement(String.valueOf(var12));
                            var6 = var11;
                            var5 = var12;
                        } else if (var11 != var18 && var12 != var4 || Class62.Field3(var12 - var5) > 1 || var11 - var6 > 1) {
                            var13 = Field2(var26);
                            var14 = Field2(var27);
                            if (var26.size() > 1) {
                                var13 = 16 * (var13 + Field1(var26));
                                var14 = 16 * (var14 + Field1(var27));
                                var13 /= 2;
                                var14 /= 2;
                            } else {
                                var13 <<= 4;
                                var14 <<= 4;
                            }

                            byte var15 = 0;
                            if (Field1 >= 20 && Field2 >= 20) {
                                if (var13 / 16 < 3) {
                                    var13 += 32;
                                    var14 -= 16;
                                } else if (var13 / 16 >= Field1 - 3) {
                                    var13 -= 32;
                                    var14 -= 16;
                                } else {
                                    var15 = 8;
                                }

                                if (var14 / 16 < 4) {
                                    var14 += 32;
                                    var15 = 4;
                                } else if (var14 / 16 > Field2 - 4) {
                                    var14 -= 32;
                                    var15 = -5;
                                } else {
                                    var14 += 24;
                                }
                            }

                            var30 = new Class519("vào", var13 + var15, var14);
                            Field6.addElement(var30);
                            var26.removeAllElements();
                            var27.removeAllElements();
                            var18 = var11;
                            var4 = var12;
                            var6 = var11;
                            var5 = var12;
                            var28 = 0;
                            var26.addElement(String.valueOf(var11));
                            var27.addElement(String.valueOf(var12));
                        }

                        Field7[var12 * Field1 + var11] = var10 + 2000000000;
                        var30 = null;
                        int[] var35 = new int[]{var3.read(), var3.read()};
                        short var32 = 0;

                        for (var13 = 1; var13 >= 0; --var13) {
                            var32 = (short) ((var32 = (short) (var32 << 8)) | 255 & var35[var13]);
                        }

                        var13 = var3.read();
                        var11 = var3.read();
                        Class793 var33 = new Class793(var32, var13, var11);
                        Field16.addElement(var33);
                    }

                    var10 = Field2(var26);
                    var11 = Field2(var27);
                    if (var26.size() > 1) {
                        var10 = 16 * (var10 + Field1(var26));
                        var11 = 16 * (var11 + Field1(var27));
                        var10 /= 2;
                        var11 /= 2;
                    } else {
                        var10 <<= 4;
                        var11 <<= 4;
                    }

                    byte var29 = 0;
                    if (Field1 >= 20 && Field2 >= 20) {
                        if (var10 / 16 < 3) {
                            var10 += 32;
                            var11 -= 16;
                        } else if (var10 / 16 >= Field1 - 3) {
                            var10 -= 32;
                            var11 -= 16;
                        } else {
                            var29 = 8;
                        }

                        if (var11 / 16 < 3) {
                            var11 += 32;
                            var29 = 4;
                        } else if (var11 / 16 > Field2 - 3) {
                            var11 -= 32;
                            var29 = -5;
                        } else {
                            var11 += 24;
                        }
                    }

                    var30 = new Class519("vào", var10 + var29, var11);
                    Field6.addElement(var30);
                    var14 = var3.read();
                    Class53 var34 = new Class53("/npc.sh", (byte[]) null);
                    if (Class106.Field19 != null) {
                        for (var13 = 0; var13 < var14; ++var13) {
                            Class260 var31 = new Class260(var3.read(), var3.read(), var3.read(), var34);
                            if (Class62.Field37 != null && Class62.Field37.Field6 == var31.Field1) {
                                Class62.Field37.Field1 = var31.Field193;
                                Class62.Field37.Field2 = var31.Field194;
                            }

                            Class106.Field19.Field10.addElement(var31);
                        }
                    }

                    var34.Field2();
                    Class53.Field1();
                    Field9 = Image.createImage(Field1, Field2);
                    Gdx.app.postRunnable(() -> {
                        SpriteBatch spriteBatch = new SpriteBatch();
                        Graphics g = new Graphics(spriteBatch);
                        Texture texture = TextureService.instance.spriteBatchToTexture(spriteBatch, () -> {
                            for (int var111 = 0; var111 < Field1; ++var111) {
                                for (int var181 = 0; var181 < Field2; ++var181) {
                                    if (Field15.get(var181 * Field1 + var111) != null) {
                                        Class127 var24 = (Class127) Field15.get(var181 * Field1 + var111);
                                        g.drawRegion(Class811.Field38, 0, var24.Field3, 1, 1, 0, var24.Field1, var24.Field2, 0);
                                    } else {
                                        short var25;
                                        if ((var25 = Field14[var181 * Field1 + var111]) != 255) {
                                            g.drawRegion(Class811.Field38, 0, var25, 1, 1, 0, var111, var181, 0);
                                        }
                                    }
                                }
                            }
                        }, Field1, Field2);
                        Field9 = new Image(texture);
                    });
                    break;
                }

                var4 = var3.read();
                var5 = var3.read();
                var20.addElement(new Class264(var19, var4, var5));
            }
        } catch (Exception var16) {
            (new StringBuffer("LOAD TILE ERR ")).append(var0).append(" > ").append(var16.toString()).toString();
            Main.instance.notifyDestroyed();
        }

        if (Class106.Field19 != null) {
            Class106.Field19.Field5();
        }

        if (Class106.Field1.hasPointerEvents()) {
            if ((var19 = Class62.Field67) > Field1) {
                var19 = Field1;
            }

            int var21;
            if ((var21 = Class62.Field68) > Field2) {
                var21 = Field2;
            }

            Class62.Field93 = new byte[var19][var21];
        }

    }

    private static int Field1(Vector var0) {
        int var1 = -10;

        for (int var2 = 0; var2 < var0.size(); ++var2) {
            int var3 = Integer.parseInt((String) var0.elementAt(var2));
            if (var1 < var3) {
                var1 = var3;
            }
        }

        return var1;
    }

    private static int Field2(Vector var0) {
        int var1 = 10000;

        for (int var2 = 0; var2 < var0.size(); ++var2) {
            int var3 = Integer.parseInt((String) var0.elementAt(var2));
            if (var1 > var3) {
                var1 = var3;
            }
        }

        return var1;
    }

    public static void Field1(int var0) {
        switch (var0) {
            case 0:
                Field11 = 0;
                return;
            case 1:
                return;
            case 2:
                return;
            case 3:
                Field11 = 1;
                return;
            case 4:
                Field11 = 2;
                return;
            case 5:
                Field11 = 3;
                return;
            case 6:
                Field11 = 4;
                return;
            case 7:
                Field11 = 5;
                return;
            case 8:
                Field11 = 6;
                return;
            case 9:
                Field11 = 7;
                return;
            case 10:
                Field11 = 8;
                return;
            case 11:
                return;
            case 70:
            case 80:
                Field11 = 0;
            default:
                return;
            case 100:
                return;
            case 101:
                return;
            case 102:
                return;
            case 110:
                return;
            case 111:
                return;
            case 112:
                return;
            case 202:
                Field11 = 9;
        }
    }

    public static final void Field1(Graphics var0) {
        if (Field14 != null) {
            for (int var1 = Class106.Field19.Field2; var1 < Class106.Field19.Field4; ++var1) {
                for (int var2 = Class106.Field19.Field3; var2 < Class106.Field19.Field5; ++var2) {
                    short var3;
                    if ((var3 = Field14[var2 * Field1 + var1]) != 255) {
                        var0.drawRegion(Class811.Field11, 0, var3 << Field17, 16, 16, 0, var1 << Field17, var2 << Field17, 0);
                    }
                }
            }
        }

    }

    public static final void Field2(Graphics var0) {
        if (Field15.size() > 0) {
            Enumeration var1 = Field15.keys();

            while (var1.hasMoreElements()) {
                Integer var2 = (Integer) var1.nextElement();
                Class127 var4;
                if ((var4 = (Class127) Field15.get(var2)).Field2 >= Class106.Field19.Field3 && var4.Field2 <= Class106.Field19.Field5 && var4.Field1 >= Class106.Field19.Field2 - 1 && var4.Field1 <= Class106.Field19.Field4 + 1) {
                    var0.drawRegion(Class811.Field11, 0, var4.Field3 << 4, 16, 16, 0, var4.Field1 << 4, var4.Field2 << 4, 0);
                }
            }
        }

    }

    public static final boolean Field1(int var0, int var1, int var2) {
        if ((var0 = (var1 >> Field17) * Field1 + (var0 >> Field17)) >= 0 && var0 < Field7.length) {
            return (Field7[var0] & 2) == 2;
        } else {
            return true;
        }
    }

    public static final Class793 Field1(int var0, int var1) {
        if ((var1 >> Field17) * Field1 + (var0 >> Field17) < Field7.length && (var1 >> Field17) * Field1 + (var0 >> Field17) >= 0) {
            return Field7[(var1 >> Field17) * Field1 + (var0 >> Field17)] >= 2000000000 ? (Class793) Field16.elementAt(Field7[(var1 >> Field17) * Field1 + (var0 >> Field17)] - 2000000000) : null;
        } else {
            return null;
        }
    }
}
