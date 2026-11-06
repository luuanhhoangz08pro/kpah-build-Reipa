package main.tab.tab2;
import java.util.Vector;

public final class Class191 extends Class432 {
   private Vector Field6;
   private boolean Field7;

   public Class191(boolean var1) {
      this.Field7 = var1;
   }

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field2(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class357 var1) {
      var1.Field23 = 4;
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

      if (var1.Field73 == 9 && this.Field6 != null) {
         int var2;
         Class114 var3;
         if (!this.Field7) {
            if (var1.Field90 == 0) {
               Class106.Field19.Field1("MISS", 0, var1.Field67.Field193, var1.Field67.Field194 - 15, 1, -2);
            }

            for(var2 = 0; var2 < this.Field6.size(); ++var2) {
               var3 = (Class114)this.Field6.elementAt(var2);
               Class225 var4 = new Class225(var1.Field193 + Class432.Field4[var1.Field12], var1.Field194 + Class432.Field5[var1.Field12], var1, var3, (byte)3);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var4.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0 && var1.Field131 < Class794.Field4.length) {
                  var4.Field1[1] = Class794.Field4[var1.Field131];
               }

               Class73.Field2.addElement(var4);
            }
         } else {
            for(var2 = 0; var2 < this.Field6.size(); ++var2) {
               var3 = (Class114)this.Field6.elementAt(var2);
               Class367 var5 = new Class367(var1.Field193, var1.Field194 + 30, var3, 0, true);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var5.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0) {
                  var5.Field1[1] = Class794.Field4[var1.Field131];
               }

               Class73.Field2.addElement(var5);
            }
         }
      }

      ++var1.Field73;
   }

   public final void Field1(Class126 var1) {
   }
}
