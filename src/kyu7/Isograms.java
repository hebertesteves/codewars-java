package kyu7;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class Isograms {
    public static boolean  isIsogram(String str) {
        String[] array = str.toLowerCase().split("");
        Set<String> words = Arrays.stream(array).collect(Collectors.toSet());
        for (String word : words) {
            int cont = (int) Arrays.stream(array).filter(l -> l.equals(word)).count();
            if (cont > 1) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isIsogram("isogram"));
        System.out.println(isIsogram("moOse"));
    }
}
