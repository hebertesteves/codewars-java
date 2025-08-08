package kyu7;

public class HammingWeight {
    public static int hammingWeight(int i){
        String binaryString = Integer.toBinaryString(i);
        String[] result =  binaryString.split("");

        int sum = 0;
        for (String s: result){
            sum += Integer.parseInt(s);
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(hammingWeight(10));
        System.out.println(hammingWeight(21));
    }
}
