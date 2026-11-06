package main.tab.tab1;

import main.lib.Graphics;
import main.lib.Image;
import main.screen.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;

public final class Class182 {
    private int Field4;
    private int Field5;
    public int Field1 = 0;
    private int[][] Field6;
    private int[][] Field7;
    private int[][] Field8;
    private int[][] Field9;
    private int[][] Field10;
    private int[][] Field11;
    public Image Field2;
    private int Field12;
    private int Field13;
    private int Field14;
    private int Field15;
    private int Field16;
    private int Field17;
    public int Field3;
    private static byte[][] Field18 = new byte[][]{{0, 0, 1, 2, 3, 4}, {0, 0, 1, 2, 3, 4}, new byte[6], new byte[6], {0, 1, 0, 1, 0, 1}};

    static {
        int[] var10000 = new int[]{0, 2, 1};
    }

    public final void Field1(byte[] var1, int var2) {
        ByteArrayInputStream var3 = null;
        DataInputStream var4 = null;
        ByteArrayInputStream var5 = null;
        DataInputStream var6 = null;

        try {
            var3 = new ByteArrayInputStream(var1);
            var1 = new byte[(var4 = new DataInputStream(var3)).readShort()];
            var4.read(var1, 0, var1.length);
            this.Field2 = Image.createImage(var1, 0, var1.length);
            var1 = new byte[var4.readShort()];
            var4.read(var1, 0, var1.length);
            var5 = new ByteArrayInputStream(var1);
            var6 = new DataInputStream(var5);
            this.Field14 = Class804.Field1((InputStream) var6);
            this.Field15 = Class804.Field1((InputStream) var6);
            this.Field16 = Class804.Field1((InputStream) var6);
            this.Field17 = Class804.Field1((InputStream) var6);
            this.Field12 = Class804.Field1((InputStream) var6);
            this.Field13 = Class804.Field1((InputStream) var6);

            try {
                int var29;
                if (var2 < 4) {
                    for (var29 = 0; var29 < 4; ++var29) {
                        for (var2 = 0; var2 < this.Field6[var29].length; ++var2) {
                            this.Field6[var29][var2] = var6.read();
                            this.Field7[var29][var2] = var6.read();
                            this.Field8[var29][var2] = var6.read();
                            this.Field9[var29][var2] = var6.read();
                        }

                        for (var2 = 0; var2 < 6; ++var2) {
                            this.Field10[var29][var2] = Class804.Field1((InputStream) var6);
                            this.Field11[var29][var2] = Class804.Field1((InputStream) var6);
                        }
                    }

                    return;
                }

                for (var29 = 0; var29 < 3; ++var29) {
                    for (var2 = 0; var2 < this.Field6[var29].length; ++var2) {
                        this.Field6[var29][var2] = var6.read();
                        this.Field7[var29][var2] = var6.read();
                        this.Field8[var29][var2] = var6.read();
                        this.Field9[var29][var2] = var6.read();
                    }
                }

                for (var29 = 0; var29 < 4; ++var29) {
                    for (var2 = 0; var2 < 6; ++var2) {
                        this.Field10[var29][var2] = Class804.Field1((InputStream) var6);
                        this.Field11[var29][var2] = Class804.Field1((InputStream) var6);
                    }
                }

                return;
            } catch (Exception var26) {
                return;
            }
        } catch (Exception var27) {
        } finally {
            try {
                var3.close();
            } catch (Exception var25) {
            }

            try {
                var5.close();
            } catch (Exception var24) {
            }

            try {
                var6.close();
            } catch (Exception var23) {
            }

            try {
                var4.close();
            } catch (Exception var22) {
            }

        }

    }

    private void Field1(int var1, int var2) {
        DataInputStream var3 = null;
        ByteArrayInputStream var4 = null;
        DataInputStream var5 = null;

        try {
            byte[] var26 = new byte[(var3 = new DataInputStream(Main.instance.getResourceAsStream(Class53.Field2[var1] + var2))).readShort()];
            var3.read(var26, 0, var26.length);
            this.Field2 = Image.createImage(var26, 0, var26.length);
            var26 = new byte[var3.readShort()];
            var3.read(var26, 0, var26.length);
            var4 = new ByteArrayInputStream(var26);
            var5 = new DataInputStream(var4);
            this.Field14 = Class804.Field1((InputStream) var5);
            this.Field15 = Class804.Field1((InputStream) var5);
            this.Field16 = Class804.Field1((InputStream) var5);
            this.Field17 = Class804.Field1((InputStream) var5);
            this.Field12 = Class804.Field1((InputStream) var5);
            this.Field13 = Class804.Field1((InputStream) var5);

            for (var1 = 0; var1 < 3; ++var1) {
                for (var2 = 0; var2 < this.Field6[var1].length; ++var2) {
                    this.Field6[var1][var2] = var5.read();
                    this.Field7[var1][var2] = var5.read();
                    this.Field8[var1][var2] = var5.read();
                    this.Field9[var1][var2] = var5.read();
                }
            }

            for (var1 = 0; var1 < 4; ++var1) {
                for (var2 = 0; var2 < 6; ++var2) {
                    this.Field10[var1][var2] = Class804.Field1((InputStream) var5);
                    this.Field11[var1][var2] = Class804.Field1((InputStream) var5);
                }
            }

            var5.close();
            return;
        } catch (Exception var24) {
        } finally {
            try {
                var4.close();
            } catch (Exception var22) {
            }

            try {
                var5.close();
            } catch (Exception var21) {
            }

            try {
                var3.close();
            } catch (Exception var20) {
            }

        }

    }

    private void Field2(int var1, int var2) {
        DataInputStream var3 = null;
        ByteArrayInputStream var4 = null;
        DataInputStream var5 = null;

        try {
            byte[] var28 = new byte[(var3 = new DataInputStream(Main.instance.getResourceAsStream(Class53.Field2[var1] + var2))).readShort()];
            var3.read(var28, 0, var28.length);
            this.Field2 = Image.createImage(var28, 0, var28.length);
            var28 = new byte[var3.readShort()];
            var3.read(var28, 0, var28.length);
            var4 = new ByteArrayInputStream(var28);
            var5 = new DataInputStream(var4);
            this.Field14 = Class804.Field1((InputStream) var5);
            this.Field15 = Class804.Field1((InputStream) var5);
            this.Field16 = Class804.Field1((InputStream) var5);
            this.Field17 = Class804.Field1((InputStream) var5);
            this.Field12 = Class804.Field1((InputStream) var5);
            this.Field13 = Class804.Field1((InputStream) var5);

            try {
                for (var1 = 0; var1 < 4; ++var1) {
                    for (var2 = 0; var2 < this.Field6[var1].length; ++var2) {
                        this.Field6[var1][var2] = var5.read();
                        this.Field7[var1][var2] = var5.read();
                        this.Field8[var1][var2] = var5.read();
                        this.Field9[var1][var2] = var5.read();
                    }

                    for (var2 = 0; var2 < 6; ++var2) {
                        this.Field10[var1][var2] = Class804.Field1((InputStream) var5);
                        this.Field11[var1][var2] = Class804.Field1((InputStream) var5);
                    }
                }

                return;
            } catch (Exception var25) {
                return;
            }
        } catch (Exception var26) {
        } finally {
            try {
                var4.close();
            } catch (Exception var23) {
            }

            try {
                var5.close();
            } catch (Exception var22) {
            }

            try {
                var3.close();
            } catch (Exception var21) {
            }

        }

    }

    public Class182(int var1, int var2) {
        int[][] var10000 = new int[][]{{1, 1, 0}, {1, 1, 0}};
        var10000 = new int[][]{{3, 2, 2}, {3, 2, 2}};
        this.Field4 = var1;
        this.Field5 = var2;
        this.Field10 = new int[4][6];
        this.Field11 = new int[4][6];
        boolean var3 = false;
        byte var4;
        switch (var1) {
            case 0:
            case 1:
                var4 = 5;
                break;
            case 2:
            case 3:
                var4 = 1;
                break;
            default:
                var4 = 2;
        }

        this.Field6 = new int[4][var4];
        this.Field7 = new int[4][var4];
        this.Field8 = new int[4][var4];
        this.Field9 = new int[4][var4];
        if (var1 < 4) {
            this.Field2(var1, var2);
        } else {
            this.Field1(var1, var2);
        }
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5) {
        if (this.Field4 >= 0) {
            byte var6 = 0;
            int var7 = var4;
            if (var4 > 2) {
                var6 = 2;
                var7 = 2;
            }

            if (this.Field2 != null) {
                int var8 = this.Field10[var7][var5];
                int var9 = this.Field11[var7][var5];
                int var10 = this.Field8[var7][Field18[this.Field4][var5]];
                int var11 = this.Field9[var7][Field18[this.Field4][var5]];
                int var12 = this.Field6[var7][Field18[this.Field4][var5]];
                int var13 = this.Field7[var7][Field18[this.Field4][var5]];
                if (var12 > this.Field2.getWidth()) {
                    var12 = 0;
                }

                if (var13 > this.Field2.getHeight()) {
                    var13 = 0;
                }

                if (var12 + var10 > this.Field2.getWidth()) {
                    var10 = this.Field2.getWidth() - var12;
                }

                if (var13 + var11 > this.Field2.getHeight()) {
                    var11 = this.Field2.getHeight() - var13;
                }

                if (var4 > 2) {
                    var8 = -this.Field10[var7][var5] - var10;
                    var9 = this.Field11[var7][var5];
                }

                var1.drawRegion(this.Field2, var12, var13, var10, var11, var6, var2 + var8, var3 + var9, 0);
            } else {
                Class804.Field1(var1, var2, var4, var5, this.Field4);
            }

            System.currentTimeMillis();
        }
    }

    public final void Field1(Graphics var1, short var2, short var3, int var4, int var5) {
        try {
            if (this.Field2 != null) {
                int var6 = this.Field8[var4][Field18[this.Field4][var5]];
                int var7 = this.Field9[var4][Field18[this.Field4][var5]];
                int var8 = this.Field6[var4][Field18[this.Field4][var5]];
                var4 = this.Field7[var4][Field18[this.Field4][var5]];
                if (var8 > this.Field2.getWidth()) {
                    var8 = 0;
                }

                if (var4 > this.Field2.getHeight()) {
                    var4 = 0;
                }

                if (var8 + var6 > this.Field2.getWidth()) {
                    var6 = this.Field2.getWidth() - var8;
                }

                if (var4 + var7 > this.Field2.getHeight()) {
                    var7 = this.Field2.getHeight() - var4;
                }

                var1.drawRegion(this.Field2, var8, var4, var6, var7, 0, var2, var3, 3);
                return;
            }
        } catch (Exception var9) {
            System.out.println("LOI PART " + this.Field5);
        }

    }

    public final void Field1(Graphics var1, short var2, short var3) {
        try {
            if (this.Field2 != null) {
                var1.drawRegion(this.Field2, this.Field14, this.Field15, this.Field16, this.Field17, 0, var2 + this.Field12, var3 + this.Field13, 0);
                return;
            }
        } catch (Exception var4) {
        }

    }
}
