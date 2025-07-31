package kyu7;

public class AlternateSquareSum {
    public static int alternateSqSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 != 0) sum += arr[i] * arr[i];
            else sum += arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(alternateSqSum(new int[] {11, 12, 13, 14, 15}));
    }
}
