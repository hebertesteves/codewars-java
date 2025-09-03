package kyu8;

import java.util.Arrays;

public class AddLength {
    public static String[] addLength(String str){
        String[] arr = str.split(" ");
        String[] result = new String[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            result[i] = arr[i] + " " + arr[i].length();
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(addLength("apple ban")));
    }
}
