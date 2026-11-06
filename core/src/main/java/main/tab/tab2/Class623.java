package main.tab.tab2;
final class Class623 implements Class256 {
   private Class324 Field1;
   private final boolean Field2;

   Class623(Class324 var1, boolean var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      if (Class357.Field97[this.Field1.Field3] > 0) {
         Class106.Field21.Field1 = false;
         byte var1 = Class599.Field3[Class106.Field19.Field15.Field93][this.Field1.Field3 - 4];
         int var2;
         if ((var2 = Class599.Field2(this.Field1.Field3, Class357.Field97[this.Field1.Field3 - 4])) > Class106.Field19.Field15.Field130) {
            if (!this.Field1.Field29) {
               Class106.Field19.Field1(new Class375("", "Không đủ MP"));
               this.Field1.Field29 = true;
            }

         } else {
            this.Field1.Field29 = false;
            Class582 var10000;
            if (Class106.Field19.Field16 != null && Class106.Field19.Field16.Field188 == 0) {
               if (this.Field1.Field3 == 6) {
                  Class261.Field1().Field1((short)Class106.Field19.Field16.Field189, (byte)0, (byte)((byte)var1), (short)0);
                  var10000 = Class106.Field19.Field15;
                  var10000.Field130 -= var2;
               } else {
                  var10000 = Class106.Field19.Field15;
                  var10000.Field130 -= var2;
                  if (this.Field2 && (Class106.Field19.Field45 == -1 || Class106.Field19.Field45 == this.Field1.Field3)) {
                     Class106.Field19.Field45 = this.Field1.Field3;
                  }

                  this.Field1.Field1(Class106.Field19.Field15, Class106.Field19.Field16, var1, Class599.Field4[Class106.Field19.Field15.Field93][this.Field1.Field3 - 4] == 1);
               }
            } else if (this.Field1.Field3 == 6) {
               Class106.Field1("Chỉ có thể hồi sinh cho người đã hết HP.");
            } else {
               var10000 = Class106.Field19.Field15;
               var10000.Field130 -= var2;
               if (this.Field2 && (Class106.Field19.Field45 == -1 || Class106.Field19.Field45 == this.Field1.Field3)) {
                  Class106.Field19.Field45 = this.Field1.Field3;
               }

               Class261.Field1().Field1((short)Class106.Field19.Field15.Field189, (byte)0, (byte)((byte)var1), (short)0);
            }
         }
      } else {
         Class106.Field1("Chưa học kỹ năng này");
      }
   }
}
