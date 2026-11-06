package main.tab.tab1;

import main.lib.Graphics;

public class Class142 extends Class359 {
    public short Field32;
    public short Field33;
    public short Field34;
    public short Field35;
    public short Field36 = 1;
    public short Field37 = 1;
    public short Field38;
    public short Field39;
    public short Field40;
    public Class359 Field41 = null;
    public byte Field42 = 5;
    private byte Field1;
    public byte Field43;
    public byte Field44;
    public byte Field45;
    public byte Field46;
    public int Field47;
    public int Field48;
    public long Field49;
    public String Field50;
    private byte Field183 = 0;
    private byte Field184;
    private byte[] Field185 = new byte[]{-1, 0, 1, 0};
    private byte[][][] Field186 = new byte[][][]{{{0, 0, 0, 1, 1, 1, 2, 2, 2, 1, 1, 1}, {3, 3, 3, 4, 4, 4, 5, 5, 5, 4, 4, 4}, {6, 6, 6, 7, 7, 7, 8, 8, 8, 7, 7, 7}, {6, 6, 6, 7, 7, 7, 8, 8, 8, 7, 7, 7}}, {{0, 0, 1, 1, 2, 2, 1, 1, 3, 3}, {5, 5, 6, 6, 5, 5, 7, 7}, {9, 9, 10, 10, 9, 9, 11, 11}, {9, 9, 10, 10, 9, 9, 11, 11}}, {{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}, {{0, 0, 1, 1}, {2, 2, 3, 3}, {4, 4, 5, 5}, {4, 4, 5, 5}}, {{0, 0, 1, 1}, {2, 2, 3, 3}, {4, 4, 5, 5}, {4, 4, 5, 5}}, {{0, 0, 1, 1, 2, 2, 1, 1, 3, 3}, {5, 5, 6, 6, 5, 5, 7, 7}, {9, 9, 10, 10, 9, 9, 11, 11}, {9, 9, 10, 10, 9, 9, 11, 11}}, {{0, 0, 1, 1, 2, 2, 1, 1, 3, 3}, {5, 5, 6, 6, 5, 5, 7, 7}, {9, 9, 10, 10, 9, 9, 11, 11}, {9, 9, 10, 10, 9, 9, 11, 11}}};
    private byte[][][] Field219 = new byte[][][]{{{0, 0, 0, 1, 1, 1, 2, 2, 2, 1, 1, 1}, {3, 3, 3, 4, 4, 4, 5, 5, 5, 4, 4, 4}, {6, 6, 6, 7, 7, 7, 8, 8, 8, 7, 7, 7}, {6, 6, 6, 7, 7, 7, 8, 8, 8, 7, 7, 7}}, {{0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, {4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5}, {8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9}, {8, 8, 8, 8, 8, 8, 9, 9, 9, 9, 9, 9}}, {{0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}, {0, 0, 0, 0, 1, 1, 1, 1}}, {{0, 0, 1, 1}, {2, 2, 3, 3}, {4, 4, 5, 5}, {4, 4, 5, 5}}, {{0, 0, 1, 1}, {2, 2, 3, 3}, {4, 4, 5, 5}, {4, 4, 5, 5}}, {{0, 0, 1, 1, 2, 2, 1, 1, 3, 3}, {5, 5, 6, 6, 5, 5, 7, 7}, {9, 9, 10, 10, 9, 9, 11, 11}, {9, 9, 10, 10, 9, 9, 11, 11}}, {{0, 0, 1, 1, 2, 2, 1, 1, 3, 3}, {5, 5, 6, 6, 5, 5, 7, 7}, {9, 9, 10, 10, 9, 9, 11, 11}, {9, 9, 10, 10, 9, 9, 11, 11}}};

    public final void Field18() {
        if (this.Field43 == 4) {
            for (int var1 = 0; var1 < this.Field219[this.Field43].length; ++var1) {
                for (int var2 = 0; var2 < this.Field219[this.Field43][var1].length; ++var2) {
                    this.Field219[this.Field43][var1] = new byte[this.Field38 * 3];
                    this.Field219[this.Field43][var1][0] = 0;
                    byte var3 = 0;

                    for (int var4 = 1; var4 < this.Field38 * 3; ++var4) {
                        this.Field219[this.Field43][var1][var4] = var3;
                        if (var4 % 3 == 0) {
                            ++var3;
                        }
                    }
                }
            }

            this.Field186[this.Field43] = this.Field219[this.Field43];
        }

    }

    public void Field1(short var1, short var2) {
        this.Field34 = var1;
        this.Field35 = var2;
    }

    public void Field2() {
        switch (this.Field32) {
            case 0:
                ++this.Field45;
                if (this.Field45 > this.Field219[this.Field43][this.Field33].length - 1) {
                    this.Field45 = 0;
                }

                this.Field46 = this.Field219[this.Field43][this.Field33][this.Field45];
                if (this.Field44()) {
                    this.Field32 = 1;
                }

                this.Field1 = 0;
                break;
            case 1:
                label147:
                {
                    Class142 var10000;
                    int var10001;
                    byte var10002;
                    label146:
                    {
                        this.Field35 = this.Field41.Field194;
                        if (this.Field43 == 1) {
                            if (this.Field41.Field12 == 2) {
                                this.Field34 = (short) (this.Field41.Field193 + this.Field41.Field196 / 2 + 16);
                                break label147;
                            }

                            if (this.Field41.Field12 != 3) {
                                this.Field34 = this.Field41.Field193;
                                if (this.Field41.Field12 == 1) {
                                    this.Field35 = (short) (this.Field41.Field194 + this.Field41.Field195);
                                } else {
                                    this.Field35 = (short) (this.Field41.Field194 - this.Field41.Field195 - 10);
                                }
                                break label147;
                            }

                            var10000 = this;
                            var10001 = this.Field41.Field193 - this.Field41.Field196 / 2;
                        } else {
                            if (this.Field41.Field12 == 2 || this.Field41.Field12 == 1) {
                                this.Field34 = (short) (this.Field41.Field193 + this.Field41.Field196 / 2 + (this.Field43 == 2 ? 5 : 14));
                                break label147;
                            }

                            var10000 = this;
                            var10001 = this.Field41.Field193 - this.Field41.Field196 / 2;
                            if (this.Field43 == 2) {
                                var10002 = 5;
                                break label146;
                            }
                        }

                        var10002 = 10;
                    }

                    var10000.Field34 = (short) (var10001 - var10002);
                }

                boolean var1 = false;
                boolean var2 = false;
                int var3 = Class105.Field1(super.Field193 - this.Field34);
                int var4 = Class105.Field1(super.Field194 - this.Field35);
                if (var3 <= this.Field42 + this.Field1) {
                    super.Field193 = this.Field34;
                    var1 = true;
                }

                if (var4 <= this.Field42 + this.Field1) {
                    super.Field194 = this.Field35;
                    var2 = true;
                }

                if (!var1 || !var2 || this.Field41.Field204 != 0 && this.Field41.Field204 != 2) {
                    if (super.Field193 < this.Field34) {
                        super.Field193 = (short) (super.Field193 + this.Field42 + this.Field1);
                        this.Field33 = 3;
                    } else if (super.Field193 > this.Field34) {
                        super.Field193 = (short) (super.Field193 - (this.Field42 + this.Field1));
                        this.Field33 = 2;
                    } else if (super.Field194 > this.Field35) {
                        super.Field194 = (short) (super.Field194 - (this.Field42 + this.Field1));
                        this.Field33 = 1;
                    } else if (super.Field194 < this.Field35) {
                        super.Field194 = (short) (super.Field194 + this.Field42 + this.Field1);
                        this.Field33 = 0;
                    } else {
                        this.Field33 = this.Field41.Field12;
                    }

                    if (this.Field44()) {
                        this.Field1 = (byte) (this.Field42 / 2);
                    }

                    if (this.Field33 == 0 && super.Field194 >= this.Field35) {
                        super.Field194 = this.Field35;
                        this.Field1 = 0;
                    }

                    ++this.Field45;
                    if (this.Field45 > this.Field186[this.Field43][this.Field33].length - 1) {
                        this.Field45 = 0;
                    }

                    this.Field46 = this.Field186[this.Field43][this.Field33][this.Field45];
                } else if (this.Field41.Field189 != Class105.Field19.Field15.Field189) {
                    this.Field32 = 0;
                } else if (Class105.Field19.Field15.Field49 == null) {
                    this.Field32 = 0;
                }
            case 2:
            default:
                break;
            case 3:
                if (this.Field48 > 0) {
                    --this.Field48;
                }

                if (this.Field48 <= 0) {
                    Class105.Field19.Field10.removeElement(this);
                }

                if (this.Field48 % 4 == 0) {
                    Class74.Field1(super.Field193, super.Field194 + this.Field39 - this.Field37 / 2, this.Field43 != 1 ? 11 : 23);
                }
        }

        if (this.Field43 != 1 && Class105.Field12 % 2 == 0) {
            ++this.Field183;
            if (this.Field183 > this.Field185.length - 1) {
                this.Field183 = 0;
            }
        }

        if (this.Field41.Field211 && Class105.Field19.Field10.contains(this)) {
            Class105.Field19.Field10.removeElement(this);
        }

        if ((long) this.Field47 - (System.currentTimeMillis() - this.Field49) / 60000L <= 0L && this.Field32 != 3) {
            this.Field32 = 3;
            this.Field48 = 20;
        }

        if (this.Field33 == 2) {
            this.Field184 = 2;
        } else {
            this.Field184 = 0;
        }

        super.Field2();
    }

    private boolean Field44() {
        if (this.Field41 == null) {
            return false;
        } else {
            byte var1 = 64;
            byte var2 = 70;
            byte var3 = 70;
            if (this.Field43 == 2) {
                var1 = 32;
                var3 = 30;
                var2 = 30;
            }

            if (this.Field41.Field12 == 0) {
                var1 = 48;
            }

            return Class802.Field1(super.Field193, super.Field194, this.Field41.Field193, this.Field41.Field194) > var1 || Math.abs(super.Field193 - this.Field41.Field193) > var2 && this.Field33 != 0 && this.Field33 != 1 || Math.abs(super.Field194 - this.Field41.Field194) > var3;
        }
    }

    public void Field1(Graphics var1) {
        Class172 var2 = Class381.Field1((short) (this.Field44 + 5200));
        if (this.Field41 != null && var2.Field1 != null) {
            if (!var2.Field3) {
                if (this.Field37 == 1) {
                    this.Field37 = (short) (var2.Field1.getHeight() / this.Field38);
                }

                if (this.Field36 == 1) {
                    this.Field36 = (short) var2.Field1.getWidth();
                }

                if (this.Field48 % 2 == 0) {
                    var1.drawRegion(var2.Field1, 0, this.Field37 * this.Field46, this.Field36, this.Field37, this.Field184, super.Field193, super.Field194 + this.Field39 + this.Field185[this.Field183] + (this.Field41.Field167 == -1 && this.Field43 != 1 ? 3 : 0), 33);
                    var1.drawImage(Class804.Field16, super.Field193, super.Field194 + (this.Field41.Field167 == -1 && this.Field43 != 1 ? 3 : 0), 3);
                }
            }

        }
    }
}
