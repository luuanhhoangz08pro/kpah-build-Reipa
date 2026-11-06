package main.tab.tab1;
final class Class529 implements Class258 {
   private Class467 Field1;
   private final Class537 Field2;
   private final short Field3;

   Class529(Class467 var1, Class537 var2, short var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      try {
         String var1;
         if (!(var1 = Class105.Field25.Field1.Field5()).equals("")) {
            int var3;
            if ((var3 = Integer.parseInt(var1)) >= 0) {
               this.Field1.Field1(this.Field2, this.Field3, var3, true);
            }
         }
      } catch (Exception var2) {
         Class105.Field1("Vui lòng chỉ nhập số.");
      }
   }
}
