package kyu7;

public class JadenCase {
    public static String toJadenCase(String phrase) {
        if (phrase == null || phrase.isEmpty()) return null;

        String[] words = phrase.split(" ");
        StringBuilder sb = new StringBuilder();

        for (String word : words) {
            sb.append(String.valueOf(word.charAt(0)).toUpperCase());
            sb.append(word.substring(1).toLowerCase());
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
