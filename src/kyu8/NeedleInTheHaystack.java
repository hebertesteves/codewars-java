package kyu8;

import java.util.Arrays;

public class NeedleInTheHaystack {
    public static String findNeedle(Object[] haystack) {
        int index = 0;
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String && haystack[i].equals("needle")) {
                index = i;
            }
        }
        return "found the needle at position " + index;
    }
}
