package kyu7;

public class ShortestWord {
    public static int findShort(String s) {
        String[] palavras = s.split(" ");
        int menor = palavras[0].length();

        for (String palavra : palavras) {
            if (palavra.length() < menor) menor = palavra.length();
        }

        return menor;
    }

    public static void main(String[] args) {
        System.out.println(findShort("bitcoin take over the world maybe who knows perhaps"));
        System.out.println(findShort("turns out random test cases are easier than writing out basic ones"));
        System.out.println(findShort("Let's travel abroad shall we"));

    }
}
