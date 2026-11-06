package main.tab.tab2;
final class Class368 implements Class256 {
   private Class374 Field1;

   Class368(Class374 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      try {
         String var1 = Class106.Field25.Field1.Field5();
         Class374.Field2(this.Field1, Integer.parseInt(var1));
         Class106.Field7();
         if (Class374.Field2(this.Field1) < 0) {
            Class106.Field1("Nhập sai,vui lòng chỉ nhập số lớn hơn 0 ");
            Class374.Field2(this.Field1, 0);
            return;
         }
      } catch (Exception var2) {
         Class106.Field7();
         Class106.Field1("Nhập sai,vui lòng chỉ nhập số");
      }

   }
}
