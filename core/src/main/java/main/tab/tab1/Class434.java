package main.tab.tab1;
import java.util.Vector;

public final class Class434 extends Class435 {
   private boolean Field6 = false;
   private Vector Field7 = new Vector();

   public Class434(boolean var1) {
   }

   public final void Field1(Vector var1) {
      this.Field7 = var1;
   }

   public final void Field1(Class359 var1) {
   }

   public final void Field1(Class123 var1) {
      if (var1.Field39 == 3 && !this.Field6) {
         for(int var2 = 0; var2 < this.Field7.size(); ++var2) {
            Class111 var3 = (Class111)this.Field7.elementAt(var2);
            Class63.Field1((int)7, (Class111)var1, (Class111)var3, (int)(var1.Field193 + Class435.Field4[var1.Field12]), var1.Field194 + Class435.Field5[var1.Field12], var3.Field18, (byte)0);
         }
      }

      ++var1.Field39;
   }
}
