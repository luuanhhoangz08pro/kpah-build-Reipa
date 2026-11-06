package main.tab.tab1;
import java.util.Vector;

public final class Class120 extends Class435 {
   private Vector Field6 = new Vector();

   public Class120(int var1) {
   }

   public final void Field1(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field2(Vector var1) {
      this.Field6 = var1;
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         Class435.Field2(var1);
         int var2;
         Class672 var3;
         if (var1.Field73 == 10) {
            if (this.Field6.size() > 0) {
               for(var2 = 0; var2 < this.Field6.size(); ++var2) {
                  var3 = (Class672)this.Field6.elementAt(var2);
                  Class63.Field2(0, var1, (Class111)var3, var1.Field193, var1.Field194 - 15, var1.Field90, var1.Field131, 1);
               }
            } else {
               Class63.Field2(0, var1, var1.Field67, var1.Field193, var1.Field194 - 15, var1.Field90, var1.Field131, 1);
            }
         }

         if (var1.Field73 >= 13) {
            if (this.Field6.size() > 0) {
               for(var2 = 0; var2 < this.Field6.size(); ++var2) {
                  var3 = (Class672)this.Field6.elementAt(var2);
                  Field1(var1, var3);
               }
            } else {
               Field1(var1, var1.Field67);
            }
         }

         ++var1.Field73;
      }
   }

   private static void Field1(Class359 var0, Class672 var1) {
      short var2 = var1.Field193;
      int var3 = var1.Field194 - 20;
      int var4 = Class804.Field13(3) + 1;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6;
         int var7 = (var6 = Class804.Field13(50) + 50) * Class802.Field2(var5 * 30) >> 10;
         var6 = -(var6 * Class802.Field1(var5 * 30)) >> 10;
         Class63.Field2(0, var0, (Class111)var1, var2 + var7, var3 + var6, var0.Field90, var0.Field131, Class804.Field13(2));
      }

   }

   public final void Field1(Class123 var1) {
   }
}
