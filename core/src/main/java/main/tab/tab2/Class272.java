package main.tab.tab2;
public final class Class272 {
   public short Field1;
   public short Field2;
   public int Field3 = 0;
   private int Field5;
   public boolean Field4 = false;

   public Class272() {
   }

   public Class272(int var1) {
      this.Field1 = (byte)var1;
   }

   public static Class272 Field1(short var0) {
      for(int var1 = 0; var1 < Class582.Field37.size(); ++var1) {
         Class272 var2;
         if ((var2 = (Class272)Class582.Field37.elementAt(var1)).Field1 == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Class272 Field2(short var0) {
      for(int var1 = 0; var1 < Class582.Field37.size(); ++var1) {
         Class272 var2;
         if ((var2 = (Class272)Class582.Field37.elementAt(var1)).Field2 == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Class272 Field1(Class272 var0, Class272 var1) {
      var1.Field1 = var0.Field1;
      var1.Field3 = var0.Field3;
      var1.Field5 = var0.Field5;
      var1.Field2 = var0.Field2;
      return var1;
   }
}
