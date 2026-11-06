package main.tab.tab2;
public final class Class855 extends Thread implements Class256 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "Khóa 20% : " + Field2[Field1];
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
            String var1;
            Class826 var2;
            int var3;
            int var4;
            String var5;
            if (Class60.Field5 == 3) {
               Class352.Field14 = (Class272)Class352.Field1.elementAt(0);
               Class352.Field13 = Class60.Field3;
               Class261.Field1().Field1((short)Class352.Field13.Field9, (int)Class60.Field5, (int)Class352.Field14.Field1, (int)(Class352.Field14.Field4 ? 1 : 0));
               Class858.Field1(200L);
               Class60.Field2 = Class60.Field3.Field28;
               var5 = "";
               var4 = Class352.Field13.Field34.size();

               for(var3 = 5; var3 < var4; ++var3) {
                  var2 = (Class826)Class352.Field13.Field34.elementAt(var3);
                  var1 = String.valueOf(String.valueOf(var2.Field1(Class352.Field13.Field30))) + var2.Field2() + (var2.Field1() ? "%" : "");
                  if ((var5 = String.valueOf(String.valueOf(var5)) + Class534.Field1(var1, String.valueOf(var2.Field1(false)))).indexOf("Tăng công: 20%") != -1 || var5.indexOf("Tăng thủ ma: 20%") != -1 || var5.indexOf("Tăng thủ vật: 20%") != -1 || var5.indexOf("Tăng công: 21%") != -1 || var5.indexOf("Tăng thủ ma: 21%") != -1 || var5.indexOf("Tăng thủ vật: 21%") != -1) {
                     Class60.Field4 = var5;
                     Field1 = 0;
                     Class62.Field1("Ra rồi kia.........");
                     break;
                  }
               }
            }

            if (Class60.Field5 == 2) {
               Class352.Field14 = (Class272)Class352.Field1.elementAt(0);
               Class352.Field13 = Class60.Field3;
               Class261.Field1().Field1((short)Class352.Field13.Field9, (int)Class60.Field5, (int)Class352.Field14.Field1, (int)(Class352.Field14.Field4 ? 1 : 0));
               Class858.Field1(200L);
               Class60.Field2 = Class60.Field3.Field28;
               var5 = "";
               var4 = Class352.Field13.Field34.size();

               for(var3 = 0; var3 < var4; ++var3) {
                  var2 = (Class826)Class352.Field13.Field34.elementAt(var3);
                  var1 = String.valueOf(String.valueOf(var2.Field1(Class352.Field13.Field30))) + var2.Field2() + (var2.Field1() ? "%" : "");
                  if ((var5 = String.valueOf(String.valueOf(var5)) + Class534.Field1(var1, String.valueOf(var2.Field1(false)))).indexOf("Tăng công: 20%") != -1 || var5.indexOf("Tăng thủ ma: 20%") != -1 || var5.indexOf("Tăng thủ vật: 20%") != -1 || var5.indexOf("Tăng công: 21%") != -1 || var5.indexOf("Tăng thủ ma: 21%") != -1 || var5.indexOf("Tăng thủ vật: 21%") != -1) {
                     Class60.Field4 = var5;
                     Field1 = 0;
                     Class62.Field1("Ra rồi kia.........");
                     break;
                  }
               }
            }

            Class352 var6 = new Class352();
            var6.Field1(Class60.Field5, true);

            try {
               Thread.sleep(100L);
            } catch (Exception var8) {
            }
         }
      }

   }
}
