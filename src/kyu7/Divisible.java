package kyu7;

public class Divisible {
    public static boolean isDivisible(int... divisors) {
        for (int i = 1; i < divisors.length; i++) {
            if (divisors[0] % divisors[i] != 0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isDivisible(3, 3, 4));
        System.out.println(isDivisible(3, 3, 4, 2, 5));
    }
}
