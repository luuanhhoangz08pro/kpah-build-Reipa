package main.tab.tab1;

import main.lib.Graphics;

public final class Class181 extends Class665 {
    public static Class181 Field1;
    public Class585[] Field2;
    Class585[] Field3;
    public int Field4 = 0;
    private Class87 Field6;
    private Class87 Field7;
    public Class87 Field5;
    private Class87 Field8;

    public static Class181 Field5() {
        return Field1 == null ? (Field1 = new Class181()) : Field1;
    }

    public final void Field1(Class585[] var1) {
        if (Class96.Field1().Field3) {
            Class105.Field22.Field9();
            if (!Class105.Field19.Field84) {
                Class105.Field7();
            }

            this.Field2 = var1;
            this.Field3 = new Class585[var1.length];
            this.Field3 = var1;
            this.Field6 = new Class87("Chọn", new Class846(this));
            this.Field7 = new Class87("Tạo mới", new Class1(this));
            this.Field5 = new Class87("Xóa", new Class828(this));
            this.Field8 = new Class87("Thoát", new Class832(this));
            if (this.Field4 < this.Field3.length) {
                super.Field104 = this.Field6;
                super.Field103 = this.Field5;
            } else {
                super.Field104 = this.Field7;
                super.Field103 = null;
            }

            super.Field105 = this.Field8;
            if (var1.length > 0) {
                if (var1[this.Field4].Field54 == 1) {
                    this.Field5.Field1 = "Xóa";
                    return;
                }

                this.Field5.Field1 = "Khôi phục";
            }

        }
    }

    public final void Field1(Graphics var1) {
        Class767.Field5();
        Class767.Field2(var1);
        Class105.Field1(var1);
        Class21.Field2.Field1(var1, "Chọn nhân vật:", Class105.Field15, Class105.Field16 - 65, 2);
        int var2 = Class105.Field15 - 60;
        int var3 = Class105.Field16 - 30;
        int var4 = 0;

        for (var2 = var2; var4 < 3; var2 += 40) {
            if (var4 == this.Field4) {
                var1.setColor(15769344);
                if (var4 < this.Field2.length) {
                    var1.setColor(this.Field2.length > 0 && this.Field2[var4].Field54 != 1 ? 2205861 : 15769344);
                }
            } else {
                var1.setColor(10644224);
                if (var4 < this.Field2.length) {
                    var1.setColor(this.Field2.length > 0 && this.Field2[var4].Field54 != 1 ? '袅' : 10644224);
                }
            }

            var1.fillRect(var2 + 3, var3 - 10, 34, 84);
            var1.setColor(1379840);
            var1.drawRect(var2 + 3, var3 - 10, 34, 84);
            if (var4 < this.Field3.length) {
                this.Field3[var4].Field193 = (short) (var2 + 20);
                this.Field3[var4].Field194 = (short) (var3 + 64);
                this.Field3[var4].Field1(var1, this.Field3[var4].Field193, this.Field3[var4].Field194);
            }

            ++var4;
        }

        if (this.Field4 < this.Field3.length) {
            Class21.Field2.Field1(var1, this.Field2[this.Field4].Field65 + " lv: " + (this.Field2[this.Field4].Field45 > 0 ? this.Field2[this.Field4].Field45 : 1), Class105.Field15, Class105.Field16 + 45, 2);
            if (this.Field2[this.Field4].Field54 == 0) {
                Class21.Field2.Field1(var1, "Còn lại: " + this.Field2[this.Field4].Field50 + " ngày", Class105.Field15, Class105.Field16 + 58, 2);
            }

            if (this.Field2[this.Field4].Field201 != -1) {
                var4 = Class21.Field2.Field1(this.Field2[this.Field4].Field65 + " lv: " + (this.Field2[this.Field4].Field45 > 0 ? this.Field2[this.Field4].Field45 : 1));
                var1.drawRegion(Class804.Field41, 0, this.Field2[this.Field4].Field201 * 11, 11, 11, 0, Class105.Field15 - var4 / 2 - 15, Class105.Field16 + 48, 20);
            }
        }

        super.Field1(var1);
    }

    public final void Field4() {
        Class105.Field22.Field8();

        for (int var1 = 0; var1 < this.Field3.length; ++var1) {
            this.Field3[var1].Field2();
        }

        boolean var3 = false;
        if (Class105.Field2(4)) {
            --this.Field4;
            var3 = true;
            if (this.Field4 < 0) {
                this.Field4 = 2;
            }

            if (this.Field2.length > 0) {
                if (this.Field4 < this.Field2.length) {
                    if (this.Field2[this.Field4].Field54 == 1) {
                        this.Field5.Field1 = "Xóa";
                    } else {
                        this.Field5.Field1 = "Khôi phục";
                    }
                } else {
                    this.Field5.Field1 = "";
                }
            }
        } else if (Class105.Field2(6)) {
            ++this.Field4;
            var3 = true;
            if (this.Field4 > 2) {
                this.Field4 = 0;
            }

            if (this.Field2.length > 0) {
                if (this.Field4 < this.Field2.length) {
                    if (this.Field2[this.Field4].Field54 == 1) {
                        this.Field5.Field1 = "Xóa";
                    } else {
                        this.Field5.Field1 = "Khôi phục";
                    }
                } else {
                    this.Field5.Field1 = "";
                }
            }
        }

        int var2 = -1;
        if (Class105.Field7 && Class105.Field1(Class105.Field15 - 58, Class105.Field16 - 40, 115, 84)) {
            var2 = (Class105.Field10 - (Class105.Field15 - 58)) / 38;
            var3 = true;
        }

        if (var3) {
            if (this.Field4 < this.Field3.length) {
                super.Field104 = this.Field6;
                super.Field103 = this.Field5;
            } else {
                super.Field104 = this.Field7;
                super.Field103 = null;
            }

            if (var2 == this.Field4) {
                super.Field104.Field2.Field1();
            }

            if (var2 < 3 && var2 >= 0) {
                this.Field4 = var2;
            }
        }

        super.Field4();
    }
}
