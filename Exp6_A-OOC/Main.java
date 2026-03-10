package ExceptionHandlingDemo;

public class DivisionException extends Exception {
    public DivisionException(String message) { super(message); }
}

package ExceptionHandlingDemo;

public class Calculator {
    public int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

import ExceptionHandlingDemo.*;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        try {
            int result = calc.divide(10, 0);
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            // Handled in main to prevent crashing
            System.err.println("Exception Handled: " + e.getMessage());
        }
        System.out.println("Program continues...");
    }
}
