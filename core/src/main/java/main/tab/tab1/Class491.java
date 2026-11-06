package main.tab.tab1;

import java.util.Vector;

final class Class491 implements Runnable {
    private final Vector Field1;
    private Class96 Field2;

    public Class491(Class96 var1) {
        this.Field2 = var1;
        this.Field1 = new Vector();
    }

    public final void Field1(Class86 var1) {
        this.Field1.addElement(var1);
    }

    public final void run() {
        try {
            while (this.Field2.Field3) {
                if (this.Field2.Field7) {
                    while (!this.Field1.isEmpty()) {
                        Class86 var1 = (Class86) this.Field1.elementAt(0);
                        this.Field1.removeElementAt(0);
                        Class96.Field1(this.Field2, var1);
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
