package main.tab.tab1;
final class Class526 implements Class258 {
   private Class467 Field1;
   private final int Field2;
   private final int Field3;

   Class526(Class467 var1, int var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      Class537 var1;
      int var6;
      if (this.Field2 == 4) {
         if (this.Field3 < Class359.Field125.size()) {
            if ((var1 = (Class537)Class359.Field125.elementAt(this.Field3)).Field23 > 0) {
               Class105.Field1("Không được đập đồ thuê.");
               return;
            }

            if (Class105.Field19.Field15.Field142 == null && !var1.Field26) {
               Class105.Field19.Field15.Field142 = var1;
               Class798 var2;
               if ((var2 = Class804.Field2((int)var1.Field18)).Field3 >= 3 && var2.Field3 <= 7) {
                  if (var2.Field3 >= 3 && var2.Field3 < 8) {
                     Class263.Field1().Field1((int)2, (int)var2.Field3, (int)var2.Field4, (byte)0);
                     Class105.Field8();
                  }
               } else {
                  this.Field1.Field60 = Class381.Field1(var2.Field8).Field1;
               }
            }

            Class467.Field1(this.Field1, this.Field3);
            Class263.Field1().Field1(var1.Field9);
         } else {
            if (Class585.Field36.size() >= 8) {
               Class105.Field1("Không thể thêm");
               return;
            }

            if ((var6 = this.Field3 - Class359.Field125.size()) < this.Field1.Field27.size()) {
               Class274 var8 = (Class274)this.Field1.Field27.elementAt(var6);
               Class231 var7;
               (var7 = new Class231(var8.Field2)).Field2 = var8.Field1;
               boolean var3 = false;
               if (Class467.Field22[Class467.Field21] == 21 && Class585.Field36.size() == 0 && (var7.Field2 <= 7 || var7.Field2 == 155 || var7.Field2 == 156)) {
                  var3 = true;
               }

               if (!var3) {
                  if (Class359.Field27() >= 1 && var8.Field1 < 5) {
                     Class105.Field1("Chỉ có thể sử dụng 1 loại bảo hiểm cho 1 lần luyện.");
                     return;
                  }

                  if (Class359.Field26() >= 1 && var8.Field1 >= 8 && var8.Field1 != 155 && var8.Field1 != 156) {
                     Class105.Field1("Không thể sử dụng 2 loại ngọc cho 1 lần luyện.");
                     return;
                  }

                  Class585.Field36.addElement(var7);
                  --var8.Field3;
                  if (var8.Field3 == 0) {
                     this.Field1.Field27.removeElement(var8);
                  }

                  Class263.Field1().Field1((short)var7.Field1, (byte)0);
               } else {
                  Class105.Field1("Phải đặt luyện kim dược trước.");
               }
            }
         }
      } else if (this.Field3 == 1) {
         if (Class467.Field5(this.Field1) != -1) {
            var1 = (Class537)Class359.Field125.elementAt(Class467.Field5(this.Field1));
            Class263.Field1().Field1(var1.Field9);
            Class467.Field1((Class467)this.Field1, (int)-1);
            Class105.Field19.Field15.Field142 = null;
            this.Field1.Field60 = null;
         }
      } else if ((var6 = (this.Field2 << 1) + this.Field3 / 2) < Class585.Field36.size()) {
         Class231 var9 = (Class231)Class585.Field36.elementAt(var6);
         Class585.Field36.removeElement(var9);
         boolean var10 = false;
         int var12 = this.Field1.Field27.size();

         for(int var4 = 0; var4 < var12; ++var4) {
            Class274 var5;
            if ((var5 = (Class274)this.Field1.Field27.elementAt(var4)).Field1 == var9.Field2) {
               ++var5.Field3;
               var10 = true;
               break;
            }
         }

         if (!var10) {
            Class274 var13;
            (var13 = new Class274(var9.Field2)).Field2 = var9.Field1;
            this.Field1.Field27.addElement(var13);
         }

         Class263.Field1().Field1((short)var9.Field1, (byte)1);
      }

      var6 = this.Field1.Field4 % this.Field1.Field5;
      int var11 = this.Field1.Field4 / this.Field1.Field5;
      this.Field1.Field5 = Class359.Field125.size() + this.Field1.Field27.size();
      if (this.Field1.Field5 < 6) {
         this.Field1.Field5 = 6;
      }

      if (var6 >= this.Field1.Field5) {
         var6 = this.Field1.Field5 - 1;
      }

      this.Field1.Field4 = var11 * this.Field1.Field5 + var6;
      if ((Class467.Field20 = this.Field1.Field5 * this.Field1.Field7 - this.Field1.Field2 + 6) < 0) {
         Class467.Field20 = 0;
      }

      if (Class467.Field19 > Class467.Field20) {
         Class467.Field19 = Class467.Field18 = Class467.Field20;
      }

   }
}
