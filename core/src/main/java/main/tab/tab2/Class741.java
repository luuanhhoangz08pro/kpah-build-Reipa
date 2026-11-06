package main.tab.tab2;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class741 extends Class126 {
    private Vector Field62 = new Vector();
    private byte[] Field63 = new byte[]{0, 0, 1, 1, 1, 1, 1, 1};
    private byte[] Field64 = new byte[]{0, 0, 0, 1, 1, 1};
    private int Field65;
    private byte Field66 = 0;
    private Vector Field67 = new Vector();

    public Class741(int var1) {
        this.Field65 = var1;
    }

    public final void Field1(Graphics var1) {
        if (!super.Field27) {
            if (Class811.Field46[super.Field42] != null && Class811.Field46[super.Field42].Field1 != null) {
                int var2;
                if (super.Field29 != null) {
                    for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                        ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }

                var1.drawRegion(Class811.Field46[super.Field42].Field1, 0, super.Field23 * Class811.Field46[super.Field42].Field6, Class811.Field46[super.Field42].Field5, Class811.Field46[super.Field42].Field6, 0, super.Field193 - Class811.Field46[super.Field42].Field5 / 2, super.Field194 - Class811.Field46[super.Field42].Field6, 0);
                if (super.Field28 != null) {
                    for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                        ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }

            Graphics var3 = var1;
            Class741 var7 = this;
            int var4 = this.Field62.size();

            for (int var5 = 0; var5 < var4; ++var5) {
                ((Class4) var7.Field62.elementAt(var5)).Field1(var3);
            }
        }

        super.Field2(var1);
    }

    public final void a_(Graphics var1, int var2, int var3) {
        try {
            if (Class811.Field46[super.Field42] != null && Class811.Field46[super.Field42].Field1 != null) {
                var1.drawRegion(Class811.Field46[super.Field42].Field1, 0, 0 * Class811.Field46[super.Field42].Field6, Class811.Field46[super.Field42].Field5, 40, 0, var2 - Class811.Field46[super.Field42].Field7, 0, 0);
                var1.drawRegion(Class811.Field27, super.Field47[super.Field24] << 4, 0, 16, 16, 0, var2 - 15, 23, 20);
                return;
            }
        } catch (Exception var4) {
        }

    }

    public final void Field2() {
        this.Field5();
        Class741 var1 = this;

        for (int var2 = 0; var2 < var1.Field62.size(); ++var2) {
            Class4 var3;
            (var3 = (Class4) var1.Field62.elementAt(var2)).Field1();
            if (var3.Field3) {
                var1.Field62.removeElement(var3);
                if (var1.Field62.size() == 0) {
                    var1.Field187 = true;
                }
            }
        }

        switch (super.Field204) {
            case 0:
                if (this.Field65 == 0) {
                    super.Field23 = 0;
                    this.Field67.removeAllElements();
                } else if (this.Field65 == 1) {
                    super.Field23 = 0;
                } else {
                    super.Field23 = 0;
                }
            case 1:
            default:
                break;
            case 2:
                super.Field23 = 0;
                break;
            case 3:
                if (this.Field65 == 0) {
                    ++super.Field39;
                    int var4;
                    if (super.Field39 == this.Field63.length - 5) {
                        Class73.Field1(super.Field193 - 3, super.Field194 - 30, 24);

                        for (var4 = 0; var4 < 10; ++var4) {
                            Class570 var6 = new Class570(super.Field193 - 5, super.Field194 - 70, this, this.Field67);
                            Class73.Field2.addElement(var6);
                        }
                    }

                    if (super.Field39 >= this.Field63.length - 3 && super.Field39 <= this.Field63.length - 1) {
                        Class73.Field1(super.Field193 - 5, super.Field194 - 65, 3);
                    }

                    if (super.Field39 == this.Field63.length - 1 && this.Field67.size() > 0) {
                        for (var4 = 0; var4 < this.Field67.size(); ++var4) {
                            Class114 var7 = (Class114) this.Field67.elementAt(var4);
                            Class106.Field19.Field1(this, var7, 0, -65, 0, var7.Field18, 2);
                        }
                    }

                    if (super.Field39 > this.Field63.length - 1) {
                        super.Field39 = 0;
                        super.Field204 = 0;
                    }

                    super.Field23 = this.Field63[super.Field39];
                } else {
                    super.Field23 = 0;
                }
                break;
            case 4:
                super.Field23 = 0;
                break;
            case 5:
                super.Field23 = 0;
                if (this.Field66 < 15) {
                    ++this.Field66;
                    Random var5 = new Random(System.currentTimeMillis());
                    this.Field62.addElement(new Class4(super.Field193 - 12 + Class62.Field3(var5.nextInt() % 25), super.Field194 - 30 + Class62.Field3(var5.nextInt() % 35), 0));
                }
        }

        this.Field7();
    }

    public final void Field1() {
    }

    public final void Field1(Class678 var1) {
        super.Field1(var1);
    }

    public final void Field1(int var1, int var2) {
        super.Field204 = 5;
    }

    public final void Field1(Vector var1, byte var2) {
        super.Field204 = 3;
        this.Field67 = var1;
        super.Field39 = super.Field40 = super.Field41 = 0;
    }

    public final void Field1(Class184 var1) {
        super.Field1(var1);
    }

    public final boolean Field45() {
        return true;
    }
}
