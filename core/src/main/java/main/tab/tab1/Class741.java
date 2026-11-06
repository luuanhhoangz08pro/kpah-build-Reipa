package main.tab.tab1;
public final class Class741 extends Class435 {
   private static byte[] Field7 = new byte[]{0, 20, 20, 0, 0, 20, 20, 20, 20};
   private static byte[] Field8 = new byte[]{0, 0, 0, 20, 20, 20, 20, 20, 20};
   private int Field9;
   private int Field10 = 0;
   private byte Field11 = 1;
   private byte Field12;
   public static short[][] Field6 = new short[][]{{90, 315, 225, 270, 315, 225, 90, 315, 225, 315, 225, 225}, {270, 135, 45, 90, 135, 45, 270, 135, 45, 135, 45, 45}, {180, 45, 315, 180, 45, 315, 180, 45, 315, 45, 315, 315}, {0, 135, 225, 0, 135, 225, 0, 135, 225, 135, 225, 225}};

   public Class741(int var1) {
   }

   public final void Field1(int var1) {
      this.Field9 = var1;
   }

   public final int Field1() {
      this.Field11 = (byte)Class435.Field1[this.Field9];
      return Class435.Field1[this.Field9];
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         if (var1.Field73 == 16) {
            this.Field12 = 0;
         }

         Class435.Field3(var1);
         if (var1.Field73 == 9) {
            try {
               if (this.Field10 == 0) {
                  Class63.Field1(4, var1, var1.Field67, var1.Field193 + Class435.Field4[var1.Field12] + Field7[this.Field12], var1.Field194 + Class435.Field5[var1.Field12] + Field8[this.Field12], var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, Field6[var1.Field12][this.Field12]);
                  ++this.Field12;
                  if (this.Field12 < this.Field11) {
                     var1.Field73 = 8;
                  }
               } else {
                  Class369 var2 = new Class369(var1.Field193, var1.Field194 + 30, var1.Field67, 2, true);
                  if (this.Field9 > 0 && this.Field9 < 7) {
                     var2.Field15 = false;
                  } else {
                     var2.Field15 = true;
                  }

                  if (var1.Field90 != 0 && var1.Field90 != 2000000) {
                     var2.Field1[0] = "-" + var1.Field90;
                  }

                  if (var1.Field131 != 0 && var1.Field131 < Class787.Field4.length) {
                     var2.Field1[1] = Class787.Field4[var1.Field131];
                  }

                  Class74.Field2.addElement(var2);
               }
            } catch (Exception var3) {
            }
         }

         ++var1.Field73;
      }
   }

   public final void Field1(Class123 var1) {
   }
}
