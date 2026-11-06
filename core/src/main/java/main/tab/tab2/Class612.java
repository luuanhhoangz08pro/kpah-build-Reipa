package main.tab.tab2;
public final class Class612 extends Thread implements Class256 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"ON", "OFF"};
   private int Field3;

   public Class612(int var1) {
      this.Field3 = var1;
   }

   public final void Field1() {
      Field1 = 1;
      Class106.Field21.Field3 = 3;
      if (Field1 == 1) {
         this.start();
         Class106.Field19.Field1();
      }

   }

   public final void run() {
      while(Field1 != 0) {
         switch(Field1) {
         case 1:
            int var1 = Integer.parseInt(Class106.Field25.Field1.Field5());
            if (this.Field3 == 11) {
               if (var1 >= 5001) {
                  Class106.Field1("MAX 5000");
                  return;
               }

               Class839.Field2 = var1;
               Class106.Field7();
               Class110 var4 = new Class110(12);
               var4.Field11();
               Field1 = 0;
               return;
            }

            if (var1 > 0) {
               if (Class106.Field19.Field15.Field101 > 45 && this.Field3 != 11) {
                  Class62.Field1("Đang mua........");
               }

               for(int var2 = 0; var2 < var1 && this.Field3 != 11; ++var2) {
                  if (Class106.Field19.Field15.Field101 <= 45) {
                     Class62.Field1("Không đủ lượng khóa.......");
                     break;
                  }

                  if (this.Field3 == 1) {
                     Class261.Field1().Field3((int)117);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 2) {
                     Class261.Field1().Field3((int)119);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 3) {
                     Class261.Field1().Field3((int)121);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 4) {
                     Class261.Field1().Field3((int)123);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 5) {
                     Class261.Field1().Field3((int)116);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 6) {
                     Class261.Field1().Field3((int)118);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 7) {
                     Class261.Field1().Field3((int)120);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 8) {
                     Class261.Field1().Field3((int)122);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 9) {
                     Class261.Field1().Field3((int)124);
                     Class858.Field1(35L);
                  } else if (this.Field3 == 10) {
                     Class261.Field1().Field3((int)125);
                     Class858.Field1(35L);
                  }

                  Class62.Field1((Class678)Class106.Field19.Field15, (String)("Buying: " + (var2 + 1) + "/" + var1), 70);
                  if (var2 == var1 - 1) {
                     Class62.Field1("Đã xong.....");
                     Class62.Field1((Class678)Class106.Field19.Field15, (String)"Done", 70);
                  }
               }

               Field1 = 0;
            }

            try {
               Thread.sleep(50L);
            } catch (Exception var3) {
               Class106.Field1("Chỉ được nhập số.");
            }
         }
      }

   }
}
