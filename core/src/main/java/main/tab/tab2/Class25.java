package main.tab.tab2;
public final class Class25 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};
   public int Field3;

   public Class25(int var1) {
      this.Field3 = var1;
   }

   public final void Field1() {
      Field1 = 1;
      this.start();
   }

   public final void run() {
      while(Field1 != 0) {
         Class858.Field1(300L);

         try {
            Class534 var1;
            int var2;
            label79:
            switch(this.Field3) {
            case 1:
               var1 = Class27.Field2();
               Class261.Field1().Field1((int)13, (short)var1.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);

               while(!Class106.Field21.Field1) {
                  Class858.Field1(100L);
               }

               Class183.Field2();
               Class60.Field8.Field8();
               var2 = 0;

               while(true) {
                  if (var2 >= 10 && Class106.Field23 != null) {
                     break label79;
                  }

                  Class858.Field1(20L);
                  ++var2;
               }
            case 2:
               var1 = Class27.Field2();
               Class261.Field1().Field1((int)12, (short)var1.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);

               while(!Class106.Field21.Field1) {
                  Class858.Field1(100L);
               }

               Class183.Field1();
               Class60.Field8.Field8();
               var2 = 0;

               while(true) {
                  if (var2 >= 10 && Class106.Field23 != null) {
                     break label79;
                  }

                  Class858.Field1(20L);
                  ++var2;
               }
            case 3:
               var1 = Class27.Field2();
               Class261.Field1().Field1((int)15, (short)var1.Field9);
               Class261.Field1().Field1((int)-502, (byte)0, (int)2);

               while(!Class106.Field21.Field1) {
                  Class858.Field1(100L);
               }

               Class183.Field1();
               Class60.Field8.Field8();

               for(var2 = 0; var2 < 10 || Class106.Field23 == null; ++var2) {
                  Class858.Field1(20L);
               }
            }

            var1 = Class27.Field2();
            Field1(var1, this.Field3);
            Class106.Field19.Field1();
            Class106.Field23 = null;
            Class106.Field21.Field1 = false;
         } catch (Exception var3) {
         }
      }

   }

   public static void Field1(Class534 var0, int var1) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Field1 = 0;
      } else {
         String var2 = "";
         String var3 = "";
         String var4 = "";
         switch(var1) {
         case 1:
            var3 = Class93.Field1[Class93.Field13];
            var4 = Class93.Field2[Class93.Field13] + " - " + Class93.Field10[Class93.Field16];
            break;
         case 2:
            var3 = "21%";
            var4 = "21%";
            break;
         case 3:
            var3 = Class88.Field2();
            var4 = Class88.Field2();
            break;
         default:
            return;
         }

         int var5 = var0.Field34.size();

         for(int var6 = 1; var6 < var5; ++var6) {
            Class826 var7 = (Class826)var0.Field34.elementAt(var6);
            String var8 = var7.Field1(var0.Field30) + var7.Field2() + (var7.Field1() ? "%" : "");
            if ((var2 = var2 + Class534.Field1(var8, String.valueOf(var7.Field1(false)))).indexOf(var3) != -1) {
               Field1 = 0;
               Class62.Field1(var4 + " Done! \n -Roman-");
               break;
            }
         }

      }
   }
}
