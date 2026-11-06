package main.tab.tab1;
public final class Class618 extends Thread implements Class258 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"ON", "OFF"};
   public static boolean Field3;
   private int Field4;

   public Class618(int var1) {
      this.Field4 = var1;
   }

   public final void Field1() {
      Field1 = 1;
      Class105.Field21.Field3 = 3;
      if (Field1 == 1) {
         Field3 = true;
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field3) {
         switch(1) {
         case 1:
            int var1 = Integer.parseInt(Class105.Field25.Field1.Field5());
            if (var1 > 100) {
               Class284.Field1(var1);
               Field2();
               Class105.Field1("Đã đặt tốc độ: " + var1 + "ms");
            } else {
               Field2();
               Class105.Field1("Tốc độ phải lớn hơn 100");
            }

            try {
               Thread.sleep(0L);
            } catch (Exception var3) {
            }
         }
      }

   }

   public static void Field2() {
      Field1 = 0;
      Field3 = false;
   }
}
