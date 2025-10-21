package kyu7;

public class SumOfArraySingles {
    public static int repeats(int [] arr){
        int sum = 0;
        for (int n : arr) {
            int cont = 0;
            for (int x : arr) {
                if (x == n) cont++;
            }

            if (cont < 2) sum += n;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(repeats(new int []{4,5,7,5,4,8}));
    }
}
