package main.tab.tab1;

import java.util.Vector;

import main.lib.Image;

public final class Class662 extends Class435 {
    Image Field6;
    private Vector Field7 = new Vector();

    public Class662(int var1) {
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

    public final void Field1(Class123 var1) {
    }

    public final void Field1(Class359 var1) {
        super.Field1(var1);
        if (var1.Field204 != 0) {
            Class435.Field4(var1);
            if (var1.Field73 % 3 == 0) {
                int var2;
                if (this.Field7.size() > 0) {
                    for (var2 = 0; var2 < this.Field7.size(); ++var2) {
                        Class672 var3 = (Class672) this.Field7.elementAt(var2);

                        for (int var4 = 0; var4 < 6; ++var4) {
                            Class560 var5 = new Class560(this, var3.Field193 - 25 + Class804.Field13(50), var3.Field194 - 25 + Class804.Field13(50));
                            Class74.Field2.addElement(var5);
                        }
                    }
                } else {
                    for (var2 = 0; var2 < 6; ++var2) {
                        Class560 var6 = new Class560(this, var1.Field67.Field193 - 25 + Class804.Field13(50), var1.Field67.Field194 - 25 + Class804.Field13(50));
                        Class74.Field2.addElement(var6);
                    }
                }
            }

            ++var1.Field73;
        }
    }
}
