package kyu7;

public class ReverseWords {
    public static String reverseWords(final String original) {
        String[] partes = original.split("(?<= )|(?= )");
        StringBuilder sb = new StringBuilder();

        for (String parte : partes) {
            char[] caracteres = parte.toCharArray();
            for (int i = caracteres.length - 1; i >= 0; i--) {
                sb.append(caracteres[i]);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(reverseWords("double  spaces"));
    }
}
