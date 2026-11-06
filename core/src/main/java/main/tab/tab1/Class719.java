package main.tab.tab1;
final class Class719 implements Class258 {
   final Class326 Field1;

   Class719(Class326 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field14();
      if (!Class326.Field11(this.Field1)) {
         Class743 var1 = (Class743)Class105.Field19.Field21.elementAt(this.Field1.Field3);
         boolean var2 = false;
         int var3 = 0;
         Class274 var4;
         if ((var4 = Class274.Field1(var1.Field15)) != null) {
            var3 = var4.Field3;
            var2 = true;
         }

         if (!var2 && Class105.Field19.Field15.Field20()) {
            Class326.Field1(this.Field1, "Hành trang đã đầy", this.Field1.Field3 % this.Field1.Field4 * 18, this.Field1.Field3 / this.Field1.Field4 * 18);
         } else {
            Class743 var5 = Class804.Field1(var1.Field15);
            Class105.Field25.Field1("Số lượng: ", new Class720(this, var5, var1, var3), 1, 4, true);
            Class105.Field23 = Class105.Field25;
         }
      }
   }
}
