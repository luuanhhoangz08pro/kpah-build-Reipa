package main.tab.tab1;

import main.lib.Graphics;

public final class Class356 {
    private long Field5;
    public String Field1;
    public boolean Field2;
    public short Field3;
    public short Field4;
    private byte Field6;

    public Class356(short var1, short var2, long var3, String var5, byte var6) {
        this.Field5 = System.currentTimeMillis() + var3 * 1000L;
        this.Field1 = var5;
        this.Field3 = var1;
        this.Field4 = var2;
        this.Field6 = var6;
        if (this.Field6 == 0) {
            this.Field5 = var3;
        }

    }

    public final void Field1(Graphics var1, int var2, int var3) {
        if (this.Field4 == -1) {
            if (this.Field6 != 1) {
                Class21.Field5.Field1(var1, this.Field1, var2 + 1, var3 + 1, 1);
                Class21.Field8.Field1(var1, this.Field1, var2, var3, 1);
                return;
            }

            int var4;
            if ((var4 = (int) ((this.Field5 - System.currentTimeMillis()) / 1000L)) > 0) {
                Class21.Field5.Field1(var1, this.Field1 + " : " + Field1(var4), var2 - 5, var3 + 1, 1);
                Class21.Field8.Field1(var1, this.Field1 + " : " + Field1(var4), var2 - 4, var3, 1);
                return;
            }
        } else {
            Class172 var7;
            if ((var7 = Class381.Field1(this.Field4)) != null && var7.Field1 != null) {
                int var5;
                if (this.Field6 == 0) {
                    var5 = Class21.Field5.Field1(this.Field1 + " : ");
                    var1.drawImage(var7.Field1, var2 - var5 - (var7.Field1.getWidth() << 1), var3 + var7.Field1.getHeight() / 4, 0);
                    Class21.Field5.Field1(var1, this.Field1, var2 - var5 - (var7.Field1.getWidth() << 1) + 1 + var7.Field1.getWidth(), var3 + 1 + var7.Field1.getHeight() / 4, 0);
                    Class21.Field8.Field1(var1, this.Field1, var2 - var5 - (var7.Field1.getWidth() << 1) + var7.Field1.getWidth(), var3 + var7.Field1.getHeight() / 4, 0);
                    return;
                }

                if (this.Field6 == 1) {
                    var5 = (int) ((this.Field5 - System.currentTimeMillis()) / 1000L);
                    int var6 = Class21.Field5.Field1(Field1(var5) + ":");
                    var1.drawImage(var7.Field1, var2 - var6 - (var7.Field1.getWidth() << 1), var3 + var7.Field1.getHeight() / 4, 0);
                    Class21.Field5.Field1(var1, " : " + Field1(var5), var2 - var6 - (var7.Field1.getWidth() << 1) + 1 + var7.Field1.getWidth(), var3 + 1 + var7.Field1.getHeight() / 4, 0);
                    Class21.Field8.Field1(var1, " : " + Field1(var5), var2 - var6 - (var7.Field1.getWidth() << 1) + var7.Field1.getWidth(), var3 + var7.Field1.getHeight() / 4, 0);
                }
            }
        }

    }

    public final void Field1(long var1) {
        this.Field5 = System.currentTimeMillis() + var1 * 1000L;
    }

    public final void Field1() {
        if (this.Field6 == 1 && System.currentTimeMillis() - this.Field5 >= 0L) {
            this.Field2 = true;
        }

    }

    private static String Field1(int var0) {
        int var1 = var0 % 60;
        int var2 = (var0 /= 60) % 60;
        if ((var0 /= 60) > 0) {
            return var0 + ":" + var2;
        } else if (var2 > 0) {
            return var2 + ":" + var1;
        } else {
            return var1 < 0 ? "0:" + var1 : String.valueOf(var1);
        }
    }
}
