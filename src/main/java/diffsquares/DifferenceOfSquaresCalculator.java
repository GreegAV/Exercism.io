package diffsquares;

class DifferenceOfSquaresCalculator {

    int computeSquareOfSumTo(int input) {
        int summ=0;
        for (int i = 0; i <input+1 ; i++) {
            summ+=i;
        }
        return summ*summ;
    }

    int computeSumOfSquaresTo(int input) {
        int summ=0;
        for (int i = 0; i <input+1 ; i++) {
            summ+=i*i;
        }
        return summ;
    }

    int computeDifferenceOfSquares(int input) {
        return computeSquareOfSumTo(input)-computeSumOfSquaresTo(input);
    }

}
