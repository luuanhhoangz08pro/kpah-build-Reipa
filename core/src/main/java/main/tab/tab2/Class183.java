package main.tab.tab2;
public class Class183 {
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"Roman999"};

   public static void Field1(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class637.Field1 = 0;
      }

      Class805 var1 = Class811.Field2((int)var0.Field18);
      if (var1.Field6 == Class637.Field3[Class637.Field2] || var1.Field6 == Class637.Field3[Class637.Field2] + 1) {
         Class637.Field1 = 0;
         Class106.Field23 = null;
         Class62.Field1(var1.Field1 + "\n lv " + var1.Field6);
         Class388.Field1("-Roman-");
      }

   }

   public static void Field2(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class28.Field1 = 0;
         Class28.Field6 = true;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         if ((var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf("Giảm st vật: 9%") != -1 || var1.indexOf("Tăng tấn công: 9%") != -1) {
            Class28.Field1 = 0;
            Class28.Field6 = true;
            Class62.Field1("Done \\n -Roman-");
            break;
         }
      }

      if (Class28.Field1 != 0) {
         Class28.Field3 = true;
      }

   }

   public static void Field3(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class28.Field1 = 0;
         Class28.Field6 = true;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         if ((var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf("Giảm st vật: 9%") != -1 || var1.indexOf("Tăng tấn công: 9%") != -1) {
            Class28.Field1 = 0;
            Class28.Field6 = true;
            Class62.Field1("Done \\n -Roman-");
            break;
         }
      }

      if (Class28.Field1 != 0) {
         Class28.Field4 = true;
      }

   }

   public static void Field4(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class28.Field1 = 0;
         Class28.Field6 = true;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         if ((var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf("Giảm st vật: 9%") != -1 || var1.indexOf("Tăng tấn công: 9%") != -1) {
            Class28.Field1 = 0;
            Class28.Field6 = true;
            Class62.Field1("Done \\n -Roman-");
            break;
         }
      }

      if (Class28.Field1 != 0) {
         Class28.Field5 = true;
      }

   }

   public static void Field5(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class28.Field1 = 0;
         Class28.Field6 = true;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         if ((var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf("Giảm st vật: 9%") != -1 || var1.indexOf("Tăng tấn công: 9%") != -1) {
            Class28.Field1 = 0;
            Class28.Field6 = true;
            Class62.Field1("Done \\n -Roman-");
            break;
         }
      }

   }

   public static void Field1(int var0, int var1, int var2) {
      int var3;
      Class272 var4;
      switch(var1) {
      case 1:
         for(var3 = 0; var3 < Class60.Field8.Field27.size(); ++var3) {
            var4 = (Class272)Class60.Field8.Field27.elementAt(var3);
            if (var4.Field1 == var0) {
               var4.Field3 = 4;
               Class60.Field8.Field28.addElement(var4);
            }

            if (var4.Field1 == var2) {
               var4.Field3 = 2;
               Class60.Field8.Field28.addElement(var4);
               return;
            }
         }

         return;
      case 2:
         for(var3 = 0; var3 < Class60.Field8.Field27.size(); ++var3) {
            var4 = (Class272)Class60.Field8.Field27.elementAt(var3);
            if (var4.Field1 == var0 || var4.Field1 == var2) {
               var4.Field3 = 2;
               Class60.Field8.Field28.addElement(var4);
               if (var4.Field1 == var2) {
                  return;
               }
            }
         }

         return;
      case 3:
         for(var3 = 0; var3 < Class60.Field8.Field27.size(); ++var3) {
            var4 = (Class272)Class60.Field8.Field27.elementAt(var3);
            if (var4.Field1 == var0) {
               var4.Field3 = 3;
               Class60.Field8.Field28.addElement(var4);
            }

            if (var4.Field1 == var2) {
               var4.Field3 = 2;
               Class60.Field8.Field28.addElement(var4);
               return;
            }
         }

         return;
      case 4:
         for(var3 = 0; var3 < Class60.Field8.Field27.size(); ++var3) {
            var4 = (Class272)Class60.Field8.Field27.elementAt(var3);
            if (var4.Field1 == var0 || var4.Field1 == var2) {
               var4.Field3 = 3;
               Class60.Field8.Field28.addElement(var4);
               if (var4.Field1 == var2) {
                  break;
               }
            }
         }
      }

   }

   public static void Field1() {
      int[] var0 = new int[]{73, 80, 87, 94, 101};
      int[] var1 = new int[]{108, 115, 122, 129, 136};

      for(int var2 = 0; var2 < var0.length; ++var2) {
         for(int var3 = 0; var3 < Class60.Field8.Field27.size(); ++var3) {
            Class272 var4 = (Class272)Class60.Field8.Field27.elementAt(var3);
            if (var4.Field1 == var1[var2]) {
               var4.Field3 = 1;
               Class60.Field8.Field28.addElement(var4);
            }
         }
      }

   }

   public static void Field2() {
      int[] var0 = new int[]{73, 80, 87, 94, 101};
      int[] var1 = new int[]{108, 115, 122, 129, 136};

      for(int var2 = 0; var2 < var0.length; ++var2) {
         for(int var3 = 0; var3 < Class60.Field8.Field27.size(); ++var3) {
            Class272 var4 = (Class272)Class60.Field8.Field27.elementAt(var3);
            if (var4.Field1 == var1[var2]) {
               var4.Field3 = 2;
               Class60.Field8.Field28.addElement(var4);
            }
         }
      }

   }

   public static void Field6(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class838.Field1 = 0;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)));
         if (var1.indexOf(Class93.Field1[Class93.Field13]) != -1 && (var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf(Class93.Field10[Class93.Field16]) != -1) {
            Class838.Field1 = 0;
            Class62.Field1(Class93.Field2[Class93.Field13] + " - " + Class93.Field10[Class93.Field16] + " Done! \n -Roman-");
            break;
         }
      }

   }

   public static void Field7(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class838.Field1 = 0;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         if ((var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf(Class88.Field2()) != -1) {
            Class838.Field1 = 0;
            Class62.Field1(Class88.Field2() + " Done! \n -Roman-");
            break;
         }
      }

   }

   public static void Field8(Class534 var0) {
      if (Class60.Field10.indexOf("Không đủ nguyên") != -1) {
         Class838.Field1 = 0;
      }

      String var1 = "";
      int var2 = var0.Field34.size();

      for(int var3 = 1; var3 < var2; ++var3) {
         Class826 var4 = (Class826)var0.Field34.elementAt(var3);
         String var5 = String.valueOf(String.valueOf(var4.Field1(var0.Field30))) + var4.Field2() + (var4.Field1() ? "%" : "");
         if ((var1 = String.valueOf(String.valueOf(var1)) + Class534.Field1(var5, String.valueOf(var4.Field1(false)))).indexOf("21%") != -1) {
            Class838.Field1 = 0;
            Class62.Field1("21% Done! \n -Roman-");
            break;
         }
      }

   }

   public static Class534 Field3() {
      Class534 var0 = (Class534)Class357.Field125.elementAt(Class357.Field125.size() - 1);
      if (Class811.Field2((int)var0.Field18).Field1.indexOf("Sách kỹ năng pet") != -1) {
         var0 = (Class534)Class357.Field125.elementAt(Class357.Field125.size() - 2);
      }

      return var0;
   }
}
