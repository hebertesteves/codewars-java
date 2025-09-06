package kyu7;

import java.util.Arrays;

public class NameArrayCapping {
    public static String[] capMe(String[] strings) {
        String[] result = new String[strings.length];

        for (int i = 0; i < strings.length; i++) {
            StringBuilder sb = new StringBuilder();
            if (strings[i].isEmpty()) {
                sb.append("");
            } else {
                sb.append(strings[i].substring(0, 1).toUpperCase());
                sb.append(strings[i].substring(1).toLowerCase());
            }

            result[i] = sb.toString();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(capMe(new String[]{"jo", "nelson", "jurie"})));
        System.out.println(Arrays.toString(capMe(new String[]{"", "", ""})));

    }
}
