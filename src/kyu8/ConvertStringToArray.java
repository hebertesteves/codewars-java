package kyu8;

import java.util.Arrays;

public class ConvertStringToArray {
    public static String[] stringToArray(String s) {
        return s.split(" ");
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stringToArray("Robin Singh")));
        System.out.println(Arrays.toString(stringToArray("I love arrays they are my favorite")));
    }
}
