package main.tab.tab2;
final class Class523 implements Class256 {
   private Class464 Field1;
   private final int Field2;
   private final int Field3;

   Class523(Class464 var1, int var2, int var3) {
      this.Field1 = var1;
      this.Field2 = var2;
      this.Field3 = var3;
   }

   public final void Field1() {
      Class534 var1;
      int var6;
      if (this.Field2 == 4) {
         if (this.Field3 < Class357.Field125.size()) {
            if ((var1 = (Class534)Class357.Field125.elementAt(this.Field3)).Field23 > 0) {
               Class106.Field1("Không được đập đồ thuê.");
               return;
            }

            if (Class106.Field19.Field15.Field142 == null && !var1.Field26) {
               Class106.Field19.Field15.Field142 = var1;
               Class805 var2;
               if ((var2 = Class811.Field2((int)var1.Field18)).Field3 >= 3 && var2.Field3 <= 7) {
                  if (var2.Field3 >= 3 && var2.Field3 < 8) {
                     Class261.Field1().Field1((int)2, (int)var2.Field3, (int)var2.Field4, (byte)0);
                     Class106.Field8();
                  }
               } else {
                  this.Field1.Field60 = Class379.Field1(var2.Field8).Field1;
               }
            }

            Class464.Field1(this.Field1, this.Field3);
            Class261.Field1().Field1(var1.Field9);
         } else {
            if (Class582.Field36.size() >= 8) {
               Class106.Field1("Không thể thêm");
               return;
            }

            if ((var6 = this.Field3 - Class357.Field125.size()) < this.Field1.Field27.size()) {
               Class272 var8 = (Class272)this.Field1.Field27.elementAt(var6);
               Class230 var7;
               (var7 = new Class230(var8.Field2)).Field2 = var8.Field1;
               boolean var3 = false;
               if (Class464.Field22[Class464.Field21] == 21 && Class582.Field36.size() == 0 && (var7.Field2 <= 7 || var7.Field2 == 155 || var7.Field2 == 156)) {
                  var3 = true;
               }

               if (!var3) {
                  if (Class357.Field27() >= 1 && var8.Field1 < 5) {
                     Class106.Field1("Chỉ có thể sử dụng 1 loại bảo hiểm cho 1 lần luyện.");
                     return;
                  }

                  if (Class357.Field26() >= 1 && var8.Field1 >= 8 && var8.Field1 != 155 && var8.Field1 != 156) {
                     Class106.Field1("Không thể sử dụng 2 loại ngọc cho 1 lần luyện.");
                     return;
                  }

                  Class582.Field36.addElement(var7);
                  --var8.Field3;
                  if (var8.Field3 == 0) {
                     this.Field1.Field27.removeElement(var8);
                  }

                  Class261.Field1().Field1((short)var7.Field1, (byte)0);
               } else {
                  Class106.Field1("Phải đặt luyện kim dược trước.");
               }
            }
         }
      } else if (this.Field3 == 1) {
         if (Class464.Field5(this.Field1) != -1) {
            var1 = (Class534)Class357.Field125.elementAt(Class464.Field5(this.Field1));
            Class261.Field1().Field1(var1.Field9);
            Class464.Field1((Class464)this.Field1, (int)-1);
            Class106.Field19.Field15.Field142 = null;
            this.Field1.Field60 = null;
         }
      } else if ((var6 = (this.Field2 << 1) + this.Field3 / 2) < Class582.Field36.size()) {
         Class230 var9 = (Class230)Class582.Field36.elementAt(var6);
         Class582.Field36.removeElement(var9);
         boolean var10 = false;
         int var12 = this.Field1.Field27.size();

         for(int var4 = 0; var4 < var12; ++var4) {
            Class272 var5;
            if ((var5 = (Class272)this.Field1.Field27.elementAt(var4)).Field1 == var9.Field2) {
               ++var5.Field3;
               var10 = true;
               break;
            }
         }

         if (!var10) {
            Class272 var13;
            (var13 = new Class272(var9.Field2)).Field2 = var9.Field1;
            this.Field1.Field27.addElement(var13);
         }

         Class261.Field1().Field1((short)var9.Field1, (byte)1);
      }

      var6 = this.Field1.Field4 % this.Field1.Field5;
      int var11 = this.Field1.Field4 / this.Field1.Field5;
      this.Field1.Field5 = Class357.Field125.size() + this.Field1.Field27.size();
      if (this.Field1.Field5 < 6) {
         this.Field1.Field5 = 6;
      }

      if (var6 >= this.Field1.Field5) {
         var6 = this.Field1.Field5 - 1;
      }

      this.Field1.Field4 = var11 * this.Field1.Field5 + var6;
      if ((Class464.Field20 = this.Field1.Field5 * this.Field1.Field7 - this.Field1.Field2 + 6) < 0) {
         Class464.Field20 = 0;
      }

      if (Class464.Field19 > Class464.Field20) {
         Class464.Field19 = Class464.Field18 = Class464.Field20;
      }

   }
}
