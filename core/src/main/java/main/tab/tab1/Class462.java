package main.tab.tab1;

import java.util.Vector;

import main.lib.Graphics;

public final class Class462 extends Class665 {
    public Vector Field1 = new Vector();
    byte Field2;
    private int Field3;
    private int Field4;
    private static Class462 Field5;

    public static Class462 Field5() {
        return Field5 == null ? (Field5 = new Class462()) : Field5;
    }

    public final void Field1(Class86 var1) {
        try {
            this.Field1 = new Vector();
            byte var2 = var1.Field2().readByte();

            for (int var3 = 0; var3 < var2; ++var3) {
                byte var4 = var1.Field2().readByte();
                this.Field1.addElement((var4 < 10 ? "0" : "") + var4);
            }

        } catch (Exception var5) {
        }
    }

    public final void Field1(Graphics var1) {
        Class105.Field19.Field1(var1);
        Class105.Field1(var1);
        int var2 = this.Field3;
        int var3 = this.Field4;
        Class804.Field3(var1, var2 - 5, var3 - 5, 171, 171);
        var1.setColor(16777215);
        var1.fillRect(var2 + (this.Field2 % 10 << 4), var3 + (this.Field2 / 10 << 4), 16, 16);

        int var4;
        for (var4 = 0; var4 < 100; ++var4) {
            var1.drawImage(Class804.Field20, var2 + (var4 % 10 << 4), var3 + (var4 / 10 << 4), 0);
        }

        for (var4 = 0; var4 < this.Field1.size(); ++var4) {
            String var5 = (String) this.Field1.elementAt(var4);
            Class21.Field10[1].Field1(var1, var5, var2 + 3 + (var4 % 10 << 4), var3 + 2 + (var4 / 10 << 4), 0);
        }

        super.Field1(var1);
    }

    public final void Field4() {
        Class105.Field19.Field4();
        super.Field4();
    }

    public final void Field3() {
        if (Class105.Field3[8]) {
            Class105.Field3[8] = false;
            this.Field2 = (byte) (this.Field2 + 10);
            if (this.Field2 > 99) {
                this.Field2 = 0;
            }
        } else if (Class105.Field3[4]) {
            Class105.Field3[4] = false;
            --this.Field2;
            if (this.Field2 < 0) {
                this.Field2 = 99;
            }
        } else if (Class105.Field3[6]) {
            Class105.Field3[6] = false;
            ++this.Field2;
            if (this.Field2 > 99) {
                this.Field2 = 0;
            }
        } else if (Class105.Field3[2]) {
            Class105.Field3[2] = false;
            this.Field2 = (byte) (this.Field2 - 10);
            if (this.Field2 < 0) {
                this.Field2 = 99;
            }
        }

        if (Class105.Field1(this.Field3, this.Field4, 160, 160) && Class105.Field7) {
            int var1 = (Class105.Field31 - this.Field3) / 16;
            int var2 = (Class105.Field30 - this.Field4) / 16;
            this.Field2 = (byte) (var2 * 10 + var1);
            if (this.Field2 <= 0) {
                this.Field2 = 0;
            }

            if (this.Field2 > 99) {
                this.Field2 = 99;
            }

            Class105.Field7 = false;
            if (super.Field104 != null) {
                super.Field104.Field2.Field1();
            }
        }

        super.Field3();
    }

    public final void Field1() {
        super.Field1();
        this.Field2();
    }

    public final void Field2() {
        super.Field2();
        super.Field104 = new Class87("Chọn", new Class515(this));
        super.Field105 = new Class87("Đóng", new Class820(this));
        this.Field3 = Class105.Field15 - 80;
        this.Field4 = (Class105.Field14 - 35) / 2 - 80;
        if (this.Field4 < 10) {
            this.Field4 = 10;
        }

    }
}
