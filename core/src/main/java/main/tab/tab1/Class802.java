package main.tab.tab1;
import java.util.Vector;

public final class Class802 {
   private static short[] Field1 = new short[]{0, 18, 36, 54, 71, 89, 107, 125, 143, 160, 178, 195, 213, 230, 248, 265, 282, 299, 316, 333, 350, 367, 384, 400, 416, 433, 449, 465, 481, 496, 512, 527, 543, 558, 573, 587, 602, 616, 630, 644, 658, 672, 685, 698, 711, 724, 737, 749, 761, 773, 784, 796, 807, 818, 828, 839, 849, 859, 868, 878, 887, 896, 904, 912, 920, 928, 935, 943, 949, 956, 962, 968, 974, 979, 984, 989, 994, 998, 1002, 1005, 1008, 1011, 1014, 1016, 1018, 1020, 1022, 1023, 1023, 1024, 1024};
   private static short[] Field2 = new short[91];
   private static int[] Field3 = new int[91];

   static {
      for(int var0 = 0; var0 <= 90; ++var0) {
         Field2[var0] = Field1[90 - var0];
         if (Field2[var0] == 0) {
            Field3[var0] = Integer.MAX_VALUE;
         } else {
            Field3[var0] = (Field1[var0] << 10) / Field2[var0];
         }
      }

      String[][] var10000 = new String[][]{{"áàảãạăắằẳẵặâấầẩẫậ", "éèẻẽẹêếềểễệ", "íìỉĩị", "óòỏõọôốồổỗộ", "ơớờởỡợ", "úùủũụưứừửữự", "ýỳỷỹỵ"}, {"a", "e", "i", "o", "o", "u", "y"}};
   }

   public static final int Field1(int var0) {
      if (var0 >= 0 && var0 < 90) {
         return Field1[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return Field1[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -Field1[var0 - 180] : -Field1[360 - var0];
      }
   }

   public static final int Field2(int var0) {
      if (var0 >= 0 && var0 < 90) {
         return Field2[var0];
      } else if (var0 >= 90 && var0 < 180) {
         return -Field2[180 - var0];
      } else {
         return var0 >= 180 && var0 < 270 ? -Field2[var0 - 180] : Field2[360 - var0];
      }
   }

   public static final int Field1(int var0, int var1) {
      int var10000;
      int var2;
      if (var0 != 0) {
         var2 = Math.abs((var1 << 10) / var0);

         label44: {
            for(int var3 = 0; var3 <= 90; ++var3) {
               if (Field3[var3] >= var2) {
                  var10000 = var3;
                  break label44;
               }
            }

            var10000 = 0;
         }

         var2 = var10000;
         if (var1 >= 0 && var0 < 0) {
            var2 = 180 - var2;
         }

         if (var1 < 0 && var0 < 0) {
            var2 += 180;
         }

         if (var1 >= 0 || var0 < 0) {
            return var2;
         }

         var10000 = 360 - var2;
      } else {
         var10000 = var1 > 0 ? 90 : 270;
      }

      var2 = var10000;
      return var2;
   }

   public static final int Field3(int var0) {
      if (var0 >= 360) {
         var0 -= 360;
      }

      if (var0 < 0) {
         var0 += 360;
      }

      return var0;
   }

   public static int Field1(int var0, int var1, int var2, int var3) {
      if ((var0 = (var0 - var2) * (var0 - var2) + (var1 - var3) * (var1 - var3)) <= 0) {
         return 0;
      } else {
         var1 = (var0 + 1) / 2;

         do {
            var2 = var1;
            var1 = var1 / 2 + var0 / (var1 * 2);
         } while(Math.abs(var2 - var1) > 1);

         return var1;
      }
   }

   public static boolean Field1(Class672 var0, Class672 var1) {
      return Math.abs(var0.Field193 - var1.Field193) < Class105.Field13 / 2 + 100 && Math.abs(var0.Field194 - var1.Field194) < Class105.Field13 / 2 + 100;
   }

   public static void Field1(Vector var0) {
      Field1(var0, 0, var0.size() - 1);
   }

   private static void Field1(Vector var0, int var1, int var2) {
      if (var2 - var1 > 0) {
         try {
            int var3 = ((Class672)var0.elementAt(var2)).c_();
            var3 = Field1(var0, var1, var2, var3);
            Field1(var0, var1, var3 - 1);
            Field1(var0, var3 + 1, var2);
         } catch (Exception var4) {
         }
      }
   }

   private static int Field1(Vector var0, int var1, int var2, int var3) {
      --var1;
      int var4 = var2;

      try {
         while(true) {
            do {
               ++var1;
            } while(((Class672)var0.elementAt(var1)).c_() < var3);

            while(var4 > 0) {
               --var4;
               if (((Class672)var0.elementAt(var4)).c_() <= var3) {
                  break;
               }
            }

            if (var1 >= var4) {
               Field2(var0, var1, var2);
               break;
            }

            Field2(var0, var1, var4);
         }
      } catch (Exception var5) {
      }

      return var1;
   }

   private static void Field2(Vector var0, int var1, int var2) {
      Object var3 = var0.elementAt(var2);
      if (((Class672)var0.elementAt(var2)).c_() != ((Class672)var0.elementAt(var1)).c_()) {
         var0.setElementAt(var0.elementAt(var1), var2);
         var0.setElementAt(var3, var1);
      }

   }

   public static int Field4(int var0) {
      return var0 > 0 ? var0 : -var0;
   }

   public static short Field2(Class672 var0, Class672 var1) {
      try {
         if (Field4(var0.Field193 - var1.Field193) < Field4(var0.Field194 - var1.Field194)) {
            return (short)(var1.Field194 > var0.Field194 ? 0 : 1);
         } else {
            return (short)(var1.Field193 < var0.Field193 ? 2 : 3);
         }
      } catch (Exception var2) {
         return 0;
      }
   }

   public static String[] Field1(String var0, String var1) {
      Vector var2 = new Vector();

      for(int var3 = var0.indexOf(var1); var3 >= 0; var3 = (var0 = var0.substring(var3 + var1.length())).indexOf(var1)) {
         var2.addElement(var0.substring(0, var3));
      }

      var2.addElement(var0);
      String[] var4 = new String[var2.size()];
      if (var2.size() > 0) {
         for(int var5 = 0; var5 < var2.size(); ++var5) {
            var4[var5] = (String)var2.elementAt(var5);
         }
      }

      return var4;
   }

   public static int Field2(int var0, int var1, int var2, int var3) {
      return Class804.Field2(var0, var2, var1, var3);
   }
}
