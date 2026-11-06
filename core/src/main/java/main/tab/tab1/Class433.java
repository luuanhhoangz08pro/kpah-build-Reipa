package main.tab.tab1;

import main.lib.Graphics;

public final class Class433 {
    private int Field7;
    public int Field1;
    private int Field8;
    public int Field2;
    private int Field9;
    private int Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    private int Field14;
    private int Field15;
    private int Field16;
    private int Field17;
    public int Field3;
    private int Field18;
    private int Field19;
    private int[] Field20 = new int[3];
    public boolean Field4;
    private boolean Field21;
    private int Field22;
    private int Field23;
    public int Field5;
    private int Field24;
    private boolean Field25 = true;
    public boolean Field6;

    public final void Field1() {
        this.Field7 = 0;
        this.Field1 = 0;
        this.Field8 = 0;
        this.Field2 = 0;
        this.Field9 = 0;
        this.Field10 = 0;
        this.Field11 = 0;
        this.Field12 = 0;
        this.Field17 = 0;
        this.Field3 = 0;
        this.Field15 = 0;
        this.Field16 = 0;
    }

    public final void Field1(Graphics var1, int var2, int var3, int var4, int var5) {
        var1.setClip(var2, var3, var4, var5 - 1);
        var1.translate(-var1.getTranslateX(), -var1.getTranslateY());
        var1.translate(-this.Field8, -this.Field2);
    }

    public final Class47 Field2() {
        int var1;
        int var2;
        int var3;
        int var4;
        Class433 var5;
        byte var6;
        boolean var7;
        Class47 var8;
        if (this.Field25) {
            var1 = (var5 = this).Field13;
            var2 = var5.Field14;
            var3 = var5.Field15;
            var4 = var5.Field16;
            if (Class105.Field8) {
                if (!var5.Field4 && Class105.Field2(var1, var2, var3, var4)) {
                    for (var3 = 0; var3 < var5.Field20.length; ++var3) {
                        var5.Field20[0] = Class105.Field11;
                    }

                    var5.Field19 = Class105.Field11;
                    var5.Field4 = true;
                    var5.Field23 = -1;
                    var5.Field21 = var5.Field22 != 0;
                    var5.Field22 = 0;
                } else if (var5.Field4) {
                    ++var5.Field18;
                    if (var5.Field18 > 5 && var5.Field19 == Class105.Field11 && !var5.Field21) {
                        var5.Field19 = -1000;
                        if (var5.Field24 > 1) {
                            var3 = (var5.Field1 + Class105.Field11 - var2) / var5.Field5;
                            var4 = (var5.Field7 + Class105.Field10 - var1) / var5.Field5;
                            var5.Field23 = var3 * var5.Field24 + var4;
                        } else {
                            var5.Field23 = (var5.Field1 + Class105.Field11 - var2) / var5.Field5;
                        }
                    }

                    if ((var3 = Class105.Field11 - var5.Field20[0]) != 0 && var5.Field23 != -1) {
                        var5.Field23 = -1;
                    }

                    for (var4 = var5.Field20.length - 1; var4 > 0; --var4) {
                        var5.Field20[var4] = var5.Field20[var4 - 1];
                    }

                    var5.Field20[0] = Class105.Field11;
                    var5.Field1 -= var3;
                    if (var5.Field1 < 0) {
                        var5.Field1 = 0;
                    }

                    if (var5.Field1 > var5.Field3) {
                        var5.Field1 = var5.Field3;
                    }

                    if (var5.Field2 < 0 || var5.Field2 > var5.Field3) {
                        var3 /= 2;
                    }

                    var5.Field2 -= var3;
                }
            }

            var7 = false;
            if (Class105.Field9 && var5.Field4) {
                var4 = Class105.Field11 - var5.Field20[0];
                Class105.Field9 = false;
                if (Math.abs(var4) < 20 && Math.abs(Class105.Field11 - var5.Field19) < 20 && !var5.Field21) {
                    var5.Field22 = 0;
                    var5.Field1 = var5.Field2;
                    var5.Field19 = -1000;
                    if (var5.Field24 > 1) {
                        var2 = (var5.Field1 + Class105.Field11 - var2) / var5.Field5;
                        var1 = (var5.Field7 + Class105.Field10 - var1) / var5.Field5;
                        var5.Field23 = var2 * var5.Field24 + var1;
                    } else {
                        var5.Field23 = (var5.Field1 + Class105.Field11 - var2) / var5.Field5;
                    }

                    var5.Field18 = 0;
                    var7 = true;
                } else if (var5.Field23 != -1 && var5.Field18 > 5) {
                    var5.Field18 = 0;
                    var7 = true;
                } else if (var5.Field23 == -1 && !var5.Field21) {
                    if (var5.Field2 < 0) {
                        var5.Field1 = 0;
                    } else if (var5.Field2 > var5.Field3) {
                        var5.Field1 = var5.Field3;
                    } else {
                        if ((var2 = Class105.Field11 - var5.Field20[0] + (var5.Field20[0] - var5.Field20[1]) + (var5.Field20[1] - var5.Field20[2])) > 10) {
                            var6 = 10;
                        } else if (var2 < -10) {
                            var6 = -10;
                        } else {
                            var6 = 0;
                        }

                        var5.Field22 = -var6 * 100;
                    }
                }

                var5.Field4 = false;
                var5.Field18 = 0;
                Class105.Field9 = false;
            }

            (var8 = new Class47()).Field2 = var5.Field23;
            var8.Field3 = var7;
            var8.Field1 = var5.Field4;
            return var8;
        } else {
            var1 = (var5 = this).Field13;
            var2 = var5.Field14;
            var3 = var5.Field15;
            var4 = var5.Field16;
            if (Class105.Field8) {
                if (!var5.Field4 && Class105.Field2(var1, var2, var3, var4)) {
                    for (var3 = 0; var3 < var5.Field20.length; ++var3) {
                        var5.Field20[0] = Class105.Field10;
                    }

                    var5.Field19 = Class105.Field10;
                    var5.Field4 = true;
                    var5.Field23 = -1;
                    var5.Field21 = var5.Field22 != 0;
                    var5.Field22 = 0;
                } else if (var5.Field4) {
                    ++var5.Field18;
                    if (var5.Field18 > 5 && var5.Field19 == Class105.Field10 && !var5.Field21) {
                        var5.Field19 = -1000;
                        var5.Field23 = (var5.Field7 + Class105.Field10 - var1) / var5.Field5;
                    }

                    if ((var3 = Class105.Field10 - var5.Field20[0]) != 0 && var5.Field23 != -1) {
                        var5.Field23 = -1;
                    }

                    for (var4 = var5.Field20.length - 1; var4 > 0; --var4) {
                        var5.Field20[var4] = var5.Field20[var4 - 1];
                    }

                    var5.Field20[0] = Class105.Field10;
                    var5.Field7 -= var3;
                    if (var5.Field7 < 0) {
                        var5.Field7 = 0;
                    }

                    if (var5.Field7 > var5.Field17) {
                        var5.Field7 = var5.Field17;
                    }

                    if (var5.Field8 < 0 || var5.Field8 > var5.Field17) {
                        var3 /= 2;
                    }

                    var5.Field8 -= var3;
                }
            }

            var7 = false;
            if (Class105.Field9 && var5.Field4) {
                var4 = Class105.Field10 - var5.Field20[0];
                Class105.Field9 = false;
                if (Math.abs(var4) < 20 && Math.abs(Class105.Field10 - var5.Field19) < 20 && !var5.Field21) {
                    var5.Field22 = 0;
                    var5.Field7 = var5.Field8;
                    var5.Field19 = -1000;
                    var5.Field23 = (var5.Field7 + Class105.Field10 - var1) / var5.Field5;
                    var5.Field18 = 0;
                    var7 = true;
                } else if (var5.Field23 != -1 && var5.Field18 > 5) {
                    var5.Field18 = 0;
                    var7 = true;
                } else if (var5.Field23 == -1 && !var5.Field21) {
                    if (var5.Field8 < 0) {
                        var5.Field7 = 0;
                    } else if (var5.Field8 > var5.Field17) {
                        var5.Field7 = var5.Field17;
                    } else {
                        if ((var2 = Class105.Field10 - var5.Field20[0] + (var5.Field20[0] - var5.Field20[1]) + (var5.Field20[1] - var5.Field20[2])) > 10) {
                            var6 = 10;
                        } else if (var2 < -10) {
                            var6 = -10;
                        } else {
                            var6 = 0;
                        }

                        var5.Field22 = -var6 * 100;
                    }
                }

                var5.Field4 = false;
                var5.Field18 = 0;
                Class105.Field9 = false;
            }

            (var8 = new Class47()).Field2 = var5.Field23;
            var8.Field3 = var7;
            var8.Field1 = var5.Field4;
            return var8;
        }
    }

    public final void Field3() {
        int var1 = this.Field13;
        int var2 = this.Field14;
        int var3 = this.Field15;
        int var4 = this.Field16;
        if (Class105.Field2(var1, var2, var3, var4) && Class105.Field10() && !this.Field6) {
            this.Field6 = true;
        }

        if (this.Field22 != 0 && !this.Field4) {
            if (this.Field25) {
                this.Field1 += this.Field22 / 100;
                if (this.Field1 < 0) {
                    this.Field1 = 0;
                } else if (this.Field1 > this.Field3) {
                    this.Field1 = this.Field3;
                } else {
                    this.Field2 = this.Field1;
                }
            } else {
                this.Field7 += this.Field22 / 100;
                if (this.Field7 < 0) {
                    this.Field7 = 0;
                } else if (this.Field7 > this.Field17) {
                    this.Field7 = this.Field17;
                } else {
                    this.Field8 = this.Field7;
                }
            }

            this.Field22 = this.Field22 * 9 / 10;
            if (this.Field22 < 100 && this.Field22 > -100) {
                this.Field22 = 0;
            }
        }

        if (this.Field8 != this.Field7 && !this.Field4) {
            this.Field9 = this.Field7 - this.Field8 << 2;
            this.Field11 += this.Field9;
            this.Field8 += this.Field11 >> 4;
            this.Field11 &= 15;
        }

        if (this.Field2 != this.Field1 && !this.Field4) {
            this.Field10 = this.Field1 - this.Field2 << 2;
            this.Field12 += this.Field10;
            this.Field2 += this.Field12 >> 4;
            this.Field12 &= 15;
        }

    }

    public final void Field1(int var1, int var2, int var3, int var4, int var5, int var6, boolean var7, int var8) {
        this.Field13 = var3;
        this.Field14 = var4;
        this.Field5 = var2;
        this.Field15 = var5;
        this.Field16 = var6;
        this.Field25 = var7;
        this.Field24 = var8;
        if (var7) {
            this.Field3 = var1 * var2 - var6;
        } else {
            this.Field17 = var1 * var2 - var5;
        }

        if (this.Field3 < 0) {
            this.Field3 = 0;
        }

        if (this.Field17 < 0) {
            this.Field17 = 0;
        }

    }

    public final void Field1(int var1) {
        if (this.Field25) {
            var1 -= (this.Field16 - this.Field5) / 2;
            this.Field1 = var1;
            if (this.Field1 < 0) {
                this.Field1 = 0;
            }

            if (this.Field1 > this.Field3) {
                this.Field1 = this.Field3;
                return;
            }
        } else {
            var1 -= (this.Field15 - this.Field5) / 2;
            this.Field7 = var1;
            if (this.Field7 < 0) {
                this.Field7 = 0;
            }

            if (this.Field7 > this.Field17) {
                this.Field7 = this.Field17;
            }
        }

    }
}
