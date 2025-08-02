package kyu8;

public class ReverseWords {
    public static String reverseWords(String str){
        String[] original = str.split(" ");
        String[] reverse = new String[original.length];

        int cont = 0;
        for (int i = original.length - 1; i >= 0; i--) {
            reverse[cont] = original[i];
            cont++;
        }

        return String.join(" ", reverse);
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("hello world!"));
    }
}
