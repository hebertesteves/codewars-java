package kyu8;

import java.util.regex.Pattern;

public class IsDigit {
    public static boolean isDigit(String s) {
        Pattern pattern = Pattern.compile("[0-9]");
        return pattern.matcher(s).matches();
    }

    public static void main(String[] args) {
        System.out.println(isDigit("10"));
    }
}
