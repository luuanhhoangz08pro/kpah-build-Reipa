package main.tab.tab1;
import java.util.Vector;

public final class Class68 extends Class435 {
   private boolean Field6;
   private Vector Field7 = new Vector();

   public Class68(boolean var1) {
      this.Field6 = var1;
   }

   public final void Field1(Vector var1) {
      this.Field7 = var1;
   }

   public final void Field1(Class359 var1) {
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
         Class111 var3;
         if (!this.Field6) {
            for(var2 = 0; var2 < this.Field7.size(); ++var2) {
               var3 = (Class111)this.Field7.elementAt(var2);
               Class63.Field1((int)5, (Class111)var1, (Class111)var3, (int)(var1.Field193 + Class435.Field4[var1.Field12]), var1.Field194 + Class435.Field5[var1.Field12], var1.Field90, var1.Field131);
            }
         } else {
            for(var2 = 0; var2 < this.Field7.size(); ++var2) {
               var3 = (Class111)this.Field7.elementAt(var2);
               Class226 var4 = new Class226(var1.Field193 + Class435.Field4[var1.Field12], var1.Field194 + Class435.Field5[var1.Field12], var1, var3, (byte)4);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var4.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0 && var1.Field131 < Class787.Field4.length) {
                  var4.Field1[1] = Class787.Field4[var1.Field131];
               }

               Class74.Field2.addElement(var4);
            }
         }
      }

      ++var1.Field73;
   }

   public final void Field1(Class123 var1) {
   }
}
