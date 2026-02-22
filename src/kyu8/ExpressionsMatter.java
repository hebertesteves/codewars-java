package kyu8;

import java.util.ArrayList;
import java.util.List;

public class ExpressionsMatter {
    public static int expressionsMatter(int a, int b, int c) {
        List<Integer> list = new ArrayList<>();
        list.add(a * (b + c));
        list.add(a * b * c);
        list.add(a + b * c);
        list.add((a+b) * c);
        list.add(a + b + c);

        return list.stream().max(Integer::compareTo).get();
    }
}
