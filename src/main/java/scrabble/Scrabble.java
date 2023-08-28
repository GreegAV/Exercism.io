package scrabble;

import java.util.HashMap;
import java.util.Map;

class Scrabble {
    private Map<Character, Integer> values = new HashMap<>();
    private String toCount;

    Scrabble(String word) {
        toCount = word.toLowerCase();
        values.put('a', 1);
        values.put('e', 1);
        values.put('i', 1);
        values.put('o', 1);
        values.put('u', 1);
        values.put('l', 1);
        values.put('n', 1);
        values.put('r', 1);
        values.put('s', 1);
        values.put('t', 1);
        values.put('d', 2);
        values.put('g', 2);
        values.put('b', 3);
        values.put('c', 3);
        values.put('m', 3);
        values.put('p', 3);
        values.put('f', 4);
        values.put('h', 4);
        values.put('v', 4);
        values.put('w', 4);
        values.put('y', 4);
        values.put('k', 5);
        values.put('j', 8);
        values.put('x', 8);
        values.put('q', 10);
        values.put('z', 10);
    }

    int getScore() {
        int result=0;
        for (int i = 0; i <toCount.length() ; i++) {
            result+=values.get(toCount.charAt(i));
        }
        return result;
    }
}
