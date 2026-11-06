package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

public final class Class831 {
    private Vector Field1 = new Vector();
    private Vector Field2 = new Vector();
    private Class596[] Field3;
    private byte[] Field4;
    private String Field5 = "";
    private static byte[][] Field6 = new byte[][]{{0, 0, 1, 2, 3, 1, 1, 1, 1, 1, 1, 1, 1}, {4, 4, 5, 6, 7, 5, 5, 5, 5, 5, 5, 5, 5}};

    public Class831(byte[] var1) {
        this.Field1(var1);
    }

    private void Field1(byte[] var1) {
        boolean var2 = false;

        try {
            DataInputStream var10;
            byte var11 = (var10 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.Field3 = new Class596[var11];

            int var3;
            for (var3 = 0; var3 < var11; ++var3) {
                this.Field3[var3] = new Class596(var10.readUnsignedByte(), var10.readUnsignedByte(), var10.readUnsignedByte(), var10.readUnsignedByte(), var10.readUnsignedByte());
            }

            short var12 = var10.readShort();

            for (var3 = 0; var3 < var12; ++var3) {
                byte var4 = var10.readByte();
                Vector var5 = new Vector();
                Vector var6 = new Vector();

                for (int var7 = 0; var7 < var4; ++var7) {
                    Class347 var8;
                    (var8 = new Class347(var10.readShort(), var10.readShort(), var10.readByte())).Field4 = var10.readByte();
                    var8.Field5 = var10.readByte();
                    if (var8.Field5 == 0) {
                        var5.addElement(var8);
                    } else {
                        var6.addElement(var8);
                    }
                }

                this.Field1.addElement(new Class192(var5, var6));
            }

            var12 = var10.readShort();
            this.Field4 = new byte[var12];

            for (var3 = 0; var3 < var12; ++var3) {
                this.Field4[var3] = (byte) var10.readShort();
            }

            byte[] var14 = new byte[var10.readByte()];
            var10.read(var14);
            Class113 var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
            var14 = new byte[var10.readByte()];
            var10.read(var14);
            var13 = new Class113(var14);
            this.Field2.addElement(var13);
        } catch (Exception var9) {
            var9.printStackTrace();
        }
    }

    public final Class113 Field1(int var1, int var2) {
        return (Class113) this.Field2.elementAt(Field6[var2][var1]);
    }

    public final int Field1(int var1, int var2, int var3) {
        Class113 var4 = (Class113) this.Field2.elementAt(Field6[var3][var2]);
        return var1 < var4.Field1.length ? var4.Field1[var1] : 0;
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5, Image var6) {
        if (var6 != null) {
            Class192 var15 = (Class192) this.Field1.elementAt(var2);

            try {
                var15 = var15;
                Vector var7 = new Vector();

                int var8;
                for (var8 = 0; var8 < var15.Field2.size(); ++var8) {
                    var7.addElement(var15.Field2.elementAt(var8));
                }

                for (var8 = 0; var8 < var15.Field1.size(); ++var8) {
                    var7.addElement(var15.Field1.elementAt(var8));
                }

                Vector var16 = var7;

                for (int var17 = 0; var17 < var16.size(); ++var17) {
                    Class347 var18 = (Class347) var16.elementAt(var17);
                    Class596 var9 = this.Field3[var18.Field3];
                    int var10 = var18.Field1;
                    int var11 = var9.Field3;
                    int var12 = var9.Field4;
                    short var13 = var9.Field1;
                    short var19 = var9.Field2;
                    if (var13 > var6.getWidth()) {
                        var13 = 0;
                    }

                    if (var19 > var6.getHeight()) {
                        var19 = 0;
                    }

                    if (var13 + var11 > var6.getWidth()) {
                        var11 = var6.getWidth() - var13;
                    }

                    if (var19 + var12 > var6.getHeight()) {
                        var12 = var6.getHeight() - var19;
                    }

                    if (var5 == 2) {
                        var10 = -var10 - var11;
                    }

                    Graphics var10000;
                    Image var10001;
                    short var10002;
                    short var10003;
                    int var10004;
                    int var10005;
                    int var10006;
                    if (var18.Field4 != 1) {
                        var10000 = var1;
                        var10001 = var6;
                        var10002 = var13;
                        var10003 = var19;
                        var10004 = var11;
                        var10005 = var12;
                        var10006 = var5;
                    } else {
                        var10000 = var1;
                        var10001 = var6;
                        var10002 = var13;
                        var10003 = var19;
                        var10004 = var11;
                        var10005 = var12;
                        var10006 = var5 == 2 ? 0 : 2;
                    }

                    var10000.drawRegion(var10001, var10002, var10003, var10004, var10005, var10006, var3 + var10, var4 + var18.Field2, 0);
                }

            } catch (Exception var14) {
                System.out.println("loi dataeff: " + this.Field5);
                var14.printStackTrace();
            }
        }
    }
}
