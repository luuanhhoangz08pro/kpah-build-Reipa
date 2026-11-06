package main.tab.tab1;
public final class Class257 extends Class435 {
   public final void Field1(Class123 var1) {
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
               if (var1.Field73 % 2 == 0) {
                  Class74.Field1(var1.Field193 + Class435.Field2[var1.Field12], var1.Field194 + Class435.Field3[var1.Field12], 3);
               }

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
            Class63.Field1((int)1, (Class111)var1, (Class111)var1.Field67, (int)(var1.Field193 + Class435.Field2[var1.Field12]), var1.Field194 + Class435.Field3[var1.Field12], var1.Field90, var1.Field131);
         }

         ++var1.Field73;
      }
   }
}
