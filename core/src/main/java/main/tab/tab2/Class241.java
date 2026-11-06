package main.tab.tab2;
import java.util.Vector;

public class Class241 implements Class256 {
   private Class587 Field2;
   public static String Field1 = Field2();

   Class241(Class587 var1) {
      this.Field2 = var1;
   }

   public void Field1() {
      Vector var1 = new Vector();
      var1.addElement(new Class86("Auto quay + mua vé thường", new Class140(0)));
      var1.addElement(new Class86("Auto quay + mua vé đặc biệt", new Class140(1)));
      var1.addElement(new Class86(Field2(), new Class140(2)));
      Class106.Field21.Field1(var1, 0);
   }

   public static String Field2() {
      return Class139.Field1 != 0 ? "Dừng Auto" : "Auto quay";
   }
}
