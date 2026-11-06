package main.tab.tab2;
import java.util.Hashtable;

public final class Class599 extends Hashtable {
   public static String[][] Field1;
   public static byte[][] Field2;
   public static final byte[][] Field3;
   public static final byte[][] Field4;
   public static byte[][] Field5;
   private static byte[][][] Field12;
   public static short[][][] Field6;
   public static short[][] Field7;
   public static int[][][] Field8;
   public static short[][][] Field9;
   public static short[][] Field10;
   public static final String[][] Field11;
   private static Class432[][] Field13;

   static {
      new Class599();
      Field1 = new String[][]{{"Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Phòng thủ tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: "}, {"Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Phòng thủ tăng: ", "Tăng sức công: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: "}, {"Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "HP+MP tăng: ", "MP tăng: ", "Hồi sinh: ", "Chia sẻ thiệt hại: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: "}, {"Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tốc độ tăng: ", "Phòng thủ tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: "}, {"Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tốc độ tăng: ", "HP tăng: ", "Tấn công tăng: ", "Tấn công tăng: ", "Tấn công tăng: "}};
      Field3 = new byte[][]{{20, 24}, {20, 21}, {25, 30, 27, 23}, {19, 20}, {22, 19}};
      Field4 = new byte[][]{{-1, 0}, {0, -1}, {0, -1, 1, 0}, {0, -1}, {0, -1}};
      Field12 = new byte[][][]{{{0, 64, 64, 80, 80, 96, 96, 102, 118, 124, 124}, {0, 64, 64, 80, 80, 96, 96, 102, 118, 124, 124}, {0, 64, 64, 80, 80, 96, 96, 102, 118, 124, 124}}};
      Field11 = new String[][]{{"Chém", "Kim tinh pháp", "Lôi điện pháp", "Kinh lôi bát thủ", "Hộ sát tiến", "Dĩ lực đáo công", "Thiên lôi điện trảm", "Sấm động dương gian", "Kiếm phi kinh thiên"}, {"Chém", "Hỏa kinh thiên", "Nhất hỏa long", "Bát đại hỏa long", "Cường thân giáp", "Hộ công tiến", "Thiên long bạo kích", "Liệt hỏa bạo kích", "Sao băng giáng thế"}, {"Đánh", "Thủy giáng minh", "Thần long thủy", "Bát đại hải long", "Hồi công lực đan", "Hồi lực tiến", "Hồi sinh", "Song hộ công thủ", "Hải long xuất thế", "Song long thị uy", "Hàn băng vũ"}, {"Đập", "Thổ Tú", "Kim sơn thủy", "Khổng kình bát vĩ", "Bất di biến", "Hộ thủ tiến", "Kinh thiên động địa", "Sơn Tinh bộ thiên", "Thạch nhũ công tâm", "Bua 8x"}, {"Bắn", "Nhất hồn tiễn", "Phi thiên tiễn", "Bát kim tễn đáo", "Độc lưu tiễn", "Hộ độc tiễn", "Thập diện tâm tiễn", "Thăng thiên loạn tiễn", "Vạn tiễn quy tâm"}};
      Field13 = new Class432[][]{{new Class253(), new Class252(), new Class255(), new Class254(0), null, null, new Class383(4), new Class383(5), new Class251()}, {new Class253(), new Class745(), new Class749(), new Class748(0), null, null, new Class191(false), new Class191(true), new Class747()}, {new Class253(), new Class630(), new Class633(), new Class636(0), null, null, null, null, new Class67(false), new Class67(true), new Class668(0)}, {new Class253(), new Class132(), new Class130(), new Class129(0), null, null, new Class743(false), new Class743(true), new Class128(0)}, {new Class118(), new Class119(), new Class120(), new Class122(0), null, null, new Class220((byte)4, false, (byte)2), new Class220((byte)5, true, (byte)2), new Class123(0), new Class220((byte)4, false, (byte)5)}};
   }

   public static int Field1(int var0, int var1) {
      return var1 > -1 ? Field6[0][var0][var1] : 0;
   }

   public static int Field2(int var0, int var1) {
      return var1 > -1 ? Field9[0][var0][var1] : 0;
   }

   public static long Field1(byte var0, int var1) {
      return (long)(var1 > -1 ? Field8[0][var0][var1] : 0);
   }

   public static int Field1(byte var0) {
      short[][] var10000 = Field10;
      return 250;
   }

   public static short Field3(int var0, int var1) {
      return var1 > -1 ? Field2[var0][var1] : 0;
   }

   public static Class432 Field1() {
      return new Class431(false);
   }

   public static boolean Field4(int var0, int var1) {
      for(int var2 = 0; var2 < Field5[var0].length; ++var2) {
         if (var1 == Field5[var0][var2]) {
            return true;
         }
      }

      return false;
   }

   public static int Field5(int var0, int var1) {
      int var2 = var1;
      byte var4;
      if ((var4 = Class357.Field97[var1]) > -1) {
         for(int var3 = 0; var3 < Field5[var0].length; ++var3) {
            if (var2 == Field5[var0][var3]) {
               return Field12[0][var3][var4];
            }
         }
      }

      return 1984;
   }

   public static Class432 Field6(int var0, int var1) {
      return Field13[var1][var0];
   }
}
