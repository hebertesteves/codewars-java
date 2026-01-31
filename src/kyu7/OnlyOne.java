package kyu7;

import java.util.Arrays;

public class OnlyOne {
    public static boolean onlyOne(Boolean... args) {
        return Arrays.stream(args).filter(b -> b == true).toList().size() == 1;
    }
}
