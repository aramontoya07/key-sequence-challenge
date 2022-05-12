package com.test;

import java.util.HashMap;
import java.util.Map;

public class App {

    public static String press(String word) {
        Map<Integer, String> keys = new HashMap<>();
        String result = "";
        keys.put(0, " ");
        keys.put(2, "abc");
        keys.put(3, "def");
        keys.put(4, "ghi");
        keys.put(5, "jkl");
        keys.put(6, "mno");
        keys.put(7, "pqrs");
        keys.put(8, "tuv");
        keys.put(9, "wxyz");

        Character previous = 0;

        for (int i = 0; i < word.length(); i++) {
            Character single_char = word.charAt(i);
            for (Map.Entry<Integer, String> entry : keys.entrySet()) {
                if (entry.getValue().contains(single_char.toString())) {
                    if (entry.getValue().contains(previous.toString())) {
                        result = result + ' ';
                    }
                    int index = entry.getValue().indexOf(single_char);
                    for (int k = 0; k < index + 1; k++) {
                        result = result + entry.getKey().toString();
                    }
                    previous = single_char;
                    break;
                }
            }
        }
        return result;
    }
}
