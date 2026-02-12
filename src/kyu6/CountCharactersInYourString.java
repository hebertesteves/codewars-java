package kyu6;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountCharactersInYourString {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> map = new HashMap<>();

        if (str.isEmpty()) return map;

        List<String> palavras = Arrays.stream(str.split("")).toList();
        List<String> palavrasUnicas = Arrays.stream(str.split("")).distinct().toList();

        for (String palavraUnica : palavrasUnicas) {
            int cont = 0;
            for (String palavra : palavras) {
                if (palavraUnica.equals(palavra)) cont++;
            }

            map.put((palavraUnica.charAt(0)), cont);
        }

        return map;
    }
}
