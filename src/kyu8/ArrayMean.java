package kyu8;

import java.util.Arrays;

public class ArrayMean {
    public static int findAverage(int[] nums) {
        return Arrays.stream(nums).sum() / nums.length;
    }
}
