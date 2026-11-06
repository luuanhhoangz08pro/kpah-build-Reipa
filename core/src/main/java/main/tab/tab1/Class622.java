package main.tab.tab1;
final class Class622 implements Class258 {
   private Class326 Field1;

   Class622(Class326 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class105.Field19.Field15.Field79 == 0) {
         Class105.Field1("Đã hết điểm kỹ năng để cộng. Xin đánh lên level để có điểm kỹ năng.");
      } else if (Class105.Field19.Field15.Field22 < Class602.Field3(this.Field1.Field3, Class359.Field97[this.Field1.Field3])) {
         Class105.Field1("Chưa đủ cấp độ để cộng. Xin đánh lên level yêu cầu để có thể cộng.");
      } else {
         Class263.Field1().Field13(this.Field1.Field3);
         Class105.Field2("Xin chờ..", true);
      }
   }
}
