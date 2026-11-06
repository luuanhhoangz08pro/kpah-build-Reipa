package main.tab.tab1;
final class Class720 implements Class258 {
   final Class719 Field1;
   private final Class743 Field2;
   private final Class743 Field3;
   private final int Field4;

   Class720(Class719 var1, Class743 var2, Class743 var3, int var4) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
   }

   public final void Field1() {
      try {
         int var1;
         if ((var1 = Integer.parseInt(Class105.Field25.Field1.Field5())) >= 0) {
            if ((this.Field2.Field16 != 0 || (long)(this.Field2.Field18 * var1) <= Class105.Field19.Field15.Field122) && (this.Field2.Field16 != 1 || this.Field2.Field18 * var1 <= Class105.Field19.Field15.Field100)) {
               Class105.Field2("Bạn có muốn mua " + var1 + " " + this.Field2.Field10 + ", Giá: " + this.Field2.Field18 * var1 + (this.Field2.Field16 == 0 ? "$" : "lượng") + " không?", new Class727(this, this.Field3, this.Field4, var1, this.Field2));
            } else {
               Class326.Field1(this.Field1.Field1, "Hết tiền", this.Field1.Field1.Field3 % this.Field1.Field1.Field4 * 18, this.Field1.Field1.Field3 / this.Field1.Field1.Field4 * 18);
            }
         }
      } catch (Exception var2) {
         Class105.Field1("Chỉ được nhập số.");
      }
   }
}
