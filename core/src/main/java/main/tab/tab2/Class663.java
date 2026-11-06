package main.tab.tab2;
import java.util.Vector;

final class Class663 implements Class256 {
   private Class324 Field1;

   Class663(Class324 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      int var1 = this.Field1.Field3 / this.Field1.Field4 * 3 + this.Field1.Field3 % this.Field1.Field4;
      Class534 var2 = null;
      if (this.Field1.Field3 % this.Field1.Field4 < 3) {
         if (var1 < this.Field1.Field23.size()) {
            if ((var2 = (Class534)this.Field1.Field23.elementAt(var1)) != null) {
               Class324.Field1(this.Field1, var2, this.Field1.Field10, this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class324.Field12);
               return;
            }
         } else if (var1 < this.Field1.Field23.size() + Class582.Field37.size()) {
            Class272 var3 = (Class272)Class582.Field37.elementAt(var1 - this.Field1.Field23.size());
            this.Field1.Field1(var3.Field1, this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class324.Field12);
            return;
         }
      } else {
         var2 = null;
         Vector var4;
         if (Class324.Field17[Class324.Field16] == 22) {
            var4 = Class357.Field128;
         } else {
            var4 = this.Field1.Field18;
         }

         if (var1 - 3 < var4.size()) {
            if (var4.elementAt(var1 - 3) instanceof Class534) {
               var2 = (Class534)var4.elementAt(var1 - 3);
               Class324.Field1(this.Field1, var2, this.Field1.Field10, this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class324.Field12);
               return;
            }

            this.Field1.Field1((Class230)var4.elementAt(var1 - 3), this.Field1.Field3 % this.Field1.Field4 * this.Field1.Field5, this.Field1.Field3 / this.Field1.Field4 * this.Field1.Field6 - Class324.Field12);
         }
      }

   }
}
