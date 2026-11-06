package main.tab.tab2;
final class Class452 implements Class256 {
   private Class491 Field1;

   Class452(Class491 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Class261.Field1().Field2(((Class357)this.Field1.Field1.Field3.elementAt(Class496.Field5)).Field65);
      this.Field1.Field1.Field3.removeElementAt(Class496.Field5);
      this.Field1.Field1.Field2.removeElementAt(Class496.Field5);
      if (--Class496.Field5 < 0) {
         Class496.Field5 = 0;
      }

      Class496.Field3(this.Field1.Field1);
      if ((Class496.Field4 = this.Field1.Field1.Field3.size() * Class496.Field4(this.Field1.Field1) - (Class496.Field5(this.Field1.Field1) - 32)) < 0) {
         Class496.Field4 = 0;
      }

      Class106.Field1("Đã xóa bạn");
   }
}
