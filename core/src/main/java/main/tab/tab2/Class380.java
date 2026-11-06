package main.tab.tab2;

import main.lib.Graphics;

public final class Class380 extends Class51 {
    private int Field2;
    private int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    private Class114 Field14;
    private int Field15;
    private int Field16;
    private Class193 Field17;
    private int Field18;
    private boolean Field19;

    public Class380(Class114 var1, Class114 var2, int var3) {
        this.Field8 = var3;
        this.Field14 = var2;
        this.Field6 = var1.Field193;
        this.Field7 = var1.Field194 - 54;
        this.Field11 = var2.Field193;
        this.Field12 = var2.Field194;
        this.Field5 = Class809.Field1(this.Field6 - var2.Field193, var2.Field194 - (var2.Field195 >> 1) - this.Field7);
        this.Field2 = 24;
        this.Field3 = this.Field2 * Class809.Field2(this.Field5) >> 10;
        this.Field4 = this.Field2 * Class809.Field1(this.Field5) >> 10;
        this.Field13 = var2.Field195;
        if (var3 < 6) {
            this.Field17 = new Class193(this.Field11, this.Field12, var3 == 3 ? 1 : 0, 0, 0, 0, false, false);
            Class73.Field1.addElement(this.Field17);
        }

        this.Field7 = var1.Field194 - 31;
        if (var1.Field12 == 2) {
            this.Field6 = var1.Field193 - 30;
        } else if (var1.Field12 == 3) {
            this.Field6 = var1.Field193 + 30;
        }

        int var4 = Class804.Field2(Class809.Field1(var2.Field193 - this.Field6, -(var2.Field194 + (var2.Field195 >> 1) - this.Field7)));
        this.Field15 = Class804.Field5[var4];
        this.Field16 = Class804.Field4[var4];
    }

    public final void Field1(Graphics var1) {
        if (!this.Field19) {
            if (Class811.Field3(this.Field8) != null && this.Field8 != 6 && this.Field8 != 7) {
                var1.drawRegion(Class811.Field3(this.Field8), 0, this.Field15 * Class804.Field3[1][this.Field8], Class804.Field3[0][this.Field8], Class804.Field3[1][this.Field8], this.Field16, this.Field6, this.Field7, 3);
                return;
            }
        } else if (Class811.Field4(38) != null) {
            var1.drawRegion(Class811.Field4(38), 0, this.Field18 * 27, 27, 27, 0, this.Field11, this.Field12, 33);
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, byte var5, Class114 var6, Class114 var7) {
    }

    public final void Field1(int var1) {
    }

    public final void Field1() {
        if (this.Field14 != null) {
            this.Field11 = this.Field14.Field193;
            this.Field12 = this.Field14.Field194;
        }

        this.Field9 = this.Field11 - this.Field6;
        this.Field10 = this.Field12 - (this.Field13 >> 1) - this.Field7;
        this.Field5 = Class809.Field1(this.Field9, this.Field10);
        this.Field3 = this.Field2 * Class809.Field2(this.Field5) >> 10;
        this.Field4 = this.Field2 * Class809.Field1(this.Field5) >> 10;
        this.Field6 += this.Field3;
        this.Field7 += this.Field4;
        if (!this.Field19) {
            if (this.Field8 < 6) {
                Class73.Field1(this.Field6, this.Field7, this.Field8 == 3 ? 8 : 6);
            } else if (this.Field8 == 6) {
                Class73.Field1(this.Field6, this.Field7, 46);
            }
        }

        if (Class811.Field1(this.Field6 - 20, this.Field6 + 20, this.Field11 - this.Field13 / 2, this.Field11 + this.Field13 / 2, this.Field7 - 20, this.Field7 + 20, this.Field12 - this.Field13 / 2, this.Field12 + this.Field13 / 2)) {
            if (!this.Field19) {
                if (this.Field8 == 3) {
                    Field1(this.Field14, 0, 0, 18);
                    Field1(this.Field14, 1, 0, 24);
                    Field1(this.Field14, 2, 0, 28);
                    Field1(this.Field14, 3, 0, 32);
                } else if (this.Field8 < 6) {
                    Class73.Field1(this.Field11, this.Field12 - 10, 30);
                    if (Class106.Field19.Field13.contains(this)) {
                        Class106.Field19.Field13.removeElement(this);
                    }

                    if (Class62.Field12.contains(this)) {
                        Class62.Field12.removeElement(this);
                    }

                    this.Field14.Field12();
                    Field1(this.Field14, 0, 1, 40);
                    Field1(this.Field14, 1, 1, 40);
                    Field1(this.Field14, 2, 1, 40);
                    Field1(this.Field14, 3, 1, 40);
                } else if (this.Field8 == 6) {
                    if (Class106.Field19.Field13.contains(this)) {
                        Class106.Field19.Field13.removeElement(this);
                    }

                    if (Class62.Field12.contains(this)) {
                        Class62.Field12.removeElement(this);
                    }

                    this.Field14.Field12();
                }
            }

            this.Field19 = true;
        }

        if (this.Field19 && Class106.Field12 % 2 == 0) {
            ++this.Field18;
            if (this.Field18 > 4) {
                if (Class106.Field19.Field13.contains(this)) {
                    Class106.Field19.Field13.removeElement(this);
                }

                if (Class62.Field12.contains(this)) {
                    Class62.Field12.removeElement(this);
                }

                this.Field19 = false;
                this.Field18 = 0;
            }
        }

    }

    private static void Field1(Class114 var0, int var1, int var2, int var3) {
        Class198 var4 = new Class198(var0, var1, var2, var3);
        Class73.Field2.addElement(var4);
    }
}
