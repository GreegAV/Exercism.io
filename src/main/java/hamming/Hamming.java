package hamming;

public class Hamming {
    private String leftStrand;
    private String rightStrand;
    private int hammingDistance;

    public Hamming(String leftInput, String rightInput) {
        if (leftInput.length() < 1 && rightInput.length() > 0)
            throw new IllegalArgumentException("leftstrand must not be empty.");
        if (rightInput.length() < 1 && leftInput.length() > 0)
            throw new IllegalArgumentException("rightStrand must not be empty.");
        if (leftInput.length() != rightInput.length())
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        leftStrand = leftInput;
        rightStrand = rightInput;
        hammingDistance = 0;
    }

    public int getHammingDistance() {
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i))
                hammingDistance++;
        }
        return hammingDistance;
    }
}
