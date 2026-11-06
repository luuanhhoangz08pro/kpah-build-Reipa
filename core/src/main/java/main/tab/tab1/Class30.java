package main.tab.tab1;
public final class Class30 extends Thread implements Class258 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "Auto đổi tiêu: " + Field2[Field1];
   }

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class105.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field2.length) {
         switch(Field1) {
         case 1:
            Class105.Field3[9] = true;

            try {
               Thread.sleep(300L);
            } catch (Exception var2) {
            }
         }
      }

   }
}
