package kyu8;

import java.util.Arrays;

public class CountByX {
    public static int[] countBy(int x, int n){
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = x * (i + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBy(1,10)));
        System.out.println(Arrays.toString(countBy(2,5)));
        System.out.println(Arrays.toString(countBy(3,7)));
        System.out.println(Arrays.toString(countBy(50,5)));
        System.out.println(Arrays.toString(countBy(100,6)));
    }
}
