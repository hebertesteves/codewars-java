package kyu6;

import java.util.ArrayList;
import java.util.List;

public class BreakCamelCase {
    public static String camelCase(String input) {
        List<String> result = new ArrayList<>();
        int index = 0;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (Character.isUpperCase(c) && i != 0) {
                result.add(input.substring(index, i));
                index = i;
            }
        }

        result.add(input.substring(index));

        return String.join(" ", result);
    }
}
