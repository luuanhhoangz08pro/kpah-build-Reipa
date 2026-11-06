package main.tab.tab2;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class178 extends Class126 {
    private Vector Field62 = new Vector();
    private Vector Field63 = new Vector();
    private int Field64 = -1;
    private int Field65 = 2;
    private int Field66 = 2;
    private int Field67;
    private int Field68;
    private byte Field69 = 4;
    private byte Field70 = 1;
    private byte Field71;
    private byte Field72 = 0;
    private int Field73 = -1;
    private long Field74 = 1L;
    private byte Field75;
    private long Field76 = System.currentTimeMillis();

    public final void Field1(Graphics var1) {
        super.Field42 = 39;
        int var2;
        if (this.Field72 < 15) {
            if (Class811.Field46[super.Field42].Field16 != null) {
                if (Class106.Field12 % 2 == 1) {
                    this.Field71 += this.Field70;
                    if (Class809.Field4(this.Field71) > 1) {
                        this.Field70 = (byte) (-this.Field70);
                    }
                }

                if (super.Field29 != null) {
                    for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                        ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }

                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194, 0, 0, 1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194, 0, 2, -1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194 + this.Field71, this.Field69, 0, 1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194 + this.Field71, this.Field69, 2, -1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194, 1, 0, 1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194, 1, 0, -1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194, this.Field65, 0, 1, 1);
                Class811.Field46[super.Field42].Field16.Field1(var1, super.Field193, super.Field194, this.Field66, 2, -1, 1);
                if (super.Field28 != null) {
                    for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                        ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            } else if (System.currentTimeMillis() > this.Field76) {
                this.Field76 = System.currentTimeMillis() + 10000L;
                Class811.Field46[super.Field42].Field15 = false;
                Class811.Field46[super.Field42].Field2();
            }
        }

        var1 = var1;
        Class178 var5 = this;
        var2 = this.Field62.size();

        for (int var3 = 0; var3 < var2; ++var3) {
            Class800 var4;
            if ((var4 = (Class800) var5.Field62.elementAt(var3)) != null) {
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

    public final void a_(Graphics var1, int var2, int var3) {
        if (super.Field5 != 0) {
            if (Class811.Field46[super.Field42].Field16 != null) {
                Class811.Field46[super.Field42].Field16.Field1(var1, var2, 20, 4, 0, 1, 1);
            }

        }
    }

    public final void Field2() {
        this.Field5();
        super.Field42 = 39;
        Class178 var1 = this;

        for (int var2 = 0; var2 < var1.Field62.size(); ++var2) {
            Class800 var3;
            if ((var3 = (Class800) var1.Field62.elementAt(var2)) != null) {
                var3.Field1();
                if (var3.Field3) {
                    var1.Field62.removeElement(var3);
                    if (var1.Field62.size() == 0) {
                        var1.Field187 = true;
                    }
                }
            }
        }

        if (this.Field74 != 0L) {
            super.Field6 += this.Field73;
            ++this.Field73;
            if (this.Field73 > 1) {
                this.Field74 = 0L;
                this.Field73 = -1;
            }
        } else if (Class106.Field12 % 10 == 0) {
            this.Field74 = 1L;
        }

        label66:
        {
            switch (super.Field204) {
                case 0:
                    this.Field69 = 4;
                    break;
                case 1:
                case 4:
                default:
                    break label66;
                case 2:
                    this.Field69 = 4;
                    ++super.Field39;
                    if (super.Field39 > 6) {
                        super.Field39 = 0;
                    }
                    break;
                case 3:
                    this.Field69 = 5;
                    ++super.Field39;
                    if (super.Field39 > 6) {
                        if (super.Field39 > 15) {
                            super.Field39 = 0;
                            super.Field204 = 2;
                        }
                    } else if (super.Field39 == 2 && super.Field34 != null) {
                        super.Field34.Field1((Class126) this);
                    }
                    break label66;
                case 5:
                    this.Field69 = 4;
                    super.Field23 = 2;
                    ++super.Field39;
                    super.Field193 += super.Field40;
                    super.Field194 += super.Field41;
                    super.Field40 = (short) (super.Field40 >> 1);
                    super.Field41 = (short) (super.Field41 >> 1);
                    if (this.Field72 < 15) {
                        ++this.Field72;
                        Random var4 = new Random(System.currentTimeMillis());
                        this.Field62.addElement(new Class4(super.Field193 - 12 + Class62.Field3(var4.nextInt() % 25), super.Field194 - 30 + Class62.Field3(var4.nextInt() % 35), 0));
                    }
                    break label66;
            }

            super.Field23 = 0;
        }

        if (this.Field64 != -1) {
            ++this.Field64;
            if (this.Field64 >= 8) {
                this.Field64 = -1;
            }
        }

        if (this.Field68 > 0) {
            --this.Field68;
            if (this.Field68 == 0) {
                this.Field66 = 2;
                this.Field5(-1);
            }
        }

        if (this.Field67 > 0) {
            --this.Field67;
            if (this.Field67 == 0) {
                this.Field65 = 2;
                this.Field5(1);
            }
        }

    }

    private void Field5(int var1) {
        for (int var2 = 0; var2 < this.Field63.size(); ++var2) {
            Class114 var3 = (Class114) this.Field63.elementAt(var2);
            Class367 var4 = new Class367(super.Field193 + var1 * 40, super.Field194 + 30, var3, 1, true);
            if (var3.Field18 != 0) {
                var4.Field1[0] = "-" + var3.Field18;
            }

            Class73.Field1(super.Field193 + var1 * 50, super.Field194 - 30, 14);
            Class73.Field2.addElement(var4);
        }

    }

    public final void Field1(Vector var1, byte var2) {
        this.Field63.removeAllElements();
        super.Field204 = 3;
        super.Field39 = super.Field40 = super.Field41 = 0;
        this.Field64 = 0;
        Class811.Field13(2);
        this.Field75 = 0;
        super.Field23 = 1;

        for (int var4 = 0; var4 < var1.size(); ++var4) {
            Class114 var3 = (Class114) var1.elementAt(var4);
            Class810 var5 = new Class810(var3.Field193, var3.Field194, super.Field193, super.Field194, var3.Field18);
            Class73.Field2.addElement(var5);
        }

    }

    public final void Field1(Class184 var1) {
        super.Field1(var1);
        Class811.Field46[super.Field42].Field5 = 50;
        this.Field76 = System.currentTimeMillis() + 10000L;
        super.Field195 = 100;
    }
}
