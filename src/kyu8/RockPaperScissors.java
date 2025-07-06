package kyu8;

public class RockPaperScissors {
    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";

        if (
            p1.equals("rock") && p2.equals("scissors") ||
            p1.equals("scissors") && p2.equals("paper") ||
            p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else  {
            return "Player 2 won!";
        }
    }

    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("scissors", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "rock"));
    }
}
