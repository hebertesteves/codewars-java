package kyu8;

public class BeConciseIndexOf {
    public static String kata(String[] a, String s) {
        for (int i = 0; i < a.length; i++) if (a[i].equals(s)) return i + "";
        return "Not found";
    }

    public static void main(String[] args) {
        String[] array = {"2","3","5","7","11"};
        System.out.println(kata(array, "5"));
        System.out.println(kata(array, "11"));
    }
}
