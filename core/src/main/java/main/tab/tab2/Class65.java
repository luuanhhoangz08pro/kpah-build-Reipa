package main.tab.tab2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public final class Class65 implements Runnable {
    private static String Field3;
    private static String Field4 = null;
    private static String Field5;
    private static String Field6;
    private static String Field7;
    private static String Field8;
    public static int[] Field1 = new int[]{128, 1, 8, 6, 32, 64};
    public static int Field2 = 0;

    public static String Field1(String var0, int var1) {
        StringBuffer var2 = new StringBuffer();

        for (int var3 = 0; var3 < var0.length(); ++var3) {
            char var4 = var0.charAt(var3);
            var2.append((char) (var4 + var1));
        }

        return var2.toString();
    }

    public static void Field1(String var0, String var1) {
        Field3 = String.valueOf(String.valueOf(String.valueOf(var0))) + "." + var1;
    }

    public static String Field1() {
        return "";
    }

    public static String Field2() {
        return Class183.Field2[Class183.Field1];
    }

    public static void Field3() {
        if (Field4 == null) {
            Field4 = Field4();
            Field1(Field4);
        }

    }

    private static void Field1(String var0) {
        try {
            BufferedWriter var1 = new BufferedWriter(new FileWriter("0.txt"));
            Throwable var2 = null;

            try {
                var1.write(var0);
            } catch (Throwable var12) {
                var2 = var12;
                throw var12;
            } finally {
                if (var1 != null) {
                    if (var2 != null) {
                        try {
                            var1.close();
                        } catch (Throwable var11) {
                            var2.addSuppressed(var11);
                        }
                    } else {
                        var1.close();
                    }
                }

            }
        } catch (IOException var14) {
            var14.printStackTrace();
        }

    }

    public final void run() {
    }

    public static String Field4() {
        byte var0 = Class106.Field19.Field15.Field22;
        long var1 = Class106.Field19.Field15.Field122;
        int var3 = Class106.Field19.Field15.Field34();
        int var4 = Class106.Field19.Field15.Field100;
        long var5 = (long) var3;
        long var7 = (long) var4;
        long var9 = (long) var0;
        Field4 = "." + var9 + "." + var5 + "." + var1 + "." + var7 + ".";
        return Field4;
    }

    public static String Field5() {
        try {
            Enumeration var0 = NetworkInterface.getNetworkInterfaces();

            while (var0.hasMoreElements()) {
                NetworkInterface var1 = (NetworkInterface) var0.nextElement();
                byte[] var2 = var1.getHardwareAddress();
                if (var2 != null) {
                    StringBuilder var3 = new StringBuilder();

                    for (int var4 = 0; var4 < var2.length; ++var4) {
                        var3.append(String.format("%02X%s", var2[var4], var4 < var2.length - 1 ? "-" : ""));
                    }

                    return var3.toString();
                }
            }
        } catch (SocketException var5) {
            var5.printStackTrace();
        }

        return null;
    }

    public static String Field2(String var0, int var1) {
        int var3 = var0.length();
        byte[] var4 = new byte[var3 / 2];

        int var2;
        for (var2 = 0; var2 < var3; var2 += 2) {
            var4[var2 / 2] = (byte) ((Character.digit(var0.charAt(var2), 16) << 4) + Character.digit(var0.charAt(var2 + 1), 16));
        }

        byte[] var5 = new byte[var4.length];

        for (var2 = 0; var2 < var4.length; ++var2) {
            var5[var2] = (byte) (var4[var2] ^ var1);
        }

        return new String(var5);
    }

    public static String Field3(String var0, int var1) {
        byte[] var2 = var0.getBytes();
        byte[] var3 = new byte[var2.length];

        for (int var4 = 0; var4 < var2.length; ++var4) {
            var3[var4] = (byte) (var2[var4] ^ var1);
        }

        StringBuilder var9 = new StringBuilder();
        byte[] var5 = var3;
        int var6 = var3.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            byte var8 = var5[var7];
            var9.append(String.format("%02x", var8));
        }

        return var9.toString();
    }

    static {
        Field5 = Class774.Field3[Class774.Field1] + ":" + Class774.Field4[Class774.Field1];
        Field6 = Field2();
        Field7 = Field1("4z~z", -6);
        Field8 = Field5();
    }
}
