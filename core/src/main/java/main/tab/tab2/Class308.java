package main.tab.tab2;
public final class Class308 extends Thread implements Class256 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "All giảm st ma: " + Field2[Field1];
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
            Class352.Field14 = Class60.Field6;
            Class352.Field15 = Class60.Field7;
            Class352.Field13 = Class60.Field3;
            int var1 = Class352.Field15.Field4 ? 1 : 0;
            short var2 = Class352.Field15.Field1;
            int var3 = Class352.Field14.Field4 ? 1 : 0;
            short var4 = Class352.Field14.Field1;
            boolean var5 = true;
            short var6 = Class352.Field13.Field9;
            Class261 var7 = Class261.Field1();
            Class85 var8 = new Class85((byte)-68);

            try {
               var8.Field3().writeByte(5);
               var8.Field3().writeShort(var6);
               var8.Field3().writeShort(var4);
               var8.Field3().writeByte(var3);
               var8.Field3().writeShort(var2);
               var8.Field3().writeByte(var1);
            } catch (Exception var12) {
               var12.printStackTrace();
            }

            var7.Field1.Field1(var8);
            Class858.Field1(250L);
            if (Class60.Field1.indexOf("Giảm st ma") != -1) {
               Field1 = 0;
               Class62.Field1("Done \\n -Roman-......");
            }

            Class352 var9 = new Class352();
            var9.Field1((byte)4, true);

            try {
               Thread.sleep(Class282.Field1);
            } catch (Exception var11) {
            }
         }
      }

   }
}
