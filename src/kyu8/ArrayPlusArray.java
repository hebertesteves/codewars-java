package kyu8;

import java.util.Arrays;

public class ArrayPlusArray {
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        return Arrays.stream(arr1).reduce(0, ( a, b) -> a + b) + Arrays.stream(arr2).reduce(0, ( a, b) -> a + b);
    }

    public static void main(String[] args) {
        System.out.println(arrayPlusArray(new int[]{1,2,3}, new int[]{4,5,6}));
    }
}
