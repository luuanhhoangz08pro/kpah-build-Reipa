package main.tab.tab2;
final class Class370 implements Class256 {
   private Class377 Field1;

   Class370(Class377 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class377.Field3 < Class377.Field2.size() && Class377.Field3 >= 0) {
         if (((Class773)Class377.Field2.elementAt(Class377.Field3)).Field2 == 1) {
            Class587.Field5().Field1();
            Class587.Field5().Field2 = this.Field1.Field1;
            Class587.Field5().Field1 = 90;
            Class587.Field5().Field3 = false;
            return;
         }

         Class106.Field1("Vui lòng chọn 1 vật phẩm để quay số.");
      }

   }
}
