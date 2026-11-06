package main.tab.tab1;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Class251 {
    public static Class251 Field1;
    public static boolean Field2;

    public static Class251 Field1() {
        if (Field1 == null) {
            Field1 = new Class251();
        }

        return Field1;
    }

    public Class251() {
        (new Thread(new Class88())).start();
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
            final FileHandle fileHandle = Gdx.files.local("rms/" + s);
            return fileHandle.readBytes();
        } catch (Exception e) {
            return null;
        }
    }

    public final void Field1(String s, final byte[] array) {
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        final FileHandle fileHandle = Gdx.files.local("rms/" + s);
        fileHandle.writeBytes(array, false);
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
