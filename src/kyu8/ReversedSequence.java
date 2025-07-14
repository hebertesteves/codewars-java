package kyu8;

import java.util.Arrays;

public class ReversedSequence {
    public static int[] reverse(int n){
        int[] result = new int[n];
        for (int i = 0; i < result.length; i++) {
            result[i] = n;
            n--;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(5)));
    }
}
