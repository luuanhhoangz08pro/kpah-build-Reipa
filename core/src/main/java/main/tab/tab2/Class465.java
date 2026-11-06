package main.tab.tab2;

import main.lib.Graphics;

public final class Class465 extends Class678 {
    public short Field1;
    public short Field2;
    public short Field3;
    public short Field4;
    public byte Field5;
    private byte Field6;

    public Class465() {
        this.Field2 = this.Field3 = 0;
        super.Field188 = 100;
        this.Field6 = 0;
    }

    public final void Field2() {
        Class83 var1;
        if ((var1 = Class69.Field1(this.Field1)) != null) {
            ++this.Field6;
            if (this.Field6 < var1.Field1.length) {
                return;
            }
        }

        this.Field10();
    }

    public final void Field1(Graphics var1) {
        Class83 var2;
        if ((var2 = Class69.Field1(this.Field1)) != null) {
            Class678 var3;
            if (this.Field5 == 0 && (var3 = Class106.Field19.Field3(this.Field4)) != null) {
                super.Field193 = (short) (var3.Field193 + this.Field2);
                super.Field194 = (short) (var3.Field194 + this.Field3);
            }

            byte var4 = this.Field6;
            short var11 = super.Field194;
            short var10 = super.Field193;
            var1 = var1;
            Class83 var9 = var2;
            Class712 var12 = var2.Field4[var2.Field1[var4]];

            for (int var5 = 0; var5 < var12.Field1.length; ++var5) {
                byte var7 = var12.Field3[var5];
                Class83 var6 = var9;

                Class143 var13;
                label31:
                {
                    for (int var8 = 0; var8 < var6.Field2.length; ++var8) {
                        if (var6.Field2[var8].Field3 == var7) {
                            var13 = var6.Field2[var8];
                            break label31;
                        }
                    }

                    var13 = null;
                }

                Class143 var14 = var13;
                var1.drawRegion(var9.Field3, var14.Field4, var14.Field5, var14.Field1, var14.Field2, 0, var10 + var12.Field1[var5], var11 + var12.Field2[var5], 0);
            }
        }

    }

    private void Field10() {
        Class106.Field19.Field10.removeElement(this);
    }

    public final void Field1(short var1, short var2) {
    }
}
