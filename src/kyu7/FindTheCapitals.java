package kyu7;

import java.util.ArrayList;
import java.util.List;

public class FindTheCapitals {
    public static int[] capitals(String s){
        String[] words = s.split("");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            if (words[i].equals(words[i].toUpperCase())) list.add(i);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
