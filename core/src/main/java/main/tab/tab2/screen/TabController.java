package main.tab.tab2.screen;

import main.lib.Graphics;
import main.lib.Image;
import main.screen.Main;
import main.screen.ScreenManager;
import main.tab.tab2.Class106;

public class TabController {
    public Image imgTab;

    public TabController() {
        imgTab = Image.createImage("TB.png");
    }

    public void paint(Graphics g) {
        if (imgTab != null) {
            g.drawImage(imgTab.texture, Main.getWidth() - imgTab.width, Main.getHeight() / 6);
        }
    }

    public void updateKey() {
        if (Class106.Field1(Main.getWidth() - imgTab.width, Main.getHeight() / 6, 35, 35)) {
            if (Class106.Field6) {
                ScreenManager.instance.switchToTab(0);
                Class106.Field6 = false;
                Class106.Field8 = false;
            }
        }
    }
}
