package darts;

public class Darts {
    double radius;

    Darts(double x, double y) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        this.radius = Math.sqrt(x * x + y * y);
    }

    int score() {
        if (radius <= 1)
            return 10;
        else if (radius<=5)
            return 5;
        else if (radius<=10)
            return 1;
        else
            return 0;

    }

}
