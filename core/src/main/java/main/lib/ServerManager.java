package main.lib;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;

public class ServerManager {
    private static String key = "KPAH543@:4324.4234.423424.24";
    public static String updateLinkServer = "0000000000000000000000000000000000000000000000000000000023243538460e1c6f4855441c5347405a46565b475741575d5a5a575a3f7e2227581b5f354f555d5a5c41555c544e1e0c42415b1d584741402220322d474256321546565447015c5752505d1b5f525d5c1b40405b383f222945:4b504148353433403a343332342e343233342e3432333432342e3234";

    public static String decrypt(String encrypted) {
        try {
            String[] parts = encrypted.split(":");
            if (parts.length != 2) {
                return encrypted;
            }
            String hexEncryptedData = parts[0];
            String hexReceivedHmac = parts[1];
            String xorEncrypted = new String(fromHex(hexEncryptedData), StandardCharsets.UTF_8);
            String receivedHmac = new String(fromHex(hexReceivedHmac), StandardCharsets.UTF_8);
            String calculatedHmac = calculateHMAC(xorEncrypted);
            if (!receivedHmac.equals(calculatedHmac)) {
                return encrypted;
            }
            return xorEncryptDecrypt(xorEncrypted);
        } catch (Exception e) {

        }
        return encrypted;
    }

    private static byte[] fromHex(String hex) {
        int len = hex.length();
        byte[] data = new byte[len / 2];
        for (int i = 0; i < len; i += 2) {
            data[i / 2] = (byte) ((Character.digit(hex.charAt(i), 16) << 4)
                + Character.digit(hex.charAt(i + 1), 16));
        }
        return data;
    }

    public static String calculateHMAC(String data) throws Exception {
        SecretKeySpec secretKey = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
        Mac mac = Mac.getInstance("HmacSHA256");
        mac.init(secretKey);
        byte[] hmacBytes = mac.doFinal(data.getBytes(StandardCharsets.UTF_8));
        return toHex(hmacBytes);
    }

    private static String toHex(byte[] bytes) {
        StringBuilder hexString = new StringBuilder();
        for (byte b : bytes) {
            String hex = Integer.toHexString(0xff & b);
            if (hex.length() == 1) {
                hexString.append('0');
            }
            hexString.append(hex);
        }
        return hexString.toString();
    }

    public static String xorEncryptDecrypt(String input) {
        StringBuilder output = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            output.append((char) (input.charAt(i) ^ key.charAt(i % key.length())));
        }
        return output.toString();
    }

    public static String decrypt2(String encrypted) {
        String[] parts = encrypted.split(":");
        if (parts.length != 2) {
            throw new IllegalArgumentException("Dữ liệu bị lỗi hoặc không hợp lệ.");
        }

        String hexEncodedData = parts[0];
        String hexSalt = parts[1];
        String decoded = new String(fromHex(hexEncodedData), StandardCharsets.UTF_8);
        String salt = new String(fromHex(hexSalt), StandardCharsets.UTF_8);
        String xorDecrypted = xorEncryptDecrypt(decoded);
        return xorDecrypted.substring(salt.length());
    }
}
