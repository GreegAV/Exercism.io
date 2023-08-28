package grains;

import java.math.BigInteger;

class Grains {

    BigInteger grainsOnSquare(final int square) {
        BigInteger grains = new BigInteger("1");
        if (square > 1)
            for (int i = 0; i < square-1; i++) {
                grains = grains.multiply(new BigInteger("2"));
            }
        return grains;
    }

    BigInteger grainsOnBoard() {
        BigInteger grains = new BigInteger("1");
        BigInteger totalGrains=new BigInteger("0");
        for (int i = 0; i < 64; i++) {
            totalGrains=totalGrains.add(grains);
            grains = grains.multiply(new BigInteger("2"));
        }
        return totalGrains;
    }


}
