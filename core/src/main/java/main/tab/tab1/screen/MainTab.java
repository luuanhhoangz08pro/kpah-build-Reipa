package main.tab.tab1.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import main.lib.Graphics;
import main.lib.MapKey;
import main.screen.IMainTab;
import main.screen.Main;
import main.screen.ScreenChild;
import main.tab.tab1.*;

public class MainTab implements Screen, InputProcessor, IMainTab {
    public static MainTab instance;
    public Class105 gameCanvas;
    public ScreenChild screenChild;
    public boolean isCreated;
    private Graphics graphics;

    public static String Field2 = "2.0.9";
    public static String Field3 = "0";
    public static String Field4 = "-1";
    public static String Field5 = "-1";
    public static String Field6 = "";
    public static boolean Field7 = false;
    public static int Field8 = 72;

    public static SelectedScreen selectedScreen;
    public static DodgeScreen dodgeScreen;
    public static AutoClick autoClick;

    @Override
    public void show() {
        if (!isCreated) {
            SpriteBatch batch = new SpriteBatch();
            graphics = new Graphics(batch);
            instance = this;
            selectedScreen = new SelectedScreen();
            autoClick = new AutoClick();
            dodgeScreen = new DodgeScreen();
            gameCanvas = new Class105();
            gameCanvas.Field4();
            Class767.Field5().Field6();
            Class804.Field45.Field6 = true;
            isCreated = true;
        }
    }

    public final void Field1() {
        gameCanvas.Field3();
        gameCanvas.sizeChanged(0, 0);
        Class804.Field2();
        Class96.Field1().Field1(Class130.Field1());
        Class263.Field1().Field1 = Class96.Field1();
        Class804.Field6();
        Class458.Field1(0, null);
        Class767.Field5().Field1();
        Class105.Field26 = false;
        Field5 = Main.instance.readResource("agent.txt");
        Field4 = Main.instance.readResource("provider.txt");

        System.out.println("agent: ================" + Field5);
        System.out.println("provider: =============" + Field4);
        System.out.println("client pro : =======" + Field3);
        System.out.println("ban thuong " + Field2);
    }

    public static void Field2(final String s) {
        if (!s.isEmpty()) {
            Gdx.net.openURI(s);
            Main.instance.notifyDestroyed();
        }
    }

    public static void Field1(String var0, String var1, Class258 var2, Class258 var3) {
    }

    @Override
    public void render(float delta) {
        Gdx.gl.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        Gdx.gl.glClear(16384);
        Main.instance.camera.position.set(Main.getWidth() / 2f, (Main.getHeight() - Main.SAFE_ZONE_TOP + Main.SAFE_ZONE_BOTTOM) / 2f, 0);
        Main.instance.camera.update();
        this.graphics.graphics.setProjectionMatrix(Main.instance.camera.combined);
        if (screenChild != null && screenChild.isVisible()) {
            screenChild.render();
        } else {
            this.graphics.begin();
            if (gameCanvas != null) {
                try {
                    gameCanvas.paint(this.graphics);
                } catch (Exception e) {

                }
            }
            this.graphics.end();
        }
    }

    @Override
    public void resize(int width, int height) {
        Main.instance.viewport.update(width, height);
        if (screenChild != null && screenChild.isVisible()) {
            screenChild.resize(width, height);
        }

    }

    @Override
    public void pause() {

    }

    @Override
    public void resume() {

    }

    @Override
    public void hide() {

    }

    @Override
    public void dispose() {
        graphics.graphics.dispose();
        System.exit(0);
    }

    @Override
    public boolean keyDown(int keycode) {
        int k = MapKey.map(keycode);
        gameCanvas.KeyPressed(k);
        return false;
    }

    @Override
    public boolean keyUp(int keycode) {
        int k = MapKey.map(keycode);
        gameCanvas.KeyReleased(k);
        return false;
    }


    @Override
    public boolean keyTyped(char character) {
        return false;
    }

    @Override
    public boolean touchDown(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchUp(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchCancelled(int screenX, int screenY, int pointer, int button) {
        return false;
    }

    @Override
    public boolean touchDragged(int screenX, int screenY, int pointer) {
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

    @Override
    public void keyPressed(int k) {
        gameCanvas.KeyPressed(k);
    }

    @Override
    public void keyReleased(int k) {
        gameCanvas.KeyReleased(k);
    }

    @Override
    public void pointerPressed(int n, int n2) {
        gameCanvas.pointerPressed(n, n2);
    }

    @Override
    public void pointerDragged(int n, int n2) {
        gameCanvas.pointerDragged(n, n2);

    }

    @Override
    public void pointerReleased(int n, int n2) {
        gameCanvas.pointerReleased(n, n2);

    }

    @Override
    public int getHeight() {
        return Class105.Field13;
    }

    @Override
    public int getWidth() {
        return Class105.Field14;
    }

    @Override
    public void toggleAutoClick() {
        autoClick.toggleAutoClick();
    }

    @Override
    public void showAutoClick() {
        autoClick.show();
    }

    @Override
    public boolean isEnableAutoClick() {
        return autoClick.autoClickEnabled;
    }
}
