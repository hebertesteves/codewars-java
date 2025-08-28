package kyu7;

public class GetTheMiddleCharacter {
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) return word.substring((word.length() / 2) - 1, (word.length() / 2) + 1);
        else return word.substring(word.length() / 2, (word.length() / 2) + 1);
    }

    public static void main(String[] args) {
        System.out.println(getMiddle("test"));
        System.out.println(getMiddle("middle"));
        System.out.println(getMiddle("testing"));
        System.out.println(getMiddle("A"));
    }
}
