package main.tab.tab2;

import java.util.Random;
import java.util.Vector;

import main.lib.Graphics;

public abstract class Class114 extends Class678 {
    public int Field2;
    public int Field3;
    public int Field4;
    public int Field5;
    public int Field6;
    public int Field7;
    public int Field8;
    public int Field9;
    public int Field10;
    public int Field11;
    public short Field12;
    public short Field13;
    public short Field14;
    public short Field15;
    public short Field16;
    public short Field17;
    public int Field18;
    public int Field19;
    public int Field20;
    public int Field21;
    public byte Field22;
    public byte Field23;
    public byte Field24;
    public byte Field25 = -1;
    public Vector Field26 = new Vector();
    public boolean Field27 = false;
    public Vector Field28 = new Vector();
    public Vector Field29 = new Vector();
    private Vector Field1 = new Vector();
    public static Random Field30 = new Random(System.currentTimeMillis());
    public short Field31 = 36;

    public void Field2(int var1) {
        this.Field2 = var1;
        this.Field3 = 20;
    }

    public final void Field1(Class48 var1, int var2) {
        for (int var3 = 0; var3 < this.Field28.size(); ++var3) {
            if (((Class48) this.Field28.elementAt(var3)).Field1 == var1.Field1) {
                if (var2 == 1) {
                    ((Class48) this.Field28.elementAt(var3)).Field2 = 0L;
                }

                return;
            }
        }

        if (var2 == 0) {
            this.Field28.addElement(var1);
        }

    }

    public final void Field2(Class48 var1, int var2) {
        for (int var3 = 0; var3 < this.Field29.size(); ++var3) {
            if (((Class48) this.Field29.elementAt(var3)).Field1 == var1.Field1) {
                if (var2 == 1) {
                    ((Class48) this.Field29.elementAt(var3)).Field2 = 0L;
                }

                return;
            }
        }

        if (var2 == 0) {
            this.Field29.addElement(var1);
        }

    }

    public final void Field3(int var1) {
        this.Field4 = var1;
    }

    public final void Field5() {
        int var1;
        Class48 var2;
        if (this.Field28 != null) {
            for (var1 = 0; var1 < this.Field28.size(); ++var1) {
                (var2 = (Class48) this.Field28.elementAt(var1)).Field2();
                if (var2.Field4()) {
                    this.Field28.removeElementAt(var1);
                }
            }
        }

        if (this.Field29 != null) {
            for (var1 = 0; var1 < this.Field29.size(); ++var1) {
                (var2 = (Class48) this.Field29.elementAt(var1)).Field2();
                if (var2.Field4()) {
                    this.Field29.removeElementAt(var1);
                }
            }
        }

    }

    public void Field1(int var1, int var2) {
    }

    public void Field6() {
        if (!super.Field217) {
            if (System.currentTimeMillis() - super.Field215 >= (long) (super.Field216 * 1000) & super.Field216 > 0) {
                this.Field4 -= super.Field214;
                this.Field31 -= super.Field216;
                super.Field215 = System.currentTimeMillis();
                if (this.Field31 == 0) {
                    super.Field216 = 0;
                    this.Field31 = 36;
                }

                if (this.Field4 <= 0) {
                    this.Field4 = 1;
                    super.Field214 = 0;
                    super.Field216 = 0;
                    this.Field31 = 36;
                }
            }

        } else {
            this.Field4 = 0;
            super.Field217 = false;
            super.Field216 = 0;
            super.Field215 = 0L;
            this.Field31 = 36;
            super.Field214 = 0;
            boolean var1 = false;
            boolean var2 = false;
            int var3 = super.Field193 - 5 << 1;

            int var4;
            for (var4 = super.Field194 - 5 << 1; var3 > 10 || var4 > 10 || var3 < -10 || var4 < -10; var4 >>= 1) {
                var3 >>= 1;
            }

            this.Field1(var3, var4);
        }
    }

    public final void Field7() {
        if (this.Field26.size() > 0) {
            for (int var1 = 0; var1 < this.Field26.size(); ++var1) {
                ((Class177) this.Field26.elementAt(var1)).Field1();
            }
        }

    }

    public void Field2() {
        this.Field7();
        this.Field10();
        if (this.Field6 < 0) {
            this.Field6 += this.Field7;
            ++this.Field7;
            if (this.Field6 > 0) {
                this.Field6 = 0;
            }
        }

        this.Field10 += this.Field8;
        this.Field11 += this.Field9;
        if (this.Field8 > 0) {
            --this.Field8;
        }

        if (this.Field8 < 0) {
            ++this.Field8;
        }

        if (this.Field9 > 0) {
            --this.Field9;
        }

        if (this.Field9 < 0) {
            ++this.Field9;
        }

        if (this.Field8 == 0 && this.Field9 == 0) {
            if (this.Field10 > 1) {
                this.Field10 >>= 1;
            } else {
                this.Field10 = 0;
            }

            if (this.Field11 > 1) {
                this.Field11 >>= 1;
            } else {
                this.Field11 = 0;
            }
        }

        super.Field2();
    }

    public void Field1(Graphics var1) {
        this.Field2(var1);
    }

    public final void Field2(Graphics var1) {
        if (this.Field26.size() > 0) {
            for (int var2 = 0; var2 < this.Field26.size(); ++var2) {
                ((Class177) this.Field26.elementAt(var2)).Field1(var1);
            }
        }

    }

    public void Field1() {
        this.Field6 = -3;
        this.Field7 = -5;
    }

    public void Field1(Class678 var1) {
        this.Field6 = -3;
        this.Field7 = -3;
        this.Field8 = (short) (super.Field193 - var1.Field193 << 1);

        for (this.Field9 = (short) (super.Field194 - var1.Field194 << 1); this.Field8 > 4 || this.Field9 > 4 || this.Field8 < -4 || this.Field9 < -4; this.Field9 >>= 1) {
            this.Field8 >>= 1;
        }

    }

    public final boolean Field8() {
        int var1;
        if (this.Field28 != null) {
            for (var1 = 0; var1 < this.Field28.size(); ++var1) {
                if (((Class48) this.Field28.elementAt(var1)).Field4 == 1) {
                    return false;
                }
            }
        }

        if (this.Field29 != null) {
            for (var1 = 0; var1 < this.Field29.size(); ++var1) {
                if (((Class48) this.Field29.elementAt(var1)).Field4 == 1) {
                    return false;
                }
            }
        }

        return !this.Field27 && !super.Field205;
    }

    public final boolean Field9() {
        int var1;
        if (this.Field28 != null) {
            for (var1 = 0; var1 < this.Field28.size(); ++var1) {
                if (((Class48) this.Field28.elementAt(var1)).Field4 == 1) {
                    return false;
                }
            }
        }

        if (this.Field29 != null) {
            for (var1 = 0; var1 < this.Field29.size(); ++var1) {
                if (((Class48) this.Field29.elementAt(var1)).Field4 == 1) {
                    return false;
                }
            }
        }

        return !this.Field27 && !super.Field205;
    }

    public final void Field10() {
        int var1;
        if ((var1 = this.Field1.size()) > 0) {
            for (int var2 = 0; var2 < var1; ++var2) {
                Class269 var3;
                if ((var3 = (Class269) this.Field1.elementAt(var2)) != null) {
                    var3.Field1();
                    if (var3.Field2) {
                        this.Field1.removeElement(var3);
                    }
                }
            }
        }

    }

    public final void Field1(Graphics var1, int var2, int var3, boolean var4) {
        int var5;
        if ((var5 = this.Field1.size()) > 0) {
            for (int var6 = 0; var6 < var5; ++var6) {
                Class269 var7;
                if ((var7 = (Class269) this.Field1.elementAt(var6)) != null) {
                    var7.Field1(var1, var2, var3 + (var4 ? var7.Field7 : 0));
                }
            }
        }

    }

    public final void Field2(Graphics var1, int var2, int var3, boolean var4) {
        int var5;
        if ((var5 = this.Field1.size()) > 0) {
            for (int var6 = 0; var6 < var5; ++var6) {
                Class269 var7;
                if ((var7 = (Class269) this.Field1.elementAt(var6)) != null) {
                    var7.Field2(var1, var2, var3 + (var4 ? var7.Field7 : 0));
                }
            }
        }

    }

    public final void Field1(int var1, int var2, int var3, long var4, boolean var6, boolean var7, boolean var8, int var9, byte var10, byte var11) {
        if ((var2 = this.Field1.size()) > 0) {
            for (var3 = 0; var3 < var2; ++var3) {
                Class269 var13;
                if ((var13 = (Class269) this.Field1.elementAt(var3)) != null && var13.Field3 == var1) {
                    var13.Field8 = var4;
                    return;
                }
            }
        }

        Class269 var12;
        (var12 = new Class269(var1, var4, var6, var7, var8, 0, var11)).Field1(var10);
        this.Field1.addElement(var12);
    }

    public final void Field1(int var1, int var2, int var3, long var4) {
        if ((var2 = this.Field1.size()) > 0) {
            for (var3 = 0; var3 < var2; ++var3) {
                Class269 var6;
                if ((var6 = (Class269) this.Field1.elementAt(var3)) != null && var6.Field3 == var1) {
                    var6.Field8 = var4;
                    return;
                }
            }
        }

        Class269 var7 = new Class269(var1, var4);
        this.Field1.addElement(var7);
    }

    public final boolean Field11() {
        for (int var1 = 0; var1 < this.Field1.size(); ++var1) {
            Class269 var2;
            if ((var2 = (Class269) this.Field1.elementAt(var1)) != null && var2.Field5) {
                return false;
            }
        }

        return true;
    }

    public final void Field12() {
        this.Field6 = -4;
        this.Field7 = -4;
    }

    public final void Field13() {
        this.Field6 = -2;
        this.Field7 = -2;
        if (this.Field4 <= 0) {
            this.Field19();
        }

    }

    public byte Field14() {
        return 0;
    }

    public final byte Field15() {
        return super.Field204;
    }

    public final short Field16() {
        return this.Field17;
    }

    public final short Field17() {
        return this.Field12;
    }
}
