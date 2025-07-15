package kyu8;

public class SumOfMultiples {
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }

        long sum = 0;
        for (int i = n; i < m; i += n) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumMul(2, 9));
        System.out.println(sumMul(5, 20));
        System.out.println(sumMul(4,123));
        System.out.println(sumMul(123,4567));
    }
}
