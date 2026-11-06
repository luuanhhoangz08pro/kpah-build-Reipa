package main.tab.tab2;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

final class Class58 implements Class256 {
    private final String[] Field1;
    private final short[] Field2;
    private String[] Field3;

    Class58(Class62 var1, String[] var2, short[] var3, String[] var4) {
        this.Field1 = var2;
        this.Field2 = var3;
        this.Field3 = var4;
    }

    public final void Field1() {
        Class106.Field23 = null;
        Class774.Field5().Field1();
        Field3 = this.Field1;
        Class774.Field4 = this.Field2;
        Class774.Field2 = this.Field3;
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

            Class837.Field1("nqshIP", var3.toByteArray());
            var4.close();
        } catch (Exception var6) {
            var6.printStackTrace();
        }

        Class97.Field1().Field3();
    }
}
