package main.tab.tab1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Enumeration;

public final class Class66 implements Runnable {
    private static String Field4;
    private static String Field5 = null;
    private static String Field6;
    private static String Field7;
    private static String Field8;
    private static String Field9;
    public static int[] Field1 = new int[]{128, 1, 8, 6, 32, 64};
    public static int Field2 = 0;
    public static boolean Field3 = false;

    public static String Field1(String var0, int var1) {
        StringBuffer var2 = new StringBuffer();

        for (int var3 = 0; var3 < var0.length(); ++var3) {
            char var4 = var0.charAt(var3);
            var2.append((char) (var4 + var1));
        }

        return var2.toString();
    }

    public static void Field1(String var0, String var1) {
        Field4 = String.valueOf(String.valueOf(String.valueOf(var0))) + "." + var1;
    }

    public static String Field1() {
        return "";
    }

    public static String Field2() {
        return Class179.Field2[Class179.Field1];
    }

    public static void Field3() {
        if (Field5 == null) {
            Field5 = Field4();
            Field1(Field5);
        }

    }

    private static void Field1(String var0) {
        try {
            BufferedWriter var1 = new BufferedWriter(new FileWriter("0.txt"));

            try {
                var1.write(var0);
            } catch (Throwable var5) {
                try {
                    var1.close();
                } catch (Throwable var4) {
                    var5.addSuppressed(var4);
                }

                throw var5;
            }

            var1.close();
        } catch (IOException var6) {
            var6.printStackTrace();
        }

    }

    public final void run() {
        Class61.Field1(Field1());
    }

    public static String Field4() {
        byte var0 = Class105.Field19.Field15.Field22;
        long var1 = Class105.Field19.Field15.Field122;
        int var3 = Class105.Field19.Field15.Field34();
        int var4 = Class105.Field19.Field15.Field100;
        long var5 = (long) var3;
        long var7 = (long) var4;
        long var9 = (long) var0;
        Field5 = "." + var9 + "." + var5 + "." + var1 + "." + var7 + ".";
        return Field5;
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

    public static String Field3(String var0, int var1) {
        byte[] var2 = var0.getBytes();
        byte[] var3 = new byte[var2.length];

        for (int var4 = 0; var4 < var2.length; ++var4) {
            var3[var4] = (byte) (var2[var4] ^ var1);
        }

        StringBuilder var9 = new StringBuilder();
        int var6 = var3.length;

        for (int var7 = 0; var7 < var6; ++var7) {
            byte var8 = var3[var7];
            var9.append(String.format("%02x", var8));
        }

        return var9.toString();
    }

    static {
        Field6 = Class767.Field3[Class767.Field1] + ":" + Class767.Field4[Class767.Field1];
        Field7 = Field2();
        Field8 = Field1("4z~z", -6);
        Field9 = Field5();
    }
}
