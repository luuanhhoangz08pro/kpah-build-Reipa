package main.tab.tab1;
final class Class515 implements Class258 {
   final Class462 Field1;

   Class515(Class462 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field2 >= 0 && this.Field1.Field2 < this.Field1.Field1.size()) {
         Class105.Field2("Bạn có muốn mua số này không ?", new Class718(this));
      } else {
         Class105.Field1("Chọn sai. Vui lòng chọn lại");
      }
   }
}
