package kyu7;

public class StringScramble {
    public static String scramble(String str, int[] indices) {
        String[] result = new String[indices.length];
        for (int i = 0; i < indices.length; i++) {
            result[indices[i]] = String.valueOf(str.charAt(i));
        }
        return String.join("", result);
    }

    public static void main(String[] args) {
        System.out.println(scramble("abcd", new int[]{0,3,1,2}));
    }
}
