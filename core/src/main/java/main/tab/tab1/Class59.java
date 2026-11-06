package main.tab.tab1;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

final class Class59 implements Class258 {
    private final String[] Field1;
    private final short[] Field2;
    private String[] Field3;

    Class59(Class63 var1, String[] var2, short[] var3, String[] var4) {
        this.Field1 = var2;
        this.Field2 = var3;
        this.Field3 = var4;
    }

    public final void Field1() {
        Class105.Field23 = null;
        Class767.Field5().Field1();
        Field3 = this.Field1;
        Class767.Field4 = this.Field2;
        Class767.Field2 = this.Field3;
        String[] var2 = this.Field3;
        String[] var7 = this.Field1;
        ByteArrayOutputStream var3 = new ByteArrayOutputStream();
        DataOutputStream var4 = new DataOutputStream(var3);

        try {
            var4.writeByte(var7.length);

            for (int var5 = 0; var5 < var7.length; ++var5) {
                var4.writeUTF(var7[var5]);
                var4.writeShort(this.Field2[var5]);
                var4.writeUTF(var2[var5]);
            }

            Class826.Field1("nqshIP", var3.toByteArray());
            var4.close();
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        Class96.Field1().Field3();
    }
}
