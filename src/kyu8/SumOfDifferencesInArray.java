package kyu8;

import java.util.Arrays;

public class SumOfDifferencesInArray {
    public static int sumOfDifferences(int[] arr) {
        if (arr == null || arr.length <= 1) return 0;
        
        Arrays.sort(arr);
        int sum = 0;

        for (int i = arr.length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDifferences(new int[]{1, 2, 10}));
    }
}
