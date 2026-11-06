package main.tab.tab2;

import main.tab.tab2.screen.CheDoScreen;

import java.util.Vector;

public class Class622 extends Thread {
    public int Field1 = 0;
    public Vector Field2 = new Vector();

    public void run() {
        while (true) {
            if (Class834.Field2) {
                this.Field1();
            }

            Class834.Field1(1L);
        }
    }

    public void Field1() {
        ++this.Field1;
        this.Field1 %= CheDoScreen.Field5.length;
        Class62.Field1((Class678) Class106.Field19.Field15, (String) CheDoScreen.Field5[this.Field1], 100);
        Class261.Field1().Field1(CheDoScreen.Field5[this.Field1]);
        Class834.Field1(3000L);
    }
}
