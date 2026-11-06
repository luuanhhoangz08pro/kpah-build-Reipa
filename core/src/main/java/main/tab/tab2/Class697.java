package main.tab.tab2;
final class Class697 implements Class256 {
   private Class464 Field1;

   Class697(Class464 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      String var1;
      if (!(var1 = Class106.Field25.Field1.Field5()).equals("")) {
         try {
            int var3;
            if ((var3 = Integer.parseInt(var1)) > Class106.Field19.Field15.Field78) {
               Class106.Field1("Bạn chỉ còn " + Class106.Field19.Field15.Field78 + " điểm tiềm năng");
            } else {
               Class261.Field1().Field11(this.Field1.Field4, var3);
               Class106.Field8();
            }
         } catch (Exception var2) {
            Class106.Field1("Có lỗi xảy ra. Vui lòng chỉ nhập số.");
         }
      }
   }
}
