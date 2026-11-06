package main.tab.tab1;
final class Class604 implements Class258 {
   private Class467 Field1;
   private final Class274 Field2;

   Class604(Class467 var1, Class274 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field28.size() < 5) {
         --this.Field2.Field3;
         if (this.Field2.Field3 <= 0) {
            this.Field1.Field27.removeElement(this.Field2);
         }

         Class231 var1;
         (var1 = new Class231(this.Field2.Field2)).Field2 = this.Field2.Field1;
         this.Field1.Field28.addElement(var1);
      }

   }
}
