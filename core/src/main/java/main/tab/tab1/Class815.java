package main.tab.tab1;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class815 extends Class123 {
    private Vector Field62 = new Vector();
    private Vector Field63 = new Vector();
    private byte[][] Field64 = new byte[][]{{1, 1, 1, 1, 2, 2, 2, 2}, {5, 5, 5, 5, 6, 6, 6, 6}, {1, 1, 1, 1, 2, 2, 2, 2}, {1, 1, 1, 1, 2, 2, 2, 2}};
    private byte[][] Field65 = new byte[][]{{3, 3, 3, 3, 3, 3}, {7, 7, 7, 7, 7, 7}, {3, 3, 3, 3, 3, 3}, {3, 3, 3, 3, 3, 3}};
    private byte[][] Field66 = new byte[][]{{0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {5, 5, 5, 5, 5, 6, 6, 6, 6, 6}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}, {0, 0, 0, 0, 0, 1, 1, 1, 1, 1}};
    private byte Field67 = 0;
    private byte Field68;

    public final void Field1(Graphics var1) {
        if (!super.Field27) {
            if (Class804.Field46[super.Field42] != null && Class804.Field46[super.Field42].Field1 != null) {
                var1.drawImage(Class804.Field10, super.Field193, super.Field194 - 5, 3);
                int var2;
                if (super.Field29 != null) {
                    for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                        ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }

                var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, super.Field23 * Class804.Field46[super.Field42].Field6, Class804.Field46[super.Field42].Field5, Class804.Field46[super.Field42].Field6, super.Field12 == 3 ? 2 : 0, super.Field193, super.Field194, 33);
                if (super.Field28 != null) {
                    for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                        ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }

            Graphics var3 = var1;
            Class815 var7 = this;
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
                var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, 0, Class804.Field46[super.Field42].Field5, Class804.Field46[super.Field42].Field6 / 2, 0, var2 - Class804.Field46[super.Field42].Field7, 0, 0);
                var1.drawRegion(Class804.Field27, super.Field47[super.Field24] << 4, 0, 16, 16, 0, var2 - 15, 23, 20);
                return;
            }
        } catch (Exception var4) {
            var4.printStackTrace();
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
        Class815 var1 = this;

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
                if (super.Field39 > this.Field66[super.Field12].length - 1) {
                    super.Field39 = 0;
                }

                super.Field23 = this.Field66[super.Field12][super.Field39];
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
                if (super.Field39 % 3 == 0) {
                    Class74.Field2(super.Field193 - 20, super.Field194 - 14, 30);
                    Class74.Field2(super.Field193 + 20, super.Field194 - 14, 30);
                    Class74.Field2(super.Field193 - 20, super.Field194 - 4, 30);
                    Class74.Field2(super.Field193 + 20, super.Field194 - 4, 30);
                    Class74.Field2(super.Field193, super.Field194 + 4, 30);
                }

                if (super.Field39 > this.Field65[super.Field12].length - 1) {
                    super.Field39 = 0;
                    int var4;
                    Class111 var6;
                    if (this.Field68 == 0) {
                        for (var4 = 0; var4 < this.Field63.size(); ++var4) {
                            var6 = (Class111) this.Field63.elementAt(var4);
                            Class105.Field19.Field1(this, var6, 4, 52);
                        }
                    } else if (this.Field68 != 1) {
                        for (var4 = 0; var4 < this.Field63.size(); ++var4) {
                            if ((var6 = (Class111) this.Field63.elementAt(var4)) != null) {
                                int var7 = var6.Field18;
                                var6.Field12();
                                Class105.Field19.Field1("-" + var7, 0, var6.Field193, var6.Field194 + var6.Field16 - 15, 1, -2);

                                for (var7 = 0; var7 < 15; ++var7) {
                                    Class74.Field1(var6.Field193 - 12 + Class63.Field3(Class111.Field30.nextInt() % 25), var6.Field194 - 30 + Class63.Field3(Class111.Field30.nextInt() % 35), 33);
                                }
                            }
                        }
                    }

                    super.Field204 = 2;
                }

                super.Field23 = this.Field65[super.Field12][super.Field39];
                break;
            case 4:
                if (super.Field12 != 1) {
                    super.Field23 = 3;
                } else {
                    super.Field23 = 7;
                }
                break;
            case 5:
                super.Field23 = 3;
                if (this.Field67 < 15) {
                    ++this.Field67;
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
        this.Field68 = var2;
    }

    public final void Field1(Class180 var1) {
        super.Field1(var1);
    }
}
