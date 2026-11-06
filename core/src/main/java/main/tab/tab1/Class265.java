package main.tab.tab1;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

final class Class265 implements Runnable {
    private final String Field2;
    final Class96 Field1;
    private final int port;

    Class265(Class96 var1, String var2, int p) {
        this.Field1 = var1;
        this.Field2 = var2;
        port = p;
    }

    public final void run() {
        Class96.Field10 = false;
        (new Thread(new Class380(this))).start();
        this.Field1.Field4 = true;
        this.Field1.Field3 = true;

        try {
            Socket socket = new Socket(Field2, port);
            Class96.Field1(this.Field1, socket);
            Class96.Field1(this.Field1, new DataOutputStream(socket.getOutputStream()));
            this.Field1.Field1 = new DataInputStream(socket.getInputStream());
            (new Thread(Class96.Field2(this.Field1))).start();
            this.Field1.Field5 = new Thread(new Class355(this.Field1));
            this.Field1.Field5.start();
            this.Field1.Field9 = System.currentTimeMillis();
            Class96.Field1(this.Field1, new Class86((byte) -40));
            this.Field1.Field4 = false;
            Class130 var1 = this.Field1.Field2;
            Class63.Field12();
        } catch (Exception var4) {
            try {
                Thread.sleep(500L);
            } catch (InterruptedException var3) {
            }

            if (!Class96.Field10) {
                if (this.Field1.Field2 != null) {
                    this.Field1.Field3();
                    Class130 var5 = this.Field1.Field2;
                    Class105.Field19.Field13();
                }

            }
        }
    }
}
