package main.tab.tab2;
import java.util.Vector;

public final class Class220 extends Class432 {
   private boolean Field6 = false;
   private byte Field7;
   private Vector Field8 = new Vector();

   public Class220(byte var1, boolean var2, byte var3) {
      this.Field6 = var2;
      this.Field7 = var3;
   }

   public final void Field1(Vector var1) {
      this.Field8 = var1;
   }

   public final void Field2(Vector var1) {
      this.Field8 = var1;
   }

   public final void Field1(Class357 var1) {
      super.Field1(var1);
      if (var1.Field204 != 0) {
         Class432.Field2(var1);
         if (var1.Field73 == 10) {
            for(int var2 = 0; var2 < this.Field8.size(); ++var2) {
               Class114 var3 = (Class114)this.Field8.elementAt(var2);
               Class62.Field2(0, var1, var3, var1.Field193, var1.Field194 - 15, var1.Field90, var1.Field131, this.Field7);
            }
         }

         if (this.Field6 && var1.Field73 == 14) {
            if (this.Field8.size() > 0) {
               Class746 var4 = new Class746(this.Field8, var1);
               Class73.Field2.addElement(var4);
            } else {
               Vector var5;
               (var5 = new Vector()).addElement(var1.Field67);
               Class746 var6 = new Class746(var5, var1);
               Class73.Field2.addElement(var6);
            }
         }

         ++var1.Field73;
      }
   }

   public final void Field1(Class126 var1) {
      if (this.Field8 != null && this.Field8.size() > 0) {
         for(int var2 = 0; var2 < this.Field8.size(); ++var2) {
            Class114 var3 = (Class114)this.Field8.elementAt(var2);
            Class62.Field2(0, var1, var3, var1.Field193, var1.Field194 - 15, 0, (byte)0, this.Field7);
         }
      } else {
         Class62.Field2(0, var1, var1.Field35, var1.Field193, var1.Field194 - 15, 0, (byte)0, this.Field7);
      }

      ++var1.Field39;
   }
}
