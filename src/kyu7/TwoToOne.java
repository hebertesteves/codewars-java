package kyu7;

import java.util.Arrays;

public class TwoToOne {
    public static String longest (String s1, String s2) {
        String words = s1 + s2;
        return Arrays.stream(words.split("")).distinct().sorted().reduce("", (a, b) -> a + b);
    }
}
