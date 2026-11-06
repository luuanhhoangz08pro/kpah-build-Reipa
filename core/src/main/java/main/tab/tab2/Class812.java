package main.tab.tab2;
public final class Class812 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static int Field2 = 0;
   public static boolean Field3 = false;
   public static boolean Field4 = false;
   public static String[] Field5 = new String[]{"OFF", "ON"};
   public static String[] Field6 = new String[]{"Chúc mừng", "khí"};

   public final void Field1() {
      if (++Field1 >= Field5.length) {
         Field1 = 0;
      }

      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
         Class628 var1 = new Class628(Class752.Field1);
         var1.Field1();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field5.length) {
         switch(Field1) {
         case 1:
            Field2();
            Class858.Field1(500L);
            Field3();
         default:
            try {
               Thread.sleep(0L);
            } catch (Exception var2) {
            }
         }
      }

   }

   public static void Field2() {
      int var0 = Class357.Field125.size();
      int var1 = 0;

      for(int var2 = 0; var2 < var0; ++var2) {
         Class534 var3 = (Class534)Class357.Field125.elementAt(var2);
         if (Class811.Field2((int)var3.Field18).Field1.indexOf("Sách kỹ năng pet") != -1) {
            var1 = var2;
         }
      }

      Class534 var4 = (Class534)Class357.Field125.elementAt(var1);
      Class261.Field1().Field7(var4.Field9);
   }

   public static void Field3() {
      String var0 = Field6[1];
      String var1 = Field6[0];
      if (Class60.Field10.indexOf(var0) != -1) {
         Field1 = 0;
      } else {
         if (Class60.Field10.indexOf(var1) != -1) {
            Class261.Field1().Field3((int)132);
            Class106.Field7();
            Class858.Field1(500L);
            Field3 = true;
            int var2 = 0;
            int var3 = Class357.Field125.size();

            for(int var4 = 0; var4 < var3 && Class832.Field1; ++var4) {
               Class534 var5 = (Class534)Class357.Field125.elementAt(var4);
               if (Class811.Field2((int)var5.Field18).Field1.indexOf("Huyết bồ đề") != -1) {
                  var2 = var4;
               }
            }

            Class534 var6 = (Class534)Class357.Field125.elementAt(var2);
            Class261.Field1().Field7(var6.Field9);
            Field3 = false;
         }

      }
   }
}
