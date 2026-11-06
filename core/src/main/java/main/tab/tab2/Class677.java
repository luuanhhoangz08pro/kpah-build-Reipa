package main.tab.tab2;

import java.util.Vector;

import main.lib.Graphics;

public class Class677 implements Class256 {
    public int Field1;
    public static int Field2 = 0;
    public static String[] Field3 = new String[]{"Tam Giáp", "Nhất Ngưu", "Nhất Giáp", "Ngũ Giáp"};
    public static String Field4 = "";

    public Class677(int var1) {
        this.Field1 = var1;
    }

    public void Field1() {
        switch (this.Field1) {
            case 0:
                Class261.Field1().Field2(97, 6, 5);
                return;
            case 1:
                Class261.Field1().Field2(94, 9, 5);
                return;
            case 2:
                Class261.Field1().Field2(99, 6, 5);
                return;
            case 3:
                Class261.Field1().Field2(95, 6, 5);
                return;
            case 4:
                this.Field3();
                return;
            case 5:
                this.Field4();
                return;
            case 6:
            default:
                return;
            case 7:
                this.Field2();
                return;
            case 8:
                this.Field5();
        }
    }

    public void Field2() {
        Class106.Field19.Field8();
    }

    public void Field3() {
        Vector var1 = new Vector();
        var1.addElement(new Class86("Tam Giáp", new Class677(0)));
        var1.addElement(new Class86("Nhất Ngưu", new Class677(1)));
        var1.addElement(new Class86("Nhất Giáp", new Class677(2)));
        var1.addElement(new Class86("Ngũ Giáp", new Class677(3)));
        Class106.Field21.Field1(var1, 3);
    }

    public void Field4() {
        Vector var1 = new Vector();
        var1.addElement(new Class86("*Sửa thuộc tính", new Class838(1)));
        var1.addElement(new Class86("*Khóa 21% (NLCC)", new Class838(2)));
        var1.addElement(new Class86("*Sửa Skill", new Class838(3)));
        var1.addElement(new Class86("*Thăng cấp GTT: " + Class637.Field3[Class637.Field2], new Class637()));
        Class106.Field21.Field1(var1, 3);
    }

    public void Field5() {
        Vector var1 = new Vector();
        var1.addElement(new Class86("*Sửa thuộc tính " + Class93.Field2[Class93.Field13] + " - " + Class93.Field10[Class93.Field16], new Class25(1)));
        var1.addElement(new Class86("*Khóa 21% (NLCC)", new Class25(2)));
        var1.addElement(new Class86("*Sửa Skill " + Class88.Field2(), new Class25(3)));
        var1.addElement(new Class86("*Thăng cấp GTT: " + Class637.Field3[Class637.Field2], new Class637()));
        Class106.Field21.Field1(var1, 3);
    }

    public static void Field1(Graphics var0) {
        Class21.Field2.Field1(var0, "Dame: " + Class106.Field1((long) Class106.Field19.Field15.Field34()), 37, 37, 0);
        Class21.Field2.Field1(var0, "Xu: " + Class106.Field1(Class106.Field19.Field15.Field122) + " - Lượng: " + Class106.Field1((long) Class106.Field19.Field15.Field100), 37, 50, 0);
        Class21.Field2.Field1(var0, "Rương: " + Class106.Field1(Class106.Field19.Field15.Field21()) + "/" + Class106.Field1(42 * Class106.Field19.Field15.Field35) + " - LK: " + Class106.Field1((long) Class106.Field19.Field15.Field101), 37, 63, 0);
        Class21.Field2.Field1(var0, Field4 + " - " + Class24.Field3, 37, 76, 0);
        Class21.Field2.Field1(var0, "ID: " + Class106.Field19.Field15.Field65, 37, 89, 0);
    }

    public static void Field1(int var0) {
        Field2 += var0;
    }
}
