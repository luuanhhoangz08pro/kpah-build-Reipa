package main.tab.tab1;
import java.util.Vector;

final class Class147 implements Class258 {
   private Class270 Field1;

   Class147(Class270 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Vector var1 = new Vector();
      if (this.Field1.Field6.size() > 0) {
         Class733 var2;
         if ((var2 = (Class733)this.Field1.Field6.elementAt(Class270.Field2(this.Field1))).Field4 == 0) {
            var1.addElement(this.Field1.Field8);
         } else if (var2.Field4 == 2 || var2.Field4 == 3) {
            var1.addElement(this.Field1.Field9);
         }

         Class105.Field21.Field1(var1, 0);
      }

   }
}
