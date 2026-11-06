package main.tab.tab2;
import java.util.Vector;

final class Class687 implements Class256 {
   private final int Field1;

   Class687(Class464 var1, int var2) {
      this.Field1 = var2;
   }

   public final void Field1() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < 5; ++var2) {
         var1.addElement(new Class86("Phím số " + (1 + var2 * 2), new Class689(this, var2, this.Field1)));
      }

      Class106.Field21.Field1(var1, 2);
   }
}
