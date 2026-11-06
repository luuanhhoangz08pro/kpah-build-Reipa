package main.tab.tab1;
public class Class136 implements Class258, Runnable {
   static Thread Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};
   public static int Field3;

   public static String Field2() {
      return "Chọn Người: " + Field2[Field3];
   }

   public void Field1() {
      if (Field1 == null) {
         Field1 = new Thread(this);
         Field1.start();
      }

      ++Field3;
      Field3 %= Field2.length;
      (new Class244()).Field1();
      Class105.Field21.Field3 = 0;
   }

   public void run() {
      while(true) {
         switch(Field3) {
         case 1:
         case 3:
            if (Class105.Field19.Field16 != null && !Class56.Field3(Class105.Field19.Field16.a_())) {
               Class105.Field19.Field1(true);
            }
         case 2:
         default:
            try {
               Thread.sleep(10L);
            } catch (Exception var2) {
            }
         }
      }
   }
}
