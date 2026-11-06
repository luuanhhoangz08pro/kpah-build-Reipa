package main.screen;

import com.badlogic.gdx.Gdx;

public class ScreenManager {

    public static ScreenManager instance = new ScreenManager();
    public Main gameScreen = new Main();
    private final main.tab.tab1.screen.MainTab mainTab1 = new main.tab.tab1.screen.MainTab();
    private final main.tab.tab2.screen.MainTab mainTab2 = new main.tab.tab2.screen.MainTab();

    public void switchToTab(int currentTab) {
        if (Thread.currentThread().getName().equals("Main")) {
            switchTab(currentTab);
        } else {
            Gdx.app.postRunnable(() -> switchTab(currentTab));
        }
    }

    private void switchTab(int currentTab) {
        switch (currentTab) {
            case 0:
                gameScreen.screen = mainTab1;
                gameScreen.setScreen(mainTab1);
                break;
            case 1:
                gameScreen.screen = mainTab2;
                gameScreen.setScreen(mainTab2);
                break;
        }
        Main.instance.initaliseInputProcessors();
    }
}
