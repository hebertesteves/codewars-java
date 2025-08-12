package kyu7;

public class ExesAndOhs {
    public static boolean getXO (String str) {
        String o = "o";
        String x = "x";

        int contO = 0;
        int contX = 0;

        String[] array = str.split("");
        for (String s : array) {
            if  (s.toLowerCase().contains(x)) {
                contX++;
            }

            if  (s.toLowerCase().contains(o)) {
                contO++;
            }
        }

        return contO == contX;
    }

    public static void main(String[] args) {
        System.out.println(getXO("ooxx"));
        System.out.println(getXO("xooxx"));
    }
}
