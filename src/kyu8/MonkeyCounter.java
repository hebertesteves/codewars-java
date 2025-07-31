package kyu8;

import java.util.Arrays;

public class MonkeyCounter {
    public static int[] monkeyCount(final int n){
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = i + 1;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(monkeyCount(5)));
        System.out.println(Arrays.toString(monkeyCount(3)));
        System.out.println(Arrays.toString(monkeyCount(9)));
        System.out.println(Arrays.toString(monkeyCount(10)));
        System.out.println(Arrays.toString(monkeyCount(20)));
    }
}
