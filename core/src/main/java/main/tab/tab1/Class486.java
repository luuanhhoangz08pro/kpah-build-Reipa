package main.tab.tab1;
final class Class486 implements Class258 {
   private Class467 Field1;
   private final Object Field2;
   private final int Field3;
   private final int Field4;

   Class486(Class467 var1, Object var2, int var3, int var4) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
   }

   public final void Field1() {
      if (this.Field2 instanceof Class537) {
         Class467.Field1(this.Field1, (Class537)this.Field2, this.Field1.Field15, this.Field3, this.Field4);
      } else {
         int var1 = Class585.Field42.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            if (Class585.Field42[var2].Field5 == ((Class641)this.Field2).Field5) {
               Class467.Field1(this.Field1, Class467.Field2(this.Field1, var2), this.Field3, this.Field4);
               return;
            }
         }

      }
   }
}
