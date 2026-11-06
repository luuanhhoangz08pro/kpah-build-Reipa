package main.tab.tab2;

import main.tab.tab2.screen.MainTab;

final class Class168 implements Runnable {
    private final String Field1;
    private final String Field2;

    Class168(Class799 var1, String var2, String var3) {
        this.Field1 = var2;
        this.Field2 = var3;
        Class65.Field1(var2, var3);
    }

    public final void run() {
        try {
            Thread.sleep(500L);
        } catch (InterruptedException var2) {
        }

        Class106.Field2();
        Class261.Field1().Field5();
        Class261.Field1().Field1(this.Field1, this.Field2, MainTab.Field2);
        Class62.Field72 = false;
    }
}
