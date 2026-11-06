package main.tab.tab2;
final class Class55 implements Class256 {
   private Class62 Field1;
   private final Class85 Field2;
   private final short Field3;
   private final String Field4;
   private final int Field5;
   private final Class85 Field6;
   private final short Field7;

   Class55(Class62 var1, Class85 var2, short var3, String var4, int var5, Class85 var6, short var7) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
      this.Field4 = var4;
      this.Field5 = var5;
      this.Field6 = var6;
      this.Field7 = var7;
   }

   public final void Field1() {
      try {
         this.Field2.Field3().writeByte(1);
         this.Field2.Field3().writeShort(this.Field3);
         this.Field1.Field28.Field1.Field1(this.Field2);
         this.Field2.Field4();
         Class582.Field1(new Class802(this.Field3, this.Field4, this.Field5, this.Field6.Field2().readByte()));
         this.Field1.Field15.Field192 = this.Field3;
         this.Field1.Field15.Field191 = this.Field7;
         int var1 = this.Field6.Field2().available();

         while(var1 > 0) {
            Class582.Field1(new Class802(this.Field6.Field2().readShort(), this.Field6.Field2().readUTF(), this.Field6.Field2().readByte(), this.Field6.Field2().readByte()));
         }

         this.Field1.Field1(new Class375("", "Đã tham gia nhóm"));
      } catch (Exception var3) {
         var3.printStackTrace();
      }

      Class106.Field23 = null;
   }
}
