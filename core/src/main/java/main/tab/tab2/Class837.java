package main.tab.tab2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;

public final class Class837 {
    public static void Field1() {
        try {
            FileHandle file = Gdx.files.local("rms");
            if (file.exists()) {
                FileHandle[] files = file.list();
                for (FileHandle f : files) {
                    f.delete();
                }
            }
        } catch (final Exception ex) {
        }
    }

    public static byte[] Field1(final String s) {
        try {
            FileHandle file = Gdx.files.local("rms2/" + s);
            return file.readBytes();
        } catch (Exception var2) {
            return null;
        }
    }


    public static void Field1(String var0, String var1) {
        try {
            Field1(var0, var1.getBytes("UTF-8"));
        } catch (Exception var2) {
            var2.printStackTrace();
        }
    }

    public static void deleteFile(String s) {
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        final FileHandle fileHandle = Gdx.files.local("rms2/" + s);
        fileHandle.delete();
    }

    public static void Field1(final String s, final byte[] array) {
        try {
            FileHandle file = Gdx.files.local("rms2/" + s);
            file.writeBytes(array, false);
        } catch (Exception var2) {
        }
    }

    public static String Field2(String var0) {
        byte[] var3;
        if ((var3 = Field1(var0)) == null) {
            return null;
        } else {
            try {
                return new String(var3, "UTF-8");
            } catch (Exception var2) {
                return new String(var3);
            }
        }
    }

    public static int Field3(String var0) {
        byte[] var1;
        return (var1 = Field1(var0)) == null ? -1 : var1[0];
    }

    public static void Field1(String var0, int var1) {
        try {
            Field1(var0, new byte[]{(byte) var1});
        } catch (Exception var2) {
        }
    }

    public static void Field2() {
        ByteArrayOutputStream var0 = new ByteArrayOutputStream();
        DataOutputStream var1 = new DataOutputStream(var0);

        try {
            var1.writeUTF(Class106.Field19.Field15.Field65);

            for (int var2 = 0; var2 < Class582.Field1.length; ++var2) {
                for (int var3 = 0; var3 < Class582.Field1[var2].length; ++var3) {
                    Class250 var4 = Class582.Field1[var2][var3];
                    var1.writeByte(var4.Field1);
                    if (var4.Field1 == 2) {
                        var1.writeByte(var4.Field3());
                    } else {
                        var1.writeByte(var4.Field2());
                    }

                    var1.writeBoolean(var4.Field2);
                    var1.writeByte(Class62.Field46);
                }
            }

            byte[] var6 = var0.toByteArray();
            Field1("nqshQuickSlot", var6);
            var1.close();
        } catch (Exception var5) {
            var5.printStackTrace();
        }
    }
}
