package main.tab.tab2;
final class Class734 implements Class256 {
   private Class324 Field1;
   private final Class750 Field2;
   private final int Field3;

   Class734(Class324 var1, Class750 var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      String var1 = Class534.Field1(this.Field2.Field10, "0") + Class534.Field1(this.Field2.Field11, "0") + Class534.Field1("Giá: " + this.Field2.Field18 + (this.Field2.Field16 == 0 ? " xu" : " lượng"), "0");
      Class324.Field1(this.Field1, var1, this.Field3 % this.Field1.Field4 * 18, this.Field3 / this.Field1.Field4 * 18);
   }
}
