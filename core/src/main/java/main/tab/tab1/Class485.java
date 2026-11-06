package main.tab.tab1;
import java.util.Vector;

final class Class485 implements Class258 {
   final Class63 Field1;

   Class485(Class63 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Class2 var1;
      if ((var1 = Class804.Field3()) != null) {
         Vector var2 = new Vector();

         for(int var3 = 0; var3 < var1.Field1.length; ++var3) {
            int var5 = var1.Field1[var3];
            Class87 var4 = new Class87(Class804.Field57[var1.Field1[var3]], new Class487(this, var1, var3, var5));
            var2.addElement(var4);
         }

         Class105.Field21.Field1(var2, 3);
      }

   }
}
