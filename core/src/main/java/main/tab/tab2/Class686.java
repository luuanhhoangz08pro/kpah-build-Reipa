package main.tab.tab2;

import main.lib.Image;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;

public final class Class686 {
    public int Field1;
    public int Field2;
    public int Field3;
    public int Field4;
    public Image Field5;
    public short Field6;
    long Field7;

    public final void Field1(byte[] var1, int var2) {
        try {
            DataInputStream var5;
            byte[] var3 = new byte[(var5 = new DataInputStream(new ByteArrayInputStream(var1))).readShort()];
            var5.read(var3, 0, var3.length);
            this.Field5 = Image.createImage(var3, 0, var3.length);
            var3 = new byte[var5.readShort()];
            var5.read(var3, 0, var3.length);
            DataInputStream var6 = new DataInputStream(new ByteArrayInputStream(var3));
            this.Field1 = var6.readByte();
            this.Field2 = var6.readByte();
            var6.readUnsignedByte();
            var6.readUnsignedByte();
            var6.readUnsignedByte();
            var6.readUnsignedByte();
            this.Field3 = this.Field5.getWidth();
            this.Field4 = this.Field5.getHeight();
            var5.close();
            var6.close();
        } catch (Exception var4) {
            System.out.println("LOI LOAD CAY TRONG TREEINFO " + var2);
            this.Field5 = null;
            var4.printStackTrace();
        }
    }
}
