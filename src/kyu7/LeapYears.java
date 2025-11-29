package kyu7;

public class LeapYears {
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) return year % 400 == 0;
            else return true;
        } else {
            return false;
        }
    }
}
