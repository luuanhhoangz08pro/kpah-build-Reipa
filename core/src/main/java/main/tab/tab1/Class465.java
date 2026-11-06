package main.tab.tab1;
import java.util.Vector;

final class Class465 implements Class258 {
   private Class467 Field1;

   Class465(Class467 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      if (this.Field1.Field1(true) < 5) {
         Class105.Field1("Bạn phải sử dụng đủ 5 vật phẩm.");
      } else if (this.Field1.Field1(false) < Class467.Field34) {
         Class105.Field1("Nguyên liệu không đủ. Cần " + Class467.Field34 + " nguyên liệu.");
      } else {
         Vector var1 = new Vector();
         if (Class467.Field10(this.Field1)[2] != null) {
            var1.addElement(Class467.Field10(this.Field1)[2]);
         }

         for(int var2 = 0; var2 < Class467.Field10(this.Field1).length; ++var2) {
            if (var2 != 2 && Class467.Field10(this.Field1)[var2] != null) {
               var1.addElement(Class467.Field10(this.Field1)[var2]);
            }
         }

         byte[] var7 = new byte[6];
         int var3 = this.Field1.Field28.size();

         int var4;
         for(var4 = 0; var4 < var3; ++var4) {
            Class274 var5;
            Class743 var6;
            int var8 = Integer.parseInt((var6 = Class804.Field1((var5 = (Class274)this.Field1.Field28.elementAt(var4)).Field1)).Field10.substring(var6.Field10.length() - 1));
            var7[var8 - 1] = (byte)var5.Field3;
         }

         Class263.Field1().Field1(var1, var7);
         Class105.Field2("Đang hợp..", false);

         for(var4 = 0; var4 < Class467.Field10(this.Field1).length; ++var4) {
            Class467.Field10(this.Field1)[var4] = null;
         }

         if (this.Field1.Field28 != null) {
            this.Field1.Field28.removeAllElements();
         }

         this.Field1.Field105.Field2.Field1();
      }
   }
}
