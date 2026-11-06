package main.tab.tab2;
final class Class512 implements Class256 {
   final Class459 Field1;

   Class512(Class459 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field2 >= 0 && this.Field1.Field2 < this.Field1.Field1.size()) {
         Class106.Field2("Bạn có muốn mua số này không ?", new Class724(this));
      } else {
         Class106.Field1("Chọn sai. Vui lòng chọn lại");
      }
   }
}
