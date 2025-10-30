package kyu6;

public class SpinWords {
    public String spinWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            if (words[i].length() >= 5) sb.append(new StringBuilder(words[i]).reverse().toString());
            else sb.append(words[i]);

            if (i < words.length - 1) sb.append(" ");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new SpinWords().spinWords("Hey wollef sroirraw"));
    }
}
