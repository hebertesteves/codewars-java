package kyu7;

import java.util.List;

public class FindMinAndMax {
    static int[] getMinMax(List<Integer> list) {
        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();
        return new int[]{min, max};
    }
}
