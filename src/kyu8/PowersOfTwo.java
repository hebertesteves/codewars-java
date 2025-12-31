package kyu8;

import java.util.Arrays;

public class PowersOfTwo {
    public static long[] powersOfTwo(int n){
        long[] array = new long[n + 1];

        for (int i = 0; i < array.length; i++) {
            array[i] = (long) Math.pow(2, i);
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(powersOfTwo(0)));
    }
}
