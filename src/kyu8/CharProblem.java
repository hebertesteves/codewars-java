package kyu8;

public class CharProblem {
    public static int howOld(final String herOld) {
        return Integer.parseInt(String.valueOf(herOld.charAt(0)));
    }

    public static void main(String[] args) {
        System.out.println(howOld("5 years old"));
    }
}
