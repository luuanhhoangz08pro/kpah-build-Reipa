package main.tab.tab2;

import main.lib.Graphics;

public final class Class258 extends Class678 {
    public int Field1 = 1;
    public byte Field2 = 0;
    public short Field3 = 0;

    public Class258(int var1, int var2, int var3, int var4) {
        this.Field3 = (short) var1;
        super.Field193 = (short) var2;
        super.Field194 = (short) var3;
        this.Field2 = (byte) var4;
        super.Field188 = 11;
        this.Field1 = 1;
    }

    public final void Field1(Graphics var1) {
        Class176 var2;
        if (this.Field3 > -1 && (var2 = Class379.Field1((short) (this.Field2 + 3200))) != null && !var2.Field3) {
            if (this.Field1 == 1) {
                this.Field1 = var2.Field1.getHeight();
            }

            var1.drawImage(var2.Field1, super.Field193, super.Field194, 33);
        }

    }

    public final void Field1(short var1, short var2) {
    }
}
