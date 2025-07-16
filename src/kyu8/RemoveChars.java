package kyu8;

public class RemoveChars {
    public static String remove(String str) {
        return (str.length() > 2) ? str.substring(1, str.length() - 1) : "";
    }

    public static void main(String[] args) {
        System.out.println(remove("eloquent"));
        System.out.println(remove("country"));
        System.out.println(remove("person"));
        System.out.println(remove("place"));
        System.out.println(remove("ok"));
    }
}
