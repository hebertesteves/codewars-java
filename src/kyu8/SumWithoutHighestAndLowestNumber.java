package kyu8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SumWithoutHighestAndLowestNumber {
    public static int sum(int[] numbers) {
        if (numbers == null) return 0;

        List<Integer> list = Arrays.stream(numbers).boxed().collect(Collectors.toList());
        Collections.sort(list);

        int sum = 0;
        for (int i = 1; i < list.size() - 1; i++) {
            sum += list.get(i);
        }
        return sum;
    }
}
