package main.tab.tab2;
import java.util.Vector;

public final class Class69 {
   public short Field1;
   public short Field2;
   public short Field3;
   public short Field4;
   public short Field5;
   public short Field6;
   public short Field7 = 0;
   private short Field14;
   private short Field15;
   public short Field8;
   public byte Field9;
   public byte Field10;
   public short[] Field11;
   public short[] Field12;
   public static Vector Field13 = new Vector();

   public final void Field1() {
      if (Field1(this.Field1) != null) {
         if (this.Field9 == 0) {
            Class678 var1 = Class106.Field19.Field3(this.Field8);
            this.Field5 = var1.Field193;
            this.Field6 = var1.Field194;
         }

         if (this.Field7 == this.Field3) {
            this.Field7 = 0;
            Class465 var5;
            (var5 = new Class465()).Field1 = this.Field1;
            var5.Field4 = this.Field8;
            var5.Field5 = this.Field9;
            switch(this.Field10) {
            case 0:
               var5.Field193 = this.Field5;
               var5.Field194 = this.Field6;
               break;
            case 1:
               int var2 = Class811.Field13(this.Field4);
               int var3 = Class811.Field13(360);
               int var4 = var2 * Class809.Field2(Class809.Field3(var3)) >> 10;
               var2 = -(var2 * Class809.Field1(Class809.Field3(var3))) >> 10;
               var5.Field193 = this.Field5;
               var5.Field194 = this.Field6;
               var5.Field2 = (short)var4;
               var5.Field3 = (short)var2;
               break;
            case 2:
               var5.Field193 = this.Field5;
               var5.Field194 = this.Field6;
               if (this.Field9 == 0) {
                  var5.Field2 = this.Field11[this.Field15];
                  var5.Field3 = this.Field12[this.Field15];
               } else {
                  var5.Field193 += this.Field11[this.Field15];
                  var5.Field194 += this.Field12[this.Field15];
               }
            }

            ++this.Field14;
            ++this.Field15;
            if (this.Field11 != null && this.Field15 >= this.Field11.length) {
               this.Field15 = 0;
            }

            if (this.Field2 != -1 && this.Field14 >= this.Field2) {
               Class62.Field61.removeElement(this);
            }

            switch(this.Field9) {
            case 0:
            case 1:
               Class106.Field19.Field10.addElement(var5);
            }
         }

         ++this.Field7;
      }
   }

   public static Class83 Field1(short var0) {
      for(int var1 = 0; var1 < Field13.size(); ++var1) {
         Class83 var2;
         if ((var2 = (Class83)Field13.elementAt(var1)).Field5 == var0) {
            return var2;
         }
      }

      return null;
   }
}
