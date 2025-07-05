package kyu8;

public class StringRepeat {
    public static String repeatStr(final int repeat, final String string) {
        StringBuilder resultado = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            resultado.append(string);
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        System.out.println(repeatStr(4, "a"));
        System.out.println(repeatStr(3, "Hello"));
        System.out.println(repeatStr(5, ""));
        System.out.println(repeatStr(0, "kata"));
        System.out.println(repeatStr(0, ""));
        System.out.println(repeatStr(6, "I"));
        System.out.println(repeatStr(5, "Hello"));
    }
}
