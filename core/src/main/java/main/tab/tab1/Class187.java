package main.tab.tab1;
import java.util.Vector;

public final class Class187 extends Class435 {
   private Vector Field6;
   private boolean Field7;

   public Class187(boolean var1) {
      this.Field7 = var1;
   }

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field2(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class359 var1) {
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
         Class111 var3;
         if (!this.Field7) {
            if (var1.Field90 == 0) {
               Class105.Field19.Field1("MISS", 0, var1.Field67.Field193, var1.Field67.Field194 - 15, 1, -2);
            }

            for(var2 = 0; var2 < this.Field6.size(); ++var2) {
               var3 = (Class111)this.Field6.elementAt(var2);
               Class226 var4 = new Class226(var1.Field193 + Class435.Field4[var1.Field12], var1.Field194 + Class435.Field5[var1.Field12], var1, var3, (byte)3);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var4.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0 && var1.Field131 < Class787.Field4.length) {
                  var4.Field1[1] = Class787.Field4[var1.Field131];
               }

               Class74.Field2.addElement(var4);
            }
         } else {
            for(var2 = 0; var2 < this.Field6.size(); ++var2) {
               var3 = (Class111)this.Field6.elementAt(var2);
               Class369 var5 = new Class369(var1.Field193, var1.Field194 + 30, var3, 0, true);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var5.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0) {
                  var5.Field1[1] = Class787.Field4[var1.Field131];
               }

               Class74.Field2.addElement(var5);
            }
         }
      }

      ++var1.Field73;
   }

   public final void Field1(Class123 var1) {
   }
}
