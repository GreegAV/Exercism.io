package reverse;

class ReverseString {

    String reverse(String inputString) {
//        throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return new StringBuilder(inputString).reverse().toString();
    }

}
