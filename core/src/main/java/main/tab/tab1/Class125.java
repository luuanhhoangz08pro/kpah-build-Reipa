package main.tab.tab1;
import java.util.Vector;

public final class Class125 extends Class435 {
   private Vector Field6 = new Vector();

   public Class125(int var1) {
   }

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         Class435.Field1(var1, 0);
         if (var1.Field73 == 13) {
            if (this.Field6.size() > 0) {
               for(int var2 = 0; var2 < this.Field6.size(); ++var2) {
                  Class672 var3 = (Class672)this.Field6.elementAt(var2);
                  Class74.Field1.addElement(new Class796((Class111)var3, var1.Field193, var1.Field194, false));
               }
            } else {
               Class74.Field1.addElement(new Class796(var1.Field67, var1.Field193, var1.Field194, false));
            }
         }

         ++var1.Field73;
      }
   }
}
