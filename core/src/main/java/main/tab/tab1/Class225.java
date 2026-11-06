package main.tab.tab1;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class225 extends Class123 {
    private Vector Field62 = new Vector();
    private Vector Field63 = new Vector();
    private byte[][] Field64 = new byte[][]{{0, 0, 0, 1, 1, 1}, {4, 4, 4, 5, 5, 5}, {0, 0, 0, 1, 1, 1}, {0, 0, 0, 1, 1, 1}};
    private byte[][] Field65 = new byte[][]{{2, 2, 2, 2, 2, 2}, {6, 6, 6, 6, 6, 6}, {2, 2, 2, 2, 2, 2}, {2, 2, 2, 2, 2, 2}};
    private byte Field66 = 0;
    private byte Field67;

    public final void Field1(Graphics var1) {
        if (!super.Field27) {
            if (Class804.Field46[super.Field42] != null && Class804.Field46[super.Field42].Field1 != null) {
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
            Class225 var7 = this;
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
                var1.drawRegion(Class804.Field46[super.Field42].Field1, 0, super.Field23 * Class804.Field46[super.Field42].Field6, Class804.Field46[super.Field42].Field5, Class804.Field46[super.Field42].Field6, 0, var2 - Class804.Field46[super.Field42].Field7, 0, 0);
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
        Class225 var1 = this;

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
                if (super.Field12 != 1) {
                    super.Field23 = 0;
                } else {
                    super.Field23 = 4;
                }
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
                    Class74.Field2(super.Field193 - 20, super.Field194 - 14, 4);
                    Class74.Field2(super.Field193 + 20, super.Field194 - 14, 4);
                    Class74.Field2(super.Field193 - 20, super.Field194 - 4, 4);
                    Class74.Field2(super.Field193 + 20, super.Field194 - 4, 4);
                    Class74.Field2(super.Field193, super.Field194 + 4, 4);
                }

                if (this.Field67 == 0 && super.Field39 == 1) {
                    boolean var4 = false;
                    boolean var8 = false;
                    byte var5;
                    if (super.Field12 == 3) {
                        var5 = 10;
                    } else {
                        var5 = -10;
                    }

                    if (super.Field12 != 1) {
                        Class74.Field1(super.Field193 + var5, super.Field194 + -22, 37);
                    }
                }

                if (super.Field39 > this.Field65[super.Field12].length - 1) {
                    int var7;
                    Class111 var9;
                    if (this.Field67 == 0) {
                        for (var7 = 0; var7 < this.Field63.size(); ++var7) {
                            var9 = (Class111) this.Field63.elementAt(var7);
                            boolean var10 = false;
                            var10 = false;
                            byte var11;
                            if (super.Field12 == 3) {
                                var11 = 10;
                            } else {
                                var11 = -10;
                            }

                            Class74.Field1(super.Field193 + var11, super.Field194 + -22, 11);
                            Class105.Field19.Field1(this, var9, var11, -22, super.Field12, var9.Field18, 0);
                        }
                    } else if (this.Field67 == 1) {
                        for (var7 = 0; var7 < this.Field63.size(); ++var7) {
                            var9 = (Class111) this.Field63.elementAt(var7);
                            Class63.Field1((Class111) this, (Class111) var9, 30);
                        }
                    } else {
                        for (var7 = 0; var7 < this.Field63.size(); ++var7) {
                            if ((var9 = (Class111) this.Field63.elementAt(var7)) != null) {
                                int var12 = var9.Field18;
                                var9.Field12();
                                Class105.Field19.Field1("-" + var12, 0, var9.Field193, var9.Field194 + var9.Field16 - 15, 1, -2);

                                for (var12 = 0; var12 < 10; ++var12) {
                                    Class74.Field1(var9.Field193 - 12 + Class63.Field3(Class111.Field30.nextInt() % 25), var9.Field194 - 30 + Class63.Field3(Class111.Field30.nextInt() % 35), 28);
                                }
                            }
                        }
                    }

                    super.Field39 = 0;
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
                super.Field23 = 0;
                if (this.Field66 < 15) {
                    ++this.Field66;
                    Random var6 = new Random(System.currentTimeMillis());
                    this.Field62.addElement(new Class4(super.Field193 - 12 + Class63.Field3(var6.nextInt() % 25), super.Field194 - 30 + Class63.Field3(var6.nextInt() % 35), 0));
                }
        }

        this.Field7();
    }

    public final void Field1(Vector var1, byte var2) {
        this.Field63 = var1;
        super.Field204 = 3;
        super.Field39 = super.Field40 = super.Field41 = 0;
        this.Field67 = var2;
    }

    public final void Field1(Class180 var1) {
        super.Field1(var1);
    }
}
