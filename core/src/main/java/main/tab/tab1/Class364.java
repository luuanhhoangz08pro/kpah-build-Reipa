package main.tab.tab1;

import main.tab.tab1.screen.MainTab;

import java.util.Vector;

public class Class364 implements Class258 {
    public static int Field1 = 2;
    public static int Field2 = 0;
    public int Field3;

    public Class364(int var1) {
        this.Field3 = var1;
    }

    public void Field1() {
        if (this.Field3 == 2) {
            this.Field2();
        } else if (this.Field3 == 3) {
            this.Field3();
        } else if (this.Field3 == 4) {
            this.Field4();
        } else {
            (new Class671(1)).Field1();
            Class105.Field21.Field3 = this.Field3;
        }

    }

    public void Field2() {
        Vector var1 = new Vector();
        var1.addElement(new Class87(Class251.Field2 ? "Tắt" : "Bật", new Class364(3)));
        var1.addElement(new Class87("Nội dung", new Class364(4)));
        Class105.Field21.Field1(var1, 3);
    }

    public void Field3() {
        Class251.Field2 = !Class251.Field2;
    }

    public void Field4() {
        MainTab.dodgeScreen.show();
    }
}
