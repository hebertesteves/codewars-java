package kyu8;

public class CountOddNumbersBelowN {
    public static int oddCount(int n){
        int cont = 0;
        for (int i = 1; i < n; i += 2) {
            cont++;
        }
        return cont;
    }
}
