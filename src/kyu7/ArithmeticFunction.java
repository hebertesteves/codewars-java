package kyu7;

public class ArithmeticFunction {
    public static int arithmetic(int a, int b, String operator) {
        if (operator.equalsIgnoreCase("add")) {
            return a + b;
        } else if (operator.equalsIgnoreCase("subtract")) {
            return a - b;
        } else if (operator.equalsIgnoreCase("multiply")) {
            return a * b;
        } else {
            return a / b;
        }
    }
}
