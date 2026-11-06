package main.tab.tab1;
import java.util.Vector;

final class Class159 implements Class258 {
   private Class160 Field1;

   Class159(Class160 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      try {
         int var1 = Integer.parseInt(Class105.Field25.Field1.Field5());
         Class105.Field7();
         if (var1 < 0) {
            Class105.Field1("Không thể bán với giá này");
         } else {
            Class537 var2;
            if (!Class537.Field1((var2 = (Class537)((Vector)Class376.Field1.elementAt(Class376.Field1(this.Field1.Field1))).elementAt(this.Field1.Field1.Field4)).Field2().Field11[9]) && var2.Field23 <= 0) {
               Class105.Field2("Bạn có muốn đặt bán vật phẩm này với giá " + var1 + "  không?", new Class158(this, var2, var1));
            } else {
               Class105.Field1("Không thể bán vật phẩm này");
            }
         }
      } catch (Exception var3) {
         Class105.Field7();
         Class105.Field1("Nhập sai,vui lòng chỉ nhập số");
      }
   }
}
