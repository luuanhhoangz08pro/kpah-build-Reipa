package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

import main.lib.Image;

public abstract class Class128 {
    public Class87 Field103;
    public Class87 Field104;
    public Class87 Field105;
    public static Image Field106;
    boolean Field107 = false;

    public void Field1(Graphics var1) {
        Class105.Field1(var1);
        if (this.Field103 != null) {
            Class21.Field2.Field1(var1, this.Field103.Field1, 5, Class105.Field14 - Class665.Field108, 0);
        }

        if (this.Field104 != null) {
            Class21.Field2.Field1(var1, this.Field104.Field1, Class105.Field15, Class105.Field14 - Class665.Field108, 2);
        }

        if (this.Field105 != null) {
            Class21.Field2.Field1(var1, this.Field105.Field1, Class105.Field13 - 5, Class105.Field14 - Class665.Field108, 1);
        }

        if (Class103.Field2 > 0) {
            var1.drawImage(Class804.Field33, Class105.Field13 - 7, 7, 3);
        }

        if (Class63.Field62.size() <= 0 && Field106 != null) {
            var1.drawImage(Field106, Class105.Field15, 0, 17);
        }

    }

    public void Field3() {
        if (Class105.Field7) {
            if (Field106 != null && Class105.Field1(Class105.Field15 - 40, 0, 80, 20)) {
                if (Class105.Field17 == Class105.Field19) {
                    if (!Class105.Field33) {
                        Vector var1;
                        (var1 = new Vector()).addElement(new Class87("Bàn phím", new Class156(this)));
                        var1.addElement(new Class87("Thay đồ", new Class155(this)));
                        var1.addElement(new Class87("Thay Thú*Pet", new Class108(2)));
                        Class105.Field21.Field1(var1, 3);
                    } else {
                        if (this.Field107) {
                            Class190.Field6 = true;
                        }

                        Class105.Field33 = !Class105.Field33;
                        Class105.Field1.sizeChanged(0, 0);
                        Class105.Field7 = false;
                    }
                } else {
                    if (!Class105.Field33) {
                        if (Class190.Field6) {
                            this.Field107 = true;
                            Class190.Field6 = false;
                        }
                    } else if (this.Field107) {
                        Class190.Field6 = true;
                    }

                    Class105.Field33 = !Class105.Field33;
                    Class105.Field1.sizeChanged(0, 0);
                    Class105.Field7 = false;
                }
            }

            if (Math.abs(Class105.Field30 - Class105.Field11) <= 10 && Math.abs(Class105.Field31 - Class105.Field10) <= 10) {
                switch (Class105.Field9()) {
                    case 0:
                        if (this.Field103 != null && this.Field103.Field2 != null) {
                            this.Field103.Field2.Field1();
                            Class105.Field7 = false;
                        }
                        break;
                    case 1:
                        if (this.Field104 != null && this.Field104.Field2 != null) {
                            Class105.Field7();
                            this.Field104.Field2.Field1();
                            Class105.Field7 = false;
                        }
                        break;
                    case 2:
                        if (this.Field105 != null && this.Field105.Field2 != null) {
                            this.Field105.Field2.Field1();
                            Class105.Field7 = false;
                        }
                }
            }
        }

        if (Class105.Field3[5]) {
            if (this.Field104 != null && this.Field104.Field2 != null) {
                this.Field104.Field2.Field1();
                Class105.Field3[5] = false;
                return;
            }
        } else if (Class105.Field3[12]) {
            if (this.Field103 != null && this.Field103.Field2 != null) {
                this.Field103.Field2.Field1();
                Class105.Field3[12] = false;
                return;
            }
        } else if (Class105.Field27) {
            if (Class105.Field4[13] && this.Field105 != null && this.Field105.Field2 != null) {
                this.Field105.Field2.Field1();
                Class105.Field4[13] = false;
                return;
            }
        } else if (Class105.Field3[13] && this.Field105 != null && this.Field105.Field2 != null) {
            this.Field105.Field2.Field1();
            Class105.Field3[13] = false;
        }

    }
}
