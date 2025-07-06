package kyu8;

import java.util.Arrays;

public class AnimalAgeCalculator {
    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catYears = 0;
        int dogYears = 0;

        if (humanYears == 1) {
            catYears = 15;
            dogYears = 15;
        } else if (humanYears == 2) {
            catYears = 24;
            dogYears = 24;
        } else if (humanYears > 2) {
            catYears = 24 + (4 * (humanYears - 2));
            dogYears = 24 + (5 * (humanYears - 2));
        }

        return new int[]{humanYears,catYears,dogYears};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(1)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(2)));
        System.out.println(Arrays.toString(humanYearsCatYearsDogYears(10)));
    }
}
