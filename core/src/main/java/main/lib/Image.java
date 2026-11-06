package main.lib;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.TextureData;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Image {
    public Texture texture;
    public TextureRegion tRegion;
    public int width;
    public int height;

    public Image() {

    }

    public Image(Texture texture) {
        this.texture = texture;
        this.width = texture.getWidth();
        this.height = texture.getHeight();
    }

    public static Image createImage(final String url) {
        final Image img = new Image();
        final Texture texture = TextureService.instance.getImageFromPath(url);
        if (texture == null) {
            return null;
        }
        img.texture = texture;
        img.width = img.texture.getWidth();
        img.height = img.texture.getHeight();
        return img;

    }

    public static Image createImage(final Pixmap pixmap) {
        final Image img = new Image();
        final Texture texture = TextureService.instance.createTextureSafely(pixmap);
        if (texture == null) {
            return null;
        }
        img.texture = texture;
        img.width = img.texture.getWidth();
        img.height = img.texture.getHeight();
        return img;

    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public static Image createImage(final int w, final int h) {
        Image img = new Image();
        img.texture = TextureService.instance.createTextureSafely(w, h);
        img.width = img.texture.getWidth();
        img.height = img.texture.getHeight();
        return img;
    }

    public static Image createImage(byte[] encodedData, int offset, int len) {
        Image img = new Image();
        img.texture = TextureService.instance.createTextureSafely(encodedData, offset, len);
        img.width = img.texture.getWidth();
        img.height = img.texture.getHeight();
        return img;
    }

    public static Image createImage(final int[] encodedData, final int w, final int h) {
        final Image img = new Image();
        img.texture = TextureService.instance.createTextureRGBSafely(encodedData, w, h);
        img.width = img.texture.getWidth();
        img.height = img.texture.getHeight();
        return img;
    }

    public static int argb(int alpha, int red, int green, int blue) {
        return alpha << 24 | red << 16 | green << 8 | blue;
    }

    public void getRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height) {
        if (this.texture == null) {
            throw new IllegalArgumentException("texture Image getRGB is NULL-----------.");
        } else {
            TextureData tData = this.texture.getTextureData();
            if (!tData.isPrepared()) {
                tData.prepare();
            }

            Pixmap a = tData.consumePixmap();
            if (a.isDisposed()) {
                return;
            }
            boolean isRGB888 = false;
            if (a.getFormat() == Pixmap.Format.RGBA8888) {
            }

            int[] r = new int[width * height];
            Color color = new Color();

            int i;
            for (i = 0; i < width; ++i) {
                for (int j = 0; j < height; ++j) {
                    int val = a.getPixel(i + x, j + y);
                    if (isRGB888) {
                        Color.rgb888ToColor(color, val);
                    } else {
                        Color.rgba8888ToColor(color, val);
                    }

                    int R = (int) (color.r * 255.0F);
                    int G = (int) (color.g * 255.0F);
                    int B = (int) (color.b * 255.0F);
                    int A = (int) (color.a * 255.0F);
                    if (isRGB888) {
                        A = 255;
                    }

                    if (color.a == 0.0F) {
                        r[j * width + i] = 16777215;
                    } else {
                        r[j * width + i] = argb(A, R, G, B);
                    }
                }
            }

            for (i = 0; i < rgbData.length; ++i) {
                rgbData[i] = r[i];
            }

        }
    }

    public static Image createRGBImage(int[] rbg, int w, int h, boolean bl) {
        return createImage(rbg, w, h);
    }

    public void dispose() {
        texture.dispose();
    }
}
