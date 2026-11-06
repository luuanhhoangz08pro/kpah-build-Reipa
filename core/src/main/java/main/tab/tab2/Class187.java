package main.tab.tab2;
public final class Class187 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static int Field2;
   public static String Field3;
   public static String[] Field4 = new String[]{"OFF", "ON"};
   public static short Field5;

   public static void Field2() {
      Class106.Field1("Dừng Auto..");
   }

   public final void Field1() {
      if (++Field1 >= Field4.length) {
         Field1 = 0;
         Field2();
      }

      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field4.length) {
         switch(Class93.Field14) {
         case 2:
            Field3();
            break;
         case 3:
            Field4();
         }

         try {
            Thread.sleep(150L);
         } catch (Exception var2) {
         }
      }

   }

   public static void Field3() {
      while(Field1 != 0 && Field1 < Field4.length) {
         switch(Field1) {
         case 1:
            Class261.Field1().Field1(Class464.Field1.Field53, Class464.Field1.Field54, Class464.Field61, Field5, Field2, true);
            Class261.Field1().Field1((int)-32047, (byte)0, (String)Field3);
            Class261.Field1().Field1((int)-32053, (byte)0, (String)"1");

            try {
               Thread.sleep(90L);
            } catch (Exception var1) {
            }
         }
      }

   }

   public static void Field4() {
      if (Class464.Field1.Field53 != 13) {
         Field1 = 0;
         Class106.Field1("Không thể bật ở đây.");
      }

      boolean var0 = true;
      int var1 = 0;
      Class534 var2 = Class464.Field61;
      var2 = (Class534)Class357.Field125.elementAt(var1);

      while(Field1 != 0 && Field1 < Field4.length) {
         switch(Field1) {
         case 1:
            if (var1 < Class357.Field125.size()) {
               var2 = (Class534)Class357.Field125.elementAt(var1);
               Class261.Field1().Field1(Class464.Field1.Field53, Class464.Field1.Field54, var2, Field5, Field2, true);
               Class261.Field1().Field1((int)-32047, (byte)0, (String)Field3);
               Class261.Field1().Field1((int)-32053, (byte)0, (String)"1");
               ++var1;
            } else {
               var1 = 0;
               Field1 = 0;
               Field2();
            }
         default:
            try {
               Thread.sleep(90L);
            } catch (Exception var4) {
            }
         }
      }

   }
}
