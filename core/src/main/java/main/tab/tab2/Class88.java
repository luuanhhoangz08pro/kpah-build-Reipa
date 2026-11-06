package main.tab.tab2;
public class Class88 implements Class256 {
   private int Field7;
   public static int Field1 = 0;
   public static int Field2 = 0;
   public static int[] Field3 = new int[]{3, 4, 5, 6, 7};
   public static String[] Field4 = new String[]{"Kiếm Khách", "Chiến Binh", "Pháp Sư", "Đấu Sĩ", "Cung Thủ"};
   public static int Field5 = 0;
   public static String[] Field6 = new String[]{"Vé thường", "Vé đb"};

   public Class88(int var1) {
      this.Field7 = var1;
   }

   public void Field1() {
      Class110 var1;
      switch(this.Field7) {
      case 0:
         if (++Field1 >= Field4.length) {
            Field1 = 0;
         }

         var1 = new Class110(9);
         var1.Field12();
         Class106.Field21.Field3 = 0;
         break;
      case 1:
         if (++Field2 >= Field4.length) {
            Field2 = 0;
         }

         var1 = new Class110(9);
         var1.Field12();
         Class106.Field21.Field3 = 1;
         break;
      case 2:
         if (!Class139.Field4) {
            Class139.Field4 = true;
         }

         var1 = new Class110(9);
         var1.Field12();
         Class106.Field21.Field3 = 0;
      }

   }

   public static String Field2() {
      String var0 = Class599.Field11[Field1][Field3[Field2]];
      return var0;
   }
}
