package main.tab.tab1;
final class Class619 implements Class258 {
   private Class326 Field1;
   private final boolean Field2;

   Class619(Class326 var1, boolean var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (Class359.Field97[this.Field1.Field3] > 0) {
         Class105.Field21.Field1 = false;
         byte var1 = Class602.Field3[Class105.Field19.Field15.Field93][this.Field1.Field3 - 4];
         int var2;
         if ((var2 = Class602.Field2(this.Field1.Field3, Class359.Field97[this.Field1.Field3 - 4])) > Class105.Field19.Field15.Field130) {
            if (!this.Field1.Field29) {
               Class105.Field19.Field1(new Class377("", "Không đủ MP"));
               this.Field1.Field29 = true;
            }

         } else {
            this.Field1.Field29 = false;
            Class585 var10000;
            if (Class105.Field19.Field16 != null && Class105.Field19.Field16.Field188 == 0) {
               if (this.Field1.Field3 == 6) {
                  Class263.Field1().Field1((short)Class105.Field19.Field16.Field189, (byte)0, (byte)((byte)var1), (short)0);
                  var10000 = Class105.Field19.Field15;
                  var10000.Field130 -= var2;
               } else {
                  var10000 = Class105.Field19.Field15;
                  var10000.Field130 -= var2;
                  if (this.Field2 && (Class105.Field19.Field45 == -1 || Class105.Field19.Field45 == this.Field1.Field3)) {
                     Class105.Field19.Field45 = this.Field1.Field3;
                  }

                  this.Field1.Field1(Class105.Field19.Field15, Class105.Field19.Field16, var1, Class602.Field4[Class105.Field19.Field15.Field93][this.Field1.Field3 - 4] == 1);
               }
            } else if (this.Field1.Field3 == 6) {
               Class105.Field1("Chỉ có thể hồi sinh cho người đã hết HP.");
            } else {
               var10000 = Class105.Field19.Field15;
               var10000.Field130 -= var2;
               if (this.Field2 && (Class105.Field19.Field45 == -1 || Class105.Field19.Field45 == this.Field1.Field3)) {
                  Class105.Field19.Field45 = this.Field1.Field3;
               }

               Class263.Field1().Field1((short)Class105.Field19.Field15.Field189, (byte)0, (byte)((byte)var1), (short)0);
            }
         }
      } else {
         Class105.Field1("Chưa học kỹ năng này");
      }
   }
}
