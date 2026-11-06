package main.tab.tab1;
import java.util.Vector;

final class Class681 implements Class258 {
   private final int Field1;

   Class681(Class467 var1, int var2) {
      this.Field1 = var2;
   }

   public final void Field1() {
      Vector var1 = new Vector();

      for(int var2 = 0; var2 < 5; ++var2) {
         var1.addElement(new Class87("Phím số " + (1 + var2 * 2), new Class683(this, var2, this.Field1)));
      }

      Class105.Field21.Field1(var1, 2);
   }
}
