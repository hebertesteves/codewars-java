package kyu8;

public class DuckDuckGoose {
    public static String duckDuckGoose(Player[] players, int goose) {
        int index = (goose - 1) % players.length;
        return players[index].name;
    }
}

class Player {
    public String name;
}
