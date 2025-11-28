package kyu7;

public class FindMissingNumber {
    public static int missingNo(int[] nums) {
        int N = 100;

        int somaEsperada = N * (N + 1) / 2;

        int somaReal = 0;
        for (int num : nums) {
            somaReal += num;
        }

        return somaEsperada - somaReal;
    }
}
