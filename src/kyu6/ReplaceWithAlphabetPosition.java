package kyu6;

public class ReplaceWithAlphabetPosition {
    static String alphabetPosition(String text) {
        String textClean = text.toLowerCase().replaceAll("[^a-zA-Z]", "");

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < textClean.length(); i++) {
            sb.append(textClean.charAt(i) - 'a' + 1);
            sb.append(" ");
        }

        return sb.toString().trim();
    }
}
