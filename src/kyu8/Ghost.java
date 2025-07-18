package kyu8;

import java.util.Random;

public class Ghost {
    private String color;

    public Ghost() {
        String[] colors = new String[]{"white", "yellow", "purple", "red"};
        Random random = new Random();
        int aleatorio = random.nextInt(colors.length);
        this.setColor(colors[aleatorio]);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
