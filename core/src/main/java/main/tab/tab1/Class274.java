package main.tab.tab1;
public final class Class274 {
   public short Field1;
   public short Field2;
   public int Field3 = 0;
   private int Field5;
   public boolean Field4 = false;

   public Class274() {
   }

   public Class274(int var1) {
      this.Field1 = (byte)var1;
   }

   public static Class274 Field1(short var0) {
      for(int var1 = 0; var1 < Class585.Field37.size(); ++var1) {
         Class274 var2;
         if ((var2 = (Class274)Class585.Field37.elementAt(var1)).Field1 == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Class274 Field2(short var0) {
      for(int var1 = 0; var1 < Class585.Field37.size(); ++var1) {
         Class274 var2;
         if ((var2 = (Class274)Class585.Field37.elementAt(var1)).Field2 == var0) {
            return var2;
         }
      }

      return null;
   }

   public static Class274 Field1(Class274 var0, Class274 var1) {
      var1.Field1 = var0.Field1;
      var1.Field3 = var0.Field3;
      var1.Field5 = var0.Field5;
      var1.Field2 = var0.Field2;
      return var1;
   }
}
