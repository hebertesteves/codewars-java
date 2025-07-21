package kyu8;

public class DoubleChar {
    public static String doubleChar(String s){
        String[] array = s.split("");
        StringBuilder result = new StringBuilder();
        for (String n : array) {
            result.append(n + n);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        System.out.println(doubleChar("String"));
        System.out.println(doubleChar("Hello World"));
        System.out.println(doubleChar("1234!_ "));
    }
}
