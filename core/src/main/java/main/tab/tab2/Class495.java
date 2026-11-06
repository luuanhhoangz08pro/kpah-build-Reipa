package main.tab.tab2;
public final class Class495 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field2.length) {
         int var10000 = Field1;

         try {
            Thread.sleep(10L);
         } catch (Exception var2) {
         }
      }

   }
}
