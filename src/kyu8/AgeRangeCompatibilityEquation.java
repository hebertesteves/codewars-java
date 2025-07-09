package kyu8;

public class AgeRangeCompatibilityEquation {
    public static String datingRange(int age) {
        int min = 0;
        int max = 0;

        if (age <= 14) {
            min = (int) (age - 0.10 * age);
            max = (int) (age + 0.10 * age);
        } else {
            min = (age / 2) + 7;
            max = 2 * (age - 7);
        }

        return min + "-" + max;
    }

    public static void main(String[] args) {
        System.out.println(datingRange(17));
        System.out.println(datingRange(40));
        System.out.println(datingRange(15));
        System.out.println(datingRange(35));
        System.out.println(datingRange(10));
    }
}
