package main.tab.tab2;
import java.util.Vector;

final class Class163 implements Class256 {
   private Class164 Field1;

   Class163(Class164 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      try {
         int var1 = Integer.parseInt(Class106.Field25.Field1.Field5());
         Class106.Field7();
         if (var1 < 0) {
            Class106.Field1("Không thể bán với giá này");
         } else {
            Class534 var2;
            if (!Class534.Field1((var2 = (Class534)((Vector)Class374.Field1.elementAt(Class374.Field1(this.Field1.Field1))).elementAt(this.Field1.Field1.Field4)).Field2().Field11[9]) && var2.Field23 <= 0) {
               Class106.Field2("Bạn có muốn đặt bán vật phẩm này với giá " + var1 + "  không?", new Class162(this, var2, var1));
            } else {
               Class106.Field1("Không thể bán vật phẩm này");
            }
         }
      } catch (Exception var3) {
         Class106.Field7();
         Class106.Field1("Nhập sai,vui lòng chỉ nhập số");
      }
   }
}
