package main.tab.tab2;
import java.util.Vector;

final class Class525 implements Class256 {
   private Class464 Field1;

   Class525(Class464 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      int var1 = this.Field1.Field4 / this.Field1.Field5 * 3 + this.Field1.Field4 % this.Field1.Field5;
      Class534 var2 = null;
      if (this.Field1.Field4 % this.Field1.Field5 < 3) {
         if (var1 < Class357.Field125.size()) {
            if ((var2 = (Class534)Class357.Field125.elementAt(var1)) != null) {
               Class464.Field1(this.Field1, var2, this.Field1.Field15, this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class464.Field17);
               return;
            }
         } else if (var1 < Class357.Field125.size() + Class582.Field37.size()) {
            Class272 var3 = (Class272)Class582.Field37.elementAt(var1 - Class357.Field125.size());
            this.Field1.Field1(var3.Field1, this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class464.Field17);
            return;
         }
      } else {
         var2 = null;
         Vector var4;
         if (Class464.Field22[Class464.Field21] == 22) {
            var4 = Class357.Field128;
         } else {
            var4 = this.Field1.Field26;
         }

         if (var1 - 3 < var4.size()) {
            if (var4.elementAt(var1 - 3) instanceof Class534) {
               var2 = (Class534)var4.elementAt(var1 - 3);
               Class464.Field1(this.Field1, var2, this.Field1.Field15, this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class464.Field17);
               return;
            }

            this.Field1.Field1((Class230)var4.elementAt(var1 - 3), this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class464.Field17);
         }
      }

   }
}
