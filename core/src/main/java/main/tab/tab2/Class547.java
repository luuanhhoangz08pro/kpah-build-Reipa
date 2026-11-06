package main.tab.tab2;
final class Class547 implements Class256 {
   final Class549 Field1;

   Class547(Class549 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class106.Field37) {
         this.Field1.Field1.Field21 = 5;
      }

      if (this.Field1.Field1.Field20 == 1) {
         if (this.Field1.Field1.Field3 != -1 && this.Field1.Field1.Field3 <= Class352.Field22.size() - 1) {
            if (this.Field1.Field1.Field9 == 1 && !Class352.Field26) {
               Class106.Field1("Không thể chọn khi đang trong quá trình luyện tự động.", new Class546(this));
               return;
            }

            Class352.Field13 = (Class534)Class352.Field22.elementAt(this.Field1.Field1.Field3);
            Class60.Field3 = Class352.Field13;
            return;
         }
      } else if (this.Field1.Field1.Field20 == 0 && Class352.Field1.size() > 0) {
         if (this.Field1.Field1.Field9 == 0 || this.Field1.Field1.Field9 == 2 || this.Field1.Field1.Field9 == 3) {
            Class352.Field14 = (Class272)Class352.Field1.elementAt(this.Field1.Field1.Field4);
            Class60.Field6 = Class352.Field14;
            return;
         }

         Class272 var2;
         if (this.Field1.Field1.Field9 == 4) {
            Class750 var1;
            if (Class352.Field5((var1 = Class811.Field1((var2 = (Class272)Class352.Field1.elementAt(this.Field1.Field1.Field4)).Field1)).Field8)) {
               Class352.Field14 = var2;
               Class60.Field6 = Class352.Field14;
               return;
            }

            if (Class352.Field6(var1.Field8)) {
               Class352.Field15 = var2;
               Class60.Field7 = Class352.Field15;
               return;
            }
         } else {
            if (!Class352.Field26) {
               Class106.Field1("Không thể chọn khi đang trong quá trình luyện tự động.", new Class545(this));
               return;
            }

            if (Class352.Field3((var2 = (Class272)Class352.Field1.elementAt(this.Field1.Field1.Field4)).Field1)) {
               Class352.Field16 = var2;
               return;
            }

            if (Class352.Field2(var2.Field1)) {
               Class352.Field15 = var2;
               return;
            }

            if (Class352.Field4(var2.Field1)) {
               Class352.Field14 = var2;
            }
         }
      }

   }
}
