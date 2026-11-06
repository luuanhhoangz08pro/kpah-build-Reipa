package main.tab.tab2;

import main.lib.Graphics;
import main.lib.Image;

import java.util.Vector;

public abstract class Class131 {
    public Class86 Field103;
    public Class86 Field104;
    public Class86 Field105;
    public static Image Field106;
    boolean Field107 = false;

    public void Field1(Graphics var1) {
        Class106.Field1(var1);
        if (this.Field103 != null) {
            Class21.Field2.Field1(var1, this.Field103.Field1, 5, Class106.Field14 - Class671.Field108, 0);
        }

        if (this.Field104 != null) {
            Class21.Field2.Field1(var1, this.Field104.Field1, Class106.Field15, Class106.Field14 - Class671.Field108, 2);
        }

        if (this.Field105 != null) {
            Class21.Field2.Field1(var1, this.Field105.Field1, Class106.Field13 - 5, Class106.Field14 - Class671.Field108, 1);
        }

        if (Class104.Field2 > 0) {
            var1.drawImage(Class811.Field33, Class106.Field13 - 7, 7, 3);
        }

        if (Class62.Field62.size() <= 0 && Field106 != null) {
            var1.drawImage(Field106, Class106.Field15, 0, 17);
        }

    }

    public void Field3() {
        if (Class106.Field7) {
            if (Field106 != null && Class106.Field1(Class106.Field15 - 40, 0, 80, 20)) {
                if (Class106.Field17 == Class106.Field19) {
                    if (!Class106.Field33) {
                        Vector var1;
                        (var1 = new Vector()).addElement(new Class86("Bàn phím", new Class160(this)));
                        var1.addElement(new Class86("Thay đồ", new Class158(this)));
                        var1.addElement(new Class86("Tìm bạn", new Class159(this)));
                        Class106.Field21.Field1(var1, 3);
                    } else {
                        if (this.Field107) {
                            Class194.Field6 = true;
                        }

                        Class106.Field33 = !Class106.Field33;
                        Class106.Field1.sizeChanged(0, 0);
                        Class106.Field7 = false;
                    }
                } else {
                    if (!Class106.Field33) {
                        if (Class194.Field6) {
                            this.Field107 = true;
                            Class194.Field6 = false;
                        }
                    } else if (this.Field107) {
                        Class194.Field6 = true;
                    }

                    Class106.Field33 = !Class106.Field33;
                    Class106.Field1.sizeChanged(0, 0);
                    Class106.Field7 = false;
                }
            }

            if (Math.abs(Class106.Field30 - Class106.Field11) <= 10 && Math.abs(Class106.Field31 - Class106.Field10) <= 10) {
                switch (Class106.Field9()) {
                    case 0:
                        if (this.Field103 != null && this.Field103.Field2 != null) {
                            this.Field103.Field2.Field1();
                            Class106.Field7 = false;
                        }
                        break;
                    case 1:
                        if (this.Field104 != null && this.Field104.Field2 != null) {
                            Class106.Field7();
                            this.Field104.Field2.Field1();
                            Class106.Field7 = false;
                        }
                        break;
                    case 2:
                        if (this.Field105 != null && this.Field105.Field2 != null) {
                            this.Field105.Field2.Field1();
                            Class106.Field7 = false;
                        }
                }
            }
        }

        if (Class106.Field3[5]) {
            if (this.Field104 != null && this.Field104.Field2 != null) {
                this.Field104.Field2.Field1();
                Class106.Field3[5] = false;
                return;
            }
        } else if (Class106.Field3[12]) {
            if (this.Field103 != null && this.Field103.Field2 != null) {
                this.Field103.Field2.Field1();
                Class106.Field3[12] = false;
                return;
            }
        } else if (Class106.Field27) {
            if (Class106.Field4[13] && this.Field105 != null && this.Field105.Field2 != null) {
                this.Field105.Field2.Field1();
                Class106.Field4[13] = false;
                return;
            }
        } else if (Class106.Field3[13] && this.Field105 != null && this.Field105.Field2 != null) {
            this.Field105.Field2.Field1();
            Class106.Field3[13] = false;
        }

    }
}
