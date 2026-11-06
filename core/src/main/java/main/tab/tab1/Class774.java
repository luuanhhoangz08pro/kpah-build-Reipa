package main.tab.tab1;
final class Class774 implements Class258 {
   private Class326 Field1;
   private final Class274 Field2;

   Class774(Class326 var1, Class274 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field20.size() < 6) {
         if (this.Field1.Field1(false) >= 0) {
            Class105.Field1("Nguyên liệu đã đủ số lượng.");
            return;
         }

         --this.Field2.Field3;
         if (this.Field2.Field3 <= 0) {
            this.Field1.Field19.removeElement(this.Field2);
         }

         Class274 var1;
         (var1 = new Class274(this.Field2.Field2)).Field1 = this.Field2.Field1;
         this.Field1.Field20.addElement(var1);
      }

      boolean var5 = false;
      int var2 = this.Field1.Field20.size();

      int var3;
      Class274 var4;
      for(var3 = 0; var3 < var2; ++var3) {
         if ((var4 = (Class274)this.Field1.Field20.elementAt(var3)).Field1 == this.Field2.Field1) {
            ++var4.Field3;
            var5 = true;
            break;
         }
      }

      for(var3 = 0; var3 < var2; ++var3) {
         if ((var4 = (Class274)this.Field1.Field20.elementAt(var3)).Field3 == 0) {
            this.Field1.Field20.removeElement(var4);
         }
      }

      if (!var5) {
         Class274 var6 = new Class274(this.Field2.Field1);
         Class274.Field1(this.Field2, var6);
         var6.Field3 = 1;
         this.Field1.Field20.addElement(var6);
      }

   }
}
