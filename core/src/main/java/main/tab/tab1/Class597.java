package main.tab.tab1;
final class Class597 implements Class258 {
   private Class63 Field1;

   Class597(Class63 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (((Class359)this.Field1.Field16).Field200 <= 0 && !((Class359)this.Field1.Field16).Field207) {
         if (this.Field1.Field15.Field191 == -1) {
            this.Field1.Field28.Field7((int)this.Field1.Field15.Field189);
            Class63.Field32 = this.Field1.Field16.Field189;
         } else {
            this.Field1.Field28.Field5((int)this.Field1.Field16.Field189, (int)0);
         }
      } else {
         Class105.Field1("Không thể mời người trong trạng thái đánh nhau hoặc phạm tội");
      }
   }
}
