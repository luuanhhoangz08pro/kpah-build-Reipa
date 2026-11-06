package main.tab.tab1;
public final class Class842 extends Thread implements Class258 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "Khóa 21% : " + Field2[Field1];
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
            String var1;
            Class818 var2;
            int var3;
            int var4;
            String var5;
            if (Class61.Field5 == 3) {
               Class354.Field14 = (Class274)Class354.Field1.elementAt(0);
               Class354.Field13 = Class61.Field3;
               Class263.Field1().Field1((short)Class354.Field13.Field9, (int)Class61.Field5, (int)Class354.Field14.Field1, (int)(Class354.Field14.Field4 ? 1 : 0));
               Class844.Field1(200L);
               Class61.Field2 = Class61.Field3.Field28;
               var5 = "";
               var4 = Class354.Field13.Field34.size();

               for(var3 = 5; var3 < var4; ++var3) {
                  var2 = (Class818)Class354.Field13.Field34.elementAt(var3);
                  var1 = String.valueOf(String.valueOf(var2.Field1(Class354.Field13.Field30))) + var2.Field2() + (var2.Field1() ? "%" : "");
                  if ((var5 = String.valueOf(String.valueOf(var5)) + Class537.Field1(var1, String.valueOf(var2.Field1(false)))).indexOf("Tăng công: 21%") != -1 || var5.indexOf("Tăng thủ ma: 21%") != -1 || var5.indexOf("Tăng thủ vật: 21%") != -1) {
                     Class61.Field4 = var5;
                     Field1 = 0;
                     Class63.Field1("Ra rồi kia.........");
                     break;
                  }
               }
            }

            if (Class61.Field5 == 2) {
               Class354.Field14 = (Class274)Class354.Field1.elementAt(0);
               Class354.Field13 = Class61.Field3;
               Class263.Field1().Field1((short)Class354.Field13.Field9, (int)Class61.Field5, (int)Class354.Field14.Field1, (int)(Class354.Field14.Field4 ? 1 : 0));
               Class844.Field1(200L);
               Class61.Field2 = Class61.Field3.Field28;
               var5 = "";
               var4 = Class354.Field13.Field34.size();

               for(var3 = 0; var3 < var4; ++var3) {
                  var2 = (Class818)Class354.Field13.Field34.elementAt(var3);
                  var1 = String.valueOf(String.valueOf(var2.Field1(Class354.Field13.Field30))) + var2.Field2() + (var2.Field1() ? "%" : "");
                  if ((var5 = String.valueOf(String.valueOf(var5)) + Class537.Field1(var1, String.valueOf(var2.Field1(false)))).indexOf("Tăng công: 21%") != -1 || var5.indexOf("Tăng thủ ma: 21%") != -1 || var5.indexOf("Tăng thủ vật: 21%") != -1) {
                     Class61.Field4 = var5;
                     Field1 = 0;
                     Class63.Field1("Ra rồi kia.........");
                     break;
                  }
               }
            }

            Class354 var6 = new Class354();
            var6.Field1(Class61.Field5, true);

            try {
               Thread.sleep(100L);
            } catch (Exception var8) {
            }
         }
      }

   }
}
