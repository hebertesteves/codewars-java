package kyu8;

public class AlternativeString {
    public static String toAlternativeString(String string) {
        String[] array = string.split("");
        StringBuilder sb = new StringBuilder();

        for (String s : array) {
            if (s.equals(s.toLowerCase())) {
                sb.append(s.toUpperCase());
            } else if (s.equals(s.toUpperCase())) {
                sb.append(s.toLowerCase());
            } else {
                sb.append(s);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(AlternativeString.toAlternativeString("hello world"));
    }
}
