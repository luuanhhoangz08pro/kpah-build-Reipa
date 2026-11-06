package main.tab.tab2;
public class Class29 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static int Field2 = 0;
   public static int Field3 = 0;
   public static int Field4 = 0;
   public int Field5;
   public int Field6;
   public static int Field7 = 0;
   public static int Field8 = 0;
   public static String[] Field9 = new String[]{"", ""};
   public static String[] Field10 = new String[]{"Ma pháp", "Vật lý"};
   public static String[] Field11 = new String[]{"Nam", "Nữ"};
   public static String[] Field12 = new String[]{"Kiếm Khách", "Chiến Binh", "Pháp Sư", "Đấu Sĩ", "Cung Thủ"};

   public Class29(int var1, int var2) {
      this.Field5 = var1;
      this.Field6 = var2;
   }

   public final void Field1() {
      Class362 var1 = new Class362();
      switch(this.Field5) {
      case 1:
         this.start();
         break;
      case 2:
         if (++Field7 >= Field9.length) {
            Field7 = 0;
         }

         var1.Field1();
         break;
      case 3:
         if (++Field8 >= Field9.length) {
            Field8 = 0;
         }

         var1.Field1();
      }

   }

   public final void run() {
      this.Field3(0, 2, 0);
      this.Field3(3, 7, 3);
      Field1(Field7, this.Field6, 5);
      Class858.Field1(300L);
      Field1(5, 4);
      Field2();
      Class858.Field1(500L);
      Field1(this.Field6);
      Class858.Field1(300L);
      Field1(5, 4);
      Field2();
      Class858.Field1(500L);
      Class752.Field2(0);
      Class62.Field1("Done Set 5x " + Field12[this.Field6]);
   }

   private void Field3(int var1, int var2, int var3) {
      int var4 = var3;

      for(int var5 = var1; var5 <= var2; ++var5) {
         if (var1 == 0) {
            Field2(Field7, var4, this.Field6);
         } else {
            Field1(Field7, this.Field6, var4);
         }

         Class858.Field1(300L);
         Field1(5, 4);
         Field2();
         Class858.Field1(500L);
         ++var4;
         if (var4 > var2) {
            break;
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

   public static void Field1(int var0) {
      Class261.Field1().Field1((int)-8, (byte)1, (int)var0);
      Class261.Field1().Field1((int)-8, (byte)2, (int)6);
      Class261.Field1().Field1((int)-8, (byte)11, (int)2);
   }

   public static void Field1(int var0, int var1, int var2) {
      Class261.Field1().Field1((int)-8, (byte)3, (int)var0);
      Class261.Field1().Field1((int)-8, (byte)4, (int)var1);
      Class261.Field1().Field1((int)-8, (byte)5, (int)var2);
      Class261.Field1().Field1((int)-8, (byte)6, (int)6);
      Class261.Field1().Field1((int)-8, (byte)11, (int)2);
   }

   public static void Field2(int var0, int var1, int var2) {
      Class261.Field1().Field1((int)-8, (byte)3, (int)var0);
      Class261.Field1().Field1((int)-8, (byte)4, (int)var2);
      Class261.Field1().Field1((int)-8, (byte)5, (int)var1);
      Class261.Field1().Field1((int)-8, (byte)6, (int)(13 - Field8));
      Class261.Field1().Field1((int)-8, (byte)11, (int)2);
   }

   public static void Field2() {
      Class60.Field8.Field8();
      Class261.Field1().Field1((short)Class60.Field8.Field29.size(), Class464.Field38, Class60.Field9);
      Class858.Field1(175L);
   }
}
