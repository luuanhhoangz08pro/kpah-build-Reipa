package main.tab.tab2;
final class Class518 implements Class256 {
   private Class529 Field1;

   Class518(Class529 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class106.Field19.Field15.Field122 < (long)this.Field1.Field1.Field55) {
         Class106.Field1("Không đủ tiền");
      } else {
         Class582 var10000 = Class106.Field19.Field15;
         var10000.Field122 -= (long)this.Field1.Field1.Field55;
         if (Class464.Field22[Class464.Field21] == 21) {
            Class261.Field1().Field6((int)1);
         } else {
            Class261.Field1().Field19(1);
         }

         Class106.Field8();
      }
   }
}
