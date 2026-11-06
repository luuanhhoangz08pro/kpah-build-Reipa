package main.tab.tab2;
final class Class788 implements Class256 {
   private Class324 Field1;

   Class788(Class324 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field14();
      if (this.Field1.Field3 < Class811.Field6.size()) {
         if (Class106.Field19.Field15.Field20()) {
            Class106.Field1("Hành trang đã đầy.");
         } else {
            int var1 = 0;
            int var2 = Class811.Field6.size();

            for(int var3 = 0; var3 < var2; ++var3) {
               Class750 var4;
               if ((var4 = (Class750)Class811.Field6.elementAt(var3)).Field7 == Class324.Field16 && var4.Field17) {
                  if (var1 == this.Field1.Field3) {
                     Class750 var5 = (Class750)Class811.Field6.elementAt(var3);
                     Class106.Field2("Bạn có muốn mua vật phẩm này không ?", new Class787(this, var5));
                     return;
                  }

                  ++var1;
               }
            }

         }
      }
   }
}
