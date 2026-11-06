package main.tab.tab2;
final class Class839 implements Class256 {
   final Class464 Field1;
   public static int Field2 = 500;
   public static int Field3;
   public static int Field4;

   Class839(Class464 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field19();
      if (!Class464.Field11(this.Field1)) {
         Class750 var2 = (Class750)Class106.Field19.Field21.elementAt(Field3);
         boolean var3 = false;
         boolean var4 = false;
         Class272 var5 = Class272.Field1(var2.Field15);
         if (var5 != null) {
            int var10 = var5.Field3;
            var3 = true;
         }

         if (!var3 && Class106.Field19.Field15.Field20()) {
            Class464.Field1(this.Field1, "Hành trang đã đầy", this.Field1.Field4 % this.Field1.Field5 * 18, this.Field1.Field4 / this.Field1.Field5 * 18);
         } else {
            Class750 var6 = Class811.Field1(var2.Field15);
            Class768 var7 = new Class768(Class464.Field1);
            Class766 var8 = new Class766(var7, var6, var2, Field2);
            Class770 var9 = new Class770(var8, var6, Field4, Field4, var2);
            var9.Field1();
         }
      }
   }

   public static void Field1(int var0, int var1) {
      try {
         Field3 = var0;
         Field4 = var1;
         Class464 var2 = new Class464();
         Class280 var3 = new Class280(Class464.Field1);
         Class839 var4 = new Class839(var2);
         Class261.Field1().Field12(6);
         Class858.Field1(500L);
         var4.Field1();
         Class858.Field1(200L);
         var3.Field1();
      } catch (Exception var5) {
      }

   }
}
