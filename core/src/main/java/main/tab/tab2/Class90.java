package main.tab.tab2;
public class Class90 implements Class256 {
   static Thread Field1;

   public void Field1() {
      Class91.Field1 = !Class91.Field1;
      if (Class91.Field1) {
         (Field1 = new Thread(new Class91())).start();
      } else {
         Field1 = null;
      }

      (new Class91()).Field1();
   }
}
