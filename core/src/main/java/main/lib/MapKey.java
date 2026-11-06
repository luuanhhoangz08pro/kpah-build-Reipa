package main.lib;

import com.badlogic.gdx.Input;

import java.util.Hashtable;

public class MapKey {
    private static final Hashtable<String, Integer> h = new Hashtable<>();

    public static void load() {
        h.put("A", 97);
        h.put("B", 98);
        h.put("C", 99);
        h.put("D", 100);
        h.put("E", 101);
        h.put("F", 102);
        h.put("G", 103);
        h.put("H", 104);
        h.put("I", 105);
        h.put("J", 106);
        h.put("K", 107);
        h.put("L", 108);
        h.put("M", 109);
        h.put("N", 110);
        h.put("O", 111);
        h.put("P", 112);
        h.put("Q", 113);
        h.put("R", 114);
        h.put("S", 115);
        h.put("T", 116);
        h.put("U", 117);
        h.put("V", 118);
        h.put("W", 119);
        h.put("X", 120);
        h.put("Y", 121);
        h.put("Z", 122);
        h.put("0", 48);
        h.put("1", 49);
        h.put("2", 50);
        h.put("3", 51);
        h.put("4", 52);
        h.put("5", 53);
        h.put("6", 54);
        h.put("7", 55);
        h.put("8", 56);
        h.put("9", 57);
        h.put("_", 45);
        h.put(".", 46);
        h.put("SPACE", 32);
        h.put("F1", -21);
        h.put("F2", -22);
        h.put("EQUALS", -25);
        h.put("MINUS", 45);
        h.put("F3", -23);

        h.put("UP", 1);
        h.put("DOWN", 6);
        h.put("LEFT", 2);
        h.put("RIGHT", 5);

        h.put("BACKSPACE", -8);
        h.put("PERIOD", 46);
        h.put("AT", 64);
        h.put("TAB", -26);
        h.put("DELETE", -8);
        h.put("ENTER", -5);
    }

    public static int map(int kyeCode) {
        try {
            String k = Input.Keys.toString(kyeCode).toUpperCase();
            return h.get(k);
        } catch (Exception e) {
            return 0;
        }
    }
}
