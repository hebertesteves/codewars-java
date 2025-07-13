package kyu8;

public class CountingSheep {
    public static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < num; i++) {
            result.append(i + 1).append(" sheep...");
        }
        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(countingSheep(0));
        System.out.println(countingSheep(1));
        System.out.println(countingSheep(2));
        System.out.println(countingSheep(3));
    }
}
