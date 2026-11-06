package main.tab.tab1;
import java.util.Vector;

final class Class327 implements Class258 {
   final Class376 Field1;
   private final Vector Field2;

   Class327(Class376 var1, Vector var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      this.Field1.Field7 = false;
      Vector var1 = new Vector();
      if (Class376.Field8 > 0L) {
         var1.addElement(new Class87("Rút tiền", new Class329(this)));
      }

      if (this.Field2.size() > 0 && this.Field1.Field4 >= 0) {
         var1.addElement(new Class87("Bỏ vào hành trang", new Class315(this)));
      }

      Class105.Field21.Field1(var1, 2);
   }
}
