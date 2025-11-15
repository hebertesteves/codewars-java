package kyu8;

public class ArrayPrinter {
    public static String printArray(Object[] array) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            result.append(array[i]);
            if (i == array.length - 1) break;
            else result.append(",");
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(printArray(new Integer[] { 2, 4, 5, 2 }));
    }
}
