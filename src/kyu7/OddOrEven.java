package kyu7;

import java.util.Arrays;

public class OddOrEven {
    public static String oddOrEven (int[] array) {
        return array.length == 0 ? "even" : Arrays.stream(array).sum() % 2 == 0 ? "even" : "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(new int[] {2, 5, 34, 6}));
        System.out.println(oddOrEven(new int[]{}));
        System.out.println(oddOrEven(new int[]{0, 1, 4}));
    }
}
