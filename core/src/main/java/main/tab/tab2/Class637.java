package main.tab.tab2;
public final class Class637 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static int Field2 = 0;
   public static int[] Field3 = new int[]{70, 75, 80};
   public static String[] Field4 = new String[]{"OFF", "ON"};

   public final void Field1() {
      if (++Field1 >= Field4.length) {
         Field1 = 0;
      }

      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field4.length) {
         switch(Field1) {
         case 1:
            Class534 var2 = Class27.Field2();
            Class805 var3 = Class811.Field2((int)var2.Field18);
            Class261.Field1().Field1((int)11, (short)var2.Field9);
            Class261.Field1().Field1((int)-502, (byte)0, (int)2);
            Class858.Field1(300L);
            byte var1;
            if (var3.Field6 == 35 || var3.Field6 == 36) {
               var1 = 2;
               Field1(var1, 1);
            }

            if (var3.Field6 == 40 || var3.Field6 == 45 || var3.Field6 == 41 || var3.Field6 == 46) {
               var1 = 3;
               Field1(var1, 1);
            }

            if (var3.Field6 == 50 || var3.Field6 == 55 || var3.Field6 == 51 || var3.Field6 == 56) {
               var1 = 4;
               Field1(var1, 1);
            }

            if (var3.Field6 == 60 || var3.Field6 == 65 || var3.Field6 == 61 || var3.Field6 == 66) {
               var1 = 5;
               Field1(var1, 1);
            }

            if (var3.Field6 == 70 || var3.Field6 == 71) {
               var1 = 6;
               Field1(var1, 1);
            }

            if (var3.Field6 == 75 || var3.Field6 == 76) {
               var1 = 6;
               Field1(var1, 2);
            }

            Class60.Field8.Field8();
            Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
            Class858.Field1(175L);
            Field2();
            Class534 var4 = Class27.Field2();
            Class183.Field1(var4);

            try {
               Thread.sleep(300L);
            } catch (Exception var6) {
            }
         }
      }

   }

   public static void Field1(int var0, int var1) {
      int[] var2 = new int[]{73, 80, 87, 94, 101};
      int[] var3 = new int[]{108, 115, 122, 129, 136};

      for(int var4 = 0; var4 < var2.length; ++var4) {
         Class272 var5;
         int var6;
         for(var6 = 0; var6 < Class60.Field8.Field27.size(); ++var6) {
            var5 = (Class272)Class60.Field8.Field27.elementAt(var6);
            if (var5.Field1 == var3[var4]) {
               var5.Field3 = var1;
               Class60.Field8.Field28.addElement(var5);
            }
         }

         for(var6 = 0; var6 < Class60.Field8.Field27.size(); ++var6) {
            var5 = (Class272)Class60.Field8.Field27.elementAt(var6);
            if (var5.Field1 == var2[var4]) {
               var5.Field3 = var0;
               Class60.Field8.Field28.addElement(var5);
            }
         }
      }

   }

   public static void Field2() {
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
}
