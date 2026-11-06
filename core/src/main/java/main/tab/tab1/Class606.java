package main.tab.tab1;
final class Class606 implements Class258 {
   private Class467 Field1;
   private final boolean Field2;
   private final Class274 Field3;

   Class606(Class467 var1, boolean var2, Class274 var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      if (this.Field2) {
         Class467.Field1(this.Field1, this.Field3);
      } else {
         int var1 = 0;
         int var2 = this.Field1.Field29.size();

         int var5;
         for(int var3 = 0; var3 < var2; ++var3) {
            Class383 var4 = (Class383)this.Field1.Field29.elementAt(var3);
            if (this.Field3.Field1 - var4.Field2 >= 0 && this.Field3.Field1 - var4.Field2 <= 5) {
               var5 = this.Field1.Field28.size();

               for(int var6 = 0; var6 < var5; ++var6) {
                  Class274 var7;
                  if ((var7 = (Class274)this.Field1.Field28.elementAt(var6)).Field1 - var4.Field2 >= 0 && var7.Field1 - var4.Field2 <= 5) {
                     var1 += var7.Field3;
                  }
               }

               if (var1 >= var4.Field3) {
                  Class105.Field1("Đã đủ số lượng.");
                  return;
               }
            }
         }

         boolean var8 = false;
         int var9 = this.Field1.Field28.size();

         for(var5 = 0; var5 < var9; ++var5) {
            Class274 var11;
            if ((var11 = (Class274)this.Field1.Field28.elementAt(var5)).Field1 == this.Field3.Field1) {
               ++var11.Field3;
               var8 = true;
               break;
            }
         }

         if (!var8) {
            Class274 var10 = new Class274(this.Field3.Field1);
            Class274.Field1(this.Field3, var10);
            var10.Field3 = 1;
            this.Field1.Field28.addElement(var10);
         }

         --this.Field3.Field3;
         if (this.Field3.Field3 <= 0) {
            this.Field1.Field27.removeElement(this.Field3);
         }
      }

      Class467.Field4(this.Field1);
   }
}
