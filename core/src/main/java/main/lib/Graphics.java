package main.lib;

import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.scenes.scene2d.utils.ScissorStack;
import main.screen.Main;

import java.util.Hashtable;

public class Graphics {
    public static final byte zoomLevel = 1;
    public static final int LEFT = 4;
    public static final int TOP = 16;
    private float r;

    private float g;

    private float b;

    private float a;

    public int clipX;

    public int clipY;

    public int clipW;

    public int clipH;

    private int clipTX;

    private int clipTY;

    private boolean isClip;

    private boolean isTranslate = true;

    private int translateX;

    private int translateY;
    public boolean isRorate;
    public int xRotate;
    public int yRotate;
    public float rotation;
    public static Hashtable<String, Texture> cachedTextures = new Hashtable<>();

    public Vector2 size = new Vector2(128, 128);
    public SpriteBatch graphics;

    public Graphics(SpriteBatch g) {
        graphics = g;
    }

    private void cache(String key, Texture value) {
        if (cachedTextures.size() > 400) {
            cachedTextures.clear();
        }
        cachedTextures.put(key, value);
    }

    public void resetRotate() {
        this.isRorate = false;
        this.xRotate = 0;
        this.yRotate = 0;
    }

    public void rotate(int pAngle, int x, int y) {
        if (pAngle != 0) {
            this.isRorate = true;
            this.rotation = (float) pAngle;
            this.xRotate = x;
            this.yRotate = y;
        }
    }

    public int getClipX() {
        return clipX;
    }

    public int getClipY() {
        return clipY;
    }

    public int getClipWidth() {
        return clipW;
    }

    public int getClipHeight() {
        return clipH;
    }

    public void drawArc(int x, int y, int width, int height, int startAngle, int arcAngle) {

    }

    public void fillArc(int x, int y, int width, int height, int startAngle, int arcAngle) {
        String key = "arc" + r + b + g + a;
        Texture rgb_texture = cachedTextures.get(key);

        if (rgb_texture == null) {
            Pixmap p = new Pixmap(width, height, Pixmap.Format.RGBA8888);
            p.setColor(this.r, this.b, this.g, this.a);
            int centerX = width / 2;
            int centerY = height / 2;
            float radiusX = width / 2f;
            float radiusY = height / 2f;
            for (int angle = startAngle; angle <= startAngle + arcAngle; angle++) {
                double rad = Math.toRadians(angle);
                int px = centerX + (int) (radiusX * Math.cos(rad));
                int py = centerY + (int) (radiusY * Math.sin(rad));
                p.drawPixel(px, py);
            }
            rgb_texture = new Texture(p);
            cachedTextures.put(key, rgb_texture);
            p.dispose();
        }
        drawImage(rgb_texture, x, y);
    }

    public void fillTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
    }

    public void translate(int tx, int ty) {
        translateX += tx;
        translateY += ty;
        isTranslate = translateX != 0 || translateY != 0;
    }

    public int getTranslateX() {
        return translateX;
    }

    public int getTranslateY() {
        return translateY;
    }

    public void setClip(int x, int y, int w, int h) {
        clipTX = translateX;
        clipTY = translateY;
        clipX = x;
        clipY = y;
        clipW = w;
        clipH = h;
        isClip = true;
    }


    public void begin() {
        this.graphics.begin();
    }

    public void end() {
        this.translateX = 0;
        this.translateY = 0;
        this.isTranslate = false;
        this.isClip = false;
        this.graphics.end();
    }

    public void drawLine(int x1, int y1, int x2, int y2) {
        if (y1 == y2) {
            if (x1 > x2) {
                int num = x2;
                x2 = x1;
                x1 = num;
            }
            fillRect(x1, y1, x2 - x1, 1);
            return;
        }
        if (x1 == x2) {
            if (y1 > y2) {
                int num2 = y2;
                y2 = y1;
                y1 = num2;
            }
            fillRect(x1, y1, 1, y2 - y1);
            return;
        }
        if (isTranslate) {
            x1 += translateX;
            y1 += translateY;
            x2 += translateX;
            y2 += translateY;
        }
        String key = "line" + r + g + b + a;
        Texture texture2D = cachedTextures.get(key);
        if (texture2D == null) {
            Pixmap p = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
            p.setColor(this.r, this.b, this.g, this.a);
            p.drawPixel(0, 0);
            texture2D = new Texture(p);
            p.dispose();
            cache(key, texture2D);
        }
        float xSl = (float) Math.sqrt(((y2 - y1) * (y2 - y1)) + ((x2 - x1) * (x2 - x1)));
        Vector2 start = new Vector2(x1, y1);
        Vector2 end = new Vector2(x2, y2);
        float angle = getAngle(start, end);
        int num3;
        int num4;
        int num5;
        int num6;
        if (this.isClip) {
            num3 = this.clipX;
            num4 = this.clipY;
            num5 = this.clipW;
            num6 = this.clipH;
            Rectangle scissors = new Rectangle();
            if (this.isTranslate) {
                num3 += this.clipTX;
                num4 += this.clipTY;
            }
            Rectangle clipBounds = new Rectangle(num3, num4, num5, num6);
            ScissorStack.calculateScissors(Main.instance.camera, this.graphics.getTransformMatrix(), clipBounds, scissors);
            ScissorStack.pushScissors(scissors);
        }
        this.graphics.draw(texture2D, x1, y1, 0.0f, 0.0f, 1.0f, 1.0f, xSl, 1, angle, 0, 0, 1, 1, false, false);
        if (this.isClip) {
            this.graphics.flush();
            ScissorStack.popScissors();
        }
    }

    public float getAngle(Vector2 centerPt, Vector2 target) {
        float angle = (float) Math.toDegrees(Math.atan2(target.y - centerPt.y, target.x - centerPt.x));
        if (angle < 0.0f) {
            angle += 360.0f;
        }
        return angle;
    }

    public void drawRect(int x, int y, int w, int h) {
        int num = 1;
        fillRect(x, y, w, num);
        fillRect(x, y, num, h);
        fillRect(x + w, y, num, h + 1);
        fillRect(x, y + h, w + 1, num);
    }

    public void fillRect(int x, int y, int w, int h) {
        try {
            if (w < 0 || h < 0) {
                return;
            }
            if (isTranslate) {
                x += translateX;
                y += translateY;
            }
            String key = "fr" + r + g + b + a;
            Texture texture2D = cachedTextures.get(key);
            if (texture2D == null) {
                Pixmap p = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
                p.setColor(this.r, this.b, this.g, this.a);
                p.fillRectangle(0, 0, 1, 1);
                texture2D = new Texture(p);
                p.dispose();
                cache(key, texture2D);
            }
            int num3;
            int num4;
            int num5;
            int num6;
            if (this.isClip) {
                num3 = this.clipX;
                num4 = this.clipY;
                num5 = this.clipW;
                num6 = this.clipH;
                Rectangle scissors = new Rectangle();
                if (this.isTranslate) {
                    num3 += this.clipTX;
                    num4 += this.clipTY;
                }
                Rectangle clipBounds = new Rectangle(num3, num4, num5, num6);
                ScissorStack.calculateScissors(Main.instance.camera, this.graphics.getTransformMatrix(), clipBounds, scissors);
                ScissorStack.pushScissors(scissors);
            }
            this.graphics.draw(texture2D, x, y, w, h);
            if (this.isClip) {
                this.graphics.flush();
                ScissorStack.popScissors();
            }
        } catch (Exception e) {

        }

    }

    public void fillRect(int x, int y, int w, int h, Color color) {
        if (w < 0 || h < 0) {
            return;
        }
        if (isTranslate) {
            x += translateX;
            y += translateY;
        }
        String key = "fr" + color.toIntBits();
        Texture texture2D = cachedTextures.get(key);
        if (texture2D == null) {
            Pixmap p = new Pixmap(1, 1, Pixmap.Format.RGBA8888);
            p.setColor(color);
            p.fillRectangle(0, 0, 1, 1);
            texture2D = new Texture(p);
            p.dispose();
            cache(key, texture2D);
        }
        int num3;
        int num4;
        int num5;
        int num6;
        if (this.isClip) {
            num3 = this.clipX;
            num4 = this.clipY;
            num5 = this.clipW;
            num6 = this.clipH;
            Rectangle scissors = new Rectangle();
            if (this.isTranslate) {
                num3 += this.clipTX;
                num4 += this.clipTY;
            }
            Rectangle clipBounds = new Rectangle(num3, num4, num5, num6);
            ScissorStack.calculateScissors(Main.instance.camera, this.graphics.getTransformMatrix(), clipBounds, scissors);
            ScissorStack.pushScissors(scissors);
        }
        this.graphics.draw(texture2D, x, y, w, h);
        if (this.isClip) {
            this.graphics.flush();
            ScissorStack.popScissors();
        }
    }

    public void drawString(String text, int x, int y, BitmapFont font) {
        int num3;
        int num4;
        int num5;
        int num6;
        if (this.isClip) {
            num3 = this.clipX;
            num4 = this.clipY;
            num5 = this.clipW;
            num6 = this.clipH;
            Rectangle scissors = new Rectangle();
            if (this.isTranslate) {
                num3 += this.clipTX;
                num4 += this.clipTY;
            }
            Rectangle clipBounds = new Rectangle(num3, num4, num5, num6);
            ScissorStack.calculateScissors(Main.instance.camera, this.graphics.getTransformMatrix(), clipBounds, scissors);
            ScissorStack.pushScissors(scissors);
        }
        font.draw(graphics, text, x, y);
        if (this.isClip) {
            this.graphics.flush();
            ScissorStack.popScissors();
        }
    }

    public void setColor(int rgb) {
        float R = (rgb >> 16) & 255;
        float B = (rgb >> 8) & 255;
        float G = rgb & 255;
        this.b = B / 256.0f;
        this.g = G / 256.0f;
        this.r = R / 256.0f;
        this.a = 1.0f;
    }

    public void setColor(int R, int G, int B) {
        this.b = G / 256.0f;
        this.g = B / 256.0f;
        this.r = R / 256.0f;
        this.a = 1.0f;
    }

    public void setColor(int rgb, float alpha) {
        float R = (rgb >> 16) & 255;
        float B = (rgb >> 8) & 255;
        float G = rgb & 255;
        this.b = B / 256.0f;
        this.g = G / 256.0f;
        this.r = R / 256.0f;
        this.a = alpha;
    }

    public void drawRegion(Image arg0, int x0, int y0, int w0, int h0, int transform, int x, int y, int anchor) {
        if (arg0 == null) {
            return;
        }
        _drawRegion(arg0.texture, x0, y0, w0, h0, transform, x, y, anchor);
    }

    public void drawRegion(Texture arg0, int x0, int y0, int w0, int h0, int transform, int x, int y, int anchor) {
        _drawRegion(arg0, x0, y0, w0, h0, transform, x, y, anchor);
    }

    public void _drawRegion(Texture image, int x_src, int y_src, int width, int height, int flip, int x_dest, int y_dest, int anchor) {
        try {
            if (image == null) {
                return;
            }
            if (this.isTranslate) {
                x_dest += this.translateX;
                y_dest += this.translateY;
            }
            boolean flipX = false;
            boolean flipY = true;
            int ixA = 0;
            int iyA = 0;
            switch (anchor) {
                case 0:
                case 20:
                    break;
                case 3:
                    ixA = width / 2;
                    iyA = height / 2;
                    if (flip == 4 || flip == 7 || flip == 6 || flip == 5) {
                        ixA = height / 2;
                        iyA = width / 2;
                        break;
                    }
                    break;
                case 6:
                    iyA = height / 2;
                    if (flip == 4 || flip == 7 || flip == 6 || flip == 5) {
                        iyA = width / 2;
                        break;
                    }
                    break;
                case 10:
                    ixA = width;
                    iyA = height / 2;
                    if (flip == 4 || flip == 7 || flip == 6 || flip == 5) {
                        ixA = height;
                        iyA = width / 2;
                        break;
                    }
                    break;
                case 17:
                    ixA = width / 2;
                    if (flip == 4 || flip == 6 || flip == 5 || flip == 7) {
                        ixA = height / 2;
                    }
                    break;
                case 24:
                    ixA = width;
                    if (flip == 4 || flip == 6 || flip == 5 || flip == 7) {
                        ixA = height;
                    }
                    break;
                case 33:
                    ixA = width / 2;
                    iyA = height;
                    if (flip == 4 || flip == 7 || flip == 6 || flip == 5) {
                        ixA = height / 2;
                        iyA = width;
                        break;
                    }
                    break;
                case 36:
                    iyA = height;
                    if (flip == 4 || flip == 7 || flip == 6 || flip == 5) {
                        iyA = width;
                        break;
                    }
                    break;
                case 40:
                    ixA = width;
                    iyA = height;
                    if (flip == 4 || flip == 7 || flip == 6 || flip == 5) {
                        ixA = height;
                        iyA = width;
                        break;
                    }
                    break;
            }
            int x_dest2 = x_dest - ixA;
            int y_dest2 = y_dest - iyA;
            int ix = 0;
            int iy = 0;
            switch (flip) {
                case 1:
                    flip = 0;
                    flipY = false;
                    break;
                case 2:
                    flip = 0;
                    flipX = true;
                    break;
                case 3:
                    flip = 180;
                    iy = -height;
                    ix = -width;
                    break;
                case 4:
                    flip = 90;
                    flipY = false;
                    ix = -height;
                    break;
                case 5:
                    flip = 90;
                    ix = -height;
                    break;
                case 6:
                    flip = 90;
                    flipY = false;
                    flipX = true;
                    ix = -height;
                    break;
                case 7:
                    flip = 90;
                    flipX = true;
                    ix = -height;
                    break;
            }
            int num3;
            int num4;
            int num5;
            int num6;
            if (this.isClip) {
                num3 = this.clipX;
                num4 = this.clipY;
                num5 = this.clipW;
                num6 = this.clipH;
                Rectangle scissors = new Rectangle();
                if (this.isTranslate) {
                    num3 += this.clipTX;
                    num4 += this.clipTY;
                }
                Rectangle clipBounds = new Rectangle(num3, num4, num5, num6);
                ScissorStack.calculateScissors(Main.instance.camera, this.graphics.getTransformMatrix(), clipBounds, scissors);
                ScissorStack.pushScissors(scissors);
            }
            this.graphics.draw(image, x_dest2 - ix, y_dest2 - iy, 0.0f, 0.0f, width, height, 1f, 1f, flip, x_src, y_src, width, height, flipX, flipY);
            if (this.isClip) {
                this.graphics.flush();
                ScissorStack.popScissors();
            }
        } catch (Exception e) {

        }

    }

    public void drawRoundRect(int x, int y, int w, int h, int a, int b) {
        this.drawRect(x, y, w, h);
    }

    public void drawRGB(int[] rgbData, int offset, int scanlength, int x, int y, int width, int height, boolean processAlpha) {
        String key = "rgbDraw" + r + g + b + a;
        Texture texture2D = cachedTextures.get(key);
        if (texture2D == null) {
            Pixmap pixmap = new Pixmap(width, height, Pixmap.Format.RGBA8888);
            for (int row = 0; row < height; row++) {
                for (int col = 0; col < width; col++) {
                    int index = offset + row * scanlength + col;
                    int pixel = rgbData[index];
                    int r = (pixel >> 16) & 0xFF;
                    int g = (pixel >> 8) & 0xFF;
                    int b = pixel & 0xFF;
                    int a = processAlpha ? (pixel >> 24) & 0xFF : 255;
                    pixmap.drawPixel(col, row, Color.rgba8888(r / 255f, g / 255f, b / 255f, a / 255f));
                }
            }
            texture2D = new Texture(pixmap);
            pixmap.dispose();
            cache(key, texture2D);
        }
        drawImage(texture2D, x, y);
    }

    public void drawImage(Texture image, int x, int y, int anchor) {
        if (image != null) {
            drawRegion(image, 0, 0, getImageWidth(image), getImageHeight(image), 0, x, y, anchor);
        }
    }

    public void drawImage(Image image, int x, int y, int anchor) {
        if (image == null) {
            return;
        }
        if (image != null) {
            drawRegion(image.texture, 0, 0, getImageWidth(image.texture), getImageHeight(image.texture), 0, x, y, anchor);
        }
    }

    public void drawImage(Texture image, int x, int y) {
        if (image != null) {
            drawRegion(image, 0, 0, getImageWidth(image), getImageHeight(image), 0, x, y, TOP | LEFT);
        }
    }

    public void fillRoundRect(int x, int y, int width, int height, int arcWidth, int arcHeight) {
        fillRect(x, y, width, height);
    }

    public static int getImageWidth(Texture image) {
        return image.getWidth();
    }

    public static int getImageHeight(Texture image) {
        return image.getHeight();
    }
}
