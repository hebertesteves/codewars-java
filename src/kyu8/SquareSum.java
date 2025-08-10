package kyu8;

public class SquareSum {
    public static int squareSum(int[] n) {
        int square = 0;
        for (int num : n) {
            square += num * num;
        }

        return square;
    }

    public static void main(String[] args) {
        System.out.println(squareSum(new int[] {1,2,2}));
        System.out.println(squareSum(new int[] {1,2}));
        System.out.println(squareSum(new int[] {5,3,-4}));
        System.out.println(squareSum(new int[] {}));
    }
}
