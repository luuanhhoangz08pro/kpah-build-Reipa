package main.tab.tab2;
public final class Class30 extends Thread implements Class256 {
   private Class752 Field8;
   public static int Field1 = 0;
   public static String[] Field2 = new String[]{"OFF", "ON"};
   public static boolean Field3 = false;
   public static boolean Field4 = false;
   public static boolean Field5 = false;
   public static boolean Field6 = false;
   public static boolean Field7 = false;

   public final void Field1() {
      if (++Field1 >= Field2.length) {
         Field1 = 0;
      }

      if (Field1 == 1) {
         this.start();
      }

   }

   public final void run() {
      label153:
      while(true) {
         if (Field1 != 0 && Field1 < Field2.length) {
            Class261.Field1().Field1((int)-15, (byte)3, (int)0);
            Class858.Field1(250L);
            Class261.Field1().Field1((int)-15, (byte)1, (int)0);
            Class858.Field1(250L);
            Field3 = true;
            if (!Class60.Field10.contains("sang hệ thổ")) {
               continue;
            }

            label148:
            while(true) {
               do {
                  if (!Field3 || Field1 == 0) {
                     continue label153;
                  }

                  Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                  Class858.Field1(250L);
                  Class261.Field1().Field1((int)-15, (byte)1, (int)4);
                  Class858.Field1(250L);
               } while(!Class60.Field10.contains("sang hệ thổ"));

               Field3 = false;
               Field4 = true;

               label146:
               while(true) {
                  do {
                     if (!Field4 || Field1 == 0) {
                        continue label148;
                     }

                     Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                     Class858.Field1(250L);
                     Class261.Field1().Field1((int)-15, (byte)1, (int)1);
                     Class858.Field1(250L);
                  } while(!Class60.Field10.contains("sang hệ hoả"));

                  Field4 = false;
                  Field5 = true;

                  label144:
                  while(true) {
                     do {
                        if (!Field5 || Field1 == 0) {
                           continue label146;
                        }

                        Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                        Class858.Field1(250L);
                        Class261.Field1().Field1((int)-15, (byte)1, (int)2);
                        Class858.Field1(250L);
                     } while(!Class60.Field10.contains("sang hệ kim"));

                     Field5 = false;
                     Field6 = true;

                     label142:
                     while(true) {
                        do {
                           if (!Field6 || Field1 == 0) {
                              continue label144;
                           }

                           Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                           Class858.Field1(250L);
                           Class261.Field1().Field1((int)-15, (byte)1, (int)7);
                           Class858.Field1(250L);
                        } while(!Class60.Field10.contains("sang hệ thuỷ"));

                        Field6 = false;
                        Field7 = true;

                        label140:
                        while(true) {
                           do {
                              if (!Field7 || Field1 == 0) {
                                 continue label142;
                              }

                              Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                              Class858.Field1(250L);
                              Class261.Field1().Field1((int)-15, (byte)1, (int)8);
                              Class858.Field1(250L);
                           } while(!Class60.Field10.contains("sang hệ mộc"));

                           Field7 = false;
                           Field4 = true;

                           label138:
                           while(true) {
                              do {
                                 if (!Field4 || Field1 == 0) {
                                    continue label140;
                                 }

                                 Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                                 Class858.Field1(250L);
                                 Class261.Field1().Field1((int)-15, (byte)1, (int)6);
                                 Class858.Field1(250L);
                              } while(!Class60.Field10.contains("sang hệ hoả"));

                              Field4 = false;
                              Field5 = true;

                              label136:
                              while(true) {
                                 do {
                                    if (!Field5 || Field1 == 0) {
                                       continue label138;
                                    }

                                    Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                                    Class858.Field1(250L);
                                    Class261.Field1().Field1((int)-15, (byte)1, (int)9);
                                    Class858.Field1(250L);
                                 } while(!Class60.Field10.contains("sang hệ kim"));

                                 Field5 = false;
                                 Field6 = true;

                                 while(true) {
                                    do {
                                       if (!Field6 || Field1 == 0) {
                                          continue label136;
                                       }

                                       Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                                       Class858.Field1(250L);
                                       Class261.Field1().Field1((int)-15, (byte)1, (int)5);
                                       Class858.Field1(250L);
                                    } while(!Class60.Field10.contains("sang hệ thuỷ"));

                                    Field6 = false;
                                    Field7 = true;

                                    while(Field7 && Field1 != 0) {
                                       Class261.Field1().Field1((int)-15, (byte)3, (int)0);
                                       Class858.Field1(250L);
                                       Class261.Field1().Field1((int)-15, (byte)1, (int)3);
                                       Class858.Field1(250L);
                                       if (Class60.Field10.contains("sang hệ mộc")) {
                                          Field7 = false;
                                          Field1 = 0;
                                          Class628 var1 = new Class628(this.Field8);
                                          var1.Field1();
                                          Class106.Field19.Field1();
                                          Class106.Field1("Xong.");
                                          return;
                                       }
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }

         return;
      }
   }
}
