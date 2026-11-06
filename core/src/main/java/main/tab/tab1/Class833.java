package main.tab.tab1;
public final class Class833 extends Thread implements Class258 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

   }

   public final void run() {
   }

   public static void Field2() {
      switch(Field1) {
      case 0:
         Class105.Field3[10] = true;
         Class105.Field5[10] = true;
         return;
      case 1:
         Class263.Field1().Field2(23, 4, 4);
         return;
      default:
      }
   }
}
