package main.tab.tab2;
import java.util.Vector;

public final class Class747 extends Class432 {
   private Vector Field6 = new Vector();

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class357 var1) {
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
                  Class678 var3 = (Class678)this.Field6.elementAt(var2);
                  Class642 var5 = new Class642(var3.Field193, var3.Field194, var1.Field90);
                  Class73.Field2.addElement(var5);
               }
            } else {
               Class642 var4 = new Class642(var1.Field67.Field193, var1.Field67.Field194, var1.Field90);
               Class73.Field2.addElement(var4);
            }
         }

         ++var1.Field73;
      }
   }

   public final void Field1(Class126 var1) {
   }
}
