package kyu7;

import java.util.Arrays;
import java.util.List;

public class MinMax {
    public static int[] getMinMax(List<Integer> list) {
        int min = list.stream().min(Integer::compareTo).orElseThrow();
        int max = list.stream().max(Integer::compareTo).orElseThrow();
        return new int[] {min, max};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(getMinMax(Arrays.asList(1, 2, 3, 4, 5))));
    }
}
