package kyu7;

public class MostDigits {
    public static int findLongest(int[] numbers) {
        int longest = String.valueOf(numbers[0]).length();
        int maior = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (String.valueOf(numbers[i]).length() > longest && numbers[i] > maior) {
                longest = String.valueOf(numbers[i]).length();
                maior = numbers[i];
            }
        }

        return maior;
    }
}
