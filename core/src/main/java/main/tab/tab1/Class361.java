package main.tab.tab1;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public final class Class361 extends Class123 {
    private Vector Field62 = new Vector();
    private Vector Field63 = new Vector();
    private byte[] Field64 = new byte[]{4, 6, 5};
    private byte Field65;
    private byte Field66;
    private byte Field67;
    private byte Field68 = 10;
    private byte Field69 = 0;
    private byte Field70;
    private long Field71 = System.currentTimeMillis();

    public final void Field1(Graphics var1) {
        if (!super.Field27) {
            if (Class804.Field46[super.Field42].Field16 == null) {
                if (System.currentTimeMillis() > this.Field71) {
                    this.Field71 = System.currentTimeMillis() + 10000L;
                    Class804.Field46[super.Field42].Field15 = false;
                    Class804.Field46[super.Field42].Field2();
                }
            } else {
                var1.drawImage(Class804.Field10, super.Field193, super.Field194 + 15, 3);
                int var2;
                if (super.Field29 != null) {
                    for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                        ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }

                var2 = this.Field65 / 5;
                int var3 = super.Field194 - var2 * 3;
                if (var2 > 2) {
                    var2 = 2;
                }

                Class804.Field46[super.Field42].Field16.Field1(var1, super.Field193, var3, 0, 0, 1, 1);
                Class804.Field46[super.Field42].Field16.Field1(var1, super.Field193, var3, this.Field67 + 1, this.Field66, 1, 1);
                Class804.Field46[super.Field42].Field16.Field1(var1, super.Field193, var3, this.Field64[var2], 0, 1, 1);
                Class804.Field46[super.Field42].Field16.Field1(var1, super.Field193, var3, this.Field64[var2], 2, -1, 1);
                if (super.Field204 == 3) {
                    Class804.Field46[super.Field42].Field16.Field1(var1, super.Field193, var3, 3, 0, 1, 1);
                }

                if (super.Field28 != null) {
                    for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                        ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }

            Graphics var7 = var1;
            Class361 var8 = this;
            int var4 = this.Field62.size();

            for (int var5 = 0; var5 < var4; ++var5) {
                Class4 var6;
                if ((var6 = (Class4) var8.Field62.elementAt(var5)) != null) {
                    var6.Field1(var7);
                }
            }
        }

        super.Field2(var1);
    }

    public final void Field1() {
    }

    private void Field5(int var1) {
        if (super.Field6 > 20) {
            this.Field67 = (byte) var1;
            super.Field6 = 0;
        }

    }

    public final void Field1(Class672 var1) {
        super.Field1(var1);
    }

    public final void Field1(int var1, int var2) {
        super.Field204 = 5;
    }

    public final void Field2() {
        this.Field5();
        ++super.Field6;
        ++this.Field65;
        if (this.Field65 >= this.Field68) {
            this.Field65 = 0;
        }

        this.Field66 = 0;
        Class361 var1 = this;

        int var2;
        for (var2 = 0; var2 < var1.Field62.size(); ++var2) {
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

        switch (super.Field204) {
            case 0:
                this.Field68 = 10;
                this.Field5(1);
            case 1:
            case 4:
            default:
                break;
            case 2:
                this.Field68 = 10;
                this.Field5(0);
                if (this.Field65 / 5 == 1 && this.Field67 == 0) {
                    this.Field66 = 2;
                }

                this.Field4();
                break;
            case 3:
                this.Field68 = 20;
                this.Field5(0);
                ++super.Field39;
                if (this.Field65 / 5 > 2 && super.Field39 > 20) {
                    super.Field39 = 0;
                    super.Field204 = 2;
                    if (this.Field70 == 1) {
                        byte[] var6 = new byte[]{-1, 1};

                        for (var2 = 0; var2 < 30; ++var2) {
                            Class248 var9 = new Class248((byte) 6);
                            int var4 = Class804.Field13(2);
                            var9.Field1(super.Field193 + var6[var4] * 25, super.Field194 - this.Field65 / 5 * 3, 0, super.Field193 + Class804.Field13(200) * var6[var4] - 10 * var6[var4], super.Field194 + 20 + Class804.Field13(150), (byte) (Class804.Field13(10) + 15), false);
                            Class63.Field12.addElement(var9);
                        }

                        for (var2 = 0; var2 < this.Field63.size(); ++var2) {
                            Class111 var10 = (Class111) this.Field63.elementAt(var2);
                            Class248 var13 = new Class248((byte) 6);
                            int var5 = Class804.Field13(2);
                            var13.Field1(super.Field193 + var6[var5] * 25, super.Field194 - this.Field65 / 5 * 3, var10.Field18, var10.Field193, var10.Field194, (byte) 20, true);
                            Class63.Field12.addElement(var13);
                        }
                    } else {
                        for (int var7 = 0; var7 < this.Field63.size(); ++var7) {
                            Class111 var12 = (Class111) this.Field63.elementAt(var7);
                            Class637 var11 = new Class637(var12.Field193, var12.Field194, var12.Field18);
                            Class74.Field2.addElement(var11);
                        }
                    }
                }
                break;
            case 5:
                this.Field5(1);
                if (this.Field69 < 15) {
                    ++this.Field69;
                    Random var8 = new Random(System.currentTimeMillis());
                    this.Field62.addElement(new Class4(super.Field193 - 12 + Class63.Field3(var8.nextInt() % 25), super.Field194 - 30 + Class63.Field3(var8.nextInt() % 35), 0));
                }
        }

        this.Field7();
    }

    public final void Field1(Vector var1, byte var2) {
        this.Field63 = var1;
        super.Field204 = 3;
        super.Field39 = super.Field40 = super.Field41 = 0;
        this.Field70 = var2;
    }

    public final void Field1(Class180 var1) {
        super.Field1(var1);
        Class804.Field46[super.Field42].Field5 = 50;
        this.Field71 = System.currentTimeMillis() + 10000L;
        super.Field195 = 100;
    }
}
