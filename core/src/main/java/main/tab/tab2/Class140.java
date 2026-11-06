package main.tab.tab2;
final class Class140 implements Class256 {
   private int Field1;

   public Class140(int var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (++Class139.Field1 >= Class139.Field3.length) {
         Class139.Field1 = 0;
      }

      Class106.Field24.Field1 = false;
      if (Class139.Field1 == 1) {
         (new Thread(new Class139(this.Field1))).start();
      }

   }
}
