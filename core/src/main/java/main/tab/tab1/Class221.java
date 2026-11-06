package main.tab.tab1;
import java.util.Vector;

public final class Class221 extends Class435 {
   private boolean Field6 = false;
   private byte Field7;
   private Vector Field8 = new Vector();

   public Class221(byte var1, boolean var2, byte var3) {
      this.Field6 = var2;
      this.Field7 = var3;
   }

   public final void Field1(Vector var1) {
      this.Field8 = var1;
   }

   public final void Field2(Vector var1) {
      this.Field8 = var1;
   }

   public final void Field1(Class359 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         Class435.Field2(var1);
         if (var1.Field73 == 10) {
            for(int var2 = 0; var2 < this.Field8.size(); ++var2) {
               Class111 var3 = (Class111)this.Field8.elementAt(var2);
               Class63.Field2(0, var1, var3, var1.Field193, var1.Field194 - 15, var1.Field90, var1.Field131, this.Field7);
            }
         }

         if (this.Field6 && var1.Field73 == 14) {
            if (this.Field8.size() > 0) {
               Class739 var4 = new Class739(this.Field8, var1);
               Class74.Field2.addElement(var4);
            } else {
               Vector var5;
               (var5 = new Vector()).addElement(var1.Field67);
               Class739 var6 = new Class739(var5, var1);
               Class74.Field2.addElement(var6);
            }
         }

         ++var1.Field73;
      }
   }

   public final void Field1(Class123 var1) {
      if (this.Field8 != null && this.Field8.size() > 0) {
         for(int var2 = 0; var2 < this.Field8.size(); ++var2) {
            Class111 var3 = (Class111)this.Field8.elementAt(var2);
            Class63.Field2(0, var1, var3, var1.Field193, var1.Field194 - 15, 0, (byte)0, this.Field7);
         }
      } else {
         Class63.Field2(0, var1, var1.Field35, var1.Field193, var1.Field194 - 15, 0, (byte)0, this.Field7);
      }

      ++var1.Field39;
   }
}
