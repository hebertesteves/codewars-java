package kyu6;

public class UpAndDown {
    public static String arrange(String strng) {
        String[] array = strng.split(" ");
        for (int i = 0; i < array.length - 1; i++) {
            if (i % 2 == 0) {
                if (array[i].length() > array[i + 1].length()) {
                    String troca = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = troca;
                }
            } else {
                if (array[i].length() < array[i + 1].length()) {
                    String troca = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = troca;
                }
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) array[i] = array[i].toUpperCase();
            else array[i] = array[i].toLowerCase();
        }

        return String.join(" ", array);
    }
}
