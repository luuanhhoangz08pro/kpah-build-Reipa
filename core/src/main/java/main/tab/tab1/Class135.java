package main.tab.tab1;
public class Class135 implements Class258, Runnable {
   static Thread Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};
   public static int Field3;

   public static String Field2() {
      return "ReSet VK: " + Field2[Field3];
   }

   public void Field1() {
      if (Field1 == null) {
         Field1 = new Thread(this);
         Field1.start();
      }

      ++Field3;
      Field3 %= Field2.length;
      Class105.Field21.Field3 = 3;
   }

   public void run() {
      try {
         while(true) {
            Class263.Field1().Field1((int)6);
            Class263.Field1().Field1((int)6);
            Thread.sleep(30000L);
         }
      } catch (InterruptedException var2) {
      }
   }
}
