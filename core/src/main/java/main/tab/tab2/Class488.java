package main.tab.tab2;

import java.util.Vector;

final class Class488 implements Runnable {
    private final Vector Field1;
    private Class97 Field2;

    public Class488(Class97 var1) {
        this.Field2 = var1;
        this.Field1 = new Vector();
    }

    public final void Field1(Class85 var1) {
        this.Field1.addElement(var1);
    }

    public final void run() {
        try {
            while (this.Field2.Field3) {
                if (this.Field2.Field7) {
                    while (this.Field1.size() > 0) {
                        Class85 var1 = (Class85) this.Field1.elementAt(0);
                        this.Field1.removeElementAt(0);
                        Class97.Field1(this.Field2, var1);
                    }
                }

                try {
                    Thread.sleep(10L);
                } catch (InterruptedException var2) {
                }
            }

        } catch (Exception var3) {
            var3.printStackTrace();
        }
    }
}
