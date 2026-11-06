package main.tab.tab1;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class236 extends Class123 {
    private Vector Field62 = new Vector();
    private Vector Field63 = new Vector();
    private byte[][] Field64 = new byte[][]{{10, 10, 10, 10, 11, 11, 11, 11}, {19, 19, 19, 19, 20, 20, 20, 20}, {1, 1, 1, 1, 2, 2, 2, 2}, {1, 1, 1, 1, 2, 2, 2, 2}};
    private byte[][][] Field65 = new byte[][][]{{{12, 12, 12, 12, 12, 12, 12, 12, 15, 15, 16, 16, 16, 16, 16, 16}, {21, 21, 21, 21, 21, 21, 21, 21, 24, 24, 25, 25, 25, 25, 25, 25}, {3, 3, 3, 3, 3, 3, 3, 3, 6, 6, 7, 7, 7, 7, 7, 7}, {3, 3, 3, 3, 3, 3, 3, 3, 6, 6, 7, 7, 7, 7, 7, 7}}, {{12, 12, 12, 12, 12, 12, 12, 12, 13, 13, 14, 14, 14, 14, 14, 14}, {21, 21, 21, 21, 21, 21, 21, 21, 22, 22, 23, 23, 23, 23, 23, 23}, {3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5}, {3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5, 5}}};
    private byte[][] Field66 = new byte[][]{{17, 17, 17}, {26, 26, 26}, {8, 8, 8}, {8, 8, 8}};
    private byte[][] Field67 = new byte[][]{{9, 9, 9, 9, 9, 10, 10, 10, 10, 10}, {18, 18, 18, 18, 18, 19, 19, 19, 19, 19}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}};
    private byte Field68 = 0;
    private byte Field69;

    public Class236() {
        super.Field37 = super.Field193;
        super.Field38 = super.Field194;
    }

    public final void Field1(Graphics var1) {
        if (!super.Field27) {
            if (Class804.Field46[super.Field42] != null && Class804.Field46[super.Field42].Field1 != null) {
                int var2;
                if (super.Field29 != null) {
                    for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                        ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }

                var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, super.Field23 * Class804.Field46[super.Field42].Field6, Class804.Field46[super.Field42].Field5, Class804.Field46[super.Field42].Field6, super.Field12 == 3 ? 2 : 0, super.Field193, super.Field194 + 10, 33);
                if (super.Field28 != null) {
                    for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                        ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }

            Graphics var3 = var1;
            Class236 var7 = this;
            int var4 = this.Field62.size();

            for (int var5 = 0; var5 < var4; ++var5) {
                Class4 var6;
                if ((var6 = (Class4) var7.Field62.elementAt(var5)) != null) {
                    var6.Field1(var3);
                }
            }
        }

        super.Field2(var1);
    }

    public final void a_(Graphics var1, int var2, int var3) {
        try {
            if (Class804.Field46[super.Field42] != null && Class804.Field46[super.Field42].Field1 != null) {
                var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, 0 * Class804.Field46[super.Field42].Field6, Class804.Field46[super.Field42].Field5, 40, 0, var2 - Class804.Field46[super.Field42].Field7, -10, 0);
                var1.drawRegion(Class804.Field27, super.Field47[super.Field24] << 4, 0, 16, 16, 0, var2 - 15, 23, 20);
                return;
            }
        } catch (Exception var4) {
        }

    }

    public final void Field1() {
    }

    public final void Field1(Class672 var1) {
        super.Field1(var1);
    }

    public final void Field1(int var1, int var2) {
        super.Field204 = 5;
    }

    public final void Field2() {
        Class236 var1 = this;

        for (int var2 = 0; var2 < var1.Field62.size(); ++var2) {
            Class4 var3;
            if ((var3 = (Class4) var1.Field62.elementAt(var2)) != null) {
                var3.Field1();
                if (var3.Field3) {
                    var1.Field62.removeElement(var3);
                    if (var1.Field62.size() == 0) {
                        var1.Field187 = true;
                    }
                }
            }
        }

        this.Field5();
        switch (super.Field204) {
            case 0:
                ++super.Field39;
                if (super.Field39 > this.Field67[super.Field12].length - 1) {
                    super.Field39 = 0;
                }

                super.Field23 = this.Field67[super.Field12][super.Field39];
            case 1:
            default:
                break;
            case 2:
                ++super.Field39;
                if (super.Field39 > this.Field64[super.Field12].length - 1) {
                    super.Field39 = 0;
                }

                super.Field23 = this.Field64[super.Field12][super.Field39];
                if (!super.Field27) {
                    this.Field4();
                }
                break;
            case 3:
                ++super.Field39;
                if (super.Field39 == this.Field65[this.Field69 == 2 ? 0 : this.Field69][super.Field12].length - 7) {
                    for (int var4 = 0; var4 < this.Field63.size(); ++var4) {
                        Class111 var6 = (Class111) this.Field63.elementAt(var4);
                        Class105.Field19.Field2(this, var6, (this.Field69 == 2 ? 0 : this.Field69) + 3);
                    }
                }

                if (super.Field39 > this.Field65[this.Field69 == 2 ? 0 : this.Field69][super.Field12].length - 1) {
                    super.Field39 = 0;
                    super.Field204 = 2;
                } else {
                    super.Field23 = this.Field65[this.Field69 == 2 ? 0 : this.Field69][super.Field12][super.Field39];
                }
                break;
            case 4:
                ++super.Field39;
                if (super.Field39 > this.Field66[super.Field12].length - 1) {
                    super.Field39 = 0;
                }

                super.Field23 = this.Field66[super.Field12][super.Field39];
                break;
            case 5:
                super.Field23 = 0;
                if (this.Field68 < 15) {
                    ++this.Field68;
                    Random var5 = new Random(System.currentTimeMillis());
                    this.Field62.addElement(new Class4(super.Field193 - 12 + Class63.Field3(var5.nextInt() % 25), super.Field194 - 30 + Class63.Field3(var5.nextInt() % 35), 0));
                }
        }

        this.Field7();
    }

    public final void Field1(Vector var1, byte var2) {
        this.Field63 = var1;
        super.Field204 = 3;
        super.Field39 = super.Field40 = super.Field41 = 0;
        this.Field69 = var2;
    }

    public final void Field1(Class180 var1) {
        super.Field1(var1);
    }
}
