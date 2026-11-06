package main.tab.tab1;
final class Class539 implements Class258 {
   private Class467 Field1;
   private final int Field2;

   Class539(Class467 var1, int var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field26.elementAt(this.Field2) instanceof Class537) {
         Class467.Field1(this.Field1, ((Class537)this.Field1.Field26.elementAt(this.Field2)).Field5(), this.Field2 % this.Field1.Field5 * this.Field1.Field7, this.Field2 / this.Field1.Field5 * this.Field1.Field7);
      } else {
         this.Field1.Field1((Class231)this.Field1.Field26.elementAt(this.Field2), this.Field2 % this.Field1.Field5 * this.Field1.Field7, this.Field2 / this.Field1.Field5 * this.Field1.Field7);
      }
   }
}
