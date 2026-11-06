package main.tab.tab1;
final class Class322 implements Class258 {
   final Class319 Field1;
   private final Class537 Field2;

   Class322(Class319 var1, Class537 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      try {
         int var1 = Integer.parseInt(Class105.Field25.Field1.Field5());
         Class105.Field7();
         if (var1 >= 0 && var1 > this.Field2.Field40 && var1 < this.Field2.Field28) {
            Class105.Field2("Bạn có muốn đặt bid cho " + this.Field2.Field2().Field1 + " với giá " + var1 + " không?", new Class321(this, var1));
         } else {
            Class105.Field1("Giá bid phải lớn hơn " + this.Field2.Field40 + " và nhỏ hơn " + this.Field2.Field28);
         }
      } catch (Exception var2) {
         Class105.Field7();
         Class105.Field1("Nhập sai,vui lòng chỉ nhập số");
      }
   }
}
