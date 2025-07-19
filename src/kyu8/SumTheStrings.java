package kyu8;

public class SumTheStrings {
    public static String sumStr(String a, String b){
        int n1 = (a.equals("") ? 0 : Integer.parseInt(a));
        int n2 = (b.equals("") ? 0 : Integer.parseInt(b));
        return String.valueOf(n1 + n2);
    }

    public static void main(String[] args) {
        System.out.println(sumStr("4", "5"));
        System.out.println(sumStr("34", "5"));
        System.out.println(sumStr("", "8"));
        System.out.println(sumStr("9", ""));
        System.out.println(sumStr("", ""));
    }
}
