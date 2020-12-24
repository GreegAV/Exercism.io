package raindrop;

import java.util.ArrayList;
import java.util.List;

public class RaindropConverter {

    String convert(int number) {
        StringBuilder rain = new StringBuilder();
        List<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; ++i) {
            if (number % i == 0) {
                factors.add(i);
                if (i == 3)
                    rain.append("Pling");
                if (i == 5)
                    rain.append("Plang");
                if (i == 7)
                    rain.append("Plong");
            }
        }
        if (rain.toString().length() < 1)
            rain.append(number);
        return rain.toString();
    }
}
