package main.tab.tab1.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.ray3k.stripe.FreeTypeSkin;
import main.screen.Main;
import main.screen.ScreenChild;
import main.tab.tab1.Class251;

import java.util.Vector;

public class DodgeScreen implements ScreenChild {
    private final Stage stage;
    private final Viewport viewport;
    public boolean isVisible = false;
    public TextField Field4;
    public static String Field5 = Class251.Field1().Field2("autone1") != null ? Class251.Field1().Field2("autone1") : "";
    public static String[] Field6;
    public TextField Field7;
    public TextField Field8;
    public TextField Field9;
    public TextField Field10;
    public static String Field11;
    public static String Field12;
    public static String Field13;
    public static String Field14;

    public DodgeScreen() {
        loadDodge();
        viewport = new ScreenViewport();
        stage = new Stage(viewport);
        viewport.apply();
        Skin skin = new FreeTypeSkin(Gdx.files.internal("skin/skin.json"));
        Gdx.input.setInputProcessor(stage);
        Window root = new Window("Danh Sách Né", skin);
        root.setFillParent(true);
        stage.addActor(root);
        root.top();
        Label titleLabel = new Label("Danh Sách Né", skin);
        root.add(titleLabel).colspan(2).pad(20 + Gdx.graphics.getSafeInsetTop());
        root.row();
        root.add(new Label("Lưu ý: Nhập đúng chính tả không được viết hoa", skin)).colspan(3).pad(5).left();
        root.row();

        Field4 = new TextField(Field5, skin);
        root.add(new Label("Nhân vật né 1", skin)).pad(5);
        root.add(Field4).width(230).pad(5);
        root.row();

        Field7 = new TextField(Field11, skin);
        root.add(new Label("Nhân vật né 2", skin)).pad(5);
        root.add(Field7).width(230).pad(5);
        root.row();

        Field8 = new TextField(Field12, skin);
        root.add(new Label("Nhân vật né 3", skin)).pad(5);
        root.add(Field8).width(230).pad(5);
        root.row();

        Field9 = new TextField(Field13, skin);
        root.add(new Label("Nhân vật né 4", skin)).pad(5);
        root.add(Field9).width(230).pad(5);
        root.row();

        Field10 = new TextField(Field14, skin);
        root.add(new Label("Nhân vật né 5", skin)).pad(5);
        root.add(Field10).width(230).pad(5);
        root.row();

        TextButton saveButton = new TextButton("Lưu", skin);
        TextButton exitButton = new TextButton("Thoát", skin);
        Table buttonTable = new Table();
        buttonTable.add(saveButton).pad(10).right();
        buttonTable.add(exitButton).pad(10).left();
        root.add(buttonTable).colspan(2).padTop(20).right().expandY().top();
        saveButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                saveDataDodge();
                hide();
            }
        });

        exitButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                hide();
            }
        });
    }

    public void saveDataDodge() {
        Field5 = Field4.getText();
        Class251.Field1().Field1("autone1", Field5);
        Field6 = splitString(Field5, "/n");
        Field11 = Field7.getText();
        Class251.Field1().Field1("autone2", Field11);
        Field6 = splitString(Field11, "/n");
        Field12 = Field8.getText();
        Class251.Field1().Field1("autone3", Field12);
        Field6 = splitString(Field12, "/n");
        Field13 = Field9.getText();
        Class251.Field1().Field1("autone4", Field13);
        Field6 = splitString(Field13, "/n");
        Field14 = Field10.getText();
        Class251.Field1().Field1("autone5", Field14);
        Field6 = splitString(Field14, "/n");
    }

    public void loadDodge() {
        Field5 = Class251.Field1().Field2("autone1") != null ? Class251.Field1().Field2("autone1") : "";
        Field6 = splitString(Field5, "/n");
        Field11 = Class251.Field1().Field2("autone2") != null ? Class251.Field1().Field2("autone2") : "";
        Field6 = splitString(Field11, "/n");
        Field12 = Class251.Field1().Field2("autone3") != null ? Class251.Field1().Field2("autone3") : "";
        Field6 = splitString(Field12, "/n");
        Field13 = Class251.Field1().Field2("autone4") != null ? Class251.Field1().Field2("autone4") : "";
        Field6 = splitString(Field13, "/n");
        Field14 = Class251.Field1().Field2("autone5") != null ? Class251.Field1().Field2("autone5") : "";
        Field6 = splitString(Field14, "/n");
    }

    public static String[] splitString(String str, String str2) {
        Vector<String> vector = new Vector<>();
        if (!str.endsWith(str2)) {
            str = str + str2;
        }
        int i = 0;
        int indexOf = str.indexOf(str2);
        while (true) {
            int i2 = indexOf;
            if (i2 == -1) {
                String[] strArr = new String[vector.size()];
                vector.copyInto(strArr);
                return strArr;
            }
            vector.addElement(str.substring(i, i2));
            i = i2 + str2.length();
            indexOf = str.indexOf(str2, i);
        }
    }

    @Override
    public void resize(int width, int height) {
        viewport.update(width, height, true);
    }

    @Override
    public void show() {
        isVisible = true;
        MainTab.instance.screenChild = this;
        Gdx.input.setInputProcessor(stage);
    }

    @Override
    public void hide() {
        isVisible = false;
        MainTab.instance.screenChild = null;
        Gdx.input.setInputProcessor(Main.instance.inputMultiplexer);
    }

    @Override
    public void render() {
        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public boolean isVisible() {
        return isVisible;
    }
}
