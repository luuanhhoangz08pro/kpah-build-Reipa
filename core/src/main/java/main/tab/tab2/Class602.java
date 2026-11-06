package main.tab.tab2;
final class Class602 implements Class256 {
   private Class464 Field1;
   private final boolean Field2;
   private final Class272 Field3;

   Class602(Class464 var1, boolean var2, Class272 var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      if (this.Field2) {
         Class464.Field1(this.Field1, this.Field3);
      } else {
         int var1 = 0;
         int var2 = this.Field1.Field29.size();

         int var5;
         for(int var3 = 0; var3 < var2; ++var3) {
            Class381 var4 = (Class381)this.Field1.Field29.elementAt(var3);
            if (this.Field3.Field1 - var4.Field2 >= 0 && this.Field3.Field1 - var4.Field2 <= 5) {
               var5 = this.Field1.Field28.size();

               for(int var6 = 0; var6 < var5; ++var6) {
                  Class272 var7;
                  if ((var7 = (Class272)this.Field1.Field28.elementAt(var6)).Field1 - var4.Field2 >= 0 && var7.Field1 - var4.Field2 <= 5) {
                     var1 += var7.Field3;
                  }
               }

               if (var1 >= var4.Field3) {
                  Class106.Field1("Đã đủ số lượng.");
                  return;
               }
            }
         }

         boolean var8 = false;
         int var9 = this.Field1.Field28.size();

         for(var5 = 0; var5 < var9; ++var5) {
            Class272 var11;
            if ((var11 = (Class272)this.Field1.Field28.elementAt(var5)).Field1 == this.Field3.Field1) {
               ++var11.Field3;
               var8 = true;
               break;
            }
         }

         if (!var8) {
            Class272 var10 = new Class272(this.Field3.Field1);
            Class272.Field1(this.Field3, var10);
            var10.Field3 = 1;
            this.Field1.Field28.addElement(var10);
         }

         --this.Field3.Field3;
         if (this.Field3.Field3 <= 0) {
            this.Field1.Field27.removeElement(this.Field3);
         }
      }

      Class464.Field4(this.Field1);
   }
}
