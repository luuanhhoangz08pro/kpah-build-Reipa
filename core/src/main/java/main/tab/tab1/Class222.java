package main.tab.tab1;

import main.screen.Main;

final class Class222 implements Class258 {
    private final String Field1;

    Class222(Class130 var1, String var2) {
        this.Field1 = var2;
    }

    public final void Field1() {
        try {
            Main.instance.platformRequest(this.Field1);
            Thread.sleep(500L);
        } catch (Exception var1) {
        }

        Main.instance.notifyDestroyed();
    }
}
