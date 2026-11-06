package main.tab.tab1;
final class Class721 implements Class258 {
   final Class326 Field1;
   private final int Field2;

   Class721(Class326 var1, int var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      this.Field1.Field14();
      if (!Class326.Field11(this.Field1)) {
         Class537 var1 = null;
         int var2 = 0;
         Class537 var5;
         if (this.Field2 != -1) {
            int var3 = Class105.Field19.Field21.size();

            for(int var4 = 0; var4 < var3; ++var4) {
               if (Class804.Field2((int)(var5 = (Class537)Class105.Field19.Field21.elementAt(var4)).Field18).Field3 == this.Field2) {
                  if (var2 == this.Field1.Field3) {
                     var1 = var5;
                     break;
                  }

                  ++var2;
               }
            }
         } else {
            var1 = (Class537)Class105.Field19.Field21.elementAt(this.Field1.Field3);
         }

         if (Class105.Field19.Field15.Field21() >= 42 * Class105.Field19.Field15.Field35) {
            Class326.Field1(this.Field1, "Hành trang đã đầy", this.Field1.Field3 % this.Field1.Field4 * 18, this.Field1.Field3 / this.Field1.Field4 * 18);
         } else {
            Class798 var7;
            if ((long)(var7 = Class804.Field2((int)var1.Field18)).Field10 > Class105.Field19.Field15.Field122) {
               Class326.Field1(this.Field1, "Hết tiền", this.Field1.Field3 % this.Field1.Field4 * 18, this.Field1.Field3 / this.Field1.Field4 * 18);
            } else {
               var5 = null;
               String var8;
               if (var7.Field9 == 0) {
                  var8 = "Bạn có muốn mua " + var7.Field1 + ", Giá: " + var7.Field10 + "$ không?";
               } else {
                  var8 = "Bạn có muốn thuê " + var7.Field1 + ", Giá: " + var7.Field10 + "Lượng không?";
               }

               Class105.Field2(var8, new Class722(this, var7, var1));
            }
         }
      }
   }
}
