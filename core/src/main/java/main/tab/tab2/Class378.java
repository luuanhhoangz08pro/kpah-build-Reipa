package main.tab.tab2;
final class Class378 implements Runnable {
   private Class263 Field1;

   Class378(Class263 var1) {
      this.Field1 = var1;
   }

   public final void run() {
      try {
         Thread.sleep(20000L);
      } catch (InterruptedException var3) {
      }

      if (this.Field1.Field1.Field4) {
         try {
            Class97.Field1(this.Field1.Field1).close();
         } catch (Exception var2) {
         }

         Class97.Field10 = true;
         this.Field1.Field1.Field4 = false;
         this.Field1.Field1.Field3 = false;
         Class133 var1 = this.Field1.Field1.Field2;
         Class106.Field19.Field13();
      }

   }
}
