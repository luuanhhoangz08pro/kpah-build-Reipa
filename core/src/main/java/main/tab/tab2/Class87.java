package main.tab.tab2;
public final class Class87 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field2.length) {
         switch(Field1) {
         case 1:
            int var1 = 0;
            int var2 = 0;

            for(int var3 = 0; var3 < 18; ++var3) {
               Class858.Field1(5L);
               Class106.Field3[8] = true;
            }

            Class858.Field1(75L);

            while(var1 < 90) {
               Class858.Field1(5L);
               Class106.Field3[5] = true;
               ++var1;
            }

            Class858.Field1(75L);
            Class534 var5 = Class183.Field3();
            Field1(var5);
            Class858.Field1(125L);
            Class106.Field3[6] = true;
            Class858.Field1(125L);

            while(var2 < 24) {
               Class858.Field1(5L);
               Class106.Field3[5] = true;
               ++var2;
            }

            Class858.Field1(125L);
            Field2();
            Field1 = 0;
         default:
            try {
               Thread.sleep(300000L);
            } catch (Exception var4) {
            }
         }
      }

   }

   public static void Field1(Class534 var0) {
      if (Class60.Field10.indexOf("Đã đủ") != -1) {
         Class106.Field3[12] = true;
         Class858.Field1(75L);
      }

   }

   public static void Field2() {
      Class60.Field8.Field8();
      Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
      Class858.Field1(300L);
      Field3();
   }

   public static void Field3() {
      Class464.Field1.Field27.removeAllElements();
      Class464.Field1.Field28 = null;
      Class464.Field21 = Class464.Field1.Field49;
      Class464.Field1.Field21();
      Class106.Field19.Field1();
      Class464.Field1.Field12.removeAllElements();
      Class858.Field1(25L);
      Class464.Field1.Field52 = null;
      Class464.Field39 = null;
      Class464.Field1.Field57 = 0;
      Class464.Field1.Field58 = 1;
      Class464.Field1.Field15 = false;
   }

   public static void Field4() {
      Class187 var0;
      switch(Class93.Field14) {
      case 0:
         Class25.Field1 = 0;
         Class847.Field1 = 0;
         Class30.Field1 = 0;
         Class645.Field1 = false;
         Class835.Field1 = 0;
         Class139.Field1 = 0;
         Class243.Field1 = 0;
         Class637.Field1 = 0;
         Class812.Field1 = 0;
         Class838.Field1 = 0;
         Class302.Field1 = 0;
         Class303.Field1 = 0;
         Class304.Field1 = 0;
         Class305.Field1 = 0;
         Class306.Field1 = 0;
         Class307.Field1 = 0;
         Class308.Field1 = 0;
         Class309.Field1 = 0;
         Class310.Field1 = 0;
         Class311.Field1 = 0;
         Class312.Field1 = 0;
         Class849.Field1 = 0;
         Class850.Field1 = 0;
         Class851.Field1 = 0;
         Class852.Field1 = 0;
         Class853.Field1 = 0;
         Class854.Field1 = 0;
         Class855.Field1 = 0;
         Class856.Field1 = 0;
         Class106.Field1("Dừng Auto");
         break;
      case 1:
         Class87 var1 = new Class87();
         var1.Field1();
         break;
      case 2:
         var0 = new Class187();
         var0.Field1();
         break;
      case 3:
         var0 = new Class187();
         var0.Field1();
      }

   }
}
