package kyu8;

import java.util.*;

public class AllStarCodeChallenge {
    public static int strCount(String str, char letter) {
        return (int) Arrays.stream(str.split("")).filter(l -> l.equalsIgnoreCase(String.valueOf(letter))).count();
    }
}
