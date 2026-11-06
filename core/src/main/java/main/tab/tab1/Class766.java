package main.tab.tab1;

import main.lib.Graphics;

public final class Class766 {
    public byte Field1;
    public byte Field2 = 1;
    public int Field3;
    public String Field4;
    public String[] Field5;

    public final void Field1(Graphics var1, int var2, int var3) {
        try {
            switch (this.Field1) {
                case 3:
                    Class798 var4 = Class804.Field2(this.Field3);
                    Class381.Field1(var1, var4.Field8, var2, var3);
                    return;
                case 4:
                    Class804.Field5(var1, Class585.Field42[this.Field3].Field5, var2, var3, 3);
                    return;
                case 6:
                    Class804.Field2(var1, Class804.Field1((short) this.Field3).Field12, var2, var3);
                case 5:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                default:
                    return;
                case 12:
                    Class381.Field1(var1, (short) (this.Field3 + 7500), var2, var3);
            }
        } catch (Exception var5) {
            (new StringBuffer(String.valueOf(this.Field1))).append(" ::::ASD ").append(this.Field3).toString();
        }
    }
}
