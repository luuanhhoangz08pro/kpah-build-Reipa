package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

public final class Class250 {
    public int Field1 = -1;
    private byte Field3;
    private int Field4;
    private static Image Field5;
    public boolean Field2 = false;

    static {
        byte[] var10000 = new byte[]{0, 1, 2, 3, 4, 0, 1, 2, 3, 4};
        Field5 = null;
    }

    public static void Field1() {
        Field5 = Class53.Field1("cooldown");
    }

    public final void Field1(int var1, boolean var2) {
        this.Field1 = 1;
        this.Field3 = (byte) var1;
        this.Field2 = var2;
    }

    public final void Field1(Graphics var1, int var2, int var3) {
        try {
            if (this.Field1 == -1) {
                return;
            }

            long var4;
            int var7;
            if (this.Field1 == 1) {
                if (Class379.Field1 != null) {
                    Class379.Field1.Field1(this.Field3, var2 - 2, var3 - 1, 0, 0, var1);
                }

                if ((var4 = System.currentTimeMillis() - Class106.Field19.Field15.Field69[this.Field3]) < Class106.Field19.Field15.Field72[this.Field3]) {
                    var7 = (int) (var4 * 1000L / Class106.Field19.Field15.Field72[this.Field3]);
                    var1.drawRegion(Field5, 0, var7, 20, 20 - var7, 0, var2 - 2, var3 - 2 + var7, 20);
                    return;
                }
            } else {
                Class811.Field5(var1, Class582.Field42[this.Field4].Field5, var2, var3, 0);
                Class21.Field9[3].Field1(var1, String.valueOf(Class106.Field19.Field15.Field121[this.Field4]), var2 + 16, var3 + 9, 1);
                if ((var4 = System.currentTimeMillis() - Class106.Field19.Field15.Field123[this.Field4]) < Class582.Field42[this.Field4].Field3) {
                    var7 = (int) (var4 * 1000L / Class582.Field42[this.Field4].Field3);
                    var1.drawRegion(Field5, 0, var7, 20, 20 - var7, 0, var2 - 2, var3 - 2 + var7, 20);
                    return;
                }
            }
        } catch (Exception var6) {
            (new StringBuffer("ERROR QUICKSLOT ")).append(var6.toString()).toString();
        }

    }

    public final byte Field2() {
        return this.Field3;
    }

    public final int Field3() {
        return this.Field4;
    }

    public final void Field1(int var1) {
        this.Field1 = 2;
        this.Field4 = var1;
    }

    public final void Field4() {
        this.Field1 = -1;
    }
}
