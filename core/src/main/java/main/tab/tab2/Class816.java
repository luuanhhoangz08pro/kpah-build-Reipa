package main.tab.tab2;
final class Class816 implements Class256 {
   private Class324 Field1;
   private final Object Field2;
   private final int Field3;
   private final int Field4;

   Class816(Class324 var1, Object var2, int var3, int var4) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
   }

   public final void Field1() {
      if (this.Field2 instanceof Class534) {
         Class324.Field1(this.Field1, (Class534)this.Field2, this.Field1.Field10, this.Field3, this.Field4);
      } else {
         int var1 = Class582.Field42.length;

         for(int var2 = 0; var2 < var1; ++var2) {
            if (Class582.Field42[var2].Field5 == ((Class647)this.Field2).Field5) {
               Class324.Field1(this.Field1, Class324.Field2(this.Field1, var2), this.Field3, this.Field4);
               return;
            }
         }

      }
   }
}
