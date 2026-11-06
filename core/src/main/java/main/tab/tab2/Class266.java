package main.tab.tab2;
import java.util.Vector;

public final class Class266 extends Class177 {
   private Vector Field1 = new Vector();
   private Vector Field15;
   private int[] Field16 = new int[]{0, 30, 60, 90, 120, 150, 180, 210, 240, 270, 300, 330};

   public Class266(int var1, int var2, Vector var3) {
      this.Field1 = new Vector();
      this.Field15 = new Vector();
      this.Field15 = var3;

      for(int var4 = 0; var4 < this.Field16.length; ++var4) {
         this.Field1.addElement(new Class262(this, var1, var2, this.Field16[var4]));
      }

   }

   public final void Field1() {
      int var1;
      for(var1 = 0; var1 < this.Field1.size(); ++var1) {
         Class262 var2;
         if ((var2 = (Class262)this.Field1.elementAt(var1)) != null) {
            Class262 var3 = var2;
            if (var2.Field1 != var2.Field3) {
               if (var2.Field3 - var2.Field1 >> 1 == 0) {
                  var2.Field1 = var2.Field3;
               } else {
                  var2.Field1 += var2.Field3 - var2.Field1 >> 1;
               }
            }

            if (var2.Field2 != var2.Field4) {
               if (var2.Field4 - var2.Field2 >> 1 == 0) {
                  var2.Field2 = var2.Field4;
               } else {
                  var2.Field2 += var2.Field4 - var2.Field2 >> 1;
               }
            }

            if (var2.Field1 == var2.Field3 && var2.Field2 == var2.Field4) {
               var2.Field5 = true;
            }

            if (var2.Field5) {
               for(int var4 = 0; var4 < 5; ++var4) {
                  Class73.Field1(var3.Field1 + Class811.Field13(10) - 5, var3.Field2 + Class811.Field13(10) - 10, 28);
               }
            } else {
               Class73.Field1(var2.Field1, var2.Field2, 15);
               Class73.Field1(var2.Field1, var2.Field2, 49);
            }

            if (var2.Field5) {
               this.Field1.removeElement(var2);
            }
         }
      }

      if (this.Field1.size() == 0) {
         super.Field10 = true;

         for(var1 = 0; var1 < this.Field15.size(); ++var1) {
            Class114 var5;
            if ((var5 = (Class114)this.Field15.elementAt(var1)) != null) {
               int var6 = var5.Field18;
               var5.Field12();
               if (var6 > 0) {
                  Class106.Field19.Field1("-" + var6, 0, var5.Field193, var5.Field194 + var5.Field16 - 15, 1, -2);
               } else {
                  Class106.Field19.Field1("MISS", 0, var5.Field193, var5.Field194 + var5.Field16 - 15, 1, -2);
               }
            }
         }
      }

   }
}
