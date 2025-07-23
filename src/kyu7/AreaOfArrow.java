package kyu7;

public class AreaOfArrow {
    public static double arrowArea(int a, int b) {
        return (a * (b / 2.0)) / 2.0;
    }

    public static void main(String[] args) {
        System.out.println(arrowArea(4, 2));
        System.out.println(arrowArea(7, 6));
        System.out.println(arrowArea(25, 25));
    }
}
