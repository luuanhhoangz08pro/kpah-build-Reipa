package main.tab.tab2;
import java.util.Vector;

public final class Class128 extends Class432 {
   private Vector Field6 = new Vector();

   public Class128(int var1) {
   }

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class357 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         Class432.Field1(var1, 0);
         if (var1.Field73 == 13) {
            if (this.Field6.size() > 0) {
               for(int var2 = 0; var2 < this.Field6.size(); ++var2) {
                  Class678 var3 = (Class678)this.Field6.elementAt(var2);
                  Class73.Field1.addElement(new Class803((Class114)var3, var1.Field193, var1.Field194, false));
               }
            } else {
               Class73.Field1.addElement(new Class803(var1.Field67, var1.Field193, var1.Field194, false));
            }
         }

         ++var1.Field73;
      }
   }
}
