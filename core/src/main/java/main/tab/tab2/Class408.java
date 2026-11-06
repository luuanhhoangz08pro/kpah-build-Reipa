package main.tab.tab2;
final class Class408 implements Class256 {
   final Class405 Field1;
   private final Class534 Field2;

   Class408(Class405 var1, Class534 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      try {
         int var1 = Integer.parseInt(Class106.Field25.Field1.Field5());
         Class106.Field7();
         if (var1 >= 0 && var1 > this.Field2.Field40 && var1 < this.Field2.Field28) {
            Class106.Field2("Bạn có muốn đặt bid cho " + this.Field2.Field2().Field1 + " với giá " + var1 + " không?", new Class407(this, var1));
         } else {
            Class106.Field1("Giá bid phải lớn hơn " + this.Field2.Field40 + " và nhỏ hơn " + this.Field2.Field28);
         }
      } catch (Exception var2) {
         Class106.Field7();
         Class106.Field1("Nhập sai,vui lòng chỉ nhập số");
      }
   }
}
