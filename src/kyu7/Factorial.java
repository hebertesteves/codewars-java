package kyu7;

public class Factorial {
    public static long factorial(int n) {
        long fac = 1;
        for (int i = n; i > 0; i--) {
            fac *= i;
        }
        return fac;
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));
        System.out.println(factorial(7));
    }
}
