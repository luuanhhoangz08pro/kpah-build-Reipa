package main.lib;

import com.badlogic.gdx.Gdx;

public class NetRequest {

    public void platformRequest(String s) {
        Gdx.net.openURI(s);
    }

    public void notifyDestroyed() {
        Gdx.app.exit();
    }

}
