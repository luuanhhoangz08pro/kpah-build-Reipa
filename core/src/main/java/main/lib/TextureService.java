package main.lib;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.FrameBuffer;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

public class TextureService {
    public static TextureService instance = new TextureService();

    public Texture getImageFromPath(String path) {
        try {
            if (path.startsWith("/")) {
                path = path.substring(1);
            }
            final FileHandle fileHandle = Gdx.files.internal(path);
            if (!fileHandle.exists()) {
                return null;
            }
            return createTextureSafely(fileHandle);
        } catch (Exception e) {
        }
        return null;
    }

    public Texture createTextureRGBSafely(final int[] encodedData, int w, int h) {
        try {
            if (Thread.currentThread().getName().equals("Main")) {
                return createRGBTexture(encodedData, w, h);
            } else {
                final AtomicReference<Texture> textureHolder = new AtomicReference<>();
                final CountDownLatch latch = new CountDownLatch(1);
                Gdx.app.postRunnable(() -> {
                    textureHolder.set(createRGBTexture(encodedData, w, h));
                    latch.countDown();
                });
                latch.await();
                return textureHolder.get();
            }
        } catch (Exception e) {

        }
        return null;
    }

    private Texture createRGBTexture(final int[] encodedData, int w, int h) {
        Pixmap p = new Pixmap(w, h, Pixmap.Format.RGBA8888);
        for (int i = 0; i < w; ++i) {
            for (int j = 0; j < h; ++j) {
                if (encodedData[j * w + i] != 16777215 && encodedData[j * w + i] != -16777215) {
                    p.setColor(setColor(encodedData[j * w + i]));
                } else {
                    p.setColor(new Color(0.0F, 0.0F, 0.0F, 0.0F));
                }

                p.drawPixel(i, j);
            }
        }

        Texture texture = new Texture(p);
        texture.setFilter(Texture.TextureFilter.Nearest, Texture.TextureFilter.Nearest);
        p.dispose();
        return texture;
    }

    public Texture spriteBatchToTexture(final SpriteBatch spriteBatch, final Runnable drawingCode, final int width, final int height) {
        class TextureCreator implements Runnable {
            Texture result;

            @Override
            public void run() {
                FrameBuffer frameBuffer = new FrameBuffer(Pixmap.Format.RGBA8888, width, height, false);
                frameBuffer.begin();
                Gdx.gl.glClearColor(0, 0, 0, 0);
                Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
                spriteBatch.getProjectionMatrix().setToOrtho2D(0, 0, width, height);
                spriteBatch.begin();
                drawingCode.run();
                spriteBatch.end();
                result = frameBuffer.getColorBufferTexture();
                frameBuffer.end();
            }
        }

        TextureCreator creator = new TextureCreator();
        if (Thread.currentThread().getName().equals("Main")) {
            creator.run();
        } else {
            final CountDownLatch latch = new CountDownLatch(1);

            Gdx.app.postRunnable(() -> {
                creator.run();
                latch.countDown();
            });

            try {
                latch.await();
            } catch (InterruptedException e) {
            }
        }

        return creator.result;
    }

    public static Color setColor(int rgb) {
        float R = (float) (rgb >> 16 & 255);
        float G = (float) (rgb >> 8 & 255);
        float B = (float) (rgb & 255);
        float b = B / 256.0F;
        float g = G / 256.0F;
        float r = R / 256.0F;
        return new Color(r, g, b, 1.0F);
    }

    public Texture createTextureSafely(Pixmap pixmap) {
        try {
            if (Thread.currentThread().getName().equals("Main")) {
                return new Texture(pixmap);
            } else {
                final AtomicReference<Texture> textureHolder = new AtomicReference<>();
                final CountDownLatch latch = new CountDownLatch(1);
                Gdx.app.postRunnable(() -> {
                    textureHolder.set(new Texture(pixmap));
                    latch.countDown();
                });
                latch.await();
                return textureHolder.get();
            }
        } catch (Exception e) {

        }
        return null;
    }

    public Texture createTextureSafely(int w, int h) {
        try {
            if (Thread.currentThread().getName().equals("Main")) {
                return new Texture(w, h, Pixmap.Format.RGBA8888);
            } else {
                final AtomicReference<Texture> textureHolder = new AtomicReference<>();
                final CountDownLatch latch = new CountDownLatch(1);
                Gdx.app.postRunnable(() -> {
                    textureHolder.set(new Texture(w, h, Pixmap.Format.RGBA8888));
                    latch.countDown();
                });
                latch.await();
                return textureHolder.get();
            }
        } catch (Exception e) {

        }
        return null;
    }

    private Texture createTextureSafely(FileHandle fileHandle) {
        if (Thread.currentThread().getName().equals("Main")) {
            return new Texture(fileHandle);
        } else {
            final AtomicReference<Texture> textureHolder = new AtomicReference<>();
            final CountDownLatch latch = new CountDownLatch(1);

            Gdx.app.postRunnable(() -> {
                Texture texture = new Texture(fileHandle);
                textureHolder.set(texture);
                latch.countDown();
            });

            try {
                latch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            return textureHolder.get();
        }
    }

    public Texture createTextureSafely(byte[] data, int offset, int length) {
        try {
            if (Thread.currentThread().getName().equals("Main")) {
                return createTexture(data, offset, length);
            } else {
                final AtomicReference<Texture> textureHolder = new AtomicReference<>();
                final CountDownLatch latch = new CountDownLatch(1);
                Gdx.app.postRunnable(() -> {
                    textureHolder.set(createTexture(data, offset, length));
                    latch.countDown();
                });
                latch.await();
                return textureHolder.get();
            }
        } catch (Exception e) {

        }
        return null;
    }

    private Texture createTexture(byte[] data, int offset, int length) {
        try {
            Pixmap pixmap = new Pixmap(data, offset, length);
            Texture texture = new Texture(pixmap);
            pixmap.dispose();
            return texture;
        } catch (Exception ignored) {
        }
        return null;
    }
}
