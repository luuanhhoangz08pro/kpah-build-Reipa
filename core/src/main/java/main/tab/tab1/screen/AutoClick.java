package main.tab.tab1.screen;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.scenes.scene2d.InputEvent;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.ui.*;
import com.badlogic.gdx.scenes.scene2d.utils.ClickListener;
import com.badlogic.gdx.utils.Align;
import com.badlogic.gdx.utils.viewport.ScreenViewport;
import com.badlogic.gdx.utils.viewport.Viewport;
import com.ray3k.stripe.FreeTypeSkin;
import main.lib.MapKey;
import main.screen.Main;
import main.tab.tab1.Class105;
import main.screen.ScreenChild;
import main.screen.SkillKeys;

public class AutoClick implements ScreenChild {
    public static AutoClick instance;
    private final Stage stage;
    private final Viewport viewport;
    private final Skin skin;
    public boolean isVisible = false;

    // UI Components
    private TextField tfKeyDuration;
    private TextField tfDelay;
    private SelectBox<String> notificationToggle;
    private Dialog keySelectDialog;
    private TextField tfSetKeyCode;
    private TextField tfSetKeyTime;

    // Auto clicker state
    public boolean autoClickEnabled = false;
    private final Object lock = new Object();
    private SkillKeys.Player player;
    private String parsed;
    private final FileHandle rmsDir;

    public AutoClick() {
        instance = this;
        viewport = new ScreenViewport();
        stage = new Stage(viewport);
        viewport.apply();

        rmsDir = Gdx.files.local("rms");
        if (!rmsDir.exists()) {
            rmsDir.mkdirs();
        }

        skin = new FreeTypeSkin(Gdx.files.internal("skin/skin.json"));
        createUI();
        loadSettings();
        Gdx.input.setInputProcessor(stage);
    }

    private void createUI() {
        Table mainTable = new Table();
        mainTable.setFillParent(true);
        mainTable.pad(10);
        stage.addActor(mainTable);

        Label titleLabel = new Label("Auto Click Settings", skin, "title");
        mainTable.add(titleLabel).colspan(2).pad(10).row();

        // Key mapping field
        Label keyMappingLabel = new Label("Mã phím:Thời gian (Nhiều mã cách nhau bằng dấu \",\"):", skin);
        mainTable.add(keyMappingLabel).colspan(2).align(Align.left).pad(5).row();

        tfKeyDuration = new TextField(SkillKeys.DEFAULT, skin);
        mainTable.add(tfKeyDuration).colspan(2).fillX().pad(5).row();

        // Select key button
        TextButton selectKeyButton = new TextButton("Mã phím", skin);
        selectKeyButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                showKeySelectDialog();
            }
        });
        mainTable.add(selectKeyButton).align(Align.left).pad(5).row();

        // Delay field
        Label delayLabel = new Label("Quãng nghỉ (mili giây):", skin);
        mainTable.add(delayLabel).colspan(2).align(Align.left).pad(5).row();

        tfDelay = new TextField("200", skin);
        tfDelay.setTextFieldFilter(new TextField.TextFieldFilter.DigitsOnlyFilter());
        mainTable.add(tfDelay).colspan(2).fillX().pad(5).row();

        // Notification toggle
        Label notificationLabel = new Label("Thông báo bật/tắt auto:", skin);
        mainTable.add(notificationLabel).colspan(2).align(Align.left).pad(5).row();

        notificationToggle = new SelectBox<>(skin);
        notificationToggle.setItems("Không", "Có");
        mainTable.add(notificationToggle).colspan(2).fillX().pad(5).row();

        // Note about delay
        Label noteLabel = new Label("Nên để quãng nghỉ từ 200 trở lên", skin);
        noteLabel.setWrap(true);
        mainTable.add(noteLabel).colspan(2).fillX().pad(10).row();

        // Save and Cancel buttons
        Table buttonTable = new Table();
        mainTable.add(buttonTable).colspan(2).fillX().pad(10);

        TextButton saveButton = new TextButton("Lưu", skin);
        saveButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                saveSettings();
                showMessage("Lưu thành công!");
            }
        });
        buttonTable.add(saveButton).pad(5);

        TextButton cancelButton = new TextButton("Thoát", skin);
        cancelButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                hide();
            }
        });
        buttonTable.add(cancelButton).pad(5);

        // Create the key selection dialog
        createKeySelectDialog();
    }

    private void createKeySelectDialog() {
        keySelectDialog = new Dialog("Đặt phím", skin) {
            @Override
            public void result(Object object) {
                if ((Boolean) object) {
                    String keyCode = tfSetKeyCode.getText();
                    String keyTime = tfSetKeyTime.getText();
                    String newEntry = keyCode + ":" + keyTime;
                    if (tfKeyDuration.getText().isEmpty()) {
                        tfKeyDuration.setText(newEntry);
                    } else {
                        tfKeyDuration.setText(tfKeyDuration.getText() + "," + newEntry);
                    }
                }
            }
        };

        Table dialogTable = new Table();
        dialogTable.pad(10);
        Label keyCodeLabel = new Label("Mã phím:", skin);
        dialogTable.add(keyCodeLabel).align(Align.left).pad(5).row();

        tfSetKeyCode = new TextField("", skin);
        tfSetKeyCode.setTextFieldFilter(new TextField.TextFieldFilter() {
            public boolean acceptChar(TextField textField, char c) {
                if (c == '-' && textField.getText().isEmpty()) {
                    return true;
                }
                return c >= '0' && c <= '9';
            }
        });
        dialogTable.add(tfSetKeyCode).fillX().pad(5).row();
        TextButton detectKeyButton = new TextButton("Mã phím", skin);
        detectKeyButton.addListener(new ClickListener() {
            @Override
            public void clicked(InputEvent event, float x, float y) {
                showKeyDetectionDialog(tfSetKeyCode);
            }
        });
        dialogTable.add(detectKeyButton).fillX().pad(5).row();
        Label keyTimeLabel = new Label("Ấn phím này sau (giây):", skin);
        dialogTable.add(keyTimeLabel).align(Align.left).pad(5).row();

        tfSetKeyTime = new TextField("0", skin);
        tfSetKeyTime.setTextFieldFilter(new TextField.TextFieldFilter.DigitsOnlyFilter());
        dialogTable.add(tfSetKeyTime).fillX().pad(5).row();
        Label noteLabel = new Label("Bằng 0 sẽ ấn ngay khi tới lượt phím này", skin);
        noteLabel.setWrap(true);
        dialogTable.add(noteLabel).fillX().pad(10).row();

        keySelectDialog.getContentTable().add(dialogTable);
        keySelectDialog.button("OK", true);
        keySelectDialog.button("Cancel", false);
    }

    private void showKeySelectDialog() {
        tfSetKeyCode.setText("");
        tfSetKeyTime.setText("0");
        keySelectDialog.show(stage);
    }

    private void showKeyDetectionDialog(final TextField targetField) {
        final Dialog keyDetectDialog = new Dialog("Ấn phím bất kì", skin) {
            private boolean keyDetected = false;

            @Override
            public void act(float delta) {
                super.act(delta);
                for (int i = 0; i < 256; i++) {
                    if (Gdx.input.isKeyJustPressed(i) && !keyDetected) {
                        int code = MapKey.map(i);
                        if (code == 0) {
                            continue;
                        }
                        targetField.setText(String.valueOf(code));
                        keyDetected = true;
                        hide();
                        break;
                    }
                }
            }
        };

        Label instructionLabel = new Label("Ấn phím bất kì...", skin);
        keyDetectDialog.getContentTable().add(instructionLabel).pad(20);
        keyDetectDialog.show(stage);
    }

    private void showMessage(String message) {
        Dialog dialog = new Dialog("", skin);
        dialog.text(message);
        dialog.button("OK");
        dialog.show(stage);
    }

    private void loadSettings() {
        try {
            FileHandle recordStore = rmsDir.child("AutoClick");
            if (!recordStore.exists() || !recordStore.isDirectory()) {
                return;
            }
            FileHandle record1 = recordStore.child("1");
            if (record1.exists()) {
                String saved = record1.readString("UTF-8");
                if (saved != null && !saved.isEmpty()) {
                    tfKeyDuration.setText(saved);
                }
            }
            FileHandle record2 = recordStore.child("2");
            if (record2.exists()) {
                tfDelay.setText(record2.readString("UTF-8"));
            } else {
                tfDelay.setText("200");
            }
            FileHandle record4 = recordStore.child("4");
            if (record4.exists()) {
                try {
                    notificationToggle.setSelectedIndex(Integer.parseInt(record4.readString("UTF-8")));
                } catch (NumberFormatException e) {
                    notificationToggle.setSelectedIndex(0);
                }
            }
        } catch (Exception e) {
            Gdx.app.error("AutoClick", "Error loading settings", e);
        }
    }

    private void saveSettings() {
        try {
            FileHandle recordStore = rmsDir.child("AutoClick");
            if (!recordStore.exists()) {
                recordStore.mkdirs();
            }
            FileHandle record1 = recordStore.child("1");
            record1.writeString(tfKeyDuration.getText(), false, "UTF-8");
            FileHandle record2 = recordStore.child("2");
            record2.writeString(tfDelay.getText(), false, "UTF-8");
            FileHandle record4 = recordStore.child("4");
            record4.writeString(String.valueOf(notificationToggle.getSelectedIndex()), false, "UTF-8");
        } catch (Exception e) {
            Gdx.app.error("AutoClick", "Error saving settings", e);
            showMessage("Error saving settings: " + e.getMessage());
        }
    }

    public void toggleAutoClick() {
        synchronized (lock) {
            autoClickEnabled = !autoClickEnabled;
            player = null;
            parsed = null;
        }
    }

    public static void tick() {
        AutoClick auto = instance;
        if (auto == null) {
            return;
        }
        auto.step(System.currentTimeMillis());
    }

    private void step(long now) {
        try {
            stepLocked(now);
        } catch (Exception ignored) {
        }
    }

    private void stepLocked(long now) {
        synchronized (lock) {
            if (!autoClickEnabled || isVisible) {
                return;
            }
            String text = tfKeyDuration.getText();
            if (text == null) {
                text = "";
            }
            if (player == null || !text.equals(parsed)) {
                player = new SkillKeys.Player(SkillKeys.parse(text));
                parsed = text;
            }
            int gap = 200;
            try {
                gap = Integer.parseInt(tfDelay.getText().trim());
            } catch (Exception ignored) {
                gap = 200;
            }
            int[] slots = player.due(now, gap);
            for (int i = 0; i < slots.length; i++) {
                int slot = slots[i];
                if (slot >= 0 && slot < Class105.Field3.length) {
                    Class105.Field3[slot] = true;
                }
            }
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
        Gdx.gl.glClearColor(1, 1, 1, 1);
        Gdx.gl.glClear(com.badlogic.gdx.graphics.GL20.GL_COLOR_BUFFER_BIT);

        stage.act(Gdx.graphics.getDeltaTime());
        stage.draw();
    }

    @Override
    public boolean isVisible() {
        return isVisible;
    }
}
