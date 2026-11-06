package main.tab.tab1;
final class Class238 implements Class258 {
   final Class243 Field1;

   Class238(Class243 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field1.Field6 == 5 && this.Field1.Field1.Field8) {
         Class105.Field1("Không thể chọn trong quá trình luyện");
      } else if (this.Field1.Field1.Field6 == 6 && this.Field1.Field1.Field10) {
         Class105.Field1("Không thể chọn trong quá trình luyện");
      } else {
         if (this.Field1.Field1.Field6 == 6 && Class566.Field28.size() > 0) {
            if (this.Field1.Field1.Field27 == 1) {
               this.Field1.Field1.Field19 = (Class537)Class566.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class566.Field1(this.Field1.Field1, this.Field1.Field1.Field19)) {
                  Class105.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field19 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 2 && Class566.Field23 != null) {
               this.Field1.Field1.Field17[1] = true;
            }

            if (this.Field1.Field1.Field27 == 3) {
               this.Field1.Field1.Field20 = (Class537)Class566.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class566.Field1(this.Field1.Field1, this.Field1.Field1.Field20)) {
                  Class105.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field20 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 4) {
               this.Field1.Field1.Field21 = (Class537)Class566.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class566.Field1(this.Field1.Field1, this.Field1.Field1.Field21)) {
                  Class105.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field21 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 5) {
               Class566.Field18 = (Class537)Class566.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class566.Field1(this.Field1.Field1, Class566.Field18)) {
                  Class105.Field1("Item Da duoc chon");
                  Class566.Field18 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 6) {
               this.Field1.Field1.Field22 = (Class537)Class566.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class566.Field1(this.Field1.Field1, this.Field1.Field1.Field22)) {
                  Class105.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field22 = null;
               }
            }
         }

         if (this.Field1.Field1.Field6 == 5) {
            if (this.Field1.Field1.Field7) {
               this.Field1.Field1.Field7 = false;
            }

            if (this.Field1.Field1.Field11 <= 0) {
               this.Field1.Field1.Field11 = this.Field1.Field1.Field13;
            }

            if (this.Field1.Field1.Field12 > 0) {
               this.Field1.Field1.Field12 = 0;
            }
         }

         if (Class105.Field37) {
            this.Field1.Field1.Field26 = 5;
         }

         if (this.Field1.Field1.Field25 == 1 && this.Field1.Field1.Field6 != 6 && Class566.Field28.size() > 0 && this.Field1.Field1.Field2 != -1 && this.Field1.Field1.Field2 <= Class566.Field28.size() - 1 && !this.Field1.Field1.Field10) {
            if (this.Field1.Field1.Field6 == 1 && !Class566.Field29) {
               Class105.Field1("Không thể chọn khi đang trong quá trình luyện tự động.", new Class240(this));
               return;
            }

            Class566.Field18 = (Class537)Class566.Field28.elementAt(this.Field1.Field1.Field2);
         }

      }
   }
}
