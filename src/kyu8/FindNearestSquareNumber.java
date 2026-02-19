package kyu8;

public class FindNearestSquareNumber {
    public static int nearestSq(final int n){
        return Math.toIntExact(Math.round(Math.sqrt(n)) * Math.round(Math.sqrt(n)));
    }
}
