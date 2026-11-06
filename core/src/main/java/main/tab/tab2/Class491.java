package main.tab.tab2;
final class Class491 implements Class256 {
   final Class496 Field1;

   Class491(Class496 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field2.size() == 0) {
         Class106.Field1("Danh sách trống");
      } else {
         Class106.Field2("Bạn có muốn xóa người này không ?", new Class452(this));
      }
   }
}
