package main.tab.tab1;

import main.tab.tab1.screen.DodgeScreen;

import java.util.Vector;

public class Class88 extends Thread {
    public int Field1 = 0;
    public Vector Field2 = new Vector();

    public void run() {
        while (true) {
            if (Class251.Field2) {
                this.Field1();
            }

            Class251.Field1(1L);
        }
    }

    public void Field1() {
        ++this.Field1;
        this.Field1 %= DodgeScreen.Field6.length;
        Class63.Field1(Class105.Field19.Field15, DodgeScreen.Field6[this.Field1], 100);
        Class263.Field1().Field1(DodgeScreen.Field6[this.Field1]);
        Class251.Field1(3000L);
    }
}
