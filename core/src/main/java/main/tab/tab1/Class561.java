package main.tab.tab1;
import java.util.Vector;

final class Class561 implements Class258 {
   final Class467 Field1;
   private final Vector Field2;

   Class561(Class467 var1, Vector var2) {
      this.Field1 = var1;
      this.Field2 = var2;
   }

   public final void Field1() {
      Class185 var1 = (Class185)this.Field2.elementAt(this.Field1.Field4);
      Class105.Field2("Bạn muốn học kỹ năng " + var1.Field1 + " với giá " + var1.Field4 + "xu không? ", new Class557(this));
   }
}
