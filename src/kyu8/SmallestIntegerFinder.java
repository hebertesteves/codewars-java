package kyu8;

import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    public static void main(String[] args) {
        System.out.println(findSmallestInt(new int[]{78,56,-2,12,-8}));
    }
}
