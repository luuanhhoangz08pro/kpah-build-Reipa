package main.tab.tab2;
final class Class688 implements Class256 {
   private Class464 Field1;
   private final int Field2;

   Class688(Class464 var1, int var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (Class106.Field19.Field15.Field207 && this.Field2 >= 14 && this.Field2 <= 18) {
         Class106.Field1("Không thể đeo khăn khi đang phạm tội.");
      } else {
         Class106.Field19.Field2(this.Field2);
         if (Class106.Field19.Field15.Field121[this.Field2] == 0) {
            this.Field1.Field12.removeElementAt(this.Field1.Field4);
         }

         if (this.Field2 >= 14 && this.Field2 <= 18) {
            Class106.Field19.Field15.Field71 = System.currentTimeMillis();
            Class106.Field19.Field15.Field200 = (byte)this.Field2;
         }

      }
   }
}
