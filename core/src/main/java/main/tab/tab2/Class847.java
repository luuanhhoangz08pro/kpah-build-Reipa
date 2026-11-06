package main.tab.tab2;
public final class Class847 extends Thread implements Class256 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      int var1 = 0;

      while(Field1 != 0 && var1 <= 4) {
         try {
            int var2;
            for(var2 = 0; var2 <= 20; ++var2) {
               Class261.Field1().Field1((int)-6, (byte)0, (int)1);
               Class261.Field1().Field1((int)-6, (byte)2, (int)0);

               while(Class106.Field23 == null) {
                  Class858.Field1(20L);
               }

               Class106.Field23 = null;
            }

            for(var2 = 0; var2 <= 20; ++var2) {
               Class261.Field1().Field1((int)-6, (byte)0, (int)1);
               Class261.Field1().Field1((int)-6, (byte)2, (int)1);

               while(Class106.Field23 == null) {
                  Class858.Field1(20L);
               }

               Class106.Field23 = null;
            }

            for(var2 = 0; var2 <= 20; ++var2) {
               Class261.Field1().Field1((int)-6, (byte)0, (int)1);
               Class261.Field1().Field1((int)-6, (byte)2, (int)2);
               Class261.Field1().Field1((int)-6, (byte)3, (int)1);

               while(Class106.Field23 == null) {
                  Class858.Field1(20L);
               }

               Class106.Field23 = null;
            }

            Class261.Field1().Field1((int)-6, (byte)0, (int)2);
            Class858.Field1(200L);
            Class106.Field23 = null;
            ++var1;
            if (var1 > 4) {
               Field1 = 0;
               Class106.Field23 = null;
               Class106.Field21.Field1 = false;
               Class106.Field19.Field1();
               Class62.Field1("Xong");
            }
         } catch (Exception var3) {
         }
      }

   }
}
