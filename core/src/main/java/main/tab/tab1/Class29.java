package main.tab.tab1;
import java.util.Random;

public final class Class29 extends Thread implements Class258 {
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

   public void run() {
      int[] var3 = new int[]{0, 1, 2};
      int[] var1;
      int[] var2;
      if (Class105.Field19.Field15.Field93 == 2) {
         var2 = new int[]{0, 1, 2, 3, 8, 9, 0};
         var1 = var2;
         var2[6] = 10;
      } else {
         var2 = new int[]{0, 1, 2, 3, 6, 7, 0};
         var1 = var2;
         var2[6] = 8;
      }

      var2 = var1;
      Random var4 = new Random();

      while(true) {
         do {
            if (Field1 == 0) {
               return;
            }
         } while(Class105.Field17 != Class105.Field19);

         while(Field1 != 0) {
            int var5 = var3[var4.nextInt(var3.length)];
            int var6 = var2[var4.nextInt(var2.length)];
            if (var6 == 4) {
               Class585.Field1[Class63.Field46][var5].Field1(4, true);
            }

            Class585.Field1[Class63.Field46][var5].Field1(var6, false);
            Class844.Field1(35L);
         }
      }
   }
}
