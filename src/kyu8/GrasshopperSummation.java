package kyu8;

public class GrasshopperSummation {
    public static int summation(int n) {
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }

        return soma;
    }

    public static void main(String[] args) {
        System.out.println(summation(2));
        System.out.println(summation(8));
    }
}
