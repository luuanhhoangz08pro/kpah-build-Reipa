package main.tab.tab1;

import main.lib.Graphics;
import main.tab.tab1.screen.MainTab;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;

public final class Class792 extends Class665 {
    public Class190 Field1 = new Class190();
    public Class190 Field2;
    int Field3;
    private int Field5;
    private int Field6;
    private boolean Field7;
    private Class87 Field8;
    private Class87 Field9;
    public static String Field4 = "19006610";
    private int Field10;
    private int Field11;
    private int Field12 = 160;
    private int Field13 = 160;
    private int Field14 = 128;
    private int Field15 = 0;
    private int Field16 = 0;
    private int Field17 = 0;

    public final void Field2() {
        this.Field6 = 110;
        this.Field5 = Class105.Field15 - this.Field6 / 2;
        this.Field1.Field3 = this.Field6;
        this.Field1.Field2 = Class105.Field16 - 13;
        this.Field2.Field2 = Class105.Field16 + 23;
        this.Field2.Field3 = this.Field6;
        this.Field1.Field1 = this.Field5;
        this.Field2.Field1 = this.Field5;
    }

    public Class792() {
        this.Field1.Field4 = Class665.Field109 + 2;
        this.Field1.Field5 = true;
        this.Field1.Field3(3);
        this.Field1.Field1("");
        this.Field2 = new Class190();
        this.Field2.Field4 = Class665.Field109 + 2;
        this.Field2.Field5 = false;
        this.Field2.Field3(2);
        this.Field2.Field1("");
        Class792 var1 = this;
        byte[] var2;
        if ((var2 = Class826.Field1("nqshlogin")) != null) {
            ByteArrayInputStream var6 = new ByteArrayInputStream(var2);
            DataInputStream var7 = new DataInputStream(var6);

            try {
                var1.Field7 = var7.readBoolean();
                if (var1.Field7) {
                    var1.Field1.Field1(var7.readUTF());
                    var1.Field1.Field2();
                    var1.Field2.Field1(var7.readUTF());
                    var1.Field2.Field2();
                }

                var7.close();
            } catch (Exception var3) {
                var3.printStackTrace();
            }
        }

        this.Field2();
        this.Field9 = new Class87(Class105.Field13 > 200 ? "Đăng nhập" : "Đ.Nhập", new Class404(this));
        super.Field104 = this.Field9;
        this.Field8 = new Class87("Nhớ", new Class401(this));
        Class87 var4 = new Class87(Class105.Field13 > 200 ? "Đăng ký" : "Đ.Ký", new Class402(this));
        if (Class105.Field27) {
            if (Class826.Field3("wifi") == 1) {
                Class105.Field28 = true;
            }

            super.Field103 = new Class87("Menu", new Class393(this, var4));
        } else {
            super.Field103 = new Class87("Menu", new Class395(this, var4));
        }

        super.Field105 = this.Field1.Field9;
        String var5;
        Field4 = (var5 = Class826.Field2("numbersupport")) == null ? Field4 : var5;
    }

    public final void Field5() {
        String var1 = this.Field1.Field5().toLowerCase().trim();
        String var2 = this.Field2.Field5();
        if (var1.equals("showagentpro")) {
            Class105.Field1("Agent: " + MainTab.Field5 + " Pro: " + MainTab.Field4 + " ClinenPro: " + MainTab.Field3 + " Ban thuong " + MainTab.Field8);
        } else if (!var1.equals("")) {
            if (var2.equals("")) {
                this.Field3 = 1;
                this.Field1.Field5 = false;
                this.Field2.Field5 = true;
                super.Field105 = this.Field2.Field9;
            } else {
                (new Thread(new Class164(this, var1, var2))).start();
                Class66.Field1(var1, var2);
                Class105.Field2("Đang kết nối", true);
            }
        }
    }

    public final void Field6() {
        String var1 = this.Field1.Field5().toLowerCase().trim();
        String var2 = this.Field2.Field5();
        if (var1.equals("")) {
            Class105.Field1("Vui lòng nhập Game ID muốn đăng ký vào ô trên.");
        } else if (var2.equals("")) {
            Class105.Field24.Field1((String) "Bạn phải nhập password đăng ký.", (Class87) null, new Class87("OK", new Class166(this)), (Class87) null);
            Class105.Field23 = Class105.Field24;
        } else {
            Class105.Field24.Field1 = false;
            Class105.Field24.Field1((String) ("Bạn có muốn đăng ký tài khoản: " + var1 + " không?"), new Class87("Có", new Class165(this)), (Class87) null, new Class87("Không", new Class167(this)));
            Class105.Field23 = Class105.Field24;
        }
    }

    public final void Field7() {
        if (!Class96.Field1().Field3) {
            Class105.Field2("Đang kết nối", true);
            Class105.Field2();
        } else {
            Class105.Field2("Đang đăng ký", true);
        }

        Class263.Field1().Field1(this.Field1.Field5().toLowerCase(), this.Field2.Field5());
    }

    public final boolean Field1(int var1) {
        if (this.Field1.Field5) {
            if (this.Field1.Field1(var1)) {
                return true;
            }
        } else if (this.Field2.Field5 && this.Field2.Field1(var1)) {
            return true;
        }

        return super.Field1(var1);
    }

    public final void Field1(Graphics var1) {
        Class767.Field5();
        Class767.Field2(var1);
        Class105.Field1(var1);
        var1.drawImage(Class105.Field29, Class105.Field15, Class105.Field16 - 70, 3);
        Class804.Field3(var1, Class105.Field15 - 70, Class105.Field16 - 50 + 15, 140, 100);
        Class21.Field10[0].Field1(var1, "Game ID:", this.Field5 + 5, Class105.Field16 - 26, 0);
        Class21.Field10[0].Field1(var1, "Password:", this.Field5 + 5, Class105.Field16 + 10, 0);
        this.Field1.Field1(var1);
        var1.setClip(0, 0, Class105.Field13, Class105.Field14);
        this.Field2.Field1(var1);
        var1.setClip(0, 0, Class105.Field13, Class105.Field14);
        Class804.Field36.Field1(this.Field3 == 2 ? 1 : 0, this.Field5 + 12, Class105.Field16 + 54, 0, 3, var1);
        if (this.Field7) {
            Class804.Field36.Field1(2, this.Field5 + 12, Class105.Field16 + 54, 0, 3, var1);
        }

        Class21.Field10[0].Field1(var1, "Nhớ mật khẩu", this.Field5 + 23, Class105.Field16 + 47, 0);
        Class21.Field2.Field1(var1, "Hotline: " + Field4, this.Field5 + 5, Class105.Field16 + 70, 0);
        super.Field1(var1);
    }

    public final void Field1() {
        super.Field1();
        this.Field2();
        Class134 var10000 = Class105.Field40;
        Class134.Field2();
    }

    public final void Field4() {
        this.Field1.Field4();
        this.Field2.Field4();
        if (this.Field17 < 20) {
            ++this.Field17;
            if (this.Field17 == 20) {
                Class105.Field19.Field31.Field1 = 2;
                Class105.Field19.Field31.Field2 = Class105.Field14 - 40;
            }
        }

        if (Class105.Field3[2]) {
            ++this.Field16;
            if (this.Field16 >= 52) {
                this.Field16 = 0;
            }
        }

        boolean var1 = false;
        if (Class105.Field2(2)) {
            --this.Field3;
            if (this.Field3 < 0) {
                this.Field3 = 2;
            }

            var1 = true;
        } else if (Class105.Field2(8)) {
            ++this.Field3;
            if (this.Field3 > 2) {
                this.Field3 = 0;
            }

            var1 = true;
        }

        if (var1) {
            if (this.Field3 == 1) {
                this.Field1.Field5 = false;
                this.Field2.Field5 = true;
                super.Field104 = this.Field9;
            } else if (this.Field3 == 0) {
                this.Field1.Field5 = true;
                this.Field2.Field5 = false;
                super.Field104 = this.Field9;
            } else {
                this.Field1.Field5 = false;
                this.Field2.Field5 = false;
                super.Field105 = null;
                super.Field104 = this.Field8;
            }
        }

        if (this.Field1.Field5) {
            super.Field105 = this.Field1.Field9;
        } else if (this.Field2.Field5) {
            super.Field105 = this.Field2.Field9;
        }

        this.Field8();
        super.Field4();
    }

    public final void Field8() {
        ++this.Field15;
        if (this.Field15 > 360) {
            this.Field15 = 0;
        }

        this.Field10 = Class802.Field2(this.Field15) * this.Field14 >> 10;
        this.Field11 = Class802.Field1(this.Field15) * this.Field14 >> 10;
        Class63.Field6 = this.Field10 + this.Field12;
        Class63.Field7 = this.Field11 + this.Field13;
        Class105.Field19.Field7();
    }

    public final void Field9() {
        ByteArrayOutputStream var1 = new ByteArrayOutputStream();
        DataOutputStream var2 = new DataOutputStream(var1);

        try {
            var2.writeBoolean(this.Field7);
            if (this.Field7) {
                var2.writeUTF(this.Field1.Field5());
                var2.writeUTF(this.Field2.Field5());
            }

            Class826.Field1("nqshlogin", var1.toByteArray());
            var2.close();
        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }

    static boolean Field1(Class792 var0) {
        return var0.Field7;
    }

    static void Field1(Class792 var0, boolean var1) {
        var0.Field7 = var1;
    }
}
