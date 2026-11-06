package main.tab.tab2;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class23 extends Class126 {
    private Vector Field62 = new Vector();
    private static int[] Field63 = new int[]{0, 2};
    private byte Field64 = 0;

    public final void Field1(Graphics var1) {
        if (super.Field6 != 0) {
            ++super.Field23;
            if (super.Field23 > 1) {
                super.Field23 = 0;
            }
        }

        int var3;
        if (Class811.Field46[super.Field42] != null) {
            byte var2 = Class126.Field33[Class811.Field46[super.Field42].Field2][super.Field12][super.Field23];
            var1.drawImage(Class811.Field10, super.Field193, super.Field194, 3);
            if (super.Field29 != null) {
                for (var3 = 0; var3 < super.Field29.size(); ++var3) {
                    ((Class48) super.Field29.elementAt(var3)).Field1(var1, super.Field193, super.Field194);
                }
            }

            var1.drawRegion(Class811.Field46[super.Field42].Field1, 0, var2 % 4 * Class811.Field46[super.Field42].Field6, Class811.Field46[super.Field42].Field5, Class811.Field46[super.Field42].Field6, Field63[var2 / 4], super.Field193 - Class811.Field46[super.Field42].Field7 + super.Field10, super.Field194 - Class811.Field46[super.Field42].Field8 + super.Field6 + super.Field11, 0);
            if (super.Field28 != null) {
                for (var3 = 0; var3 < super.Field28.size(); ++var3) {
                    ((Class48) super.Field28.elementAt(var3)).Field1(var1, super.Field193, super.Field194);
                }
            }
        }

        var1 = var1;
        Class23 var5 = this;
        int var6 = this.Field62.size();

        for (var3 = 0; var3 < var6; ++var3) {
            Class4 var4;
            if ((var4 = (Class4) var5.Field62.elementAt(var3)) != null) {
                var4.Field1(var1);
            }
        }

    }

    public final void Field1() {
    }

    public final void Field1(Class678 var1) {
        super.Field1(var1);
    }

    public final void Field1(int var1, int var2) {
        super.Field204 = 5;
    }

    public final void Field2() {
        Class23 var1 = this;

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
        if (super.Field6 < 0) {
            super.Field6 += super.Field7;
            ++super.Field7;
            if (super.Field6 > 0) {
                super.Field6 = 0;
            }
        }

        super.Field10 += super.Field8;
        super.Field11 += super.Field9;
        if (super.Field8 > 0) {
            --super.Field8;
        }

        if (super.Field8 < 0) {
            ++super.Field8;
        }

        if (super.Field9 > 0) {
            --super.Field9;
        }

        if (super.Field9 < 0) {
            ++super.Field9;
        }

        if (super.Field8 == 0 && super.Field9 == 0) {
            if (super.Field10 > 1) {
                super.Field10 >>= 1;
            } else {
                super.Field10 = 0;
            }

            if (super.Field11 > 1) {
                super.Field11 >>= 1;
            } else {
                super.Field11 = 0;
            }
        }

        if (super.Field3 > 0) {
            --super.Field3;
            if (super.Field3 == 0) {
                if (super.Field2 < 0) {
                    super.Field2 = 0;
                }

                if (super.Field4 > super.Field2 || super.Field2 == 0) {
                    super.Field4 = super.Field2;
                }

                if (super.Field4 == 0) {
                    super.Field204 = 4;
                }
            }
        }

        switch (super.Field204) {
            case 0:
                super.Field23 = 0;
                return;
            case 1:
            default:
                break;
            case 2:
                ++super.Field39;
                if (super.Field39 > 6) {
                    super.Field39 = 0;
                }

                if (super.Field39 > 2) {
                    super.Field23 = 1;
                } else {
                    super.Field23 = 0;
                }

                this.Field4();
                break;
            case 3:
                super.Field23 = 2;
                ++super.Field39;
                if (super.Field39 % 6 == 3) {
                    var1 = null;
                    if (super.Field60 != 0) {
                        Class106.Field19.Field1("-" + super.Field60, 0, super.Field35.Field193, super.Field35.Field194 + super.Field35.Field16 - 15, 1, -2);
                    } else {
                        Class106.Field19.Field1("MISS", 0, super.Field35.Field193, super.Field35.Field194 + super.Field35.Field16 - 15, 1, -2);
                    }

                    Class744 var4;
                    if (Class126.Field33[Class811.Field46[super.Field42].Field2][super.Field12][super.Field23] < 4) {
                        var4 = new Class744(super.Field35, super.Field193 - 20, super.Field194 - 30);
                    } else {
                        var4 = new Class744(super.Field35, super.Field193 + 20, super.Field194 - 30);
                    }

                    Class73.Field2.addElement(var4);
                }

                if (super.Field39 > 10) {
                    super.Field39 = 0;
                    super.Field204 = 2;
                    return;
                }
                break;
            case 4:
                return;
            case 5:
                super.Field23 = 3;
                ++super.Field39;
                super.Field193 += super.Field40;
                super.Field194 += super.Field41;
                super.Field40 = (short) (super.Field40 >> 1);
                super.Field41 = (short) (super.Field41 >> 1);
                if (this.Field64 < 15) {
                    ++this.Field64;
                    Random var5 = new Random(System.currentTimeMillis());
                    this.Field62.addElement(new Class4(super.Field193 - 12 + Class62.Field3(var5.nextInt() % 25), super.Field194 - 30 + Class62.Field3(var5.nextInt() % 35), 0));
                }

                return;
        }

    }
}
