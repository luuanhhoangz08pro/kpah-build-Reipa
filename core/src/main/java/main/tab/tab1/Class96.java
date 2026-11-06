package main.tab.tab1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public final class Class96 {
    private static Class96 Field12 = new Class96();
    private DataOutputStream Field13;
    public DataInputStream Field1;
    public Class130 Field2;
    private Socket Field14;
    public boolean Field3;
    public boolean Field4;
    private final Class491 Field15 = new Class491(this);
    private Thread Field16;
    public Thread Field5;
    private int Field17;
    public int Field6;
    boolean Field7;
    public byte[] Field8 = null;
    private byte Field18;
    private byte Field19;
    long Field9;
    public static boolean Field10;
    public static int Field11 = 0;

    public static Class96 Field1() {
        return Field12;
    }

    public final boolean Field2() {
        return this.Field3;
    }

    public final void Field1(Class130 var1) {
        this.Field2 = var1;
    }

    public final void Field1(String var1, int p) {
        if (!this.Field3 && !this.Field4) {
            this.Field7 = false;
            this.Field14 = null;
            this.Field16 = new Thread(new Class265(this, var1, p));
            this.Field16.start();
        }
    }

    public final void Field1(Class86 var1) {
        this.Field15.Field1(var1);
    }

    private synchronized void Field2(Class86 var1) {
        byte[] var2 = var1.Field1();

        try {
            byte var5;
            if (this.Field7) {
                var5 = this.Field1(var1.Field1);
                this.Field13.writeByte(var5);
            } else {
                this.Field13.writeByte(var1.Field1);
            }

            if (var2 != null) {
                int var6 = var2.length;
                if (this.Field7) {
                    byte var3 = this.Field1((byte) (var6 >> 8));
                    this.Field13.writeByte(var3);
                    var5 = this.Field1((byte) var6);
                    this.Field13.writeByte(var5);
                } else {
                    this.Field13.writeShort(var6);
                }

                if (this.Field7) {
                    for (int var7 = 0; var7 < var2.length; ++var7) {
                        var2[var7] = this.Field1(var2[var7]);
                    }
                }

                this.Field13.write(var2);
                this.Field17 += 5 + var2.length;
            } else {
                this.Field13.writeShort(0);
                this.Field17 += 5;
            }

            this.Field13.flush();
        } catch (IOException var4) {
            var4.printStackTrace();
        }
    }

    private byte Field1(byte var1) {
        byte[] var10000 = this.Field8;
        byte var10003 = this.Field19;
        this.Field19 = (byte) (var10003 + 1);
        var1 = (byte) (var10000[var10003] & 255 ^ var1 & 255);
        if (this.Field19 >= this.Field8.length) {
            this.Field19 = (byte) (this.Field19 % this.Field8.length);
        }

        return var1;
    }

    public final void Field3() {
        this.Field4();
    }

    private void Field4() {
        this.Field8 = null;
        this.Field18 = 0;
        this.Field19 = 0;

        try {
            this.Field3 = false;
            this.Field4 = false;
            if (this.Field14 != null) {
                this.Field14.close();
                this.Field14 = null;
            }

            if (this.Field13 != null) {
                this.Field13.close();
                this.Field13 = null;
            }

            if (this.Field1 != null) {
                this.Field1.close();
                this.Field1 = null;
            }

            this.Field5 = null;
            System.gc();
        } catch (Exception var1) {
            var1.printStackTrace();
        }
    }

    static Socket Field1(Class96 var0) {
        return var0.Field14;
    }

    static void Field1(Class96 var0, Socket var1) {
        var0.Field14 = var1;
    }

    static void Field1(Class96 var0, DataOutputStream var1) {
        var0.Field13 = var1;
    }

    static Class491 Field2(Class96 var0) {
        return var0.Field15;
    }

    static void Field1(Class96 var0, Class86 var1) {
        var0.Field2(var1);
    }

    static void Field3(Class96 var0) {
        var0.Field4();
    }

    static byte Field1(Class96 var0, byte var1) {
        byte[] var10000 = (var0 = var0).Field8;
        byte var10003 = var0.Field18;
        var0.Field18 = (byte) (var10003 + 1);
        var1 = (byte) (var10000[var10003] & 255 ^ var1 & 255);
        if (var0.Field18 >= var0.Field8.length) {
            var0.Field18 = (byte) (var0.Field18 % var0.Field8.length);
        }

        return var1;
    }
}
