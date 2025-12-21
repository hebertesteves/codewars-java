package kyu7;

public class SumOfMinimums {
    public static int sumOfMinimums(int[][] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int menor = arr[i][0];
            for (int j = 0; j < arr[i].length; j++){
                if (arr[i][j] < menor) menor = arr[i][j];
            }
            sum += menor;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfMinimums(new int[][]{{7, 9, 8, 6, 2}, {6, 3, 5, 4, 3}, {5, 8, 7, 4, 5}}));
    }
}
