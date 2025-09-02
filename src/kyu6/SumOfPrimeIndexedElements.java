package kyu6;

public class SumOfPrimeIndexedElements {
    public static int solve(int [] arr){
        int sumPrime = 0;

        for (int i = 2; i < arr.length; i++) {
            if (isPrime(i)) {
                sumPrime += arr[i];
            }
        }

        return sumPrime;
    }

    public static boolean isPrime(int n){
        for (int i=2; i <= Math.sqrt(n); i++){
            if (n%i==0){
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int [] {1,2,3,4}));
        System.out.println(solve(new int [] {1,2,3,4,5,6}));
        System.out.println(solve(new int [] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15}));
    }
}
