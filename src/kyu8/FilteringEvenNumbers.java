package kyu8;

import java.util.ArrayList;
import java.util.List;

public class FilteringEvenNumbers {
    public static List<Integer> filterOddNumber(List<Integer> listOfNumbers)
    {
        List<Integer> list = new ArrayList<>();
        for (Integer listOfNumber : listOfNumbers) {
            if (listOfNumber % 2 != 0) {
                list.add(listOfNumber);
            }
        }
        return list;
    }
}
