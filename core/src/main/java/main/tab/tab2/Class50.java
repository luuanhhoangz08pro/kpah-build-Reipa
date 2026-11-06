package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;
import main.screen.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.Hashtable;
import java.util.Vector;

public final class Class50 {
    private static Hashtable Field17 = new Hashtable();
    private int Field18 = -1;
    public Image Field1;
    byte Field2;
    byte Field3 = 1;
    byte Field4;
    public byte Field5;
    public byte Field6;
    public byte Field7;
    public byte Field8;
    public byte Field9;
    public byte Field10;
    public byte Field11 = 0;
    public String Field12;
    public byte Field13;
    public byte Field14;
    public boolean Field15 = false;
    public Class257 Field16;
    private Vector Field19 = new Vector();
    private byte[] Field20 = null;

    public final void Field1(int var1, String var2, byte var3, byte var4, byte var5, byte var6, byte var7, byte var8, byte var9, byte var10, byte var11) {
        this.Field18 = var1;
        this.Field12 = var2;
        this.Field2 = var3;
        this.Field3 = var4;
        this.Field4 = var5;
        this.Field5 = var6;
        this.Field6 = var7;
        this.Field7 = var8;
        this.Field8 = var9;
        this.Field9 = var10;
        this.Field10 = var11;
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5, int var6) {
        if (this.Field1 != null) {
            try {
                var1.drawRegion(this.Field1, 0, var6 * this.Field6, this.Field5, this.Field6, 0, var2 - this.Field7, var3 - this.Field8, 0);
            } catch (Exception var7) {
            }
        }

        System.currentTimeMillis();
    }

    public final Vector Field1() {
        try {
            if (this.Field18 > -1) {
                Vector var1;
                if ((var1 = (Vector) Field17.get("" + this.Field14)) != null) {
                    this.Field19 = var1;
                } else {
                    var1 = null;
                    DataInputStream var6;
                    if (this.Field20 != null) {
                        var6 = new DataInputStream(new ByteArrayInputStream(this.Field20));
                    } else {
                        InputStream var2 = Main.instance.getResourceAsStream("/boss/" + this.Field14);
                        var6 = new DataInputStream(var2);
                    }

                    byte var7 = var6.readByte();
                    int var3 = 0;

                    while (true) {
                        if (var3 >= var7) {
                            Field17.put("" + this.Field14, this.Field19);
                            var6.close();
                            break;
                        }

                        byte[] var4 = new byte[var6.readShort()];
                        var6.read(var4, 0, var4.length);
                        this.Field19.addElement(new Class323(var4));
                        ++var3;
                    }
                }
            }

            System.currentTimeMillis();
        } catch (Exception var5) {
        }

        return this.Field19;
    }

    public final void Field2() {
        if (!this.Field15 && this.Field18 > -1) {
            Class261 var10000 = Class261.Field1();
            byte var4 = this.Field14;
            byte var3 = this.Field13;
            int var2 = this.Field18;
            Class261 var1 = var10000;
            Class85 var5 = new Class85((byte) -47);

            try {
                var5.Field3().writeByte(var3);
                var5.Field3().writeByte(var4);
                var5.Field3().writeShort(var2);
            } catch (Exception var6) {
            }

            var1.Field1.Field1(var5);
            this.Field15 = true;
        }

    }

    public final void Field1(byte[] var1) {
        try {
            if ((this.Field13 < 70 || this.Field13 > 88) && this.Field13 != 90 && this.Field13 != 91 && this.Field13 != 92 && this.Field11 != 1) {
                Class53.Field1(var1);
                if (this.Field13 != 39 && this.Field13 != 40) {
                    var1 = Class53.Field1.Field3(this.Field14 + "_h");
                    byte[] var2 = Class53.Field1.Field3("data");
                    this.Field1 = Class811.Field1(var1, var2);
                } else {
                    this.Field16 = new Class257(this.Field14);
                }

                Class53.Field1();
            } else {
                this.Field16 = new Class257(var1);
            }
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        this.Field15 = false;
    }

    public final Image Field1(int var1) {
        return this.Field16 == null ? null : this.Field16.Field1(var1);
    }

    public final void Field2(byte[] var1) {
        try {
            this.Field20 = var1;
            Vector var2;
            if ((var2 = (Vector) Field17.get("" + this.Field14)) != null) {
                this.Field19 = var2;
            } else {
                DataInputStream var6;
                byte var7 = (var6 = new DataInputStream(new ByteArrayInputStream(var1))).readByte();

                for (int var3 = 0; var3 < var7; ++var3) {
                    byte[] var4 = new byte[var6.readShort()];
                    var6.read(var4, 0, var4.length);
                    this.Field19.addElement(new Class323(var4));
                }

                Field17.put("" + this.Field14, this.Field19);
                var6.close();
            }
        } catch (Exception var5) {
        }
    }
}
