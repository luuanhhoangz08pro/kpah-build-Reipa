package main.tab.tab1;

import main.tab.tab1.screen.SelectedScreen;

import java.util.Vector;

public class Class214 extends Thread {
    public int Field1 = 0;
    public Vector Field2 = new Vector();

    public void run() {
        while (true) {
            if (Class220.Field2) {
                this.Field1();
            }

            Class220.Field1(1L);
        }
    }

    public void Field1() {
        ++this.Field1;
        this.Field1 %= SelectedScreen.Field6.length;
        Class63.Field1(Class105.Field19.Field15, SelectedScreen.Field6[this.Field1], 100);
        Class263.Field1().Field1(SelectedScreen.Field6[this.Field1]);
        Class220.Field1(3000L);
    }
}
