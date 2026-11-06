package main.tab.tab1;
final class Class716 implements Class258 {
   private Class326 Field1;

   Class716(Class326 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      String var1;
      if (!(var1 = Class105.Field25.Field1.Field5()).equals("")) {
         try {
            int var3;
            if ((var3 = Integer.parseInt(var1)) > Class105.Field19.Field15.Field78) {
               Class105.Field1("Bạn chỉ còn " + Class105.Field19.Field15.Field78 + " điểm tiềm năng");
            } else {
               Class263.Field1().Field11(this.Field1.Field3, var3);
               Class105.Field8();
            }
         } catch (Exception var2) {
            Class105.Field1("Có lỗi xảy ra. Vui lòng chỉ nhập số.");
         }
      }
   }
}
