package main.tab.tab2;
import java.util.Vector;

final class Class325 implements Class256 {
   final Class374 Field1;
   private final Vector Field2;

   Class325(Class374 var1, Vector var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      this.Field1.Field7 = false;
      Vector var1 = new Vector();
      if (Class374.Field8 > 0L) {
         var1.addElement(new Class86("Rút tiền", new Class327(this)));
      }

      if (this.Field2.size() > 0 && this.Field1.Field4 >= 0) {
         var1.addElement(new Class86("Bỏ vào hành trang", new Class313(this)));
      }

      Class106.Field21.Field1(var1, 2);
   }
}
