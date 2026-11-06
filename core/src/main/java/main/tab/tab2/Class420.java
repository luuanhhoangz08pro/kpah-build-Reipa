package main.tab.tab2;
final class Class420 implements Class256 {
   private Class464 Field1;
   private final Class42 Field2;
   private final int Field3;

   Class420(Class464 var1, Class42 var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      if (!this.Field2.Field1.equals("")) {
         if (this.Field2.Field4 == 0) {
            Class464.Field1(this.Field1, Class534.Field1(this.Field2.Field2 + " lv" + this.Field2.Field3, "0") + Class534.Field1(this.Field2.Field1, "0"), this.Field3 % this.Field1.Field5 * 18, this.Field3 / this.Field1.Field5 * 18);
            return;
         }

         long var1 = (long)this.Field2.Field7 - (System.currentTimeMillis() - this.Field2.Field6) / 60000L;
         Class464.Field1(this.Field1, Class534.Field1(this.Field2.Field2, "0") + Class534.Field1(this.Field2.Field1, "0") + Class534.Field1("Còn lại: " + var1 + " phút", "0"), this.Field3 % this.Field1.Field5 * 18, this.Field3 / this.Field1.Field5 * 18);
      }

   }
}
