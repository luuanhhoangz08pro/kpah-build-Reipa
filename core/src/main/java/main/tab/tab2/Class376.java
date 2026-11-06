package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Vector;

public final class Class376 extends Class177 {
    private byte Field15 = 0;
    private int Field16 = 0;
    private int Field17;
    private int Field18;
    private Vector Field19 = new Vector();
    public boolean Field1;
    private static int Field20 = 5;
    private static int Field21;
    private static int Field22 = Class811.Field4(1, -1);
    private short Field23;

    public Class376(byte var1, boolean var2, int var3, int var4) {
        this.Field17 = var4;
        this.Field18 = (int) (System.currentTimeMillis() / 1000L);
        this.Field15 = var1;
        this.Field16 = var3;
        switch (var1) {
            case 0:
            default:
                break;
            case 1:
                this.Field23 = 801;
                break;
            case 2:
                this.Field23 = 805;
                break;
            case 3:
                this.Field23 = 802;
                this.Field15 = 3;
                break;
            case 4:
                this.Field23 = 803;
                this.Field15 = 3;
                break;
            case 5:
                this.Field23 = 804;
                this.Field15 = 3;
        }

        for (int var5 = 0; var5 < var3; ++var5) {
            Class244 var6 = null;
            var6 = new Class244((Class62.Field8 - Class106.Field15 + Class811.Field13(Class106.Field13 << 1)) * 10, (Class62.Field9 - (Class106.Field14 << 1) + Class811.Field13(Class106.Field14 << 1)) * 10);
            if (var1 != 2 && this.Field15 != 3) {
                var6.Field5 = Class811.Field13(4);
            } else {
                var6.Field5 = Class811.Field13(3);
            }

            var6.Field7 = 16 + (Class811.Field13(3) << 2);
            var6.Field4 = Class811.Field4(-1, 1);
            var6.Field6 = Class811.Field13(var6.Field7);
            var6.Field8 = (byte) Class811.Field13(20);
            this.Field19.addElement(var6);
        }

    }

    public final void Field1(Graphics var1) {
        Class106.Field1(var1);
        var1.translate(-Class62.Field8, -Class62.Field9);
        Image var2;
        Class376 var6;
        int var7;
        Class244 var8;
        switch (this.Field15) {
            case 0:
                var1 = var1;
                var6 = this;
                var1.setColor(14540253);

                for (int var9 = 0; var9 < var6.Field16; ++var9) {
                    Class244 var10;
                    if ((var10 = (Class244) var6.Field19.elementAt(var9)).Field1 / 10 > Class62.Field8 && var10.Field1 / 10 < Class62.Field8 + Class106.Field13 && var10.Field2 / 10 > Class62.Field9) {
                        var1.fillRect(var10.Field1 / 10, var10.Field2 / 10, 1, var10.Field5 + 2);
                    }
                }

                return;
            case 1:
                var1 = var1;
                var6 = this;
                var2 = null;
                if (Class379.Field1(this.Field23) != null) {
                    var2 = Class379.Field1(this.Field23).Field1;
                }

                if (var2 != null) {
                    for (var7 = 0; var7 < var6.Field16; ++var7) {
                        if ((var8 = (Class244) var6.Field19.elementAt(var7)).Field1 / 10 > Class62.Field8 && var8.Field1 / 10 < Class62.Field8 + Class106.Field13 && var8.Field2 / 10 > Class62.Field9) {
                            var1.drawRegion(var2, 0, var8.Field6 / (var8.Field7 / 4) * 10, 16, 10, 0, var8.Field1 / 10, var8.Field2 / 10, 3);
                        }
                    }
                }

                return;
            case 2:
                var1 = var1;
                var6 = this;
                var2 = null;
                if (Class379.Field1(this.Field23) != null) {
                    var2 = Class379.Field1(this.Field23).Field1;
                }

                if (var2 != null) {
                    for (var7 = 0; var7 < var6.Field16; ++var7) {
                        if ((var8 = (Class244) var6.Field19.elementAt(var7)).Field1 / 10 > Class62.Field8 && var8.Field1 / 10 < Class62.Field8 + Class106.Field13 && var8.Field2 / 10 > Class62.Field9 && Class379.Field1(var6.Field23) != null) {
                            var1.drawRegion(var2, 0, (2 - var8.Field5) * 5, 5, 5, 0, var8.Field1 / 10, var8.Field2 / 10, 3);
                        }
                    }
                }
            default:
                return;
            case 3:
                var1 = var1;
                var6 = this;
                var2 = null;
                if (Class379.Field1(this.Field23) != null) {
                    var2 = Class379.Field1(this.Field23).Field1;
                }

                boolean var3 = false;
                if (var2 != null) {
                    for (int var4 = 0; var4 < var6.Field16; ++var4) {
                        Class244 var5;
                        if ((var5 = (Class244) var6.Field19.elementAt(var4)).Field1 / 10 > Class62.Field8 && var5.Field1 / 10 < Class62.Field8 + Class106.Field13 && var5.Field2 / 10 > Class62.Field9) {
                            if ((var7 = 2 - var5.Field5 + 1) < 2) {
                                var7 = var5.Field8 / 10;
                            }

                            var1.drawRegion(var2, 0, var7 * 10, 10, 10, 0, var5.Field1 / 10, var5.Field2 / 10, 3);
                            ++var5.Field8;
                            if (var5.Field8 >= 20) {
                                var5.Field8 = 0;
                            }
                        }
                    }
                }

        }
    }

    public static void Field2() {
        int var0 = 1;
        if (Class106.Field12 % 6 == 3) {
            var0 = Class811.Field13(15);
        }

        if (var0 == 0 && Field20 == 5) {
            Field20 = 5 + Class811.Field13(20);
            Field21 = 50 + Class811.Field13(100);
        }

        if (Field21 > 0) {
            --Field21;
        }

        if (Field21 == 0 && Field20 > 5 && Class106.Field12 % 4 == 2) {
            --Field20;
        }

    }

    public final void Field1() {
        if (this.Field17 > 0 && System.currentTimeMillis() / 1000L - (long) this.Field18 > (long) this.Field17) {
            this.Field1 = true;
        }

        Class244 var10000;
        int var1;
        Class244 var2;
        Class376 var3;
        switch (this.Field15) {
            case 0:
                var3 = this;

                for (var1 = 0; var1 < var3.Field16; ++var1) {
                    var10000 = var2 = (Class244) var3.Field19.elementAt(var1);
                    var10000.Field2 += (var2.Field5 + 1) * 15 + (3 - var2.Field5) * 3;
                    ++var2.Field3;
                    var2.Field1 += (3 - var2.Field5 + 1 << 1) + Field20 * Field22;
                    if (var2.Field2 / 10 < Class62.Field9 - Class106.Field15 || var2.Field2 / 10 > Class62.Field9 + Class106.Field14 + Class106.Field16 - (4 - var2.Field5) * 50 || var2.Field1 / 10 < Class62.Field8 - Class106.Field15 || var2.Field1 / 10 > Class62.Field8 + Class106.Field13 + Class106.Field15) {
                        var3.Field1(var2);
                    }
                }

                return;
            case 1:
                var3 = this;

                for (var1 = 0; var1 < var3.Field16; ++var1) {
                    var10000 = var2 = (Class244) var3.Field19.elementAt(var1);
                    var10000.Field2 += 10;
                    var2.Field1 += var2.Field4 * 10 + Field20 * Field22;
                    ++var2.Field6;
                    if (var2.Field6 >= var2.Field7) {
                        var2.Field6 = 0;
                    }

                    if (var2.Field2 / 10 < Class62.Field9 - Class106.Field15 || var2.Field2 / 10 > Class62.Field9 + Class106.Field14 + Class106.Field16 - (4 - var2.Field5) * 50 || var2.Field1 / 10 < Class62.Field8 - Class106.Field15 || var2.Field1 / 10 > Class62.Field8 + Class106.Field13 + Class106.Field15) {
                        var3.Field1(var2);
                    }
                }

                return;
            case 2:
                var3 = this;

                for (var1 = 0; var1 < var3.Field16; ++var1) {
                    var10000 = var2 = (Class244) var3.Field19.elementAt(var1);
                    var10000.Field2 += (var2.Field5 + 4) * 3;
                    var2.Field1 += (var2.Field5 + 1 << 1) + Field20 * Field22;
                    if (var2.Field2 / 10 < Class62.Field9 - Class106.Field15 || var2.Field2 / 10 > Class62.Field9 + Class106.Field14 + Class106.Field16 - (4 - var2.Field5) * 50 || var2.Field1 / 10 < Class62.Field8 - Class106.Field15 || var2.Field1 / 10 > Class62.Field8 + Class106.Field13 + Class106.Field15) {
                        var3.Field1(var2);
                    }
                }
            default:
                return;
            case 3:
                var3 = this;

                for (var1 = 0; var1 < var3.Field16; ++var1) {
                    var10000 = var2 = (Class244) var3.Field19.elementAt(var1);
                    var10000.Field2 += (var2.Field5 + 2) * 5;
                    var2.Field1 += (var2.Field5 + 1 << 1) + Field20 * Field22;
                    if (var2.Field2 / 10 < Class62.Field9 - Class106.Field15 || var2.Field2 / 10 > Class62.Field9 + Class106.Field14 + Class106.Field16 - (4 - var2.Field5) * 50 || var2.Field1 / 10 < Class62.Field8 - Class106.Field15 || var2.Field1 / 10 > Class62.Field8 + Class106.Field13 + Class106.Field15) {
                        var3.Field1(var2);
                    }
                }

        }
    }

    private void Field1(Class244 var1) {
        if (this.Field1) {
            this.Field19.removeElement(var1);
            this.Field16 = this.Field19.size();
            if (this.Field19.size() == 0) {
                Class62.Field60.removeElement(this);
                return;
            }
        } else {
            var1.Field2 = (Class62.Field9 - Class106.Field16 + Class811.Field13(Class106.Field14 << 1)) * 10;
            var1.Field1 = (Class62.Field8 - Class106.Field15 + Class811.Field13(Class106.Field13 << 1)) * 10;
            if (this.Field15 == 2 || this.Field15 == 3) {
                var1.Field5 = Class811.Field13(3);
                return;
            }

            var1.Field5 = Class811.Field13(4);
        }

    }
}
