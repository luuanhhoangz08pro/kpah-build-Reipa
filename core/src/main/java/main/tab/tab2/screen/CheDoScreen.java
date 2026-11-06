package main.tab.tab2.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ChangeListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.ray3k.stripe.FreeTypeSkin;
import main.screen.Main;
import main.screen.ScreenChild;
import main.tab.tab2.Class362;
import main.tab.tab2.Class834;
import main.tab.tab2.Class835;
import main.tab.tab2.Class94;

import java.util.ArrayList;
import java.util.List;

public class CheDoScreen implements ScreenChild {

    private final Stage stage;
    private final Viewport viewport;
    public boolean isVisible = false;

    public static String Field4;
    public static String[] Field5;
    public static int Field10;

    private final List<CheckBox> optionCheckBoxes;
    private final SelectBox<String> equipmentSelectBox;
    private final SelectBox<String> genderSelectBox;
    private final SelectBox<String> typeSelectBox;

    public CheDoScreen() {
        viewport = new ScreenViewport();
        stage = new Stage(viewport);
        viewport.apply();
        Skin skin = new FreeTypeSkin(Gdx.files.internal("skin/skin.json"));
        Window root = new Window(Class94.Field31, skin);
        root.setFillParent(true);
        stage.addActor(root);
        root.top();

        Table mainTable = new Table();
        mainTable.pad(5);
        root.add(mainTable).expand().fill();

        Table topTable = new Table();

        Table selectionTable = new Table();

        selectionTable.add(new Label("Trang bị:", skin)).left().padRight(5);
        equipmentSelectBox = new SelectBox<>(skin);
        String[] equipmentItems = new String[]{
            "Áo", "Quần", "Nón", "Giày", "Găng", "Nhẫn", "Dây chuyền", "Ngọc bội", "Vũ khí"
        };
        equipmentSelectBox.setItems(equipmentItems);
        selectionTable.add(equipmentSelectBox).width(100).padRight(10);
        selectionTable.row().padTop(5);

        selectionTable.add(new Label("Kiểu:", skin)).left().padRight(5);
        typeSelectBox = new SelectBox<>(skin);
        typeSelectBox.setItems("Ma pháp", "Vật lý");
        selectionTable.add(typeSelectBox).width(100).padRight(10);
        selectionTable.row().padTop(5);

        selectionTable.add(new Label("Giới tính:", skin)).left().padRight(5);
        genderSelectBox = new SelectBox<>(skin);
        genderSelectBox.setItems("Nam", "Nữ");
        selectionTable.add(genderSelectBox).width(100).padRight(10);

        topTable.add(selectionTable).left().padRight(20);

        topTable.add().expandX();

        Table buttonTable = new Table();
        TextButton confirmButton = new TextButton("Lưu", skin);
        TextButton exitButton = new TextButton("Thoát", skin);

        buttonTable.add(confirmButton).padRight(5).width(70);
        buttonTable.add(exitButton).width(70);

        topTable.add(buttonTable).right();

        mainTable.add(topTable).expandX().fillX().padBottom(5);
        mainTable.row();

        Image divider = new Image(skin.getDrawable("white"));
        divider.setHeight(1);
        divider.setColor(Color.LIGHT_GRAY);
        mainTable.add(divider).expandX().fillX().padBottom(2);
        mainTable.row();

        Label optionsLabel = new Label("Thuộc tính:", skin);
        mainTable.add(optionsLabel).left().padBottom(2);
        mainTable.row();

        Table optionsContainer = new Table();
        optionsContainer.top().left();
        optionCheckBoxes = new ArrayList<>();

        String[] optionItems = new String[]{
            "Tăng tấn công: 9%", "Giảm st ma: 9%", "Giảm st vật: 9%",
            "Xuyên giáp: 5%", "Phản st: 9%", "Tăng tấn công",
            "Giảm st ma", "Giảm st vật", "Xuyên giáp", "Phản st"
        };

        // Tạo layout 2 cột cho các checkbox
        int columns = 2;
        Table[] columnTables = new Table[columns];

        for (int i = 0; i < columns; i++) {
            columnTables[i] = new Table();
            columnTables[i].top().left();
        }

        for (int i = 0; i < optionItems.length; i++) {
            CheckBox checkBox = new CheckBox(" " + optionItems[i], skin);
            checkBox.align(Align.left);
            checkBox.getImageCell().padRight(5);
            optionCheckBoxes.add(checkBox);

            columnTables[i % columns].add(checkBox).left().padBottom(2);
            columnTables[i % columns].row();
        }

        for (int i = 0; i < columns; i++) {
            optionsContainer.add(columnTables[i]).padRight(i < columns - 1 ? 10 : 0).top().left();
        }

        ScrollPane optionsScrollPane = new ScrollPane(optionsContainer, skin);
        optionsScrollPane.setFadeScrollBars(false);
        optionsScrollPane.setScrollingDisabled(true, false);
        mainTable.add(optionsScrollPane).expand().fill().padTop(0).padLeft(5);

        confirmButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                commandAction();
            }
        });

        exitButton.addListener(new ChangeListener() {
            @Override
            public void changed(ChangeEvent event, Actor actor) {
                hide();
            }
        });

        if (Field10 >= 1 && Field10 <= optionCheckBoxes.size()) {
            optionCheckBoxes.get(Field10 - 1).setChecked(true);
        }
    }

    public void Field1() {
        int typeIndex = typeSelectBox.getSelectedIndex();
        int genderIndex = genderSelectBox.getSelectedIndex();
        int equipmentIndex = equipmentSelectBox.getSelectedIndex();

        Class835.Field4 = typeIndex;
        Class835.Field3 = genderIndex;
        Class835.Field5 = equipmentIndex;
    }

    public void commandAction() {
        Class834.Field1().Field1(Class94.Field17, Field4);
        Field5 = Field1(Field4, Class94.Field18);
        hide();
        Class362 var3 = new Class362();
        var3.Field1();
    }

    public String Field3() {
        StringBuilder result = new StringBuilder();
        List<CheckBox> checkBoxes = optionCheckBoxes;

        for (int i = 0; i < checkBoxes.size(); i++) {
            if (checkBoxes.get(i).isChecked()) {
                result.append(checkBoxes.get(i).getText().toString().trim().toLowerCase()).append(";");
            }
        }

        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }

        return result.toString();
    }

    public static String[] Field1(String var0, String var1) {
        List<String> var2 = new ArrayList<>();

        if (!var0.endsWith(var1)) {
            var0 = var0 + var1;
        }

        int var3 = 0;

        for (int var4 = var0.indexOf(var1); var4 != -1; var4 = var0.indexOf(var1, var3)) {
            var2.add(var0.substring(var3, var4));
            var3 = var4 + var1.length();
        }

        return var2.toArray(new String[0]);
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

    static {
        Field4 = Class834.Field1().Field2(Class94.Field17) != null ?
            Class834.Field1().Field2(Class94.Field17) : Class94.Field16;
        Field5 = Field1(Field4, Class94.Field18);
    }
}
