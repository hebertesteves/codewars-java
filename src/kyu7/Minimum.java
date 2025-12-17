package kyu7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Minimum {
    public static int minValue(int[] values){
        List<Integer> list = new ArrayList<>(Arrays.stream(values).boxed().collect(Collectors.toList()));
        List<Integer> valuesUnique = list.stream().distinct().collect(Collectors.toList());
        Collections.sort(valuesUnique);
        StringBuilder sb = new StringBuilder();
        for (Integer value : valuesUnique) {
            sb.append(value);
        }

        return Integer.parseInt(sb.toString());
    }
}
