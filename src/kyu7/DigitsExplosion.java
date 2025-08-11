package kyu7;

public class DigitsExplosion {
    public static String explode(String digits) {
        String[] array = digits.split("");
        StringBuilder sb = new StringBuilder();

        for (String n : array) {
            for (int j = 0; j < Integer.parseInt(n); j++) {
                sb.append(n);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(explode("312"));
    }
}
