package main.tab.tab2;

import main.lib.Graphics;

public final class Class685 extends Class678 {
    public Class258 Field1;
    private int Field3 = 0;
    private int Field4;
    private long Field5 = 0L;
    private byte Field6;
    private byte Field7;
    public boolean Field2;
    private String Field8 = "";

    public Class685(int var1, int var2, int var3, int var4, String var5, int var6, int var7, boolean var8, byte var9, byte var10) {
        super.Field189 = (short) var1;
        super.Field193 = (short) var3;
        super.Field194 = (short) var4;
        super.Field188 = 10;
        super.Field210 = var5;
        this.Field3 = var7 / 60;
        this.Field4 = var7 % 60;
        this.Field1 = null;
        this.Field2 = var8;
        this.Field5 = System.currentTimeMillis();
        this.Field7 = var10;
        if (var2 > -1) {
            this.Field1 = new Class258(var2, var3 + 16, var4 + 16 + var9, var6);
            Class106.Field19.Field10.addElement(this.Field1);
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, String var5, int var6, int var7, boolean var8, byte var9, byte var10) {
        super.Field189 = (short) var1;
        super.Field193 = (short) var3;
        super.Field194 = (short) var4;
        super.Field188 = 10;
        super.Field210 = var5;
        this.Field3 = var7 / 60;
        this.Field4 = var7 % 60;
        this.Field2 = var8;
        this.Field5 = System.currentTimeMillis();
        this.Field7 = var10;
        if (var2 > -1) {
            if (this.Field1 != null) {
                this.Field1.Field1 = 1;
                this.Field1.Field3 = (short) var2;
                this.Field1.Field2 = (byte) var6;
            } else {
                this.Field1 = new Class258(var2, var3 + 16, var4 + 16 + var9, var6);
                Class106.Field19.Field10.addElement(this.Field1);
            }
        } else {
            if (this.Field1 != null) {
                Class106.Field19.Field10.removeElement(this.Field1);
                this.Field1 = null;
            }

        }
    }

    public final void Field1(Graphics var1) {
        if (Class811.Field24 != null) {
            if (this.Field2) {
                if (this.Field1 == null) {
                    var1.drawImage(Class811.Field24[0], super.Field193, super.Field194, 0);
                } else {
                    var1.drawImage(Class811.Field24[2], super.Field193, super.Field194, 0);
                }
            } else {
                var1.drawImage(Class811.Field24[1], super.Field193, super.Field194, 0);
            }
        }

        if (super.Field206) {
            if (this.Field3 > -1 && this.Field1 != null) {
                int var2 = Class21.Field10[this.Field7].Field1(this.Field8);
                var1.setColor(1593912);
                var1.fillRect(super.Field193 + 16 - var2 / 2 - 3, super.Field194 - (this.Field1 == null ? 8 : this.Field1.Field1 + 15), var2 + 5, 14);
                var1.setColor(16772608);
                var1.drawRect(super.Field193 + 16 - var2 / 2 - 3, super.Field194 - (this.Field1 == null ? 8 : this.Field1.Field1 + 15), var2 + 5, 14);
                Class21.Field10[this.Field7].Field1(var1, this.Field8, super.Field193 + 16, super.Field194 - (this.Field1 == null ? 8 : this.Field1.Field1 + 15), 2);
            }

            if (Class519.Field3 != null) {
                Class519.Field3.Field1(0, super.Field193 + 16, super.Field194 - (this.Field1 == null ? 8 : this.Field1.Field1) + Class106.Field12 % 8, 0, 33, var1);
            }
        }

    }

    public final void Field2() {
        this.Field6 = (byte) ((int) ((long) this.Field4 - (System.currentTimeMillis() - this.Field5) / 1000L));
        if (this.Field6 <= 0) {
            --this.Field3;
            this.Field5 = System.currentTimeMillis();
            this.Field4 = 59;
        }

        if (super.Field206 && this.Field3 > -1 && this.Field1 != null) {
            this.Field8 = (this.Field3 < 10 ? "0" + this.Field3 : String.valueOf(this.Field3)) + " : " + (this.Field6 < 10 ? "0" + this.Field6 : String.valueOf(this.Field6));
        }

        super.Field2();
    }

    public final void Field1(short var1, short var2) {
    }
}
