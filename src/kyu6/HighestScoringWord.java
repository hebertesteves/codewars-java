package kyu6;

public class HighestScoringWord {
    public static String high(String s) {
        String[] words = s.toLowerCase().split("\\s+");

        int bestScore = 0;
        String bestWord = "";

        for (String word : words) {
            int score = 0;
            for (int j = 0; j < word.length(); j++) {
                score += word.charAt(j) - 'a' + 1;
            }

            if (score > bestScore) {
                bestScore = score;
                bestWord = word;
            }

        }

        return bestWord;
    }
}
