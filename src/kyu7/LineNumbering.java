package kyu7;

import java.util.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
        List<String> result = new ArrayList<>();
        for (int i = 1; i <= lines.size(); i++) {
            result.add(i + ": " + lines.get(i - 1));
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(number(Arrays.asList("a", "b", "c")));
    }
}
