package kyu8;

import java.util.ArrayList;
import java.util.List;

public class UnfinishedLoopBugFixing {
    public static List<Integer> CreateList(int number) {
        List<Integer> list = new ArrayList<>(number);

        for (int count = 1; count <= number; count++) {
            list.add(count);
        }
        return list;
    }
}
