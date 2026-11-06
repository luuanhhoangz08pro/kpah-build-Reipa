package main.tab.tab2;
import java.util.Vector;

final class Class482 implements Class256 {
   final Class62 Field1;

   Class482(Class62 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Class2 var1;
      if ((var1 = Class811.Field3()) != null) {
         Vector var2 = new Vector();

         for(int var3 = 0; var3 < var1.Field1.length; ++var3) {
            int var5 = var1.Field1[var3];
            Class86 var4 = new Class86(Class811.Field57[var1.Field1[var3]], new Class484(this, var1, var3, var5));
            var2.addElement(var4);
         }

         Class106.Field21.Field1(var2, 3);
      }

   }
}
