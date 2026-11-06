package main.tab.tab2;
import java.util.Vector;

final class Class543 implements Class256 {
   final Class352 Field1;

   Class543(Class352 var1) {
      this.Field1 = var1;
   }

   public final void Field1() {
      this.Field1.Field20 = -1;
      if (Class352.Field1.size() <= 0) {
         Class106.Field1("Không có nguyên liệu.", new Class542(this));
      } else if (Class352.Field13 == null) {
         Class106.Field1("Chưa đặt vật phẩm.", new Class284(this));
      } else {
         int var4;
         if (this.Field1.Field9 != 0 && this.Field1.Field9 != 2 && this.Field1.Field9 != 3 && this.Field1.Field9 != 4) {
            if (Class352.Field14 == null) {
               Class106.Field1("Bạn chưa chọn luyện kim dược", new Class286(this));
            } else {
               Vector var10 = new Vector();
               Vector var11 = new Vector();
               var10.addElement(String.valueOf(Class352.Field14.Field1));
               var11.addElement(String.valueOf(Class352.Field14.Field4 ? 1 : 0));
               Class352.Field23 = Class352.Field14.Field4;
               Class352.Field27 = Class352.Field14.Field1;
               if (Class352.Field15 != null) {
                  var10.addElement(String.valueOf(Class352.Field15.Field1));
                  var11.addElement(String.valueOf(Class352.Field15.Field4 ? 1 : 0));
                  Class352.Field25 = Class352.Field15.Field4;
                  Class352.Field29 = Class352.Field15.Field1;
               } else {
                  var10.addElement("-1");
                  var11.addElement("0");
                  Class352.Field25 = false;
                  Class352.Field29 = -1;
               }

               if (Class352.Field16 != null) {
                  var10.addElement(String.valueOf(Class352.Field16.Field1));
                  var11.addElement(String.valueOf(Class352.Field16.Field4 ? 1 : 0));
                  Class352.Field24 = Class352.Field16.Field4;
                  Class352.Field28 = Class352.Field16.Field1;
               } else {
                  var10.addElement("-1");
                  var11.addElement("0");
                  Class352.Field24 = false;
                  Class352.Field28 = -1;
               }

               Class352.Field30 = Class352.Field13.Field9;
               Vector var12 = new Vector();

               for(var4 = 1; var4 <= 15; ++var4) {
                  var12.addElement(new Class86("Cộng " + var4, new Class281(this, var10, var4, var11)));
               }

               Class106.Field21.Field1(var12, 3);
               Class106.Field23 = null;
            }
         } else if (Class352.Field14 != null) {
            if (this.Field1.Field9 == 0) {
               Class261.Field1().Field1((short)Class352.Field13.Field9, (int)1, (int)Class352.Field14.Field1, (int)(Class352.Field14.Field4 ? 1 : 0));
               this.Field1.Field103 = this.Field1.Field12;
               this.Field1.Field7();
            } else if (this.Field1.Field9 == 2) {
               Class261.Field1().Field1((short)Class352.Field13.Field9, (int)2, (int)Class352.Field14.Field1, (int)(Class352.Field14.Field4 ? 1 : 0));
               this.Field1.Field103 = this.Field1.Field12;
               Class106.Field1("Xin chờ");
            } else if (this.Field1.Field9 == 4) {
               if (Class352.Field15 != null) {
                  Class261 var10000 = Class261.Field1();
                  int var10004 = Class352.Field14.Field4 ? 1 : 0;
                  int var6 = Class352.Field15.Field4 ? 1 : 0;
                  short var5 = Class352.Field15.Field1;
                  var4 = var10004;
                  short var3 = Class352.Field14.Field1;
                  boolean var1 = true;
                  short var2 = Class352.Field13.Field9;
                  Class261 var9 = var10000;
                  Class85 var7 = new Class85((byte)-68);

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
                  Class106.Field1("Xin chờ");
               } else {
                  Class106.Field1("Chưa đặt đá.", new Class386(this));
               }
            } else {
               Class261.Field1().Field1((short)Class352.Field13.Field9, (int)3, (int)Class352.Field14.Field1, (int)(Class352.Field14.Field4 ? 1 : 0));
               this.Field1.Field103 = this.Field1.Field12;
               Class106.Field1("Xin chờ");
            }
         } else {
            Class106.Field1(this.Field1.Field9 == 4 ? "Bạn chưa chọn bột" : "Bạn chưa chọn đá thuộc tính.", new Class285(this));
         }
      }
   }
}
