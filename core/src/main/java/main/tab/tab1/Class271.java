package main.tab.tab1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Hashtable;
import java.util.Vector;

import main.lib.Graphics;

public final class Class271 {
    public Vector Field1 = new Vector();
    private Class599[] Field9;
    private byte[][] Field10;
    private byte[] Field11;
    private byte Field12;
    private byte Field13;
    public boolean Field2;
    private byte Field14;
    public int Field3;
    public long Field4;
    public boolean Field5;
    private byte Field15;
    public static Hashtable Field6 = new Hashtable();
    public byte Field7;
    private long Field16;
    public long Field8;

    public Class271(int var1, long var2, boolean var4, boolean var5, boolean var6, int var7, byte var8) {
        new Vector();
        this.Field10 = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
        this.Field3 = 0;
        this.Field15 = 0;
        this.Field8 = var2;
        this.Field3 = (short) var1;
        this.Field7 = var8;
        if (var2 == -1L) {
            this.Field15 = 3;
        } else if (var2 == 0L) {
            this.Field15 = 1;
        } else {
            this.Field15 = 2;
        }

        this.Field5 = var5;
        Class349 var9;
        if ((var9 = (Class349) Field6.get(String.valueOf(var1))) != null) {
            this.Field1(var9.Field6);
        }

    }

    public Class271(int var1, long var2) {
        new Vector();
        this.Field10 = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
        this.Field3 = 0;
        this.Field15 = 0;
        this.Field8 = var2;
        this.Field3 = (short) var1;
        if (var2 == -1L) {
            this.Field15 = 3;
        } else if (var2 == 0L) {
            this.Field15 = 1;
        } else {
            this.Field15 = 2;
        }

        Class349 var4;
        if ((var4 = (Class349) Field6.get(String.valueOf(var1))) != null) {
            this.Field1(var4.Field6);
        }

    }

    public final void Field1(byte var1) {
        this.Field14 = var1;
    }

    public Class271(int var1) {
        new Vector();
        this.Field10 = new byte[][]{new byte[1], new byte[1], new byte[1], new byte[1]};
        this.Field3 = 0;
        this.Field15 = 0;
        this.Field3 = var1;
        Class349 var2;
        if ((var2 = (Class349) Field6.get(String.valueOf(var1))) != null) {
            this.Field1(var2.Field6);
        }

    }

    private void Field1(byte[] var1) {
        try {
            DataInputStream var10;
            byte var2 = (var10 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.Field9 = new Class599[var2];

            for (int var3 = 0; var3 < var2; ++var3) {
                this.Field9[var3] = new Class599(var10.readUnsignedByte(), var10.readUnsignedByte(), var10.readUnsignedByte(), var10.readUnsignedByte(), var10.readUnsignedByte());
            }

            short var13 = var10.readShort();

            for (int var11 = 0; var11 < var13; ++var11) {
                byte var4 = var10.readByte();
                Vector var5 = new Vector();
                Vector var6 = new Vector();

                for (int var7 = 0; var7 < var4; ++var7) {
                    Class349 var8;
                    (var8 = new Class349(var10.readShort(), var10.readShort(), var10.readByte())).Field4 = var10.readByte();
                    var8.Field5 = var10.readByte();
                    if (var8.Field5 == 0) {
                        var5.addElement(var8);
                    } else {
                        var6.addElement(var8);
                    }
                }

                this.Field1.addElement(new Class188(var5, var6));
            }

            short var12 = (short) var10.readUnsignedByte();
            this.Field11 = new byte[var12];

            int var14;
            for (var14 = 0; var14 < var12; ++var14) {
                this.Field11[var14] = (byte) var10.readShort();
            }

            var10.readByte();
            var2 = var10.readByte();
            this.Field10[0] = new byte[var2];

            for (var14 = 0; var14 < var2; ++var14) {
                this.Field10[0][var14] = var10.readByte();
            }

            var2 = var10.readByte();
            this.Field10[1] = new byte[var2];

            for (var14 = 0; var14 < var2; ++var14) {
                this.Field10[1][var14] = var10.readByte();
            }

            var2 = var10.readByte();
            this.Field10[3] = new byte[var2];

            for (var14 = 0; var14 < var2; ++var14) {
                this.Field10[3][var14] = var10.readByte();
            }

        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5) {
        if (var4 < this.Field1.size()) {
            Class188 var17 = (Class188) this.Field1.elementAt(var4);

            try {
                Vector var18 = var17.Field2;

                for (int var6 = 0; var6 < var18.size(); ++var6) {
                    Class349 var7 = (Class349) var18.elementAt(var6);
                    Class599 var8 = this.Field9[var7.Field3];
                    Class172 var9;
                    if ((var9 = Class381.Field1((short) this.Field3)) != null && var9.Field1 != null) {
                        int var10 = var7.Field1;
                        int var11 = var8.Field3;
                        int var12 = var8.Field4;
                        short var13 = var8.Field1;
                        short var19 = var8.Field2;
                        int var14 = var9.Field1.getWidth();
                        int var15 = var9.Field1.getHeight();
                        if (var13 > var14) {
                            var13 = 0;
                        }

                        if (var19 > var15) {
                            var19 = 0;
                        }

                        if (var13 + var11 > var14) {
                            var11 = var14 - var13;
                        }

                        if (var19 + var12 > var15) {
                            var12 = var15 - var19;
                        }

                        var14 = var7.Field4 == 1 ? 2 : 0;
                        if (var5 == 2 || var5 == 6) {
                            if (var14 == 2) {
                                var14 = 0;
                            } else {
                                var14 = 2;
                            }

                            var10 = -(var10 + var11);
                        }

                        var1.drawRegion(var9.Field1, var13, var19, var11, var12, var14, var2 + var10, var3 + var7.Field2, 0);
                    }
                }

                return;
            } catch (Exception var16) {
                var16.printStackTrace();
            }
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field12 < this.Field1.size()) {
            Class188 var2 = (Class188) this.Field1.elementAt(this.Field12);

            try {
                Vector var14 = var2.Field2;

                for (int var3 = 0; var3 < var14.size(); ++var3) {
                    Class349 var4 = (Class349) var14.elementAt(var3);
                    Class599 var5 = this.Field9[var4.Field3];
                    Class172 var6;
                    if ((var6 = Class381.Field1((short) this.Field3)) != null && var6.Field1 != null) {
                        short var7 = var4.Field1;
                        int var8 = var5.Field3;
                        int var9 = var5.Field4;
                        short var10 = var5.Field1;
                        short var15 = var5.Field2;
                        int var11 = var6.Field1.getWidth();
                        int var12 = var6.Field1.getHeight();
                        if (var10 > var11) {
                            var10 = 0;
                        }

                        if (var15 > var12) {
                            var15 = 0;
                        }

                        if (var10 + var8 > var11) {
                            var8 = var11 - var10;
                        }

                        if (var15 + var9 > var12) {
                            var9 = var12 - var15;
                        }

                        var11 = var4.Field4 == 1 ? 2 : 0;
                        var1.drawRegion(var6.Field1, var10, var15, var8, var9, var11, var7 + 0, 0 + var4.Field2, 0);
                    }
                }

                return;
            } catch (Exception var13) {
                var13.printStackTrace();
            }
        }

    }

    public final void Field2(Graphics var1) {
        if (this.Field12 < this.Field1.size()) {
            Class188 var2 = (Class188) this.Field1.elementAt(this.Field12);

            try {
                Vector var14 = var2.Field3;

                for (int var3 = 0; var3 < var14.size(); ++var3) {
                    Class349 var4 = (Class349) var14.elementAt(var3);
                    Class599 var5 = this.Field9[var4.Field3];
                    Class172 var6;
                    if ((var6 = Class381.Field1((short) this.Field3)) != null && var6.Field1 != null) {
                        short var7 = var4.Field1;
                        int var8 = var5.Field3;
                        int var9 = var5.Field4;
                        short var10 = var5.Field1;
                        short var15 = var5.Field2;
                        int var11 = var6.Field1.getWidth();
                        int var12 = var6.Field1.getHeight();
                        if (var10 > var11) {
                            var10 = 0;
                        }

                        if (var15 > var12) {
                            var15 = 0;
                        }

                        if (var10 + var8 > var11) {
                            var8 = var11 - var10;
                        }

                        if (var15 + var9 > var12) {
                            var9 = var12 - var15;
                        }

                        var11 = var4.Field4 == 1 ? 2 : 0;
                        var1.drawRegion(var6.Field1, var10, var15, var8, var9, var11, var7 + 0, 0 + var4.Field2, 0);
                    }
                }

                return;
            } catch (Exception var13) {
                var13.printStackTrace();
            }
        }

    }

    public final void Field2(Graphics var1, int var2, int var3, int var4, int var5) {
        if (var4 < this.Field1.size()) {
            Class188 var17 = (Class188) this.Field1.elementAt(var4);

            try {
                Vector var18 = var17.Field3;

                for (int var6 = 0; var6 < var18.size(); ++var6) {
                    Class349 var7 = (Class349) var18.elementAt(var6);
                    Class599 var8 = this.Field9[var7.Field3];
                    Class172 var9;
                    if ((var9 = Class381.Field1((short) this.Field3)) != null && var9.Field1 != null) {
                        int var10 = var7.Field1;
                        int var11 = var8.Field3;
                        int var12 = var8.Field4;
                        short var13 = var8.Field1;
                        short var19 = var8.Field2;
                        int var14 = var9.Field1.getWidth();
                        int var15 = var9.Field1.getHeight();
                        if (var13 > var14) {
                            var13 = 0;
                        }

                        if (var19 > var15) {
                            var19 = 0;
                        }

                        if (var13 + var11 > var14) {
                            var11 = var14 - var13;
                        }

                        if (var19 + var12 > var15) {
                            var12 = var15 - var19;
                        }

                        var14 = var7.Field4 == 1 ? 2 : 0;
                        if (var5 == 2 || var5 == 6) {
                            if (var14 == 2) {
                                var14 = 0;
                            } else {
                                var14 = 2;
                            }

                            var10 = -(var10 + var11);
                        }

                        var1.drawRegion(var9.Field1, var13, var19, var11, var12, var14, var2 + var10, var3 + var7.Field2, 0);
                    }
                }

                return;
            } catch (Exception var16) {
                var16.printStackTrace();
            }
        }

    }

    public final void Field1(Graphics var1, int var2, int var3) {
        if (this.Field12 < this.Field1.size()) {
            Class188 var4 = (Class188) this.Field1.elementAt(this.Field12);

            try {
                Vector var5 = null;
                var5 = var4.Field2;

                for (int var16 = 0; var16 < var5.size(); ++var16) {
                    Class349 var6 = (Class349) var5.elementAt(var16);
                    Class599 var7 = this.Field9[var6.Field3];
                    Class172 var8;
                    if ((var8 = Class381.Field1((short) this.Field3)) != null && var8.Field1 != null) {
                        short var9 = var6.Field1;
                        int var10 = var7.Field3;
                        int var11 = var7.Field4;
                        short var12 = var7.Field1;
                        short var17 = var7.Field2;
                        int var13 = var8.Field1.getWidth();
                        int var14 = var8.Field1.getHeight();
                        if (var12 > var13) {
                            var12 = 0;
                        }

                        if (var17 > var14) {
                            var17 = 0;
                        }

                        if (var12 + var10 > var13) {
                            var10 = var13 - var12;
                        }

                        if (var17 + var11 > var14) {
                            var11 = var14 - var17;
                        }

                        var1.drawRegion(var8.Field1, var12, var17, var10, var11, var6.Field4 == 1 ? 2 : 0, var2 + var9, var3 + var6.Field2, 0);
                    }
                }

                return;
            } catch (Exception var15) {
                var15.printStackTrace();
            }
        }

    }

    public final void Field2(Graphics var1, int var2, int var3) {
        if (this.Field12 < this.Field1.size()) {
            Class188 var4 = (Class188) this.Field1.elementAt(this.Field12);

            try {
                Vector var16 = var4.Field3;

                for (int var5 = 0; var5 < var16.size(); ++var5) {
                    Class349 var6 = (Class349) var16.elementAt(var5);
                    Class599 var7 = this.Field9[var6.Field3];
                    Class172 var8;
                    if ((var8 = Class381.Field1((short) this.Field3)) != null && var8.Field1 != null) {
                        short var9 = var6.Field1;
                        int var10 = var7.Field3;
                        int var11 = var7.Field4;
                        short var12 = var7.Field1;
                        short var17 = var7.Field2;
                        int var13 = var8.Field1.getWidth();
                        int var14 = var8.Field1.getHeight();
                        if (var12 > var13) {
                            var12 = 0;
                        }

                        if (var17 > var14) {
                            var17 = 0;
                        }

                        if (var12 + var10 > var13) {
                            var10 = var13 - var12;
                        }

                        if (var17 + var11 > var14) {
                            var11 = var14 - var17;
                        }

                        var1.drawRegion(var8.Field1, var12, var17, var10, var11, var6.Field4 == 1 ? 2 : 0, var2 + var9, var3 + var6.Field2, 0);
                    }
                }

                return;
            } catch (Exception var15) {
                var15.printStackTrace();
            }
        }

    }

    public final void Field1() {
        try {
            switch (this.Field15) {
                case 0:
                case 1:
                    ++this.Field13;
                    if (this.Field13 < this.Field11.length) {
                        this.Field12 = this.Field11[this.Field13];
                    }

                    if (this.Field13 >= this.Field11.length) {
                        this.Field13 = 0;
                        this.Field2 = true;
                        return;
                    }
                    break;
                case 2:
                    ++this.Field13;
                    if (this.Field13 > this.Field11.length - 1) {
                        this.Field13 = 0;
                    }

                    if (this.Field13 < this.Field11.length) {
                        this.Field12 = this.Field11[this.Field13];
                    }

                    if (this.Field8 - System.currentTimeMillis() < 0L) {
                        this.Field2 = true;
                        return;
                    }
                    break;
                case 3:
                    ++this.Field13;
                    if (this.Field13 < this.Field11.length) {
                        this.Field12 = this.Field11[this.Field13];
                    }

                    if (this.Field13 > this.Field11.length) {
                        if (this.Field14 <= 0) {
                            this.Field13 = 0;
                            return;
                        }

                        if (System.currentTimeMillis() - this.Field16 > (long) (this.Field14 * 1000)) {
                            this.Field13 = 0;
                            this.Field16 = System.currentTimeMillis();
                            return;
                        }
                    }
                    break;
                default:
                    return;
            }
        } catch (Exception var1) {
        }

    }
}
