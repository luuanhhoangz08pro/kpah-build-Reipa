package main.tab.tab1;

import main.lib.Image;
import main.screen.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public final class Class53 {
    public static Class53 Field1;
    private String[] Field3;
    private int[] Field4;
    private int[] Field5;
    private byte[] Field6;
    private int Field7;
    private int Field8;
    private String Field9;
    private byte[] Field10 = new byte[]{78, 103, 117, 121, 101, 110, 86, 97, 110, 77, 105, 110, 104};
    private int Field11;
    public static final String[] Field2 = new String[]{"/c/leg/", "/c/body/", "/c/head/", "/c/hat/", "/c/coat/"};
    private DataInputStream Field12;

    public Class53() {
        this.Field11 = this.Field10.length;
    }

    public static void Field1() {
        if (Field1 != null) {
            Field1.Field2();
        }

        Field1 = null;
        System.gc();
    }

    public Class53(String var1, byte[] var2) {
        this.Field11 = this.Field10.length;
        int var4 = 0;
        int var5 = 0;
        this.Field9 = var1;
        this.Field8 = 0;
        if (var2 == null) {
            this.Field12 = new DataInputStream(Main.instance.getResourceAsStream(this.Field9));
        } else {
            this.Field12 = new DataInputStream(new ByteArrayInputStream(var2));
        }

        if (this.Field12 == null) {
            Field1 = null;
        } else {
            try {
                this.Field7 = this.Field12.readUnsignedByte();
                ++this.Field8;
                this.Field3 = new String[this.Field7];
                this.Field4 = new int[this.Field7];
                this.Field5 = new int[this.Field7];

                for (int var6 = 0; var6 < this.Field7; ++var6) {
                    byte var8;
                    byte[] var3 = new byte[var8 = this.Field12.readByte()];
                    this.Field12.read(var3);
                    this.Field2(var3);
                    this.Field3[var6] = new String(var3);
                    this.Field4[var6] = var4;
                    this.Field5[var6] = this.Field12.readUnsignedShort();
                    var4 += this.Field5[var6];
                    var5 += this.Field5[var6];
                    this.Field8 += var8 + 3;
                }

                this.Field6 = new byte[var5];
                this.Field12.readFully(this.Field6);
                this.Field2(this.Field6);
            } catch (Exception var7) {
                (new StringBuffer(String.valueOf(var1))).append(" Error in fileback constructor > ").append(var7.toString()).toString();
            }

            this.Field2();
        }
    }

    public static Image Field1(String var0) {
        return Field1.Field4(var0 + ".png");
    }

    public static void Field2(String var0) {
        Field1 = new Class53(var0, (byte[]) null);
    }

    public static void Field1(byte[] var0) {
        Field1 = new Class53("", var0);
    }

    private void Field2(byte[] var1) {
        int var2 = var1.length;

        for (int var3 = 0; var3 < var2; ++var3) {
            var1[var3] ^= this.Field10[var3 % this.Field11];
        }

    }

    public final void Field2() {
        try {
            if (this.Field12 != null) {
                this.Field12.close();
                return;
            }
        } catch (IOException var1) {
        }

    }

    public final byte[] Field3(String var1) {
        for (int var2 = 0; var2 < this.Field7; ++var2) {
            if (this.Field3[var2].compareTo(var1) == 0) {
                byte[] var3 = new byte[this.Field5[var2]];
                System.arraycopy(this.Field6, this.Field4[var2], var3, 0, this.Field5[var2]);
                return var3;
            }
        }

        return null;
    }

    public final Image Field4(String var1) {
        for (int var2 = 0; var2 < this.Field7; ++var2) {
            if (this.Field3[var2].compareTo(var1) == 0) {
                return Image.createImage(this.Field6, this.Field4[var2], this.Field5[var2]);
            }
        }

        return null;
    }

    public final InputStream Field5(String var1) {
        for (int var2 = 0; var2 < this.Field7; ++var2) {
            if (this.Field3[var2].compareTo(var1) == 0) {
                byte[] var3 = new byte[this.Field5[var2]];
                System.arraycopy(this.Field6, this.Field4[var2], var3, 0, this.Field5[var2]);
                return new ByteArrayInputStream(var3);
            }
        }

        return null;
    }
}
