package kyu8;

import java.util.Map;
import java.util.Set;

public class RockPaperScissorsLizardSpock {
    public static String rpsls(String player1, String player2){
        Map<String, Set<String>> regras = Map.of(
                "rock", Set.of("lizard", "scissors"),
                "paper", Set.of("rock", "spock"),
                "scissors", Set.of("lizard", "paper"),
                "lizard", Set.of("paper", "spock"),
                "spock", Set.of("scissors", "rock")
        );

        if (regras.get(player1).contains(player2)) {
            return "Player 1 Won!";
        }

        if (regras.get(player2).contains(player1)) {
            return "Player 2 Won!";
        }

        return "Draw!";
    }
}
