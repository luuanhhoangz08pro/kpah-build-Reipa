package main.tab.tab2;
public final class Class27 extends Thread implements Class256 {
   public static int Field1;
   public static String[] Field2 = new String[]{"OFF", "ON"};

   public final void Field1() {
      Class534 var1 = (Class534)Class357.Field125.elementAt(Field1);
      String var2 = "";
      int var3 = var1.Field34.size();

      for(int var4 = 1; var4 < var3; ++var4) {
         Class826 var5 = (Class826)var1.Field34.elementAt(var4);
         String var6 = String.valueOf(String.valueOf(var5.Field1(var1.Field30))) + var5.Field2() + (var5.Field1() ? "%" : "");
         var2 = String.valueOf(String.valueOf(var2)) + Class534.Field1(var6, String.valueOf(var5.Field1(false)));
         Class106.Field1(var2);
      }

   }

   public static Class534 Field2() {
      Class534 var0 = (Class534)Class357.Field125.elementAt(Field1);
      return var0;
   }

   public final void run() {
   }
}
