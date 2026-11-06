package main.tab.tab1;
final class Class669 implements Class258 {
   final Class326 Field1;
   private final int Field2;

   Class669(Class326 var1, int var2) {
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

         Class798 var7 = Class804.Field2((int)var1.Field18);
         var5 = null;
         String var8 = "Bạn có muốn cho thú cưng ăn vật phẩm này không?";
         Class105.Field2("Bạn có muốn cho thú cưng ăn vật phẩm này không?", new Class765(this, var7, var1));
      }
   }
}
