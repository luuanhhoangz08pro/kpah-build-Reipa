package main.tab.tab1;

import java.util.Hashtable;
import java.util.Vector;

import main.lib.Graphics;

public final class Class121 extends Class142 {
    private byte Field183;
    private byte Field184;
    private int Field185;
    private int Field186;
    private int Field219;
    private int Field220;
    private int Field221;
    private int Field222;
    private int Field223;
    private int Field224;
    private int Field225;
    private int Field226;
    private int Field227;
    private int Field228;
    private int Field229;
    private int Field230 = 6;
    private int Field231;
    private int Field232;
    private short Field233;
    private short Field234;
    private short Field235;
    private byte Field236;
    private byte Field237;
    private Vector Field238 = new Vector();
    private Vector Field239 = new Vector();
    private Class672 Field240;
    private boolean Field241;
    private byte Field242 = 0;
    private byte Field243 = 0;
    private byte Field244;
    public static Hashtable Field1;
    private int Field245;
    private int Field246;
    private int Field247;
    private int[] Field248;
    private int[] Field249;
    private int Field250 = 0;

    static {
        byte[] var10000 = new byte[]{2, 1, 0, 2, 0, 1};
        Field1 = new Hashtable();
    }

    public Class121(Class672 var1, int var2) {
        this.Field232 = var2;
        this.Field240 = var1;
        this.Field226 = var1.Field193;
        this.Field227 = var1.Field194;
        super.Field193 = var1.Field193;
        super.Field194 = var1.Field194;
        this.Field185 = var1.Field193;
        this.Field186 = var1.Field194;
        this.Field228 = 48;
        super.Field33 = 0;
        this.Field231 = 4;
        super.Field17 = (short) (var1.Field16() - 1);
        super.Field204 = 0;
        this.Field183 = 0;
        this.Field237 = 0;
        this.Field233 = 30;
        this.Field223 = Class804.Field1(200, 250);
        super.Field188 = 12;
        super.Field189 = var1.Field189;
    }

    public final void Field1(Graphics var1) {
        try {
            Class132 var2;
            if ((var2 = (Class132) Field1.get("" + this.Field232)) == null) {
                return;
            }

            if (var2 != null) {
                byte var3 = this.Field237;
                if (super.Field204 == 2 && this.Field241) {
                    var3 = 3;
                }

                byte[] var4 = var2.Field1(var2.Field1(this.Field244, var3, this.Field242));
                this.Field44();
                int var5 = super.Field193 + var4[0];
                int var7 = super.Field194 + var4[1];
                var1.drawImage(Class63.Field43, var5, var7, 0);
                if (super.Field196 == 0 || super.Field195 == 0) {
                    super.Field196 = var2.Field1();
                    super.Field195 = var2.Field2();
                }

                Class172 var8;
                if ((var8 = Class381.Field1((short) (this.Field232 + 8700))) != null && var8.Field1 != null) {
                    var2.Field1(var1, var2.Field1(this.Field244, var3, this.Field242), super.Field193, super.Field194, this.Field243, var8.Field1, this.Field234);
                    return;
                }
            }
        } catch (Exception var6) {
        }

    }

    private boolean Field44() {
        Class132 var1;
        return (var1 = (Class132) Field1.get("" + this.Field232)) != null && var1.Field1 <= -5;
    }

    private void Field3(int var1, int var2) {
        this.Field242 = (byte) (super.Field194 > var2 ? 1 : 0);
        this.Field243 = (byte) (super.Field193 - var1 > 0 ? 0 : 2);
        this.Field243 = 0;
        if (super.Field33 == 3) {
            this.Field243 = 2;
        } else {
            if (super.Field33 != 2) {
                if (super.Field33 == 0) {
                    this.Field242 = 0;
                    return;
                }

                if (super.Field33 == 1) {
                    this.Field242 = 1;
                }
            }

        }
    }

    private void Field46() {
        int var1 = Math.abs(super.Field193 - this.Field245);
        int var2 = Math.abs(super.Field194 - this.Field246);
        if (var1 <= super.Field17) {
            super.Field193 = (short) this.Field245;
        }

        if (var2 < super.Field17) {
            super.Field194 = (short) this.Field246;
        }

        if (super.Field193 < this.Field245) {
            super.Field193 += super.Field17;
            super.Field33 = 3;
        } else if (super.Field193 > this.Field245) {
            super.Field193 -= super.Field17;
            super.Field33 = 2;
        } else if (super.Field194 > this.Field246) {
            super.Field194 -= super.Field17;
            super.Field33 = 1;
        } else if (super.Field194 < this.Field246) {
            super.Field33 = 0;
            super.Field194 += super.Field17;
        }

        this.Field242 = (byte) (this.Field225 > 0 ? 1 : 0);
        this.Field243 = (byte) (this.Field224 > 0 ? 0 : 2);
        this.Field243 = 0;
        if (super.Field33 == 3) {
            this.Field243 = 2;
        } else if (super.Field33 != 2) {
            if (super.Field33 == 0) {
                this.Field242 = 0;
            } else if (super.Field33 == 1) {
                this.Field242 = 1;
            }
        }

        if (super.Field204 != 3 && (this.Field240.Field17() == 1 || this.Field240.Field17() == 0)) {
            this.Field229 += this.Field230;
            if (this.Field230 > 0) {
                super.Field33 = 3;
            }

            if (this.Field230 < 0) {
                super.Field33 = 2;
            }

            if (this.Field229 + this.Field230 >= 48 && this.Field230 > 0 || this.Field229 + this.Field230 < -48 && this.Field230 < 0) {
                this.Field230 = -this.Field230;
            }
        }

    }

    public final void Field1(Vector var1, byte var2, short var3, int[] var4, int[] var5) {
        super.Field204 = 2;
        this.Field239 = var1;
        this.Field235 = var3;
        this.Field248 = var4;
        this.Field249 = var5;
    }

    public final void Field2() {
        try {
            if (this.Field240 == null || this.Field240 != null && this.Field240.Field187) {
                super.Field187 = true;
            }

            byte var3;
            label224:
            switch (super.Field204) {
                case 0:
                    this.Field231 = 1;
                    int var7;
                    if (this.Field183 == 1) {
                        if (this.Field222 > this.Field223 || Class804.Field14(16) == 0 || Class802.Field2(super.Field193 + this.Field224, super.Field194 + this.Field225, this.Field226, this.Field227) >= this.Field228) {
                            this.Field222 = 0;
                            this.Field183 = 0;
                            this.Field237 = 0;
                            this.Field224 = 0;
                            this.Field225 = 0;
                        }
                    } else if (this.Field183 == 0) {
                        this.Field224 = 0;
                        this.Field225 = 0;
                        if (this.Field222 > this.Field223 / 2 || Class804.Field14(12) == 0) {
                            this.Field222 = 0;
                            this.Field183 = 1;
                            this.Field237 = 2;
                            super.Field33 = (short) Class804.Field14(4);
                            var7 = this.Field231;
                            int var4;
                            if (Class802.Field4(var4 = Class804.Field15(3)) > 1) {
                                --var7;
                            }

                            switch (super.Field33) {
                                case 0:
                                    this.Field225 = var7;
                                    this.Field224 = var4;
                                    break;
                                case 1:
                                    this.Field225 = -var7;
                                    this.Field224 = var4;
                                    break;
                                case 2:
                                    this.Field225 = var4;
                                    this.Field224 = -var7;
                                    break;
                                case 3:
                                    this.Field225 = var4;
                                    this.Field224 = var7;
                            }

                            if (this.Field224 == 0 && Class804.Field14(3) == 0) {
                                this.Field222 = 0;
                                super.Field204 = 0;
                                this.Field224 = 0;
                                this.Field225 = 0;
                                this.Field237 = 0;
                            }

                            if (this.Field224 > 0) {
                                super.Field33 = 3;
                            } else {
                                super.Field33 = 2;
                            }

                            this.Field242 = (byte) (this.Field225 > 0 ? 1 : 0);
                            this.Field243 = (byte) (this.Field224 > 0 ? 0 : 2);
                            this.Field243 = 0;
                            if (super.Field33 == 3) {
                                this.Field243 = 2;
                            } else if (super.Field33 != 2) {
                                if (super.Field33 == 0) {
                                    this.Field242 = 0;
                                } else if (super.Field33 == 1) {
                                    this.Field242 = 1;
                                }
                            }

                            this.Field237 = 2;
                        }
                    }

                    if (this.Field240 != null) {
                        if (this.Field240.Field15() == 1 && Class802.Field2(super.Field193, super.Field194, this.Field219, this.Field221) > 40) {
                            var3 = 1;
                            super.Field204 = var3;
                        }

                        if (this.Field240.Field15() == 0 && Class802.Field2(super.Field193, super.Field194, this.Field219, this.Field221) > this.Field228 << 1) {
                            var3 = 3;
                            super.Field204 = var3;
                        }
                    } else if ((var7 = Class802.Field2(super.Field193, super.Field194, Class105.Field19.Field15.Field193, Class105.Field19.Field15.Field194)) < 80 && var7 > 40 && Class804.Field14(6) == 0) {
                        var3 = 6;
                        super.Field204 = var3;
                    }
                    break;
                case 1:
                    this.Field237 = 2;
                    this.Field231 = this.Field240.Field16();
                    this.Field183 = 1;
                    if (this.Field238.size() <= 0) {
                        ++this.Field247;
                        if (this.Field247 > 20) {
                            var3 = 0;
                            super.Field204 = var3;
                        }
                    }

                    if (Class802.Field2(this.Field185, this.Field186, this.Field219, this.Field221) > 40) {
                        Class245 var6 = new Class245(this.Field219, this.Field221);
                        this.Field185 = this.Field219;
                        this.Field186 = this.Field221;
                        this.Field238.addElement(var6);
                    } else if (Class802.Field2(super.Field193, super.Field194, this.Field226, this.Field227) < 40) {
                        this.Field238.removeAllElements();
                        var3 = 4;
                        super.Field204 = var3;
                    }

                    if (this.Field238.size() > 0 && this.Field238.elementAt(0) != null) {
                        this.Field245 = ((Class245) this.Field238.elementAt(0)).Field1;
                        this.Field246 = ((Class245) this.Field238.elementAt(0)).Field2;
                        this.Field3(this.Field245, this.Field246);
                        this.Field46();
                    }
                    break;
                case 2:
                    Class121 var1 = this;
                    if (this.Field239 != null && this.Field239.size() > 0) {
                        Class672 var2;
                        if ((var2 = (Class672) this.Field239.elementAt(0)) == null) {
                            var3 = 1;
                            super.Field204 = var3;
                        } else {
                            if (Class802.Field2(super.Field193 + super.Field17, super.Field194 + super.Field17, var2.Field193, var2.Field194) > this.Field233 && !this.Field241 && var2.Field39() > 0) {
                                this.Field245 = var2.Field193;
                                this.Field246 = var2.Field194;
                                this.Field3(this.Field245, this.Field246);
                                this.Field46();
                                this.Field237 = 2;
                                if (this.Field234 < 40 && this.Field44()) {
                                    ++this.Field234;
                                }
                            } else {
                                this.Field241 = true;
                            }

                            if (!this.Field241) {
                                break;
                            }

                            if (this.Field234 < 50 && this.Field44()) {
                                this.Field234 = (short) (this.Field234 + 10);
                            }

                            ++this.Field220;
                            if (this.Field220 <= 6) {
                                break;
                            }

                            this.Field220 = 0;
                            this.Field241 = false;
                            var3 = 4;
                            super.Field204 = var3;
                            int var8 = 0;

                            while (true) {
                                if (var8 >= var1.Field239.size()) {
                                    break label224;
                                }

                                if ((var2 = (Class672) var1.Field239.elementAt(var8)) != null) {
                                    Class105.Field19.Field1(String.valueOf(var1.Field248[var8]), 0, var2.Field193, var2.Field194 - 15, 1, -2);
                                    var2.Field3(var1.Field249[var8]);
                                    var2.Field1(var1.Field235, var2.Field193, var2.Field194, 0L, false, false, false, 0, (byte) 0, (byte) 0);
                                }

                                ++var8;
                            }
                        }
                    } else {
                        ++this.Field220;
                        this.Field241 = true;
                        if (this.Field220 > 6) {
                            this.Field220 = 0;
                            this.Field241 = false;
                            var3 = 4;
                            super.Field204 = var3;
                        }
                    }
                    break;
                case 3:
                    this.Field231 = this.Field240.Field16();
                    this.Field245 = this.Field240.Field193;
                    this.Field246 = this.Field240.Field194;
                    this.Field3(this.Field245, this.Field246);
                    this.Field46();
                    if (Class802.Field2(super.Field193, super.Field194, this.Field226, this.Field227) < 40 && this.Field240.Field15() != 2) {
                        var3 = 0;
                        super.Field204 = var3;
                    }

                    this.Field237 = 2;
                    break;
                case 4:
                    this.Field237 = 0;
                    this.Field224 = 0;
                    this.Field225 = 0;
                    this.Field183 = 1;
                    if (this.Field240 != null) {
                        if (this.Field240.Field15() == 0) {
                            this.Field238.removeAllElements();
                            var3 = 0;
                            super.Field204 = var3;
                        } else if (this.Field240.Field15() == 1 && Class802.Field2(super.Field193, super.Field194, this.Field226, this.Field227) > 40) {
                            this.Field238.removeAllElements();
                            var3 = 1;
                            super.Field204 = var3;
                        }
                    }
                case 5:
                default:
                    break;
                case 6:
                    this.Field231 = 3;
                    super.Field204 = 1;
                    this.Field245 = Class105.Field19.Field15.Field193;
                    this.Field246 = Class105.Field19.Field15.Field194;
                    this.Field46();
                    if (Class802.Field2(super.Field193, super.Field194, this.Field245, this.Field246) < 40) {
                        var3 = 0;
                        super.Field204 = var3;
                    }
            }

            if (!this.Field241 && this.Field234 > 0) {
                this.Field234 = (short) (this.Field234 - 3);
                if (this.Field234 < 0) {
                    this.Field234 = 0;
                }
            }

            if (Class105.Field12 % 2 == 0) {
                this.Field236 = (byte) ((this.Field236 + 1) % 3);
            }

            if (super.Field204 != 2) {
                super.Field193 = (short) (super.Field193 + this.Field224);
                super.Field194 = (short) (super.Field194 + this.Field225);
            }

            Class132 var9;
            if ((var9 = (Class132) Field1.get("" + this.Field232)) != null) {
                byte var10 = this.Field237;
                if (super.Field204 == 2 && this.Field241) {
                    var10 = 3;
                }

                this.Field244 = (byte) ((this.Field244 + 1) % var9.Field1(var10, this.Field242).Field1.length);
                if (this.Field250 == 0) {
                    this.Field250 = var9.Field1(3, this.Field242).Field1.length;
                }
            }

            if (this.Field240 != null) {
                if (Class802.Field2(super.Field193, super.Field194, this.Field245, this.Field246) <= 10 && this.Field238.size() > 0) {
                    this.Field238.removeElementAt(0);
                }

                this.Field226 = this.Field240.Field193;
                this.Field227 = this.Field240.Field194;
                this.Field219 = this.Field240.Field193;
                this.Field221 = this.Field240.Field194;
            }

            ++this.Field222;
            if (super.Field204 != this.Field184) {
                this.Field184 = super.Field204;
                return;
            }
        } catch (Exception var5) {
        }

    }

    public final void Field1(short var1, short var2) {
    }

    public final boolean g_() {
        return true;
    }
}
