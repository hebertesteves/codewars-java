package kyu8;

import java.util.Arrays;

public class DoubleValuesMap {
    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(n -> n * 2).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(map(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(map(new int[] {4, 1, 1, 1, 4})));
        System.out.println(Arrays.toString(map(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(map(new int[] {1, 1, 1, 1, 1, 1})));
    }
}
