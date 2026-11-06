package main.tab.tab1;
import java.util.Vector;

public final class Class229 {
   public byte Field1 = 0;
   public short Field2;
   public short Field3 = 32000;
   public short Field4 = 32000;
   public byte Field5 = 0;
   public Vector Field6 = new Vector();
   public Vector Field7 = new Vector();
   public String Field8 = "";
   public String Field9 = "";
   public short[] Field10;
   public short[] Field11;
   public short[] Field12;
   public byte Field13 = 0;
   public short[] Field14;
   public short[] Field15;
   public short[] Field16;
   public String Field17 = "";
   public boolean Field18 = false;
   public short Field19 = 0;
   byte Field20 = 0;

   public Class229(int var1) {
      this.Field20 = 0;
      this.Field13 = -1;
      this.Field2 = (short)var1;
   }

   public final void Field1(Class672 var1, Class672 var2) {
      if (Class105.Field3[5]) {
         Class105.Field3[5] = false;
         if (var2 != null && (var2.f_() != this.Field3 && this.Field13 == 0 || var2.f_() != this.Field4 && this.Field13 == 1)) {
            this.Field18 = false;
            this.Field20 = 0;
            return;
         }

         ++this.Field20;
         String var3;
         if (this.Field13 == 0) {
            if (this.Field20 >= this.Field6.size() - 1) {
               if (this.Field1 == 3) {
                  var3 = (String)this.Field6.elementAt(this.Field20);
                  Class63.Field1((Class672)var2, (String)var3, 100);
                  this.Field13 = 3;
                  Class263.Field1().Field5(1, this.Field2, this.Field5);
                  this.Field18 = false;
                  this.Field20 = 0;
                  return;
               }
            } else {
               if ((var3 = (String)this.Field6.elementAt(this.Field20)).startsWith("1")) {
                  Class63.Field1((Class672)var2, (String)var3.substring(1), 100);
               } else {
                  Class63.Field1((Class672)var1, (String)var3.substring(1), 100);
               }

               if (this.Field1 != 3 && this.Field20 >= this.Field6.size() - 2) {
                  ++this.Field20;
                  Class105.Field1((String)this.Field6.elementAt(this.Field20), new Class153(this), new Class154(this));
                  return;
               }
            }
         } else if (this.Field13 == 1) {
            if (this.Field20 >= this.Field7.size() - 1) {
               Class263.Field1().Field5(1, this.Field2, this.Field5);
               this.Field18 = false;
               this.Field13 = 3;
               Class105.Field7();
               return;
            }

            if ((var3 = (String)this.Field7.elementAt(this.Field20)).startsWith("1")) {
               Class63.Field1((Class672)var2, (String)var3.substring(1), 100);
            } else {
               Class63.Field1((Class672)var1, (String)var3.substring(1), 100);
            }

            if (this.Field20 >= this.Field7.size() - 2) {
               ++this.Field20;
               Class263.Field1().Field5(1, this.Field2, this.Field5);
               this.Field18 = false;
               this.Field13 = 3;
               Class105.Field7();
               return;
            }
         } else if (this.Field13 == 2) {
            Class63.Field1((Class672)var2, (String)this.Field8, 100);
            this.Field18 = false;
            this.Field20 = 0;
         }
      }

   }

   public final void Field1(Class672 var1, Class672 var2, int var3) {
      this.Field20 = 0;
      String var4 = "";
      if (var3 == 0) {
         var4 = (String)this.Field6.elementAt(this.Field20);
      } else {
         if (var3 == 2) {
            var4 = this.Field8;
            Class63.Field1((Class672)var2, (String)var4, 100);
            return;
         }

         if (var3 == 1) {
            var4 = (String)this.Field7.elementAt(this.Field20);
         }
      }

      if (var4.startsWith("1")) {
         Class63.Field1((Class672)var2, (String)var4.substring(1), 100);
      } else {
         Class63.Field1((Class672)var1, (String)var4.substring(1), 100);
      }

      this.Field18 = true;
      if (this.Field13 == 0 && this.Field1 != 3 && this.Field6.size() <= 2) {
         ++this.Field20;
         Class105.Field1((String)this.Field6.elementAt(this.Field20), new Class151(this), new Class152(this));
      } else {
         if (this.Field13 == 1 && this.Field1 != 3 && this.Field7.size() <= 2) {
            ++this.Field20;
            Class263.Field1().Field5(1, this.Field2, this.Field5);
            this.Field18 = false;
            this.Field13 = 3;
            Class105.Field7();
         }

      }
   }

   public final String Field1(int var1) {
      if (this.Field1 == 2) {
         for(int var2 = 0; var2 < this.Field14.length; ++var2) {
            if (this.Field14[var2] == var1 && this.Field15[var2] < this.Field16[var2]) {
               ++this.Field15[var2];
               if (this.Field15[var2] < this.Field16[var2]) {
                  return "Nhặt được " + this.Field15[var2] + "/" + this.Field16[var2] + " " + Class112.Field1[var1];
               }

               return "Nhiệm vụ " + this.Field9 + " đã hoàn thành";
            }
         }
      }

      return "";
   }

   public final String Field1(int var1, String var2) {
      if (this.Field1 == 0) {
         for(int var3 = 0; var3 < this.Field10.length; ++var3) {
            if (this.Field10[var3] == var1 && this.Field11[var3] < this.Field12[var3]) {
               ++this.Field11[var3];
               if (this.Field11[var3] < this.Field12[var3]) {
                  return "Giết được " + this.Field11[var3] + "/" + this.Field12[var3] + " " + var2;
               }

               return "Nhiệm vụ " + this.Field9 + " đã hoàn thành";
            }
         }
      }

      return "";
   }

   public final String Field2(int var1) {
      if (this.Field1 == 4 && var1 <= this.Field19) {
         for(var1 = 0; var1 < this.Field11.length; ++var1) {
            if (this.Field11[var1] < this.Field12[var1]) {
               ++this.Field11[var1];
               if (this.Field11[var1] < this.Field12[var1]) {
                  return "Giết được " + this.Field11[var1] + "/" + this.Field12[var1] + " ";
               }

               return "Nhiệm vụ " + this.Field9 + " đã hoàn thành";
            }
         }
      }

      return "";
   }

   public final String Field1() {
      String var1 = "";
      if (this.Field13 == 1) {
         var1 = this.Field8;
         var1 = var1 + "|" + this.Field17;
      } else if (this.Field13 == 2) {
         int var2;
         switch(this.Field1) {
         case 0:
            var1 = Class804.Field46[this.Field10[0]].Field12 + ": " + this.Field11[0] + "/" + this.Field12[0];

            for(var2 = 1; var2 < this.Field10.length; ++var2) {
               var1 = var1 + "|" + Class804.Field46[this.Field10[var2]] + ": " + this.Field11[var2] + "/" + this.Field12[var2];
            }

            var1 = var1 + "|" + this.Field17;
         case 1:
         case 3:
         default:
            break;
         case 2:
            var1 = Class112.Field1[this.Field14[0]] + ": " + this.Field15[0] + "/" + this.Field16[0];

            for(var2 = 1; var2 < this.Field14.length; ++var2) {
               var1 = var1 + "|" + Class112.Field1[this.Field14[var2]] + ": " + this.Field15[var2] + "/" + this.Field16[var2];
            }

            var1 = var1 + "|" + this.Field17;
            break;
         case 4:
            var1 = "Giết: " + this.Field11[0] + "/" + this.Field12[0];
            var1 = var1 + "|" + this.Field17;
         }
      }

      return var1;
   }

   public final boolean Field2() {
      return this.Field1 == 0;
   }

   public final boolean Field3() {
      return this.Field1 == 4;
   }

   public final boolean Field4() {
      return this.Field13 == 2;
   }
}
