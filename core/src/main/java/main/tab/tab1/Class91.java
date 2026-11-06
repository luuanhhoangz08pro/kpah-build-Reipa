package main.tab.tab1;
public class Class91 implements Class258 {
   static Thread Field1;

   public void Field1() {
      Class92.Field1 = !Class92.Field1;
      if (Class92.Field1) {
         (Field1 = new Thread(new Class92())).start();
      } else {
         Field1 = null;
      }

      (new Class92()).Field1();
   }
}
