package main.tab.tab1;
final class Class728 implements Class258 {
   private Class326 Field1;
   private final Class743 Field2;
   private final int Field3;

   Class728(Class326 var1, Class743 var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      String var1 = Class537.Field1(this.Field2.Field10, "0") + Class537.Field1(this.Field2.Field11, "0") + Class537.Field1("Giá: " + this.Field2.Field18 + (this.Field2.Field16 == 0 ? " xu" : " lượng"), "0");
      Class326.Field1(this.Field1, var1, this.Field3 % this.Field1.Field4 * 18, this.Field3 / this.Field1.Field4 * 18);
   }
}
