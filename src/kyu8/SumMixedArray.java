package kyu8;

import java.util.List;

public class SumMixedArray {
    public int sum(List<?> mixed) {
        int sum = 0;
        for (Object obj : mixed) {
            sum += Integer.parseInt(obj.toString());
        }
        return sum;
    }
}
