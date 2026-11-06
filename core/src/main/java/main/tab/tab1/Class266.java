package main.tab.tab1;

import main.lib.Graphics;

public class Class266 extends Class672 {
    public int Field1;

    public Class266(int var1, int var2, int var3) {
        super.Field193 = (short) var1;
        super.Field194 = (short) var2;
        this.Field1 = var3;
        super.Field188 = 13;
    }

    public void Field1(Graphics var1) {
        Class680 var2 = Class804.Field8(this.Field1);
        int var3 = (super.Field193 << 4) + var2.Field1;
        int var5 = (super.Field194 << 4) + var2.Field2;
        if (var3 >= Class63.Field8 - var2.Field3) {
            if (var5 >= Class63.Field9 - var2.Field4) {
                if (var3 <= Class63.Field8 + Class63.Field25) {
                    if (var5 <= Class63.Field9 + Class63.Field26) {
                        Class680 var10000 = var2;
                        int var10002 = var3;
                        var3 = var5;
                        int var7 = var10002;
                        Class680 var6 = var10000;
                        Class680 var4 = var10000;
                        if (System.currentTimeMillis() - var4.Field7 > 180000L && var4.Field5 == null) {
                            Class263.Field1().Field4(var4.Field6, 0, 0);
                        }

                        var4.Field7 = System.currentTimeMillis();
                        if (var4.Field5 != null) {
                            var1.drawImage(var6.Field5, var7, var3, 0);
                        }

                    }
                }
            }
        }
    }

    public final int c_() {
        boolean var1 = false;
        return (super.Field194 << 4) + Class804.Field11(this.Field1) + Class804.Field9(this.Field1);
    }

    public final void Field1(short var1, short var2) {
    }
}
