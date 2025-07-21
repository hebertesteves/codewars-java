package kyu8;

public class MultiplicationTable {
    public static String multiTable(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            if (i == 10) {
                result.append(i + " * " + num + " = " + (i * num));
            } else {
                result.append(i + " * " + num + " = " + (i * num) + "\n");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiTable(5));
        System.out.println(multiTable(1));
    }
}
