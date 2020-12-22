package pangram;

import java.util.HashSet;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(String input) {
        /*
        return input.toLowerCase().replaceAll("[^a-z]", "").chars().distinct().count() == 26;
         */

        if (input.length()<26)
            return false;
        Set<Character> abc = new HashSet<>();
        for (int i = 0; i < input.length(); i++) {
            if ((""+input.charAt(i)).matches("[a-z]"))
                abc.add(input.charAt(i));
        }
        return abc.size() == 26;
    }
}
