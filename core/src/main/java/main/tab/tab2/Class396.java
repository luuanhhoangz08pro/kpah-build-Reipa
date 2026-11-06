package main.tab.tab2;
import java.util.Vector;

final class Class396 implements Class256 {
   final Class374 Field1;

   Class396(Class374 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field7 = false;
      Vector var1 = new Vector();
      if (!Class374.Field3(this.Field1) && ((Vector)Class374.Field1.elementAt(Class374.Field1(this.Field1))).size() > 0 && this.Field1.Field4 > -1) {
         if (this.Field1.Field4 < 0) {
            return;
         }

         Class534 var2;
         if (!(var2 = (Class534)((Vector)Class374.Field1.elementAt(Class374.Field1(this.Field1))).elementAt(this.Field1.Field4)).Field1()) {
            var1.addElement(new Class86("Mua", new Class395(this, var2)));
            if (this.Field1.Field11()) {
               var1.addElement(new Class86("Bid", new Class397(this, var2)));
            }
         }
      }

      if (Class374.Field4(this.Field1)) {
         var1.addElement(new Class86("Tìm", new Class329(this)));
      }

      if (Class374.Field5(this.Field1) != 0) {
         var1.addElement(new Class86("Tìm theo loại", new Class333(this)));
      }

      if (Class374.Field5(this.Field1) != 1) {
         var1.addElement(new Class86("Tìm theo người bán", new Class332(this)));
      }

      if (((Vector)Class374.Field1.elementAt(Class374.Field1(this.Field1))).size() > 0) {
         var1.addElement(new Class86("Kết quả", new Class335(this)));
      }

      if (Class374.Field2[Class374.Field1(this.Field1)] > 0) {
         if (Class374.Field3[Class374.Field1(this.Field1)] < Class374.Field2[Class374.Field1(this.Field1)] - 1) {
            var1.addElement(new Class86("Trang sau", new Class334(this)));
         }

         if (Class374.Field3[Class374.Field1(this.Field1)] > 0) {
            var1.addElement(new Class86("Trang trước", new Class326(this)));
         }
      }

      Class106.Field21.Field1(var1, 0);
   }
}
