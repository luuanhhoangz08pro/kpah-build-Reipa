package main.tab.tab2;
public final class Class111 extends Thread implements Class256 {
   public static int Field1 = 0;
   public int Field2 = 0;
   public static String[] Field3 = new String[]{"Bật auto", "Tắt auto"};

   public static String Field2() {
      return Field3[Field1];
   }

   public Class111(int var1) {
      this.Field2 = var1;
   }

   public final void Field1() {
      if (++Field1 >= Field3.length) {
         Field1 = 0;
      }

      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      while(Field1 != 0 && Field1 < Field3.length) {
         int var1;
         switch(this.Field2) {
         case 0:
            for(var1 = 0; var1 < 5; ++var1) {
               Class261.Field1().Field3((int)109);
               Class858.Field1(35L);
            }

            Class858.Field1(135L);

            for(var1 = 0; var1 < 5; ++var1) {
               Class261.Field1().Field14(4, 2);
               Class858.Field1(35L);
            }

            Class858.Field1(35L);
            Class261.Field1().Field14(4, 3);
         case 1:
            byte var3 = 0;
            if (var3 < 7) {
               Class261.Field1().Field14(var3, 3);
               var1 = var3 + 1;
            }
         }

         try {
            Thread.sleep(1L);
         } catch (Exception var2) {
         }
      }

   }
}
