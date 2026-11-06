package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class228 extends Class173 {
    private static int[] Field15 = new int[]{16579837, 11188220};
    public Vector Field1 = new Vector();
    private Vector[] Field16;
    private Class386 Field17;
    private long Field18 = 0L;
    private long Field19 = 0L;
    private boolean Field20 = false;
    private boolean Field21 = true;
    private int Field22 = 0;
    private int Field23 = 0;
    private int Field24 = 7;

    public final void Field2() {
        this.Field18 = System.currentTimeMillis() / 10L;
        this.Field19 = System.currentTimeMillis() / 10L;
        this.Field1.removeAllElements();
    }

    public final void Field1(Vector var1, Class386 var2, boolean var3) {
        if (var1.size() != 0) {
            this.Field20 = var3;
            int var5;
            int var6;
            Class386 var7;
            int var8;
            Class386 var9;
            if (!var3) {
                Vector var4 = var1;
                var5 = var1.size();

                for (var6 = 0; var6 < var5 - 1; ++var6) {
                    var7 = (Class386) var4.elementAt(var6);

                    for (var8 = var6 + 1; var8 < var5; ++var8) {
                        var9 = (Class386) var4.elementAt(var8);
                        if (var7.Field1 > var9.Field1) {
                            var4.setElementAt(var7, var8);
                            var4.setElementAt(var9, var6);
                            var7 = var9;
                        }
                    }
                }
            }

            this.Field1 = var1;
            this.Field17 = var2;
            this.Field16 = new Vector[var1.size()];

            int var16;
            for (var16 = 0; var16 < this.Field16.length; ++var16) {
                this.Field16[var16] = new Vector();
            }

            var2.Field3 = -1;
            this.Field16[0].addElement(var2);
            var16 = -1;

            int var10;
            int var11;
            int var12;
            int var14;
            Class386 var15;
            Class386 var18;
            int var20;
            for (var5 = 0; var5 < var1.size(); ++var5) {
                var6 = var2.Field1;
                int var17 = var2.Field2;
                if (var3 && var16 != -1) {
                    var6 = (var18 = (Class386) var1.elementAt(var16)).Field1;
                    var17 = var18.Field2;
                }

                if (!var3) {
                    var16 = Field2(var1);
                } else {
                    ++var16;
                }

                Field1(var1);
                boolean var19 = false;
                var8 = this.Field16[var16].size() - 1;
                var10 = Class802.Field1((var9 = (Class386) var1.elementAt(var16)).Field1 - var6, -(var9.Field2 - var17));
                var11 = Class804.Field13(15) + 10;
                var12 = 0;
                boolean var13 = false;

                while (true) {
                    var20 = 0;
                    if (var12 != 0) {
                        var20 = var10 - 5 + Class804.Field13(10);
                    }

                    var20 = Class802.Field3(var20);
                    var14 = var11 * var12 * Class802.Field2(var20) >> 10;
                    var20 = -(var11 * var12 * Class802.Field1(var20)) >> 10;
                    var15 = new Class386(var6 + var14, var17 + var20, var8++);
                    this.Field16[var16].addElement(var15);
                    if (Class802.Field1(var6, var17, var6 + var14, var17 + var20) >= Class802.Field1(var6, var17, var9.Field1, var9.Field2) - 20) {
                        break;
                    }

                    ++var12;
                }
            }

            for (var5 = 0; var5 < this.Field16.length; ++var5) {
                var6 = this.Field16[var5].size();
                (var7 = (Class386) var1.elementAt(var5)).Field3 = (byte) (this.Field16[var5].size() - 1);
                var7.Field6 = -1;
                (var18 = new Class386(var7.Field1, var7.Field2, var7.Field3)).Field6 = -1;
                this.Field16[var5].addElement(var18);

                for (var8 = 1; var8 < var6; ++var8) {
                    var9 = (Class386) this.Field16[var5].elementAt(var8);
                    var10 = Class804.Field13(2);

                    for (var11 = 0; var11 < var10; ++var11) {
                        var12 = 180 + Class804.Field13(180);
                        var14 = (var20 = 5 + Class804.Field13(10)) * Class802.Field2(Class802.Field3(var12)) >> 10;
                        var20 = -(var20 * Class802.Field1(Class802.Field3(var12))) >> 10;
                        (var15 = new Class386(var9.Field1 + var14, var9.Field2 + var20, var8)).Field6 = 0;
                        this.Field16[var5].addElement(var15);
                    }
                }
            }

        }
    }

    private static int Field1(Vector var0) {
        int var1 = 0;

        int var2;
        for (var2 = 0; var2 < var0.size(); ++var2) {
            if (((Class386) var0.elementAt(var2)).Field6 != -1) {
                ++var1;
            }
        }

        if (var1 != 0) {
            var1 = Class804.Field13(var1);
            var2 = 0;

            for (int var3 = 0; var3 < var0.size(); ++var3) {
                if (((Class386) var0.elementAt(var3)).Field6 != -1) {
                    ++var2;
                    if (var1 == var2) {
                        return var3;
                    }
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    private static int Field2(Vector var0) {
        int var1 = 0;

        int var2;
        for (var2 = 0; var2 < var0.size(); ++var2) {
            if (((Class386) var0.elementAt(var2)).Field6 == -1) {
                ++var1;
            }
        }

        if (var1 != 0) {
            var1 = Class804.Field13(var1);
            var2 = 0;

            for (int var3 = 0; var3 < var0.size(); ++var3) {
                Class386 var4;
                if ((var4 = (Class386) var0.elementAt(var3)).Field6 == -1) {
                    if (var1 == var2) {
                        var4.Field6 = 0;
                        return var3;
                    }

                    ++var2;
                }
            }

            return -1;
        } else {
            return -1;
        }
    }

    public final void Field1() {
        if (Class105.Field12 % 2 == 1) {
            this.Field17.Field3 = -1;
            this.Field17.Field6 = -1;

            for (int var1 = 0; var1 < this.Field1.size(); ++var1) {
                Class386 var2;
                (var2 = (Class386) this.Field1.elementAt(var1)).Field6 = -1;
                var2.Field3 = -1;
            }

            if (this.Field20 && this.Field21 && this.Field1.size() > 1 && System.currentTimeMillis() / 10L - this.Field19 > 30L) {
                this.Field19 = System.currentTimeMillis() / 10L;
                this.Field17 = (Class386) this.Field1.elementAt(0);
                this.Field1.removeElementAt(0);
            }

            this.Field1(this.Field1, this.Field17, this.Field20);
            if (System.currentTimeMillis() / 10L - this.Field18 > (long) (60 + (this.Field20 ? 20 : 0))) {
                this.Field24 = 7;
                Class74.Field2.removeElement(this);
            }

            ++this.Field18;
        }

    }

    public final void Field1(Graphics var1) {
        this.Field23 = 0;
        Class804.Field34.Field1(this.Field22 / 3, this.Field17.Field1, this.Field17.Field2, 0, 3, var1);
        ++this.Field22;
        if (this.Field22 >= 12) {
            this.Field22 = 0;
        }

        if (this.Field16 != null) {
            for (int var2 = 0; var2 < this.Field16.length; ++var2) {
                for (int var3 = 0; var3 < this.Field16[var2].size(); ++var3) {
                    Class386 var4;
                    if ((var4 = (Class386) this.Field16[var2].elementAt(var3)).Field3 >= 0 && var4.Field3 < this.Field16[var2].size()) {
                        Class386 var5 = (Class386) this.Field16[var2].elementAt(var4.Field3);
                        var1.setColor(Field15[0]);
                        var1.drawLine(var4.Field1, var4.Field2, var5.Field1, var5.Field2);
                        if (var4.Field6 == -1) {
                            var1.setColor(Field15[1]);
                            var1.drawLine(var4.Field1 - 1, var4.Field2, var5.Field1 - 1, var5.Field2);
                            if (this.Field20 && this.Field21) {
                                var1.drawLine(var4.Field1 + 1, var4.Field2, var5.Field1 + 1, var5.Field2);
                            }
                        }

                        if (this.Field20 && this.Field21) {
                            ++this.Field23;
                            if (this.Field23 >= this.Field24) {
                                this.Field24 += 7;
                                return;
                            }
                        }
                    }
                }

                Class386 var8 = (Class386) this.Field1.elementAt(var2);
                Class804.Field6(32);
                if (Class804.Field35 != null) {
                    Class804.Field35.Field1(1 + var8.Field4 / 4, var8.Field1, var8.Field2, 0, 3, var1);
                }

                ++var8.Field4;
                if (var8.Field4 >= 12) {
                    var8.Field4 = 0;
                }
            }
        }

    }
}
