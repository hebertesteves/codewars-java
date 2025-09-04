package kyu8;

public class AbbreviateATwoWordName {
    public static String abbrevName(String name) {
        String[] result = name.split(" ");
        return result[0].toUpperCase().charAt(0) + "." + result[1].toUpperCase().charAt(0);
    }

    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
    }
}
