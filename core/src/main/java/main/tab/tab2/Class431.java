package main.tab.tab2;
import java.util.Vector;

public final class Class431 extends Class432 {
   private boolean Field6 = false;
   private Vector Field7 = new Vector();

   public Class431(boolean var1) {
   }

   public final void Field1(Vector var1) {
      this.Field7 = var1;
   }

   public final void Field1(Class357 var1) {
   }

   public final void Field1(Class126 var1) {
      if (var1.Field39 == 3 && !this.Field6) {
         for(int var2 = 0; var2 < this.Field7.size(); ++var2) {
            Class114 var3 = (Class114)this.Field7.elementAt(var2);
            Class62.Field1((int)7, (Class114)var1, (Class114)var3, (int)(var1.Field193 + Class432.Field4[var1.Field12]), var1.Field194 + Class432.Field5[var1.Field12], var3.Field18, (byte)0);
         }
      }

      ++var1.Field39;
   }
}
