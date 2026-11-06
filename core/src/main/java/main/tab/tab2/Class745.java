package main.tab.tab2;
public final class Class745 extends Class432 {
   public final void Field1(Class126 var1) {
   }

   public final void Field1(Class357 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         if (var1.Field73 == 8) {
            var1.Field204 = 0;
            var1.Field73 = 0;
            var1.Field76 = 0;
         } else if (var1.Field73 != 7 && var1.Field73 != 6) {
            if (var1.Field73 != 5 && var1.Field73 != 4) {
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
         } else {
            var1.Field23 = 5;
            var1.Field76 = 7;
         }

         if (var1.Field73 == 3 && var1.Field67 != null) {
            if (var1.Field67.Field188 == 1) {
               if (var1.Field131 == 0) {
                  Class73.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 11);
                  ((Class126)var1.Field67).Field1();
               } else if (var1.Field131 == 2) {
                  Class73.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 12);
                  ((Class126)var1.Field67).Field12();
               }
            }

            var1.Field67.Field3 = 2;
            if (var1.Field90 != 0 && var1.Field90 != 2000000) {
               Class106.Field19.Field1("-" + var1.Field90, 0, var1.Field67.Field193, var1.Field67.Field194 - 15, -1, -2);
               Class73.Field1(var1.Field67.Field193, var1.Field67.Field194 - 20, 15);
            }

            if (var1.Field131 != 0 && var1.Field131 < Class794.Field4.length) {
               Class106.Field19.Field1(Class794.Field4[var1.Field131], 0, var1.Field67.Field193, var1.Field67.Field194 - 15, 2, -2);
            }
         }

         ++var1.Field73;
      }
   }
}
