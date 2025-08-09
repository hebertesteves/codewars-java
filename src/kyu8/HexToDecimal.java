package kyu8;

public class HexToDecimal {
    public static int hexToDec(final String hexString) {
        return Integer.parseInt(hexString, 16);
    }

    public static void main(String[] args) {
        System.out.println(hexToDec("1"));
        System.out.println(hexToDec("a"));
        System.out.println(hexToDec("10"));
        System.out.println(hexToDec("FF"));
        System.out.println(hexToDec("-C"));
    }
}
