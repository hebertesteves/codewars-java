package kyu7;

public class ComplementaryDNA {
    public static String makeComplement(String dna) {
        String[] array = dna.toUpperCase().split("");
        StringBuilder sb = new StringBuilder();
        for (String symbols : array) {
            switch (symbols) {
                case "A" -> sb.append("T");
                case "T" -> sb.append("A");
                case "C" -> sb.append("G");
                case "G" -> sb.append("C");
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
    }
}
