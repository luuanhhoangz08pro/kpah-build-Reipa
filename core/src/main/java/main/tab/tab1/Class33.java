package main.tab.tab1;
public final class Class33 implements Class258 {
   public static String Field1(byte[] var0) {
      String var1 = null;

      try {
         var1 = new String(var0, "UTF-8");
      } catch (Exception var3) {
      }

      return var1;
   }

   public static byte[] Field1(String var0) {
      var0 = var0.substring(1, var0.length());
      int var1 = 0;

      for(int var2 = var0.length() - 1; var0.charAt(var2) == '='; --var2) {
         ++var1;
      }

      byte[] var3 = new byte[var0.length() * 6 / 8 - var1];
      int var4 = 0;

      for(int var5 = 0; var5 < var0.length(); var5 += 4) {
         int var6 = (Field1(var0.charAt(var5)) << 18) + (Field1(var0.charAt(var5 + 1)) << 12) + (Field1(var0.charAt(var5 + 2)) << 6) + Field1(var0.charAt(var5 + 3));

         for(int var7 = 0; var7 < 3 && var4 + var7 < var3.length; ++var7) {
            var3[var4 + var7] = (byte)(var6 >> 8 * (2 - var7));
         }

         var4 += 3;
      }

      return var3;
   }

   private static int Field1(char var0) {
      if (var0 >= 'A' && var0 <= 'Z') {
         return var0 - 65;
      } else if (var0 >= 'a' && var0 <= 'z') {
         return var0 - 97 + 26;
      } else if (var0 >= '0' && var0 <= '9') {
         return var0 - 48 + 52;
      } else if (var0 == '+') {
         return 62;
      } else if (var0 == '/') {
         return 63;
      } else {
         return var0 == '=' ? 0 : -1;
      }
   }

   public void Field1() {
   }
}
