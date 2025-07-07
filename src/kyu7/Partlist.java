package kyu7;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class Partlist {
    public static String[][] partlist(String[] arr) {
        String[][] resultado = new String[arr.length - 1][2];

        for (int i = 0; i < resultado.length; i++) {
            resultado[i][0] = String.join(" ", copyOfRange(arr, 0, i + 1));
            resultado[i][1] = String.join(" ", copyOfRange(arr, i + 1, arr.length));
        }

        return resultado;
    }


    public static void main(String[] args) {
        String[] s1;
        String[][] a;

        s1 = new String[] {"cdIw", "tzIy", "xDu", "rThG"};
        a = new String[][] {{"cdIw", "tzIy xDu rThG"}, {"cdIw tzIy", "xDu rThG"}, {"cdIw tzIy xDu", "rThG"}};
        testing(Partlist.partlist(s1), a);

        s1 = new String[] {"I", "wish", "I", "hadn't", "come"};
        a = new String[][] {{"I", "wish I hadn't come"}, {"I wish", "I hadn't come"}, {"I wish I", "hadn't come"}, {"I wish I hadn't", "come"}};
        testing(Partlist.partlist(s1), a);

        s1 = new String[] {"vJQ", "anj", "mQDq", "sOZ"};
        a = new String[][] {{"vJQ", "anj mQDq sOZ"}, {"vJQ anj", "mQDq sOZ"}, {"vJQ anj mQDq", "sOZ"}};
        testing(Partlist.partlist(s1), a);
    }

    public static void testing(String[][] actual, String[][] expected) {
        boolean passed = Arrays.deepEquals(actual, expected);
        if (passed) {
            System.out.println("Teste passou:");
        } else {
            System.out.println("Teste falhou:");
        }
        System.out.println("Esperado: " + Arrays.deepToString(expected));
        System.out.println("Atual:    " + Arrays.deepToString(actual));
        System.out.println();
    }
}
