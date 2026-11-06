package main.tab.tab1;
final class Class772 implements Class258 {
   private Class326 Field1;
   private final Class274 Field2;

   Class772(Class326 var1, Class274 var2) {
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
         Class274 var4;
         if ((var4 = (Class274)this.Field1.Field19.elementAt(var3)).Field1 == this.Field2.Field1) {
            ++var4.Field3;
            var1 = true;
            break;
         }
      }

      if (!var1) {
         (new Class274(this.Field2.Field1)).Field3 = 1;
         this.Field1.Field19.addElement(this.Field2);
      }

      this.Field1.Field2(-1);
   }
}
