package main.tab.tab1;
final class Class718 implements Class258 {
   private Class515 Field1;

   Class718(Class515 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Class462 var1;
      if ((var1 = this.Field1.Field1).Field2 >= 0 && var1.Field2 < var1.Field1.size()) {
         int var5 = Integer.parseInt((String)var1.Field1.elementAt(var1.Field2));
         Class263 var10000 = Class263.Field1();
         byte var2 = (byte)var5;
         Class263 var6 = var10000;
         Class86 var3 = new Class86((byte)-63);

         try {
            var3.Field3().writeByte(var2);
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         var6.Field1.Field1(var3);
      }

      Class105.Field19.Field1();
      this.Field1.Field1.Field2 = 0;
      this.Field1.Field1.Field1.removeAllElements();
   }
}
