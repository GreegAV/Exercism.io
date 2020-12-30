package say;

import java.text.DecimalFormat;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Say {

    private static final long MAX_NUMBER = 999_999_999_999L;

    private static final NavigableMap<Long, String> NUMBERS = new TreeMap<>(Map.ofEntries(
            Map.entry(0L, "zero"),
            Map.entry(1L, "one"),
            Map.entry(2L, "two"),
            Map.entry(3L, "three"),
            Map.entry(4L, "four"),
            Map.entry(5L, "five"),
            Map.entry(6L, "six"),
            Map.entry(7L, "seven"),
            Map.entry(8L, "eight"),
            Map.entry(9L, "nine"),
            Map.entry(10L, "ten"),
            Map.entry(11L, "eleven"),
            Map.entry(12L, "twelve"),
            Map.entry(13L, "thirteen"),
            Map.entry(14L, "fourteen"),
            Map.entry(15L, "fifteen"),
            Map.entry(16L, "sixteen"),
            Map.entry(17L, "seventeen"),
            Map.entry(18L, "eighteen"),
            Map.entry(19L, "nineteen"),
            Map.entry(20L, "twenty"),
            Map.entry(30L, "thirty"),
            Map.entry(40L, "forty"),
            Map.entry(50L, "fifty"),
            Map.entry(60L, "sixty"),
            Map.entry(70L, "seventy"),
            Map.entry(80L, "eighty"),
            Map.entry(90L, "ninety"),
            Map.entry(100L, "hundred"),
            Map.entry(1000L, "thousand"),
            Map.entry(1000_000L, "million"),
            Map.entry(1000_000_000L, "billion"))
    );

    public String say(final long number) {

        if (number < 0 || number > MAX_NUMBER) {
            throw new IllegalArgumentException();
        }

        if (number < 20) {
            return NUMBERS.get(number);
        } else {
            return (number < 100 ? "" : this.say(number / NUMBERS.floorKey(number)) + " ")
                    + NUMBERS.getOrDefault(number, NUMBERS.floorEntry(number).getValue()
                    + (number < 100 ? "-" : " ")
                    + this.say(number % NUMBERS.floorKey(number)));
        }
    }

}

class Say2 {

    private final String[] tensNames = {
            "",
            " ten",
            " twenty",
            " thirty",
            " forty",
            " fifty",
            " sixty",
            " seventy",
            " eighty",
            " ninety"
    };

    private final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen",
            " fifteen",
            " sixteen",
            " seventeen",
            " eighteen",
            " nineteen"
    };

    private String convertLessThanOneThousand(int number) {
        String soFar = "";

        if (number % 100 < 20) {
            soFar = numNames[number % 100];
            number /= 100;
        } else {
            soFar = soFar + " -" + numNames[number % 10];
            number /= 10;

            soFar = tensNames[number % 10] + soFar;
            number /= 10;
        }
        if (number == 0) return soFar;
        return numNames[number] + " hundred" + soFar;
    }

    public String say(long number) {
        if (number < 0 || String.valueOf(number).length() > 12) throw new IllegalArgumentException();
        // 0 to 999 999 999 999
        if (number == 0) {
            return "zero";
        }

        String snumber;

        // pad with "0"
        String mask = "000000000000";
        DecimalFormat df = new DecimalFormat(mask);
        snumber = df.format(number);

        // XXXnnnnnnnnn
        int billions = Integer.parseInt(snumber.substring(0, 3));
        // nnnXXXnnnnnn
        int millions = Integer.parseInt(snumber.substring(3, 6));
        // nnnnnnXXXnnn
        int hundredThousands = Integer.parseInt(snumber.substring(6, 9));
        // nnnnnnnnnXXX
        int thousands = Integer.parseInt(snumber.substring(9, 12));

        String tradBillions;
        switch (billions) {
            case 0:
                tradBillions = "";
                break;
            case 1:
                tradBillions = convertLessThanOneThousand(billions)
                        + " billion ";
                break;
            default:
                tradBillions = convertLessThanOneThousand(billions)
                        + " billion ";
        }
        String result = tradBillions;

        String tradMillions;
        switch (millions) {
            case 0:
                tradMillions = "";
                break;
            case 1:
                tradMillions = convertLessThanOneThousand(millions)
                        + " million ";
                break;
            default:
                tradMillions = convertLessThanOneThousand(millions)
                        + " million ";
        }
        result = result + tradMillions;

        String tradHundredThousands;
        switch (hundredThousands) {
            case 0:
                tradHundredThousands = "";
                break;
            case 1:
                tradHundredThousands = "one thousand ";
                break;
            default:
                tradHundredThousands = convertLessThanOneThousand(hundredThousands)
                        + " thousand ";
        }
        result = result + tradHundredThousands;

        String tradThousand;
        tradThousand = convertLessThanOneThousand(thousands);
        result = result + tradThousand;

        // remove extra spaces!
        result = result.replaceAll("^\\s+", "").replaceAll("\\b\\s{2,}\\b", " ").replaceAll("\\s-\b", "").replaceAll("\\s+-\\s+", "-").strip();
        if (result.endsWith(" -"))
            result = result.substring(0, result.length() - 2);
        return result;
    }
}