package main.tab.tab2;
public final class Class826 {
   private short Field1;
   private short Field2;

   public Class826(short var1, short var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final byte Field1(boolean var1) {
      byte var2;
      if ((var2 = ((Class331)Class805.Field16.get(String.valueOf(this.Field1))).Field2) == 1 && var1) {
         var2 = 2;
      }

      return var2;
   }

   public final String Field1(int var1) {
      String var2 = ((Class331)Class805.Field16.get(String.valueOf(this.Field1))).Field3;
      if (this.Field1 >= 43 && this.Field1 <= 57) {
         var2 = Class599.Field11[var1][this.Field1 - 43];
      }

      return var2 + ": ";
   }

   public final boolean Field1() {
      byte var1;
      return (var1 = ((Class331)Class805.Field16.get(String.valueOf(this.Field1))).Field1) == 1 || var1 == 2;
   }

   public final String Field2() {
      String var1 = String.valueOf(this.Field1 != 33 && this.Field1 != 34 ? this.Field2 : this.Field2 * 1000);
      if (((Class331)Class805.Field16.get(String.valueOf(this.Field1))).Field1 == 2) {
         var1 = this.Field2 / 10 + "." + this.Field2 % 10;
      }

      return var1;
   }

   public final short Field3() {
      return this.Field1;
   }
}
