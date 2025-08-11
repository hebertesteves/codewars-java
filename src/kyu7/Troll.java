package kyu7;

public class Troll {
    public static String disemvowel(String str) {
        String[] array = str.split("");
        String vogais = "aeiouAEIOU";
        StringBuilder sb = new StringBuilder();

        for (String s : array) {
            if (!vogais.contains(s)) {
                sb.append(s);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(disemvowel("This website is for losers LOL!"));
    }
}
