package kyu6;

import java.util.ArrayList;
import java.util.List;

public class SortTheOdd {
    public static int[] sortArray(int[] array) {
        List<Integer> numerosImpares = new ArrayList<>();
        List<Integer> indicesImpares = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                numerosImpares.add(array[i]);
                indicesImpares.add(i);
            }
        }

        numerosImpares.sort(Integer::compare);

        for (int i = 0; i < indicesImpares.size(); i++) {
            array[indicesImpares.get(i)] = numerosImpares.get(i);
        }

        return array;
    }
}
