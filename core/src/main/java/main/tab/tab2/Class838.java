package main.tab.tab2;
public final class Class838 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};
   public int Field3;
   public static boolean Field4;

   public Class838(int var1) {
      this.Field3 = var1;
   }

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0) {
         try {
            Class534 var1;
            int var2;
            Class534 var3;
            if (this.Field3 == 1) {
               var3 = Class27.Field2();
               Class261.Field1().Field1((int)13, (short)var3.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);

               while(!Class106.Field21.Field1) {
                  Class858.Field1(50L);
               }

               Class183.Field2();
               Class60.Field8.Field8();

               for(var2 = 0; var2 < 10 && Class106.Field23 == null; ++var2) {
                  Class858.Field1(20L);
               }

               Field2();
               var1 = Class27.Field2();
               Class183.Field6(var1);
            }

            if (this.Field3 == 2) {
               var3 = Class27.Field2();
               Class261.Field1().Field1((int)12, (short)var3.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);

               while(!Class106.Field21.Field1) {
                  Class858.Field1(50L);
               }

               Class183.Field1();
               Class60.Field8.Field8();

               for(var2 = 0; var2 < 10 && Class106.Field23 == null; ++var2) {
                  Class858.Field1(20L);
               }

               Field2();
               var1 = Class27.Field2();
               Class183.Field8(var1);
            }

            if (this.Field3 == 3) {
               var3 = Class27.Field2();
               Class261.Field1().Field1((int)15, (short)var3.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);

               while(!Class106.Field21.Field1) {
                  Class858.Field1(50L);
               }

               Class183.Field1();
               Class60.Field8.Field8();

               for(var2 = 0; var2 < 10 && Class106.Field23 == null; ++var2) {
                  Class858.Field1(20L);
               }

               Field2();
               var1 = Class183.Field3();
               Class183.Field7(var1);
            }

            if (this.Field3 == 4) {
               Field3();
               Field1 = 0;
               Class60.Field11 = false;
            }

            Class858.Field1(300L);
         } catch (Exception var4) {
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

   public static void Field3() {
      int var0 = 0;
      int var1 = Class357.Field125.size();

      for(int var2 = 0; var2 < var1; ++var2) {
         ++var0;
         Class534 var4 = (Class534)Class357.Field125.elementAt(var2);
         if (Class811.Field2((int)var4.Field18).Field1.indexOf("Sách kỹ năng pet") != -1) {
            while(true) {
               if (Field4) {
                  if (Field4) {
                     Class261.Field1().Field7(var4.Field9);
                  }

                  Field4 = false;
                  Class858.Field1(90L);
                  Class534 var5 = Class183.Field3();
                  Class137.Field1(var5);
                  Class858.Field1(90L);
                  break;
               }
            }
         }

         ++var0;
      }

   }
}
