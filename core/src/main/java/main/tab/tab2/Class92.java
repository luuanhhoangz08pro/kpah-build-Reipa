package main.tab.tab2;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;

public class Class92 {
    public static byte[] Field1(String s, final int n) {
        try {
            if (s.startsWith("/")) {
                s = s.substring(1);
            }
            final FileHandle fileHandle = Gdx.files.local("rms2/" + s + "_" + n);
            return fileHandle.readBytes();
        } catch (Exception e) {
            return null;
        }

    }

    public static void Field1(String s, final int n, final byte[] array) {
        if (s.startsWith("/")) {
            s = s.substring(1);
        }
        final FileHandle fileHandle = Gdx.files.local("rms2/" + s + "_" + n);
        fileHandle.writeBytes(array, false);
    }
}
