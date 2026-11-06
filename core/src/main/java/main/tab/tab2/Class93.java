package main.tab.tab2;

public class Class93 implements Class256 {
    public static String[] Field1;
    public static String[] Field2;
    public static String[] Field3;
    public static String[] Field4;
    public static String[] Field5;
    public static String[] Field6;
    public static String[] Field7;
    public static String[] Field8;
    public static String[] Field9;
    public static String[] Field10 = new String[]{"MP", "HP"};
    public int Field11 = 0;
    public static int Field12 = 0;
    public static int Field13 = 0;
    public static int Field14 = 0;
    public static int Field15 = 0;
    public static int Field16 = 1;

    public Class93(int var1) {
        this.Field11 = var1;
    }

    public void Field1() {
        switch (this.Field11) {
            case 1:
                this.Field3();
                break;
            case 2:
                this.Field4();
                break;
            case 3:
                this.Field5();
                break;
            case 4:
                this.Field6();
                break;
            case 5:
                this.Field7();
                break;
            case 6:
                this.Field2();
        }

    }

    public void Field2() {
        if (++Class637.Field2 >= Class637.Field3.length) {
            Class637.Field2 = 0;
        }

        Class110 var2 = new Class110(9);
        var2.Field12();
        Class106.Field21.Field3 = 0;
    }

    public void Field3() {
        if (++Field12 >= Field6.length) {
            Field12 = 0;
        }

        Class110 var2 = new Class110(9);
        var2.Field12();
        Class106.Field21.Field3 = 1;
    }

    public void Field4() {
        if (++Field13 >= Field1.length) {
            Field13 = 0;
        }

        Class110 var2 = new Class110(9);
        var2.Field12();
        Class106.Field21.Field3 = 2;
    }

    public void Field5() {
        if (++Field14 >= Field9.length) {
            Field14 = 0;
        }

        Class110 var2 = new Class110(9);
        var2.Field12();
        Class106.Field21.Field3 = 4;
    }

    public void Field6() {
        if (++Field15 >= Field3.length) {
            Field15 = 0;
        }

        Class110 var2 = new Class110(9);
        var2.Field12();
        Class106.Field21.Field3 = 0;
    }

    public void Field7() {
        if (++Field16 >= Field10.length) {
            Field16 = 0;
        }

        Class110 var2 = new Class110(9);
        var2.Field12();
        Class106.Field21.Field3 = 3;
    }

    static {
        Field15 = 0;
        Field3 = new String[]{"Kiếm Khách", "Chiến Binh", "Pháp Sư", "Đấu Sĩ", "Cung Thủ"};
        Field14 = 0;
        Field9 = new String[]{"Phím Sao: Dừng Auto", "Phím Sao:Thêm NL Nhanh", "Phím Sao: Bán NL", "Phím Sao: Bán Sách"};
        Field12 = 0;
        Field13 = 0;
        Field4 = new String[]{"bát", "Hộ sát", "Dĩ lực đáo công", "Thiên lôi điện trảm", "Sấm động dương gian", ""};
        Field5 = new String[]{"Bát đại hỏa long", "Cường thân giáp", "Hộ công tiến", "Thiên long bạo kích", "Liệt hỏa bạo kích", ""};
        Field6 = new String[]{"Bát đại hải long", "Hồi công lực đan", "Hồi lực tiến", "Song hộ công thủ", "Hải long xuất thế", "Song long thị uy"};
        Field7 = new String[]{"Khổng kình bát vĩ", "Bất di biến", "Hộ thủ", "Kinh thiên động địa", "Sơn Tinh bộ thiên", ""};
        Field8 = new String[]{"Bát kim", "Độc lưu tiễn", "Hộ độc tiễn", "Thập diện tâm tiễn", "Thăng thiên loạn tiễn", ""};
        Field1 = new String[]{"sức mạnh", "khéo léo", "tinh thần", "c k"};
        Field2 = new String[]{"Sức mạnh", "Khéo léo", "Tinh thần", "Sức khỏe"};
    }
}
