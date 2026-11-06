package main.tab.tab2;
final class Class527 implements Class256 {
   private Class464 Field1;

   Class527(Class464 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      int var1 = this.Field1.Field4 / this.Field1.Field5 * 3 + this.Field1.Field4 % this.Field1.Field5;
      Class534 var2 = null;
      if (this.Field1.Field4 % this.Field1.Field5 < 3) {
         if (var1 < Class357.Field125.size()) {
            var2 = (Class534)Class357.Field125.elementAt(var1);
            if (Class464.Field22[Class464.Field21] == 22) {
               Class106.Field19.Field28.Field4(var2.Field9);
               return;
            }

            if (Class464.Field22[Class464.Field21] == 23) {
               if (var2.Field26) {
                  Class106.Field1("Vật phẩm đang được bán.");
                  return;
               }

               this.Field1.Field1((Class534)var2, (short)-1);
               return;
            }
         } else if (var1 < Class357.Field125.size() + Class582.Field37.size() && Class464.Field22[Class464.Field21] == 23) {
            Class272 var3 = (Class272)Class582.Field37.elementAt(var1 - Class357.Field125.size());
            this.Field1.Field1((Class534)null, (short)var3.Field2);
            return;
         }
      } else {
         this.Field1.Field19();
         if (Class464.Field22[Class464.Field21] == 22 && var1 - 3 < Class357.Field128.size()) {
            var2 = (Class534)Class357.Field128.elementAt(var1 - 3);
            Class106.Field19.Field28.Field5(var2.Field9);
            return;
         }

         if (Class464.Field22[Class464.Field21] == 23 && var1 - 3 < this.Field1.Field26.size()) {
            Class230 var4 = null;
            if (this.Field1.Field26.elementAt(var1 - 3) instanceof Class534) {
               var2 = (Class534)this.Field1.Field26.elementAt(var1 - 3);
            } else {
               var4 = (Class230)this.Field1.Field26.elementAt(var1 - 3);
            }

            this.Field1.Field1(var2, var4 != null ? var4.Field1 : -1, 0, false);
         }
      }

   }
}
