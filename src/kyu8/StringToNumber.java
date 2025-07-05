package kyu8;

public class StringToNumber {
    public static int stringToNumber(String str) {
        return Integer.parseInt(str);
    }

    public static void main(String[] args) {
        System.out.println(stringToNumber("1234"));
        System.out.println(stringToNumber("605"));
        System.out.println(stringToNumber("1405"));
        System.out.println(stringToNumber("-7"));
    }
}
