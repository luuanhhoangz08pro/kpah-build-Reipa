package main.tab.tab1;
final class Class505 implements Class258 {
   private Class467 Field1;
   private final Class274 Field2;

   Class505(Class467 var1, Class274 var2) {
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
         Class274 var4;
         if ((var4 = (Class274)this.Field1.Field27.elementAt(var3)).Field1 == this.Field2.Field1) {
            ++var4.Field3;
            var1 = true;
            break;
         }
      }

      if (!var1) {
         (new Class274(this.Field2.Field1)).Field3 = 1;
         this.Field1.Field27.addElement(this.Field2);
      }

      this.Field1.Field3(-1);
   }
}
