package kyu8;

public class CalculateAverage {
    public static double findAverage(int[] array) {
        double sum = 0;
        if (array.length == 0) return sum;
        for (int n : array) sum += n;

        return sum / array.length;
    }

    public static void main(String[] args) {
        System.out.println(findAverage(new int[]{100, 50, 25, 75, 0}));
        System.out.println(findAverage(new int[]{5, 5, 5, 5}));
        System.out.println(findAverage(new int[]{1, 2, 3}));
        System.out.println(findAverage(new int[]{6, 4, 5, 2, 7}));
    }
}
