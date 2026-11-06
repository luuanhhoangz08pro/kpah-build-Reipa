package main.tab.tab1;
final class Class372 implements Class258 {
   private Class379 Field1;

   Class372(Class379 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class379.Field3 < Class379.Field2.size() && Class379.Field3 >= 0) {
         if (((Class766)Class379.Field2.elementAt(Class379.Field3)).Field2 == 1) {
            Class590.Field5().Field1();
            Class590.Field5().Field2 = this.Field1.Field1;
            Class590.Field5().Field1 = 90;
            Class590.Field5().Field3 = false;
            return;
         }

         Class105.Field1("Vui lòng chọn 1 vật phẩm để quay số.");
      }

   }
}
