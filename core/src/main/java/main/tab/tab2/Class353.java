package main.tab.tab2;
final class Class353 implements Runnable {
   private Class97 Field1;

   Class353(Class97 var1) {
      this.Field1 = var1;
   }

   public final void run() {
      while(true) {
         try {
            if (this.Field1.Field2()) {
               Class353 var9 = this;
               ++Class97.Field11;
               byte var2 = this.Field1.Field1.readByte();
               if (this.Field1.Field7) {
                  var2 = Class97.Field1(this.Field1, var2);
               }

               int var3;
               byte[] var4;
               if (this.Field1.Field7) {
                  if (var2 == -128) {
                     var2 = this.Field1.Field1.readByte();
                     var2 = Class97.Field1(this.Field1, var2);
                     var4 = new byte[]{this.Field1.Field1.readByte(), this.Field1.Field1.readByte(), this.Field1.Field1.readByte(), this.Field1.Field1.readByte()};
                     var3 = Class97.Field1(this.Field1, var4[3]) & 255 | (Class97.Field1(this.Field1, var4[2]) & 255) << 8 | (Class97.Field1(this.Field1, var4[1]) & 255) << 16 | (Class97.Field1(this.Field1, var4[0]) & 255) << 24;
                  } else {
                     byte var12 = this.Field1.Field1.readByte();
                     byte var5 = this.Field1.Field1.readByte();
                     var3 = (Class97.Field1(this.Field1, var12) & 255) << 8 | Class97.Field1(this.Field1, var5) & 255;
                  }
               } else {
                  var3 = this.Field1.Field1.readUnsignedShort();
               }

               var4 = new byte[var3];
               int var15 = 0;
               int var6 = 0;

               while(var15 != -1 && var6 < var3) {
                  if ((var15 = var9.Field1.Field1.read(var4, var6, var3 - var6)) > 0) {
                     var6 += var15;
                     Class97 var10000 = var9.Field1;
                     var10000.Field6 += var6 + 5;
                  }
               }

               if (var9.Field1.Field7) {
                  for(var3 = 0; var3 < var4.length; ++var3) {
                     var4[var3] = Class97.Field1(var9.Field1, var4[var3]);
                  }
               }

               Class85 var10 = new Class85(var2, var4);

               try {
                  if (var10.Field1 != -40) {
                     this.Field1.Field2.Field1(var10);
                     continue;
                  }

                  Class85 var11 = var10;
                  var9 = this;
                  byte var13 = var10.Field2().readByte();
                  this.Field1.Field8 = new byte[var13];

                  int var14;
                  for(var14 = 0; var14 < var13; ++var14) {
                     var9.Field1.Field8[var14] = var11.Field2().readByte();
                  }

                  for(var14 = 0; var14 < var9.Field1.Field8.length - 1; ++var14) {
                     byte[] var16 = var9.Field1.Field8;
                     var16[var14 + 1] ^= var9.Field1.Field8[var14];
                  }

                  var9.Field1.Field7 = true;
               } catch (Exception var7) {
                  var7.printStackTrace();
               }
               continue;
            }
         } catch (Exception var8) {
         }

         if (this.Field1.Field3) {
            if (this.Field1.Field2 != null) {
               Class133 var1;
               if (System.currentTimeMillis() - this.Field1.Field9 > 500L) {
                  var1 = this.Field1.Field2;
                  Class106.Field19.Field14();
               } else {
                  var1 = this.Field1.Field2;
                  Class106.Field19.Field13();
               }
            }

            if (Class97.Field1(this.Field1) != null) {
               Class97.Field3(this.Field1);
            }
         }

         return;
      }
   }
}
