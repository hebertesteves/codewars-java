package kyu7;

import java.util.Arrays;

public class AlternateCapitalization {
    public static String[] capitalize(String s){
        String[] words = s.toLowerCase().split("");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 0) sb.append(words[i].toUpperCase());
            else sb.append(words[i]);
        }

        StringBuilder sb1 = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            if (i % 2 != 0) sb1.append(words[i].toUpperCase());
            else sb1.append(words[i]);
        }

        return new String[]{sb.toString(), sb1.toString()};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capitalize("abcdef")));
    }
}
