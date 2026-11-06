package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class827 extends Class126 {
    private Vector Field62 = new Vector();
    private Vector Field63 = new Vector();
    private short Field64;
    private byte Field65 = 0;
    private byte Field66 = 0;
    private byte[] Field67 = new byte[]{-2, 2, -8, 8};
    private byte[] Field68 = new byte[]{-10, -30, -10, -10};
    private byte[] Field69 = new byte[]{0, 20, 20, 0, 0, 20, 20, 20, 20};
    private byte[] Field70 = new byte[]{0, 0, 0, 20, 20, 20, 20, 20, 20};
    private byte Field71;
    private short Field72 = -1;
    private byte Field73 = 0;
    private boolean Field74 = false;

    public Class827(int var1) {
        super.Field44 = false;
        super.Field12 = (byte) Class114.Field30.nextInt(4);
        super.Field52 = Class811.Field1(10, 20);
        super.Field204 = 0;
        super.Field51 = 0;
        super.Field39 = super.Field40 = super.Field41 = 0;
        this.Field64 = (short) var1;
        if (Class811.Field46[var1] != null) {
            this.Field62 = Class811.Field46[var1].Field1();
        }

    }

    public final void Field1(Graphics var1) {
        if (this.Field62.size() != 0) {
            Class323 var2;
            if ((var2 = (Class323) this.Field62.elementAt(this.Field65)) != null) {
                int var3;
                if (super.Field29 != null) {
                    for (var3 = 0; var3 < super.Field29.size(); ++var3) {
                        ((Class48) super.Field29.elementAt(var3)).Field1(var1, super.Field193, super.Field194);
                    }
                }

                var2.Field1(var1, var2.Field1(super.Field23, super.Field204), super.Field193, super.Field194, this.Field66, Class811.Field46[super.Field42].Field1(this.Field65));
                if (super.Field28 != null) {
                    for (var3 = 0; var3 < super.Field28.size(); ++var3) {
                        ((Class48) super.Field28.elementAt(var3)).Field1(var1, super.Field193, super.Field194);
                    }
                }
            }

        }
    }

    public final void a_(Graphics var1, int var2, int var3) {
    }

    public final void a_(Graphics var1) {
        super.a_(var1);
    }

    private void Field2(Class114 var1) {
        if (Class811.Field46[super.Field42] != null && Class811.Field46[super.Field42].Field2 != 4) {
            this.Field65 = (byte) (super.Field194 > var1.Field194 ? 1 : 0);
            this.Field66 = (byte) (super.Field193 - var1.Field193 > 0 ? 0 : 2);
            super.Field12 = Class809.Field2(this, var1);
            this.Field24();
        }

    }

    public final void Field2() {
        this.Field5();
        Class323 var1 = null;
        if (this.Field62.size() > 0) {
            var1 = (Class323) this.Field62.elementAt(0);
            super.Field23 = (byte) ((super.Field23 + 1) % var1.Field1(super.Field204).Field1.length);
            if ((super.Field187 || super.Field4 <= 0) && super.Field212 != -1 && super.Field204 != 8) {
                super.Field204 = 8;
            }
        } else if (Class811.Field46[super.Field42] != null) {
            this.Field62 = Class811.Field46[super.Field42].Field1();
        }

        if (!super.Field57 && System.currentTimeMillis() - super.Field58 > 15000L) {
            super.Field58 = System.currentTimeMillis();
            Class106.Field19.Field28.Field3(super.Field189);
        }

        if (Class811.Field46 != null) {
            if (Class811.Field46[super.Field42] == null) {
                if (!super.Field48 && System.currentTimeMillis() > super.Field43) {
                    super.Field48 = false;
                    Class261.Field1().Field4((int) 0, (int) super.Field42);
                    super.Field43 = System.currentTimeMillis() + 10000L;
                }
            } else if (!super.Field48) {
                this.Field1(super.Field42);
                super.Field48 = true;
                super.Field17 = Class811.Field46[super.Field42].Field3;
                super.Field195 = Class811.Field46[super.Field42].Field4;
                if (Class811.Field46[super.Field42].Field1 == null) {
                    Class811.Field46[super.Field42].Field2();
                }
            }
        }

        if (super.Field205 && System.currentTimeMillis() > super.Field208) {
            super.Field205 = false;
        }

        this.Field20();
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
                ++super.Field51;
                if (super.Field51 > super.Field52 && super.Field36 == -1) {
                    short var12 = (short) (super.Field197 - super.Field56);
                    short var15 = (short) (super.Field197 + super.Field56);
                    short var18 = (short) (super.Field198 - super.Field56);
                    short var16 = (short) (super.Field198 + super.Field56);
                    byte var19 = (byte) Class114.Field30.nextInt(4);
                    if (super.Field53 != -100 && super.Field53 == var19) {
                        if (var19 == 2) {
                            var19 = 3;
                        } else if (var19 == 3) {
                            var19 = 2;
                        } else if (var19 == 1) {
                            var19 = 0;
                        } else if (var19 == 0) {
                            var19 = 1;
                        }
                    }

                    if (var19 == 2) {
                        super.Field54 = (byte) (-super.Field17);
                        super.Field55 = 0;
                        if (Math.abs(super.Field193 - var12) < 32) {
                            var19 = 3;
                            super.Field54 = (byte) super.Field17;
                        }
                    } else if (var19 == 3) {
                        super.Field54 = (byte) super.Field17;
                        super.Field55 = 0;
                        if (Math.abs(super.Field193 - var15) < 32) {
                            var19 = 2;
                            super.Field54 = (byte) (-super.Field17);
                        }
                    } else if (var19 == 1) {
                        super.Field54 = 0;
                        super.Field55 = (byte) (-super.Field17);
                        if (Math.abs(super.Field194 - var18) < 32) {
                            var19 = 0;
                            super.Field55 = (byte) super.Field17;
                        }
                    } else if (var19 == 0) {
                        super.Field54 = 0;
                        super.Field55 = (byte) super.Field17;
                        if (Math.abs(super.Field194 - var16) < 32) {
                            var19 = 1;
                            super.Field55 = (byte) (-super.Field17);
                        }
                    }

                    super.Field12 = var19;
                    super.Field204 = 2;
                    super.Field51 = 0;
                }
            case 1:
            default:
                break;
            case 2:
            case 6:
            case 7:
                if (!super.Field27) {
                    if (super.Field36 > -1) {
                        this.Field4();
                    } else if (super.Field204 == 7) {
                        this.Field2(super.Field197, super.Field198);
                    } else if (super.Field204 == 2) {
                        this.Field4();
                    } else if (super.Field32 == null) {
                        super.Field39 = super.Field40 = super.Field41 = 0;
                        super.Field204 = 0;
                        super.Field52 = Class811.Field1(10, 20);
                        super.Field54 = super.Field55 = 0;
                        super.Field53 = super.Field12;
                    } else if (super.Field32 != null && Math.abs(super.Field193 - super.Field32.Field193) <= super.Field59 && Math.abs(super.Field194 - super.Field32.Field194) <= super.Field59) {
                        super.Field54 = super.Field55 = 0;
                    } else {
                        this.Field2(super.Field32.Field193 + super.Field45, super.Field32.Field194 + super.Field46);
                    }
                }
                break;
            case 3:
                if (this.Field63.size() == 0) {
                    super.Field204 = 0;
                    return;
                }

                if (var1 != null) {
                    if (!this.Field74) {
                        Class114 var2;
                        if (super.Field42 == 117) {
                            if (this.Field63.size() > 0) {
                                var2 = (Class114) this.Field63.elementAt(0);
                                this.Field2(var2);
                                if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7) {
                                    if (this.Field71 == 1) {
                                        Class62.Field2(7, this, var2, super.Field193, super.Field194, var2.Field18, (byte) 0, 18);
                                    } else {
                                        Class62.Field2(super.Field193, super.Field194, this.Field63);
                                    }

                                    this.Field63.removeElementAt(0);
                                }
                            }

                            if (this.Field63.size() == 0 && super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                                super.Field204 = 0;
                            }
                        } else if (super.Field42 == 116) {
                            if (this.Field63.size() > 0) {
                                var2 = (Class114) this.Field63.elementAt(0);
                                this.Field2(var2);
                                if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7) {
                                    var2.Field1();
                                    if (this.Field71 == 1) {
                                        Class62.Field1((int) 9, (Class114) this, (Class114) var2, (int) super.Field193, super.Field194, var2.Field18, (byte) 0);
                                    } else if (this.Field71 == 0) {
                                        for (int var9 = 0; var9 < 8; ++var9) {
                                            Class62.Field1(10, this, var2, super.Field193 + this.Field67[super.Field12] + this.Field69[var9], super.Field194 + this.Field68[super.Field12] + this.Field70[var9], var2.Field18, (byte) 0, Class748.Field6[super.Field12][var9]);
                                        }
                                    } else {
                                        Class283 var3 = new Class283(var2.Field193, var2.Field194, var2.Field18);
                                        Class73.Field2.addElement(var3);
                                    }

                                    this.Field63.removeElementAt(0);
                                }
                            }

                            if (this.Field63.size() == 0 && super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                                super.Field204 = 0;
                            }
                        } else if ((this.Field64 < 95 || this.Field64 > 112) && (this.Field71 == 0 || this.Field71 == 2)) {
                            var2 = (Class114) this.Field63.elementAt(0);
                            this.Field2(var2);
                            if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7 && super.Field12 != 2) {
                                if (super.Field12 == 3) {
                                    Class62.Field1((int) (super.Field193 + 50), (int) super.Field194, (Vector) this.Field63);
                                } else if (super.Field12 == 1) {
                                    Class62.Field1((int) super.Field193, (int) (super.Field194 - 50), (Vector) this.Field63);
                                } else if (super.Field12 == 0) {
                                    Class62.Field1((int) super.Field193, (int) (super.Field194 + 50), (Vector) this.Field63);
                                }
                            }

                            if (super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                                super.Field204 = 0;
                            }
                        } else if (this.Field71 == 1) {
                            if (this.Field63.size() > 0) {
                                var2 = (Class114) this.Field63.elementAt(0);
                                this.Field2(var2);
                                if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7) {
                                    var2.Field1();
                                    if (super.Field42 == 115) {
                                        Class62.Field2(14, this, var2, super.Field193, super.Field194 - 15, var2.Field18, (byte) 0, 14);
                                    } else {
                                        Class62.Field2(13, this, var2, super.Field193, super.Field194 - 15, var2.Field18, (byte) 0, 13);
                                    }
                                }
                            }

                            if (this.Field63.size() == 0 && super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                                super.Field204 = 0;
                            }
                        }

                        byte var6 = this.Field71;
                        Class827 var8 = this;
                        if (this.Field63.size() > 0 && var6 > 2) {
                            Class114 var4 = (Class114) this.Field63.elementAt(0);
                            this.Field2(var4);
                            Class114 var5;
                            int var7;
                            label319:
                            switch (var6) {
                                case 3:
                                    if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7 && super.Field12 != 2) {
                                        if (super.Field12 == 3) {
                                            Class62.Field1((int) (super.Field193 + 50), (int) super.Field194, (Vector) this.Field63);
                                        } else if (super.Field12 == 1) {
                                            Class62.Field1((int) super.Field193, (int) (super.Field194 - 50), (Vector) this.Field63);
                                        } else if (super.Field12 == 0) {
                                            Class62.Field1((int) super.Field193, (int) (super.Field194 + 50), (Vector) this.Field63);
                                        }
                                    }

                                    if (super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                                        super.Field204 = 0;
                                    }
                                    break;
                                case 4:
                                    Class62.Field1((int) 9, (Class114) this, (Class114) var4, (int) super.Field193, super.Field194, var4.Field18, (byte) 0);
                                    break;
                                case 5:
                                    Class283 var17 = new Class283(var4.Field193, var4.Field194, var4.Field18);
                                    Class73.Field2.addElement(var17);
                                    break;
                                case 6:
                                    var7 = 0;

                                    while (true) {
                                        if (var7 >= 8) {
                                            break label319;
                                        }

                                        Class62.Field1(10, var8, var4, var8.Field193 + var8.Field67[var8.Field12] + var8.Field69[var7], var8.Field194 + var8.Field68[var8.Field12] + var8.Field70[var7], var4.Field18, (byte) 0, Class748.Field6[var8.Field12][var7]);
                                        ++var7;
                                    }
                                case 7:
                                    Class62.Field2(7, this, var4, super.Field193, super.Field194, var4.Field18, (byte) 0, 18);
                                    break;
                                case 8:
                                    Class62.Field2(super.Field193, super.Field194, this.Field63);
                                    break;
                                case 9:
                                    var7 = 0;

                                    while (true) {
                                        if (var7 >= var8.Field63.size()) {
                                            break label319;
                                        }

                                        var5 = (Class114) var8.Field63.elementAt(var7);
                                        Class642 var14 = new Class642(var5.Field193, var5.Field194, var5.Field18);
                                        Class73.Field2.addElement(var14);
                                        ++var7;
                                    }
                                case 10:
                                    var7 = 0;

                                    while (true) {
                                        if (var7 >= var8.Field63.size()) {
                                            break label319;
                                        }

                                        var5 = (Class114) var8.Field63.elementAt(var7);
                                        Class62.Field2(7, var8, var5, var8.Field193 - 20, var8.Field194 - 50, var5.Field18, (byte) 2, 8);
                                        Class62.Field2(7, var8, var5, var8.Field193, var8.Field194 - 30, var5.Field18, (byte) 2, 8);
                                        Class62.Field2(7, var8, var5, var8.Field193 - 20, var8.Field194 - 10, var5.Field18, (byte) 2, 8);
                                        var4.Field12();
                                        ++var7;
                                    }
                                case 11:
                                    var7 = 0;

                                    while (true) {
                                        if (var7 >= var8.Field63.size()) {
                                            break label319;
                                        }

                                        var5 = (Class114) var8.Field63.elementAt(var7);
                                        Class62.Field1((Class114) var8, (Class114) var5, 30);
                                        ++var7;
                                    }
                                case 12:
                                    var7 = 0;

                                    while (true) {
                                        if (var7 >= var8.Field63.size()) {
                                            break label319;
                                        }

                                        var5 = (Class114) var8.Field63.elementAt(var7);
                                        Class73.Field1((Class177) (new Class182(var8.Field193, var8.Field194, var5.Field193, var5.Field194, var5, var7 << 2)));
                                        ++var7;
                                    }
                                default:
                                    if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7 && super.Field12 != 2) {
                                        if (super.Field12 == 3) {
                                            Class62.Field1((int) (super.Field193 + 50), (int) super.Field194, (Vector) this.Field63);
                                        } else if (super.Field12 == 1) {
                                            Class62.Field1((int) super.Field193, (int) (super.Field194 - 50), (Vector) this.Field63);
                                        } else if (super.Field12 == 0) {
                                            Class62.Field1((int) super.Field193, (int) (super.Field194 + 50), (Vector) this.Field63);
                                        }
                                    }

                                    if (super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                                        super.Field204 = 0;
                                    }
                            }

                            if (var8.Field63.size() == 0 && var8.Field23 == var1.Field1(var8.Field204).Field1.length - 1) {
                                var8.Field204 = 0;
                            }
                        }
                    } else if (this.Field63.size() > 0) {
                        if (super.Field23 == var1.Field1(super.Field204).Field1.length - 7) {
                            for (int var10 = 0; var10 < this.Field63.size(); ++var10) {
                                Class114 var13;
                                Class62.Field1(var13 = (Class114) this.Field63.elementAt(var10), this.Field72, 5000L, 1, var13.Field18, this.Field73);
                            }

                            this.Field63.removeAllElements();
                        }

                        if (this.Field63.size() == 0 && super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                            super.Field204 = 0;
                        }
                    }
                }
                break;
            case 4:
                if (var1 != null && super.Field23 == var1.Field1(super.Field204).Field1.length - 1) {
                    super.Field204 = 0;
                }
                break;
            case 5:
                super.Field187 = true;
                super.Field23 = 0;
                Class106.Field19.Field10.removeElement(this);
                break;
            case 8:
                if (Class106.Field19.Field16 != null && Class106.Field19.Field16 == this && Class106.Field19.Field15.Field204 == 0) {
                    Class106.Field19.Field16 = null;
                }

                if (super.Field50 - System.currentTimeMillis() < 0L) {
                    super.Field187 = false;
                    super.Field44 = false;
                    super.Field12 = (byte) Class114.Field30.nextInt(4);
                    super.Field52 = Class811.Field1(10, 20);
                    super.Field204 = 0;
                    super.Field51 = 0;
                    super.Field39 = super.Field40 = super.Field41 = 0;
                    super.Field193 = super.Field37 = super.Field197;
                    super.Field194 = super.Field38 = super.Field198;
                    super.Field4 = super.Field5;
                    Class106.Field19.Field1(super.Field193, super.Field194);
                    super.Field50 = System.currentTimeMillis() + (long) super.Field212;
                }
        }

        if (super.Field44 && super.Field49 - System.currentTimeMillis() / 1000L <= 0L && !super.Field187) {
            Class106.Field19.Field1(super.Field193, super.Field194);
            super.Field187 = true;
            super.Field211 = false;
        }

        if (super.Field4 <= 0 && Class106.Field19.Field16 != null && Class106.Field19.Field16 == this) {
            Class106.Field19.Field16 = null;
        }

    }

    public final void Field1(Vector var1, byte var2) {
        if (super.Field42 != 116 && var2 == 2) {
            if (super.Field42 == 113) {
                var2 = 1;
            } else {
                var2 = 0;
            }
        }

        this.Field63 = var1;
        super.Field204 = 3;
        super.Field39 = super.Field40 = super.Field41 = 0;
        super.Field23 = 0;
        this.Field71 = var2;
    }

    public final void Field1(short var1, short var2) {
        if (super.Field36 > -1) {
            if (super.Field204 != 3 && super.Field193 == var1 && super.Field194 == var2) {
                super.Field204 = 0;
                return;
            }

            super.Field37 = var1;
            if (Class811.Field46[super.Field42].Field2 == 4) {
                super.Field38 = var2;
            } else {
                super.Field38 = var2;
                this.Field65 = (byte) (super.Field194 > var2 ? 1 : 0);
                this.Field66 = (byte) (super.Field193 - var1 > 0 ? 0 : 2);
                this.Field24();
            }

            if (super.Field204 != 3) {
                super.Field204 = 2;
            }

            if (super.Field204 != 3 && super.Field193 == super.Field37 && super.Field194 == super.Field38) {
                super.Field204 = 0;
                return;
            }
        }

    }

    public final void Field11(int var1) {
        this.Field72 = (short) var1;
    }

    public final void Field12(int var1) {
        this.Field73 = (byte) var1;
    }

    public final void Field13(int var1) {
        this.Field74 = var1 == 1;
    }

    private void Field24() {
        if (this.Field62.size() > 2) {
            this.Field66 = 0;
            if (super.Field12 == 3) {
                this.Field66 = 2;
                this.Field65 = 0;
                return;
            }

            if (super.Field12 == 2) {
                this.Field65 = 0;
                return;
            }

            if (super.Field12 == 0) {
                this.Field65 = 1;
                return;
            }

            if (super.Field12 == 1) {
                this.Field65 = 2;
            }
        }

    }
}
