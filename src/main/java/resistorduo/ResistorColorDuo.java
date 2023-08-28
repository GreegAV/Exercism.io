package resistorduo;

import java.util.Arrays;

class ResistorColorDuo {
    int value(String[] colors) {
        return Integer.parseInt("" + Arrays.asList(source()).indexOf(colors[0]) + Arrays.asList(source()).indexOf(colors[1]));
    }

    String[] source() {
        return new String[]{"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
