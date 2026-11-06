package main.tab.tab2;

import main.screen.Main;

final class Class221 implements Class256 {
    private final String Field1;

    Class221(Class133 var1, String var2) {
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
