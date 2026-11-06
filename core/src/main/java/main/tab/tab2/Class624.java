package main.tab.tab2;

import main.tab.tab2.screen.MainTab;

import java.util.Vector;

public class Class624 implements Class256 {
    public static int Field1 = 2;
    public static int Field2 = 0;
    public int Field3;

    public Class624(int var1) {
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
            (new Class677(1)).Field1();
            Class106.Field21.Field3 = this.Field3;
        }

    }

    public void Field2() {
        Vector var1 = new Vector();
        var1.addElement(new Class86(Class834.Field2 ? Class94.Field9 : Class94.Field8, new Class624(3)));
        var1.addElement(new Class86(Class94.Field13, new Class624(4)));
        Class106.Field21.Field1(var1, 3);
    }

    public void Field3() {
        Class834.Field2 = !Class834.Field2;
    }

    public void Field4() {
        MainTab.cheDoScreen.show();
    }
}
