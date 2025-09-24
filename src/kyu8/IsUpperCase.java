package kyu8;

public class IsUpperCase {
    public static boolean isUpperCase(String s) {
        return s.equals(s.toUpperCase());
    }

    public static void main(String[] args) {
        System.out.println(isUpperCase("c"));
    }
}
