package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public final class Class229 extends Class131 {
    public boolean Field1;
    public Vector Field2;
    public int Field3;
    private int Field4;
    private int Field5;
    private int Field6;
    private int Field7;
    private int Field8;
    private int Field9 = 0;
    private boolean Field10;
    private int Field11;
    private int Field12;
    private int Field13;
    private int Field14 = 0;
    private int Field15 = 0;

    public Class229() {
        super.Field103 = new Class86("Chọn", new Class321(this));
        super.Field104 = new Class86("", super.Field103.Field2);
        super.Field105 = new Class86("Đóng", new Class322(this));
    }

    public final void Field1() {
        if (this.Field2 != null) {
            this.Field3 = Class62.Field66.nextInt(this.Field2.size());
            this.Field13 = this.Field3 * Class671.Field109 - (Class671.Field109 << 1);
            if (this.Field13 < 0) {
                this.Field13 = 0;
            }

            if (this.Field13 > this.Field15) {
                this.Field13 = this.Field15;
            }
        }

    }

    public final void Field1(Vector var1, int var2) {
        if (var1.size() > 0) {
            this.Field2 = var1;
            this.Field6 = 0;
            this.Field7 = 0;

            for (int var3 = 0; var3 < var1.size(); ++var3) {
                Class86 var4 = (Class86) var1.elementAt(var3);
                int var5;
                if ((var5 = Class21.Field10[0].Field1(var4.Field1)) > this.Field6) {
                    this.Field6 = var5;
                }

                this.Field7 += Class671.Field109;
            }

            this.Field6 += 10;
            if (this.Field6 < 100) {
                this.Field6 = 100;
            }

            if (this.Field7 > Class671.Field109 << 2) {
                this.Field7 = Class671.Field109 << 2;
            }

            this.Field7 += 4;
            this.Field5 = Class106.Field14 - 27 - this.Field7;
            if (var2 == 0) {
                this.Field4 = 2;
            } else if (var2 == 1) {
                this.Field4 = Class106.Field13 - this.Field6 - 2;
            } else if (var2 == 2) {
                this.Field4 = (Class106.Field13 >> 1) - (this.Field6 >> 1);
                this.Field5 = Class106.Field14 - this.Field7 >> 1;
            } else {
                this.Field4 = (Class106.Field13 >> 1) - (this.Field6 >> 1);
            }

            if (Class106.Field14 < 200) {
                this.Field5 += 10;
            }

            this.Field8 = Class106.Field14 - Class671.Field109;
            this.Field1 = true;
            this.Field3 = 0;
            this.Field15 = (this.Field2.size() - 4) * Class671.Field109;
            if (this.Field15 < 0) {
                this.Field15 = 0;
            }

            this.Field3 = 0;
            this.Field14 = 0;
            this.Field13 = 0;
            if (Class106.Field27) {
                Class106.Field6();
            }

        }
    }

    private void Field1(int var1) {
        this.Field3 += var1;
        if (this.Field3 < 0) {
            this.Field3 = this.Field2.size() - 1;
        }

        if (this.Field3 > this.Field2.size() - 1) {
            this.Field3 = 0;
        }

        this.Field13 = this.Field3 * Class671.Field109 - (Class671.Field109 << 1);
        if (this.Field13 < 0) {
            this.Field13 = 0;
        }

        if (this.Field13 > this.Field15) {
            this.Field13 = this.Field15;
        }

    }

    public final void Field2() {
        if (Class106.Field2(2)) {
            this.Field1(-1);
        } else if (Class106.Field2(8)) {
            this.Field1(1);
        }

        int var1;
        if (Class106.Field6 && Class106.Field1(this.Field4, this.Field5, this.Field6, this.Field7)) {
            if (!this.Field10) {
                this.Field9 = this.Field14;
                this.Field10 = true;
                this.Field14 = this.Field13;
            }

            var1 = this.Field8 + 2;
            if ((var1 = (this.Field13 + Class106.Field11 - var1) / Class671.Field109) < 0) {
                var1 = 0;
            }

            if (var1 > this.Field2.size() - 1) {
                var1 = this.Field2.size() - 1;
            }

            this.Field3 = var1;
            if (Math.abs(Class106.Field30 - Class106.Field11) != 0) {
                this.Field13 = this.Field9 + (Class106.Field30 - Class106.Field11);
                if (this.Field13 < 0) {
                    this.Field13 = 0;
                }

                if (this.Field13 > this.Field15) {
                    this.Field13 = this.Field15;
                }

                this.Field3 = -1;
            }
        }

        if (Class106.Field7) {
            this.Field10 = false;
            if (Class106.Field1(this.Field4, this.Field5, this.Field6, this.Field7)) {
                Class106.Field7 = false;
                var1 = this.Field8 + 2;
                if ((var1 = (this.Field13 + Class106.Field11 - var1) / Class671.Field109) < 0) {
                    var1 = 0;
                }

                if (var1 > this.Field2.size() - 1) {
                    var1 = this.Field2.size() - 1;
                }

                if (Math.abs(Class106.Field30 - Class106.Field11) <= 10 && this.Field14 == this.Field13) {
                    this.Field3 = var1;
                    if (this.Field3 != -1 && super.Field104 != null) {
                        super.Field104.Field2.Field1();
                    }
                }
            }
        }

        super.Field3();
    }

    public final void Field2(Graphics var1) {
        Class106.Field1(var1);
        if (this.Field14 != this.Field13) {
            this.Field11 = this.Field13 - this.Field14 << 2;
            this.Field12 += this.Field11;
            this.Field14 += this.Field12 >> 4;
            this.Field12 &= 15;
            if (this.Field14 < 0) {
                this.Field14 = 0;
            }
        }

        var1.setColor(11908533);
        var1.fillRect(this.Field4 - 2, this.Field5 - 2, this.Field6 + 4, this.Field7 + 5);
        var1.setColor(2181450);
        var1.fillRect(this.Field4, this.Field8, this.Field6, this.Field7);
        var1.setClip(this.Field4 - 2, this.Field5, this.Field6 + 5, this.Field7 + 3);
        var1.translate(this.Field4 + 5, this.Field8 + 2);

        for (int var2 = 0; var2 < this.Field2.size(); ++var2) {
            Class21 var3 = Class21.Field8;
            if (this.Field3 != -1 && var2 == this.Field3) {
                var1.setColor(11495168);
                var1.fillRect(-3, var2 * Class671.Field109 - this.Field14, this.Field6 - 4, Class671.Field109);
                var3 = Class21.Field10[0];
            }

            if (Class106.Field27) {
                Class21.Field2.Field1(var1, ((Class86) this.Field2.elementAt(var2)).Field1, Class106.Field15, 3 + var2 * Class671.Field109 - this.Field14, 2);
            } else {
                var3.Field1(var1, ((Class86) this.Field2.elementAt(var2)).Field1, 0, 3 + var2 * Class671.Field109 - this.Field14, 0);
            }
        }

        super.Field1(var1);
    }

    public final void Field4() {
        if (this.Field8 > this.Field5) {
            int var1;
            if ((var1 = this.Field8 - this.Field5 >> 1) < 1) {
                var1 = 1;
            }

            this.Field8 -= var1;
        }

        this.Field8 = this.Field5;
    }
}
