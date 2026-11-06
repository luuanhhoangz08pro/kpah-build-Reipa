package main.tab.tab2;
final class Class460 implements Class256 {
   private Class464 Field1;
   private final Class750 Field2;
   private final int Field3;

   Class460(Class464 var1, Class750 var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      String var1 = null;
      Class750 var2;
      var1 = Class534.Field1((var2 = Class811.Field2(this.Field2.Field15)).Field10, "0");
      var1 = var1 + Class534.Field1(var2.Field11, "0");
      var1 = var1 + Class534.Field1("Giá mua: " + var2.Field18 + " " + (var2.Field16 == 0 ? "lượng" : "xu"), "0");
      Class464.Field1(this.Field1, var1, this.Field3 % this.Field1.Field5 * 18, this.Field3 / this.Field1.Field5 * 18);
   }
}
