package main.tab.tab2;
final class Class508 implements Class256 {
   private Class464 Field1;
   private final Class534 Field2;

   Class508(Class464 var1, Class534 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field2.Field25 >= 30 && this.Field2.Field25 <= Class464.Field33 + 5 && this.Field2.Field25 >= Class464.Field33 - 5 && this.Field2.Field37 == Class464.Field32) {
         if (Class464.Field10(this.Field1)[2] == null) {
            if (Class464.Field35 == this.Field2.Field17) {
               Class464.Field10(this.Field1)[2] = this.Field2;
               this.Field1.Field30.removeElement(this.Field2);
            }
         } else {
            for(int var1 = 0; var1 < Class464.Field10(this.Field1).length; ++var1) {
               if (Class464.Field10(this.Field1)[var1] == null) {
                  Class464.Field10(this.Field1)[var1] = this.Field2;
                  this.Field1.Field30.removeElement(this.Field2);
                  break;
               }
            }
         }
      } else {
         Class106.Field1("Đồ ép phải cùng màu và chênh lệch +-5 level.");
      }

      this.Field1.Field3(1);
   }
}
