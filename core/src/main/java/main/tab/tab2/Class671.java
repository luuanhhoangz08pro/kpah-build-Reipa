package main.tab.tab2;

import main.lib.Graphics;

public abstract class Class671 extends Class131 {
    public static short Field108 = 17;
    public static final int Field109;

    static {
        Field109 = Class21.Field10[0].Field2() + 6;
    }

    public void Field2() {
    }

    public void Field1() {
        Class106.Field17 = this;
    }

    public void Field1(Class671 var1) {
        Class106.Field17 = this;
    }

    public boolean Field1(int var1) {
        return false;
    }

    public void Field1(Graphics var1) {
        Class106.Field1(var1);
        var1.drawImage(Class811.Field31, 0, Class106.Field14 + 3, 36);
        if (Class106.Field17 == this && Class106.Field23 == null && !Class106.Field21.Field1) {
            super.Field1(var1);
        }

    }

    public void Field4() {
    }

    public void Field3() {
        if (Class106.Field17 == this) {
            super.Field3();
        }

    }

    public void a_(int var1, int var2, int var3) {
    }
}
