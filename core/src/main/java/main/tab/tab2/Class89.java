package main.tab.tab2;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;

import java.nio.charset.StandardCharsets;

public class Class89 implements Class256 {

    int Field3;
    int Field4 = 0;
    int Field5 = 1;

    public void Field1() {

        Gdx.app.postRunnable(() -> {
            String str = "";
            if (Field3 == Field4) {
                byte[] chatData = Class92.Field1("chat1", 1);
                str = chatData == null ? "" : new String(chatData, StandardCharsets.UTF_8);
            } else if (Field3 == Field5) {
                byte[] pmData = Class92.Field1("pmtext", 1);
                str = pmData == null ? "" : new String(pmData, StandardCharsets.UTF_8);
            }

            if (Gdx.app.getType() != Application.ApplicationType.Desktop) {
                Gdx.input.getTextInput(new Input.TextInputListener() {
                    @Override
                    public void input(String textInput) {
                        if (!textInput.isEmpty()) {
                            if (Field3 == Field4) {
                                Class92.Field1("chat1", 1, textInput.getBytes(StandardCharsets.UTF_8));
                                (new Class91()).Field1();
                            } else if (Field3 == Field5) {
                                Class92.Field1("pmtext", 1, textInput.getBytes(StandardCharsets.UTF_8));
                                (new Class91()).Field1();
                            }
                        }
                    }

                    @Override
                    public void canceled() {
                    }
                }, "Chat", str, Field3 == Field4 ? "Nhiều đoạn cách nhau bằng dấu xuống dòng" : "Auto pm");
            }
        });
    }

    public Class89(int var1) {
        this.Field3 = var1;
    }
}
