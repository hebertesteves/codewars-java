package kyu8;

public class FindThePosition {
    public static String position(char alphabet) {
        return "Position of alphabet: " + String.valueOf(Character.toUpperCase(alphabet) - 'A' + 1);
    }

    public static void main(String[] args) {
        System.out.println(position('z'));
    }
}
