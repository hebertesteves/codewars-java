package kyu8;

public class SumOfPositive {
    public static int sum(int[] arr){
        int soma = 0;
        if (arr.length == 0) {
            return soma;
        } else {
            for (int n : arr) {
                if (n > 0) {
                    soma += n;
                }
            }

            return soma;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(new int[]{1,2,3,4,5}));
        System.out.println(sum(new int[]{1,-2,3,4,5}));
        System.out.println(sum(new int[]{}));
    }
}

