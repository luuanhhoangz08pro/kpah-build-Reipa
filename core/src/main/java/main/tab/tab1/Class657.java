package main.tab.tab1;
import java.util.Vector;

final class Class657 implements Class258 {
   private Class326 Field1;

   Class657(Class326 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      int var1 = this.Field1.Field3 / this.Field1.Field4 * 3 + this.Field1.Field3 % this.Field1.Field4;
      Class537 var2 = null;
      if (this.Field1.Field3 % this.Field1.Field4 < 3) {
         if (var1 < this.Field1.Field23.size()) {
            if ((var2 = (Class537)this.Field1.Field23.elementAt(var1)) != null) {
               Class326.Field1(this.Field1, var2, this.Field1.Field10, this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class326.Field12);
               return;
            }
         } else if (var1 < this.Field1.Field23.size() + Class585.Field37.size()) {
            Class274 var3 = (Class274)Class585.Field37.elementAt(var1 - this.Field1.Field23.size());
            this.Field1.Field1(var3.Field1, this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class326.Field12);
            return;
         }
      } else {
         var2 = null;
         Vector var4;
         if (Class326.Field17[Class326.Field16] == 22) {
            var4 = Class359.Field128;
         } else {
            var4 = this.Field1.Field18;
         }

         if (var1 - 3 < var4.size()) {
            if (var4.elementAt(var1 - 3) instanceof Class537) {
               var2 = (Class537)var4.elementAt(var1 - 3);
               Class326.Field1(this.Field1, var2, this.Field1.Field10, this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class326.Field12);
               return;
            }

            this.Field1.Field1((Class231)var4.elementAt(var1 - 3), this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class326.Field12);
         }
      }

   }
}
