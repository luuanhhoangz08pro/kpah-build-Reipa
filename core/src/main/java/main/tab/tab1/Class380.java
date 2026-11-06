package main.tab.tab1;
final class Class380 implements Runnable {
   private Class265 Field1;

   Class380(Class265 var1) {
      this.Field1 = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      if (this.Field1.Field1.Field4) {
         try {
            Class96.Field1(this.Field1.Field1).close();
         } catch (Exception var2) {
         }

         Class96.Field10 = true;
         this.Field1.Field1.Field4 = false;
         this.Field1.Field1.Field3 = false;
         Class130 var1 = this.Field1.Field1.Field2;
         Class105.Field19.Field13();
      }

   }
}
