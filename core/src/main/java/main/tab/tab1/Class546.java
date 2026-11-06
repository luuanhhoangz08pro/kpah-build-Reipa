package main.tab.tab1;
import java.util.Vector;

final class Class546 implements Class258 {
   final Class354 Field1;

   Class546(Class354 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field20 = -1;
      if (Class354.Field1.size() <= 0) {
         Class105.Field1("Không có nguyên liệu.", new Class545(this));
      } else if (Class354.Field13 == null) {
         Class105.Field1("Chưa đặt vật phẩm.", new Class286(this));
      } else {
         int var4;
         if (this.Field1.Field9 != 0 && this.Field1.Field9 != 2 && this.Field1.Field9 != 3 && this.Field1.Field9 != 4) {
            if (Class354.Field14 == null) {
               Class105.Field1("Bạn chưa chọn luyện kim dược", new Class288(this));
            } else {
               Vector var10 = new Vector();
               Vector var11 = new Vector();
               var10.addElement(String.valueOf(Class354.Field14.Field1));
               var11.addElement(String.valueOf(Class354.Field14.Field4 ? 1 : 0));
               Class354.Field23 = Class354.Field14.Field4;
               Class354.Field27 = Class354.Field14.Field1;
               if (Class354.Field15 != null) {
                  var10.addElement(String.valueOf(Class354.Field15.Field1));
                  var11.addElement(String.valueOf(Class354.Field15.Field4 ? 1 : 0));
                  Class354.Field25 = Class354.Field15.Field4;
                  Class354.Field29 = Class354.Field15.Field1;
               } else {
                  var10.addElement("-1");
                  var11.addElement("0");
                  Class354.Field25 = false;
                  Class354.Field29 = -1;
               }

               if (Class354.Field16 != null) {
                  var10.addElement(String.valueOf(Class354.Field16.Field1));
                  var11.addElement(String.valueOf(Class354.Field16.Field4 ? 1 : 0));
                  Class354.Field24 = Class354.Field16.Field4;
                  Class354.Field28 = Class354.Field16.Field1;
               } else {
                  var10.addElement("-1");
                  var11.addElement("0");
                  Class354.Field24 = false;
                  Class354.Field28 = -1;
               }

               Class354.Field30 = Class354.Field13.Field9;
               Vector var12 = new Vector();

               for(var4 = 1; var4 <= 15; ++var4) {
                  var12.addElement(new Class87("Cộng " + var4, new Class283(this, var10, var4, var11)));
               }

               Class105.Field21.Field1(var12, 3);
               Class105.Field23 = null;
            }
         } else if (Class354.Field14 != null) {
            if (this.Field1.Field9 == 0) {
               Class263.Field1().Field1((short)Class354.Field13.Field9, (int)1, (int)Class354.Field14.Field1, (int)(Class354.Field14.Field4 ? 1 : 0));
               this.Field1.Field103 = this.Field1.Field12;
               this.Field1.Field7();
            } else if (this.Field1.Field9 == 2) {
               Class263.Field1().Field1((short)Class354.Field13.Field9, (int)2, (int)Class354.Field14.Field1, (int)(Class354.Field14.Field4 ? 1 : 0));
               this.Field1.Field103 = this.Field1.Field12;
               Class105.Field1("Xin chờ");
            } else if (this.Field1.Field9 == 4) {
               if (Class354.Field15 != null) {
                  Class263 var10000 = Class263.Field1();
                  int var10004 = Class354.Field14.Field4 ? 1 : 0;
                  int var6 = Class354.Field15.Field4 ? 1 : 0;
                  short var5 = Class354.Field15.Field1;
                  var4 = var10004;
                  short var3 = Class354.Field14.Field1;
                  boolean var1 = true;
                  short var2 = Class354.Field13.Field9;
                  Class263 var9 = var10000;
                  Class86 var7 = new Class86((byte)-68);

                  try {
                     var7.Field3().writeByte(5);
                     var7.Field3().writeShort(var2);
                     var7.Field3().writeShort(var3);
                     var7.Field3().writeByte(var4);
                     var7.Field3().writeShort(var5);
                     var7.Field3().writeByte(var6);
                  } catch (Exception var8) {
                     var8.printStackTrace();
                  }

                  var9.Field1.Field1(var7);
                  this.Field1.Field103 = this.Field1.Field12;
                  Class105.Field1("Xin chờ");
               } else {
                  Class105.Field1("Chưa đặt đá.", new Class388(this));
               }
            } else {
               Class263.Field1().Field1((short)Class354.Field13.Field9, (int)3, (int)Class354.Field14.Field1, (int)(Class354.Field14.Field4 ? 1 : 0));
               this.Field1.Field103 = this.Field1.Field12;
               Class105.Field1("Xin chờ");
            }
         } else {
            Class105.Field1(this.Field1.Field9 == 4 ? "Bạn chưa chọn bột" : "Bạn chưa chọn đá thuộc tính.", new Class287(this));
         }
      }
   }
}
