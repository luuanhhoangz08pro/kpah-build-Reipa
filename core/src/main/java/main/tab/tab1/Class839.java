package main.tab.tab1;
public final class Class839 extends Thread implements Class258 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "Băng Lan 0.4% : " + Field2[Field1];
   }

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      Class105.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field2.length) {
         switch(Field1) {
         case 1:
            Class354.Field14 = (Class274)Class354.Field1.elementAt(0);
            Class354.Field13 = Class61.Field3;
            Class263.Field1().Field1((short)Class354.Field13.Field9, (int)1, (int)Class354.Field14.Field1, (int)(Class354.Field14.Field4 ? 1 : 0));
            Class844.Field1(250L);
            if (Class61.Field1.indexOf("Băng") != -1 && (Class61.Field1.indexOf("0.4") != -1 || Class61.Field1.indexOf("0.5") != -1)) {
               Field1 = 0;
               Class63.Field1("Ra rồi kia.........");
            }

            Class354 var1 = new Class354();
            var1.Field1(var1.Field9, true);

            try {
               Thread.sleep(100L);
            } catch (Exception var3) {
            }
         }
      }

   }
}
