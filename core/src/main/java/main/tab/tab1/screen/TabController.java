package main.tab.tab1.screen;

import main.lib.Graphics;
import main.lib.Image;
import main.screen.Main;
import main.screen.ScreenManager;
import main.tab.tab1.Class105;

public class TabController {
    public Image imgTab;

    public TabController() {
        imgTab = Image.createImage("PK.png");
    }

    public void paint(Graphics g) {
        if (imgTab != null) {
            g.drawImage(imgTab.texture, Main.getWidth() - imgTab.width, Main.getHeight() / 6);
        }
    }

    public void updateKey() {
        if (Class105.Field1(Main.getWidth() - imgTab.width, Main.getHeight() / 6, 35, 35)) {
            if (Class105.Field6) {
                ScreenManager.instance.switchToTab(1);
                Class105.Field6 = false;
                Class105.Field8 = false;
            }
        }
    }
}
