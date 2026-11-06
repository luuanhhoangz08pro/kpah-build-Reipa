package main.tab.tab1;
public final class Class470 extends Class173 {
   private int[] Field1;
   private int[] Field15;
   private int Field16;
   private int Field17;
   private int Field18;
   private int Field19;
   private int Field20;
   private Class111 Field21 = null;

   public Class470(int var1, int var2, int var3, int var4, Class111 var5) {
      this.Field21 = var5;
      super.Field5 = var1;
      super.Field6 = var2;
      this.Field19 = var3;
      this.Field20 = var4;
      Class470 var6;
      (var6 = this).Field16 = var6.Field19 - var6.Field5;
      var6.Field17 = var6.Field20 - var6.Field6;
      Class802.Field1(var6.Field16, var6.Field17);
      if ((var1 = (Math.abs(var6.Field16) + Math.abs(var6.Field17)) / 30) < 2) {
         var1 = 2;
      }

      var6.Field1 = new int[var1];
      var6.Field15 = new int[var1];

      for(var2 = 0; var2 < var1; ++var2) {
         var6.Field1[var2] = var6.Field5 + var2 * var6.Field16 / var1;
         var6.Field15[var2] = var6.Field6 + var2 * var6.Field17 / var1;
      }

   }

   private static void Field1(int var0, int var1, int var2) {
      Class74.Field2(new Class173(var0, var1, var2));
   }

   public final void Field1() {
      if (this.Field18 >= 1) {
         Field1(this.Field1[this.Field18] + 3, this.Field15[this.Field18] + 15, 52);
         Field1(this.Field1[this.Field18], this.Field15[this.Field18], 51);
      }

      if (this.Field18 < this.Field1.length) {
         ++this.Field18;
      }

      if (this.Field18 >= this.Field1.length) {
         this.Field18 = this.Field1.length - 1;
         this.Field1[this.Field18] = this.Field19;
         this.Field15[this.Field18] = this.Field20;
         Field1(this.Field1[this.Field18] + 3, this.Field15[this.Field18] + 15, 52);
         Field1(this.Field1[this.Field18], this.Field15[this.Field18], 51);
         super.Field10 = true;
         if (this.Field21 != null && this.Field21.Field18 != 0 && this.Field21.Field18 != 2000000) {
            Class105.Field19.Field1("-" + this.Field21.Field18, 0, this.Field21.Field193, this.Field21.Field194 + this.Field21.Field16 - 15, 1, -2);
         }
      }

   }
}
