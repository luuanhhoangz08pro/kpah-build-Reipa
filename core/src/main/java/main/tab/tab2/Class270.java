package main.tab.tab2;
public final class Class270 {
   private int Field10;
   private int Field11;
   private int Field12;
   private short Field13;
   public int Field1;
   public int Field2;
   public int Field3 = 0;
   public Class114 Field4;
   int Field5;
   public boolean Field6 = false;
   public int Field7;
   public int Field8;
   private static short[] Field14 = new short[]{1, 60, 8, 1, 1, 16, 60, 18, 60, 1, 1};
   public boolean Field9 = false;

   public final void Field1(int var1) {
      this.Field10 = var1;
      this.Field11 = this.Field13 * Class809.Field2(var1) >> 10;
      this.Field12 = this.Field13 * Class809.Field1(var1) >> 10;
   }

   public final void Field1(int var1, int var2, int var3, int var4, Class114 var5) {
      this.Field1 = var2;
      this.Field2 = var3;
      this.Field4 = var5;
      switch(var4) {
      case 0:
         this.Field10 = 90;
         break;
      case 1:
         this.Field10 = 270;
         break;
      case 2:
         this.Field10 = 180;
         break;
      case 3:
         this.Field10 = 0;
      }

      if (var1 == 20) {
         var1 = 2;
      }

      this.Field13 = (short)(256 * Field14[var1]);
      this.Field5 = 0;
      this.Field11 = this.Field13 * Class809.Field2(this.Field10) >> 10;
      this.Field12 = this.Field13 * Class809.Field1(this.Field10) >> 10;
   }

   public final void Field1() {
      if (this.Field4 == null) {
         this.Field9 = true;
      } else {
         int var1 = this.Field4.Field193 - this.Field1;
         int var2 = this.Field4.Field194 - (this.Field4.Field195 >> 1) - this.Field2;
         ++this.Field5;
         if ((Class809.Field4(var1) >= 16 || Class809.Field4(var2) >= 16) && this.Field5 <= 60) {
            int var3;
            if (Math.abs((var3 = Class809.Field1(var1, var2)) - this.Field10) < 90 || var1 * var1 + var2 * var2 > 4096) {
               if (Math.abs(var3 - this.Field10) < 15) {
                  this.Field10 = var3;
               } else if ((var3 - this.Field10 < 0 || var3 - this.Field10 >= 180) && var3 - this.Field10 >= -180) {
                  this.Field10 = Class809.Field3(this.Field10 - 15);
               } else {
                  this.Field10 = Class809.Field3(this.Field10 + 15);
               }
            }

            if (!this.Field6 && this.Field13 < 8192) {
               this.Field13 = (short)(this.Field13 + 1024);
            }

            this.Field11 = this.Field13 * Class809.Field2(this.Field10) >> 10;
            this.Field12 = this.Field13 * Class809.Field1(this.Field10) >> 10;
            var1 = var1 + this.Field11 >> 10;
            this.Field1 += var1;
            var2 = var2 + this.Field12 >> 10;
            this.Field2 += var2;
            this.Field3 = Class804.Field2(Class809.Field1(var1, -var2));
            this.Field7 = Class804.Field5[this.Field3];
            this.Field8 = Class804.Field4[this.Field3];
         } else {
            this.Field9 = true;
         }
      }
   }
}
