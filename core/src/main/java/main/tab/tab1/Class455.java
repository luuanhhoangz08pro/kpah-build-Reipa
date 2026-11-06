package main.tab.tab1;
final class Class455 implements Class258 {
   private Class494 Field1;

   Class455(Class494 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Class263.Field1().Field2(((Class359)this.Field1.Field1.Field3.elementAt(Class499.Field5)).Field65);
      this.Field1.Field1.Field3.removeElementAt(Class499.Field5);
      this.Field1.Field1.Field2.removeElementAt(Class499.Field5);
      if (--Class499.Field5 < 0) {
         Class499.Field5 = 0;
      }

      Class499.Field3(this.Field1.Field1);
      if ((Class499.Field4 = this.Field1.Field1.Field3.size() * Class499.Field4(this.Field1.Field1) - (Class499.Field5(this.Field1.Field1) - 32)) < 0) {
         Class499.Field4 = 0;
      }

      Class105.Field1("Đã xóa bạn");
   }
}
