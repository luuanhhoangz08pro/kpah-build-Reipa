package main.tab.tab1;
import java.util.Vector;

public class Class92 implements Class258, Runnable {
   public static boolean Field1;

   public void Field1() {
      Vector var1 = new Vector();
      var1.addElement(new Class87(Field1 ? "OFF" : "ON", new Class91()));
      var1.addElement(new Class87("Nội dung", new Class90(0)));
      Class105.Field21.Field1(var1, 3);
   }

   public void run() {
      String var1 = Class93.Field1("chat1", 1) == null ? new String() : new String(Class93.Field1("chat1", 1));
      String[] var2 = this.Field1(var1);
      int var3 = 0;

      while(Field1) {
         Class263.Field1().Field1(var2[var3]);
         ++var3;
         if (var3 > var2.length - 1) {
            var3 = 0;
         }

         try {
            Thread.sleep(4000L);
         } catch (InterruptedException var5) {
         }
      }

   }

   public String[] Field1(String var1) {
      int var2;
      Vector var3;
      for(var3 = new Vector(); (var2 = var1.indexOf(10)) != -1; var1 = var1.substring(var2 + 1)) {
         var3.addElement(var1.substring(0, var2));
      }

      var3.addElement(var1);
      String[] var4 = new String[var3.size()];
      var3.copyInto(var4);
      return var4;
   }
}
