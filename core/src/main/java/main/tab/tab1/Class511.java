package main.tab.tab1;
final class Class511 implements Class258 {
   private Class467 Field1;
   private final Class537 Field2;

   Class511(Class467 var1, Class537 var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (this.Field2.Field25 >= 30 && this.Field2.Field25 <= Class467.Field33 + 5 && this.Field2.Field25 >= Class467.Field33 - 5 && this.Field2.Field37 == Class467.Field32) {
         if (Class467.Field10(this.Field1)[2] == null) {
            if (Class467.Field35 == this.Field2.Field17) {
               Class467.Field10(this.Field1)[2] = this.Field2;
               this.Field1.Field30.removeElement(this.Field2);
            }
         } else {
            for(int var1 = 0; var1 < Class467.Field10(this.Field1).length; ++var1) {
               if (Class467.Field10(this.Field1)[var1] == null) {
                  Class467.Field10(this.Field1)[var1] = this.Field2;
                  this.Field1.Field30.removeElement(this.Field2);
                  break;
               }
            }
         }
      } else {
         Class105.Field1("Đồ ép phải cùng màu và chênh lệch +-5 level.");
      }

      this.Field1.Field3(1);
   }
}
