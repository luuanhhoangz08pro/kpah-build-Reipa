package main.tab.tab2;

import java.util.Hashtable;

import main.lib.Graphics;

public final class Class48 extends Class678 {
    private static Hashtable Field6 = new Hashtable();
    public short Field1;
    public long Field2 = -1L;
    private byte Field7 = 0;
    public int Field3 = 0;
    public byte Field4 = 0;
    public int Field5 = 2000000000;

    public Class48(int var1) {
        this.Field1 = (short) var1;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        Class323 var4;
        Class176 var5;
        if ((var4 = (Class323) Field6.get(String.valueOf(this.Field1))) != null && (var5 = Class379.Field1((short) (this.Field1 + 8700))) != null && var5.Field1 != null) {
            byte[] var6 = Field2(this.Field1);
            var4.Field1(var1, var6[this.Field7], var2, var3, 0, var5.Field1);
        }

    }

    public static void Field1(byte[][] var0) {
        for (int var1 = 0; var1 < var0.length; ++var1) {
            Class323 var2 = new Class323(var0[var1]);
            Field6.put(String.valueOf(var1), var2);
        }

    }

    private static byte[] Field2(int var0) {
        Class323 var1;
        return (var1 = (Class323) Field6.get(String.valueOf(var0))) != null ? var1.Field1 : null;
    }

    public final boolean Field4() {
        if (this.Field2 == -1L) {
            return false;
        } else {
            return System.currentTimeMillis() - this.Field2 >= 0L && this.Field7 == 0;
        }
    }

    public final void Field2() {
        try {
            byte[] var1;
            if ((var1 = Field2(this.Field1)) != null) {
                this.Field7 = (byte) ((this.Field7 + 1) % var1.length);
                if (this.Field7 >= var1.length / 2 && this.Field3 > 0) {
                    Class106.Field19.Field1("-" + this.Field3, 0, super.Field193, super.Field194 - 15, 1, -2);
                    this.Field3 = 0;
                }
            }
        } catch (Exception var2) {
        }

        if (this.Field4()) {
            super.Field187 = true;
        }

    }

    public final void Field1(Graphics var1) {
        Class323 var2;
        Class176 var3;
        if ((var2 = (Class323) Field6.get(String.valueOf(this.Field1))) != null && (var3 = Class379.Field1((short) (this.Field1 + 8700))) != null && var3.Field1 != null) {
            byte[] var4 = Field2(this.Field1);
            var2.Field1(var1, var4[this.Field7], super.Field193, super.Field194, 0, var3.Field1);
        }

    }

    public final void Field1(short var1, short var2) {
    }
}
