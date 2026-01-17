package kyu8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class HappyYear {
    static public int nextHappyYear(int year) {
        do {
            year += 1;
        } while (Arrays.stream(String.valueOf(year).split("")).collect(Collectors.toSet()).size() < 4);
        return year;
    }
}
