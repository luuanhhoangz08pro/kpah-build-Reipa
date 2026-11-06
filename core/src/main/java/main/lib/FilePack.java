package main.lib;

import main.screen.Main;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class FilePack {
    private String[] fname;
    private int[] fpos;
    private int[] flen;
    private byte[] fullData;
    private int nFile;
    private byte[] code = {78, 103, 117, 121, 101, 110, 86, 97, 110, 77, 105, 110, 104};
    private int hSize;

    public FilePack(byte[] bArr) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        load(new DataInputStream(byteArrayInputStream));
        try {
            byteArrayInputStream.close();
        } catch (IOException unused) {
        }
    }

    public FilePack(String str) {
        InputStream resourceAsStream = Main.instance.getResourceAsStream(str);
        load(new DataInputStream(resourceAsStream));
        try {
            resourceAsStream.close();
        } catch (IOException unused) {
        }
    }

    private void load(DataInputStream dataInputStream) {
        this.hSize = this.code.length;
        int i = 0;
        int i2 = 0;
        try {
            this.nFile = dataInputStream.readUnsignedByte();
            this.fname = new String[this.nFile];
            this.fpos = new int[this.nFile];
            this.flen = new int[this.nFile];
            for (int i3 = 0; i3 < this.nFile; i3++) {
                byte[] bArr = new byte[dataInputStream.readByte()];
                dataInputStream.read(bArr);
                loadFile(bArr);
                this.fname[i3] = new String(bArr);
                this.fpos[i3] = i;
                this.flen[i3] = dataInputStream.readUnsignedShort();
                i += this.flen[i3];
                i2 += this.flen[i3];
            }
            this.fullData = new byte[i2];
            dataInputStream.readFully(this.fullData);
            loadFile(this.fullData);
            dataInputStream.close();
        } catch (IOException unused) {
        }
        try {
            dataInputStream.close();
        } catch (IOException unused2) {
        }
    }

    private void loadFile(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            bArr[i] = (byte) (bArr[i] ^ this.code[i % this.hSize]);
        }
    }

    public final Image loadImage(String str) {
        for (int i = 0; i < this.nFile; i++) {
            if (this.fname[i].compareTo(str) == 0) {
                return Image.createImage(this.fullData, this.fpos[i], this.flen[i]);
            }
        }
        return null;
    }
}
