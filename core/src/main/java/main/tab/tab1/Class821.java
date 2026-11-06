package main.tab.tab1;
public final class Class821 extends Class173 {
   private int Field15 = -1;
   public long Field1 = 0L;

   public Class821(int var1, int var2, int var3) {
      super(var1, var2, var3);
      this.Field1 = 0L;
   }

   public final void Field1(int var1) {
      this.Field15 = var1;
      this.Field1 = System.currentTimeMillis() + (long)(this.Field15 * 1000);
      if (this.Field15 <= 0) {
         super.Field10 = true;
      }

   }

   public final boolean Field2() {
      return super.Field8 == 20 || super.Field8 == 22 || super.Field8 == 23 || super.Field8 == 24 || super.Field8 == 25 || super.Field8 == 27;
   }

   public final void Field1() {
      if (Class105.Field12 % 2 == 0) {
         super.Field9 = (super.Field9 + 1) % Class173.Field2[super.Field8].length;
      }

      if (System.currentTimeMillis() > this.Field1) {
         super.Field10 = true;
      }

   }

   public final void Field1(int var1, int var2) {
      super.Field5 = var1;
      super.Field6 = var2;
   }
}
