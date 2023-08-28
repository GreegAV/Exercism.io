package armstrong;

public class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        int numLength = String.valueOf(numberToCheck).length();
        if (numLength == 1) return true;
        int checkSum = 0;
        char[] numArray = String.valueOf(numberToCheck).toCharArray();
        for (int i = 0; i < numLength; i++) {
            checkSum += Math.pow(Character.getNumericValue(numArray[i]), numLength);
        }
        return checkSum == numberToCheck;
    }
}
