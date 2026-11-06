package main.tab.tab1;
final class Class828 implements Class258 {
   final Class181 Field1;

   Class828(Class181 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field5.Field1.equals("Xóa")) {
         Class105.Field1("Bạn thật sự muốn xóa nhân vật này?", new Class830(this), new Class827(this));
      } else {
         if (this.Field1.Field5.Field1.equals("Khôi phục")) {
            Class105.Field1("Bạn muốn khôi phục nhân vật này?", new Class817(this), new Class831(this));
         }

      }
   }
}
