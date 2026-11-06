package main.tab.tab2;
public final class Class840 extends Thread implements Class256 {
   public int Field1 = 0;

   public Class840(int var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.start();
   }

   public final void run() {
      int var1 = Class839.Field2;
      short var2 = 500;

      while(var1 > 0) {
         int var3 = Math.min(var1, var2);
         Class839.Field1(this.Field1, var3);
         if (Class60.Field10.indexOf("Chỉ có thể") != -1) {
            boolean var6 = false;
            return;
         }

         var1 -= var3;

         try {
            Thread.sleep(200L);
         } catch (Exception var5) {
         }
      }

      Class62.Field1("Done " + Class839.Field2);
   }
}
