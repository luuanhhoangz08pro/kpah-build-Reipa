package main.tab.tab1;
public final class Class306 extends Thread implements Class258 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public static String Field2() {
      return "Giảm st vật 9%: " + Field2[Field1];
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
            Class354.Field14 = Class61.Field6;
            Class354.Field15 = Class61.Field7;
            Class354.Field13 = Class61.Field3;
            int var1 = Class354.Field15.Field4 ? 1 : 0;
            short var2 = Class354.Field15.Field1;
            int var3 = Class354.Field14.Field4 ? 1 : 0;
            short var4 = Class354.Field14.Field1;
            boolean var5 = true;
            short var6 = Class354.Field13.Field9;
            Class263 var7 = Class263.Field1();
            Class86 var8 = new Class86((byte)-68);

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
            Class844.Field1(250L);
            if (Class61.Field1.indexOf("Giảm st vật 9%") != -1) {
               Field1 = 0;
               Class63.Field1("Ra rồi kìa...........");
            }

            Class354 var9 = new Class354();
            var9.Field1((byte)4, true);

            try {
               Thread.sleep(Class284.Field1);
            } catch (Exception var11) {
            }
         }
      }

   }
}
