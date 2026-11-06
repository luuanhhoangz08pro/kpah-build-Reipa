package main.tab.tab2;
final class Class572 implements Class256 {
   private Class574 Field1;
   private final int Field2;
   private final int Field3;

   Class572(Class574 var1, int var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      try {
         int var1;
         if ((var1 = Integer.parseInt(Class106.Field25.Field1.Field5())) < 0) {
            Class106.Field1("Không được nhập số âm.");
         } else if (var1 > 120) {
            Class106.Field1("Chỉ được mua nhiều nhất 120 đơn vị một lần.");
         } else {
            Class534 var2;
            Class534 var10000 = var2 = (Class534)this.Field1.Field1.Field13.elementAt(this.Field2);
            var10000.Field10 = (short)(var10000.Field10 + var1);
            Class582 var5 = Class106.Field19.Field15;
            var5.Field122 -= (long)this.Field3;
            Class106.Field7();
            this.Field1.Field1.Field24 = 0;
            this.Field1.Field1.Field19();
            Class464.Field1(this.Field1.Field1, var2.Field4(), this.Field1.Field1.Field4 % this.Field1.Field1.Field5 * 18, this.Field1.Field1.Field4 / this.Field1.Field1.Field5 * 18);
         }
      } catch (Exception var4) {
         Class106.Field1("Không được nhập chữ");
      }
   }
}
