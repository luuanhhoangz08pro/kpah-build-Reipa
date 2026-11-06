package main.tab.tab1;
import java.util.Vector;

public final class Class740 extends Class435 {
   private Vector Field6 = new Vector();

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         if (var1.Field73 == 16) {
            var1.Field204 = 0;
            var1.Field73 = 0;
            var1.Field76 = 0;
         } else if (var1.Field73 >= 14 && var1.Field73 < 16) {
            var1.Field23 = 5;
            var1.Field76 = 7;
         } else if (var1.Field73 != 13 && var1.Field73 != 12) {
            if (var1.Field73 != 11 && var1.Field73 != 10) {
               var1.Field23 = 4;
               var1.Field76 = 4;
            } else {
               var1.Field23 = 4;
               var1.Field76 = 5;
            }
         } else {
            var1.Field23 = 5;
            var1.Field76 = 6;
         }

         if (var1.Field73 == 9) {
            if (this.Field6.size() > 0) {
               for(int var2 = 0; var2 < this.Field6.size(); ++var2) {
                  Class672 var3 = (Class672)this.Field6.elementAt(var2);
                  Class637 var5 = new Class637(var3.Field193, var3.Field194, var1.Field90);
                  Class74.Field2.addElement(var5);
               }
            } else {
               Class637 var4 = new Class637(var1.Field67.Field193, var1.Field67.Field194, var1.Field90);
               Class74.Field2.addElement(var4);
            }
         }

         ++var1.Field73;
      }
   }

   public final void Field1(Class123 var1) {
   }
}
