package main.tab.tab1;

import main.tab.tab1.screen.MainTab;

import java.io.IOException;
import java.util.Vector;

public final class Class263 extends Class384 {
    public Class96 Field1;
    private static Class263 Field2;

    public static Class263 Field1() {
        if (Field2 == null) {
            Field2 = new Class263();
        }

        return Field2;
    }

    private static Class86 Field2(byte var0) {
        return new Class86(var0);
    }

    public final void Field1(int var1, int var2) {
        Class86 var3 = Field2((byte) -25);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field2(int var1, int var2) {
        Class86 var3 = Field2((byte) 109);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field1(byte var1, byte var2) {
        Class86 var3 = Field2((byte) -62);

        try {
            var3.Field3().writeByte(var1);
            if (var2 != 100) {
                var3.Field3().writeByte(var2);
            }

            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field1(byte var1) {
        Class86 var2 = Field2((byte) 108);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    public final void Field1(int var1) {
        Class86 var2 = Field2((byte) 104);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
        } catch (Exception var3) {
        }
    }

    public final void Field1(int var1, String var2, String var3, String var4) {
        Class86 var5 = Field2((byte) 107);

        try {
            var5.Field3().writeByte(var1);
            var5.Field3().writeUTF(var2);
            var5.Field3().writeUTF(var3);
            var5.Field3().writeUTF(var4);
            this.Field1.Field1(var5);
        } catch (Exception var6) {
        }
    }

    public final void Field3(int var1, int var2) {
        Class86 var3 = Field2((byte) 94);

        try {
            var3.Field3().writeByte(0);
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (Exception var4) {
        }
    }

    public final void Field1(int var1, int var2, int var3) {
        Class86 var4 = Field2((byte) 94);

        try {
            var4.Field3().writeByte(1);
            var4.Field3().writeByte(var1);
            var4.Field3().writeByte(var2);
            var4.Field3().writeShort(var3);
            this.Field1.Field1(var4);
            var4.Field4();
        } catch (Exception var5) {
        }
    }

    public final void Field1(int var1, int var2, Class537 var3, short var4, int var5, boolean var6) {
        Class86 var7 = Field2((byte) 92);

        try {
            var7.Field3().writeBoolean(var6);
            var7.Field3().writeByte(var1);
            var7.Field3().writeByte(var2);
            if (var3 != null) {
                var7.Field3().writeShort(var3.Field9);
            } else {
                var7.Field3().writeShort(var4);
            }

            var7.Field3().writeInt(var5);
            if (var3 != null) {
                var7.Field3().writeByte(0);
            } else {
                var7.Field3().writeByte(1);
            }

            this.Field1.Field1(var7);
            var7.Field4();
        } catch (Exception var8) {
        }
    }

    public final void Field1(int var1, int var2, int var3, int var4, int var5) {
        Class86 var6 = Field2((byte) 95);

        try {
            var6.Field3().writeByte(var2);
            var6.Field3().writeByte(var3);
            var6.Field3().writeShort(var1);
            var6.Field3().writeShort(var4);
            var6.Field3().writeByte(var5);
            this.Field1.Field1(var6);
            var6.Field4();
        } catch (Exception var7) {
        }
    }

    public final void Field4(int var1, int var2) {
        Class86 var4 = Field2((byte) 100);

        try {
            var4.Field3().writeByte(0);
            var4.Field3().writeShort(var2);
            this.Field1.Field1(var4);
            var4.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field2(int var1) {
        Class86 var2 = Field2((byte) 86);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field3(int var1) {
        Class86 var2 = Field2((byte) 85);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field2() {
        Class86 var1 = Field2((byte) 82);

        try {
            this.Field1.Field1(var1);
        } catch (Exception var2) {
        }
    }

    public final void Field1(byte var1, int var2) {
        Class86 var3 = Field2((byte) 79);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeShort(var2);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field1(short var1) {
        Class86 var2 = Field2((byte) 75);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
        } catch (Exception var3) {
        }
    }

    public final void Field1(short var1, byte var2) {
        Class86 var3 = Field2((byte) 76);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    public final void Field4(int var1) {
        Class86 var2 = Field2((byte) 72);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
        } catch (Exception var3) {
        }
    }

    public final void Field5(int var1) {
        Class86 var3 = Field2((byte) 71);

        try {
            var3.Field3().writeByte(0);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (IOException var2) {
        }
    }

    public final void Field6(int var1) {
        Class86 var2 = Field2((byte) 77);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field1(String var1, String var2, String var3) {
        Class86 var4 = Field2((byte) 1);

        try {
            var4.Field3().writeUTF(var1);
            var4.Field3().writeUTF(var2);
            var4.Field3().writeUTF(var3);
            var4.Field3().writeUTF("j2me");
            MainTab.Field3.trim();
            var4.Field3().writeUTF(MainTab.Field3);
            var4.Field3().writeUTF(MainTab.Field4);
            var4.Field3().writeUTF(MainTab.Field5);
            var4.Field3().writeByte(0);
            var4.Field3().writeShort(Class105.Field13);
            var4.Field3().writeByte(Class105.Field2 ? -1 : 0);
            int var6;
            var4.Field3().writeByte((var6 = Class767.Field1) > Class767.Field5.length - 1 ? 0 : Class767.Field5[var6]);
            this.Field1.Field1(var4);
            var4.Field4();
        } catch (IOException var5) {
        }
    }

    public final void Field3() {
        Class86 var1 = Field2((byte) 67);

        try {
            var1.Field3().writeByte(1);
            this.Field1.Field1(var1);
            var1.Field4();
        } catch (Exception var2) {
        }
    }

    public final void Field7(int var1) {
        Class86 var2 = Field2((byte) 48);

        try {
            var2.Field3().writeInt(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field5(int var1, int var2) {
        Class86 var3 = Field2((byte) 49);

        try {
            var3.Field3().writeByte(var2);
            var3.Field3().writeShort(var1);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (Exception var4) {
        }
    }

    public final void Field8(int var1) {
        Class86 var2 = Field2((byte) 66);

        try {
            var2.Field3().writeByte(0);
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field6(int var1, int var2) {
        Class86 var3 = Field2((byte) 101);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field7(int var1, int var2) {
        Class86 var3 = Field2((byte) 66);

        try {
            var3.Field3().writeByte(var2);
            var3.Field3().writeShort(var1);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (Exception var4) {
        }
    }

    public final void Field9(int var1) {
        Class86 var2 = Field2((byte) 66);

        try {
            var2.Field3().writeByte(4);
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field10(int var1) {
        Class86 var2 = Field2((byte) 66);

        try {
            var2.Field3().writeByte(3);
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var3) {
        }
    }

    public final void Field1(short var1, int var2, int var3) {
        Class86 var4 = Field2((byte) 66);

        try {
            var4.Field3().writeByte(2);
            var4.Field3().writeByte(var2);
            if (var2 == 0) {
                var4.Field3().writeShort(var1);
            } else if (var2 == 1) {
                var4.Field3().writeByte(var1);
                var4.Field3().writeShort(var3);
            } else if (var2 == 2) {
                var4.Field3().writeByte(var1);
            }

            this.Field1.Field1(var4);
            var4.Field4();
        } catch (Exception var5) {
        }
    }

    public final void Field1(int var1, byte var2) {
        Class86 var3 = Field2((byte) 50);

        try {
            var3.Field3().writeByte(var2);
            var3.Field3().writeShort(var1);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (Exception var4) {
        }
    }

    public final void Field8(int var1, int var2) {
        if (!Class458.Field13) {
            if (!Class458.Field1(var1, var2, 2) && var2 / 16 * Class458.Field1 + var1 / 16 < Class458.Field7.length) {
                Class86 var3 = Field2((byte) 4);

                try {
                    var3.Field3().writeShort(var1);
                    var3.Field3().writeShort(var2);
                } catch (Exception var4) {
                }

                this.Field1.Field1(var3);
                var3.Field4();
            }
        }
    }

    public final void Field2(short var1) {
        Class86 var2 = Field2((byte) 5);

        try {
            var2.Field3().writeShort(var1);
        } catch (Exception var3) {
        }

        this.Field1.Field1(var2);
        var2.Field4();
    }

    public final void Field2(short var1, byte var2) {
        Class86 var3 = Field2((byte) 9);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
        } catch (Exception var4) {
        }

        this.Field1.Field1(var3);
        var3.Field4();
    }

    public final void Field1(byte var1, Vector var2) {
        Class86 var3 = Field2((byte) 106);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2.size());

            for (int var5 = 0; var5 < var2.size(); ++var5) {
                var3.Field3().writeShort(((Class672) var2.elementAt(var5)).Field189);
            }
        } catch (Exception var4) {
        }

        this.Field1.Field1(var3);
        var3.Field4();
    }

    public final void Field3(short var1, byte var2) {
        Class86 var3 = Field2((byte) 6);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
        } catch (Exception var4) {
        }

        this.Field1.Field1(var3);
        var3.Field4();
    }

    public final void Field1(short var1, byte var2, byte var3, short var4) {
        Class86 var6 = Field2((byte) 51);

        try {
            var6.Field3().writeByte(1);
            var6.Field3().writeShort(var1);
            var6.Field3().writeByte(0);
            var6.Field3().writeByte(var3);
            var6.Field3().writeShort(0);
        } catch (Exception var5) {
        }

        this.Field1.Field1(var6);
        var6.Field4();
    }

    public final void Field3(short var1) {
        Class86 var2 = Field2((byte) 7);

        try {
            var2.Field3().writeShort(var1);
        } catch (Exception var3) {
        }

        this.Field1.Field1(var2);
        var2.Field4();
    }

    public final void Field4() {
        Field2((byte) 11).Field4();
    }

    public final void Field9(int var1, int var2) {
        try {
            Class86 var3;
            (var3 = Field2((byte) 13)).Field3().writeByte(var2);
            var3.Field3().writeInt(var1);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (IOException var4) {
        }
    }

    public final void Field1(String var1, int var2, int var3, int var4, int var5) {
        Class86 var6 = Field2((byte) 14);

        try {
            var6.Field3().writeUTF(var1);
            var6.Field3().writeByte(var2);
            var6.Field3().writeByte(var3);
            var6.Field3().writeByte(var4);
            var6.Field3().writeByte(var5);
            var6.Field3().writeByte(Class767.Field5[Class767.Field1]);
            this.Field1.Field1(var6);
            var6.Field4();
        } catch (IOException var7) {
        }
    }

    public final void Field5() {
        Class86 var1 = Field2((byte) -1);

        try {
            var1.Field3().writeByte(2);
        } catch (Exception var2) {
        }

        this.Field1.Field1(var1);
        var1.Field4();
    }

    public final void Field1(byte var1, short var2) {
        try {
            Class86 var3;
            if (var1 == 3) {
                (var3 = Field2((byte) 18)).Field3().writeShort(var2);
                this.Field1.Field1(var3);
                var3.Field4();
                return;
            }

            if (var1 == 4) {
                (var3 = Field2((byte) 19)).Field3().writeShort(var2);
                this.Field1.Field1(var3);
                var3.Field4();
                return;
            }

            if (var1 == 7 || var1 == 6) {
                (var3 = Field2((byte) -41)).Field3().writeByte(var1);
                var3.Field3().writeShort(var2);
                this.Field1.Field1(var3);
                var3.Field4();
                return;
            }

            if (var1 == 14) {
                (var3 = Field2((byte) -65)).Field3().writeShort(var2);
                this.Field1.Field1(var3);
                return;
            }
        } catch (IOException var4) {
        }

    }

    public final void Field6() {
        Class86 var1 = Field2((byte) 88);

        try {
            this.Field1.Field1(var1);
        } catch (Exception var2) {
        }

        var1.Field4();
    }

    public final void Field7() {
        Class86 var1 = Field2((byte) 81);

        try {
            this.Field1.Field1(var1);
            var1.Field4();
        } catch (Exception var2) {
        }
    }

    public final void Field1(short var1, short var2) {
        Class86 var3 = Field2((byte) 21);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeShort(var2);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (IOException var4) {
        }
    }

    public final void Field11(int var1) {
        Class86 var2 = Field2((byte) 22);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field2(int var1, int var2, int var3) {
        Class261.Field5().Field1(var1, var2, var3);
        Class105.Field19.Field23 = null;
        Class86 var4 = Field2((byte) 12);

        try {
            var4.Field3().writeShort(var1);
            var4.Field3().writeShort(var2);
            var4.Field3().writeShort(var3);
            this.Field1.Field1(var4);
            var4.Field4();
        } catch (IOException var5) {
        }
    }

    public final void Field3(int var1, int var2, int var3) {
        Class86 var5 = Field2((byte) 12);

        try {
            var5.Field3().writeShort(-500);
            var5.Field3().writeShort(0);
            var5.Field3().writeShort(0);
            this.Field1.Field1(var5);
            var5.Field4();
        } catch (IOException var4) {
        }
    }

    public final void Field12(int var1) {
        Class86 var2 = Field2((byte) 23);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field10(int var1, int var2) {
        Class86 var3 = Field2((byte) 23);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (IOException var4) {
        }
    }

    public final void Field1(Vector var1) {
        Class86 var2 = Field2((byte) 74);

        try {
            int var3 = 0;

            int var4;
            Class743 var5;
            for (var4 = 0; var4 < var1.size(); ++var4) {
                var5 = (Class743) var1.elementAt(var4);
                var3 += var5.Field14;
            }

            var2.Field3().writeShort(var3);

            for (var4 = 0; var4 < var1.size(); ++var4) {
                var5 = (Class743) var1.elementAt(var4);

                for (var3 = 0; var3 < var5.Field14; ++var3) {
                    var2.Field3().writeShort(var5.Field15);
                }
            }

            this.Field1.Field1(var2);
            var2.Field4();
        } catch (Exception var6) {
            var6.printStackTrace();
        }
    }

    public final void Field2(byte var1, short var2) {
        Class86 var3 = Field2((byte) -76);

        try {
            var3.Field3().writeShort(var2);
            var3.Field3().writeByte(var1);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (Exception var4) {
        }
    }

    public final void Field8() {
        Class86 var1 = Field2((byte) -76);

        try {
            var1.Field3().writeShort(-10000);
            this.Field1.Field1(var1);
            var1.Field4();
        } catch (Exception var2) {
        }
    }

    public final void Field2(Vector var1) {
        Class86 var2 = Field2((byte) 24);

        try {
            var2.Field3().writeByte(var1.size());

            for (int var3 = 0; var3 < var1.size(); ++var3) {
                Class537 var4;
                Class798 var5 = Class804.Field2((int) (var4 = (Class537) var1.elementAt(var3)).Field18);
                var2.Field3().writeByte(var4.Field7);
                var2.Field3().writeShort(var5.Field13);
                var2.Field3().writeShort(1);
                if (var4.Field7 == 3) {
                    if (Class467.Field5().Field23 >= 0) {
                        var2.Field3().writeByte(Class467.Field5().Field23);
                    } else {
                        var2.Field3().writeByte(var5.Field12);
                    }
                }
            }

            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var6) {
        }
    }

    public final void Field3(Vector var1) {
        Class86 var2 = Field2((byte) 24);

        try {
            var2.Field3().writeByte(var1.size());

            for (int var3 = 0; var3 < var1.size(); ++var3) {
                Class537 var4 = (Class537) var1.elementAt(var3);
                var2.Field3().writeByte(4);
                var2.Field3().writeShort(var4.Field12);
                var2.Field3().writeShort(var4.Field10);
            }

            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var5) {
        }
    }

    public final void Field1(String var1) {
        Class86 var2 = Field2((byte) 27);

        try {
            var2.Field3().writeUTF(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field9() {
        Class86 var1 = Field2((byte) 70);

        try {
            this.Field1.Field1(var1);
            var1.Field4();
        } catch (Exception var2) {
        }
    }

    public final void Field4(short var1) {
        Class86 var2 = Field2((byte) 68);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field5(short var1) {
        Class86 var2 = Field2((byte) 69);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field6(short var1) {
        Class86 var2 = Field2((byte) 28);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field4(short var1, byte var2) {
        Class86 var3 = Field2((byte) 78);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (IOException var4) {
        }
    }

    public final void Field7(short var1) {
        Class86 var2 = Field2((byte) 29);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field8(short var1) {
        Class86 var2 = Field2((byte) 61);

        try {
            var2.Field3().writeShort(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field10() {
        Class86 var1 = Field2((byte) 31);
        this.Field1.Field1(var1);
        var1.Field4();
    }

    public final void Field11(int var1, int var2) {
        Class86 var3 = Field2((byte) 34);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeShort(var2);
            this.Field1.Field1(var3);
            var3.Field4();
        } catch (IOException var4) {
        }
    }

    public final void Field13(int var1) {
        Class86 var2 = Field2((byte) 36);

        try {
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
            var2.Field4();
        } catch (IOException var3) {
        }
    }

    public final void Field1(String var1, String var2) {
        Class86 var3 = Field2((byte) 39);

        try {
            var3.Field3().writeUTF(var1);
            var3.Field3().writeUTF(var2);
            MainTab.Field3.trim();
            var3.Field3().writeUTF(MainTab.Field3);
            var3.Field3().writeUTF(MainTab.Field4);
            var3.Field3().writeUTF(MainTab.Field5);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
        var3.Field4();
    }

    public final void Field1(short var1, byte var2, boolean var3) {
        Class86 var4 = Field2((byte) -11);

        try {
            var4.Field3().writeByte(var2);
            var4.Field3().writeShort(var1);
            if (var2 == 1) {
                var4.Field3().writeBoolean(var3);
            }
        } catch (IOException var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field2(String var1, String var2) {
        Class86 var3 = Field2((byte) -5);

        try {
            var3.Field3().writeUTF(var1);
            var3.Field3().writeUTF(var2);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field2(String var1) {
        Class86 var2 = Field2((byte) -6);

        try {
            var2.Field3().writeUTF(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field2(int var1, byte var2) {
        Class86 var3 = Field2((byte) -7);

        try {
            var3.Field3().writeByte(var2);
            var3.Field3().writeShort(var1);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field2(byte var1, int var2) {
        Class86 var3 = Field2((byte) -8);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field11() {
        Class86 var1 = Field2((byte) -9);
        this.Field1.Field1(var1);
    }

    public final void Field1(short var1, String var2) {
        Class86 var3 = Field2((byte) -10);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeUTF(var2);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field14(int var1) {
        Class105.Field8();
        Class86 var2 = Field2((byte) -12);

        try {
            var2.Field3().writeShort(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field3(String var1) {
        Class86 var2 = Field2((byte) -13);

        try {
            var2.Field3().writeUTF(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field12() {
        Class86 var1 = Field2((byte) -14);
        this.Field1.Field1(var1);
    }

    public final void Field13() {
        Class86 var1 = Field2((byte) -15);
        this.Field1.Field1(var1);
    }

    public final void Field4(String var1) {
        Class86 var2 = Field2((byte) -16);

        try {
            var2.Field3().writeUTF(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field1(String var1, byte var2, int var3) {
        Class86 var4 = Field2((byte) -17);

        try {
            var4.Field3().writeByte(var2);
            if (var2 == 0) {
                var4.Field3().writeUTF(var1);
            } else if (var2 == 2) {
                var4.Field3().writeInt(var3);
            }
        } catch (IOException var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field5(String var1) {
        Class86 var2 = Field2((byte) -18);

        try {
            var2.Field3().writeUTF(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field12(int var1, int var2) {
        Class105.Field8();
        Class86 var3 = Field2((byte) -19);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field15(int var1) {
        Class86 var2 = Field2((byte) -20);

        try {
            var2.Field3().writeInt(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field16(int var1) {
        Class86 var2 = Field2((byte) -21);

        try {
            var2.Field3().writeShort(var1);
        } catch (IOException var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field5(short var1, byte var2) {
        Class86 var3 = Field2((byte) -22);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
        } catch (IOException var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field1(short var1, int var2, byte var3) {
        Class86 var4 = Field2((byte) -23);

        try {
            var4.Field3().writeByte(var2);
            var4.Field3().writeShort(var1);
            if (var2 == 0) {
                var4.Field3().writeByte(var3);
            }
        } catch (IOException var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field17(int var1) {
        Class86 var3 = Field2((byte) -24);

        try {
            var3.Field3().writeByte(0);
        } catch (Exception var2) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field1(int var1, int var2, int var3, byte var4) {
        Class86 var5 = Field2((byte) -27);

        try {
            var5.Field3().writeByte(var1);
            var5.Field3().writeByte(var2);
            var5.Field3().writeByte(var3);
            var5.Field3().writeByte(var4);
        } catch (Exception var6) {
        }

        this.Field1.Field1(var5);
    }

    public final void Field6(String var1) {
        Class86 var2 = Field2((byte) -28);

        try {
            var2.Field3().writeUTF(var1);
        } catch (IOException var3) {
            var3.printStackTrace();
        }

        this.Field1.Field1(var2);
    }

    public final void Field1(int var1, byte var2, int var3) {
        Class86 var4 = Field2((byte) -30);

        try {
            var4.Field3().writeShort(var1);
            var4.Field3().writeByte(var2);
            var4.Field3().writeByte(var3);
        } catch (IOException var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field1(int var1, byte var2, String var3) {
        Class86 var4 = Field2((byte) -31);

        try {
            var4.Field3().writeShort(var1);
            var4.Field3().writeByte(var2);
            var4.Field3().writeUTF(var3);
        } catch (IOException var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field1(int var1, byte var2, String var3, int var4) {
        Class86 var5 = Field2((byte) -32);

        try {
            var5.Field3().writeShort(var1);
            var5.Field3().writeByte(var2);
            var5.Field3().writeUTF(var3);
            var5.Field3().writeByte(var4);
        } catch (Exception var6) {
        }

        this.Field1.Field1(var5);
    }

    public final void Field1(int var1, int var2, short var3) {
        Class86 var4 = Field2((byte) -33);

        try {
            var4.Field3().writeByte(var1 / 16);
            var4.Field3().writeByte(var2 / 16);
            var4.Field3().writeShort(var3);
        } catch (Exception var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field18(int var1) {
        Class86 var3 = Field2((byte) -34);

        try {
            var3.Field3().writeByte(0);
        } catch (Exception var2) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field19(int var1) {
        Class86 var2 = Field2((byte) -35);

        try {
            var2.Field3().writeByte(var1);
        } catch (Exception var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field1(int var1, Vector var2) {
        Class86 var3 = Field2((byte) -36);

        try {
            var3.Field3().writeByte(var1);
            if (var1 == 1) {
                var3.Field3().writeByte(var2.size());

                for (var1 = 0; var1 < var2.size(); ++var1) {
                    Class231 var4 = (Class231) var2.elementAt(var1);
                    var3.Field3().writeShort(var4.Field1);
                }
            }
        } catch (IOException var5) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field1(Vector var1, byte[] var2) {
        Class86 var3 = Field2((byte) -61);

        try {
            var3.Field3().writeByte(var1.size());

            int var4;
            for (var4 = 0; var4 < var1.size(); ++var4) {
                Class537 var5 = (Class537) var1.elementAt(var4);
                var3.Field3().writeShort(var5.Field9);
            }

            for (var4 = 0; var4 < var2.length; ++var4) {
                var3.Field3().writeByte(var2[var4]);
            }
        } catch (IOException var6) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field20(int var1) {
        Class86 var2 = Field2((byte) -37);

        try {
            var2.Field3().writeByte(var1);
        } catch (Exception var3) {
        }

        this.Field1.Field1(var2);
    }

    public final void Field6(short var1, byte var2) {
        Class86 var3 = Field2((byte) -45);

        try {
            var3.Field3().writeByte(var2);
            var3.Field3().writeShort(var1);
        } catch (Exception var4) {
        }

        this.Field1.Field1(var3);
    }

    public final void Field4(int var1, int var2, int var3) {
        Class86 var4 = new Class86((byte) -48);

        try {
            if (var1 == -1) {
                var4.Field3().writeByte(var1);
                var4.Field3().writeByte(var2);
                var4.Field3().writeByte(var3);
            } else {
                var4.Field3().writeByte(var1);
            }
        } catch (Exception var5) {
        }

        this.Field1.Field1(var4);
    }

    public final void Field9(short var1) {
        Class86 var2 = new Class86((byte) -49);

        try {
            var2.Field3().writeByte(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        this.Field1.Field1(var2);
    }

    public final void Field1(short var1, short var2, byte[][] var3) {
        Class86 var4 = new Class86((byte) -52);

        try {
            var4.Field3().writeByte(Class467.Field51);
            var4.Field3().writeShort(var2);

            for (int var7 = 0; var7 < var1; ++var7) {
                for (int var5 = 0; var5 < var3[var7].length; ++var5) {
                    var4.Field3().writeByte(var3[var7][var5]);
                }
            }
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        this.Field1.Field1(var4);
    }

    public final void Field1(short var1, int var2, int var3, int var4) {
        Class86 var5 = new Class86((byte) -68);

        try {
            var5.Field3().writeByte(var2);
            var5.Field3().writeShort(var1);
            var5.Field3().writeShort(var3);
            var5.Field3().writeByte(var4);
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        this.Field1.Field1(var5);
    }

    public final void Field1(int var1, short var2) {
        Class86 var3 = new Class86((byte) -52);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeShort(var2);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        this.Field1.Field1(var3);
    }

    public final void Field10(short var1) {
        Class86 var2 = new Class86((byte) -51);

        try {
            var2.Field3().writeShort(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        this.Field1.Field1(var2);
    }

    public final void Field13(int var1, int var2) {
        Class86 var3 = new Class86((byte) -57);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeShort(var2);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        this.Field1.Field1(var3);
    }

    public final void Field21(int var1) {
        Class86 var2 = new Class86((byte) -57);

        try {
            var2.Field3().writeByte(-1);
            var2.Field3().writeShort(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        this.Field1.Field1(var2);
    }

    public final void Field2(byte var1, byte var2) {
        Class86 var3 = new Class86((byte) -59);

        try {
            var3.Field3().writeByte(var1);
            var3.Field3().writeByte(var2);
        } catch (Exception var4) {
            var4.printStackTrace();
        }

        this.Field1.Field1(var3);
    }

    public final void Field22(int var1) {
        Class86 var2 = new Class86((byte) 87);

        try {
            var2.Field3().writeByte(var1);
        } catch (Exception var3) {
            var3.printStackTrace();
        }

        this.Field1.Field1(var2);
    }

    public final void Field5(int var1, int var2, int var3) {
        Class86 var4 = new Class86((byte) -64);

        try {
            var4.Field3().writeByte(var1);
            var4.Field3().writeShort(var2);
            var4.Field3().writeByte(var3);
        } catch (Exception var5) {
            var5.printStackTrace();
        }

        this.Field1.Field1(var4);
    }

    public final void Field14() {
        Class86 var1 = Field2((byte) 66);

        try {
            var1.Field3().writeByte(5);
            this.Field1.Field1(var1);
            var1.Field4();
        } catch (Exception var2) {
        }
    }

    public final void Field14(int var1, int var2) {
        Class86 var3 = Field2((byte) -66);

        try {
            var3.Field3().writeByte(var2);
            var3.Field3().writeByte(var1);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field3(int var1, byte var2) {
        Class86 var3 = Field2((byte) -67);

        try {
            var3.Field3().writeShort(var1);
            var3.Field3().writeByte(var2);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field1(int var1, Vector var2, int var3, Vector var4, int var5) {
        Class86 var8 = Field2((byte) -69);

        try {
            var8.Field3().writeShort(var1);
            var8.Field3().writeByte(var3);
            var8.Field3().writeByte(var2.size());

            for (var1 = 0; var1 < var2.size(); ++var1) {
                short var7 = Short.parseShort((String) var2.elementAt(var1));
                var8.Field3().writeShort(var7);
                var8.Field3().writeByte(Byte.parseByte((String) var4.elementAt(var1)));
            }

            var8.Field3().writeByte(-1);
            this.Field1.Field1(var8);
        } catch (Exception var6) {
        }
    }

    public final void Field1(int var1, int var2, int var3, int var4) {
        Class86 var6 = Field2((byte) 62);

        try {
            var6.Field3().writeByte(0);
            var6.Field3().writeShort(var2);
            var6.Field3().writeInt(var3);
            var6.Field3().writeInt(var4);
            this.Field1.Field1(var6);
        } catch (Exception var5) {
        }
    }

    public final void Field15(int var1, int var2) {
        Class86 var3 = Field2((byte) 62);

        try {
            var3.Field3().writeByte(3);
            var3.Field3().writeByte(var2);
            var3.Field3().writeShort(var1);
            this.Field1.Field1(var3);
        } catch (Exception var4) {
        }
    }

    public final void Field6(int var1, int var2, int var3) {
        Class86 var4 = Field2((byte) 62);

        try {
            var4.Field3().writeByte(6);
            var4.Field3().writeByte(var2);
            var4.Field3().writeShort(var1);
            var4.Field3().writeInt(var3);
            this.Field1.Field1(var4);
        } catch (Exception var5) {
        }
    }

    public final void Field23(int var1) {
        Class86 var2 = Field2((byte) 62);

        try {
            var2.Field3().writeByte(4);
            var2.Field3().writeByte(var1);
            this.Field1.Field1(var2);
        } catch (Exception var3) {
        }
    }

    public final void Field15() {
        Class86 var1 = Field2((byte) 62);

        try {
            var1.Field3().writeByte(5);
            this.Field1.Field1(var1);
        } catch (Exception var2) {
        }
    }

    public final void Field2(int var1, int var2, int var3, int var4, int var5) {
        Class86 var6 = Field2((byte) 62);

        try {
            var6.Field3().writeByte(2);
            var6.Field3().writeByte(var1);
            var6.Field3().writeByte(var2);
            var6.Field3().writeByte(var3);
            var6.Field3().writeByte(var4);
            var6.Field3().writeByte(var5);
            this.Field1.Field1(var6);
        } catch (Exception var7) {
        }
    }

    public final void Field7(String var1) {
        Class86 var2 = Field2((byte) 62);

        try {
            var2.Field3().writeByte(7);
            var2.Field3().writeUTF(var1);
            this.Field1.Field1(var2);
        } catch (Exception var3) {
        }
    }
}
