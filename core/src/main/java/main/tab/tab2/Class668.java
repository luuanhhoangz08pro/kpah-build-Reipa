package main.tab.tab2;

import main.lib.Image;

import java.util.Vector;

public final class Class668 extends Class432 {
    Image Field6;
    private Vector Field7 = new Vector();

    public Class668(int var1) {
        Class53.Field2("/skillpublic.sh");
        this.Field6 = Class53.Field1("muabang");
        Class53.Field1();
    }

    public final void Field1(Vector var1) {
        this.Field7 = var1;
    }

    public final void Field2(Vector var1) {
        this.Field7 = var1;
    }

    public final void Field1(Class126 var1) {
    }

    public final void Field1(Class357 var1) {
        super.Field1(var1);
        if (var1.Field204 != 0) {
            Class432.Field4(var1);
            if (var1.Field73 % 3 == 0) {
                int var2;
                if (this.Field7.size() > 0) {
                    for (var2 = 0; var2 < this.Field7.size(); ++var2) {
                        Class678 var3 = (Class678) this.Field7.elementAt(var2);

                        for (int var4 = 0; var4 < 6; ++var4) {
                            Class557 var5 = new Class557(this, var3.Field193 - 25 + Class811.Field13(50), var3.Field194 - 25 + Class811.Field13(50));
                            Class73.Field2.addElement(var5);
                        }
                    }
                } else {
                    for (var2 = 0; var2 < 6; ++var2) {
                        Class557 var6 = new Class557(this, var1.Field67.Field193 - 25 + Class811.Field13(50), var1.Field67.Field194 - 25 + Class811.Field13(50));
                        Class73.Field2.addElement(var6);
                    }
                }
            }

            ++var1.Field73;
        }
    }
}
