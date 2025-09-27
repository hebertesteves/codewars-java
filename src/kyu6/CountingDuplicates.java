package kyu6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountingDuplicates {
    public static int duplicateCount(String text) {
        String[] words = text.toLowerCase().split("");
        Set<String> set = new HashSet<>(Arrays.asList(words));

        int cont = 0;
        int duplicate = 0;

        for (String n : set) {
            for (String word : words) {
                if (n.equals(word)) {
                    cont++;
                }
                if (cont > 1) {
                    System.out.println(word);
                    duplicate++;
                    break;
                }
            }
            cont = 0;
        }

        return duplicate;
    }

    public static void main(String[] args) {
        //System.out.println(duplicateCount("aabbcc"));
        //System.out.println(duplicateCount("Indivisibilities"));
        System.out.println(duplicateCount("DddcDcdddCCDDc"));
    }
}
