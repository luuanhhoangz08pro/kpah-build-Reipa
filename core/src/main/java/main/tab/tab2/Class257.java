package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class Class257 {
    private Image[] Field6 = new Image[1];
    public byte[] Field1;
    public byte[] Field2;
    public byte[] Field3;
    public byte[] Field4;
    public byte[] Field5;
    private short[] Field7;
    private short[] Field8;

    public Class257() {
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5, int var6, int var7) {
        var1.drawRegion(this.Field6[0], this.Field2[var4], this.Field3[var4], this.Field4[var4], this.Field5[var4], var5, var2 + this.Field7[var4] * var6, var3 + this.Field8[var4], 3);
    }

    public Class257(int var1) {
        try {
            byte[] var5 = Class53.Field1.Field3(var1 + "_h");
            byte[] var2 = Class53.Field1.Field3("data");
            this.Field6[0] = Class811.Field1(var5, var2);
            var5 = Class53.Field1.Field3("pos");
            ByteArrayInputStream var6 = new ByteArrayInputStream(var5);
            DataInputStream var7;
            byte var8 = (var7 = new DataInputStream(var6)).readByte();
            this.Field1 = new byte[var8];
            this.Field2 = new byte[var8];
            this.Field3 = new byte[var8];
            this.Field4 = new byte[var8];
            this.Field5 = new byte[var8];
            this.Field7 = new short[var8];
            this.Field8 = new short[var8];

            for (int var3 = 0; var3 < var8; ++var3) {
                this.Field1[var3] = var7.readByte();
                this.Field2[var3] = var7.readByte();
                this.Field3[var3] = var7.readByte();
                this.Field4[var3] = var7.readByte();
                this.Field5[var3] = var7.readByte();
                this.Field7[var3] = var7.readByte();
                this.Field8[var3] = var7.readByte();
            }

        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public Class257(byte[] var1) {
        try {
            DataInputStream var6 = new DataInputStream(new ByteArrayInputStream(var1));
            this.Field6 = new Image[var6.readByte()];

            for (int var2 = 0; var2 < this.Field6.length; ++var2) {
                short var3;
                byte[] var4 = new byte[var3 = var6.readShort()];
                var6.read(var4);
                this.Field6[var2] = Image.createImage(var4, 0, var3);
            }

        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }

    public final Image Field1(int var1) {
        return this.Field6 == null ? null : this.Field6[var1];
    }
}
