package main.tab.tab2;
final class Class842 implements Class256 {
   final Class185 Field1;

   Class842(Class185 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field5.Field1.equals("Xóa")) {
         Class106.Field1("Bạn thật sự muốn xóa nhân vật này?", new Class844(this), new Class841(this));
      } else {
         if (this.Field1.Field5.Field1.equals("Khôi phục")) {
            Class106.Field1("Bạn muốn khôi phục nhân vật này?", new Class825(this), new Class845(this));
         }

      }
   }
}
