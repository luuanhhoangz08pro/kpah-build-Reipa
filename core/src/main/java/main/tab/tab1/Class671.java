package main.tab.tab1;

import main.lib.Graphics;

import java.util.Vector;

public class Class671 implements Class258 {
    public int Field1;

    public Class671(int var1) {
        this.Field1 = var1;
    }

    public void Field1() {
        switch (this.Field1) {
            case 1:
                this.Field2();
                return;
            case 3:
                this.Field3();
                return;
            default:
        }
    }

    public void Field2() {
        Vector var1 = new Vector();
        var1.addElement(new Class87("Auto Chát", new Class92()));
        var1.addElement(new Class87(Class135.Field2(), new Class135()));
        var1.addElement(new Class87("Đăng Xuất", new Class744(Class105.Field1)));
        Class105.Field21.Field1(var1, 3);
    }

    public void Field3() {
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

    public static String Field4() {
        return "";
    }

    public static void Field1(Graphics var0) {
        Class585 var1 = Class105.Field19.Field15;
        Class21.Field2.Field1(var0, "Xu: " + Class105.Field1(Class105.Field19.Field15.Field122) + " - Lượng: " + Class105.Field1((long) Class105.Field19.Field15.Field100), 37, 37, 0);
        Class21.Field2.Field1(var0, "Rương: " + Class105.Field1((long) Class105.Field19.Field15.Field21()) + "/" + Class105.Field1(42L * (long) Class105.Field19.Field15.Field35) + " - TC: " + Class105.Field1((long) var1.Field34()), 37, 50, 0);
        Class21.Field2.Field1(var0, "HP: " + Class105.Field1((long) var1.Field4) + "/" + Class105.Field1((long) var1.Field5), 37, 63, 0);
        Class21.Field2.Field1(var0, "MP: " + Class105.Field1((long) var1.Field130) + "/" + Class105.Field1((long) var1.Field129), 37, 76, 0);
    }
}
