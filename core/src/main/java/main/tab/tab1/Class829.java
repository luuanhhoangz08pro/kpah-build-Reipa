package main.tab.tab1;
public final class Class829 extends Thread implements Class258 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"Bật", "Tắt"};

   public static String Field2() {
      return "Thông báo: " + Field2[Field1];
   }

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class105.Field24.Field1 = false;
   }

   public final void run() {
   }
}
