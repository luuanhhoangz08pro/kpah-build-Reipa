package main.tab.tab2;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public final class Class85 {
   public byte Field1;
   private ByteArrayOutputStream Field2 = null;
   private DataOutputStream Field3 = null;
   private ByteArrayInputStream Field4 = null;
   private DataInputStream Field5 = null;

   public Class85() {
   }

   public Class85(byte var1) {
      this.Field1 = var1;
      this.Field2 = new ByteArrayOutputStream();
      this.Field3 = new DataOutputStream(this.Field2);
   }

   Class85(byte var1, byte[] var2) {
      this.Field1 = var1;
      this.Field4 = new ByteArrayInputStream(var2);
      this.Field5 = new DataInputStream(this.Field4);
   }

   public final byte[] Field1() {
      return this.Field2.toByteArray();
   }

   public final DataInputStream Field2() {
      return this.Field5;
   }

   public final DataOutputStream Field3() {
      return this.Field3;
   }

   public final void Field4() {
      try {
         if (this.Field5 != null) {
            this.Field5.close();
         }

         if (this.Field3 != null) {
            this.Field3.close();
            return;
         }
      } catch (IOException var1) {
      }

   }
}
