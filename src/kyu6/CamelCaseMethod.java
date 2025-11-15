package kyu6;

public class CamelCaseMethod {
    public static String camelCase(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder();
        String[] words = str.trim().split(" +");
        for (String word : words) {
            sb.append(word.toUpperCase().charAt(0));
            sb.append(word.substring(1).toLowerCase());
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(camelCase("test case"));
        System.out.println(camelCase(" test case"));
        System.out.println(camelCase("z"));
    }
}
