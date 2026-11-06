package main.tab.tab2;
public final class Class28 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};
   public static boolean Field3;
   public static boolean Field4;
   public static boolean Field5;
   public static boolean Field6;
   public int Field7;
   public int Field8;
   public int Field9;
   public int Field10;
   public int Field11;
   public int Field12;

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         Class60.Field11 = true;
         Field3 = false;
         Field4 = false;
         Field5 = false;
         Field6 = false;
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field2.length && Class60.Field11) {
         switch(Field1) {
         case 1:
            Class534 var1 = null;
            Class534 var2 = null;
            switch(this.Field11) {
            case 1:
               Class261.Field1().Field1((int)-8, (byte)3, (int)this.Field7);
               Class261.Field1().Field1((int)-8, (byte)4, (int)this.Field12);
               Class261.Field1().Field1((int)-8, (byte)5, (int)0);
               Class261.Field1().Field1((int)-8, (byte)6, (int)this.Field8);
               Class261.Field1().Field1((int)-8, (byte)11, (int)2);
               break;
            case 2:
               Class261.Field1().Field1((int)-8, (byte)3, (int)this.Field7);
               Class261.Field1().Field1((int)-8, (byte)4, (int)this.Field12);
               Class261.Field1().Field1((int)-8, (byte)5, (int)1);
               Class261.Field1().Field1((int)-8, (byte)6, (int)this.Field8);
               Class261.Field1().Field1((int)-8, (byte)11, (int)2);
               break;
            case 3:
               Class261.Field1().Field1((int)-8, (byte)3, (int)this.Field7);
               Class261.Field1().Field1((int)-8, (byte)4, (int)this.Field12);
               Class261.Field1().Field1((int)-8, (byte)5, (int)2);
               Class261.Field1().Field1((int)-8, (byte)6, (int)this.Field8);
               Class261.Field1().Field1((int)-8, (byte)11, (int)2);
            }

            Class858.Field1(250L);
            Class183.Field1(this.Field9, 1, this.Field10);
            Class60.Field8.Field8();
            Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
            Class858.Field1(175L);
            Class534 var3 = Class183.Field3();
            Class183.Field2(var3);
            Class858.Field1(300L);
            if (Field3 && !Field6) {
               Class261.Field1().Field1((int)10, (short)var3.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);
               Class858.Field1(250L);
               Class183.Field1(this.Field9, 2, this.Field10);
               Class60.Field8.Field8();
               Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
               Class858.Field1(175L);
               var1 = Class183.Field3();
               Class183.Field3(var1);
               Class858.Field1(300L);
               Field3 = false;
            }

            if (Field4 && !Field6) {
               Class261.Field1().Field1((int)10, (short)var1.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);
               Class858.Field1(250L);
               Class183.Field1(this.Field9, 3, this.Field10);
               Class60.Field8.Field8();
               Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
               Class858.Field1(175L);
               var2 = Class183.Field3();
               Class183.Field4(var2);
               Class858.Field1(300L);
               Field4 = false;
            }

            if (Field5 && !Field6) {
               Class261.Field1().Field1((int)10, (short)var2.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);
               Class858.Field1(250L);
               Class183.Field1(this.Field9, 4, this.Field10);
               Class60.Field8.Field8();
               Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
               Class858.Field1(175L);
               Class534 var4 = Class183.Field3();
               Class183.Field5(var4);
               Field5 = false;
            }

            try {
               Thread.sleep(300L);
            } catch (Exception var5) {
            }
         }
      }

   }
}
