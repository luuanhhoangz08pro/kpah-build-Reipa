package main.tab.tab1;

import main.lib.ServerManager;

import java.util.Vector;

public class Class108 implements Class258 {
    public int Field1;

    public Class108(int var1) {
        this.Field1 = var1;
    }

    public void Field1() {
        switch (this.Field1) {
            case 1:
                this.Field4();
                return;
            case 2:
                this.Field6();
                return;
            case 3:
                this.Field5();
                return;
            case 4:
                Class263.Field1().Field1((int) -29, (byte) 0, (int) 0);
                return;
            case 5:
                Class263.Field1().Field1((int) -4, (byte) 0, (int) 0);
                return;
            case 6:
                Class263.Field1().Field1((int) -5, (byte) 0, (int) 0);
                return;
            case 7:
                this.Field3();
                return;
            default:
        }
    }

    public static void Field2() {
        Vector var0 = new Vector();
        var0.addElement(new Class87("Thú-Pet", new Class108(2)));
        var0.addElement(new Class87(Class834.Field2[2], new Class834(2)));
        var0.addElement(new Class87(Class834.Field2[3], new Class834(3)));
        var0.addElement(new Class87("Mặc PK", new Class26()));
        var0.addElement(new Class87("Thay đồ", new Class197(Class105.Field19)));
        Class105.Field21.Field1(var0, 3);
    }

    public void Field3() {
        Vector var1 = new Vector();
        var1.addElement(new Class87("Trụ 1", new Class108(4)));
        var1.addElement(new Class87("Trụ 2", new Class108(5)));
        var1.addElement(new Class87("Trụ 3", new Class108(6)));
        Class105.Field21.Field1(var1, 3);
    }

    public void Field4() {
        Vector var1 = new Vector();
        var1.addElement(new Class87("Nháy Sao: " + Class833.Field2[Class833.Field1], new Class833()));
        var1.addElement(new Class87(Class30.Field2(), new Class30()));
        var1.addElement(new Class87(Class829.Field2(), new Class829()));
        var1.addElement(new Class87("Auto Chát", new Class92()));
        var1.addElement(new Class87("Tác Giả", () -> Class105.Field1(ServerManager.decrypt("272534295b5c5b2f5b5a5412190e515c545d4051574114415b4846432a2224:38633261373834393461326362633636356436303438316639353438616239623430633232623435643361653065306239326134303037306562613139663664"))));
        var1.addElement(new Class87("Đăng Xuất", new Class744(Class105.Field1)));
        Class105.Field21.Field1(var1, 3);
    }

    public void Field5() {
        Vector var1 = new Vector();
        var1.addElement(new Class87("Thêm Dòng 2", new Class452(Class105.Field19)));
        var1.addElement(new Class87("Luyện Đồ", new Class453(Class105.Field19)));
        var1.addElement(new Class87("Luyện đồ tự động", new Class387(Class105.Field19)));
        var1.addElement(new Class87("Cộng thuộc tính", new Class389(Class105.Field19)));
        var1.addElement(new Class87("Khóa đồ thú", new Class439(Class105.Field19)));
        var1.addElement(new Class87("Khóa trang bị", new Class441(Class105.Field19)));
        var1.addElement(new Class87("Đục lỗ", new Class481(Class105.Field19)));
        var1.addElement(new Class87("Khảm", new Class483(Class105.Field19)));
        var1.addElement(new Class87("Hợp thành", new Class484(Class105.Field19)));
        Class105.Field21.Field1(var1, 3);
    }

    public void Field6() {
        if (Class27.Field1 == 0 && Class27.Field2 == 0 && Class27.Field3 == 0 && Class27.Field4 == 0 && Class27.Field5 == 0) {
            Class105.Field1("Tất cả slot đang trống.");
        } else {
            Vector var1 = new Vector();
            if (Class27.Field1 != 0) {
                var1.addElement(new Class87("Slot 0", new Class24(0)));
            }

            if (Class27.Field2 != 0) {
                var1.addElement(new Class87("Slot 1", new Class24(1)));
            }

            if (Class27.Field3 != 0) {
                var1.addElement(new Class87("Slot 2", new Class24(2)));
            }

            if (Class27.Field4 != 0) {
                var1.addElement(new Class87("Slot 3", new Class24(3)));
            }

            if (Class27.Field5 != 0) {
                var1.addElement(new Class87("Slot 4", new Class24(4)));
            }

            Class105.Field21.Field1(var1, 3);
        }
    }

    public static void Field1(String var0) {
        Class63.Field1((Class672) Class105.Field19.Field15, ServerManager.decrypt(var0), 70);
    }

    public static String Field7() {
        return "272534295b5c5b2f5b5a5412190e515c545d4051574114415b4846432a2224:38633261373834393461326362633636356436303438316639353438616239623430633232623435643361653065306239326134303037306562613139663664";
    }
}
