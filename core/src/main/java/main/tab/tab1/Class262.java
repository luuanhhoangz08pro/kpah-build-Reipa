package main.tab.tab1;

import main.lib.Graphics;

import main.lib.Image;

public class Class262 extends Class672 {
    public int Field1;
    public int Field2;
    private Image[] Field5;
    public String Field3;
    public byte Field4 = 0;
    private static String[] Field6 = new String[]{"Dì út HP", "Bà tám tạp hóa", "Hắc ngưu", "Thiết bì", "Lính gác", "Trưởng làng", "Phú ông", "Xa phu", "ông nội", "Anh bảy", "Hoa tiêu", "Nhất giáp", "Nhị giáp", "Tam giáp", "Tứ giáp", "Ngũ giáp", "Nhất ngưu", "Nhị ngưu", "Tam ngưu", "Tứ ngưu", "Ngũ ngưu", "Lâm tướng quân", "Nhật thương nhân", "Hỏa xích", "Bảo ngọc", "Trần thống lĩnh", "Kim hoa", "Giáp Sư", "Kiếm Sư", "Bội Châu", "An Tâm", "Lộc Phát"};
    private static byte[] Field7 = new byte[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 11, 11, 11, 11, 12, 12, 12, 12, 12, 14, 13, 15, 16, 17, 1, 3, 2, 6, 9, 13};
    private int Field8 = 0;
    private int Field9 = 0;
    private static byte[] Field10 = new byte[]{0, 0, 2, 0, 1, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static byte[] Field11 = new byte[]{-7, -4, -5, -5, -5, -9, -9, -10, -7, 0, -11, -10, -9, -10, 0, -5, -9, -5};

    public Class262() {
    }

    public Class262(int var1, int var2, int var3, Class53 var4) {
        super.Field188 = 2;
        super.Field193 = (short) ((var1 << 4) + 8);
        super.Field194 = (short) ((var2 << 4) + 8);
        super.Field195 = 30;
        super.Field196 = 40;
        this.Field1 = var3;
        this.Field5 = new Image[2];
        this.Field5[0] = var4.Field4("npc" + Field7[var3] + "0" + ".png");
        this.Field5[1] = var4.Field4("npc" + Field7[var3] + "1" + ".png");
        if (var3 == 4) {
            ++Class458.Field12;
            this.Field2 = Class458.Field12;
        }

    }

    public final String a_() {
        return this.Field3 != null ? this.Field3 : Field6[this.Field1];
    }

    public void Field1(Graphics var1) {
        var1.drawImage(this.Field5[1], super.Field193, super.Field194, 33);
        if (this.Field5[0] != null) {
            var1.drawImage(this.Field5[0], super.Field193 + Field10[Field7[this.Field1]], super.Field194 + Field11[Field7[this.Field1]] + this.Field9 / 5, 33);
        }

        Image var2;
        if (!(var2 = Class63.Field5(this.Field1)).equals(Class804.Field12)) {
            var1.drawImage(var2, super.Field193, super.Field194 - super.Field195 - 5, 33);
        }

    }

    public void a_(Graphics var1, int var2, int var3) {
        var1.setClip(var2 - 10, 32 - super.Field195, 20, 22);
        if (this.Field5[0] != null) {
            var1.drawImage(this.Field5[0], var2, 32 - super.Field195, 17);
        } else {
            if (this.Field5[1] != null) {
                var1.drawImage(this.Field5[1], var2, 32 - super.Field195, 17);
            }

        }
    }

    public void Field1(short var1, short var2) {
        super.Field193 = var1;
        super.Field194 = var2;
    }

    public void Field2() {
        super.Field2();
        if (super.Field209 != null && this != Class105.Field19.Field16) {
            super.Field209 = null;
        }

        if (this.Field5[0] != null) {
            ++this.Field9;
            if (this.Field9 > 9) {
                this.Field9 = 0;
            }
        }

        if (Class105.Field19.Field44 != null && Class802.Field4(super.Field193 / 16 - Class105.Field19.Field44.Field1 / 16) <= 1 && Class802.Field4(super.Field194 / 16 - Class105.Field19.Field44.Field2 / 16) <= 1) {
            if (this.Field8 > -2) {
                --this.Field8;
                return;
            }

            this.Field8 = 0;
        }

    }

    public boolean d_() {
        return true;
    }

    public int e_() {
        return this.Field4;
    }

    public final int f_() {
        return this.Field1;
    }
}
