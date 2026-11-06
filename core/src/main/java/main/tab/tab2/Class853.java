package main.tab.tab2;
public final class Class853 extends Thread implements Class256 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "Băng Lan 0.4% : " + Field2[Field1];
   }

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
            Class352.Field14 = (Class272)Class352.Field1.elementAt(0);
            Class352.Field13 = Class60.Field3;
            Class261.Field1().Field1((short)Class352.Field13.Field9, (int)1, (int)Class352.Field14.Field1, (int)(Class352.Field14.Field4 ? 1 : 0));
            Class858.Field1(250L);
            if (Class60.Field1.indexOf("Băng") != -1 && (Class60.Field1.indexOf("0.4") != -1 || Class60.Field1.indexOf("0.5") != -1)) {
               Field1 = 0;
               Class62.Field1("Ra rồi kia.........");
            }

            Class352 var1 = new Class352();
            var1.Field1(var1.Field9, true);

            try {
               Thread.sleep(100L);
            } catch (Exception var3) {
            }
         }
      }

   }
}
