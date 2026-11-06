package main.tab.tab1;
public final class Class631 extends Class435 {
   private int Field6;
   private int Field7 = 0;
   private byte Field8;
   private byte Field9;
   private byte Field10 = 1;

   public Class631(int var1) {
   }

   public final void Field1(int var1) {
      this.Field6 = var1;
   }

   public final int Field1() {
      this.Field10 = (byte)Class435.Field1[this.Field6];
      return Class435.Field1[this.Field6];
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         if (var1.Field73 == 8) {
            this.Field8 = 0;
            this.Field9 = 0;
         }

         Class435.Field4(var1);
         if (var1.Field73 == 3 && this.Field7 == 0) {
            short[][] var2 = new short[][]{{90, 315, 225, 270, 315, 225, 90, 315, 225, 315, 225}, {270, 135, 45, 90, 135, 45, 270, 135, 45, 135, 45}, {180, 45, 315, 180, 45, 315, 180, 45, 315, 45, 315}, {0, 135, 225, 0, 135, 225, 0, 135, 225, 135, 225}};
            if (var1.Field12 <= Class435.Field4.length - 1 && var1.Field12 <= Class435.Field5.length - 1 && var1.Field12 <= var2.length - 1 && this.Field8 <= var2[var1.Field12].length - 1) {
               Class63.Field1(3, var1, var1.Field67, var1.Field193 + Class435.Field4[var1.Field12], var1.Field194 + Class435.Field5[var1.Field12], var1.Field90 != 2000000 ? var1.Field90 / this.Field10 : var1.Field90, var1.Field131, var2[var1.Field12][this.Field8]);
            }

            ++this.Field8;
            if (this.Field8 < this.Field10) {
               var1.Field73 = 0;
            }
         }

         if (this.Field9 % 2 == 0 && this.Field7 == 1) {
            byte var5 = 1;
            if (this.Field6 < 7 && this.Field6 > 3) {
               var5 = 2;
            } else if (this.Field6 >= 7) {
               var5 = 4;
            }

            for(int var3 = 0; var3 < var5; ++var3) {
               Class316 var4 = new Class316(this, var1.Field67.Field193, var1.Field67.Field194 - 200, var1.Field67);
               if (var1.Field90 != 2000000) {
                  var4.Field1 = var1.Field90 / this.Field10;
               } else {
                  var4.Field1 = var1.Field90;
               }

               Class74.Field2.addElement(var4);
               Class74.Field1(var1.Field193, var1.Field194 - 15, 23);
            }
         }

         ++var1.Field73;
         if (this.Field7 == 1) {
            ++this.Field9;
         }

      }
   }

   public final void Field1(Class123 var1) {
   }
}
