package kyu8;

import java.util.Arrays;

public class ReversedDigitsArray {
    public static int[] digitize(long n) {
        return Arrays.stream(new StringBuilder(String.valueOf(n)).reverse().toString().split("")).mapToInt(Integer::parseInt).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(digitize(35231)));
        System.out.println(Arrays.toString(digitize(0)));
    }
}
