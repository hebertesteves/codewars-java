package kyu8;

public class SumArrays {
    public static double sum(double[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return 0;
        } else {
            double soma = 0.0;
            for (double n : numbers) {
                soma += n;
            }

            return soma;
        }
    }

    public static void main(String[] args) {
        System.out.println(sum(new double[] { }));
        System.out.println(sum(new double[] {-2.398}));
        System.out.println(sum(new double[] {1, 2, 3}));
        System.out.println(sum(new double[] {1.1, 2.2, 3.3}));
        System.out.println(sum(new double[] {1, 5.2, 4, 0, -1}));
        System.out.println(sum(new double[] {30, 89, 100, 101}));
    }
}
