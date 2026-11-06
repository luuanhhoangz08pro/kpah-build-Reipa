package main.tab.tab2;
final class Class725 implements Class256 {
   final Class324 Field1;

   Class725(Class324 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field14();
      if (!Class324.Field11(this.Field1)) {
         Class750 var1 = (Class750)Class106.Field19.Field21.elementAt(this.Field1.Field3);
         boolean var2 = false;
         int var3 = 0;
         Class272 var4;
         if ((var4 = Class272.Field1(var1.Field15)) != null) {
            var3 = var4.Field3;
            var2 = true;
         }

         if (!var2 && Class106.Field19.Field15.Field20()) {
            Class324.Field1(this.Field1, "Hành trang đã đầy", this.Field1.Field3 % this.Field1.Field4 * 18, this.Field1.Field3 / this.Field1.Field4 * 18);
         } else {
            Class750 var5 = Class811.Field1(var1.Field15);
            Class106.Field25.Field1("Số lượng: ", new Class726(this, var5, var1, var3), 1, 4, true);
            Class106.Field23 = Class106.Field25;
         }
      }
   }
}
