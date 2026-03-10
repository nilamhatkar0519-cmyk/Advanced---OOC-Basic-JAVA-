class OddNumberException extends Exception {
    public OddNumberException(String message) { super(message); }
}

public class OddCheckDemo {
    public static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException(num + " is an odd number!");
        }
        System.out.println(num + " is even.");
    }

    public static void main(String[] args) {
        int testInput = 7;
        try {
            checkNumber(testInput);
        } catch (OddNumberException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
