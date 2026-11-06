package main.tab.tab2;
import java.util.HashSet;

public final class Class139 extends Thread implements Class256 {
   public static int Field1 = 0;
   public int Field2;
   public static String[] Field3 = new String[]{"OFF", "ON"};
   public static boolean Field4;
   public static String[] Field5 = new String[]{".", "..", "..."};

   public Class139(int var1) {
      this.Field2 = var1;
   }

   public final void Field1() {
      if (++Field1 >= Field3.length) {
         Field1 = 0;
      }

      Class106.Field21.Field1 = false;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field3.length) {
         switch(Field1) {
         case 1:
            short var2 = 400;
            byte var3 = 40;
            int var4 = 0;
            Class858.Field1(200L);
            int var1;
            if (this.Field2 != 2) {
               for(var1 = 0; var1 < var3 && Field1 != 0; ++var1) {
                  ++var4;
                  if (var4 >= Field5.length) {
                     var4 = 0;
                  }

                  Class388.Field1("Mua vé" + Field5[var4]);
                  this.Field3();
                  Class858.Field1(75L);
               }
            }

            for(var1 = 0; var1 < var2 && Field1 != 0; ++var1) {
               ++var4;
               if (var4 >= Field5.length) {
                  var4 = 0;
               }

               Class388.Field1("Quay" + Field5[var4]);
               Field2();
               Class858.Field1(10L);
            }

            Class858.Field1(200L);
            Field4();

            try {
               Thread.sleep(300L);
            } catch (Exception var6) {
            }
         }
      }

   }

   public static void Field2() {
      Class587.Field1(Class587.Field5(), true);
      Class106.Field4[5] = true;
      Class106.Field5[5] = true;
      Class587.Field5().Field6();
      Class587.Field5().Field3 = false;
      Class587.Field5().Field104 = Class587.Field1(Class587.Field5());
      Class587.Field5().Field103 = Class587.Field2(Class587.Field5());
      Class587.Field5().Field105 = Class587.Field3(Class587.Field5());
   }

   public void Field3() {
      if (this.Field2 == 0) {
         Class261.Field1().Field1((int)-24, (byte)0, (int)3);
      } else if (this.Field2 == 1) {
         Class261.Field1().Field1((int)-24, (byte)0, (int)5);
      }

   }

   public static void Field4() {
      short var1 = 360;
      HashSet var2 = new HashSet();
      int[] var3 = new int[]{115, 122, 108, 129, 136, 73, 80, 87, 94, 101, 24, 25, 26, 27, 249, 250, 248, 8, 9, 10, 11, 66};
      int var4 = var3.length;

      for(int var5 = 0; var5 < var4; ++var5) {
         int var6 = var3[var5];
         var2.add(var6);
      }

      for(int var7 = 0; var7 < var1 && Field1 != 0; ++var7) {
         if (!var2.contains(var7)) {
            Class388.Field1("Tiếp tục sau " + (var1 - var7));
            Class261.Field1().Field1((short)((short)var7), (int)0, (byte)0);
            Class858.Field1(55L);
         }
      }

   }
}
