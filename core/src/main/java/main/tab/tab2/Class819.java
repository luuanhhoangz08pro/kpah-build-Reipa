package main.tab.tab2;
final class Class819 implements Class256 {
   private Class324 Field1;
   private final Class534 Field2;

   Class819(Class324 var1, Class534 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field2.Field25 >= 30 && this.Field2.Field25 <= 5 && this.Field2.Field25 >= -5 && this.Field2.Field37 == 0) {
         if (Class324.Field10(this.Field1)[2] == null) {
            if (0 == this.Field2.Field17) {
               Class324.Field10(this.Field1)[2] = this.Field2;
               this.Field1.Field21.removeElement(this.Field2);
            }
         } else {
            for(int var1 = 0; var1 < Class324.Field10(this.Field1).length; ++var1) {
               if (Class324.Field10(this.Field1)[var1] == null) {
                  Class324.Field10(this.Field1)[var1] = this.Field2;
                  this.Field1.Field21.removeElement(this.Field2);
                  break;
               }
            }
         }
      } else {
         Class106.Field1("Đồ ép phải cùng màu và chênh lệch +-5 level.");
      }

      this.Field1.Field2(1);
   }
}
