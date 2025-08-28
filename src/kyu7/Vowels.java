package kyu7;

public class Vowels {
    public static int getCount(String str) {
        String[] vogais = new String[]{"a", "e", "i", "o", "u"};
        String[] letras = str.replaceAll("\\s", "").split("");

        int count = 0;
        for (int i = 0; i < letras.length; i++) {
            for (int j = 0; j < vogais.length; j++) {
                if (letras[i].equals(vogais[j])) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(getCount("abracadabra"));
    }
}
