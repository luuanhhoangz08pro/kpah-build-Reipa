package main.tab.tab1;
public final class Class119 extends Class435 {
   private int Field6;
   private int Field7 = 0;
   private byte Field8 = 1;
   private int Field9 = 0;

   public Class119(int var1) {
   }

   public final void Field1(int var1) {
      this.Field6 = var1;
   }

   public final int Field1() {
      this.Field8 = (byte)Class435.Field1[this.Field6];
      return Class435.Field1[this.Field6];
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         if (var1.Field73 == 15) {
            this.Field9 = 0;
         }

         Class435.Field2(var1);
         if (var1.Field73 == 10) {
            if (this.Field7 == 0) {
               Class63.Field2(0, var1, var1.Field67, var1.Field193, var1.Field194 - 15, var1.Field90 != 2000000 ? var1.Field90 / this.Field8 : var1.Field90, var1.Field131, 2);
               ++this.Field9;
               if (this.Field9 < this.Field8) {
                  var1.Field73 = 7;
               }
            } else {
               boolean var2 = false;
               byte var3;
               if (var1.Field12 == 3) {
                  var3 = 10;
               } else {
                  var3 = -10;
               }

               Class105.Field19.Field1(var1, var1.Field67, var3, -22, var1.Field12, var1.Field90 != 2000000 ? var1.Field90 / this.Field8 : var1.Field90, 1);
               Class74.Field1(var1.Field67.Field193, var1.Field67.Field194 - 15, 32);
               Class74.Field1(var1.Field67.Field193, var1.Field67.Field194 - 10, 9);
            }
         }

         ++var1.Field73;
      }
   }

   public final void Field1(Class123 var1) {
   }
}
