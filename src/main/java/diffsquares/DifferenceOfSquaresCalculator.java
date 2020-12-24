package diffsquares;

class DifferenceOfSquaresCalculator {

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input) - computeSumOfSquaresTo(input);
    }

    int computeSumOfSquaresTo(int input) {
        return (int) (2 * Math.pow(input, 3) + 3 * Math.pow(input, 2) + input) / 6;
    }

    int computeSquareOfSumTo(int input) {
        return (int) Math.pow(input * (input + 1) / 2, 2);
    }


    int computeSquareOfSumTo_Old(int input) {
        int summ = 0;
        for (int i = 0; i < input + 1; i++) {
            summ += i;
        }
        return summ * summ;
    }

    int computeSumOfSquaresTo_Old(int input) {
        int summ = 0;
        for (int i = 0; i < input + 1; i++) {
            summ += i * i;
        }
        return summ;
    }
}
