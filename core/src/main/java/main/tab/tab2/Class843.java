package main.tab.tab2;
public final class Class843 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"Bật", "Tắt"};

   public static String Field2() {
      return "Thông báo: " + Field2[Field1];
   }

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class106.Field21.Field3 = 3;
   }

   public final void run() {
   }
}
