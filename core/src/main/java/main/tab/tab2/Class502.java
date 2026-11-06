package main.tab.tab2;
final class Class502 implements Class256 {
   private Class464 Field1;
   private final Class272 Field2;

   Class502(Class464 var1, Class272 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      --this.Field2.Field3;
      if (this.Field2.Field3 <= 0) {
         this.Field1.Field28.removeElement(this.Field2);
      }

      boolean var1 = false;
      int var2 = this.Field1.Field27.size();

      for(int var3 = 0; var3 < var2; ++var3) {
         Class272 var4;
         if ((var4 = (Class272)this.Field1.Field27.elementAt(var3)).Field1 == this.Field2.Field1) {
            ++var4.Field3;
            var1 = true;
            break;
         }
      }

      if (!var1) {
         (new Class272(this.Field2.Field1)).Field3 = 1;
         this.Field1.Field27.addElement(this.Field2);
      }

      this.Field1.Field3(-1);
   }
}
