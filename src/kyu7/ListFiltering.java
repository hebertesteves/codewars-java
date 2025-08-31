package kyu7;

import java.util.List;

public class ListFiltering {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(n -> n instanceof Integer).toList();
    }

}
