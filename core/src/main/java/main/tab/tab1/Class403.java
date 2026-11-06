package main.tab.tab1;

import main.tab.tab1.screen.MainTab;

public final class Class403 implements Runnable {
    private int Field7 = -1;
    private int Field8 = -1;
    int Field1 = -1;
    int Field2 = -1;
    int Field3 = -1;
    int Field4 = -1;
    private int Field9 = -1;
    int Field5 = -1;
    private Class258 Field10;
    public boolean Field6 = false;
    private byte[] Field11 = null;

    public final void Field1(int var1, Class258 var2, byte[] var3) {
        this.Field9 = var1;
        this.Field10 = var2;
        this.Field11 = var3;
        Class458.Field1();
    }

    public final void run() {
        while (true) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException var3) {
                var3.printStackTrace();
            }

            if (this.Field7 != -1 && this.Field8 != -1) {
                Class804.Field2(this.Field7, this.Field8);
                this.Field7 = -1;
                this.Field8 = -1;
            }

            if (this.Field1 != -1 && this.Field2 != -1) {
                Class804.Field3(this.Field1, this.Field2, this.Field3);
                this.Field1 = -1;
                this.Field2 = -1;
            }

            if (this.Field4 != -1) {
                try {
                    Class804.Field7(this.Field4);
                } catch (Exception var2) {
                }

                this.Field4 = -1;
            }

            if (this.Field9 != -1) {
                int var1 = this.Field9;
                this.Field9 = -1;
                Class458.Field1(var1, this.Field11);
                this.Field10.Field1();
                this.Field11 = null;
            }

            if (this.Field5 != -1) {
                Class804.Field5(this.Field5);
                this.Field5 = -1;
            }

            if (this.Field6) {
                MainTab.instance.Field1();
                this.Field6 = false;
            }
        }
    }
}
