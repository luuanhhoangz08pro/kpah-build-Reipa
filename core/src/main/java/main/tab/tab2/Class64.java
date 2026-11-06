package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class64 extends Class126 {
    private int Field62 = 0;
    private int Field63 = 1;
    private int Field64 = 0;
    private int Field65;
    private int Field66;
    private int Field67;
    private boolean Field68 = false;
    private boolean Field69;
    private static byte[] Field70 = new byte[]{0, 1, 2, 2};

    public Class64() {
        super.Field6 = 0;
    }

    public final void Field1(Graphics var1) {
        if (!super.Field27) {
            var1.drawImage(Class811.Field10, super.Field193, super.Field194, 3);
            int var2;
            if (super.Field29 != null) {
                for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                    ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                }
            }

            if (Class811.Field46[super.Field42].Field1 != null) {
                var1.drawRegion(Class811.Field46[super.Field42].Field1, 0, Field70[super.Field12] * 31, 20, 31, super.Field12 == 3 ? 2 : 0, super.Field193 + super.Field10, super.Field194 - this.Field65 + super.Field6 + super.Field11 + super.Field16, 33);
                if (this.Field69) {
                    var2 = 10 * (this.Field67 / 3) * Class809.Field2(this.Field66) >> 10;
                    int var3 = -(10 * (this.Field67 / 3) * Class809.Field1(this.Field66)) >> 10;
                    var2 += super.Field193;
                    var3 = super.Field194 + var3 - 25;
                    var1.drawRegion(Class811.Field6(33), 0, (11 - this.Field67) / 3 * 14, 14, 14, 0, var2, var3, 3);
                }

                if (super.Field28 != null) {
                    for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                        ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }
        }

        super.Field2(var1);
    }

    public final void Field2() {
        super.Field2();
        if (this.Field64 == 0) {
            this.Field65 += this.Field62;
            this.Field62 += this.Field63 << 1;
            if (Class809.Field4(this.Field62) > 4) {
                this.Field63 = -this.Field63;
            }

            if (this.Field62 == 0 && this.Field63 == 1) {
                this.Field64 = 8;
            }
        }

        if (this.Field64 > 0 && !this.Field68) {
            --this.Field64;
        }

        if (super.Field193 == super.Field37 && super.Field194 == super.Field38) {
            this.Field68 = true;
        } else {
            this.Field68 = false;
        }

        if (!super.Field27 && this.Field69) {
            ++this.Field67;
            if (this.Field67 >= 12) {
                this.Field69 = false;
                this.Field67 = 0;
            }
        }

    }

    public final void Field4() {
        if (this.Field8()) {
            if (this.Field64 == 0) {
                super.Field4();
            }

        }
    }

    public final void Field1(Vector var1, byte var2) {
        if (!this.Field69) {
            Class114 var5 = (Class114) var1.elementAt(0);
            this.Field69 = true;
            this.Field67 = 0;
            this.Field66 = Class809.Field1(var5.Field193 - super.Field193, -(var5.Field194 - super.Field194));
            if (var1.size() > 0) {
                for (int var4 = 0; var4 < var1.size(); ++var4) {
                    if ((var5 = (Class114) var1.elementAt(var4)) != null) {
                        int var3 = var5.Field4;
                        var5.Field12();
                        Class106.Field19.Field1("-" + var3, 0, var5.Field193, var5.Field194 + var5.Field16 - 15, 1, -2);
                    }
                }
            }

        }
    }
}
