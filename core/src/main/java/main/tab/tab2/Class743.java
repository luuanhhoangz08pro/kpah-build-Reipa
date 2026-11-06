package main.tab.tab2;
import java.util.Random;
import java.util.Vector;

public final class Class743 extends Class432 {
   private boolean Field6 = false;
   private Vector Field7 = new Vector();

   public Class743(boolean var1) {
      this.Field6 = var1;
   }

   public final void Field1(Vector var1) {
      this.Field7 = var1;
   }

   public final void Field1(Class357 var1) {
      var1.Field23 = 4;
      Class432.Field1(var1, 0);
      if (var1.Field73 == 13) {
         int var2;
         int var3 = var2 = (new Random(System.currentTimeMillis())).nextInt() % 20;
         if (var1.Field12 != 0 && var1.Field12 != 1) {
            var2 = 0;
         } else {
            var3 = 0;
         }

         if (var1.Field67 != null) {
            if (var1.Field67.Field188 == 1) {
               if (var1.Field131 == 0) {
                  Class73.Field1(var1.Field67.Field193 + var2, var1.Field67.Field194 - 10 + var3, 11);
                  var1.Field67.Field1();
               } else if (var1.Field131 == 2) {
                  Class73.Field1(var1.Field67.Field193 + var2, var1.Field67.Field194 - 10 + var3, 12);
                  var1.Field67.Field12();
               }
            }

            var1.Field67.Field3 = 2;
         }

         int var4;
         Class114 var5;
         if (!this.Field6) {
            for(var4 = 0; var4 < this.Field7.size(); ++var4) {
               Class73.Field2((var5 = (Class114)this.Field7.elementAt(var4)).Field193 - 10 + var2, var5.Field194 - 25 + var3, 14);
               Class73.Field2(var5.Field193 + 10 + var2, var5.Field194 - 25 + var3, 14);
               Class73.Field2(var5.Field193 + var2, var5.Field194 - 25 - 10 + var3, 14);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  Class106.Field19.Field1("-" + var1.Field90, 0, var5.Field193, var5.Field194 - 15, -1, -2);
               }

               if (var1.Field131 != 0 && var1.Field131 < Class794.Field4.length) {
                  Class106.Field19.Field1(Class794.Field4[var1.Field131], 0, var5.Field193, var5.Field194 - 15, 2, -2);
               }
            }
         } else {
            for(var4 = 0; var4 < this.Field7.size(); ++var4) {
               var5 = (Class114)this.Field7.elementAt(var4);
               Class367 var6 = new Class367(var1.Field193, var1.Field194 + 37, var5, 1, true);
               if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                  var6.Field1[0] = "-" + var1.Field90;
               }

               if (var1.Field131 != 0) {
                  var6.Field1[1] = Class794.Field4[var1.Field131];
               }

               Class73.Field2.addElement(var6);
            }
         }
      }

      ++var1.Field73;
   }

   public final void Field1(Class126 var1) {
   }
}
