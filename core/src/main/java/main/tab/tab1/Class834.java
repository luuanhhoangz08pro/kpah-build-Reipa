package main.tab.tab1;
public final class Class834 extends Thread implements Class258 {
   public int Field1;
   public static String[] Field2 = new String[]{"Sức Mạnh", "Khéo Léo", "Tinh Thần", "Sức Khỏe", "May Mắn"};

   public Class834(int var1) {
      this.Field1 = var1;
   }

   public String Field2() {
      return "Tiềm Năng : " + Field2[this.Field1];
   }

   public final void Field1() {
      this.start();
   }

   public final void run() {
      try {
         if (Class105.Field19.Field15.Field100 < 50) {
            Class105.Field1("Hết tiền.");
            return;
         }

         Class263.Field1().Field3((int)6);

         while(Class105.Field19.Field15.Field78 == 0) {
            Class105.Field19.Field2((int)25);
            Class844.Field1(20L);
         }

         Class263.Field1().Field11(this.Field1, Class105.Field19.Field15.Field78);
         Class63.Field1("Xong " + this.Field2());
      } catch (Exception var2) {
      }

   }
}
