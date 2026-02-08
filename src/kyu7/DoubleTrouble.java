package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DoubleTrouble {
    public static int[] trouble(int[] x, int t) {
        List<Integer> list = new ArrayList<>(Arrays.stream(x).boxed().toList());

        for (int i = 1; i < list.size(); i++) {
            if (list.get(i - 1) + list.get(i) == t) {
                list.remove(i);
                i = 1;
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
