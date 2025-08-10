package kyu7;

public class Vaporcode {
    public static String vaporcode(String s) {
        return String.join("  ", s.replaceAll("\\s+", "").toUpperCase().split(""));
    }

    public static void main(String[] args) {
        System.out.println(vaporcode("Lets go to the movies"));
        System.out.println(vaporcode("Why isnt my code working"));
    }
}
