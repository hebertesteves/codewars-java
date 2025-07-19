package kyu7;

import java.util.Arrays;

public class CompoundArray {
    public static int[] compoundArray(int[] a, int[] b){
        int[] result = new int[a.length + b.length];
        int maior;
        if (a.length > b.length) {
            maior = a.length;
        } else {
            maior = b.length;
        }

        int cont = 0;
        for (int i = 0; i < maior; i++) {
            if (i < a.length) {
                result[cont] = a[i];
                cont++;
            }

            if (i < b.length) {
                result[cont] = b[i];
                cont++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(compoundArray(new int[] {1,2,3,4,5,6}, new int[] {9,8,7,6})));
        System.out.println(Arrays.toString(compoundArray(new int[] {0,1,2}, new int[] {9,8,7,6,5,4,3,2,1,0})));
    }
}
