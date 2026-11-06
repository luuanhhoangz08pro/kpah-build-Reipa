package main.tab.tab1;
public final class Class126 extends Class435 {
   private int Field6;
   private int Field7 = 0;
   private byte Field8 = 1;
   private int Field9;

   public Class126(int var1) {
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
         if (var1.Field73 == 20) {
            this.Field9 = 0;
         }

         this.Field1(var1, true, this.Field8, this.Field7);
         if (var1.Field73 == 13) {
            if (var1.Field67 != null && this.Field7 == 0) {
               ++this.Field9;
               if (this.Field9 < this.Field8) {
                  var1.Field73 = 10;
               }
            }

            if (this.Field7 == 1) {
               Class213 var2 = new Class213(var1.Field67.Field193, var1.Field67.Field194 - 200, var1.Field67);
               Class74.Field2.addElement(var2);
            }
         }

         ++var1.Field73;
      }
   }
}
