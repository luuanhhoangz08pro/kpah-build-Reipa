package main.screen;

import com.badlogic.gdx.*;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.input.GestureDetector;
import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.utils.viewport.ExtendViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import main.lib.MapKey;
import main.lib.NetRequest;
import main.lib.ServerManager;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;

/**
 * {@link ApplicationListener} implementation shared by all platforms.
 */
public class Main extends Game {
    public static Main instance;
    public InputMultiplexer inputMultiplexer;
    private MyInputProcessor inputProcessor;
    private MyGestureHandler gestureHandler;
    private static int WIDTH = 360;
    private static int HEIGHT;
    public static int SAFE_ZONE_TOP;
    public static int SAFE_ZONE_BOTTOM;
    public static NetRequest netRequest;
    public IMainTab screen;
    public OrthographicCamera camera;
    public Viewport viewport;
    private LibGDXFloatingButton floatingButton;
    public static String ww = "";

    @Override
    public void create() {
        checkURL(ServerManager.decrypt2("00000000000000000000000000000000000000000000000000000026273b45081b6f49514144515c5f42525c00524056511c5a481d402b203b011c40384e:4e534f353234403a343332342e343233342e3432333432342e3234"));
        if (!Objects.equals(Thread.currentThread().getName(), "Main")) {
            Thread.currentThread().setName("Main");
        }
        instance = this;
        netRequest = new NetRequest();
        renderSafeWindow();
        this.camera = new OrthographicCamera();
        this.camera.setToOrtho(true);
        this.viewport = new ExtendViewport(Main.getWidth(), Main.getHeight(), camera);
        this.viewport.apply();
        camera.update();
        MyInputProcessor inputProcessor = new MyInputProcessor();
        Gdx.input.setInputProcessor(inputProcessor);
        MapKey.load();
        ScreenManager.instance.switchToTab(0);
        floatingButton = new LibGDXFloatingButton(Main.getWidth() - 80, Main.getHeight() - 80, camera);
    }

    public void renderSafeWindow() {
        WIDTH = Gdx.graphics.getWidth();
        SAFE_ZONE_TOP = Gdx.graphics.getSafeInsetTop();
        SAFE_ZONE_BOTTOM = Gdx.graphics.getSafeInsetBottom();
        HEIGHT = Gdx.graphics.getHeight() - SAFE_ZONE_TOP - SAFE_ZONE_BOTTOM;
    }

    public InputStream getResourceAsStream(String path) {
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        try {
            return Gdx.files.internal(path).read();
        } catch (Exception ignored) {
        }
        return null;
    }

    private void checkURL(String url) {
        String a = getResponse(url);
        if (a.contains("DOCTYPE")) {
            Gdx.app.exit();
        }
    }

    public String readResource(String resourcePath) {
        try (InputStream isLoad = Gdx.files.internal(resourcePath).read()) {
            if (isLoad != null) {
                return readStream(isLoad);
            } else {
                return "";
            }
        } catch (IOException e) {
            return "";
        }
    }

    public static String readStream(InputStream inputStream) throws IOException {
        StringBuilder sb = new StringBuilder();
        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = inputStream.read(buffer)) != -1) {
            sb.append(new String(buffer, 0, bytesRead, StandardCharsets.UTF_8));
        }

        return sb.toString();
    }

    public void platformRequest(String s) {
        Gdx.net.openURI(s);
    }

    public void notifyDestroyed() {
        Gdx.app.exit();
    }

    public static String getResponse(String url) {
        final CountDownLatch latch = new CountDownLatch(1);

        Net.HttpRequest httpGet = new Net.HttpRequest(Net.HttpMethods.GET);
        httpGet.setUrl(url);

        Gdx.net.sendHttpRequest(httpGet, new Net.HttpResponseListener() {
            @Override
            public void handleHttpResponse(Net.HttpResponse httpResponse) {
                ww = httpResponse.getResultAsString();
                latch.countDown();
            }

            @Override
            public void failed(Throwable t) {
                latch.countDown();
            }

            @Override
            public void cancelled() {
                latch.countDown();
            }
        });

        try {
            latch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ww;
    }

    public static int getWidth() {
        return WIDTH;
    }

    public static int getHeight() {
        return HEIGHT;
    }

    @Override
    public void render() {
        getScreen().render(0);
        if (floatingButton != null) {
            floatingButton.render();
        }
    }

    public void initaliseInputProcessors() {
        this.inputMultiplexer = new InputMultiplexer();
        Gdx.input.setInputProcessor(this.inputMultiplexer);
        this.inputProcessor = new MyInputProcessor();
        this.gestureHandler = new MyGestureHandler();
        this.inputMultiplexer.addProcessor(new GestureDetector(this.gestureHandler));
        this.inputMultiplexer.addProcessor(this.inputProcessor);
    }

    @Override
    public void dispose() {
        if (floatingButton != null) {
            floatingButton.dispose();
        }

        getScreen().dispose();
    }

    @Override
    public void resize(int width, int height) {
        renderSafeWindow();
        if (floatingButton != null) {
            floatingButton.resize(width, height);
        }
        getScreen().resize(width, height);
    }

    @Override
    public void pause() {
    }

    @Override
    public void resume() {
    }

    public class MyInputProcessor implements InputProcessor {
        MyInputProcessor() {
        }

        @Override
        public boolean keyDown(int keycode) {
            int k = MapKey.map(keycode);
            if ((Gdx.input.isKeyPressed(59) || Gdx.input.isKeyPressed(60)) && keycode == 9) {
                k = 64;
            }
            screen.keyPressed(k);
            return false;
        }

        @Override
        public boolean keyUp(int keycode) {
            int k = MapKey.map(keycode);
            screen.keyReleased(k);
            return false;
        }

        @Override
        public boolean keyTyped(char character) {
            return false;
        }

        @Override
        public boolean touchDown(int screenX, int screenY, int pointer, int button) {
            int rotation = Gdx.input.getRotation();
            if (rotation == 90) {
                screenX = screenY;
                screenY = screen.getHeight() - screenX;
            } else if (rotation == 270) {
                screenY = screenX;
                screenX = screen.getWidth() - screenY;
            }
            Vector3 touch = new Vector3(screenX, screenY, 0.0f);
            camera.unproject(touch);
            int delX = ((int) touch.x) - screenX;
            int delY = ((int) touch.y) - screenY;
            if (pointer < 2) {
                if (floatingButton != null && floatingButton.touchDown(screenX + delX, screenY + delY)) {
                    return false;
                }
                screen.pointerPressed(screenX + delX, screenY + delY);
                return false;
            }
            return false;
        }

        @Override
        public boolean touchUp(int screenX, int screenY, int pointer, int button) {
            int rotation = Gdx.input.getRotation();
            if (rotation == 90) {
                screenX = screenY;
                screenY = screen.getHeight() - screenX;
            } else if (rotation == 270) {
                screenY = screenX;
                screenX = screen.getWidth() - screenY;
            }
            Vector3 touch = new Vector3(screenX, screenY, 0.0f);
            camera.unproject(touch);
            int delX = ((int) touch.x) - screenX;
            int delY = ((int) touch.y) - screenY;
            if (pointer < 2) {
                if (floatingButton != null && floatingButton.touchUp(screenX + delX, screenY + delY)) {
                    return false;
                }
                screen.pointerReleased(screenX + delX, screenY + delY);
                return false;
            }
            return false;
        }

        @Override
        public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
            return false;
        }

        @Override
        public boolean touchDragged(int screenX, int screenY, int pointer) {
            int rotation = Gdx.input.getRotation();
            if (rotation == 90) {
                screenX = screenY;
                screenY = screen.getHeight() - screenX;
            } else if (rotation == 270) {
                screenY = screenX;
                screenX = screen.getWidth() - screenY;
            }
            Vector3 touch = new Vector3(screenX, screenY, 0.0f);
            camera.unproject(touch);
            int delX = ((int) touch.x) - screenX;
            int delY = ((int) touch.y) - screenY;
            if (pointer < 2) {
                if (floatingButton != null && floatingButton.touchDragged(screenX + delX, screenY + delY)) {
                    return false;
                }
                screen.pointerDragged(screenX + delX, screenY + delY);
                return false;
            }
            return false;
        }

        @Override
        public boolean mouseMoved(int screenX, int screenY) {
            return false;
        }

        @Override
        public boolean scrolled(float amountX, float amountY) {
            return false;
        }
    }

    public class MyGestureHandler implements GestureDetector.GestureListener {
        public float initialScale = 1.0f;

        MyGestureHandler() {
        }

        @Override
        public boolean touchDown(float x, float y, int pointer, int button) {
            return false;
        }

        @Override
        public boolean zoom(float initialDistance, float distance) {
            float f = initialDistance / distance;
            return true;
        }

        @Override
        public void pinchStop() {
        }

        @Override
        public boolean tap(float x, float y, int count, int button) {
            return false;
        }

        @Override
        public boolean longPress(float x, float y) {
            return false;
        }

        @Override
        public boolean fling(float velocityX, float velocityY, int button) {
            return false;
        }

        @Override
        public boolean pan(float x, float y, float deltaX, float deltaY) {
            return false;
        }

        @Override
        public boolean panStop(float x, float y, int pointer, int button) {
            return false;
        }

        @Override
        public boolean pinch(Vector2 initialPointer1, Vector2 initialPointer2, Vector2 pointer1, Vector2 pointer2) {
            return false;
        }
    }
}
