package kyu8;

import java.util.Arrays;

public class Between {
    public static int[] between(int a, int b) {
        int[] result = new int[b - a + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = a;
            a++;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(between(1, 4)));
        System.out.println(Arrays.toString(between(-2, 2)));
    }
}
