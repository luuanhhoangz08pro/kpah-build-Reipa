package main.tab.tab1;

import main.lib.Graphics;

import java.util.Vector;

public final class Class17 extends Class665 {
    public static Class17 Field1;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    public int Field2;
    public int Field3;
    private Vector Field9 = new Vector();
    private boolean Field10;
    private int Field11;

    public final void Field1() {
        super.Field1();
        this.Field2();
    }

    public final void Field2() {
        this.Field9 = new Vector();

        for (int var1 = 0; var1 < Class63.Field63.size(); ++var1) {
            Class150 var2 = (Class150) Class63.Field63.elementAt(var1);
            var2.Field2 = Class21.Field8.Field1(var2.Field1, Class105.Field13 - 44);
            this.Field9.addElement(var2);
            this.Field3 += var2.Field2.length;
        }

        this.Field8 = this.Field3 * 15 - (Class105.Field14 - 60) + 35;
        if (this.Field8 < 0) {
            this.Field8 = 0;
        }

        this.Field5 = this.Field4 = 0;
    }

    public Class17() {
        super.Field105 = new Class87("Đóng", new Class186(this));
    }

    public final void Field1(Graphics var1) {
        Class105.Field19.Field1(var1);
        Class804.Field4(var1, 20, 20, Class105.Field13 - 40, Class105.Field14 - 60);
        Class21.Field2.Field1(var1, "Kênh thế giới", Class105.Field13 / 2, 26, 2);
        var1.setClip(20, 46, Class105.Field13 - 40, Class105.Field14 - 90);
        var1.translate(20, 47);
        var1.translate(0, -this.Field5);
        if (this.Field9.size() > 0) {
            Class804.Field2(var1, 4, this.Field2 * 15 + 2, Class105.Field13 - 49, 15);
        }

        int var2 = 2;

        for (int var3 = 0; var3 < this.Field9.size(); ++var3) {
            Class150 var4 = (Class150) this.Field9.elementAt(var3);

            for (int var5 = 0; var5 < var4.Field2.length; ++var5) {
                Class21.Field8.Field1(var1, var4.Field2[var5], 8, var2, 0);
                var2 += 15;
            }
        }

        Class105.Field1(var1);
        var1.setClip(0, 0, Class105.Field13, Class105.Field14);
        super.Field1(var1);
    }

    public final void Field3() {
        boolean var1 = false;
        if (Class105.Field1(20, 20, Class105.Field13 - 40, Class105.Field14 - 60)) {
            if (Class105.Field6) {
                if (!this.Field10) {
                    this.Field11 = this.Field5;
                    this.Field10 = true;
                }

                if (Math.abs(Class105.Field30 - Class105.Field11) != 0) {
                    this.Field4 = this.Field11 + (Class105.Field30 - Class105.Field11);
                    if (this.Field4 < 0) {
                        this.Field4 = 0;
                    }

                    if (this.Field4 > this.Field8) {
                        this.Field4 = this.Field8;
                    }
                }
            }

            if (Class105.Field7) {
                Class105.Field7 = false;
                this.Field2 = (this.Field4 + Class105.Field11 - 47) / 15;
                if (this.Field2 > this.Field3 - 1) {
                    this.Field2 = this.Field3 - 1;
                }

                if (this.Field2 < 0) {
                    this.Field2 = 0;
                }

                this.Field10 = false;
            }
        }

        if (Class105.Field3[8]) {
            Class105.Field3[8] = false;
            ++this.Field2;
            if (this.Field2 > this.Field3 - 1) {
                this.Field2 = this.Field3 - 1;
            }

            var1 = true;
        } else if (Class105.Field3[2]) {
            Class105.Field3[2] = false;
            --this.Field2;
            if (this.Field2 < 0) {
                this.Field2 = 0;
            }

            var1 = true;
        }

        if (this.Field5 != this.Field4) {
            this.Field7 = this.Field4 - this.Field5 << 2;
            this.Field6 += this.Field7;
            this.Field5 += this.Field6 >> 4;
            this.Field6 &= 15;
            if (this.Field5 < 0) {
                this.Field5 = 0;
            }

            if (this.Field5 > this.Field8) {
                this.Field5 = this.Field8;
            }
        }

        if (var1) {
            this.Field4 = this.Field2 * 15 - (Class105.Field14 - 60) / 5;
        }

        super.Field3();
    }

    public final void Field4() {
        Class105.Field19.Field4();
        super.Field4();
    }
}
