package kyu7;

import java.util.Arrays;

public class ReturnTheFirstMMultiplesOfN {
    public static int[] multiples(int m, int n) {
        int[] result = new int[m];

        for (int i = 0; i < result.length; i++) {
            result[i] = n * (i + 1);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(multiples(3, 5)));
    }
}
