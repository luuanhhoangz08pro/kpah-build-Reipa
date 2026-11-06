package main.tab.tab2;
import java.util.Vector;

final class Class699 implements Class256 {
   final Class324 Field1;
   private final Vector Field2;

   Class699(Class324 var1, Vector var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      Class189 var1 = (Class189)this.Field2.elementAt(this.Field1.Field3);
      Class106.Field2("Bạn muốn học kỹ năng " + var1.Field1 + " với giá " + var1.Field4 + "xu không? ", new Class702(this));
   }
}
