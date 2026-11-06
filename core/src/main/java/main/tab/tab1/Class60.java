package main.tab.tab1;

import main.lib.Graphics;

public final class Class60 extends Class665 {
    public static Class60 Field1;
    public static final Class697[][] Field2 = new Class697[][]{{new Class697((byte) 0, "Kiếm Khách", "Nam", "Kiếm", "Mien Bac", "Kim", 3, 0), new Class697((byte) 0, "Kiếm Khách", "Nữ", "Kiếm", "Mien Bac", "Kim", 3, 0)}, {new Class697((byte) 1, "Chiến Binh", "Nam", "Đại Đao", "Mien Bac", "Hỏa", 4, 0), new Class697((byte) 1, "Chiến Binh", "Nữ", "Đại Đao", "Mien Bac", "Hỏa", 4, 0)}, {new Class697((byte) 2, "Pháp Sư", "Nam", "Đũa thần", "Mien Nam", "Thủy", 5, 0), new Class697((byte) 2, "Pháp Sư", "Nữ", "Đũa thần", "Mien Nam", "Thủy", 5, 0)}, {new Class697((byte) 3, "Đấu sĩ", "Nam", "Rìu", "Mien Nam", "Thổ", 6, 0), new Class697((byte) 3, "Đấu sĩ", "Nữ", "Rìu", "Mien Nam", "Thổ", 6, 0)}, {new Class697((byte) 4, "Cung Thủ", "Nam", "Cung", "Mien Bac", "Mộc", 7, 0), new Class697((byte) 4, "Cung Thủ", "Nữ", "Cung", "Mien Bac", "Mộc", 7, 0)}};
    private static String[] Field8 = new String[]{"Đầu đinh", "Tóc búi", "Tóc cột cao", "Tóc chéo", "Tóc xù", "Tóc ngang vai"};
    private static String[] Field9 = new String[]{"Nam", "Nữ"};
    public static int Field3 = 0;
    public static int Field4 = 0;
    public Class190 Field5 = new Class190(this);
    public Class585 Field6 = new Class585();
    int Field7;
    private int Field10;

    public static Class60 Field5() {
        return Field1 == null ? (Field1 = new Class60()) : Field1;
    }

    public final void Field1() {
        this.Field7();
        super.Field1();
    }

    public final void Field2() {
        this.Field5.Field1 = Class105.Field15 - 28;
        this.Field5.Field2 = Class105.Field16 - 24;
    }

    public Class60() {
        this.Field5.Field3 = 80;
        this.Field5.Field4 = Class665.Field109 + 2;
        this.Field5.Field5 = true;
        this.Field5.Field3(3);
        this.Field6.Field204 = 0;
        this.Field7 = 0;
        this.Field6.Field87 = -1;
        this.Field6.Field88 = Field2[this.Field7][Field3].Field5;
        this.Field6.Field85 = Field2[this.Field7][Field3].Field3;
        this.Field6.Field86 = Field2[this.Field7][Field3].Field4;
        this.Field6.Field118 = Field2[this.Field7][Field3].Field6;
        this.Field6.Field117 = Field2[this.Field7][Field3].Field7;
        super.Field103 = new Class87("Đóng", new Class113(this));
        new Class87("Xóa", new Class114(this));
        super.Field104 = new Class87("Tạo", new Class109(this));
        this.Field2();
    }

    private void Field6() {
        this.Field6.Field88 = Field2[this.Field7][Field3].Field5;
        this.Field6.Field85 = Field2[this.Field7][Field3].Field3;
        this.Field6.Field86 = Field2[this.Field7][Field3].Field4;
        this.Field6.Field118 = Field2[this.Field7][Field3].Field6;
        this.Field6.Field117 = Field2[this.Field7][Field3].Field7;
    }

    private void Field7() {
        Class263.Field1().Field1((int) 0, (int) this.Field6.Field118, (int) this.Field6.Field117, (byte) this.Field6.Field119);
    }

    public final boolean Field1(int var1) {
        boolean var2 = false;
        if (this.Field10 == 0) {
            this.Field5.Field1(var1);
        }

        if (var1 == 6) {
            ++this.Field10;
            if (this.Field10 > 4) {
                this.Field10 = 0;
            }

            if (this.Field10 == 0) {
                this.Field5.Field5 = true;
            } else {
                this.Field5.Field5 = false;
            }
        }

        if (var1 == 1) {
            --this.Field10;
            if (this.Field10 < 0) {
                this.Field10 = 4;
            }

            if (this.Field10 == 0) {
                this.Field5.Field5 = true;
            } else {
                this.Field5.Field5 = false;
            }
        }

        Class697 var10000;
        if (var1 == 2) {
            if (this.Field10 == 1) {
                ++this.Field7;
                if (this.Field7 >= 5) {
                    this.Field7 = 0;
                }

                var2 = true;
            }

            if (this.Field10 == 2) {
                Field3 = Field3 == 1 ? 0 : 1;
                this.Field6();
            }

            if (this.Field10 == 3) {
                var10000 = Field2[this.Field7][Field3];
                var10000.Field5 = (short) (var10000.Field5 - 2);
                if (Field2[this.Field7][Field3].Field5 < 0) {
                    Field2[this.Field7][Field3].Field5 = (byte) (4 + Field2[this.Field7][Field3].Field5);
                }

                var2 = true;
            }

            if (this.Field10 == 4 && --Field4 < 0) {
                Field4 = 1;
            }
        }

        if (var1 == 5) {
            if (this.Field10 == 1) {
                --this.Field7;
                if (this.Field7 < 0) {
                    this.Field7 = 4;
                }

                var2 = true;
            }

            if (this.Field10 == 2) {
                Field3 = Field3 == 0 ? 1 : 0;
                this.Field6();
            }

            if (this.Field10 == 3) {
                var10000 = Field2[this.Field7][Field3];
                var10000.Field5 = (short) (var10000.Field5 + 2);
                if (Field2[this.Field7][Field3].Field5 > 5) {
                    Field2[this.Field7][Field3].Field5 = (byte) (Field2[this.Field7][Field3].Field5 % 2);
                }

                var2 = true;
            }

            if (this.Field10 == 4 && ++Field4 > 1) {
                Field4 = 0;
            }
        }

        if (var2) {
            this.Field6.Field85 = Field2[this.Field7][Field3].Field3;
            this.Field6.Field86 = Field2[this.Field7][Field3].Field4;
            this.Field6.Field88 = Field2[this.Field7][Field3].Field5;
            this.Field6.Field118 = Field2[this.Field7][Field3].Field6;
            this.Field6.Field117 = Field2[this.Field7][Field3].Field7;
            this.Field7();
        }

        return super.Field1(var1);
    }

    public final void Field1(Graphics var1) {
        Class767.Field5();
        Class767.Field2(var1);
        Class105.Field1(var1);
        int var2 = Class105.Field15 - 53;
        int var3 = Class105.Field16 - 20;
        Class804.Field1(var1, Class105.Field15 - 75, Class105.Field16 - 60);
        if (Class105.Field12 % 20 > 4) {
            Class21.Field10[0].Field1(var1, "*", Class105.Field15 - 60, var3 + this.Field10 * 17 - 1, 0);
            Class21.Field10[0].Field1(var1, "*", Class105.Field15 + 57, var3 + this.Field10 * 17 - 1, 0);
        }

        Class21.Field10[0].Field1(var1, "Tên:", var2, var3, 0);
        var3 += 17;
        Class21.Field10[0].Field1(var1, "Dòng: " + Field2[this.Field7][Field3].Field1, var2, var3, 0);
        var3 += 17;
        Class21.Field10[0].Field1(var1, "Giới tính: " + Field9[Field3], var2, var3, 0);
        var3 += 17;
        Class21.Field10[0].Field1(var1, "Tóc: " + Field8[Field2[this.Field7][Field3].Field5], var2, var3, 0);
        var3 += 17;
        Class21.Field10[0].Field1(var1, "L.thổ: " + Class63.Field64[Field4], var2, var3, 0);
        var3 += 17;
        Class21.Field10[0].Field1(var1, "Ngũ hành: " + Field2[this.Field7][Field3].Field2, var2, var3, 0);
        this.Field6.Field1(var1, (short) Class105.Field15, (short) (Class105.Field16 - 30));
        if (this.Field6.Field118 != -1 && this.Field6.Field117 != -1 && this.Field6.Field102 != null) {
            var2 = this.Field6.Field23 == 1 ? 1 : 0;
            var1.drawImage(this.Field6.Field102, Class105.Field15 + this.Field6.Field104, Class105.Field16 - 30 + this.Field6.Field105 + var2, 0);
        }

        this.Field5.Field1(var1);
        var1.setClip(0, 0, Class105.Field13, Class105.Field14);
        super.Field1(var1);
    }

    public final void Field4() {
        this.Field5.Field4();
        this.Field6.Field2();
        super.Field4();
    }
}
