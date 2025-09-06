package kyu6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            boolean contains = false;
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    contains = true;
                    break;
                }
            }

            if (!contains) list.add(a[i]);
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2}, new int[] {1})));
        System.out.println(Arrays.toString(arrayDiff(new int [] {1,2,2,2,3}, new int[] {2, 3})));

    }
}
