package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public class Class126 extends Class114 {
    public boolean Field1 = false;
    public Class114 Field32;
    public static final byte[][][] Field33 = new byte[][][]{{{0, 1, 2, 3}, {4, 5, 6, 7}, {8, 9, 10, 11}, {12, 13, 14, 15}}, {{0, 1, 2, 3}, {4, 5, 6, 7}, {0, 1, 2, 3}, {4, 5, 6, 7}}, {{0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2, 3}, {0, 1, 2, 3}}, {{0, 1, 2, 3}, {4, 5, 6, 7}, {0, 1, 2, 3}, {4, 5, 6, 7}}, {new byte[4], new byte[4], new byte[4], new byte[4]}};
    public Class432 Field34;
    public Class114 Field35;
    public int Field36 = -1;
    public short Field37;
    public short Field38;
    public short Field39;
    public short Field40;
    public short Field41;
    public short Field42;
    long Field43;
    public boolean Field44 = false;
    int Field45;
    int Field46;
    byte[] Field47 = new byte[]{1, 4, 0, 2, 3};
    boolean Field48 = false;
    long Field49;
    long Field50;
    int Field51;
    int Field52;
    short Field53 = -100;
    byte Field54;
    byte Field55;
    public short Field56 = 60;
    public boolean Field57 = false;
    public long Field58 = System.currentTimeMillis();
    int Field59 = 12;
    public int Field60 = 0;
    public int Field61 = 0;

    public Class126() {
        super.Field12 = (byte) Class114.Field30.nextInt(4);
        this.Field52 = Class811.Field1(10, 20);
        super.Field204 = 0;
        this.Field51 = 0;
        this.Field39 = this.Field40 = this.Field41 = 0;
    }

    public final String a_() {
        if (Class811.Field46 == null) {
            return "";
        } else {
            return Class811.Field46[this.Field42] == null ? "" : Class811.Field46[this.Field42].Field12;
        }
    }

    public final void Field1(short var1) {
        this.Field42 = var1;
        if (Class811.Field46 != null && Class811.Field46[var1] == null) {
            Class811.Field46[var1] = new Class50();
            Class261.Field1().Field4((int) 0, (int) this.Field42);
        }

        this.Field43 = System.currentTimeMillis() + 10000L;
    }

    public final void Field18() {
        this.Field32 = null;
        if (super.Field204 != 5) {
            super.Field204 = 7;
        }

    }

    public final void Field1(Class114 var1) {
        this.Field32 = var1;
        super.Field204 = 6;
    }

    public final void Field19() {
    }

    public void Field1(Graphics var1) {
        if ((super.Field193 < Class62.Field8 ? false : (super.Field193 > Class62.Field8 + Class106.Field13 ? false : (super.Field194 < Class62.Field9 ? false : super.Field194 <= Class62.Field9 + Class106.Field14 + 30))) && super.Field204 != 8 && super.Field4 > 0) {
            this.Field1(var1, super.Field193, super.Field194, false);
            if (!super.Field27) {
                if (super.Field6 != 0) {
                    super.Field23 = 3;
                }

                if (Class811.Field46[this.Field42] != null) {
                    byte var2 = Field33[Class811.Field46[this.Field42].Field2][super.Field12][super.Field23];
                    byte var3 = 0;
                    byte var4 = 0;
                    if (Class811.Field46[this.Field42].Field1 != null) {
                        var3 = Class811.Field46[this.Field42].Field9;
                        var4 = Class811.Field46[this.Field42].Field10;
                    }

                    if (super.Field29 != null) {
                        for (int var5 = 0; var5 < super.Field29.size(); ++var5) {
                            ((Class48) super.Field29.elementAt(var5)).Field1(var1, super.Field193, super.Field194);
                        }
                    }

                    var1.drawImage(Class811.Field10, super.Field193 + var3, super.Field194 + var4, 3);
                    Class811.Field46[this.Field42].Field1(var1, super.Field193 + super.Field10, super.Field194 + super.Field11 + super.Field16 + super.Field6, 0, 0, var2);
                }

                int var6;
                for (var6 = 0; var6 < super.Field213.size(); ++var6) {
                    ((Class829) super.Field213.elementAt(var6)).Field1(var1);
                }

                if (super.Field28 != null) {
                    for (var6 = 0; var6 < super.Field28.size(); ++var6) {
                        ((Class48) super.Field28.elementAt(var6)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }

            this.Field2(var1, super.Field193, super.Field194, false);
            super.Field1(var1);
        }
    }

    public void a_(Graphics var1, int var2, int var3) {
        if (super.Field6 != 0) {
            super.Field23 = 3;
        }

        try {
            byte var5 = Field33[Class811.Field46[this.Field42].Field2][0][super.Field23];
            var1.drawRegion(Class811.Field46[this.Field42].Field1, 0, var5 * Class811.Field46[this.Field42].Field6, Class811.Field46[this.Field42].Field5, Class811.Field46[this.Field42].Field6, 0, var2 - Class811.Field46[this.Field42].Field7, 0, 0);
            var1.drawRegion(Class811.Field27, this.Field47[super.Field24] << 4, 0, 16, 16, 0, var2 - 15, 23, 20);
        } catch (Exception var4) {
        }
    }

    public final void Field20() {
        for (int var1 = 0; var1 < super.Field213.size(); ++var1) {
            Class829 var2;
            (var2 = (Class829) super.Field213.elementAt(var1)).Field1();
            if (var2.Field10) {
                super.Field213.removeElementAt(var1);
            } else {
                var2.Field1(super.Field193, var2.Field2() ? super.Field194 - 12 : super.Field194);
            }
        }

    }

    public void Field1(int var1, int var2) {
        super.Field204 = 5;
        this.Field39 = 0;
        this.Field40 = (short) var1;
        this.Field41 = (short) var2;
        if (this.Field44) {
            Class106.Field19.Field1(super.Field193, super.Field194);
            super.Field187 = true;
        }

    }

    public void Field2() {
        this.Field10();
        super.Field17 = Class811.Field46[this.Field42].Field3;
        if ((super.Field187 || super.Field4 <= 0) && super.Field212 != -1 && super.Field204 != 8) {
            super.Field204 = 8;
        }

        if (!this.Field57 && System.currentTimeMillis() - this.Field58 > 15000L) {
            this.Field58 = System.currentTimeMillis();
            Class106.Field19.Field28.Field3(super.Field189);
        }

        if (Class811.Field46 != null) {
            if (Class811.Field46[this.Field42] == null) {
                if (!this.Field48 && System.currentTimeMillis() > this.Field43) {
                    this.Field48 = false;
                    Class261.Field1().Field4((int) 0, (int) this.Field42);
                    this.Field43 = System.currentTimeMillis() + 10000L;
                }
            } else if (!this.Field48) {
                this.Field1(this.Field42);
                this.Field48 = true;
                super.Field17 = Class811.Field46[this.Field42].Field3;
                super.Field195 = Class811.Field46[this.Field42].Field4;
                if (Class811.Field46[this.Field42].Field1 == null) {
                    Class811.Field46[this.Field42].Field2();
                }
            }
        }

        if (super.Field205 && System.currentTimeMillis() > super.Field208) {
            super.Field205 = false;
        }

        this.Field5();
        this.Field20();
        super.Field2();
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

        this.Field6();
        switch (super.Field204) {
            case 0:
                super.Field23 = 0;
                ++this.Field51;
                if (this.Field51 > this.Field52 && this.Field36 == -1) {
                    short var1 = (short) (super.Field197 - this.Field56);
                    short var2 = (short) (super.Field197 + this.Field56);
                    short var3 = (short) (super.Field198 - this.Field56);
                    short var4 = (short) (super.Field198 + this.Field56);
                    byte var5 = (byte) Class114.Field30.nextInt(4);
                    if (this.Field53 != -100 && this.Field53 == var5) {
                        if (var5 == 2) {
                            var5 = 3;
                        } else if (var5 == 3) {
                            var5 = 2;
                        } else if (var5 == 1) {
                            var5 = 0;
                        } else if (var5 == 0) {
                            var5 = 1;
                        }
                    }

                    if (var5 == 2) {
                        this.Field54 = (byte) (-super.Field17);
                        this.Field55 = 0;
                        if (Math.abs(super.Field193 - var1) < 32) {
                            var5 = 3;
                            this.Field54 = (byte) super.Field17;
                        }
                    } else if (var5 == 3) {
                        this.Field54 = (byte) super.Field17;
                        this.Field55 = 0;
                        if (Math.abs(super.Field193 - var2) < 32) {
                            var5 = 2;
                            this.Field54 = (byte) (-super.Field17);
                        }
                    } else if (var5 == 1) {
                        this.Field54 = 0;
                        this.Field55 = (byte) (-super.Field17);
                        if (Math.abs(super.Field194 - var3) < 32) {
                            var5 = 0;
                            this.Field55 = (byte) super.Field17;
                        }
                    } else if (var5 == 0) {
                        this.Field54 = 0;
                        this.Field55 = (byte) super.Field17;
                        if (Math.abs(super.Field194 - var4) < 32) {
                            var5 = 1;
                            this.Field55 = (byte) (-super.Field17);
                        }
                    }

                    super.Field12 = var5;
                    super.Field204 = 2;
                    this.Field51 = 0;
                }
            case 1:
            default:
                break;
            case 2:
            case 6:
            case 7:
                ++this.Field39;
                if (this.Field39 > 6) {
                    this.Field39 = 0;
                }

                if (this.Field39 > 2) {
                    super.Field23 = 1;
                } else {
                    super.Field23 = 0;
                }

                if (this.Field8()) {
                    if (this.Field36 > -1) {
                        this.Field4();
                    } else if (super.Field204 == 7) {
                        this.Field2(super.Field197, super.Field198);
                    } else if (super.Field204 == 2) {
                        this.Field4();
                    } else if (this.Field32 == null) {
                        this.Field39 = this.Field40 = this.Field41 = 0;
                        super.Field204 = 0;
                        this.Field52 = Class811.Field1(10, 20);
                        this.Field54 = this.Field55 = 0;
                        this.Field53 = super.Field12;
                    } else if (this.Field32 != null && Math.abs(super.Field193 - this.Field32.Field193) <= this.Field59 && Math.abs(super.Field194 - this.Field32.Field194) <= this.Field59) {
                        this.Field54 = this.Field55 = 0;
                    } else {
                        this.Field2(this.Field32.Field193 + this.Field45, this.Field32.Field194 + this.Field46);
                    }
                }
                break;
            case 3:
                super.Field23 = 2;
                ++this.Field39;
                if (this.Field39 > 6) {
                    this.Field39 = 0;
                    super.Field204 = 2;
                } else if (this.Field34 != null) {
                    this.Field34.Field1(this);
                }
                break;
            case 4:
                super.Field23 = 3;
                ++this.Field39;
                if (this.Field39 == 5) {
                    Class106.Field19.Field1(super.Field193, super.Field194);
                }

                if (this.Field39 > 7) {
                    this.Field39 = 0;
                    super.Field204 = 0;
                }
                break;
            case 5:
                super.Field23 = 3;
                ++this.Field39;
                if (!this.Field1) {
                    super.Field193 += this.Field40;
                    super.Field194 += this.Field41;
                }

                this.Field40 = (short) (this.Field40 >> 1);
                this.Field41 = (short) (this.Field41 >> 1);
                if (this.Field39 == 5) {
                    Class106.Field19.Field1(super.Field193, super.Field194);
                    this.Field50 = System.currentTimeMillis() + (long) super.Field212;
                }

                this.Field44 = true;
                this.Field49 = System.currentTimeMillis() / 1000L + 3L;
                if (this.Field39 > 7) {
                    this.Field44 = false;
                    super.Field187 = true;
                }
                break;
            case 8:
                if (Class106.Field19.Field16 != null && Class106.Field19.Field16 == this && Class106.Field19.Field15.Field204 == 0) {
                    Class106.Field19.Field16 = null;
                }

                if (this.Field50 - System.currentTimeMillis() < 0L) {
                    super.Field187 = false;
                    this.Field44 = false;
                    super.Field12 = (byte) Class114.Field30.nextInt(4);
                    this.Field52 = Class811.Field1(10, 20);
                    super.Field204 = 0;
                    this.Field51 = 0;
                    this.Field39 = this.Field40 = this.Field41 = 0;
                    super.Field193 = this.Field37 = super.Field197;
                    super.Field194 = this.Field38 = super.Field198;
                    super.Field4 = super.Field5;
                    Class106.Field19.Field1(super.Field193, super.Field194);
                    this.Field50 = System.currentTimeMillis() + (long) super.Field212;
                }
        }

        if (this.Field44 && this.Field49 - System.currentTimeMillis() / 1000L <= 0L && !super.Field187) {
            Class106.Field19.Field1(super.Field193, super.Field194);
            super.Field187 = true;
            super.Field211 = false;
        }

        if (super.Field4 <= 0 && Class106.Field19.Field16 != null && Class106.Field19.Field16 == this) {
            Class106.Field19.Field16 = null;
        }

    }

    public final void Field2(int var1, int var2) {
        if (Class811.Field46[this.Field42].Field2 == 4) {
            this.Field39 = this.Field40 = this.Field41 = 0;
            super.Field204 = 0;
        } else {
            boolean var3 = false;
            boolean var4 = false;
            int var5 = Math.abs(super.Field193 - var1);
            int var6 = Math.abs(super.Field194 - var2);
            if (var5 <= super.Field17) {
                super.Field193 = (short) var1;
                var3 = true;
            }

            if (var6 < super.Field17) {
                super.Field194 = (short) var2;
                var4 = true;
            }

            if (var3 && var4) {
                this.Field39 = this.Field40 = this.Field41 = 0;
                super.Field204 = 0;
                this.Field52 = Class811.Field1(10, 20);
                this.Field54 = this.Field55 = 0;
                this.Field53 = super.Field12;
            } else if (super.Field193 < var1) {
                super.Field193 += super.Field17;
                super.Field12 = 3;
            } else if (super.Field193 > var1) {
                super.Field193 -= super.Field17;
                super.Field12 = 2;
            } else if (super.Field194 > var2) {
                super.Field194 -= super.Field17;
                super.Field12 = 1;
            } else {
                if (super.Field194 < var2) {
                    super.Field12 = 0;
                    super.Field194 += super.Field17;
                }

            }
        }
    }

    public void Field4() {
        if (Class811.Field46[this.Field42].Field2 == 4) {
            this.Field39 = this.Field40 = this.Field41 = 0;
            super.Field204 = 0;
        } else if (this.Field36 != -1) {
            boolean var10 = false;
            boolean var11 = false;
            int var12 = Math.abs(super.Field193 - this.Field37);
            int var13 = Math.abs(super.Field194 - this.Field38);
            if (var12 <= super.Field17) {
                super.Field193 = this.Field37;
                var10 = true;
            }

            if (var13 < super.Field17) {
                super.Field194 = this.Field38;
                var11 = true;
            }

            if (var10 && var11) {
                this.Field39 = this.Field40 = this.Field41 = 0;
                super.Field204 = 0;
            } else if (super.Field193 < this.Field37) {
                super.Field193 += super.Field17;
                super.Field12 = 3;
            } else if (super.Field193 > this.Field37) {
                super.Field193 -= super.Field17;
                super.Field12 = 2;
            } else if (super.Field194 > this.Field38) {
                super.Field194 -= super.Field17;
                super.Field12 = 1;
            } else {
                if (super.Field194 < this.Field38) {
                    super.Field12 = 0;
                    super.Field194 += super.Field17;
                }

            }
        } else {
            short var1 = (short) (super.Field197 - this.Field56 + super.Field17);
            short var2 = (short) (super.Field197 + this.Field56 - super.Field17);
            short var3 = (short) (super.Field198 - this.Field56 + super.Field17);
            short var4 = (short) (super.Field198 + this.Field56 - super.Field17);
            int var5 = super.Field193 - super.Field17;
            int var6 = super.Field193 + super.Field17;
            int var7 = super.Field194 - super.Field17;
            int var8 = super.Field194 + super.Field17;
            int var9 = Class114.Field30.nextInt(50);
            if (super.Field193 >= var2 && super.Field12 == 3 || super.Field193 <= var1 && super.Field12 == 2 || super.Field194 <= var3 && super.Field12 == 1 || super.Field194 >= var4 && super.Field12 == 0 || Class455.Field1(var5, super.Field194, 2) && super.Field12 == 2 || Class455.Field1(var6, super.Field194, 2) && super.Field12 == 3 || Class455.Field1(super.Field193, var7, 2) && super.Field12 == 1 || Class455.Field1(super.Field193, var8, 2) && super.Field12 == 0 || var9 == 5) {
                this.Field39 = this.Field40 = this.Field41 = 0;
                super.Field204 = 0;
                this.Field52 = Class811.Field1(10, 20);
                this.Field54 = this.Field55 = 0;
                this.Field53 = super.Field12;
            }

            super.Field193 = (short) (super.Field193 + this.Field54);
            super.Field194 = (short) (super.Field194 + this.Field55);
        }
    }

    public void Field1(short var1, short var2) {
        if (this.Field36 > -1) {
            if (super.Field204 != 3 && super.Field193 == var1 && super.Field194 == var2) {
                super.Field204 = 0;
                return;
            }

            this.Field37 = var1;
            if (Class811.Field46[this.Field42].Field2 == 4) {
                this.Field38 = var2;
            } else {
                this.Field38 = (short) (var2 - 4 + Class106.Field20.nextInt() % 8);
            }

            if (super.Field204 != 3) {
                super.Field204 = 2;
            }

            if (super.Field204 != 3 && super.Field193 == this.Field37 && super.Field194 == this.Field38) {
                super.Field204 = 0;
                return;
            }
        }

    }

    public void Field1(Class184 var1) {
        super.Field212 = var1.Field7;
        int[] var2 = new int[]{16, 32, 48, -16, -32, -48};
        this.Field45 = var2[Class114.Field30.nextInt(var2.length - 1)];
        this.Field46 = var2[Class114.Field30.nextInt(var2.length - 1)];
        if (this.Field1) {
            super.Field193 = var1.Field2;
            super.Field194 = var1.Field3;
        } else {
            this.Field37 = var1.Field2;
            this.Field38 = var1.Field3;
        }

        this.Field59 = Class114.Field30.nextInt(10) + 6;
        super.Field2 = super.Field4 = var1.Field5;
        super.Field24 = var1.Field9;
        super.Field204 = 0;
        this.Field39 = 0;
        this.Field40 = 0;
        this.Field41 = 0;
        this.Field42 = var1.Field8;
        if (Class811.Field46 != null && Class811.Field46[this.Field42] != null) {
            super.Field17 = Class811.Field46[this.Field42].Field3;
            super.Field195 = Class811.Field46[this.Field42].Field4;
            if (Class811.Field46[this.Field42].Field1 == null) {
                Class811.Field46[this.Field42].Field2();
            }
        }

        super.Field22 = (byte) var1.Field4;
        super.Field5 = var1.Field6;
        this.Field57 = true;
    }

    public final void Field21() {
        super.Field204 = 3;
        this.Field39 = this.Field40 = this.Field41 = 0;
    }

    public final void Field1(Class114 var1, int var2, byte var3, byte var4) {
        super.Field204 = 3;
        this.Field39 = this.Field40 = this.Field41 = 0;
        this.Field60 = var2;
        this.Field35 = var1;
        this.Field34 = Class599.Field6(8, 4);
    }

    public void Field1(Vector var1, byte var2) {
        super.Field204 = 3;
        this.Field39 = this.Field40 = this.Field41 = 0;
        if (this.Field42 == 90) {
            this.Field34 = Class599.Field1();
            this.Field34.Field1(var1);
        }

    }

    public void Field1() {
        if (!this.Field1) {
            super.Field6 = -3;
            super.Field7 = -5;
        }

    }

    public final void Field4(int var1) {
        super.Field4 -= var1;
    }

    public void Field2(int var1) {
        super.Field2 = var1;
        super.Field4 = super.Field2;
        super.Field3 = 20;
    }

    public final boolean Field22() {
        return true;
    }

    public final boolean Field23() {
        return this.Field1;
    }
}
