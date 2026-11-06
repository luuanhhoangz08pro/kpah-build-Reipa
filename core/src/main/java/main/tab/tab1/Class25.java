package main.tab.tab1;
public final class Class25 extends Thread implements Class258 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0) {
         try {
            if (Class105.Field17 == Class105.Field19) {
               Class585 var1 = Class105.Field19.Field15;
               if (var1.Field4 <= var1.Field5 - 100) {
                  Class263.Field1().Field11(94);
                  Class263.Field1().Field11(93);
               }

               if (var1.Field130 <= var1.Field129 - 100) {
                  Class263.Field1().Field11(96);
                  Class263.Field1().Field11(95);
               }

               Class844.Field1(35L);
            }
         } catch (Exception var2) {
         }
      }

   }
}
