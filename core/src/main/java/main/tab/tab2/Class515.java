package main.tab.tab2;
final class Class515 implements Class256 {
   private Class464 Field1;

   Class515(Class464 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class106.Field19.Field15.Field79 == 0) {
         Class106.Field1("Đã hết điểm kỹ năng để cộng. Xin đánh lên level để có điểm kỹ năng.");
      } else if (Class106.Field19.Field15.Field22 < Class599.Field3(this.Field1.Field4, Class357.Field97[this.Field1.Field4])) {
         Class106.Field1("Chưa đủ cấp độ để cộng. Xin đánh lên level yêu cầu để có thể cộng.");
      } else {
         Class261.Field1().Field13(this.Field1.Field4);
         Class106.Field2("Xin chờ..", true);
      }
   }
}
