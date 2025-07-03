package kyu8;

public class MakeNegative {
    public static int makeNegative(final int x) {
        if (x > 0) {
            return x * -1;
        } else {
            return x;
        }
    }

    public static void main(String[] args) {
        System.out.println(makeNegative(10));
        System.out.println(makeNegative(-10));
        System.out.println(makeNegative(0));
    }
}
