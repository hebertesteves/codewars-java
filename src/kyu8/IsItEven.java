package kyu8;

public class IsItEven {
    public static boolean isEven(double n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(isEven(0));
        System.out.println(isEven(0.5));
        System.out.println(isEven(1));
    }
}
