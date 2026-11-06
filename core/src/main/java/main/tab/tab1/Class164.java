package main.tab.tab1;

import main.tab.tab1.screen.MainTab;

final class Class164 implements Runnable {
    private final String Field1;
    private final String Field2;

    Class164(Class792 var1, String var2, String var3) {
        this.Field1 = var2;
        this.Field2 = var3;
    }

    public final void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException var1) {
        }

        Class105.Field2();
        Class263.Field1().Field5();
        Class263.Field1().Field1(this.Field1, this.Field2, MainTab.Field2);
        Class63.Field72 = false;
    }
}
