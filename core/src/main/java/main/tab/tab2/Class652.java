package main.tab.tab2;
final class Class652 implements Class256 {
   private Class324 Field1;
   private final Class272 Field2;

   Class652(Class324 var1, Class272 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field20.size() < 5) {
         --this.Field2.Field3;
         if (this.Field2.Field3 <= 0) {
            this.Field1.Field19.removeElement(this.Field2);
         }

         Class230 var1;
         (var1 = new Class230(this.Field2.Field2)).Field2 = this.Field2.Field1;
         this.Field1.Field20.addElement(var1);
      }

   }
}
