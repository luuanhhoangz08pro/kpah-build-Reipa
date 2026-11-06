package main.tab.tab2;
final class Class201 implements Class256 {
   private Class410 Field1;
   private final boolean Field2;
   private final int Field3;
   private final int Field4;

   Class201(Class410 var1, boolean var2, int var3, int var4) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
   }

   public final void Field1() {
      if (this.Field2) {
         Class62.Field46 = 1;
         this.Field1.Field11[this.Field3] = this.Field4;
      } else {
         Class62.Field46 = 0;
         this.Field1.Field12[this.Field3] = this.Field4;
      }

      Class582.Field1[Class62.Field46][this.Field3].Field1(this.Field4, this.Field2);
      Class837.Field2();
      Class62.Field46 = 0;
   }
}
