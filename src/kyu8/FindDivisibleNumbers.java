package kyu8;

import java.util.Arrays;

public class FindDivisibleNumbers {
    public static int[] divisibleBy(int[] numbers, int divider) {
        return Arrays.stream(numbers).filter(num -> num % divider == 0).toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6},2)));
        System.out.println(Arrays.toString(divisibleBy(new int[] {1,2,3,4,5,6},3)));
        System.out.println(Arrays.toString(divisibleBy(new int[] {0,1,2,3,4,5,6},4)));
    }
}
