package main.tab.tab2;
final class Class645 extends Thread implements Class256 {
   public static boolean Field1 = false;
   final Class464 Field2;

   Class645(Class464 var1) {
      this.Field2 = var1;
   }

   public final void Field1() {
      Field1 = true;
      this.start();
   }

   public final void run() {
      while(Field1) {
         try {
            int var1 = this.Field2.Field26.size();
            Class591 var2 = new Class591(this.Field2);
            Class230 var3 = (Class230)var2.Field1.Field26.elementAt(var2.Field1.Field4);
            Class261.Field1().Field1(var2.Field1.Field25, var2.Field1.Field53, var2.Field1.Field54, var3.Field1, 1);
            ++this.Field2.Field4;
            if (this.Field2.Field4 >= var1 - 5) {
               this.Field2.Field4 = 0;
            }

            if (var1 == 0) {
               Field1 = false;
               return;
            }

            Thread.sleep(75L);
         } catch (Exception var4) {
         }
      }

   }
}
