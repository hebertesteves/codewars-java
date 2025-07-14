package kyu8;

public class ReduceButGrow {
    public static int grow(int[] x){
        int result = 1;
        for (int n : x) {
            result *= n;
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println(grow(new int[]{1,2,3}));
        System.out.println(grow(new int[]{4,1,1,1,4}));
        System.out.println(grow(new int[]{2,2,2,2,2,2}));
    }
}
