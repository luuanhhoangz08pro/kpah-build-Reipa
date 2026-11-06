package main.tab.tab2;
final class Class237 implements Class256 {
   final Class242 Field1;

   Class237(Class242 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field1.Field6 == 5 && this.Field1.Field1.Field8) {
         Class106.Field1("Không thể chọn trong quá trình luyện");
      } else if (this.Field1.Field1.Field6 == 6 && this.Field1.Field1.Field10) {
         Class106.Field1("Không thể chọn trong quá trình luyện");
      } else {
         if (this.Field1.Field1.Field6 == 6 && Class563.Field28.size() > 0) {
            if (this.Field1.Field1.Field27 == 1) {
               this.Field1.Field1.Field19 = (Class534)Class563.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class563.Field1(this.Field1.Field1, this.Field1.Field1.Field19)) {
                  Class106.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field19 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 2 && Class563.Field23 != null) {
               this.Field1.Field1.Field17[1] = true;
            }

            if (this.Field1.Field1.Field27 == 3) {
               this.Field1.Field1.Field20 = (Class534)Class563.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class563.Field1(this.Field1.Field1, this.Field1.Field1.Field20)) {
                  Class106.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field20 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 4) {
               this.Field1.Field1.Field21 = (Class534)Class563.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class563.Field1(this.Field1.Field1, this.Field1.Field1.Field21)) {
                  Class106.Field1("Item Da duoc chon");
                  this.Field1.Field1.Field21 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 5) {
               Class563.Field18 = (Class534)Class563.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class563.Field1(this.Field1.Field1, Class563.Field18)) {
                  Class106.Field1("Item Da duoc chon");
                  Class563.Field18 = null;
               }
            }

            if (this.Field1.Field1.Field27 == 6) {
               this.Field1.Field1.Field22 = (Class534)Class563.Field28.elementAt(this.Field1.Field1.Field2);
               if (Class563.Field1(this.Field1.Field1, this.Field1.Field1.Field22)) {
                  Class106.Field1("Item Da duoc chon");
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

         if (Class106.Field37) {
            this.Field1.Field1.Field26 = 5;
         }

         if (this.Field1.Field1.Field25 == 1 && this.Field1.Field1.Field6 != 6 && Class563.Field28.size() > 0 && this.Field1.Field1.Field2 != -1 && this.Field1.Field1.Field2 <= Class563.Field28.size() - 1 && !this.Field1.Field1.Field10) {
            if (this.Field1.Field1.Field6 == 1 && !Class563.Field29) {
               Class106.Field1("Không thể chọn khi đang trong quá trình luyện tự động.", new Class239(this));
               return;
            }

            Class563.Field18 = (Class534)Class563.Field28.elementAt(this.Field1.Field1.Field2);
         }

      }
   }
}
