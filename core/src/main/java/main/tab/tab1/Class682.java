package main.tab.tab1;
final class Class682 implements Class258 {
   private Class467 Field1;
   private final int Field2;

   Class682(Class467 var1, int var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (Class105.Field19.Field15.Field207 && this.Field2 >= 14 && this.Field2 <= 18) {
         Class105.Field1("Không thể đeo khăn khi đang phạm tội.");
      } else {
         Class105.Field19.Field2(this.Field2);
         if (Class105.Field19.Field15.Field121[this.Field2] == 0) {
            this.Field1.Field12.removeElementAt(this.Field1.Field4);
         }

         if (this.Field2 >= 14 && this.Field2 <= 18) {
            Class105.Field19.Field15.Field71 = System.currentTimeMillis();
            Class105.Field19.Field15.Field200 = (byte)this.Field2;
         }

      }
   }
}
