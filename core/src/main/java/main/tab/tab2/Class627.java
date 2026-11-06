package main.tab.tab2;
final class Class627 implements Class256 {
   private Class324 Field1;

   Class627(Class324 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (Class106.Field19.Field15.Field79 == 0) {
         Class106.Field1("Đã hết điểm kỹ năng để cộng. Xin đánh lên level để có điểm kỹ năng.");
      } else if (Class106.Field19.Field15.Field22 < Class599.Field3(this.Field1.Field3, Class357.Field97[this.Field1.Field3])) {
         Class106.Field1("Chưa đủ cấp độ để cộng. Xin đánh lên level yêu cầu để có thể cộng.");
      } else {
         Class261.Field1().Field13(this.Field1.Field3);
         Class106.Field2("Xin chờ..", true);
      }
   }
}
