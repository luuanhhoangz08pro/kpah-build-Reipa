package main.tab.tab1;
public final class Class255 extends Class435 {
   public final void Field1(Class123 var1) {
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         Class435.Field5(var1);
         if (var1.Field73 == 3 && var1.Field67 != null) {
            if (var1.Field67.Field188 == 1) {
               if (var1.Field131 == 0) {
                  Class74.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 11);
                  ((Class123)var1.Field67).Field1();
               } else if (var1.Field131 == 2) {
                  Class74.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 12);
                  ((Class123)var1.Field67).Field12();
               }
            }

            var1.Field67.Field3 = 2;
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
