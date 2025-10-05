package kyu8;

public class Factorial {
    public static int factorial(int n) {
        if (n >= 0 && n <= 12) {
            if (n == 0) return 1;

            int result = n;
            for (int i = n - 1; i > 0; i--) {
                result *= i;
            }

            return result;
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(factorial(1));
    }
}
