package kyu7;

import java.util.Arrays;

public class SumTwoSmallestNumbers {
    public static long sumTwoSmallestNumbers(long[] numbers) {
        Arrays.sort(numbers);
        return numbers[0] + numbers[1];
    }

    public static void main(String[] args) {
        System.out.println(sumTwoSmallestNumbers(new long []{ 5,  8, 12, 19, 22}));
    }
}
