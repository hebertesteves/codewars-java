package kyu8;

public class BetterThanAverage {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = 0;
        for (int n : classPoints) {
            sum += n;
        }

        double average = (double) sum / classPoints.length;
        return (yourPoints > average);
    }

    public static void main(String[] args) {
        System.out.println(betterThanAverage(new int[] {2, 3}, 5));
        System.out.println(betterThanAverage(new int[] {100, 40, 34, 57, 29, 72, 57, 88}, 75));
        System.out.println(betterThanAverage(new int[] {12, 23, 34, 45, 56, 67, 78, 89, 90}, 69));
        System.out.println(betterThanAverage(new int[] {100, 90}, 11));
        System.out.println(betterThanAverage(new int[] {50, 50, 50}, 50));
    }
}
