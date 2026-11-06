package main.tab.tab2;
final class Class724 implements Class256 {
   private Class512 Field1;

   Class724(Class512 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Class459 var1;
      if ((var1 = this.Field1.Field1).Field2 >= 0 && var1.Field2 < var1.Field1.size()) {
         int var5 = Integer.parseInt((String)var1.Field1.elementAt(var1.Field2));
         Class261 var10000 = Class261.Field1();
         byte var2 = (byte)var5;
         Class261 var6 = var10000;
         Class85 var3 = new Class85((byte)-63);

         try {
            var3.Field3().writeByte(var2);
         } catch (Exception var4) {
            var4.printStackTrace();
         }

         var6.Field1.Field1(var3);
      }

      Class106.Field19.Field1();
      this.Field1.Field1.Field2 = 0;
      this.Field1.Field1.Field1.removeAllElements();
   }
}
