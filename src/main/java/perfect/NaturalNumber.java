package perfect;

class NaturalNumber {
    private int number;

    public NaturalNumber(int input) {
        if (input > 0)
            number = input;
        else
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
    }

    public Classification getClassification() {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0)
                sum += i;
        }
        if (sum == number)
            return Classification.PERFECT;
        else if (sum > number)
            return Classification.ABUNDANT;
        else
            return Classification.DEFICIENT;
    }
}
