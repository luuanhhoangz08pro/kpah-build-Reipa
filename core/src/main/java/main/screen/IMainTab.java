package main.screen;

public interface IMainTab {
    void keyPressed(int k);

    void keyReleased(int k);

    void pointerPressed(int n, int n2);

    void pointerDragged(int n, int n2);

    void pointerReleased(int n, int n2);

    int getHeight();

    int getWidth();

    void toggleAutoClick();

    void showAutoClick();

    boolean isEnableAutoClick();
}
