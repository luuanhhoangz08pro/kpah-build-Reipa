package main.tab.tab2;
import java.util.Vector;

final class Class150 implements Class256 {
   private Class268 Field1;

   Class150(Class268 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      Vector var1 = new Vector();
      var1.addElement(new Class86(Class111.Field2(), new Class111(0)));
      if (this.Field1.Field6.size() > 0) {
         Class740 var2 = (Class740)this.Field1.Field6.elementAt(Class268.Field2(this.Field1));
         if (var2.Field4 == 0) {
            var1.addElement(this.Field1.Field8);
         } else if (var2.Field4 == 2 || var2.Field4 == 3) {
            var1.addElement(this.Field1.Field9);
         }

         Class106.Field21.Field1(var1, 0);
      }

   }
}
