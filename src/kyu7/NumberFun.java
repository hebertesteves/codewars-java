package kyu7;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double sqrt = Math.sqrt(sq);
        return sqrt % 1 == 0 ? (long) Math.pow(sqrt + 1, 2) : -1;
    }
}
