package kyu7;

import java.util.ArrayList;
import java.util.List;

public class FriendOrFoe {
    public static List<String> friend(List<String> x){
        List<String> list = new ArrayList<>();
        for (String name: x) {
            if (name.length() == 4) list.add(name);
        }

        return list;
    }
}
