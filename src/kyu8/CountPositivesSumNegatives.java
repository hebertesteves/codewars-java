package kyu8;

import java.util.Arrays;

public class CountPositivesSumNegatives {
    public static int[] countPositivesSumNegatives(int[] input) {
        if (input == null || input.length == 0) {
            return new int[0];
        } else {
            int quantidadePositivo = 0;
            int somaNumerosNegativo = 0;

            for (int n : input) {
                if (n > 0) quantidadePositivo++;
                if (n < 0) somaNumerosNegativo += n;
            }

            return new int[]{quantidadePositivo, somaNumerosNegativo};
        }
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15})));
        System.out.println(Arrays.toString(countPositivesSumNegatives(new int[]{})));

    }
}
