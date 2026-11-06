package main.tab.tab2;
import java.util.Vector;

public final class Class67 extends Class432 {
   private boolean Field6;
   private Vector Field7 = new Vector();

   public Class67(boolean var1) {
      this.Field6 = var1;
   }

   public final void Field1(Vector var1) {
      this.Field7 = var1;
   }

   public final void Field1(Class357 var1) {
      var1.Field23 = 4;
      if (var1.Field73 == 18) {
         var1.Field204 = 0;
         var1.Field73 = 0;
         var1.Field76 = 0;
      } else if (var1.Field73 >= 6 && var1.Field73 < 18) {
         var1.Field23 = 5;
         var1.Field76 = 7;
      } else if (var1.Field73 != 5 && var1.Field73 != 4) {
         if (var1.Field73 != 3 && var1.Field73 != 2) {
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

      if (var1.Field73 == 3) {
         int var2;
         Class114 var3;
         if (!this.Field6) {
            for(var2 = 0; var2 < this.Field7.size(); ++var2) {
               var3 = (Class114)this.Field7.elementAt(var2);
               Class62.Field1((int)5, (Class114)var1, (Class114)var3, (int)(var1.Field193 + Class432.Field4[var1.Field12]), var1.Field194 + Class432.Field5[var1.Field12], var1.Field90, var1.Field131);
            }
         } else {
            for(var2 = 0; var2 < this.Field7.size(); ++var2) {
               var3 = (Class114)this.Field7.elementAt(var2);
               Class225 var4 = new Class225(var1.Field193 + Class432.Field4[var1.Field12], var1.Field194 + Class432.Field5[var1.Field12], var1, var3, (byte)4);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var4.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0 && var1.Field131 < Class794.Field4.length) {
                  var4.Field1[1] = Class794.Field4[var1.Field131];
               }

               Class73.Field2.addElement(var4);
            }
         }
      }

      ++var1.Field73;
   }

   public final void Field1(Class126 var1) {
   }
}
