package main.tab.tab1;
public final class Class129 extends Class435 {
   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         if (var1.Field73 == 15) {
            var1.Field204 = 0;
            var1.Field73 = 0;
            var1.Field76 = 0;
         } else if (var1.Field73 != 12 && var1.Field73 != 11 && var1.Field73 != 13 && var1.Field73 != 14) {
            if (var1.Field73 != 10 && var1.Field73 != 9) {
               if (var1.Field73 != 8 && var1.Field73 != 7) {
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

         if (var1.Field73 == 8) {
            if (var1.Field67 != null) {
               if (var1.Field67.Field188 == 1) {
                  if (var1.Field131 == 0) {
                     Class74.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 11);
                     ((Class123)var1.Field67).Field1((Class672)var1);
                  } else if (var1.Field131 == 2) {
                     Class74.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 12);
                     ((Class123)var1.Field67).Field12();
                  }
               }

               var1.Field67.Field3 = 2;
            }

            if (var1.Field131 != 1) {
               Class74.Field2(var1.Field67.Field193, var1.Field67.Field194 - 10, 13);
            }

            if (var1.Field90 != 0 && var1.Field90 != 2000000) {
               Class105.Field19.Field1("-" + var1.Field90, 0, var1.Field67.Field193, var1.Field67.Field194 - 15, -1, -2);
            }

            if (var1.Field131 != 0 && var1.Field131 < Class787.Field4.length) {
               Class105.Field19.Field1(Class787.Field4[var1.Field131], 0, var1.Field67.Field193, var1.Field67.Field194 - 15, 2, -2);
            }
         }

         ++var1.Field73;
      }
   }
}
