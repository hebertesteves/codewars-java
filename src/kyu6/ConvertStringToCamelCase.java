package kyu6;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){
        String[] array = s.split("[^a-zA-Z0-9]");
        StringBuilder sb = new StringBuilder(array[0]);

        for (int i = 1; i < array.length; i++) {
            sb.append(array[i].substring(0, 1).toUpperCase());
            sb.append((array[i].substring(1)));
        }

        return sb.toString();
    }
}
