package kyu7;

import java.util.Arrays;
import java.util.Collections;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        String[] array = String.valueOf(num).split("");
        Arrays.sort(array, Collections.reverseOrder());

        return Integer.parseInt(String.join("", array));
    }

    public static void main(String[] args) {
        System.out.println(sortDesc(0));
        System.out.println(sortDesc(15));
        System.out.println(sortDesc(123456789));
    }
}
