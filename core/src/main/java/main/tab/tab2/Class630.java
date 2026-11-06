package main.tab.tab2;
public final class Class630 extends Class432 {
   public final void Field1(Class126 var1) {
   }

   public final void Field1(Class357 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
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
            Class62.Field1((int)0, (Class114)var1, (Class114)var1.Field67, (int)(var1.Field193 + Class432.Field4[var1.Field12]), var1.Field194 + Class432.Field5[var1.Field12], var1.Field90, var1.Field131);
         }

         ++var1.Field73;
      }
   }
}
