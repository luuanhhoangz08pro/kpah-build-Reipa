package main.tab.tab2;
final class Class526 implements Class256 {
   private Class464 Field1;
   private final Class534 Field2;
   private final short Field3;

   Class526(Class464 var1, Class534 var2, short var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      try {
         String var1 = Class106.Field25.Field1.Field5();
         if (!var1.equals("")) {
            int var2 = Integer.parseInt(var1);
            Class187.Field2 = var2;
            if (var2 >= 0) {
               this.Field1.Field1(this.Field2, this.Field3, var2, true);
            }
         }
      } catch (Exception var3) {
         Class106.Field1("Vui lòng chỉ nhập số.");
      }
   }
}
