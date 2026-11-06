package main.tab.tab1;
final class Class358 implements Class258 {
   private final Class190 Field1;
   private final Class190 Field2;
   private final Class537 Field3;

   Class358(Class190 var1, Class190 var2, Class537 var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      boolean var1 = false;
      boolean var2 = false;

      int var4;
      int var5;
      try {
         var4 = Integer.parseInt(this.Field1.Field5().trim());
         var5 = Integer.parseInt(this.Field2.Field5().trim());
      } catch (Exception var3) {
         Class105.Field1("Giá bán không hợp lệ");
         return;
      }

      if (var4 < var5) {
         Class105.Field1("Giá bid phải nhỏ hơn giá bán");
      } else {
         Class105.Field2("Bạn có muốn đặt bán vật phẩm này với giá " + this.Field1.Field5().trim() + "  không?", new Class357(this, this.Field3, var4, var5));
      }
   }
}
