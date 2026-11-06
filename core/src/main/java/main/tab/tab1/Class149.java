package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class149 extends Class665 {
    private static Class149 Field10;
    Vector Field1 = new Vector();
    private int Field11;
    private boolean Field12;
    private boolean Field13;
    private boolean Field14;
    Class87 Field2 = new Class87("Bắt đầu", new Class43(this));
    private Class87 Field15 = new Class87("Chọn", new Class46(this));
    private Class87 Field16;
    Class87 Field3 = new Class87("", new Class139(this));
    long Field4;
    public String[] Field5;
    public String[] Field6;
    public int Field7;
    public int Field8;
    public int Field9;

    public static Class149 Field5() {
        return Field10 == null ? (Field10 = new Class149()) : Field10;
    }

    public final void Field1() {
        super.Field1();
        this.Field2();
    }

    public final void Field6() {
        this.Field11 = 0;
        this.Field12 = false;
        this.Field14 = false;
        this.Field13 = false;
        super.Field104 = this.Field2;
        super.Field105 = this.Field3;
        this.Field7 = 0;
        this.Field8 = this.Field9 = 0;
        byte var1;
        if (this.Field6 != null) {
            for (var1 = 0; var1 < this.Field6.length; ++var1) {
                this.Field6[var1] = "";
            }
        }

        this.Field1.removeAllElements();
        if (this.Field5 != null) {
            for (var1 = 0; var1 < this.Field5.length; ++var1) {
                this.Field5[var1] = "";
            }
        }

    }

    public final void Field1(byte var1, String var2, String[] var3) {
        this.Field5 = var3;
        String[] var6 = Class21.Field8.Field1(var2, 100);

        for (int var8 = 0; var8 < this.Field1.size(); ++var8) {
            Class639 var4;
            if ((var4 = (Class639) this.Field1.elementAt(var8)).Field5 == var1) {
                var4.Field8 = 1;
                var8 = var4.Field2;
                int var7 = var4.Field1;
                this.Field6 = var6;
                this.Field7 = var7;
                this.Field8 = var8;
                this.Field9 = var8 - 20;
                return;
            }
        }

    }

    public final void Field1(Class86 var1) {
        try {
            byte var2 = var1.Field2().readByte();
            byte var3 = var1.Field2().readByte();
            this.Field5 = new String[var3];

            for (var3 = 0; var3 < this.Field5.length; ++var3) {
                this.Field5[var3] = var1.Field2().readUTF();
            }

            var2 = var2;
            Class149 var6 = this;
            this.Field1.removeAllElements();

            for (int var7 = 0; var7 < var2; ++var7) {
                Class639 var4;
                (var4 = new Class639()).Field5 = var7;
                var6.Field1.addElement(var4);
            }

            this.Field2();
        } catch (Exception var5) {
        }
    }

    public final void Field2() {
        if (this.Field1 != null && this.Field1.size() > 0) {
            Class149 var1 = this;
            int var2 = Class105.Field13 / 2;
            int var3 = Class105.Field14 / 2;
            byte var4 = 0;
            int[][] var5 = new int[][]{{Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2 + Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2 + Class105.Field13 / 5}, {Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 + Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 + Class105.Field13 / 5}, {Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 + Class105.Field13 / 5, Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 + Class105.Field13 / 5, Class105.Field13 / 2 - Class105.Field13 / 5, Class105.Field13 / 2, Class105.Field13 / 2 + Class105.Field13 / 5}};
            int[][] var6 = new int[][]{{Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2, Class105.Field14 / 2 + Class105.Field14 / 5, Class105.Field14 / 2 + Class105.Field14 / 5}, {Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2, Class105.Field14 / 2 + Class105.Field14 / 5, Class105.Field14 / 2 + Class105.Field14 / 5, Class105.Field14 / 2 + Class105.Field14 / 5}, {Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2 - Class105.Field14 / 5, Class105.Field14 / 2, Class105.Field14 / 2, Class105.Field14 / 2, Class105.Field14 / 2 + Class105.Field14 / 5, Class105.Field14 / 2 + Class105.Field14 / 5, Class105.Field14 / 2 + Class105.Field14 / 5}};
            if (this.Field1.size() == 7) {
                var4 = 1;
            }

            if (this.Field1.size() == 9) {
                var4 = 2;
            }

            for (int var7 = 0; var7 < var1.Field1.size(); ++var7) {
                Class639 var8;
                (var8 = (Class639) var1.Field1.elementAt(var7)).Field1 = var2;
                var8.Field2 = var3;
                var8.Field3 = var5[var4][var7];
                var8.Field4 = var6[var4][var7];
                var8.Field6 = var8.Field3;
                var8.Field7 = var8.Field4;
            }
        }

        super.Field2();
    }

    public Class149() {
        super.Field104 = this.Field2;
        this.Field16 = new Class87("Mở hết", new Class73(this));
    }

    public final void Field1(Graphics var1) {
        Class105.Field19.Field1(var1);
        Class804.Field4(var1, 10, 20, Class105.Field13 - 20, Class105.Field14 - 60);
        Class21.Field2.Field1(var1, "Hộp may mắn", Class105.Field15, 25, 2);

        for (int var2 = 0; var2 < this.Field1.size(); ++var2) {
            Class639 var3;
            if ((var3 = (Class639) this.Field1.elementAt(var2)) != null) {
                var1.setColor(15852810);
                var1.fillRect(var3.Field1 - 16, var3.Field2 - 16, 32, 32);
                var1.setColor(34949);
                var1.fillRect(var3.Field1 - 14, var3.Field2 - 14, 28, 28);
                var1.drawImage(Class804.Field32[var3.Field8], var3.Field1, var3.Field2, 3);
                if (Class105.Field12 % 4 == 0 && this.Field11 == var2 && !this.Field12) {
                    var1.setColor(16777215);
                    var1.drawRect(var3.Field1 - 17, var3.Field2 - 17, 34, 34);
                }
            }
        }

        if (this.Field8 != this.Field9) {
            for (byte var6 = 0; var6 < this.Field6.length; ++var6) {
                Class21.Field10[0].Field1(var1, this.Field6[var6], this.Field7, this.Field8 + var6 * 14, 2);
            }
        }

        super.Field1(var1);
    }

    public final void Field4() {
        for (int var1 = 0; var1 < this.Field1.size(); ++var1) {
            Class639 var2;
            if ((var2 = (Class639) this.Field1.elementAt(var1)) != null) {
                if (var2.Field1 != var2.Field3) {
                    if (var2.Field3 - var2.Field1 >> 1 == 0) {
                        var2.Field1 = var2.Field3;
                    } else {
                        var2.Field1 += var2.Field3 - var2.Field1 >> 1;
                    }
                }

                if (var2.Field2 != var2.Field4) {
                    if (var2.Field4 - var2.Field2 >> 1 == 0) {
                        var2.Field2 = var2.Field4;
                    } else {
                        var2.Field2 += var2.Field4 - var2.Field2 >> 1;
                    }
                }
            }
        }

        if (this.Field12 && this.Field4 - System.currentTimeMillis() / 1000L <= 0L && this.Field13) {
            this.Field13 = false;
            this.Field7();
            super.Field104 = this.Field15;
            super.Field105 = this.Field16;
            this.Field14 = true;
        }

        Class149 var4 = this;
        if (this.Field8 != this.Field9) {
            --this.Field8;
        } else {
            this.Field8 = this.Field9;
            if (this.Field6 != null) {
                for (byte var3 = 0; var3 < var4.Field6.length; ++var3) {
                    var4.Field6[var3] = "";
                }
            }
        }

        super.Field4();
    }

    public final void Field3() {
        if (Class105.Field3[4]) {
            Class105.Field3[4] = false;
            if (!this.Field12) {
                --this.Field11;
                if (this.Field11 < 0) {
                    this.Field11 = 0;
                }
            }
        } else if (Class105.Field3[6]) {
            Class105.Field3[6] = false;
            if (!this.Field12) {
                ++this.Field11;
                if (this.Field11 > this.Field1.size() - 1) {
                    this.Field11 = this.Field1.size() - 1;
                }
            }
        }

        Class149 var1 = this;
        if (Class105.Field7 && this.Field1.size() > 0) {
            for (int var2 = 0; var2 < var1.Field1.size(); ++var2) {
                Class639 var3;
                if ((var3 = (Class639) var1.Field1.elementAt(var2)) != null && Class105.Field10 >= var3.Field1 - 16 && Class105.Field10 <= var3.Field1 + 16 && Class105.Field11 >= var3.Field2 - 16 && Class105.Field11 <= var3.Field2 + 16) {
                    Class105.Field7 = false;
                    if (var1.Field14) {
                        var1.Field11 = var3.Field5;
                        var1.Field104.Field2.Field1();
                        break;
                    }
                }
            }
        }

        super.Field3();
    }

    public final void Field7() {
        this.Field12 = !this.Field12;

        for (int var1 = 0; var1 < this.Field1.size(); ++var1) {
            Class639 var2 = (Class639) this.Field1.elementAt(var1);
            if (this.Field12) {
                var2.Field3 = Class105.Field13 / 2;
                var2.Field4 = Class105.Field14 / 2;
            } else {
                var2.Field3 = var2.Field6;
                var2.Field4 = var2.Field7;
            }
        }

    }

    static void Field1(Class149 var0, boolean var1) {
        var0.Field13 = var1;
    }

    static int Field1(Class149 var0) {
        return var0.Field11;
    }

    static void Field1(Class149 var0, int var1) {
        var0.Field11 = 0;
    }

    static void Field2(Class149 var0, boolean var1) {
        var0.Field12 = false;
    }

    static void Field3(Class149 var0, boolean var1) {
        var0.Field14 = false;
    }
}
