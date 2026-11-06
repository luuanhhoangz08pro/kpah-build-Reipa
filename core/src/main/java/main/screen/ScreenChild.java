package main.screen;

public interface ScreenChild {
    void resize(int width, int height);
    void show();
    void hide();
    void render();
    boolean isVisible();
}
