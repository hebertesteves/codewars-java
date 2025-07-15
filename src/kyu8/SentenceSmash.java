package kyu8;

public class SentenceSmash {
    public static String smash(String... words) {
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(word).append(" ");
        }
        return result.toString().trim();
    }

    public static void main(String[] args) {
        System.out.println(smash(new String[] { "hello" }));
        System.out.println(smash(new String[] { "hello", "world"}));
        System.out.println(smash(new String[] {"hello", "world", "this", "is", "great"}));
    }
}
