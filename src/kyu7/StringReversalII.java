package kyu7;

public class StringReversalII {
    public static String solve(String s, int a, int b){
        int n = s.length();
        if (n == 0) return s;

        int start = Math.max(0, Math.min(a, n));
        int endEx = Math.max(0, Math.min(b + 1, n));

        if (start >= endEx) return s;

        StringBuilder sb = new StringBuilder(n);
        sb.append(s, 0, start);
        sb.append(new StringBuilder(s.substring(start, endEx)).reverse());
        sb.append(s, endEx, n);
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(solve("codewars",1,5));
        System.out.println(solve("abcefghijklmnopqrstuvwxyz",5,20));
    }
}
