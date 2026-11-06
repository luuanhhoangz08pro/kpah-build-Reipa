package main.tab.tab2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Class834 {
    public static Class834 Field1;
    public static boolean Field2;

    public static Class834 Field1() {
        if (Field1 == null) {
            Field1 = new Class834();
        }

        return Field1;
    }

    public Class834() {
        (new Thread(new Class622())).start();
    }

    public static void Field1(long var0) {
        try {
            Thread.sleep(var0);
        } catch (Exception var3) {
        }

    }

    public final byte[] Field1(String s) {
        try {
            if (s.startsWith("/")) {
                s = s.substring(1);
            }
            final FileHandle fileHandle = Gdx.files.local("rms2/" + s);
            return fileHandle.readBytes();
        } catch (Exception e) {
            return null;
        }
    }

    public static void Field1(final String s, final byte[] array) {
        try {
            FileHandle file = Gdx.files.local("rms2/" + s);
            file.writeBytes(array, false);
        } catch (Exception var2) {
        }
    }

    public final void Field1(String var1, String var2) {
        try {
            this.Field1(var1, var2.getBytes("UTF-8"));
        } catch (Exception var4) {
        }

    }

    public final String Field2(String var1) {
        if (this.Field1(var1) == null) {
            return null;
        } else {
            try {
                return new String(this.Field1(var1), "UTF-8");
            } catch (Exception var3) {
                return new String(this.Field1(var1));
            }
        }
    }
}
