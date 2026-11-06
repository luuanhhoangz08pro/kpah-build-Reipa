package main.tab.tab2;
final class Class781 implements Class256 {
   private Class324 Field1;
   private final Class272 Field2;

   Class781(Class324 var1, Class272 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field1.Field20.size() < 6) {
         if (this.Field1.Field1(false) >= 0) {
            Class106.Field1("Nguyên liệu đã đủ số lượng.");
            return;
         }

         --this.Field2.Field3;
         if (this.Field2.Field3 <= 0) {
            this.Field1.Field19.removeElement(this.Field2);
         }

         Class272 var1;
         (var1 = new Class272(this.Field2.Field2)).Field1 = this.Field2.Field1;
         this.Field1.Field20.addElement(var1);
      }

      boolean var5 = false;
      int var2 = this.Field1.Field20.size();

      int var3;
      Class272 var4;
      for(var3 = 0; var3 < var2; ++var3) {
         if ((var4 = (Class272)this.Field1.Field20.elementAt(var3)).Field1 == this.Field2.Field1) {
            ++var4.Field3;
            var5 = true;
            break;
         }
      }

      for(var3 = 0; var3 < var2; ++var3) {
         if ((var4 = (Class272)this.Field1.Field20.elementAt(var3)).Field3 == 0) {
            this.Field1.Field20.removeElement(var4);
         }
      }

      if (!var5) {
         Class272 var6 = new Class272(this.Field2.Field1);
         Class272.Field1(this.Field2, var6);
         var6.Field3 = 1;
         this.Field1.Field20.addElement(var6);
      }

   }
}
