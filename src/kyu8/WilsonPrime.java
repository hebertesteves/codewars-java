package kyu8;

public class WilsonPrime {
    public static boolean amIWilson(long n) {
        long[] wilsonPrimes  = new long[]{5, 13, 563};
        for (long x : wilsonPrimes ) {
            if (x == n) return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(amIWilson(0));
        System.out.println(amIWilson(1));
        System.out.println(amIWilson(5));
    }
}
