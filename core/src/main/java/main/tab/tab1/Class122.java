package main.tab.tab1;
public abstract class Class122 extends Class672 {
   public short Field3;
   public boolean Field4 = false;
   private int Field1;
   private short Field2;
   private short Field6;
   short Field5;
   private short Field7;
   private static short Field8 = 6;
   private long Field9;

   public final void Field1(short var1) {
      this.Field3 = var1;
      this.Field9 = System.currentTimeMillis();
   }

   public final void Field2(short var1, short var2) {
      this.Field2 = var1;
      this.Field6 = var2;
      this.Field1 = 2;
      this.Field5 = 0;
      this.Field7 = Field8;
   }

   public final void Field1(short var1, short var2, short var3, short var4) {
      super.Field193 = var1;
      super.Field194 = var2;
      this.Field2 = var3;
      this.Field6 = var4;
      this.Field1 = 1;
      this.Field5 = 0;
      this.Field7 = Field8;
      this.Field9 = System.currentTimeMillis();
   }

   public final void Field1(short var1, short var2) {
      super.Field193 = var1;
      super.Field194 = (short)(var2 - 4 + Class105.Field20.nextInt() % 8);
   }

   public final void Field2() {
      long var1 = System.currentTimeMillis();
      if (super.Field188 != 3 && super.Field188 != 6) {
         if (super.Field188 == 4) {
            boolean var3 = false;
            int var4 = this.Field3 >= 10 ? '\uea60' : 15000;
            if (var1 - this.Field9 > (long)var4) {
               super.Field187 = true;
            }
         }
      } else if (var1 - this.Field9 > 25000L) {
         super.Field187 = true;
      }

      if (this.Field1 == 1 || this.Field1 == 2) {
         super.Field193 += (short)(this.Field2 - super.Field193 >> 2);
         super.Field194 += (short)(this.Field6 - super.Field194 >> 2);
         if (this.Field7 >= -Field8) {
            this.Field5 += this.Field7;
            --this.Field7;
         }

         if ((Class63.Field3(super.Field193 - this.Field2) < 4 || Class63.Field3(super.Field194 - this.Field6) < 4) && this.Field5 <= 1) {
            super.Field193 = this.Field2;
            super.Field194 = this.Field6;
            this.Field5 = 0;
            this.Field7 = 0;
            if (this.Field1 == 2) {
               super.Field187 = true;
            }

            this.Field1 = 0;
         }
      }

   }

   public boolean Field3() {
      return true;
   }

   public final boolean b_() {
      return true;
   }
}
