package main.tab.tab1;
final class Class198 implements Class258 {
   private Class412 Field1;
   private final boolean Field2;
   private final int Field3;
   private final int Field4;

   Class198(Class412 var1, boolean var2, int var3, int var4) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
   }

   public final void Field1() {
      if (this.Field2) {
         Class63.Field46 = 1;
         this.Field1.Field11[this.Field3] = this.Field4;
      } else {
         Class63.Field46 = 0;
         this.Field1.Field12[this.Field3] = this.Field4;
      }

      Class585.Field1[Class63.Field46][this.Field3].Field1(this.Field4, this.Field2);
      Class826.Field2();
      Class63.Field46 = 0;
   }
}
