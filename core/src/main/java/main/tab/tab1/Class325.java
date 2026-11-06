package main.tab.tab1;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.util.Vector;

import main.lib.Graphics;

import main.lib.Image;

public final class Class325 {
    private Vector Field2 = new Vector();
    private Vector Field3 = new Vector();
    private Class599[] Field4;
    public byte[] Field1;
    private static byte[] Field5 = new byte[]{0, 0, 1, 2, 3, 1, 1, 1, 1};

    public Class325(byte[] var1) {
        try {
            DataInputStream var9;
            byte var2 = (var9 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();
            this.Field4 = new Class599[var2];

            for (int var3 = 0; var3 < var2; ++var3) {
                this.Field4[var3] = new Class599(var9.readUnsignedByte(), var9.readUnsignedByte(), var9.readUnsignedByte(), var9.readUnsignedByte(), var9.readUnsignedByte());
            }

            short var12 = var9.readShort();

            for (int var10 = 0; var10 < var12; ++var10) {
                byte var4 = var9.readByte();
                Vector var5 = new Vector();

                for (int var6 = 0; var6 < var4; ++var6) {
                    Class349 var7 = new Class349(var9.readShort(), var9.readShort(), var9.readByte());
                    var5.addElement(var7);
                }

                this.Field2.addElement(new Class188(var5));
            }

            short var11 = var9.readShort();
            this.Field1 = new byte[var11];

            for (int var13 = 0; var13 < var11; ++var13) {
                this.Field1[var13] = (byte) var9.readShort();
            }

            var9.readByte();
            var9.readByte();
            byte[] var14 = new byte[var9.readByte()];
            var9.read(var14);
            Class110 var15 = new Class110(var14);
            this.Field3.addElement(var15);
            var14 = new byte[var9.readByte()];
            var9.read(var14);
            var15 = new Class110(var14);
            this.Field3.addElement(var15);
            var14 = new byte[var9.readByte()];
            var9.read(var14);
            var15 = new Class110(var14);
            this.Field3.addElement(var15);
            var14 = new byte[var9.readByte()];
            var9.read(var14);
            var15 = new Class110(var14);
            this.Field3.addElement(var15);
        } catch (Exception var8) {
            var8.printStackTrace();
        }
    }

    public final Class110 Field1(int var1) {
        return (Class110) this.Field3.elementAt(Field5[var1]);
    }

    public final int Field1(int var1, int var2) {
        Class110 var3 = (Class110) this.Field3.elementAt(Field5[var2]);
        return var1 < var3.Field1.length ? var3.Field1[var1] : 0;
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5, Image var6) {
        if (var6 != null) {
            Class188 var12 = (Class188) this.Field2.elementAt(var2);

            try {
                for (int var7 = 0; var7 < var12.Field1.size(); ++var7) {
                    Class349 var8 = (Class349) var12.Field1.elementAt(var7);
                    Class599 var9 = this.Field4[var8.Field3];
                    int var10 = var8.Field1;
                    if (var5 == 2) {
                        var10 = -var10 - var9.Field3;
                    }

                    var1.drawRegion(var6, var9.Field1, var9.Field2, var9.Field3, var9.Field4, var5, var3 + var10, var4 + var8.Field2, 0);
                }

            } catch (Exception var11) {
                var11.printStackTrace();
            }
        }
    }
}
