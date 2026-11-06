package main.tab.tab1;
public class Class26 extends Thread implements Class258 {
   public final void Field1() {
      this.start();
   }

   public final void run() {
      try {
         for(int var1 = 0; var1 < Class359.Field125.size(); ++var1) {
            Class537 var2 = (Class537)Class359.Field125.elementAt(var1);
            Class798 var3 = Class804.Field2((int)var2.Field18);
            if (var3.Field1.contains("kỳ lân")) {
               Class467.Field1.Field1(var2);
            }

            String var4 = "";

            for(byte var5 = 0; var5 < var2.Field34.size(); ++var5) {
               Class818 var6 = (Class818)var2.Field34.elementAt(var5);
               String var7 = var6.Field1(var2.Field30) + var6.Field2() + (var6.Field1() ? "%" : "");
               if ((var4 = var4 + Class537.Field1(var7, String.valueOf(var6.Field1(var2.Field15 == 1)))).contains("Tỷ lệ") || var4.contains("10%") || var4.contains("50.0%")) {
                  Class467.Field1.Field1(var2);
               }
            }
         }
      } catch (Exception var8) {
         var8.printStackTrace();
      }

   }
}
