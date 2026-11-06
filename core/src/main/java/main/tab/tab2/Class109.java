package main.tab.tab2;

import main.lib.ServerManager;

import java.util.Vector;

public class Class109 extends Thread implements Class256 {
    public int Field1;

    public Class109(int var1) {
        this.Field1 = var1;
    }

    public void Field1() {
        this.start();
    }

    public final void run() {
        switch (this.Field1) {
            case 1:
                this.Field4();
                return;
            case 2:
                this.Field2();
                return;
            case 3:
                this.Field5();
                return;
            case 4:
                this.Field3();
                return;
            default:
                Class62.Field1("Xong \n Roman");
        }
    }

    public void Field2() {
        int[] var1 = new int[]{5, 11, 17, 23, 29};

        for (int var2 = 0; var2 <= var1.length; ++var2) {
            Class261.Field1().Field1((int) -11, (byte) 0, (int) 1);
            Class261.Field1().Field1((int) -11, (byte) 1, (int) var1[var2]);
            Class858.Field1(55L);
        }

    }

    public void Field3() {
        int[] var1 = new int[]{5, 11, 17, 23, 29};

        for (int var2 = 0; var2 <= var1.length; ++var2) {
            Class261.Field1().Field1((int) -12, (byte) 1, (int) var1[var2]);
            Class858.Field1(55L);
        }

    }

    public void Field4() {
        Vector var1 = new Vector();
        var1.addElement(new Class86("Auto Chát", new Class91()));
        var1.addElement(new Class86("Tác Giả", () -> Class106.Field1(ServerManager.decrypt("272534295b5c5b2f5b5a5412190e515c545d4051574114415b4846432a2224:38633261373834393461326362633636356436303438316639353438616239623430633232623435643361653065306239326134303037306562613139663664"))));
        var1.addElement(new Class86("Đăng Xuất", new Class751(Class106.Field1)));
        Class106.Field21.Field1(var1, 3);
    }

    public void Field5() {
        Class582.Field1[Class62.Field46][2].Field1(8, false);
        Class582.Field1[Class62.Field46][1].Field1(7, false);
        Class582.Field1[Class62.Field46][0].Field1(3, false);
        Class837.Field2();
        Class62.Field1("Cài Skill Done");
    }
}
