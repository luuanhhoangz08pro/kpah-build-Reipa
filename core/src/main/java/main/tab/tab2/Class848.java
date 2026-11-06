package main.tab.tab2;
public final class Class848 extends Thread implements Class256 {
   public int Field1;
   public static String[] Field2 = new String[]{"Sức Mạnh", "Khéo Léo", "Tinh Thần", "Sức Khỏe", "May Mắn"};

   public Class848(int var1) {
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
         Class261.Field1().Field3((int)6);
         Class858.Field1(200L);
         Class106.Field19.Field2((int)25);
         Class858.Field1(200L);
         Class261.Field1().Field11(this.Field1, Class106.Field19.Field15.Field78);
         Class62.Field1("Xong " + this.Field2());
      } catch (Exception var2) {
      }

   }
}
