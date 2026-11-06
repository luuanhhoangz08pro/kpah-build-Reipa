package main.tab.tab1;
public final class Class256 extends Class435 {
   private static byte[] Field6 = new byte[]{0, 20, 20, 0, 0, 20, 20, 20, 20, 20, 20, 20, 20};
   private static byte[] Field7 = new byte[]{0, 0, 0, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20};
   private static short[][][] Field8 = new short[][][]{{{90, 315, 225}, {90, 315, 225}, {90, 315, 225}, {90, 315, 225, 270}, {90, 315, 225, 270}, {90, 315, 225, 270, 45}, {90, 315, 225, 270, 45, 135}, {90, 315, 225, 270, 45, 135, 180}, {90, 315, 225, 270, 45, 135, 0}, {90, 315, 225, 270, 45, 135, 0}, {90, 315, 225, 270, 45, 135, 0}}, {{270, 135, 45}, {270, 135, 45}, {270, 135, 45}, {270, 135, 45, 90}, {270, 135, 45, 90}, {270, 135, 45, 90, 315}, {270, 135, 45, 90, 315, 235}, {270, 135, 45, 90, 315, 235, 180}, {270, 135, 45, 90, 315, 235, 0}, {90, 315, 225, 270, 45, 135, 0}, {90, 315, 225, 270, 45, 135, 0}}, {{180, 45, 315}, {180, 45, 315}, {180, 45, 315}, {180, 45, 315, 0}, {180, 45, 315, 0}, {180, 45, 315, 0, 135}, {180, 45, 315, 0, 135, 225}, {180, 45, 315, 0, 135, 225, 270}, {180, 45, 315, 0, 135, 225, 270, 90}, {90, 315, 225, 270, 45, 135, 0}, {90, 315, 225, 270, 45, 135, 0}}, {{0, 135, 225}, {0, 135, 225}, {0, 135, 225}, {0, 135, 225, 180}, {0, 135, 225, 180}, {0, 135, 225, 180, 45}, {0, 135, 225, 180, 45, 90}, {0, 135, 225, 180, 45, 90, 270}, {0, 135, 225, 180, 45, 90, 270, 315}, {90, 315, 225, 270, 45, 135, 0}, {90, 315, 225, 270, 45, 135, 0}}};
   private int Field9;
   private int Field10 = 0;
   private byte Field11 = 1;
   private int Field12 = 0;

   public Class256(int var1) {
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

      try {
         if (var1.Field204 != 0) {
            if (var1.Field73 == 16) {
               this.Field12 = 0;
            }

            if (var1.Field73 == 16) {
               var1.Field204 = 0;
               var1.Field73 = 0;
               var1.Field76 = 0;
            } else if (var1.Field73 >= 14 && var1.Field73 < 16) {
               var1.Field23 = 5;
               var1.Field76 = 7;
            } else if (var1.Field73 != 13 && var1.Field73 != 12) {
               if (var1.Field73 != 11 && var1.Field73 != 10) {
                  if (var1.Field73 % 2 == 0) {
                     Class74.Field1(var1.Field193 + Class435.Field2[var1.Field12], var1.Field194 + Class435.Field3[var1.Field12], 3);
                     if (this.Field10 == 1) {
                        Class74.Field1(var1.Field193, var1.Field194 - 15, 24);
                     }
                  }

                  var1.Field23 = 4;
                  var1.Field76 = 4;
               } else {
                  var1.Field23 = 4;
                  var1.Field76 = 5;
               }
            } else {
               var1.Field23 = 5;
               var1.Field76 = 6;
            }

            if (var1.Field73 == 9 && this.Field9 > 0) {
               if (this.Field10 == 0) {
                  for(int var2 = 0; var2 < Field8[var1.Field12][this.Field9 - 1].length; ++var2) {
                     Class63.Field1(1, var1, var1.Field67, var1.Field193 + Class435.Field2[var1.Field12] + Field6[var2], var1.Field194 + Class435.Field3[var1.Field12] + Field7[var2], var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, Field8[var1.Field12][this.Field9 - 1][var2]);
                  }
               } else if (this.Field10 == 1) {
                  if (this.Field12 <= (this.Field9 - 1) / 2) {
                     Class63.Field2(7, var1, var1.Field67, var1.Field193 + Class435.Field2[var1.Field12], var1.Field194 - 25, var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, 7);
                     Class63.Field2(7, var1, var1.Field67, var1.Field193 + Class435.Field2[var1.Field12] + 10, var1.Field194 - 15, var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, 7);
                     Class63.Field2(8, var1, var1.Field67, var1.Field193 + Class435.Field2[var1.Field12] - 10, var1.Field194 - 55, var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, 7);
                     Class63.Field2(1, var1, var1.Field67, var1.Field193 + Class435.Field2[var1.Field12] + 20, var1.Field194 - 35, var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, 7);
                     Class63.Field2(1, var1, var1.Field67, var1.Field193 + Class435.Field2[var1.Field12] - 20, var1.Field194 - 45, var1.Field90 != 2000000 ? var1.Field90 / this.Field11 : var1.Field90, var1.Field131, 7);
                  }

                  ++this.Field12;
                  if (this.Field12 < this.Field11) {
                     var1.Field73 = 7;
                  }
               }
            }

            ++var1.Field73;
         }
      } catch (Exception var3) {
      }
   }

   public final void Field1(Class123 var1) {
   }
}
