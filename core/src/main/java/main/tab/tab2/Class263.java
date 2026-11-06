package main.tab.tab2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

final class Class263 implements Runnable {
    private final String Field2;
    final Class97 Field1;
    private int port;

    Class263(Class97 var1, String var2, int p) {
        this.Field1 = var1;
        this.Field2 = var2;
        port = p;
    }

    public final void run() {
        Class97.Field10 = false;
        (new Thread(new Class378(this))).start();
        this.Field1.Field4 = true;
        this.Field1.Field3 = true;

        try {
            Socket socket = new Socket(Field2, port);
            Class97.Field1(this.Field1, socket);
            Class97.Field1(this.Field1, new DataOutputStream(socket.getOutputStream()));
            this.Field1.Field1 = new DataInputStream(socket.getInputStream());
            (new Thread(Class97.Field2(this.Field1))).start();
            this.Field1.Field5 = new Thread(new Class353(this.Field1));
            this.Field1.Field5.start();
            this.Field1.Field9 = System.currentTimeMillis();
            Class97.Field1(this.Field1, new Class85((byte) -40));
            this.Field1.Field4 = false;
            Class133 var1 = this.Field1.Field2;
            Class62.Field12();
        } catch (Exception var4) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException var3) {
            }

            if (!Class97.Field10) {
                if (this.Field1.Field2 != null) {
                    this.Field1.Field3();
                    Class133 var5 = this.Field1.Field2;
                    Class106.Field19.Field13();
                }

            }
        }
    }
}
