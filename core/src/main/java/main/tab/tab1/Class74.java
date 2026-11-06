package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class74 extends Vector {
    public static Class74 Field1 = new Class74();
    public static Class74 Field2 = new Class74();

    public final void Field1() {
        for (int var1 = this.size() - 1; var1 >= 0; --var1) {
            Class173 var2;
            if ((var2 = (Class173) this.elementAt(var1)) != null) {
                var2.Field1();
                if (var2.Field10) {
                    this.removeElementAt(var1);
                }
            }
        }

    }

    public final void Field1(Graphics var1) {
        for (int var2 = 0; var2 < this.size(); ++var2) {
            Class173 var3;
            if ((var3 = (Class173) this.elementAt(var2)) != null) {
                var3.Field1(var1);
            }
        }

    }

    public static void Field1(int var0, int var1, int var2) {
        Field2.addElement(new Class173(var0, var1, var2));
    }

    public static void Field1(Class173 var0) {
        Field2.addElement(var0);
    }

    public static void Field2(int var0, int var1, int var2) {
        Field1.addElement(new Class173(var0, var1, var2));
    }

    public static void Field2(Class173 var0) {
        Field1.addElement(var0);
    }
}
