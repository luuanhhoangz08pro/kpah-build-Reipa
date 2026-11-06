package main.tab.tab1;
final class Class370 implements Class258 {
   private Class376 Field1;

   Class370(Class376 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      try {
         String var1 = Class105.Field25.Field1.Field5();
         Class376.Field2(this.Field1, Integer.parseInt(var1));
         Class105.Field7();
         if (Class376.Field2(this.Field1) < 0) {
            Class105.Field1("Nhập sai,vui lòng chỉ nhập số lớn hơn 0 ");
            Class376.Field2(this.Field1, 0);
            return;
         }
      } catch (Exception var2) {
         Class105.Field7();
         Class105.Field1("Nhập sai,vui lòng chỉ nhập số");
      }

   }
}
