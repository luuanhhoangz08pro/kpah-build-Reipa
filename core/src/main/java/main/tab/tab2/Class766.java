package main.tab.tab2;
final class Class766 implements Class256 {
   final Class768 Field1;
   private final Class750 Field2;
   private final Class750 Field3;
   private final int Field4;

   Class766(Class768 var1, Class750 var2, Class750 var3, int var4) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
   }

   public final void Field1() {
      try {
         int var1 = Integer.parseInt(Class106.Field25.Field1.Field5());
         if (var1 >= 0) {
            if ((this.Field2.Field16 != 0 || (long)(this.Field2.Field18 * var1) <= Class106.Field19.Field15.Field122) && (this.Field2.Field16 != 1 || this.Field2.Field18 * var1 <= Class106.Field19.Field15.Field100)) {
               Class106.Field2("Bạn có muốn mua " + var1 + " " + this.Field2.Field10 + ", Giá: " + this.Field2.Field18 * var1 + (this.Field2.Field16 == 0 ? "$" : "lượng") + " không?", new Class770(this, this.Field3, this.Field4, var1, this.Field2));
            } else {
               Class768 var5 = this.Field1;
               Class768 var4 = this.Field1;
               Class768 var3 = this.Field1;
               Class768 var2 = this.Field1;
               Class768 var6 = this.Field1;
               Class464.Field1(var5.Field1, "Hết tiền", var4.Field1.Field4 % var3.Field1.Field5 * 18, var2.Field1.Field4 / var6.Field1.Field5 * 18);
            }
         }
      } catch (Exception var7) {
         Class106.Field1("Chỉ được nhập số.");
      }
   }
}
