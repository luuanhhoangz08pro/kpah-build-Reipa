package main.tab.tab1;
final class Class530 implements Class258 {
   private Class467 Field1;

   Class530(Class467 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      int var1 = this.Field1.Field4 / this.Field1.Field5 * 3 + this.Field1.Field4 % this.Field1.Field5;
      Class537 var2 = null;
      if (this.Field1.Field4 % this.Field1.Field5 < 3) {
         if (var1 < Class359.Field125.size()) {
            var2 = (Class537)Class359.Field125.elementAt(var1);
            if (Class467.Field22[Class467.Field21] == 22) {
               Class105.Field19.Field28.Field4(var2.Field9);
               return;
            }

            if (Class467.Field22[Class467.Field21] == 23) {
               if (var2.Field26) {
                  Class105.Field1("Vật phẩm đang được bán.");
                  return;
               }

               this.Field1.Field1((Class537)var2, (short)-1);
               return;
            }
         } else if (var1 < Class359.Field125.size() + Class585.Field37.size() && Class467.Field22[Class467.Field21] == 23) {
            Class274 var3 = (Class274)Class585.Field37.elementAt(var1 - Class359.Field125.size());
            this.Field1.Field1((Class537)null, (short)var3.Field2);
            return;
         }
      } else {
         this.Field1.Field19();
         if (Class467.Field22[Class467.Field21] == 22 && var1 - 3 < Class359.Field128.size()) {
            var2 = (Class537)Class359.Field128.elementAt(var1 - 3);
            Class105.Field19.Field28.Field5(var2.Field9);
            return;
         }

         if (Class467.Field22[Class467.Field21] == 23 && var1 - 3 < this.Field1.Field26.size()) {
            Class231 var4 = null;
            if (this.Field1.Field26.elementAt(var1 - 3) instanceof Class537) {
               var2 = (Class537)this.Field1.Field26.elementAt(var1 - 3);
            } else {
               var4 = (Class231)this.Field1.Field26.elementAt(var1 - 3);
            }

            this.Field1.Field1(var2, var4 != null ? var4.Field1 : -1, 0, false);
         }
      }

   }
}
