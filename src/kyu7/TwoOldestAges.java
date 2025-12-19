package kyu7;

import java.util.*;

public class TwoOldestAges {
    public static int[] twoOldestAges(int[] ages) {
        List<Integer> list = new ArrayList<>(Arrays.stream(ages).boxed().toList());
        Collections.sort(list);
        return new int[]{list.get(list.size() - 2), list.get(list.size() - 1)};
    }
}
