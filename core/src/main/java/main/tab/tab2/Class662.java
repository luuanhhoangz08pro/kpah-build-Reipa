package main.tab.tab2;
final class Class662 implements Class256 {
   private Class324 Field1;
   private final int Field2;

   Class662(Class324 var1, int var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field18.elementAt(this.Field2) instanceof Class534) {
         Class324.Field1(this.Field1, ((Class534)this.Field1.Field18.elementAt(this.Field2)).Field5(), this.Field2 % this.Field1.Field4 * this.Field1.Field5, this.Field2 / this.Field1.Field4 * this.Field1.Field5);
      } else {
         this.Field1.Field1((Class230)this.Field1.Field18.elementAt(this.Field2), this.Field2 % this.Field1.Field4 * this.Field1.Field5, this.Field2 / this.Field1.Field4 * this.Field1.Field5);
      }
   }
}
