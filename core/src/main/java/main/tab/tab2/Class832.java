package main.tab.tab2;

public final class Class832 extends Thread implements Class256 {
    public static boolean Field1;
    public static int Field2 = 0;
    public static String[] Field3 = new String[]{"Tắt", "Người đồ sát", "Tiêu Víp", "Boss + TYT", "Người giao thẻ"};

    public final void Field1() {
        if (++Field2 >= Field3.length) {
            Field2 = 0;
        }

        Class388.Field1();
        Class106.Field21.Field3 = 2;
        if (Field2 == 1) {
            this.start();
        }

    }

    public final void run() {
        while (Field2 != 0 && Field2 < Field3.length) {
            String var1;
            switch (Field2) {
                case 1:
                    if (Class106.Field19.Field11 != null && (Class106.Field19.Field16.Field188 != 0 || Class106.Field19.Field16.Field188 == 3 || Class106.Field19.Field16.Field188 == 4 || Class106.Field19.Field16.Field188 == 7)) {
                        Class106.Field19.Field1(true);
                    }
                    break;
                case 2:
                    if (Class106.Field19.Field16 != null && !(var1 = Class106.Field19.Field16.a_()).equalsIgnoreCase("Ngựa ca nhan xanh la") && !var1.equalsIgnoreCase("Ngựa ca nhan tím") && !var1.equalsIgnoreCase("Ngựa ca nhan vàng") && !var1.equalsIgnoreCase("Ngựa ca nhan xanh") && !var1.equalsIgnoreCase("Ngựa ca nhan đỏ")) {
                        Class106.Field19.Field1(true);
                    }
                    break;
                case 3:
                    if (Class106.Field19.Field16 != null && !(var1 = Class106.Field19.Field16.a_()).equalsIgnoreCase("Boss thỏ điên") && !var1.equalsIgnoreCase("Dracula") && !var1.equalsIgnoreCase("Boss Gấu xám") && !var1.equalsIgnoreCase("Bạch cốt tướng quân") && !var1.equalsIgnoreCase("Thằn lằn") && !var1.equalsIgnoreCase("Nhân sâm") && !var1.equalsIgnoreCase("Mắt quỷ") && !var1.equalsIgnoreCase("Liên hoa trụ") && !var1.equalsIgnoreCase("Rắn em") && !var1.equalsIgnoreCase("Rắn chị") && !var1.equalsIgnoreCase("Thuốc cường hoá siêu cấp") && !var1.equalsIgnoreCase("Bí ngô") && !var1.equalsIgnoreCase("Trụ rồng") && !var1.equalsIgnoreCase("Liên hoa trụ") && !var1.equalsIgnoreCase("Vải cấp 6") && !var1.equalsIgnoreCase("Ngọc cấp 6") && !var1.equalsIgnoreCase("Da mềm cấp 6") && !var1.equalsIgnoreCase("Sắt cấp 6") && !var1.equalsIgnoreCase("Gỗ thường cấp 6") && !var1.equalsIgnoreCase("Thủy tinh cấp 6") && !var1.equalsIgnoreCase("Tơ lụa cấp 6") && !var1.equalsIgnoreCase("Gỗ xưa cấp 6") && !var1.equalsIgnoreCase("Bạc cấp 6") && !var1.equalsIgnoreCase("Da cứng cấp 6") && !var1.equalsIgnoreCase("đại bàng") && !var1.equalsIgnoreCase("Đại bàng") && !var1.equalsIgnoreCase("") && !var1.equalsIgnoreCase("") && !var1.equalsIgnoreCase("") && !var1.equalsIgnoreCase("")) {
                        Class106.Field19.Field1(true);
                    }
                    break;
                case 4:
                    if (Class106.Field19.Field16 != null && !(var1 = Class106.Field19.Field16.a_()).equalsIgnoreCase("tathonglinh") && !var1.equalsIgnoreCase("huuthonglinh") && !var1.equalsIgnoreCase("tranthonglinh")) {
                        Class106.Field19.Field1(true);
                    }
            }

            try {
                Thread.sleep(20L);
            } catch (Exception var2) {
            }
        }

    }

    public static void Field2() {
        Field1 = true;
    }
}
