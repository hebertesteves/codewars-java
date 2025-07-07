package kyu8;

public class OddEvenStringSort {
    public static String sortMyString(String s) {
        StringBuilder resultadoPar = new StringBuilder();
        StringBuilder resultadoImpar = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (i % 2 == 0) {
                resultadoPar.append(s.substring(i, i + 1));
            } else {
                resultadoImpar.append(s.substring(i, i + 1));
            }
        }

        return resultadoPar + " " + resultadoImpar;
    }

    public static void main(String[] args) {
        System.out.println(sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
        System.out.println(sortMyString("METHIONYLTHREONYLTHREONYGLUTAMINYLARGINYL"));
        System.out.println(sortMyString("PNEUMONOULTRAMICROSCOPICSILICOVOLCANOCONIOSIS"));
        System.out.println(sortMyString("PSEUDOPSEUDOHYPOPARATHYROIDISM"));
        System.out.println(sortMyString("FLOCCINAUCINIHILIPILIFICATION"));
        System.out.println(sortMyString("SUBDERMATOGLYPHIC"));
    }
}
