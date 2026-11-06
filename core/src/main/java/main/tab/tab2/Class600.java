package main.tab.tab2;
final class Class600 implements Class256 {
   private Class464 Field1;
   private final Class272 Field2;

   Class600(Class464 var1, Class272 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field28.size() < 5) {
         --this.Field2.Field3;
         if (this.Field2.Field3 <= 0) {
            this.Field1.Field27.removeElement(this.Field2);
         }

         Class230 var1;
         (var1 = new Class230(this.Field2.Field2)).Field2 = this.Field2.Field1;
         this.Field1.Field28.addElement(var1);
      }

   }
}
