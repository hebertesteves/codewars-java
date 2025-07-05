package kyu8;

public class NumberToString {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }

    public static void main(String[] args) {
        System.out.println(numberToString(67));
        System.out.println(numberToString(123));
        System.out.println(numberToString(999));
        System.out.println(numberToString(0));
    }
}
