package main.tab.tab2;
final class Class779 implements Class256 {
   private Class324 Field1;
   private final Class272 Field2;

   Class779(Class324 var1, Class272 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      --this.Field2.Field3;
      if (this.Field2.Field3 <= 0) {
         this.Field1.Field20.removeElement(this.Field2);
      }

      boolean var1 = false;
      int var2 = this.Field1.Field19.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         Class272 var4;
         if ((var4 = (Class272)this.Field1.Field19.elementAt(var3)).Field1 == this.Field2.Field1) {
            ++var4.Field3;
            var1 = true;
            break;
         }
      }

      if (!var1) {
         (new Class272(this.Field2.Field1)).Field3 = 1;
         this.Field1.Field19.addElement(this.Field2);
      }

      this.Field1.Field2(-1);
   }
}
