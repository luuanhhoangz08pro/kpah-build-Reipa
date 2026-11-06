package main.tab.tab2;
public final class Class243 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"", ""};
   int Field3;

   Class243(int var1) {
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
      int var1 = 0;

      while(Field1 != 0) {
         switch(this.Field3) {
         case 1:
            Field2();
            Class858.Field1(130L);
            break;
         case 2:
            if (var1 > Class357.Field125.size()) {
               Field1 = 0;
               return;
            }

            Class534 var2 = (Class534)Class357.Field125.elementAt(var1);
            Class261.Field1().Field6(var2.Field9);
            Class858.Field1(15L);
            ++var1;
         }
      }

   }

   public static void Field2() {
      Class261.Field1().Field1((int)-10, (byte)0, (int)2);
      Class261.Field1().Field1((int)-10, (byte)2, (int)1);
      Class261.Field1().Field1((int)-10, (byte)3, (int)2);
      Class152.Field1(Class152.Field5(), true);
      Class152.Field5().Field4 = System.currentTimeMillis() / 500L + 2L;
      Class152.Field5().Field105 = null;
      Class106.Field19.Field28.Field1((byte)2, (byte)100);
   }
}
