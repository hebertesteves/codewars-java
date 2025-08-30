package kyu7;

public class IndexedCapitalization {
    public static String capitalize(String s, int[] ind){
        String[] result = s.split("");
        for (int i : ind) {
            if (i <= result.length) result[i] = result[i].toUpperCase();
        }

        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(capitalize("abcdef", new int[]{1,2,5}));
        System.out.println(capitalize("abcdef", new int[]{1,2,5,100}));
    }
}
