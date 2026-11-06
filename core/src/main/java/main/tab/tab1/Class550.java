package main.tab.tab1;
final class Class550 implements Class258 {
   final Class552 Field1;

   Class550(Class552 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class105.Field37) {
         this.Field1.Field1.Field21 = 5;
      }

      if (this.Field1.Field1.Field20 == 1) {
         if (this.Field1.Field1.Field3 != -1 && this.Field1.Field1.Field3 <= Class354.Field22.size() - 1) {
            if (this.Field1.Field1.Field9 == 1 && !Class354.Field26) {
               Class105.Field1("Không thể chọn khi đang trong quá trình luyện tự động.", new Class549(this));
               return;
            }

            Class354.Field13 = (Class537)Class354.Field22.elementAt(this.Field1.Field1.Field3);
            Class61.Field3 = Class354.Field13;
            return;
         }
      } else if (this.Field1.Field1.Field20 == 0 && Class354.Field1.size() > 0) {
         if (this.Field1.Field1.Field9 == 0 || this.Field1.Field1.Field9 == 2 || this.Field1.Field1.Field9 == 3) {
            Class354.Field14 = (Class274)Class354.Field1.elementAt(this.Field1.Field1.Field4);
            Class61.Field6 = Class354.Field14;
            return;
         }

         Class274 var2;
         if (this.Field1.Field1.Field9 == 4) {
            Class743 var1;
            if (Class354.Field5((var1 = Class804.Field1((var2 = (Class274)Class354.Field1.elementAt(this.Field1.Field1.Field4)).Field1)).Field8)) {
               Class354.Field14 = var2;
               Class61.Field6 = Class354.Field14;
               return;
            }

            if (Class354.Field6(var1.Field8)) {
               Class354.Field15 = var2;
               Class61.Field7 = Class354.Field15;
               return;
            }
         } else {
            if (!Class354.Field26) {
               Class105.Field1("Không thể chọn khi đang trong quá trình luyện tự động.", new Class548(this));
               return;
            }

            if (Class354.Field3((var2 = (Class274)Class354.Field1.elementAt(this.Field1.Field1.Field4)).Field1)) {
               Class354.Field16 = var2;
               return;
            }

            if (Class354.Field2(var2.Field1)) {
               Class354.Field15 = var2;
               return;
            }

            if (Class354.Field4(var2.Field1)) {
               Class354.Field14 = var2;
            }
         }
      }

   }
}
