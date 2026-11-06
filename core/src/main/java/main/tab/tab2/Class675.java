package main.tab.tab2;
final class Class675 implements Class256 {
   final Class324 Field1;
   private final int Field2;

   Class675(Class324 var1, int var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      this.Field1.Field14();
      if (!Class324.Field11(this.Field1)) {
         Class534 var1 = null;
         int var2 = 0;
         Class534 var5;
         if (this.Field2 != -1) {
            int var3 = Class106.Field19.Field21.size();

            for(int var4 = 0; var4 < var3; ++var4) {
               if (Class811.Field2((int)(var5 = (Class534)Class106.Field19.Field21.elementAt(var4)).Field18).Field3 == this.Field2) {
                  if (var2 == this.Field1.Field3) {
                     var1 = var5;
                     break;
                  }

                  ++var2;
               }
            }
         } else {
            var1 = (Class534)Class106.Field19.Field21.elementAt(this.Field1.Field3);
         }

         Class805 var7 = Class811.Field2((int)var1.Field18);
         var5 = null;
         String var8 = "Bạn có muốn cho thú cưng ăn vật phẩm này không?";
         Class106.Field2("Bạn có muốn cho thú cưng ăn vật phẩm này không?", new Class772(this, var7, var1));
      }
   }
}
