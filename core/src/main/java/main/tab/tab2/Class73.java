package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class73 extends Vector {
    public static Class73 Field1 = new Class73();
    public static Class73 Field2 = new Class73();

    public final void Field1() {
        for (int var1 = this.size() - 1; var1 >= 0; --var1) {
            Class177 var2;
            if ((var2 = (Class177) this.elementAt(var1)) != null) {
                var2.Field1();
                if (var2.Field10) {
                    this.removeElementAt(var1);
                }
            }
        }

    }

    public final void Field1(Graphics var1) {
        for (int var2 = 0; var2 < this.size(); ++var2) {
            Class177 var3;
            if ((var3 = (Class177) this.elementAt(var2)) != null) {
                var3.Field1(var1);
            }
        }

    }

    public static void Field1(int var0, int var1, int var2) {
        Field2.addElement(new Class177(var0, var1, var2));
    }

    public static void Field1(Class177 var0) {
        Field2.addElement(var0);
    }

    public static void Field2(int var0, int var1, int var2) {
        Field1.addElement(new Class177(var0, var1, var2));
    }

    public static void Field2(Class177 var0) {
        Field1.addElement(var0);
    }
}
