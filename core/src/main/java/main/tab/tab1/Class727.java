package main.tab.tab1;
final class Class727 implements Class258 {
   private Class720 Field1;
   private final Class743 Field2;
   private final int Field3;
   private final int Field4;
   private final Class743 Field5;

   Class727(Class720 var1, Class743 var2, int var3, int var4, Class743 var5) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
      this.Field5 = var5;
   }

   public final void Field1() {
      boolean var1 = false;
      int var2 = this.Field1.Field1.Field1.Field8.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         Class743 var4;
         if ((var4 = (Class743)this.Field1.Field1.Field1.Field8.elementAt(var3)).Field15 == this.Field2.Field15) {
            if (this.Field3 + var4.Field14 + this.Field4 > 300) {
               Class105.Field1("Không được mua nhiều hơn 300 cái.");
               return;
            }

            var4.Field14 = (short)(var4.Field14 + this.Field4);
            var1 = true;
            break;
         }
      }

      if (!var1) {
         Class743 var5;
         (var5 = new Class743()).Field15 = this.Field2.Field15;
         var5.Field14 = (short)this.Field4;
         this.Field1.Field1.Field1.Field8.addElement(var5);
      }

      Class585 var10000;
      if (this.Field5.Field16 == 0) {
         var10000 = Class105.Field19.Field15;
         var10000.Field122 -= (long)(this.Field5.Field18 * this.Field4);
      } else {
         var10000 = Class105.Field19.Field15;
         var10000.Field100 -= this.Field5.Field18 * this.Field4;
      }

      Class105.Field1("Đã mua. Món đồ đang ở trong hành trang.");
   }
}
