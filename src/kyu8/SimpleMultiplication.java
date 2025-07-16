package kyu8;

public class SimpleMultiplication {
    public static int simpleMultiplication(int n) {
        return (n % 2 == 0) ? n * 8 : n * 9;
    }

    public static void main(String[] args) {
        System.out.println(simpleMultiplication(1));
        System.out.println(simpleMultiplication(3));
        System.out.println(simpleMultiplication(21));
        System.out.println(simpleMultiplication(23));
    }
}
