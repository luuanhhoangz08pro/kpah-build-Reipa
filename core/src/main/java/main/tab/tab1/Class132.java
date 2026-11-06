package main.tab.tab1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

import main.lib.Graphics;

import main.lib.Image;

public final class Class132 {
    private Vector Field2 = new Vector();
    private Vector Field3 = new Vector();
    private Class599[] Field4;
    private byte[] Field5;
    private short Field6;
    private short Field7;
    private String Field8 = "";
    public byte Field1 = 0;
    private static byte[][] Field9 = new byte[][]{{0, 0, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {4, 4, 5, 6, 7, 5, 5, 5, 5, 5, 5, 5, 5, 5}, {8, 8, 9, 10, 11, 9, 9, 9, 9, 9, 9, 9, 9, 9}};

    public Class132(byte[] var1, int var2) {
        this.Field1(var1);
    }

    private void Field1(byte[] var1) {
        boolean var2 = false;
        DataInputStream var3 = null;
        ByteArrayInputStream var4 = null;
        this.Field2.removeAllElements();
        this.Field3.removeAllElements();

        try {
            var4 = new ByteArrayInputStream(var1);
            byte var23 = (var3 = new DataInputStream(var4)).readByte();
            this.Field4 = new Class599[var23];

            int var25;
            for (var25 = 0; var25 < var23; ++var25) {
                this.Field4[var25] = new Class599(var3.readUnsignedByte(), var3.readUnsignedByte(), var3.readUnsignedByte(), var3.readUnsignedByte(), var3.readUnsignedByte());
            }

            var25 = 0;
            int var24 = -1000000;
            short var5 = var3.readShort();

            int var6;
            for (var6 = 0; var6 < var5; ++var6) {
                byte var7 = var3.readByte();
                Vector var8 = new Vector();

                for (int var9 = 0; var9 < var7; ++var9) {
                    Class349 var10;
                    (var10 = new Class349(var3.readShort(), var3.readShort(), var3.readByte())).Field4 = var3.readByte();
                    var10.Field5 = var3.readByte();
                    var8.addElement(var10);
                    if (var6 == 0) {
                        if (var24 < var10.Field2 + this.Field4[var10.Field3].Field4) {
                            var24 = var10.Field2 + this.Field4[var10.Field3].Field4;
                        }

                        if (var25 < Class802.Field4(var10.Field2)) {
                            var25 = Class802.Field4(var10.Field2);
                        }
                    }
                }

                if (var6 == 0 && var24 <= -5) {
                    this.Field1 = (byte) var24;
                }

                this.Field2.addElement(new Class188(var8, (Vector) null));
            }

            this.Field6 = this.Field4[0].Field3;
            this.Field7 = (short) var25;
            short var26 = var3.readShort();
            this.Field5 = new byte[var26];

            for (var6 = 0; var6 < var26; ++var6) {
                this.Field5[var6] = (byte) var3.readShort();
            }

            byte[] var27 = new byte[var3.readByte()];
            var3.read(var27);
            Class110 var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            var27 = new byte[var3.readByte()];
            var3.read(var27);
            var28 = new Class110(var27);
            this.Field3.addElement(var28);
            if (var3.available() > 0) {
                var3.readByte();

                for (int var29 = 0; var29 < var5; ++var29) {
                    Class188 var30;
                    (var30 = (Class188) this.Field2.elementAt(var29)).Field4 = var3.readByte();
                    var30.Field5 = var3.readByte();
                }
            }

            if (var3.available() > 0) {
                var27 = new byte[var3.readByte()];
                var3.read(var27);
                var28 = new Class110(var27);
                this.Field3.addElement(var28);
                var27 = new byte[var3.readByte()];
                var3.read(var27);
                var28 = new Class110(var27);
                this.Field3.addElement(var28);
                var27 = new byte[var3.readByte()];
                var3.read(var27);
                var28 = new Class110(var27);
                this.Field3.addElement(var28);
                var27 = new byte[var3.readByte()];
                var3.read(var27);
                var28 = new Class110(var27);
                this.Field3.addElement(var28);
            }

            return;
        } catch (Exception var21) {
            var21.printStackTrace();
        } finally {
            try {
                var3.close();
            } catch (Exception var20) {
            }

            try {
                var4.close();
            } catch (Exception var19) {
            }

        }

    }

    public final Class110 Field1(int var1, int var2) {
        return (Class110) this.Field3.elementAt(Field9[var2][var1]);
    }

    public final int Field1(int var1, int var2, int var3) {
        Class110 var4 = (Class110) this.Field3.elementAt(Field9[var3][var2]);
        return var1 < var4.Field1.length ? var4.Field1[var1] : 0;
    }

    public final byte[] Field1(int var1) {
        Class188 var2;
        return (var2 = (Class188) this.Field2.elementAt(var1)) != null ? new byte[]{var2.Field4, var2.Field5} : new byte[2];
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5, Image var6, int var7) {
        if (var6 != null) {
            Class188 var17;
            if ((var17 = (Class188) this.Field2.elementAt(var2)) != null) {
                var17.getClass();
            }

            if (var17.Field3 != null) {
                try {
                    for (int var8 = 0; var8 < var17.Field3.size(); ++var8) {
                        Class349 var9 = (Class349) var17.Field3.elementAt(var8);
                        Class599 var10 = this.Field4[var9.Field3];
                        int var11 = var9.Field1;
                        int var12;
                        if ((var12 = var9.Field2) < -40) {
                            var12 += var7;
                        }

                        int var13 = var10.Field3;
                        int var14 = var10.Field4;
                        short var15 = var10.Field1;
                        short var18 = var10.Field2;
                        if (var15 > var6.getWidth()) {
                            var15 = 0;
                        }

                        if (var18 > var6.getHeight()) {
                            var18 = 0;
                        }

                        if (var15 + var13 > var6.getWidth()) {
                            var13 = var6.getWidth() - var15;
                        }

                        if (var18 + var14 > var6.getHeight()) {
                            var14 = var6.getHeight() - var18;
                        }

                        if (var5 == 2) {
                            var11 = -var11 - var13;
                        }

                        Graphics var10000;
                        Image var10001;
                        short var10002;
                        short var10003;
                        int var10004;
                        int var10005;
                        int var10006;
                        if (var9.Field4 != 1) {
                            var10000 = var1;
                            var10001 = var6;
                            var10002 = var15;
                            var10003 = var18;
                            var10004 = var13;
                            var10005 = var14;
                            var10006 = var5;
                        } else {
                            var10000 = var1;
                            var10001 = var6;
                            var10002 = var15;
                            var10003 = var18;
                            var10004 = var13;
                            var10005 = var14;
                            var10006 = var5 == 2 ? 0 : 2;
                        }

                        var10000.drawRegion(var10001, var10002, var10003, var10004, var10005, var10006, var3 + var11, var4 + var12, 0);
                    }

                } catch (Exception var16) {
                    System.out.println("loi dataeff: " + this.Field8);
                    var16.printStackTrace();
                }
            }
        }
    }

    public final short Field1() {
        return this.Field6;
    }

    public final short Field2() {
        return this.Field7;
    }
}
