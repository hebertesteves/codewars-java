package kyu8;

import java.util.ArrayList;
import java.util.List;

public class Multiples {
    public static int[] find(int base, int limit) {
        List<Integer> list = new ArrayList<>();
        for (int i = base; i <= limit; i++) {
            if (i % base == 0) list.add(i);
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
