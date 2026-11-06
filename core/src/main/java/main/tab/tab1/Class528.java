package main.tab.tab1;
import java.util.Vector;

final class Class528 implements Class258 {
   private Class467 Field1;

   Class528(Class467 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      int var1 = this.Field1.Field4 / this.Field1.Field5 * 3 + this.Field1.Field4 % this.Field1.Field5;
      Class537 var2 = null;
      if (this.Field1.Field4 % this.Field1.Field5 < 3) {
         if (var1 < Class359.Field125.size()) {
            if ((var2 = (Class537)Class359.Field125.elementAt(var1)) != null) {
               Class467.Field1(this.Field1, var2, this.Field1.Field15, this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class467.Field17);
               return;
            }
         } else if (var1 < Class359.Field125.size() + Class585.Field37.size()) {
            Class274 var3 = (Class274)Class585.Field37.elementAt(var1 - Class359.Field125.size());
            this.Field1.Field1(var3.Field1, this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class467.Field17);
            return;
         }
      } else {
         var2 = null;
         Vector var4;
         if (Class467.Field22[Class467.Field21] == 22) {
            var4 = Class359.Field128;
         } else {
            var4 = this.Field1.Field26;
         }

         if (var1 - 3 < var4.size()) {
            if (var4.elementAt(var1 - 3) instanceof Class537) {
               var2 = (Class537)var4.elementAt(var1 - 3);
               Class467.Field1(this.Field1, var2, this.Field1.Field15, this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class467.Field17);
               return;
            }

            this.Field1.Field1((Class231)var4.elementAt(var1 - 3), this.Field1.Field4 % this.Field1.Field5 * this.Field1.Field7, this.Field1.Field4 / this.Field1.Field5 * this.Field1.Field8 - Class467.Field17);
         }
      }

   }
}
