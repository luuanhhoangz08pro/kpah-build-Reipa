package main.tab.tab1;
import java.util.Vector;

final class Class398 implements Class258 {
   final Class376 Field1;

   Class398(Class376 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field7 = false;
      Vector var1 = new Vector();
      if (!Class376.Field3(this.Field1) && ((Vector)Class376.Field1.elementAt(Class376.Field1(this.Field1))).size() > 0 && this.Field1.Field4 > -1) {
         if (this.Field1.Field4 < 0) {
            return;
         }

         Class537 var2;
         if (!(var2 = (Class537)((Vector)Class376.Field1.elementAt(Class376.Field1(this.Field1))).elementAt(this.Field1.Field4)).Field1()) {
            var1.addElement(new Class87("Mua", new Class397(this, var2)));
            if (this.Field1.Field11()) {
               var1.addElement(new Class87("Bid", new Class399(this, var2)));
            }
         }
      }

      if (Class376.Field4(this.Field1)) {
         var1.addElement(new Class87("Tìm", new Class331(this)));
      }

      if (Class376.Field5(this.Field1) != 0) {
         var1.addElement(new Class87("Tìm theo loại", new Class335(this)));
      }

      if (Class376.Field5(this.Field1) != 1) {
         var1.addElement(new Class87("Tìm theo người bán", new Class334(this)));
      }

      if (((Vector)Class376.Field1.elementAt(Class376.Field1(this.Field1))).size() > 0) {
         var1.addElement(new Class87("Kết quả", new Class337(this)));
      }

      if (Class376.Field2[Class376.Field1(this.Field1)] > 0) {
         if (Class376.Field3[Class376.Field1(this.Field1)] < Class376.Field2[Class376.Field1(this.Field1)] - 1) {
            var1.addElement(new Class87("Trang sau", new Class336(this)));
         }

         if (Class376.Field3[Class376.Field1(this.Field1)] > 0) {
            var1.addElement(new Class87("Trang trước", new Class328(this)));
         }
      }

      Class105.Field21.Field1(var1, 0);
   }
}
