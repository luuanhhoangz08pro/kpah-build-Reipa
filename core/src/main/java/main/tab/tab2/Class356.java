package main.tab.tab2;
final class Class356 implements Class256 {
   private final Class194 Field1;
   private final Class194 Field2;
   private final Class534 Field3;

   Class356(Class194 var1, Class194 var2, Class534 var3) {
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
         Class106.Field1("Giá bán không hợp lệ");
         return;
      }

      if (var4 < var5) {
         Class106.Field1("Giá bid phải nhỏ hơn giá bán");
      } else {
         Class106.Field2("Bạn có muốn đặt bán vật phẩm này với giá " + this.Field1.Field5().trim() + "  không?", new Class355(this, this.Field3, var4, var5));
      }
   }
}
