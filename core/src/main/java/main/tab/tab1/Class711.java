package main.tab.tab1;

import main.lib.Graphics;
import main.lib.Image;
import main.screen.Main;

import java.io.IOException;
import java.io.InputStream;

public final class Class711 extends Class123 {
    private static Class259 Field62 = new Class259();
    private static Image Field63;
    private static Image Field64;
    private short[] Field65 = new short[12];
    private short[] Field66 = new short[12];
    private Class272 Field67;
    private Class111 Field68;
    private Class111 Field69;
    private int Field70;
    private int Field71;
    private byte[] Field72;
    private byte[] Field73;
    private byte[] Field74;
    private byte[] Field75;
    private byte[] Field76;
    private byte[] Field77;
    private byte[] Field78;
    private byte[] Field79;

    static {
        try {
            Field64 = Image.createImage("/rong/shadow.png");
            Field63 = Image.createImage("/rong/Big0.png");
            InputStream var0;
            byte var1 = (byte) (var0 = Main.instance.getResourceAsStream("/rong/dragonData")).read();
            Field62.Field1 = new byte[var1];
            Field62.Field2 = new byte[var1];
            Field62.Field3 = new byte[var1];
            Field62.Field4 = new byte[var1];
            Field62.Field5 = new byte[var1];

            for (int var2 = 0; var2 < var1; ++var2) {
                Field62.Field1[var2] = (byte) var0.read();
                Field62.Field2[var2] = (byte) var0.read();
                Field62.Field3[var2] = (byte) var0.read();
                Field62.Field4[var2] = (byte) var0.read();
                Field62.Field5[var2] = (byte) var0.read();
            }

        } catch (IOException var3) {
            var3.printStackTrace();
        }
    }

    public Class711() {
        new Class386();
        this.Field72 = new byte[]{5, 3, -1, -8, -8, 0, 0, 2};
        this.Field73 = new byte[]{-5, -8, -10, -7, -2, 0, 0, -3};
        this.Field74 = new byte[]{-12, -6, 0, 10, 10, 7, 0, -8};
        this.Field75 = new byte[]{4, 8, 12, 8, -2, -8, -10, -4};
        this.Field76 = new byte[]{2, 3, 4, 3, 2, 1, 0, 1};
        this.Field77 = new byte[]{0, 0, 0, 2, 2, 2, 0, 0};
        this.Field78 = new byte[]{9, 6, 9, 6, 9, 6, 9, 6};
        this.Field79 = new byte[]{4, 3, 3, 1, 7, 0, 0, 2};
        this.Field68 = Class105.Field19.Field15;
        super.Field193 = (short) (this.Field68.Field193 - 80);
        super.Field194 = (short) (this.Field68.Field194 - 80);

        for (int var1 = 0; var1 < this.Field65.length; ++var1) {
            this.Field65[var1] = super.Field193;
            this.Field66[var1] = super.Field194;
        }

        this.Field69 = new Class551(this);
        this.Field67 = new Class272();
        this.Field67.Field6 = true;
        this.Field67.Field1(20);
        this.Field67.Field1(7, super.Field193, super.Field194, 7, this.Field68);
    }

    public final void Field2() {
        this.Field5();
        this.Field67.Field1();
        if (this.Field67.Field9) {
            this.Field67.Field9 = false;
            this.Field67.Field5 = 0;
            this.Field69.Field193 = (short) (this.Field68.Field193 - 80 + Class804.Field13(160));
            this.Field69.Field194 = (short) (this.Field68.Field194 - 80 + Class804.Field13(160));
            this.Field67.Field4 = this.Field69;
        }

        super.Field193 = (short) this.Field67.Field1;
        super.Field194 = (short) this.Field67.Field2;
        this.Field70 = this.Field67.Field3 / 2;
        this.Field71 = Class797.Field2(Class802.Field1(this.Field65[9] - this.Field65[11], -(this.Field66[9] - this.Field66[11]))) / 2;
        int var1;
        if (Class105.Field12 % 2 == 0) {
            for (var1 = this.Field65.length - 1; var1 > 0; --var1) {
                this.Field65[var1] = this.Field65[var1 - 1];
                this.Field66[var1] = this.Field66[var1 - 1];
            }

            this.Field65[0] = super.Field193;
            this.Field66[0] = super.Field194;
        }

        if (Class105.Field12 % 20 == 10) {
            var1 = Class802.Field1(this.Field68.Field193, this.Field68.Field194, this.Field65[2], this.Field66[2] - 50);
            int var2 = Class802.Field1(this.Field68.Field193, this.Field68.Field194, super.Field193 + this.Field72[this.Field70], super.Field194 + this.Field73[this.Field70] - 50);
            int var3 = Class802.Field1(this.Field68.Field193 - this.Field65[2], -(this.Field68.Field194 - (this.Field66[2] - 50)));
            int var4 = Class802.Field1(this.Field68.Field193 - (super.Field193 + this.Field72[this.Field70]), -(this.Field68.Field194 - (super.Field194 + this.Field73[this.Field70] - 50)));
            if (var1 > var2 && Class802.Field4(var3 - var4) < 50) {
                var1 = Class802.Field1(this.Field65[2] - (super.Field193 + this.Field72[this.Field70]), -(this.Field66[2] - 50 - (super.Field194 + this.Field73[this.Field70] - 50)));
                var2 = -10 * Class802.Field2(var1) >> 10;
                var3 = -(-10 * Class802.Field1(var1)) >> 10;
                Class63.Field1(4, this, this.Field68, super.Field193 + this.Field72[this.Field70] + var2, super.Field194 + this.Field73[this.Field70] - 50 + var3, 0, (byte) 0, var1);
            }
        }

    }

    public final void Field1(Graphics var1) {
        var1.drawImage(Field64, this.Field65[11], this.Field66[11], 3);

        int var2;
        for (var2 = 0; var2 < this.Field65.length - 1; ++var2) {
            var1.drawImage(Field64, this.Field65[var2], this.Field66[var2], 3);
        }

        var1.drawImage(Field64, super.Field193, super.Field194, 3);
        if (super.Field29 != null) {
            for (var2 = 0; var2 < super.Field29.size(); ++var2) {
                ((Class48) super.Field29.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
            }
        }

        var1.drawRegion(Field63, Field62.Field2[this.Field78[this.Field71]], Field62.Field3[this.Field78[this.Field71]], Field62.Field4[this.Field78[this.Field71]], Field62.Field5[this.Field78[this.Field71]], this.Field79[this.Field71], this.Field65[11] + this.Field74[this.Field71], this.Field66[11] + this.Field75[this.Field71] - 50, 3);
        if (this.Field70 != 1 && this.Field70 != 2 && this.Field70 != 3) {
            this.Field3(var1);
            this.Field4(var1);
        } else {
            this.Field4(var1);
            this.Field3(var1);
        }

        if (super.Field28 != null) {
            for (var2 = 0; var2 < super.Field28.size(); ++var2) {
                ((Class48) super.Field28.elementAt(var2)).Field1(var1, super.Field193, super.Field194);
            }
        }

    }

    private void Field3(Graphics var1) {
        for (int var2 = 0; var2 < this.Field65.length - 1; ++var2) {
            var1.drawRegion(Field63, Field62.Field2[5], Field62.Field3[5], Field62.Field4[5], Field62.Field5[5], 0, this.Field65[var2], this.Field66[var2] - 50, 3);
        }

    }

    private void Field4(Graphics var1) {
        var1.drawRegion(Field63, Field62.Field2[this.Field76[this.Field70]], Field62.Field3[this.Field76[this.Field70]], Field62.Field4[this.Field76[this.Field70]], Field62.Field5[this.Field76[this.Field70]], this.Field77[this.Field70], super.Field193 + this.Field72[this.Field70], super.Field194 + this.Field73[this.Field70] - 50, 3);
    }
}
