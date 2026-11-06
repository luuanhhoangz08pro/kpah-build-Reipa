package main.tab.tab2;
final class Class594 implements Class256 {
   private Class62 Field1;

   Class594(Class62 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (((Class357)this.Field1.Field16).Field200 <= 0 && !((Class357)this.Field1.Field16).Field207) {
         if (this.Field1.Field15.Field191 == -1) {
            this.Field1.Field28.Field7((int)this.Field1.Field15.Field189);
            Class62.Field32 = this.Field1.Field16.Field189;
         } else {
            this.Field1.Field28.Field5((int)this.Field1.Field16.Field189, (int)0);
         }
      } else {
         Class106.Field1("Không thể mời người trong trạng thái đánh nhau hoặc phạm tội");
      }
   }
}
