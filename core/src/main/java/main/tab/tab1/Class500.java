package main.tab.tab1;
final class Class500 implements Class258 {
   private Class467 Field1;

   Class500(Class467 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field19();
      if (this.Field1.Field4 < Class804.Field6.size()) {
         if (Class105.Field19.Field15.Field20()) {
            Class105.Field1("Hành trang đã đầy.");
         } else {
            int var1 = 0;
            int var2 = Class804.Field6.size();

            for(int var3 = 0; var3 < var2; ++var3) {
               Class743 var4;
               if ((var4 = (Class743)Class804.Field6.elementAt(var3)).Field7 == Class467.Field21 && var4.Field17) {
                  if (var1 == this.Field1.Field4) {
                     Class743 var5 = (Class743)Class804.Field6.elementAt(var3);
                     Class105.Field2("Bạn có muốn mua vật phẩm này không ?", new Class497(this, var5));
                     return;
                  }

                  ++var1;
               }
            }

         }
      }
   }
}
