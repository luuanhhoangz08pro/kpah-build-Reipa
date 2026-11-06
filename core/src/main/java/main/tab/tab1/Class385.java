package main.tab.tab1;
import java.util.Vector;

public final class Class385 extends Class435 {
   private Vector Field6 = new Vector();
   private int Field7;
   private int Field8;
   private int Field9;
   private Class228 Field10;

   public Class385(int var1) {
      this.Field9 = var1;
   }

   public final void Field1(Vector var1) {
      this.Field3(var1);
   }

   public final void Field2(Vector var1) {
      this.Field3(var1);
   }

   private void Field3(Vector var1) {
      this.Field6.removeAllElements();

      for(int var2 = 0; var2 < var1.size(); ++var2) {
         Class111 var3 = (Class111)var1.elementAt(var2);
         Class672 var4;
         if ((var4 = Class105.Field19.Field3(var3.Field189)) != null) {
            this.Field6.addElement(var4);
         }
      }

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
            if (var1.Field73 % 2 == 0) {
               this.Field7 = var1.Field193;
               this.Field8 = var1.Field194;
               Class74.Field1(var1.Field193, var1.Field194 - 40, 3);
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
         Class385 var2 = this;
         if (this.Field10 == null) {
            this.Field10 = new Class228();
         }

         this.Field10.Field2();

         for(int var3 = 0; var3 < var2.Field6.size(); ++var3) {
            Class672 var4 = (Class672)var2.Field6.elementAt(var3);
            var2.Field10.Field1.addElement(new Class386(var4.Field193, var4.Field194));
         }

         if (var2.Field10.Field1.size() > 0) {
            var2.Field10.Field1(var2.Field10.Field1, new Class386(var2.Field7, var2.Field8 - 40), var2.Field9 == 4);
            Class74.Field2.addElement(var2.Field10);
         }

         for(int var6 = 0; var6 < this.Field6.size(); ++var6) {
            try {
               if (!((Class672)this.Field6.elementAt(var6)).d_()) {
                  Class111 var7 = (Class111)this.Field6.elementAt(var6);
                  if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                     Class105.Field19.Field1("-" + var1.Field90, 0, var7.Field193, var7.Field194 - 15, 1, -2);
                  }

                  if (var1.Field131 != 0 && var1.Field131 < Class787.Field4.length) {
                     Class105.Field19.Field1(Class787.Field4[var1.Field131], 0, var7.Field193, var7.Field194 - 15, 2, -2);
                  }

                  var7.Field1();
               }
            } catch (Exception var5) {
               var5.printStackTrace();
            }
         }
      }

      ++var1.Field73;
   }

   public final void Field1(Class123 var1) {
   }
}
