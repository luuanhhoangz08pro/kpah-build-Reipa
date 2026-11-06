package main.tab.tab2;
public final class Class26 extends Thread implements Class256 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      Field1 = 1;
      this.start();
   }

   public final void run() {
      while(Field1 == 1 && Class455.Field10 != 9) {
         try {
            switch(Class455.Field10) {
            case 0:
            case 70:
               this.Field1(new byte[]{0, 0, 1}, new int[]{3, 6, 9});
               break;
            case 3:
               this.Field1(new byte[]{0, 1}, new int[]{6, 9});
               break;
            case 4:
               this.Field1(new byte[]{1, 1}, new int[]{6, 9});
               break;
            case 5:
               this.Field1(new byte[]{0, 1, 1}, new int[]{4, 6, 9});
               break;
            case 6:
            case 7:
               this.Field1(new byte[]{1, 1}, new int[]{9, 6});
               if (Class455.Field10 == 7) {
                  this.Field1(new byte[]{1}, new int[]{9});
               }
            }

            Class858.Field1(200L);
            Thread.sleep(500L);
         } catch (Exception var2) {
         }
      }

      ++Field1;
   }

   private void Field1(byte[] var1, int[] var2) {
      for(int var3 = 0; var3 < var1.length; ++var3) {
         Class261.Field1().Field1(var1[var3], var2[var3]);
      }

   }
}
