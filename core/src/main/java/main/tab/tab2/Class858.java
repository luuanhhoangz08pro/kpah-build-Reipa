package main.tab.tab2;
public class Class858 {
   public static int[] Field1 = new int[]{128, 1, 32, 64, 16};
   public static int Field2 = 0;

   public static String Field1(String var0) {
      int var2 = Field1[Field2];
      int var3 = var0.length();
      byte[] var4 = new byte[var3 / 2];

      int var1;
      for(var1 = 0; var1 < var3; var1 += 2) {
         var4[var1 / 2] = (byte)((Character.digit(var0.charAt(var1), 16) << 4) + Character.digit(var0.charAt(var1 + 1), 16));
      }

      byte[] var5 = new byte[var4.length];

      for(var1 = 0; var1 < var4.length; ++var1) {
         var5[var1] = (byte)(var4[var1] ^ var2);
      }

      return new String(var5);
   }

   public static void Field1(long var0) {
      try {
         Thread.sleep(var0);
      } catch (InterruptedException var3) {
         var3.printStackTrace();
      }
   }
}
